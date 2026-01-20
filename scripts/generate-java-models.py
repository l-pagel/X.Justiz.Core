#!/usr/bin/env python3
"""
Generate Java models from .NET models and JSON Schema.
This script replaces the old PowerShell script and provides better documentation preservation and interoperability.
"""

import os
import re
import sys
import subprocess
from pathlib import Path
from dataclasses import dataclass, field
from typing import Optional, List, Tuple, Dict

# Configuration
DOTNET_PROJECT_PATH = "dotnet/src/xjustiz.core-dotnet"
DOTNET_ENTITIES_PATH = f"{DOTNET_PROJECT_PATH}/Models/Entities"
DOTNET_CODES_PATH = f"{DOTNET_PROJECT_PATH}/Models/Codes"
OTHER_SOURCE_PATHS = [
    f"{DOTNET_PROJECT_PATH}/Models",
]
JAVA_MODELS_PATH = "java/src/main/java/de/xjustiz/core/models"
XSD_GENERATOR_PROJECT = "dotnet/src/xjustiz.core-dotnet.XsdGenerator"

# Type mappings from C# to Java
TYPE_MAPPINGS = {
    "string": "String",
    "String": "String",
    "int": "Integer",
    "Int32": "Integer",
    "long": "Long",
    "Int64": "Long",
    "bool": "Boolean",
    "Boolean": "Boolean",
    "DateTime": "OffsetDateTime",
    "DateTimeOffset": "OffsetDateTime",
    "decimal": "BigDecimal",
    "Decimal": "BigDecimal",
    "double": "Double",
    "float": "Float",
    "object": "Object",
    "Object": "Object",
}

@dataclass
class PropertyInfo:
    name: str # The C# property name
    type_name: str
    is_nullable: bool
    is_list: bool
    xml_element_name: Optional[str] = None
    xml_namespace: Optional[str] = None
    json_property_name: Optional[str] = None
    description: Optional[str] = None
    is_attribute: bool = False
    json_aliases: List[str] = field(default_factory=list)
    is_json_ignore: bool = False
    is_xml_ignore: bool = False

@dataclass
class ClassInfo:
    name: str
    namespace: str
    properties: List[PropertyInfo] = field(default_factory=list)
    is_root: bool = False
    xml_root_name: Optional[str] = None
    description: Optional[str] = None

@dataclass
class EnumValueInfo:
    name: str
    xml_value: str
    description: Optional[str] = None

@dataclass
class EnumInfo:
    name: str
    values: List[EnumValueInfo] = field(default_factory=list)
    description: Optional[str] = None

def convert_csharp_doc_to_javadoc(doc: str) -> str:
    """Convert C# XML documentation to Javadoc format."""
    if not doc:
        return ""
    result = doc.strip()
    
    def convert_see_cref(match):
        cref = match.group(1)
        if "." in cref:
            parts = cref.split(".")
            class_name = parts[0]
            member = parts[1]
            member_java = member[0].lower() + member[1:] if member else ""
            return f"{{@link {class_name}#{member_java}}}"
        return f"{{@link {cref}}}"
    
    result = re.sub(r'<see\s+cref="([^"]+)"\s*/>', convert_see_cref, result)
    result = re.sub(r'<see\s+cref="([^"]+)"\s*>\s*</see>', convert_see_cref, result)
    result = re.sub(r'<see\s+cref="([^"]+)"\s*>[^<]*</see>', convert_see_cref, result)
    
    def convert_see_href(match):
        url = match.group(1)
        text = match.group(2) if match.group(2) else url
        return f'<a href="{url}">{text}</a>'
    
    result = re.sub(r'<see\s+href="([^"]+)"(?:\s*/>|>([^<]*)</see>)', convert_see_href, result)
    result = re.sub(r'<c>([^<]+)</c>', r'{@code \1}', result)
    result = re.sub(r'<paramref\s+name="([^"]+)"(?:\s*/)?>', r'{@code \1}', result)
    result = result.replace("<br/>", "\n * <p>\n * ").replace("<br />", "\n * <p>\n * ")
    result = re.sub(r'</see>', '', result)
    result = re.sub(r'<see[^>]*>', '', result)
    return result

def extract_all_summaries(content: str) -> Dict[int, str]:
    """Extract all XML summary comments and their positions."""
    summaries = {}
    pattern = r'///\s*<summary>\s*\n((?:\s*///[^\n]*\n)*?)\s*///\s*</summary>'
    for match in re.finditer(pattern, content):
        summary_content = match.group(1)
        lines = []
        for line in summary_content.split('\n'):
            line = line.strip()
            if line.startswith('///'):
                line = line[3:].strip()
            if line:
                lines.append(line)
        summaries[match.end()] = ' '.join(lines)
    return summaries

def find_closest_summary(summaries: Dict[int, str], target_pos: int, max_distance: int = 500) -> Optional[str]:
    """Find the summary that is closest to (and before) target_pos."""
    closest_distance = float('inf')
    closest_summary = None
    for end_pos, summary in summaries.items():
        distance = target_pos - end_pos
        if 0 < distance < closest_distance and distance < max_distance:
            closest_distance = distance
            closest_summary = summary
    return closest_summary

def parse_csharp_file(file_path: Path) -> Optional[ClassInfo]:
    """Parse a C# file and extract class information with documentation."""
    try:
        content = file_path.read_text(encoding="utf-8")
    except Exception:
        return None

    if "class" not in content:
        return None
    
    class_match = re.search(r"public\s+(?:partial\s+)?class\s+(\w+)", content)
    if not class_match:
        return None
    
    class_name = class_match.group(1)
    if class_name.endswith("Core") and class_name not in ["HashInfoCore"]: 
        return None
    if class_name in ["SchemeConstants", "XJustizAvailabilityAttribute", "XJustizVersion", "XJustizCoreVersion"]:
        return None
    
    summaries = extract_all_summaries(content)
    class_description = find_closest_summary(summaries, class_match.start())
    if class_description:
        class_description = convert_csharp_doc_to_javadoc(class_description)
    
    class_info = ClassInfo(
        name=class_name,
        namespace="http://www.xjustiz.de",
        description=class_description
    )
    
    root_match = re.search(r'\[XmlRoot\s*\(\s*"([^"]+)"', content)
    if root_match:
        class_info.is_root = True
        class_info.xml_root_name = root_match.group(1)
    
    prop_pattern = re.compile(
        r'((?:\[[^\]]+\]\s*)*)' # Attributes
        r'public\s+(?!class|partial|interface|enum)(?:required\s+)?(\w+(?:<\w+>)?(?:\[\])?)\??\s+(\w+)\s*\{',
        re.MULTILINE
    )
    
    for match in prop_pattern.finditer(content):
        attributes_str = match.group(1)
        type_name = match.group(2)
        prop_name = match.group(3)
        
        prop_description = find_closest_summary(summaries, match.start(), max_distance=400)
        if prop_description:
            prop_description = convert_csharp_doc_to_javadoc(prop_description)
        
        is_nullable = "?" in content[match.start():match.end()]
        is_list = False
        if type_name.startswith("List<"):
            is_list = True
            inner = re.match(r"List<(\w+)>", type_name)
            if inner: type_name = inner.group(1)
        elif type_name.endswith("[]"):
            is_list = True
            type_name = type_name[:-2]
        
        java_type = TYPE_MAPPINGS.get(type_name, type_name)
        
        xml_name = prop_name[0].lower() + prop_name[1:]
        xml_namespace = None
        is_attribute = False
        json_property = prop_name
        json_aliases = []
        is_json_ignore = "[JsonIgnore]" in attributes_str
        is_xml_ignore = "[XmlIgnore]" in attributes_str

        xml_match = re.search(r'\[Xml(Element|Attribute)\s*\(\s*"([^"]+)"(?:,\s*Namespace\s*=\s*(?:SchemeConstants\.)?(\w+))?[^\]]*\)\]', attributes_str)
        if xml_match:
            is_attribute = (xml_match.group(1) == "Attribute")
            xml_name = xml_match.group(2)
            namespace_var = xml_match.group(3)
            if namespace_var == "XJustizCore_Tns":
                xml_namespace = "http://www.xjustizcore.de"
            elif namespace_var == "XJustiz_Tns":
                xml_namespace = "http://www.xjustiz.de"
        
        json_match = re.search(r'\[JsonPropertyName\s*\(\s*"([^"]+)"\s*\)\]', attributes_str)
        if json_match:
            json_property = json_match.group(1)
            if json_property != prop_name:
                json_aliases.append(prop_name)
                json_aliases.append(prop_name[0].lower() + prop_name[1:])

        class_info.properties.append(PropertyInfo(
            name=prop_name,
            type_name=java_type,
            is_nullable=is_nullable or is_list,
            is_list=is_list,
            xml_element_name=xml_name,
            xml_namespace=xml_namespace,
            json_property_name=json_property,
            description=prop_description,
            is_attribute=is_attribute,
            json_aliases=json_aliases,
            is_json_ignore=is_json_ignore,
            is_xml_ignore=is_xml_ignore
        ))
    
    return class_info if class_info.properties else None

def parse_csharp_enum(file_path: Path) -> Optional[EnumInfo]:
    """Parse a C# enum file."""
    try:
        content = file_path.read_text(encoding="utf-8")
    except Exception:
        return None

    enum_match = re.search(r"public\s+enum\s+(\w+)", content)
    if not enum_match:
        return None
    
    enum_name = enum_match.group(1)
    summaries = extract_all_summaries(content)
    enum_description = find_closest_summary(summaries, enum_match.start())
    if enum_description:
        enum_description = convert_csharp_doc_to_javadoc(enum_description)
    
    enum_info = EnumInfo(name=enum_name, description=enum_description)
    
    enum_body_match = re.search(r"\{([\s\S]*)\}", content[enum_match.end():])
    if not enum_body_match:
        return None
    
    enum_body = enum_body_match.group(1)
    body_offset = content.find(enum_body)

    # Match enum members like: [XmlEnum("1")] Maennlich,
    # We strip out the summary lines for member matching to avoid false positives
    lines = enum_body.split('\n')
    clean_body_lines = []
    for line in lines:
        if line.strip().startswith('///'):
            clean_body_lines.append("") # Keep line count for offsets
        else:
            clean_body_lines.append(line)
    
    clean_body = '\n'.join(clean_body_lines)
    
    member_pattern = re.compile(
        r'((?:\[[^\]]+\]\s*)*)' # Attributes
        r'^\s*(\w+)\s*[,=]?\s*',
        re.MULTILINE
    )
    
    for match in member_pattern.finditer(clean_body):
        attr_str = match.group(1)
        name = match.group(2)
        
        # Skip keywords
        if name in ["public", "enum", "class", "interface", "struct"]: continue

        xml_value = name # Default
        xml_match = re.search(r'\[XmlEnum\s*\(\s*"([^"]+)"\s*\)\]', attr_str)
        if xml_match:
            xml_value = xml_match.group(1)
        
        member_description = find_closest_summary(summaries, body_offset + match.start())
        if member_description:
            member_description = convert_csharp_doc_to_javadoc(member_description)
        
        # Java identifiers cannot start with digits
        java_name = name
        if java_name[0].isdigit():
            java_name = "_" + java_name

        enum_info.values.append(EnumValueInfo(
            name=java_name,
            xml_value=xml_value,
            description=member_description
        ))
        
    return enum_info if enum_info.values else None

def generate_java_enum(enum_info: EnumInfo, package: str) -> str:
    """Generate Java enum code."""
    lines = [f"package {package};", ""]
    lines.append("import com.fasterxml.jackson.annotation.JsonProperty;")
    lines.append("import com.fasterxml.jackson.annotation.JsonValue;")
    lines.append("import jakarta.xml.bind.annotation.XmlEnum;")
    lines.append("import jakarta.xml.bind.annotation.XmlEnumValue;")
    lines.append("import jakarta.xml.bind.annotation.XmlType;")
    lines.append("")
    
    if enum_info.description:
        lines.append("/**")
        for line in enum_info.description.split("\n"): lines.append(f" * {line}")
        lines.append(" */")
    
    lines.append('@XmlType')
    lines.append('@XmlEnum')
    lines.append(f"public enum {enum_info.name} {{")
    lines.append("")
    
    for i, val in enumerate(enum_info.values):
        if val.description:
            lines.append("    /**")
            for line in val.description.split("\n"): lines.append(f"     * {line}")
            lines.append("     */")
        
        suffix = "," if i < len(enum_info.values) - 1 else ";"
        lines.append(f'    @JsonProperty("{val.xml_value}")')
        lines.append(f'    @XmlEnumValue("{val.xml_value}")')
        lines.append(f'    {val.name}("{val.xml_value}"){suffix}')
        lines.append("")
    
    lines.append("    private final String value;")
    lines.append(f"    {enum_info.name}(String value) {{ this.value = value; }}")
    lines.append("    @JsonValue")
    lines.append("    public String getValue() { return value; }")
    lines.append("")
    lines.append("    @Override")
    lines.append("    public String toString() { return value; }")
    lines.append("}")
    
    return "\n".join(lines)

def generate_java_class(class_info: ClassInfo, package: str) -> str:
    """Generate Java class code."""
    lines = [f"package {package};", ""]
    
    imports = {
        "com.fasterxml.jackson.annotation.JsonIgnoreProperties",
        "com.fasterxml.jackson.annotation.JsonInclude",
        "com.fasterxml.jackson.annotation.JsonProperty",
        "com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty",
        "jakarta.xml.bind.annotation.XmlAccessType",
        "jakarta.xml.bind.annotation.XmlAccessorType",
        "jakarta.xml.bind.annotation.XmlElement",
    }
    
    if class_info.is_root:
        imports.add("jakarta.xml.bind.annotation.XmlRootElement")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement")
    
    if any(p.is_nullable for p in class_info.properties): imports.add("org.jetbrains.annotations.Nullable")
    if any(p.is_list for p in class_info.properties):
        imports.add("java.util.List")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper")
    if any(p.type_name == "OffsetDateTime" for p in class_info.properties): imports.add("java.time.OffsetDateTime")
    if any(p.type_name == "BigDecimal" for p in class_info.properties): imports.add("java.math.BigDecimal")
    if any(p.is_attribute for p in class_info.properties): imports.add("jakarta.xml.bind.annotation.XmlAttribute")
    if any(p.json_aliases for p in class_info.properties): imports.add("com.fasterxml.jackson.annotation.JsonAlias")
    if any(p.is_json_ignore for p in class_info.properties): imports.add("com.fasterxml.jackson.annotation.JsonIgnore")
    if any(p.is_xml_ignore for p in class_info.properties): imports.add("jakarta.xml.bind.annotation.XmlTransient")

    for imp in sorted(imports): lines.append(f"import {imp};")
    lines.append("")
    
    if class_info.description:
        lines.append("/**")
        for line in class_info.description.split("\n"): lines.append(f" * {line.strip('* ')}")
        lines.append(" */")
    
    if class_info.is_root:
        lines.append(f'@XmlRootElement(name = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
        lines.append(f'@JacksonXmlRootElement(localName = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
    
    lines.append("@XmlAccessorType(XmlAccessType.FIELD)")
    lines.append("@JsonIgnoreProperties(ignoreUnknown = true)")
    lines.append("@JsonInclude(JsonInclude.Include.NON_EMPTY)")
    lines.append(f"public class {class_info.name} {{")
    lines.append("")
    
    for prop in class_info.properties:
        if prop.description:
            lines.append("    /**")
            for line in prop.description.split("\n"): lines.append(f"     * {line.strip('* ')}")
            lines.append("     */")
        
        ns = prop.xml_namespace or class_info.namespace
        if prop.is_xml_ignore:
            lines.append("    @XmlTransient")
        elif prop.is_attribute:
            lines.append(f'    @XmlAttribute(name = "{prop.xml_element_name}")')
            lines.append(f'    @JacksonXmlProperty(isAttribute = true, localName = "{prop.xml_element_name}")')
        else:
            lines.append(f'    @XmlElement(name = "{prop.xml_element_name}", namespace = "{ns}")')
            lines.append(f'    @JacksonXmlProperty(localName = "{prop.xml_element_name}", namespace = "{ns}")')
        
        if prop.is_list:
            lines.append("    @JacksonXmlElementWrapper(useWrapping = false)")
        
        if prop.is_json_ignore:
            lines.append("    @JsonIgnore")
        else:
            lines.append(f'    @JsonProperty("{prop.json_property_name}")')
            if prop.json_aliases:
                aliases = ", ".join(f'"{a}"' for a in prop.json_aliases)
                lines.append(f'    @JsonAlias({{ {aliases} }})')
        
        if prop.is_nullable: lines.append("    @Nullable")
        
        field_name = prop.name[0].lower() + prop_name[1:] if (prop_name := prop.name) else "" 
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        lines.append(f"    private {type_str} {field_name};")
        lines.append("")
    
    lines.append(f"    public {class_info.name}() {{}}")
    lines.append("")
    
    for prop in class_info.properties:
        field_name = prop.name[0].lower() + prop.name[1:]
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        lines.append(f"    public {type_str} get{prop.name}() {{ return {field_name}; }}")
        lines.append(f"    public void set{prop.name}({type_str} {field_name}) {{ this.{field_name} = {field_name}; }}")
        lines.append("")
    
    lines.append("}")
    return "\n".join(lines)

def run_command(command: str, cwd: str = "."):
    """Run a shell command."""
    print(f"Running: {command}")
    result = subprocess.run(command, shell=True, cwd=cwd, capture_output=True, text=True)
    if result.returncode != 0:
        print(f"Error: {result.stderr}")
        return False
    return True

def main():
    import argparse
    parser = argparse.ArgumentParser(description="Generate Java models.")
    parser.add_argument("--skip-schema-generation", action="store_true", help="Skip regenerating JSON Schema from .NET")
    args = parser.parse_args()

    repo_root = Path(__file__).resolve().parent.parent
    os.chdir(repo_root)

    if not args.skip_schema_generation:
        print("Step 1: Regenerating JSON Schema from .NET models...")
        run_command(f"dotnet run --project {XSD_GENERATOR_PROJECT} -- .")
    
    print("Step 2: Processing C# models and generating Java code...")
    entities_path = repo_root / DOTNET_ENTITIES_PATH
    codes_path = repo_root / DOTNET_CODES_PATH
    output_path = repo_root / JAVA_MODELS_PATH
    output_path.mkdir(parents=True, exist_ok=True)

    # Collect all C# files
    class_files = list(entities_path.glob("*.cs"))
    for extra_path in OTHER_SOURCE_PATHS:
        class_files.extend((repo_root / extra_path).glob("*.cs"))

    # Process classes
    processed = 0
    errors = 0
    for cs_file in class_files:
        class_info = parse_csharp_file(cs_file)
        if not class_info: continue
        try:
            java_code = generate_java_class(class_info, "de.xjustiz.core.models")
            (output_path / f"{class_info.name}.java").write_text(java_code, encoding="utf-8")
            processed += 1
        except Exception as e:
            print(f"Error processing {cs_file.name}: {e}")
            errors += 1

    # Process enums (codes)
    print("Step 3: Processing C# codes (enums) and generating Java enums...")
    enum_files = list(codes_path.rglob("*Code.cs"))
    for enum_file in enum_files:
        enum_info = parse_csharp_enum(enum_file)
        if not enum_info: continue
        try:
            java_code = generate_java_enum(enum_info, "de.xjustiz.core.models")
            (output_path / f"{enum_info.name}.java").write_text(java_code, encoding="utf-8")
            processed += 1
        except Exception as e:
            print(f"Error processing enum {enum_file.name}: {e}")
            errors += 1
    
    print(f"\nDone! Processed {processed} files with {errors} errors.")

if __name__ == "__main__":
    main()

#!/usr/bin/env python3
"""
Sync Java models from .NET models.
This script reads C# model classes and generates corresponding Java classes
with full Javadoc documentation including links and formatting.
"""

import os
import re
import sys
from pathlib import Path
from dataclasses import dataclass, field
from typing import Optional, List, Tuple

# Paths relative to repo root
DOTNET_MODELS_PATH = "dotnet/src/xjustiz.core-dotnet/Models/Entities"
JAVA_MODELS_PATH = "java/src/main/java/de/xjustiz/core/models"

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


def convert_csharp_doc_to_javadoc(doc: str) -> str:
    """
    Convert C# XML documentation to Javadoc format.
    """
    if not doc:
        return ""
    
    result = doc.strip()
    
    # Convert <see cref="Type.Member"/> or <see cref="Type.Member"></see> to {@link Type#member}
    def convert_see_cref(match):
        cref = match.group(1)
        if "." in cref:
            parts = cref.split(".")
            class_name = parts[0]
            member = parts[1]
            # Convert to camelCase for Java
            member_java = member[0].lower() + member[1:] if member else ""
            return f"{{@link {class_name}#{member_java}}}"
        else:
            return f"{{@link {cref}}}"
    
    # Handle all variations of <see cref="...">
    result = re.sub(r'<see\s+cref="([^"]+)"\s*/>', convert_see_cref, result)  # <see cref="X"/>
    result = re.sub(r'<see\s+cref="([^"]+)"\s*>\s*</see>', convert_see_cref, result)  # <see cref="X"></see>
    result = re.sub(r'<see\s+cref="([^"]+)"\s*>[^<]*</see>', convert_see_cref, result)  # <see cref="X">text</see>
    
    # Convert <see href="url">text</see> or <see href="url"/> to <a href="url">text</a>
    def convert_see_href(match):
        url = match.group(1)
        text = match.group(2) if match.group(2) else url
        return f'<a href="{url}">{text}</a>'
    
    result = re.sub(r'<see\s+href="([^"]+)"(?:\s*/>|>([^<]*)</see>)', convert_see_href, result)
    
    # Convert <c>code</c> to {@code code}
    result = re.sub(r'<c>([^<]+)</c>', r'{@code \1}', result)
    
    # Convert <paramref name="x"/> to {@code x}
    result = re.sub(r'<paramref\s+name="([^"]+)"(?:\s*/)?>', r'{@code \1}', result)
    
    # Convert <br/> to proper line break for Javadoc
    result = result.replace("<br/>", "\n * <p>\n * ")
    result = result.replace("<br />", "\n * <p>\n * ")
    
    # Clean up any stray XML tags that might have been missed
    result = re.sub(r'</see>', '', result)
    result = re.sub(r'<see[^>]*>', '', result)
    
    return result


@dataclass
class PropertyInfo:
    name: str
    type_name: str
    is_nullable: bool
    is_list: bool
    xml_element_name: Optional[str] = None
    json_property_name: Optional[str] = None
    description: Optional[str] = None
    is_attribute: bool = False


@dataclass
class ClassInfo:
    name: str
    namespace: str
    properties: list = field(default_factory=list)
    is_root: bool = False
    xml_root_name: Optional[str] = None
    description: Optional[str] = None


def find_repo_root() -> Path:
    """Find the repository root by looking for .git directory."""
    current = Path(__file__).resolve().parent
    while current != current.parent:
        if (current / ".git").exists():
            return current
        current = current.parent
    raise RuntimeError("Could not find repository root")


def extract_all_summaries(content: str) -> dict:
    """
    Extract all XML summary comments and their positions.
    Returns a dict mapping end position to the summary text.
    """
    summaries = {}
    pattern = r'///\s*<summary>\s*\n((?:\s*///[^\n]*\n)*?)\s*///\s*</summary>'
    
    for match in re.finditer(pattern, content):
        summary_content = match.group(1)
        # Remove /// prefix and join lines
        lines = []
        for line in summary_content.split('\n'):
            line = line.strip()
            if line.startswith('///'):
                line = line[3:].strip()
            if line:
                lines.append(line)
        
        summary_text = ' '.join(lines)
        summaries[match.end()] = summary_text
    
    return summaries


def find_closest_summary(summaries: dict, target_pos: int, max_distance: int = 300) -> Optional[str]:
    """Find the summary that is closest to (and before) target_pos."""
    closest_pos = None
    closest_distance = float('inf')
    
    for end_pos, summary in summaries.items():
        distance = target_pos - end_pos
        if 0 < distance < closest_distance and distance < max_distance:
            closest_distance = distance
            closest_pos = end_pos
    
    return summaries.get(closest_pos)


def parse_csharp_file(file_path: Path) -> Optional[ClassInfo]:
    """Parse a C# file and extract class information with documentation."""
    content = file_path.read_text(encoding="utf-8")
    
    # Skip non-entity files
    if "class" not in content:
        return None
    
    # Extract class name
    class_match = re.search(r"public\s+(?:partial\s+)?class\s+(\w+)", content)
    if not class_match:
        return None
    
    class_name = class_match.group(1)
    
    # Skip helper classes
    if class_name.endswith("Core") or class_name in ["SchemeConstants", "XJustizAvailabilityAttribute"]:
        return None
    
    # Extract all summaries first
    summaries = extract_all_summaries(content)
    
    # Find class description
    class_description = find_closest_summary(summaries, class_match.start(), max_distance=500)
    if class_description:
        class_description = convert_csharp_doc_to_javadoc(class_description)
    
    class_info = ClassInfo(
        name=class_name,
        namespace="http://www.xjustiz.de",
        properties=[],
        description=class_description
    )
    
    # Check for XmlRoot attribute
    root_match = re.search(r'\[XmlRoot\s*\(\s*"([^"]+)"', content)
    if root_match:
        class_info.is_root = True
        class_info.xml_root_name = root_match.group(1)
    
    # Find all property declarations with their annotations
    prop_pattern = re.compile(
        r'\[Xml(Element|Attribute)\s*\(\s*"([^"]+)"[^\]]*\)\]'
        r'[\s\S]*?'
        r'public\s+(?:required\s+)?(\w+(?:<\w+>)?(?:\[\])?)\??\s+(\w+)\s*\{[^}]*\}',
        re.MULTILINE
    )
    
    for match in prop_pattern.finditer(content):
        xml_type = match.group(1)  # Element or Attribute
        xml_name = match.group(2)
        type_name = match.group(3)
        prop_name = match.group(4)
        
        # Find the summary for this property
        prop_description = find_closest_summary(summaries, match.start(), max_distance=400)
        if prop_description:
            prop_description = convert_csharp_doc_to_javadoc(prop_description)
        
        # Check for nullable
        prop_context = content[match.start():match.end()]
        is_nullable = "?" in prop_context
        
        # Check if it's a list/array
        is_list = False
        if type_name.startswith("List<"):
            is_list = True
            inner_match = re.match(r"List<(\w+)>", type_name)
            if inner_match:
                type_name = inner_match.group(1)
        elif type_name.endswith("[]"):
            is_list = True
            type_name = type_name[:-2]
        
        # Map type
        java_type = TYPE_MAPPINGS.get(type_name, type_name)
        
        prop_info = PropertyInfo(
            name=prop_name,
            type_name=java_type,
            is_nullable=is_nullable or is_list,  # Lists are always nullable in our model
            is_list=is_list,
            xml_element_name=xml_name,
            json_property_name=prop_name,
            description=prop_description,
            is_attribute=(xml_type == "Attribute")
        )
        class_info.properties.append(prop_info)
    
    return class_info if class_info.properties else None


def to_camel_case(name: str) -> str:
    """Convert PascalCase to camelCase."""
    if not name:
        return name
    return name[0].lower() + name[1:]


def generate_java_class(class_info: ClassInfo) -> str:
    """Generate Java class code from class info with full Javadoc."""
    lines = []
    
    # Package declaration
    lines.append("package de.xjustiz.core.models;")
    lines.append("")
    
    # Collect imports
    imports = set([
        "com.fasterxml.jackson.annotation.JsonProperty",
        "com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty",
        "jakarta.xml.bind.annotation.XmlAccessType",
        "jakarta.xml.bind.annotation.XmlAccessorType",
        "jakarta.xml.bind.annotation.XmlElement",
    ])
    
    if class_info.is_root:
        imports.add("jakarta.xml.bind.annotation.XmlRootElement")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement")
    
    has_nullable = any(p.is_nullable for p in class_info.properties)
    has_list = any(p.is_list for p in class_info.properties)
    has_datetime = any(p.type_name == "OffsetDateTime" for p in class_info.properties)
    has_attribute = any(p.is_attribute for p in class_info.properties)
    
    if has_nullable:
        imports.add("org.jetbrains.annotations.Nullable")
    if has_list:
        imports.add("java.util.List")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper")
    if has_datetime:
        imports.add("java.time.OffsetDateTime")
    if has_attribute:
        imports.add("jakarta.xml.bind.annotation.XmlAttribute")
    
    for imp in sorted(imports):
        lines.append(f"import {imp};")
    lines.append("")
    
    # Class Javadoc
    if class_info.description:
        lines.append("/**")
        for line in class_info.description.split("\n"):
            line = line.strip()
            if line.startswith("*"):
                lines.append(f" {line}")
            else:
                lines.append(f" * {line}")
        lines.append(" */")
    
    # Class annotations
    if class_info.is_root and class_info.xml_root_name:
        lines.append(f'@XmlRootElement(name = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
        lines.append(f'@JacksonXmlRootElement(localName = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
    
    lines.append("@XmlAccessorType(XmlAccessType.FIELD)")
    lines.append(f"public class {class_info.name} {{")
    lines.append("")
    
    # Fields with documentation
    for prop in class_info.properties:
        xml_name = prop.xml_element_name or to_camel_case(prop.name)
        json_name = prop.json_property_name or prop.name
        
        # Property Javadoc
        if prop.description:
            lines.append("    /**")
            for line in prop.description.split("\n"):
                line = line.strip()
                if line.startswith("*"):
                    lines.append(f"     {line}")
                else:
                    lines.append(f"     * {line}")
            lines.append("     */")
        
        # Field annotations
        if prop.is_attribute:
            lines.append(f'    @XmlAttribute(name = "{xml_name}")')
            lines.append(f'    @JacksonXmlProperty(isAttribute = true, localName = "{xml_name}")')
        else:
            lines.append(f'    @XmlElement(name = "{xml_name}", namespace = "{class_info.namespace}")')
            lines.append(f'    @JacksonXmlProperty(localName = "{xml_name}", namespace = "{class_info.namespace}")')
        
        if prop.is_list:
            lines.append("    @JacksonXmlElementWrapper(useWrapping = false)")
        
        lines.append(f'    @JsonProperty("{json_name}")')
        
        if prop.is_nullable:
            lines.append("    @Nullable")
        
        # Field declaration
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        lines.append(f"    private {type_str} {to_camel_case(prop.name)};")
        lines.append("")
    
    # Default constructor
    lines.append("    /**")
    lines.append("     * Default constructor.")
    lines.append("     */")
    lines.append(f"    public {class_info.name}() {{")
    lines.append("    }")
    lines.append("")
    
    # Getters and setters with Javadoc
    for prop in class_info.properties:
        field_name = to_camel_case(prop.name)
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        
        # Extract first sentence for getter summary
        first_line = ""
        if prop.description:
            first_line = prop.description.split("\n")[0].strip()
            # Remove leading "* " if present
            if first_line.startswith("* "):
                first_line = first_line[2:]
        
        # Getter Javadoc
        lines.append("    /**")
        if first_line:
            lines.append(f"     * {first_line}")
        else:
            lines.append(f"     * Gets the {field_name}.")
        lines.append("     *")
        lines.append(f"     * @return the {field_name}")
        lines.append("     */")
        
        if prop.is_nullable:
            lines.append("    @Nullable")
        lines.append(f"    public {type_str} get{prop.name}() {{")
        lines.append(f"        return {field_name};")
        lines.append("    }")
        lines.append("")
        
        # Setter Javadoc
        lines.append("    /**")
        lines.append(f"     * Sets the {field_name}.")
        lines.append("     *")
        lines.append(f"     * @param {field_name} the {field_name} to set")
        lines.append("     */")
        
        nullable_param = "@Nullable " if prop.is_nullable else ""
        lines.append(f"    public void set{prop.name}({nullable_param}{type_str} {field_name}) {{")
        lines.append(f"        this.{field_name} = {field_name};")
        lines.append("    }")
        lines.append("")
    
    lines.append("}")
    lines.append("")
    
    return "\n".join(lines)


def sync_models(repo_root: Path) -> dict:
    """Sync Java models from .NET models."""
    dotnet_path = repo_root / DOTNET_MODELS_PATH
    java_path = repo_root / JAVA_MODELS_PATH
    
    if not dotnet_path.exists():
        print(f"Error: .NET models path not found: {dotnet_path}")
        sys.exit(1)
    
    java_path.mkdir(parents=True, exist_ok=True)
    
    results = {
        "created": [],
        "updated": [],
        "unchanged": [],
        "errors": []
    }
    
    # Process .NET files
    for cs_file in dotnet_path.glob("*.cs"):
        try:
            class_info = parse_csharp_file(cs_file)
            if not class_info:
                continue
            
            java_file = java_path / f"{class_info.name}.java"
            java_code = generate_java_class(class_info)
            
            if java_file.exists():
                existing_content = java_file.read_text(encoding="utf-8")
                if existing_content.strip() == java_code.strip():
                    results["unchanged"].append(class_info.name)
                else:
                    java_file.write_text(java_code, encoding="utf-8")
                    results["updated"].append(class_info.name)
            else:
                java_file.write_text(java_code, encoding="utf-8")
                results["created"].append(class_info.name)
                
        except Exception as e:
            import traceback
            results["errors"].append(f"{cs_file.name}: {str(e)}\n{traceback.format_exc()}")
    
    return results


def main():
    print("=" * 60)
    print("Java Model Sync from .NET")
    print("=" * 60)
    print()
    
    repo_root = find_repo_root()
    print(f"Repository root: {repo_root}")
    print()
    
    results = sync_models(repo_root)
    
    # Print results
    if results["created"]:
        print(f"✅ Created ({len(results['created'])}):")
        for name in sorted(results["created"]):
            print(f"   + {name}.java")
        print()
    
    if results["updated"]:
        print(f"🔄 Updated ({len(results['updated'])}):")
        for name in sorted(results["updated"]):
            print(f"   ~ {name}.java")
        print()
    
    if results["unchanged"]:
        print(f"⏸️  Unchanged ({len(results['unchanged'])}):")
        for name in sorted(results["unchanged"]):
            print(f"   = {name}.java")
        print()
    
    if results["errors"]:
        print(f"❌ Errors ({len(results['errors'])}):")
        for error in results["errors"]:
            print(f"   ! {error}")
        print()
    
    # Summary
    total = len(results["created"]) + len(results["updated"]) + len(results["unchanged"])
    print("-" * 60)
    print(f"Total: {total} models processed")
    print(f"  Created: {len(results['created'])}")
    print(f"  Updated: {len(results['updated'])}")
    print(f"  Unchanged: {len(results['unchanged'])}")
    if results["errors"]:
        print(f"  Errors: {len(results['errors'])}")
    print()
    
    if results["created"] or results["updated"]:
        print("💡 Remember to review the generated files and run tests!")
    
    return 0 if not results["errors"] else 1


if __name__ == "__main__":
    sys.exit(main())

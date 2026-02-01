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
# Configuration
DOTNET_PROJECT_PATH = "sdk/dotnet/src/xjustiz.core-dotnet"
DOTNET_ENTITIES_PATH = f"{DOTNET_PROJECT_PATH}/Models/Entities"
DOTNET_CODES_PATH = f"{DOTNET_PROJECT_PATH}/Models/Codes"
OTHER_SOURCE_PATHS = [
    f"{DOTNET_PROJECT_PATH}/Models",
]
JAVA_MODELS_PATH = "sdk/java/src/main/java/de/xjustiz/core/models"
XSD_GENERATOR_PROJECT = "sdk/dotnet/src/xjustiz.core-dotnet.XsdGenerator"

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
    "Guid": "UUID",
    "System.Guid": "UUID",
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
    is_wrapped_list: bool = False
    wrapper_name: Optional[str] = None
    xml_elements: List[Tuple[str, Optional[str], Optional[str]]] = field(default_factory=list)
    order: int = 9999

@dataclass
class ClassInfo:
    name: str
    namespace: str
    properties: List[PropertyInfo] = field(default_factory=list)
    is_root: bool = False
    xml_root_name: Optional[str] = None
    description: Optional[str] = None
    parent_class: Optional[str] = None
    discriminator: Optional[str] = None
    subtypes: List[Tuple[str, str]] = field(default_factory=list)

@dataclass
class EnumValueInfo:
    name: str
    xml_value: str
    description: Optional[str] = None
    aliases: List[str] = field(default_factory=list)

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

    # Sanitize special characters to prevent Mojibake / encoding issues
    result = result.replace("\u2013", "-").replace("\u2014", "--")  # Dashes
    result = result.replace("\u2010", "-")                          # Hyphen (U+2010) - causes 0x90 error in 1252
    result = result.replace("\u2018", "'").replace("\u2019", "'")   # Smart single quotes
    result = result.replace("\u201C", '"').replace("\u201D", '"')   # Smart double quotes
    
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

def extract_all_summaries(content: str) -> List[Tuple[int, str]]:
    """Extract all XML summary comments and their end positions."""
    summaries = []
    pos = 0
    while True:
        start_tag = content.find('<summary>', pos)
        if start_tag == -1: break
        end_tag = content.find('</summary>', start_tag)
        if end_tag == -1: break
        
        raw_text = content[start_tag + 9 : end_tag]
        lines = []
        for line in raw_text.split('\n'):
            # Remove /// and leading/trailing whitespace
            clean = re.sub(r'^\s*///\s*', '', line).strip()
            if clean: lines.append(clean)
        
        summaries.append((end_tag + 10, ' '.join(lines)))
        pos = end_tag + 10
    return summaries

def find_closest_summary(summaries: List[Tuple[int, str]], target_pos: int, max_distance: int = 500) -> Optional[str]:
    """Find the summary whose end is closest to (and before) target_pos."""
    best_summary = None
    min_dist = float('inf')
    for end_pos, text in summaries:
        dist = target_pos - end_pos
        if 0 < dist < min_dist and dist < max_distance:
            min_dist = dist
            best_summary = text
    return best_summary

def find_class_blocks(content: str) -> List[Tuple[str, Optional[str], str, int, str]]:
    """
    Find all class definitions and extract their bodies.
    Returns list of (class_name, parent_name, body_content, start_pos, full_declaration)
    """
    blocks = []
    # Regex to find class start: public [abstract|partial|...] class Name [: Parent]
    class_pattern = re.compile(r"public\s+(?:[\w\s]+)?class\s+(\w+)(?:\s*:\s*([a-zA-Z0-9_]+))?")
    
    for match in class_pattern.finditer(content):
        start_def = match.start()
        class_name = match.group(1)
        parent_name = match.group(2)
        
        # Find opening brace
        open_brace = content.find('{', match.end())
        if open_brace == -1: continue
        
        # Simple brace counting to find closing brace
        brace_count = 1
        i = open_brace + 1
        while i < len(content) and brace_count > 0:
            if content[i] == '{': brace_count += 1
            elif content[i] == '}': brace_count -= 1
            i += 1
            
        if brace_count == 0:
            body = content[open_brace+1 : i-1]
            blocks.append((class_name, parent_name, body, start_def, match.group(0), open_brace + 1))
            
    return blocks

def parse_csharp_file(file_path: Path) -> List[ClassInfo]:
    """Parse a C# file and extract class information with documentation."""
    try:
        content = file_path.read_text(encoding="utf-8")
    except Exception:
        return []

    if "class" not in content:
        return []
    
    class_blocks = find_class_blocks(content)
    summaries = extract_all_summaries(content)
    classes = []
    
    for class_name, parent_class_name, class_body, match_start, _, body_offset in class_blocks:
        # Skip only infrastructure/helper classes, keep Core data models
        if class_name in ["SchemeConstants", "XJustizAvailabilityAttribute", "XJustizVersion", "XJustizCoreVersion"]:
            continue
            
        class_description = find_closest_summary(summaries, match_start)
        if class_description:
            class_description = convert_csharp_doc_to_javadoc(class_description)
        if parent_class_name and parent_class_name.startswith("I"):
            parent_class_name = None

        class_info = ClassInfo(
            name=class_name,
            namespace="http://www.xjustiz.de",
            description=class_description,
            parent_class=parent_class_name
        )
        
        # Check for XmlRoot on the class (search before class definition)
        # Scan backward from match_start to find attributes
        pre_class_content = content[:match_start]
        # Limit to last 1000 chars to avoid false positives from other classes
        search_window = pre_class_content[-1000:] 
        root_match = re.search(r'\[XmlRoot\s*\(\s*(?:ElementName\s*=\s*)?"([^"]+)"(?:,\s*Namespace\s*=\s*(?:SchemeConstants\.)?(\w+))?', search_window, re.IGNORECASE)
        if root_match:
            class_info.is_root = True
            class_info.xml_root_name = root_match.group(1)
            if root_match.lastindex >= 2:
                ns_var = root_match.group(2)
                if ns_var == "XJustiz_Tns": class_info.namespace = "http://www.xjustiz.de"
                elif ns_var == "XJustizCore_Tns": class_info.namespace = "http://www.xjustizcore.de"
                elif ns_var == "Xsi": class_info.namespace = "http://www.w3.org/2001/XMLSchema-instance"

        poly_match = re.search(r'\[JsonPolymorphic\s*\((?:.*TypeDiscriminatorPropertyName\s*=\s*"([^"]+)")?.*\)', search_window)
        if poly_match and poly_match.group(1):
            class_info.discriminator = poly_match.group(1)
            
            # Find all derived types
            for dt_match in re.finditer(r'\[JsonDerivedType\s*\(\s*typeof\s*\(\s*([a-zA-Z0-9_]+)\s*\)\s*,\s*"([^"]+)"\s*\)', search_window):
                 class_info.subtypes.append((dt_match.group(1), dt_match.group(2)))
            
        # Parse properties strictly within the class body
        prop_pattern = re.compile(
            r'((?:\[[^\]]+\]\s*)*)' # Attributes
            r'public\s+(?!class|partial|interface|enum|struct)(?:required\s+)?(\w+(?:<\w+>)?(?:\[\])?)\??\s+(\w+)\s*\{',
            re.MULTILINE
        )
        
        for match in prop_pattern.finditer(class_body):
            attributes_str = match.group(1)
            type_name = match.group(2)
            prop_name = match.group(3)
            
            # Find closest summary relative to class body start
            raw_sum = find_closest_summary(summaries, body_offset + match.start())
            prop_description = convert_csharp_doc_to_javadoc(raw_sum) if raw_sum else None
            
            is_nullable = "?" in class_body[match.start():match.end()]
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
            
            is_wrapped_list = False
            wrapper_name = None
            xml_elements = []
            
            # Check for XmlArray (Wrapped List)
            xml_array_match = re.search(r'\[XmlArray\s*\(\s*(?:ElementName\s*=\s*)?"([^"]+)"(?:,\s*Namespace\s*=\s*(?:SchemeConstants\.)?(\w+))?[^\]]*\)\]', attributes_str)
            if xml_array_match:
                is_wrapped_list = True
                wrapper_name = xml_array_match.group(1)
                namespace_var = xml_array_match.group(2)
                if namespace_var == "XJustizCore_Tns":
                    xml_namespace = "http://www.xjustizcore.de"
                elif namespace_var == "XJustiz_Tns":
                    xml_namespace = "http://www.xjustiz.de"
                
                # Check for XmlArrayItem(s)
                for item_match in re.finditer(r'\[XmlArrayItem\s*\(\s*(?:ElementName\s*=\s*)?"([^"]+)"([^\]]*)\]', attributes_str):
                    el_name = item_match.group(1)
                    args = item_match.group(2)
                    
                    el_type = None
                    type_match = re.search(r'typeof\s*\(\s*([a-zA-Z0-9_]+)\s*\)', args)
                    if type_match:
                        el_type = type_match.group(1)
                        if el_type == "string": el_type = "String"
                    
                    el_ns = None
                    ns_match = re.search(r'Namespace\s*=\s*(?:SchemeConstants\.)?(\w+)', args)
                    if ns_match:
                         ns_var = ns_match.group(1)
                         if ns_var == "XJustizCore_Tns":
                             el_ns = "http://www.xjustizcore.de"
                         elif ns_var == "XJustiz_Tns":
                             el_ns = "http://www.xjustiz.de"
                         elif ns_var == "Xsi":
                             el_ns = "http://www.w3.org/2001/XMLSchema-instance"
                    
                    xml_elements.append((el_name, el_type, el_ns))
                
                if xml_elements and len(xml_elements) == 1:
                     xml_name = xml_elements[0][0]
            else:
                # Check for XmlElement(s) - handle multiple for Choice
                xml_elements = []
                # Regex matches: [XmlElement("name", Type=typeof(Type), ...)]
                # simplified regex to catch name and optional type and namespace
                # We iterate over all attributes_str to find all matches
                for xe_match in re.finditer(r'\[XmlElement\s*\(\s*(?:ElementName\s*=\s*)?"([^"]+)"([^\]]*)\]', attributes_str):
                    el_name = xe_match.group(1)
                    args = xe_match.group(2)
                    
                    el_type = None
                    type_match = re.search(r'Type\s*=\s*typeof\s*\(\s*([a-zA-Z0-9_]+)\s*\)', args)
                    if type_match:
                        el_type = type_match.group(1)
                        if el_type == "string": el_type = "String"
                    
                    el_ns = None
                    ns_match = re.search(r'Namespace\s*=\s*(?:SchemeConstants\.)?(\w+)', args)
                    if ns_match:
                         namespace_var = ns_match.group(1)
                         if namespace_var == "XJustizCore_Tns":
                             el_ns = "http://www.xjustizcore.de"
                         elif namespace_var == "XJustiz_Tns":
                             el_ns = "http://www.xjustiz.de"
                         elif namespace_var == "Xsi":
                             el_ns = "http://www.w3.org/2001/XMLSchema-instance"
                    
                    xml_elements.append((el_name, el_type, el_ns))

                if xml_elements:
                    if len(xml_elements) == 1:
                        xml_name = xml_elements[0][0]
                        # Capture namespace if present
                        if xml_elements[0][2]: xml_namespace = xml_elements[0][2]
                    else:
                        # Choice
                        pass # handled by storing xml_elements in property info? need to update structure
                else:
                    # Check for Attribute
                    xml_match = re.search(r'\[XmlAttribute\s*\(\s*(?:AttributeName\s*=\s*)?"([^"]+)"(?:,\s*Namespace\s*=\s*(?:SchemeConstants\.)?(\w+))?[^\]]*\)\]', attributes_str)
                    if xml_match:
                        is_attribute = True
                        xml_name = xml_match.group(1)
                        namespace_var = xml_match.group(2)
                        if namespace_var == "XJustizCore_Tns":
                            xml_namespace = "http://www.xjustizcore.de"
                        elif namespace_var == "XJustiz_Tns":
                            xml_namespace = "http://www.xjustiz.de"
                        elif namespace_var == "Xsi":
                            xml_namespace = "http://www.w3.org/2001/XMLSchema-instance"
            
            # Update PropertyInfo creation to pass xml_elements
            
            json_match = re.search(r'\[(?:[\w\.]+\.)?JsonPropertyName\s*\(\s*"([^"]+)"\s*\)\]', attributes_str)
            if json_match:
                json_property = json_match.group(1)
                if json_property != prop_name:
                    json_aliases.append(prop_name)
                    json_aliases.append(prop_name[0].lower() + prop_name[1:])
            else:
                 # Default to adding camelCase alias for robustness
                 camel_name = prop_name[0].lower() + prop_name[1:]
                 if camel_name != prop_name:
                     json_aliases.append(camel_name)

            # Extract Order if present
            order = 9999
            order_match = re.search(r'Order\s*=\s*(\d+)', attributes_str)
            if order_match:
                order = int(order_match.group(1))

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
                is_xml_ignore=is_xml_ignore,
                is_wrapped_list=is_wrapped_list,
                wrapper_name=wrapper_name,
                xml_elements=xml_elements,
                order=order
            ))
            
        # Post-process properties to merge Code and CodeForXml (patterns from ICode<T>)
        code_prop = next((p for p in class_info.properties if p.name == "Code"), None)
        code_xml_prop = next((p for p in class_info.properties if p.name == "CodeForXml"), None)
        if code_prop and code_xml_prop:
            code_prop.xml_element_name = code_xml_prop.xml_element_name
            code_prop.xml_namespace = code_xml_prop.xml_namespace
            code_prop.is_xml_ignore = False
            code_prop.order = code_xml_prop.order
            class_info.properties = [p for p in class_info.properties if p.name != "CodeForXml"]

        # Always append the class, even if properties are empty
        classes.append(class_info)
    
    return classes

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
    body_offset = enum_match.end() + content[enum_match.end():].find('{') + 1

    # Match enum members like: [XmlEnum("1")] Maennlich,
    # We strip out the summary lines for member matching to avoid false positives
    lines = enum_body.split('\n')
    clean_body_lines = []
    for line in lines:
        if line.strip().startswith('///'):
            clean_body_lines.append(" " * len(line)) # Keep length for offsets
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
        
        raw_description = find_closest_summary(summaries, body_offset + match.start())
        aliases = []
        if raw_description:
            # Extract common aliases from documentation (e.g., ISO-2/ISO-3)
            iso2_match = re.search(r'ISO-2:\s*(\w+)', raw_description)
            if iso2_match: aliases.append(iso2_match.group(1))
            iso3_match = re.search(r'ISO-3:\s*(\w+)', raw_description)
            if iso3_match: aliases.append(iso3_match.group(1))
            
            # Extract bold name as alias (e.g. <b>Alle Sparten</b>)
            bold_match = re.search(r'<b>([^<]+)</b>', raw_description)
            if bold_match: aliases.append(bold_match.group(1))
            
            member_description = convert_csharp_doc_to_javadoc(raw_description)
        else:
            member_description = ""
        
        # Java identifiers cannot start with digits
        java_name = name
        if java_name[0].isdigit():
            java_name = "_" + java_name

        enum_info.values.append(EnumValueInfo(
            name=java_name,
            xml_value=xml_value,
            description=member_description,
            aliases=aliases
        ))
        
    return enum_info if enum_info.values else None

def generate_large_enum_class(enum_info: EnumInfo, package: str) -> str:
    """Generate Java class code for large enums to avoid code size limits."""
    lines = [f"package {package};", ""]
    lines.append("import com.fasterxml.jackson.annotation.JsonCreator;")
    lines.append("import com.fasterxml.jackson.annotation.JsonValue;")
    lines.append("import jakarta.xml.bind.annotation.adapters.XmlAdapter;")
    lines.append("import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;")
    lines.append("import java.util.ArrayList;")
    lines.append("import java.util.Collections;")
    lines.append("import java.util.List;")
    lines.append("")
    
    if enum_info.description:
        lines.append("/**")
        for line in enum_info.description.split("\n"): lines.append(f" * {line}")
        lines.append(" */")
    
    lines.append(f"@XmlJavaTypeAdapter({enum_info.name}.Adapter.class)")
    lines.append(f"public class {enum_info.name} {{")
    lines.append("")
    
    # Fields
    for val in enum_info.values:
        if val.description:
            lines.append("    /**")
            for line in val.description.split("\n"): lines.append(f"     * {line}")
            lines.append("     */")
        lines.append(f"    public static {enum_info.name} {val.name};")
    lines.append("")
    
    lines.append("    private final String value;")
    lines.append("    private final String name;")
    lines.append(f"    private static final List<{enum_info.name}> $VALUES = new ArrayList<>();")
    lines.append("")
    lines.append(f"    private {enum_info.name}(String name, String value) {{ this.name = name; this.value = value; }}")
    lines.append("")
    lines.append("    /**")
    lines.append("     * Gets the xml value.")
    lines.append("     * @return the xml value")
    lines.append("     */")
    lines.append("    @JsonValue")
    lines.append("    public String getValue() { return value; }")
    lines.append("")
    lines.append("    /**")
    lines.append("     * Gets the enum name.")
    lines.append("     * @return the enum name")
    lines.append("     */")
    lines.append("    public String name() { return name; }")
    lines.append("")
    lines.append("    /**")
    lines.append("     * Returns an unmodifiable list of all enum values.")
    lines.append("     * @return the list of enum values")
    lines.append("     */")
    lines.append(f"    public static List<{enum_info.name}> values() {{ return Collections.unmodifiableList($VALUES); }}")
    lines.append("")
    
    # Split initialization
    chunk_size = 500
    values = enum_info.values
    chunks = [values[i:i + chunk_size] for i in range(0, len(values), chunk_size)]
    
    lines.append("    static {")
    for i in range(len(chunks)):
        lines.append(f"        init{i}();")
    lines.append("    }")
    lines.append("")

    for i, chunk in enumerate(chunks):
        lines.append(f"    private static void init{i}() {{")
        for val in chunk:
             lines.append(f'        {val.name} = new {enum_info.name}("{val.name}", "{val.xml_value}");')
             lines.append(f'        $VALUES.add({val.name});')
        lines.append("    }")
        lines.append("")
    
    # Alias Map
    lines.append(f"    private static final java.util.Map<String, {enum_info.name}> ALIASES = new java.util.HashMap<>();")
    
    alias_entries = []
    for val in enum_info.values:
        for alias in val.aliases:
            alias_entries.append((alias, val.name))
    
    if alias_entries:
        lines.append("    static {")
        chunk_size = 300
        alias_chunks = [alias_entries[i:i + chunk_size] for i in range(0, len(alias_entries), chunk_size)]
        for i in range(len(alias_chunks)):
            lines.append(f"        initAliases{i}();")
        lines.append("    }")
        lines.append("")
        
        for i, chunk in enumerate(alias_chunks):
            lines.append(f"    private static void initAliases{i}() {{")
            for alias, val_name in chunk:
                safe_alias = alias.replace('"', '\\"')
                lines.append(f'        ALIASES.put("{safe_alias}".toLowerCase(), {val_name});')
            lines.append("    }")
            lines.append("")

    # fromValue
    lines.append("    /**")
    lines.append("     * Creates an enum from a string value.")
    lines.append("     * @param value the string value")
    lines.append(f"     * @return the enum value")
    lines.append("     */")
    lines.append("    @JsonCreator")
    lines.append(f"    public static {enum_info.name} fromValue(String value) {{")
    lines.append(f"        if (value == null || value.isEmpty()) throw new IllegalArgumentException(\"Value cannot be null or empty\");")
    lines.append(f"        for ({enum_info.name} e : $VALUES) {{")
    lines.append("            if (e.getValue().equals(value) || e.name().equalsIgnoreCase(value)) {")
    lines.append("                return e;")
    lines.append("            }")
    lines.append("        }")
    lines.append("        " + enum_info.name + " match = ALIASES.get(value.toLowerCase());")
    lines.append("        if (match != null) return match;")
    lines.append("        throw new IllegalArgumentException(value);")
    lines.append("    }")
    lines.append("")
    
    lines.append("    @Override")
    lines.append("    public String toString() { return value; }")
    lines.append("")
    
    lines.append("    /**")
    lines.append("     * XML Adapter for JAXB.")
    lines.append("     */")
    lines.append(f"    public static class Adapter extends XmlAdapter<String, {enum_info.name}> {{")
    lines.append(f"        public {enum_info.name} unmarshal(String v) {{ return fromValue(v); }}")
    lines.append(f"        public String marshal({enum_info.name} v) {{ return v != null ? v.getValue() : null; }}")
    lines.append("    }")
    
    lines.append("}")
    return "\n".join(lines)

def generate_java_enum(enum_info: EnumInfo, package: str) -> str:
    """Generate Java enum code."""
    if len(enum_info.values) > 1000:
        return generate_large_enum_class(enum_info, package)

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
    
    # Alias Map
    lines.append(f"    private static final java.util.Map<String, {enum_info.name}> ALIASES = new java.util.HashMap<>();")
    
    alias_entries = []
    for val in enum_info.values:
        for alias in val.aliases:
            alias_entries.append((alias, val.name))
    
    if alias_entries:
        lines.append("    static {")
        # Split initialization to avoid code size limits in static initializer
        chunk_size = 300
        alias_chunks = [alias_entries[i:i + chunk_size] for i in range(0, len(alias_entries), chunk_size)]
        for i in range(len(alias_chunks)):
            lines.append(f"        initAliases{i}();")
        lines.append("    }")
        lines.append("")
        
        for i, chunk in enumerate(alias_chunks):
            lines.append(f"    private static void initAliases{i}() {{")
            for alias, val_name in chunk:
                safe_alias = alias.replace('"', '\\"')
                lines.append(f'        ALIASES.put("{safe_alias}".toLowerCase(), {val_name});')
            lines.append("    }")
            lines.append("")

    lines.append("    /**")
    lines.append("     * Gets the xml value.")
    lines.append("     * @return the xml value")
    lines.append("     */")
    lines.append("    @JsonValue")
    lines.append("    public String getValue() { return value; }")
    lines.append("")
    lines.append("    /**")
    lines.append("     * Creates an enum from a string value.")
    lines.append("     * @param value the string value")
    lines.append(f"     * @return the enum value")
    lines.append("     */")
    lines.append("    @com.fasterxml.jackson.annotation.JsonCreator")
    lines.append(f"    public static {enum_info.name} fromValue(String value) {{")
    lines.append(f"        if (value == null || value.isEmpty()) throw new IllegalArgumentException(\"Value cannot be null or empty\");")
    lines.append(f"        for ({enum_info.name} e : {enum_info.name}.values()) {{")
    lines.append("            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {")
    lines.append("                return e;")
    lines.append("            }")
    lines.append("        }")
    lines.append("        " + enum_info.name + " match = ALIASES.get(value.toLowerCase());")
    lines.append("        if (match != null) return match;")
    lines.append("        throw new IllegalArgumentException(value);")
    lines.append("    }")
    lines.append("")
    lines.append("    @Override")
    lines.append("    public String toString() { return value; }")
    lines.append("}")
    
    return "\n".join(lines)

def generate_java_class(class_info: ClassInfo, package: str) -> str:
    """Generate Java class code."""
    lines = [f"package {package};", ""]
    
    # Sort properties by order for consistent XML output
    class_info.properties.sort(key=lambda p: p.order)
    
    # Calculate propOrder (using Java field names)
    prop_order_str = ""
    if class_info.properties:
        prop_order = []
        for prop in class_info.properties:
            # We must use proper Java field naming logic here
            field_name = prop.name[0].lower() + prop.name[1:]
            prop_order.append(f'"{field_name}"')
        prop_order_joined = ", ".join(prop_order)
        prop_order_str = f', propOrder = {{ {prop_order_joined} }}'
    
    imports = {
        "com.fasterxml.jackson.annotation.JsonIgnoreProperties",
        "com.fasterxml.jackson.annotation.JsonInclude",
        "jakarta.xml.bind.annotation.XmlAccessType",
        "jakarta.xml.bind.annotation.XmlAccessorType",
        "jakarta.xml.bind.annotation.XmlType",
    }
    
    if class_info.is_root:
        imports.add("jakarta.xml.bind.annotation.XmlRootElement")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement")
    
    if class_info.discriminator:
        imports.add("com.fasterxml.jackson.annotation.JsonTypeInfo")
        imports.add("com.fasterxml.jackson.annotation.JsonSubTypes")

    # Property-based imports
    has_list = any(p.is_list for p in class_info.properties)
    has_nullable = any(p.is_nullable for p in class_info.properties)
    has_attribute = any(p.is_attribute for p in class_info.properties)
    has_element = any(not p.is_attribute and not p.is_xml_ignore for p in class_info.properties)
    has_wrapped_list = any(p.is_wrapped_list for p in class_info.properties)
    has_multi_element = any(p.xml_elements and len(p.xml_elements) > 1 for p in class_info.properties)
    has_json_ignore = any(p.is_json_ignore for p in class_info.properties)
    has_json_alias = any(p.json_aliases for p in class_info.properties)
    has_xml_transient = any(p.is_xml_ignore for p in class_info.properties)
    has_custom_json_prop = any(not p.is_json_ignore for p in class_info.properties) # Mostly true

    if has_nullable: imports.add("org.jetbrains.annotations.Nullable")
    if has_list:
        imports.add("java.util.List")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper")
    
    if any(p.type_name == "OffsetDateTime" for p in class_info.properties): imports.add("java.time.OffsetDateTime")
    if any(p.type_name == "BigDecimal" for p in class_info.properties): imports.add("java.math.BigDecimal")
    if any(p.type_name == "UUID" for p in class_info.properties): imports.add("java.util.UUID")
    
    if has_attribute: 
        imports.add("jakarta.xml.bind.annotation.XmlAttribute")
        
    if has_element:
        # JacksonXmlProperty is very common for elements to set localName
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty")
        imports.add("jakarta.xml.bind.annotation.XmlElement")

    if has_wrapped_list: imports.add("jakarta.xml.bind.annotation.XmlElementWrapper")
    if has_multi_element: imports.add("jakarta.xml.bind.annotation.XmlElements")
    if has_json_alias: imports.add("com.fasterxml.jackson.annotation.JsonAlias")
    if has_json_ignore: imports.add("com.fasterxml.jackson.annotation.JsonIgnore")
    if has_xml_transient: imports.add("jakarta.xml.bind.annotation.XmlTransient")
    if has_custom_json_prop: imports.add("com.fasterxml.jackson.annotation.JsonProperty")
    if has_attribute: imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty")


    for imp in sorted(imports): lines.append(f"import {imp};")
    lines.append("")
    
    if class_info.description:
        lines.append("/**")
        for line in class_info.description.split("\n"): lines.append(f" * {line.strip('* ')}")
        lines.append(" */")
    
    if class_info.is_root:
        lines.append(f'@XmlRootElement(name = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
        lines.append(f'@JacksonXmlRootElement(localName = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
    
    if class_info.discriminator:
        lines.append(f'@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "{class_info.discriminator}")')
        if class_info.subtypes:
            subtypes_str = ",\n    ".join([f'@JsonSubTypes.Type(value = {st_type}.class, name = "{st_name}")' for st_type, st_name in class_info.subtypes])
            lines.append(f'@JsonSubTypes({{\n    {subtypes_str}\n}})')

    if prop_order_str:
        lines.append(f'@XmlType(name = "{class_info.name}"{prop_order_str})')
    else:
        lines.append("@XmlType")

    lines.append("@XmlAccessorType(XmlAccessType.FIELD)")
    lines.append("@JsonIgnoreProperties(ignoreUnknown = true)")
    lines.append("@JsonInclude(JsonInclude.Include.NON_EMPTY)")
    
    extends_clause = f" extends {class_info.parent_class}" if class_info.parent_class else ""
    lines.append(f"public class {class_info.name}{extends_clause} {{")
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
            ns_attr = f', namespace = "{prop.xml_namespace}"' if prop.xml_namespace else ""
            lines.append(f'    @XmlAttribute(name = "{prop.xml_element_name}"{ns_attr})')
            lines.append(f'    @JacksonXmlProperty(isAttribute = true, localName = "{prop.xml_element_name}"{ns_attr})')
        else:
            # Handling for elements (single, list, wrapped list, polymorphic)
            ns = prop.xml_namespace or class_info.namespace
            if prop.is_wrapped_list:
                lines.append(f'    @XmlElementWrapper(name = "{prop.wrapper_name}", namespace = "{ns}")')
                lines.append(f'    @JacksonXmlElementWrapper(localName = "{prop.wrapper_name}", namespace = "{ns}")')

            if prop.xml_elements and len(prop.xml_elements) > 1:
                # Multiple elements (Choice / Polymorphism)
                lines.append("    @XmlElements({")
                for i, (el_name, el_type, el_ns) in enumerate(prop.xml_elements):
                    el_ns_val = el_ns if el_ns else ns
                    ns_attr = f', namespace = "{el_ns_val}"'
                    type_attr = f', type = {el_type}.class' if el_type else ""
                    comma = "," if i < len(prop.xml_elements) - 1 else ""
                    lines.append(f'        @XmlElement(name = "{el_name}"{ns_attr}{type_attr}){comma}')
                lines.append("    })")
            else:
                # Single element (or single-type list)
                lines.append(f'    @XmlElement(name = "{prop.xml_element_name}", namespace = "{ns}")')
                # For Jackson XML, use localName only if it's NOT a wrapped list (or if we want to override item name)
                lines.append(f'    @JacksonXmlProperty(localName = "{prop.xml_element_name}", namespace = "{ns}")')
                if prop.is_list and not prop.is_wrapped_list:
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
    
    lines.append("    /**")
    lines.append(f"     * Default constructor.")
    lines.append("     */")
    lines.append(f"    public {class_info.name}() {{}}")
    lines.append("")
    
    for prop in class_info.properties:
        field_name = prop.name[0].lower() + prop.name[1:]
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        
        lines.append("    /**")
        lines.append(f"     * Gets the value of the {prop.name} property.")
        lines.append(f"     * @return the value of the {prop.name} property")
        lines.append("     */")
        lines.append(f"    public {type_str} get{prop.name}() {{ return {field_name}; }}")
        
        lines.append("    /**")
        lines.append(f"     * Sets the value of the {prop.name} property.")
        lines.append(f"     * @param {field_name} the value to set")
        lines.append("     */")
        lines.append(f"    public void set{prop.name}({type_str} {field_name}) {{ this.{field_name} = {field_name}; }}")
        lines.append("")
    
    lines.append("}")
    return "\n".join(lines)

@dataclass
class MapperInfo:
    name: str
    enum_name: str
    entries: List[Tuple[str, str]]

def parse_mapper(file_path: Path) -> Optional[MapperInfo]:
    try:
        content = file_path.read_text(encoding="utf-8")
    except Exception:
        return None
    
    class_match = re.search(r"public\s+static\s+(?:partial\s+)?class\s+(\w+)", content)
    if not class_match: return None
    class_name = class_match.group(1)
    
    # Try to deduce Enum name from class name (e.g. GerichtCodeMapper -> GerichtCode)
    enum_name = class_name.replace("Mapper", "")
    
    # Find Dictionary
    # private static readonly Dictionary<string, GerichtCode> Map = new(StringComparer.OrdinalIgnoreCase)
    dict_match = re.search(r"Dictionary<string,\s*(\w+)>\s+Map\s*=", content)
    if dict_match:
         enum_name = dict_match.group(1)

    # Find entries
    # { "key", Enum.Value },
    entries = []
    
    start_pos = content.find("new(StringComparer.OrdinalIgnoreCase)")
    if start_pos == -1: 
        start_pos = content.find("Dictionary<string")
    
    if start_pos == -1: return None

    open_brace = content.find("{", start_pos)
    close_brace = content.find("};", open_brace)
    
    if open_brace == -1 or close_brace == -1: return None
    
    dict_body = content[open_brace+1:close_brace]
    
    # Remove comments
    dict_body = re.sub(r'//.*', '', dict_body)
    
    for line in dict_body.splitlines():
        line = line.strip()
        if not line: continue
        
        # Match { "key", Enum.Value } or { "key", Value }
        m = re.match(r'\{\s*"([^"]+)"\s*,\s*([^}]+)\s*\}', line)
        if m:
            key = m.group(1)
            val_raw = m.group(2).strip()
            # Clean val_raw (remove EnumName. prefix if present)
            if "." in val_raw:
                val = val_raw.split(".")[-1]
            else:
                val = val_raw
                
            entries.append((key, val))
            
    return MapperInfo(class_name, enum_name, entries)

def generate_mapper(info: MapperInfo, package: str) -> str:
    lines = [f"package {package};", ""]
    lines.append("import java.util.Collections;")
    lines.append("import java.util.HashMap;")
    lines.append("import java.util.Map;")
    lines.append("import java.util.Optional;")
    lines.append("")
    
    lines.append(f"public final class {info.name} {{")
    lines.append("")
    lines.append(f"    private static final Map<String, {info.enum_name}> MAP;")
    lines.append("")
    lines.append("    static {")
    lines.append(f"        Map<String, {info.enum_name}> map = new HashMap<>();")
    
    chunk_size = 500
    chunks = [info.entries[i:i + chunk_size] for i in range(0, len(info.entries), chunk_size)]
    
    for i, chunk in enumerate(chunks):
        lines.append(f"        init{i}(map);")
    
    lines.append("        MAP = Collections.unmodifiableMap(map);")
    lines.append("    }")
    lines.append("")
    
    for i, chunk in enumerate(chunks):
        lines.append(f"    private static void init{i}(Map<String, {info.enum_name}> map) {{")
        for key, val in chunk:
             safe_key = key.replace('"', '\\"')
             lines.append(f'        map.put("{safe_key}", {info.enum_name}.{val});')
             lines.append(f'        map.put("{safe_key}".toLowerCase(), {info.enum_name}.{val});')
        lines.append("    }")
        lines.append("")

    lines.append("    private "+ info.name +"() {}")
    lines.append("")
    lines.append("    /**")
    lines.append(f"     * Maps a string to {info.enum_name}.")
    lines.append("     * @param key the string to map")
    lines.append(f"     * @return the mapped {info.enum_name} or empty if not found")
    lines.append("     */")
    lines.append(f"    public static Optional<{info.enum_name}> map(String key) {{")
    lines.append("        if (key == null) return Optional.empty();")
    lines.append("        return Optional.ofNullable(MAP.get(key));")
    lines.append("    }")
    lines.append("")
    lines.append(f"    public static Optional<{info.enum_name}> mapIgnoreCase(String key) {{")
    lines.append("        if (key == null) return Optional.empty();")
    lines.append("        return Optional.ofNullable(MAP.get(key.toLowerCase()));")
    lines.append("    }")
    lines.append("}")
    return "\n".join(lines)

@dataclass
class CodeListInfo:
    name: str # e.g. GerichtCodeLists
    enum_name: str # e.g. GerichtCode
    versions: List[Tuple[str, str, List[str]]] # version_field_name (V3_6), version_val (3.6), items

def parse_codelists(file_path: Path) -> Optional[CodeListInfo]:
    try:
        content = file_path.read_text(encoding="utf-8")
    except Exception:
        return None

    class_match = re.search(r"public\s+(?:sealed\s+)?class\s+(\w+)\s*:", content)
    if not class_match: return None
    class_name = class_match.group(1)
    
    # Deduce enum name
    enum_name = class_name.replace("Lists", "")
    
    versions = []
    
    pos = 0
    while True:
        match = re.search(r'public\s+static\s+IVersionedCodeList<(\w+)>\s+(\w+)\s*\{\s*get;\s*\}\s*=\s*new\s+VersionedCodeList<\w+>\("([^"]+)"\)', content[pos:])
        if not match: break
        
        found_enum_name = match.group(1)
        version_field = match.group(2)
        version_val = match.group(3)
        
        enum_name = found_enum_name 
        
        match_end = pos + match.end()
        
        open_brace = content.find('{', match_end)
        if open_brace != -1:
             brace_count = 1
             i = open_brace + 1
             while i < len(content) and brace_count > 0:
                 if content[i] == '{': brace_count += 1
                 elif content[i] == '}': brace_count -= 1
                 i += 1
             
             if brace_count == 0:
                 list_body = content[open_brace+1 : i-1]
                 items = []
                 for line in list_body.splitlines():
                     line = line.strip()
                     if not line: continue
                     line = line.rstrip(',')
                     if "." in line:
                         items.append(line.split(".")[-1])
                     else:
                         items.append(line)
                 
                 versions.append((version_field, version_val, items))
                 pos = i
             else:
                 pos = match_end
        else:
            pos = match_end
            
    return CodeListInfo(class_name, enum_name, versions)

def generate_codelists(info: CodeListInfo, package: str) -> str:
    lines = [f"package {package};", ""]
    # lines.append("import java.util.Arrays;") # Optimization: Array not used
    lines.append("")
    lines.append(f"public final class {info.name} {{")
    lines.append("")
    lines.append(f"    private {info.name}() {{}}")
    lines.append("")
    
    for field_name, version_val, items in info.versions:
        lines.append(f'    public static final IVersionedCodeList<{info.enum_name}> {field_name};')
    
    lines.append("")
    lines.append("    static {")
    for field_name, version_val, items in info.versions:
        lines.append(f'        {field_name} = new VersionedCodeList<>("{version_val}");')
        
        chunk_size = 500
        chunks = [items[i:i + chunk_size] for i in range(0, len(items), chunk_size)]
        
        for i, chunk in enumerate(chunks):
            lines.append(f"        init{field_name}_{i}();")

    lines.append("    }")
    lines.append("")

    for field_name, version_val, items in info.versions:
         chunk_size = 500
         chunks = [items[i:i + chunk_size] for i in range(0, len(items), chunk_size)]
         for i, chunk in enumerate(chunks):
             lines.append(f"    private static void init{field_name}_{i}() {{")
             for item in chunk:
                 lines.append(f"        {field_name}.add({info.enum_name}.{item});")
             lines.append("    }")
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
    class_files = list(entities_path.rglob("*.cs"))
    for extra_path in OTHER_SOURCE_PATHS:
        class_files.extend((repo_root / extra_path).glob("*.cs"))

    # Process classes
    processed = 0
    errors = 0
    for cs_file in class_files:
        class_infos = parse_csharp_file(cs_file)
        for class_info in class_infos:
            try:
                java_code = generate_java_class(class_info, "de.xjustiz.core.models")
                (output_path / f"{class_info.name}.java").write_text(java_code, encoding="utf-8")
                processed += 1
            except Exception as e:
                print(f"Error processing {cs_file.name} / {class_info.name}: {e}")
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

    # Process code lists
    print("Step 4: Processing C# code lists...")
    list_files = list(codes_path.rglob("*CodeLists.cs"))
    for list_file in list_files:
        info = parse_codelists(list_file)
        if not info: continue
        try:
            java_code = generate_codelists(info, "de.xjustiz.core.models")
            (output_path / f"{info.name}.java").write_text(java_code, encoding="utf-8")
            processed += 1
        except Exception as e:
            print(f"Error processing code list {list_file.name}: {e}")
            errors += 1

    # Process mappers
    print("Step 5: Processing C# code mappers...")
    mapper_files = list(codes_path.rglob("*CodeMapper.cs"))
    for mapper_file in mapper_files:
        info = parse_mapper(mapper_file)
        if not info: continue
        try:
            java_code = generate_mapper(info, "de.xjustiz.core.models")
            (output_path / f"{info.name}.java").write_text(java_code, encoding="utf-8")
            processed += 1
        except Exception as e:
            print(f"Error processing mapper {mapper_file.name}: {e}")
            errors += 1
    
    print(f"\nDone! Processed {processed} files with {errors} errors.")

if __name__ == "__main__":
    main()

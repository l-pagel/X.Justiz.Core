#!/usr/bin/env python3
"""
Sync Java models from .NET models.
This script reads C# model classes and generates corresponding Java classes.
"""

import os
import re
import sys
from pathlib import Path
from dataclasses import dataclass, field
from typing import Optional

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

@dataclass
class PropertyInfo:
    name: str
    type_name: str
    is_nullable: bool
    is_list: bool
    xml_element_name: Optional[str] = None
    json_property_name: Optional[str] = None
    description: Optional[str] = None

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


def parse_csharp_file(file_path: Path) -> Optional[ClassInfo]:
    """Parse a C# file and extract class information."""
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
    
    class_info = ClassInfo(
        name=class_name,
        namespace="http://www.xjustiz.de",
        properties=[]
    )
    
    # Check for XmlRoot attribute
    root_match = re.search(r'\[XmlRoot\s*\(\s*"([^"]+)"', content)
    if root_match:
        class_info.is_root = True
        class_info.xml_root_name = root_match.group(1)
    
    # Extract class description from XML comments
    class_desc_match = re.search(r'///\s*<summary>\s*\n\s*///\s*(.+?)\s*\n\s*///\s*</summary>\s*\n[^/]*public\s+(?:partial\s+)?class', content, re.DOTALL)
    if class_desc_match:
        class_info.description = class_desc_match.group(1).strip()
    
    # Extract properties
    prop_pattern = re.compile(
        r'(?:///\s*<summary>\s*\n\s*///\s*(.+?)\s*\n\s*///\s*</summary>\s*\n)?'
        r'(?:\s*\[[^\]]+\]\s*\n)*'
        r'\s*\[Xml(?:Element|Attribute)\s*\(\s*"([^"]+)"[^\]]*\)\]'
        r'(?:\s*\[[^\]]+\]\s*\n)*'
        r'\s*public\s+(?:required\s+)?(\w+(?:<\w+>)?)\??\s+(\w+)\s*\{',
        re.MULTILINE
    )
    
    for match in prop_pattern.finditer(content):
        description = match.group(1)
        xml_name = match.group(2)
        type_name = match.group(3)
        prop_name = match.group(4)
        
        # Determine if nullable
        is_nullable = "?" in content[match.start():match.end()] or type_name.startswith("List<")
        
        # Check if it's a list
        is_list = type_name.startswith("List<")
        if is_list:
            inner_match = re.match(r"List<(\w+)>", type_name)
            if inner_match:
                type_name = inner_match.group(1)
        
        # Map type
        java_type = TYPE_MAPPINGS.get(type_name, type_name)
        
        prop_info = PropertyInfo(
            name=prop_name,
            type_name=java_type,
            is_nullable=is_nullable,
            is_list=is_list,
            xml_element_name=xml_name,
            json_property_name=prop_name,
            description=description
        )
        class_info.properties.append(prop_info)
    
    return class_info if class_info.properties else None


def generate_java_class(class_info: ClassInfo) -> str:
    """Generate Java class code from class info."""
    lines = []
    
    # Package declaration
    lines.append("package de.xjustiz.core.models;")
    lines.append("")
    
    # Imports
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
    
    if has_nullable:
        imports.add("org.jetbrains.annotations.Nullable")
    if has_list:
        imports.add("java.util.List")
        imports.add("com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper")
    if has_datetime:
        imports.add("java.time.OffsetDateTime")
    
    for imp in sorted(imports):
        lines.append(f"import {imp};")
    lines.append("")
    
    # Class Javadoc
    if class_info.description:
        lines.append("/**")
        lines.append(f" * {class_info.description}")
        lines.append(" */")
    
    # Class annotations
    if class_info.is_root and class_info.xml_root_name:
        lines.append(f'@XmlRootElement(name = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
        lines.append(f'@JacksonXmlRootElement(localName = "{class_info.xml_root_name}", namespace = "{class_info.namespace}")')
    
    lines.append("@XmlAccessorType(XmlAccessType.FIELD)")
    lines.append(f"public class {class_info.name} {{")
    lines.append("")
    
    # Fields
    for prop in class_info.properties:
        xml_name = prop.xml_element_name or to_camel_case(prop.name)
        json_name = prop.json_property_name or prop.name
        
        # Field annotations
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
    
    # Constructor
    lines.append(f"    public {class_info.name}() {{")
    lines.append("    }")
    lines.append("")
    
    # Getters and setters
    for prop in class_info.properties:
        field_name = to_camel_case(prop.name)
        type_str = f"List<{prop.type_name}>" if prop.is_list else prop.type_name
        
        # Getter
        if prop.is_nullable:
            lines.append("    @Nullable")
        lines.append(f"    public {type_str} get{prop.name}() {{")
        lines.append(f"        return {field_name};")
        lines.append("    }")
        lines.append("")
        
        # Setter
        nullable_param = "@Nullable " if prop.is_nullable else ""
        lines.append(f"    public void set{prop.name}({nullable_param}{type_str} {field_name}) {{")
        lines.append(f"        this.{field_name} = {field_name};")
        lines.append("    }")
        lines.append("")
    
    lines.append("}")
    lines.append("")
    
    return "\n".join(lines)


def to_camel_case(name: str) -> str:
    """Convert PascalCase to camelCase."""
    if not name:
        return name
    return name[0].lower() + name[1:]


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
        "removed": [],
        "errors": []
    }
    
    # Get existing Java files
    existing_java_files = {f.stem: f for f in java_path.glob("*.java")}
    generated_classes = set()
    
    # Process .NET files
    for cs_file in dotnet_path.glob("*.cs"):
        try:
            class_info = parse_csharp_file(cs_file)
            if not class_info:
                continue
            
            generated_classes.add(class_info.name)
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
            results["errors"].append(f"{cs_file.name}: {str(e)}")
    
    # Note: We don't remove files that don't have a .NET counterpart
    # as some Java files (like serializers) are hand-written
    
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

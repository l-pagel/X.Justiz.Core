import os
import re
import sys

# Paths
ROOT_DIR = os.getcwd()
MODELS_DIR = os.path.join(ROOT_DIR, "dotnet", "src", "xjustiz.core-dotnet", "Models")
DOC_FILE = os.path.join(ROOT_DIR, "Specification.md")

type_map = {} # name -> {'path': path, 'type': 'class'|'enum'}

def read_file_safe(path):
    for enc in ['utf-8-sig', 'utf-8', 'latin-1']:
        try:
            with open(path, 'r', encoding=enc) as f:
                return f.read()
        except UnicodeDecodeError:
            continue
    return ""

def find_types():
    for root, dirs, files in os.walk(MODELS_DIR):
        for file in files:
            if file.endswith(".cs"):
                path = os.path.join(root, file)
                content = read_file_safe(path)
                if not content: continue
                
                # Find classes
                class_matches = re.findall(r'public (?:(?:abstract|sealed|partial)\s+)?class\s+(\w+)', content)
                for class_name in class_matches:
                    type_map[class_name] = {'path': path, 'type': 'class'}
                
                # Find enums
                enum_matches = re.findall(r'public enum\s+(\w+)', content)
                for enum_name in enum_matches:
                    type_map[enum_name] = {'path': path, 'type': 'enum'}

def get_properties(class_name, visited_classes=None):
    if visited_classes is None:
        visited_classes = set()
    
    if class_name in visited_classes:
        return []
    visited_classes.add(class_name)

    if class_name not in type_map or type_map[class_name]['type'] != 'class':
        return []
    
    path = type_map[class_name]['path']
    content = read_file_safe(path)
    
    # Extract properties
    # Handles: public [new] Type Name { get; set; }
    # Added lookahead to avoid matching 'public class ...'
    props = re.findall(r'public\s+(?!class|enum|struct|interface)(?:new\s+)?([\w\<\>\[\]\?]+)\s+(\w+)\s+\{', content)
    
    # Handle inheritance
    base_match = re.search(r'class\s+' + re.escape(class_name) + r'\s*:\s*(\w+)', content)
    if base_match:
        base_class = base_match.group(1)
        if base_class not in ["object", "BaseEntity", "IRequest", "INotification"]:
             props += get_properties(base_class, visited_classes)
             
    return props

def resolve_type(t):
    # Strip nullable, arrays, and lists
    t = t.replace('?', '').replace('[]', '')
    list_match = re.search(r'List\<(\w+)\>', t)
    if list_match:
        return list_match.group(1)
    return t

# Start processing
find_types()

root_class = "UebermittlungSchriftgutobjekteNachricht"
if root_class not in type_map:
    print(f"Error: Root class {root_class} not found in {MODELS_DIR}")
    sys.exit(1)

to_visit = [root_class]
visited_recursion = set()
required_props = set() # (class, property)
required_types = set()

while to_visit:
    curr = to_visit.pop(0)
    if curr in visited_recursion or curr not in type_map:
        continue
    visited_recursion.add(curr)
    required_types.add(curr)
    
    if type_map[curr]['type'] == 'class':
        props = get_properties(curr)
        for p_type, p_name in props:
            # Exceptions for metadata/technical fields
            if p_name in ["SchemaLocation", "CodeForXml", "ListVersionId", "ListUri"]:
                continue
                
            required_props.add((curr, p_name))
            resolved = resolve_type(p_type)
            if resolved in type_map:
                to_visit.append(resolved)

# Parse Markdown
doc_props = set()
doc_types = set()

if not os.path.exists(DOC_FILE):
    print(f"Error: {DOC_FILE} not found")
    sys.exit(1)

content = read_file_safe(DOC_FILE)
lines = content.splitlines()
current_class = None
for line in lines:
    # Match class row: | **ClassName** | | [x] | ...
    class_match = re.match(r'\|\s*\*\*(\w+)\*\*\s*\|\s*\|\s*(?:x| )?\s*\|', line)
    if class_match:
        current_class = class_match.group(1)
        doc_types.add(current_class)
        continue
        
    # Match property row: | | Property: Name <br/> Type: Type | ...
    prop_match = re.match(r'\|\s*\|\s*Property:\s*(\w+)\s*<br/>', line)
    if prop_match and current_class:
        doc_props.add((current_class, prop_match.group(1)))

# Comparison
# Note: Enums are only required to have a class row. Classes are required to have both class row and property rows.

missing_types = sorted(list(required_types - doc_types))
missing_props = []

for c, p in required_props:
    if (c, p) not in doc_props:
        # Check if the class itself is documented as a Core version that inherited it
        # Actually, let's be strict for now.
        missing_props.append(f"{c}.{p}")

if missing_types or missing_props:
    print("Documentation verification FAILED!")
    if missing_types:
        print("\nMissing Types (Classes/Enums) in Markdown Headers:")
        for t in missing_types:
            print(f"  - {t}")
    if missing_props:
        print("\nMissing Properties in Markdown Rows:")
        for mp in sorted(missing_props):
            print(f"  - {mp}")
    sys.exit(1)

# Success reporting
print("Documentation verification PASSED!")
print("-" * 40)
print(f"Total documented types: {len(doc_types)}")
print(f"Total documented properties: {len(doc_props)}")
print("-" * 40)

print("\nList of documented types:")
for t in sorted(list(doc_types)):
    print(f"  [Type] {t}")

print("\nList of documented properties:")
for c, p in sorted(list(doc_props)):
    print(f"  [Prop] {c}.{p}")

print("-" * 40)
print("All reachable classes and properties are accounted for in Specification.md.")

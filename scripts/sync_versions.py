import json
import os

VERSIONS_FILE = "versions.json"
CHANGELOG_EN_FILE = "Changelog.md"
CHANGELOG_DE_FILE = "Changelog_DE.md"

def load_versions():
    with open(VERSIONS_FILE, 'r', encoding='utf-8') as f:
        return json.load(f)

def format_changelog_entry(entry, lang):
    version = entry['version']
    text = entry['changelog'][lang]
    # Ensure text is formatted as list items if it contains newlines? 
    # The JSON string: "Initial release\nOpen Beta Version"
    # The target MD: "- Initial release\n- Open Beta Version"
    # Or maybe the user enters bullet points in JSON? 
    # User Request: "german and english changelog (string)"
    # My JSON content: "Initial release\nOpen Beta Version"
    # I should probably split by newline and add "- " if not present.
    
    lines = text.split('\n')
    formatted_lines = []
    for line in lines:
        line = line.strip()
        if not line:
            continue
        if not line.startswith('- '):
            line = f"- {line}"
        formatted_lines.append(line)
    
    return version, '\n'.join(formatted_lines)

def generate_changelog_en(versions):
    content = ["## Changelog", ""]
    # Sort versions descending? Assuming JSON is already sorted or we sort it.
    # Semantic versioning sorting might be needed, but simple string sort might fail for 0.10.0 vs 0.2.0.
    # For now, assume JSON order is preserved or we rely on user order (top = latest).
    # Let's trust JSON order for now, assuming user puts new version at top.
    
    for entry in versions:
        ver, text = format_changelog_entry(entry, 'en')
        content.append(f"### Version {ver}")
        content.append("")
        content.append(text)
        content.append("")
        
    return "\n".join(content).strip() + "\n"

def generate_changelog_de(versions):
    content = ["# Änderungshistorie", ""]
    
    for entry in versions:
        ver, text = format_changelog_entry(entry, 'de')
        content.append(f"## Version {ver}") # German uses ## instead of ### in existing file
        content.append(text) # Existing file didn't have extra newline before text? "## Version 0.3.0\n- Java SDK..."
        content.append("")
        
    return "\n".join(content).strip() + "\n"

def main():
    if not os.path.exists(VERSIONS_FILE):
        print(f"Error: {VERSIONS_FILE} not found.")
        return

    versions = load_versions()
    
    # Generate EN
    changelog_en = generate_changelog_en(versions)
    with open(CHANGELOG_EN_FILE, 'w', encoding='utf-8') as f:
        f.write(changelog_en)
    print(f"Updated {CHANGELOG_EN_FILE}")

    # Generate DE
    changelog_de = generate_changelog_de(versions)
    with open(CHANGELOG_DE_FILE, 'w', encoding='utf-8') as f:
        f.write(changelog_de)
    print(f"Updated {CHANGELOG_DE_FILE}")


def get_latest_version(versions):
    if not versions:
        return None
    # Assuming the first one is the latest
    return versions[0]['version']

if __name__ == "__main__":
    import sys
    
    if len(sys.argv) > 1 and sys.argv[1] == "--get-latest":
        versions = load_versions()
        print(get_latest_version(versions))
        sys.exit(0)

    main()

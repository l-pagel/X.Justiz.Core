import sys
import os

def validate_changelog(version, changelog_path="Changelog.md"):
    if not os.path.exists(changelog_path):
        print(f"Error: {changelog_path} not found.")
        return False
    
    # We expect the format "### Version X.Y.Z"
    # Inspecting the current Changelog.md shows: "### Version 0.2.0"
    expected_header = f"### Version {version}"
    
    with open(changelog_path, 'r', encoding='utf-8') as f:
        content = f.read()
        
    if expected_header in content:
        print(f"Success: Version {version} found in {changelog_path}.")
        return True
    else:
        print(f"Error: Version {version} not found in {changelog_path}.")
        print(f"Expected header: '{expected_header}'")
        return False

if __name__ == "__main__":
    if len(sys.argv) < 2:
        print("Usage: python validate_changelog.py <version>")
        sys.exit(1)
        
    version = sys.argv[1]
    
    print(f"Validating version '{version}' in Changelog.md...")

    if not validate_changelog(version):
        sys.exit(1)

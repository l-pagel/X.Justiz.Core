# Project Guide: X.Justiz Core

## 1. Project Overview & Priorities
**X.Justiz Core** is a lightweight schema for data exchange in the legal ecosystem.
- **Main Goal**: Provide **high-quality class libraries (SDKs)** for different programming languages (.NET, Java) that facilitate the reading, mapping, and writing of X.Justiz and X.Justiz Core data.
- **Data Format Priority**: **XML First**, JSON Second. All models must support robust XML serialization/deserialization.
- **Source of Truth**: The **.NET SDK** (`sdk/dotnet`) is the master definition. All changes start there.
- **Mirrored SDKs**: Other languages (Java) are **generated/synced** from .NET via scripts (e.g., `generate-java-models.py`). Manual edits to generated files are forbidden.

## 2. Directory Structure
- `sdk/dotnet/src/xjustiz.core-dotnet/Models/`: **MASTER DATA MODELS**. Edit these files to make schema changes.
- `sdk/java/src/main/java/de/xjustiz/core/models/`: **DERIVED JAVA MODELS**. Do not edit manually.
- `scripts/generate-java-models.py`: **CRITICAL SCRIPT**. Generates Java models from C# models.
- `schemas/`: Generated XSDs and JSON schemas.
- `sdk/test-data/`: XML sample data (Arbeitsrecht, Verkehrsunfall, etc.).
- `docs/Specification.md`: The external documentation that MUST match the code.

## 3. Workflows

### 3.1. Modifying the Data Model
When adding fields, changing types, or fixing schema:
1.  **Modify C# Models** (`sdk/dotnet/...`):
    *   **Bilingual Documentation**: You MUST provide C# XML documentation (`<summary>`) in **English and German**.
    *   **Attributes**: Ensure `[XmlElement]`, `[JsonPropertyName]` are correct.
2.  **Update Specification**:
    *   **Sync Docs**: Immediately check `docs/Specification.md` (and `Specification_DE.md`) to reflect the changes. The documentation must stay in sync with the code.
3.  **Sync Java Models**:
    ```bash
    python scripts/generate-java-models.py
    ```
    *   If the output is wrong, **fix the script**, not the generated Java files.
4.  **Verify Parity**:
    ```bash
    cd sdk/java && ./gradlew test
    ```

### 3.2. Documentation Rules
- **Languages**: All written documentation (Markdown files) must be available in **English and German**.
- **Cross-linking**: English documents should link to German versions and vice-versa.
- **Content**: Documentation should provide descriptions, relevant sources, and insights, not just technical lists.

### 3.3. Test Data
- **Validation**: Verify all changes against `sdk/test-data/`.
- **Structure**: Maintain the folder structure in `sdk/test-data/`.

## 4. Agent Rules
1.  **Single Source of Truth**: Never edit Java models manually. Edit .NET, then regenerate.
2.  **XML First**: Prioritize valid XML output.
3.  **Doc Sync**: If you change the code model, you **MUST** update `Specification.md`.
4.  **Bilingual Summaries**: When writing model code, add `<summary>German Description / English Description</summary>`.

## 5. Code Styling & Git
- **Ignore Final Blank Lines**: It does not matter if a file ends with a blank line or not. Do not create a change (git diff) solely to fix this. Ignore it.

---
**Note**: This file is auto-injected. Use `view_file` to read referenced files.

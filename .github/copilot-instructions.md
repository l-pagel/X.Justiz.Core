# Copilot Instructions for X.Justiz Core

This document provides context and guidelines for AI assistants working on the X.Justiz Core project.

## Project Overview

**X.Justiz Core** is a lightweight, open-source schema for data exchange between software solutions in the German legal ecosystem. It is based on the established X.Justiz standard and optimizes it for out-of-court communication and modern LegalTech scenarios.

### Key Characteristics
- **Multi-language SDKs**: .NET (primary), Java, TypeScript/JavaScript (planned), Python (planned)
- **Format agnostic**: Supports both XML and JSON serialization
- **Bilingual documentation**: German and English
- **Compatibility**: Fully compatible with X.Justiz 3.2.1 through 3.6.2
- **Code lists**: Integrates standardized codes from [XRepository](https://www.xrepository.de/)

## Repository Structure

```
X.Justiz.Core/
├── .github/              # GitHub workflows and configurations
├── dotnet/               # .NET SDK (primary implementation)
│   ├── src/
│   │   ├── xjustiz.core-dotnet/           # Main SDK library
│   │   ├── xjustiz.core-dotnet.UnitTests/ # Unit tests
│   │   └── xjustiz.core-dotnet.XsdGenerator/ # XSD schema generator
│   └── example-api/      # Example ASP.NET Core API
├── java/                 # Java SDK
├── schemas/              # Generated JSON/XSD schemas
├── X.Justiz-Core-Versions/ # Versioned XSD schemas
├── X.Justiz-Versions/    # Archive of official X.Justiz versions
├── example-datasets/     # Sample data files
├── scripts/              # Build and verification scripts
├── docs/                 # Additional documentation
└── Specification.md      # Data model specification
```

## Technology Stack

### .NET SDK
- **Framework**: .NET 8.0
- **Key namespaces**:
  - `xjustiz.core_dotnet.Models` – Data model classes
  - `xjustiz.core_dotnet.Models.Codes` – Code lists (countries, roles, courts, etc.)
  - `xjustiz.core_dotnet.Util` – Utilities (validation, conversion, archiving)
- **Publishing**: NuGet package `xjustiz.core-dotnet`

### Java SDK
- **Build tool**: Gradle
- **Java version**: 17 (Temurin)
- **Publishing**: GitHub Packages

### CI/CD
- **Quality**: SonarCloud for code analysis
- **Workflows**: GitHub Actions (build, test, publish)

## Coding Conventions

### C# / .NET

The project uses a comprehensive `.editorconfig` with the following key rules:

- **Indentation**: 4 spaces
- **Braces**: New line before opening braces (Allman style)
- **Naming**:
  - Interfaces: `I` prefix (e.g., `ICodeListCollection`)
  - Types: PascalCase
  - Private fields: `_camelCase` with underscore prefix
- **Prefer**:
  - `var` for type-apparent declarations
  - Expression-bodied members when single-line
  - File-scoped namespaces
  - Pattern matching
  - Null-conditional operators (`?.`, `??`)
- **Analyzers**: StyleCop, CA rules, and custom diagnostics are enforced

### German Domain Terminology

The data model uses German property names reflecting the X.Justiz standard:
- `Akte` (File/Case)
- `Dokument` (Document)
- `Beteiligter` (Participant)
- `Nachrichtenkopf` (Message header)
- `Schriftgutobjekte` (Written records/documents)

Classes with `Core` suffix (e.g., `AkteCore`, `DokumentCore`) are X.Justiz Core extensions.

## Code Lists

Code lists are central to the data model. Key principles:

1. **Versioned**: Each code list has a `listVersionId` (e.g., `2024-08-01`)
2. **Immutable**: Use `IVersionedCodeList<T>` interface for immutability
3. **Bilingual**: All codes include German and English descriptions
4. **Sources**: Most derive from XRepository; Core-specific codes are project additions

Available code types:
- `StaatCode` (Country)
- `GerichtCode` (Court)
- `RollenCode` (Role)
- `DokumentklasseCode` (Document class)
- `AktentypCode` (File type)
- `BestandteiltypCode` (Component type)
- `GeschlechtCode` (Gender)
- `TelekommunikationsartCode` (Communication type)

## Testing Guidelines

- **Unit tests**: Located in `xjustiz.core-dotnet.UnitTests`
- **Test framework**: xUnit
- **Coverage**: OpenCover format for SonarCloud integration
- **Java tests**: JUnit 5

## Documentation Standards

1. **Bilingual**: Maintain both DE and EN versions of READMEs
2. **XML comments**: Use for public APIs in C#
3. **Specification.md**: Keep synchronized with model changes
4. **Changelog**: Update for all user-facing changes

## Common Tasks

### Adding a New Model Property
1. Add property to the appropriate class in `Models/`
2. Update the `Specification.md` table
3. Add XML serialization attributes if needed
4. Run documentation verification: `python scripts/verify_documentation.py`

### Adding a New Code List Entry
1. Locate the appropriate `*CodeLists.cs` file
2. Add entry to the versioned code list with bilingual descriptions
3. Follow existing patterns for code structure

### Generating XSDs
XSDs are auto-generated via the pipeline. Manual generation:
```bash
dotnet run --project dotnet/src/xjustiz.core-dotnet.XsdGenerator/xjustiz.core-dotnet.XsdGenerator.csproj -- "<workspace_path>"
```

## Quality Standards

- **SonarCloud**: All code must pass quality gate
- **Build warnings**: Treat as errors in Release builds
- **Test coverage**: Maintain high coverage for core functionality
- **No placeholders**: All code should be production-ready

## Links and Resources

- [GitHub Repository](https://github.com/l-pagel/X.Justiz.Core)
- [NuGet Package](https://www.nuget.org/packages/xjustiz.core-dotnet)
- [SonarCloud Dashboard](https://sonarcloud.io/dashboard?id=l-pagel_X.Justiz.Core)
- [XRepository (Code Lists)](https://www.xrepository.de/)
- [Official X.Justiz Standard](https://xjustiz.justiz.de/)
- [GitHub Discussions](https://github.com/l-pagel/X.Justiz.Core/discussions)

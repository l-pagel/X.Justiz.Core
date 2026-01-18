# SDK Generation Workflow

This document explains how the cross-language SDK generation works in this open-source project.

## Overview

The **.NET project** is the **source of truth** for all models. The Java SDK is automatically generated from a JSON Schema that is derived from the .NET models.

```
.NET Models → JSON Schema → Java Models
                    ↓
         Parity Tests Verify Match
```

## How It Works

### 1. Schema Generation

When .NET models change, the `XsdGenerator` project regenerates:
- XSD files (for XML validation)
- JSON Schema (`schemas/xjustiz-core.schema.json`)

### 2. Java SDK Generation

The Java models are generated from the JSON Schema using [jsonschema2pojo](https://www.jsonschema2pojo.org/).

**Pipeline:** Runs automatically on every push to `main`

**Manual:** Run locally with:
```powershell
./scripts/generate-java-models.ps1
```

### 3. Parity Verification

Automated tests verify that:
- All types defined in .NET exist in Java
- All properties have matching names and types
- Jackson annotations match the JSON Schema

If any discrepancy is found, the pipeline **fails**.

## For Contributors

### Changing Models

1. **Only modify .NET models** in `dotnet/src/xjustiz.core-dotnet/Models/`
2. Push your changes
3. The pipeline will regenerate Java models automatically
4. Parity tests will verify correctness

> ⚠️ **Never manually edit** files in `java/src/main/java/de/xjustiz/core/models/generated/`  
> They will be overwritten on the next pipeline run.

### Local Development

To regenerate Java models locally (requires Java 17+):

```powershell
./scripts/generate-java-models.ps1
```

The script will automatically download the jsonschema2pojo CLI tool on first run.

### Running Parity Tests

```bash
# .NET parity tests
dotnet test dotnet/test/xjustiz.core-dotnet.CrossSdkTests

# Java parity tests
cd java && ./gradlew test --tests "*SchemaParityTest*"
```

## Directory Structure

```
X.Justiz.Core/
├── dotnet/src/xjustiz.core-dotnet/     # Source of Truth
│   └── Models/                          # .NET models (edit here)
├── schemas/
│   └── xjustiz-core.schema.json        # Generated from .NET
├── java/src/main/java/de/xjustiz/core/
│   ├── models/generated/                # Auto-generated (don't edit)
│   └── serialization/                   # Hand-written utilities
└── scripts/
    └── generate-java-models.ps1         # Manual regeneration script
```
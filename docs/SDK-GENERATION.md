# SDK Generation Workflow

This document explains how cross-language SDK consistency is maintained in this open-source project.

## Overview

The **.NET project** is the **source of truth** for all models. The Java SDK models are manually maintained and verified against the generated JSON Schema to ensure parity.

```
.NET Models → JSON Schema
                    ↓
         Parity Tests Verify Java Matches
```

## How It Works

### 1. Schema Generation

When .NET models change, the `XsdGenerator` project regenerates:
- XSD files (for XML validation)
- JSON Schema (`schemas/xjustiz-core.schema.json`)

### 2. Java SDK

The Java models are manually crafted in `java/src/main/java/de/xjustiz/core/models/`.

Automated parity tests verify that Java models:
- Exist for all core types
- Have properties matching the JSON Schema
- Use correct Jackson annotations

### 3. Parity Verification

The pipeline runs:
- **Java `SchemaParityTest`** - Verifies Java models match the schema
- **Build & test** - Ensures all Java code compiles and tests pass

If any discrepancy is found, the pipeline **fails**.

## For Contributors

### Changing .NET Models

1. Modify .NET models in `dotnet/src/xjustiz.core-dotnet/Models/`
2. Push your changes
3. The pipeline regenerates the JSON Schema
4. **Manually update** the corresponding Java models if needed
5. Parity tests will fail if Java models don't match

### Changing Java Models

When adding/changing Java models, ensure they match the .NET models:
- Use matching property names (German)
- Add `@JsonProperty` annotations with exact property names
- Maintain type compatibility

### Running Parity Tests Locally

```bash
# Java parity tests (via Gradle)
cd java && gradle test --tests "*SchemaParityTest*"
```

## Directory Structure

```
X.Justiz.Core/
├── dotnet/src/xjustiz.core-dotnet/     # Source of Truth
│   └── Models/                          # .NET models (edit here)
├── schemas/
│   └── xjustiz-core.schema.json        # Generated from .NET
├── java/src/main/java/de/xjustiz/core/
│   ├── models/                          # Manual Java models
│   └── serialization/                   # Utilities
└── scripts/
    └── generate-java-models.ps1         # Optional helper script
```
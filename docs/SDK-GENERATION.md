# SDK Generation Workflow

> [!TIP]  
> **🌐 [Deutsche Version hier verfügbar](SDK-GENERATION_DE.md) 👈**


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

### Syncing Java Models from .NET

Use the sync script to automatically update Java models based on .NET models:

```powershell
python scripts/sync-java-models.py
```

The script will:
- Parse all C# model files in `dotnet/src/xjustiz.core-dotnet/Models/Entities/`
- Generate corresponding Java classes with proper annotations
- Report what was created, updated, or unchanged

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
│   ├── models/                          # Java models (synced from .NET)
│   └── serialization/                   # Hand-written utilities
└── scripts/
    └── sync-java-models.py              # Sync Java models from .NET
```

---

## See Also

- **[README](../README.md)** - Project overview
- **[Specification](Specification.md)** - Complete data model specification
- **[.NET SDK](../dotnet/README.md)** - .NET SDK documentation
- **[Java SDK](../java/README.md)** - Java SDK documentation
- **[Integration Tests](../dotnet/test/xjustiz.core-dotnet.IntegrationTests/README.md)** - Cross-platform testing
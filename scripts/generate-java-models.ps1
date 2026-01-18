# Regenerate Java models from JSON Schema
# Run this script from the repository root

param(
    [switch]$SkipSchemaGeneration
)

$ErrorActionPreference = "Stop"
$repoRoot = $PSScriptRoot | Split-Path -Parent

Write-Host "=== Java SDK Generation ===" -ForegroundColor Cyan

# Step 1: Regenerate JSON Schema from .NET (unless skipped)
if (-not $SkipSchemaGeneration) {
    Write-Host "Step 1: Regenerating JSON Schema from .NET models..." -ForegroundColor Yellow
    Push-Location $repoRoot
    dotnet run --project dotnet/src/xjustiz.core-dotnet.XsdGenerator -- .
    Pop-Location
} else {
    Write-Host "Step 1: Skipping schema generation (using existing schema)" -ForegroundColor Gray
}

# Step 2: Generate Java models from JSON Schema
Write-Host "Step 2: Generating Java models from JSON Schema..." -ForegroundColor Yellow

$schemaPath = Join-Path $repoRoot "schemas/xjustiz-core.schema.json"
$outputPath = Join-Path $repoRoot "java/src/main/java"

if (-not (Test-Path $schemaPath)) {
    Write-Error "JSON Schema not found at: $schemaPath"
    exit 1
}

# Use npx to run jsonschema2pojo
npx jsonschema2pojo `
    --source $schemaPath `
    --target $outputPath `
    --package de.xjustiz.core.models.generated `
    --annotation-style JACKSON2 `
    --include-jsr303-annotations `
    --date-time-type java.time.OffsetDateTime `
    --use-title-as-classname `
    --remove-old-output

if ($LASTEXITCODE -ne 0) {
    Write-Error "jsonschema2pojo failed"
    exit 1
}

Write-Host "Step 3: Java models generated successfully!" -ForegroundColor Green
Write-Host "Output: $outputPath/de/xjustiz/core/models/generated/" -ForegroundColor Gray

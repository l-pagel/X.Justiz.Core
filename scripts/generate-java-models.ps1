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
}
else {
    Write-Host "Step 1: Skipping schema generation (using existing schema)" -ForegroundColor Gray
}

# Step 2: Download jsonschema2pojo if not present
$toolDir = Join-Path $repoRoot ".tools"
$jsonschema2pojoDir = Join-Path $toolDir "jsonschema2pojo-1.2.2"
$jsonschema2pojoExe = Join-Path $jsonschema2pojoDir "bin\jsonschema2pojo.bat"

if (-not (Test-Path $jsonschema2pojoExe)) {
    Write-Host "Step 2: Downloading jsonschema2pojo CLI..." -ForegroundColor Yellow
    
    New-Item -ItemType Directory -Force -Path $toolDir | Out-Null
    
    $zipUrl = "https://github.com/joelittlejohn/jsonschema2pojo/releases/download/jsonschema2pojo-1.2.2/jsonschema2pojo-1.2.2.zip"
    $zipPath = Join-Path $toolDir "jsonschema2pojo.zip"
    
    Invoke-WebRequest -Uri $zipUrl -OutFile $zipPath
    Expand-Archive -Path $zipPath -DestinationPath $toolDir -Force
    Remove-Item $zipPath
    
    Write-Host "Downloaded jsonschema2pojo to: $jsonschema2pojoDir" -ForegroundColor Gray
}
else {
    Write-Host "Step 2: jsonschema2pojo already downloaded" -ForegroundColor Gray
}

# Step 3: Generate Java models from JSON Schema
Write-Host "Step 3: Generating Java models from JSON Schema..." -ForegroundColor Yellow

$schemaPath = Join-Path $repoRoot "schemas\xjustiz-core.schema.json"
$outputPath = Join-Path $repoRoot "java\src\main\java"

if (-not (Test-Path $schemaPath)) {
    Write-Error "JSON Schema not found at: $schemaPath"
    exit 1
}

# Run jsonschema2pojo with correct flags
& $jsonschema2pojoExe `
    --source $schemaPath `
    --target $outputPath `
    --package de.xjustiz.core.models.generated `
    --annotation-style JACKSON2 `
    --jsr303-annotations `
    --datetime-class java.time.OffsetDateTime `
    --use-title-as-classname `
    --useJakartaValidation

if ($LASTEXITCODE -ne 0) {
    Write-Error "jsonschema2pojo failed with exit code: $LASTEXITCODE"
    exit 1
}

Write-Host "Step 4: Java models generated successfully!" -ForegroundColor Green
Write-Host "Output: $outputPath\de\xjustiz\core\models\generated\" -ForegroundColor Gray

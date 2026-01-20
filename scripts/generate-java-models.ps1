# Regenerate Java models using the Python script
# This script is a wrapper around generate-java-models.py for integration in build routines

$ErrorActionPreference = "Stop"
$repoRoot = $PSScriptRoot | Split-Path -Parent
$pythonScript = Join-Path $PSScriptRoot "generate-java-models.py"

Write-Host "=== Java SDK Generation (via Python) ===" -ForegroundColor Cyan

# Check if python is available
if (-not (Get-Command "python" -ErrorAction SilentlyContinue)) {
    Write-Error "Python not found. Please ensure Python is installed and in your PATH."
    exit 1
}

# Run the python script
Push-Location $repoRoot
python $pythonScript $args
Pop-Location

if ($LASTEXITCODE -ne 0) {
    Write-Error "Java model generation failed."
    exit $LASTEXITCODE
}

Write-Host "Java models generated successfully!" -ForegroundColor Green

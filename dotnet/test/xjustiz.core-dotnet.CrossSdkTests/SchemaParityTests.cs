namespace xjustiz.core_dotnet.CrossSdkTests;

using System.Text.Json;

/// <summary>
/// Tests that verify Java SDK models match the .NET source of truth.
/// </summary>
public class SchemaParityTests
{
    private static readonly string RepoRoot = FindRepoRoot();
    private static readonly string SchemaPath = Path.Combine(RepoRoot, "schemas", "xjustiz-core.schema.json");
    private static readonly string JavaModelsPath = Path.Combine(RepoRoot, "java", "src", "main", "java", "de", "xjustiz", "core", "models");

    private static string FindRepoRoot()
    {
        var dir = Directory.GetCurrentDirectory();
        while (dir != null)
        {
            if (Directory.Exists(Path.Combine(dir, ".git")))
            {
                return dir;
            }
            dir = Directory.GetParent(dir)?.FullName;
        }
        throw new InvalidOperationException("Could not find repository root");
    }

    [Fact]
    public void JsonSchema_ShouldExist()
    {
        Assert.True(File.Exists(SchemaPath), 
            $"JSON Schema not found at: {SchemaPath}");
    }

    [Fact]
    public void JavaModelsDirectory_ShouldExist()
    {
        Assert.True(Directory.Exists(JavaModelsPath), 
            $"Java models directory not found at: {JavaModelsPath}");
    }

    [Fact]
    public void CoreJavaModelClasses_ShouldExist()
    {
        // Core model classes that should exist in Java SDK
        var expectedClasses = new[]
        {
            "Nachrichtenkopf",
            "Identifikation",
            "Akte",
            "Dokument",
            "NatuerlichePerson",
            "Beteiligter",
            "Geschlecht",
            "Staat",
            "Anschrift",
            "Schriftgutobjekte"
        };

        var missingClasses = expectedClasses
            .Where(className => !File.Exists(Path.Combine(JavaModelsPath, $"{className}.java")))
            .ToList();

        Assert.True(missingClasses.Count == 0,
            $"Missing Java model classes: {string.Join(", ", missingClasses)}");
    }

    [Fact]
    public void JavaNachrichtenkopf_ShouldHaveExpectedProperties()
    {
        var javaFilePath = Path.Combine(JavaModelsPath, "Nachrichtenkopf.java");

        if (!File.Exists(javaFilePath))
        {
            Assert.Fail("Nachrichtenkopf.java not found");
            return;
        }

        var javaContent = File.ReadAllText(javaFilePath);

        // Verify key properties exist with @JsonProperty annotations
        var expectedProperties = new[]
        {
            "Version",
            "AktenzeichenAbsender",
            "AktenzeichenEmpfaenger",
            "Erstellungszeitpunkt"
        };

        foreach (var prop in expectedProperties)
        {
            Assert.True(
                javaContent.Contains($"@JsonProperty(\"{prop}\")") ||
                javaContent.Contains($"private") && javaContent.Contains(ToCamelCase(prop)),
                $"Java Nachrichtenkopf should have property: {prop}");
        }
    }

    [Fact]
    public void SchemaProperties_ShouldMatchDotNetModel()
    {
        if (!File.Exists(SchemaPath))
        {
            Assert.Fail("JSON Schema not found");
            return;
        }

        var schemaJson = File.ReadAllText(SchemaPath);
        using var doc = JsonDocument.Parse(schemaJson);

        // Check root properties
        Assert.True(doc.RootElement.TryGetProperty("properties", out var properties),
            "Schema should have root properties");

        // Verify expected root properties exist
        Assert.True(properties.TryGetProperty("Kopf", out _), "Schema should have 'Kopf' property");
        Assert.True(properties.TryGetProperty("Grunddaten", out _), "Schema should have 'Grunddaten' property");
        Assert.True(properties.TryGetProperty("Schriftgutobjekte", out _), "Schema should have 'Schriftgutobjekte' property");
    }

    private static string ToCamelCase(string pascalCase)
    {
        if (string.IsNullOrEmpty(pascalCase))
            return pascalCase;
        return char.ToLowerInvariant(pascalCase[0]) + pascalCase[1..];
    }
}

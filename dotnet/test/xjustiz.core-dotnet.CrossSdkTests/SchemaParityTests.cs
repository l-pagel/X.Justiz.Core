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
    public void AllSchemaDefinitions_ShouldHaveCorrespondingJavaClass()
    {
        if (!File.Exists(SchemaPath))
        {
            Assert.Fail("JSON Schema not found. Run schema generation first.");
            return;
        }

        var schemaJson = File.ReadAllText(SchemaPath);
        using var doc = JsonDocument.Parse(schemaJson);
        
        if (!doc.RootElement.TryGetProperty("definitions", out var definitions))
        {
            // No definitions to check
            return;
        }

        var missingClasses = new List<string>();
        
        foreach (var definition in definitions.EnumerateObject())
        {
            var typeName = definition.Name;
            
            // Check for Java class in both generated and main models folders
            var generatedPath = Path.Combine(JavaModelsPath, "generated", $"{typeName}.java");
            var mainPath = Path.Combine(JavaModelsPath, $"{typeName}.java");
            
            if (!File.Exists(generatedPath) && !File.Exists(mainPath))
            {
                missingClasses.Add(typeName);
            }
        }

        Assert.True(missingClasses.Count == 0, 
            $"Missing Java classes for schema definitions: {string.Join(", ", missingClasses)}");
    }

    [Fact]
    public void JavaNachrichtenkopf_ShouldHaveExpectedProperties()
    {
        var javaFilePath = Path.Combine(JavaModelsPath, "Nachrichtenkopf.java");
        var generatedPath = Path.Combine(JavaModelsPath, "generated", "Nachrichtenkopf.java");
        
        var filePath = File.Exists(javaFilePath) ? javaFilePath : generatedPath;
        
        if (!File.Exists(filePath))
        {
            Assert.Fail("Nachrichtenkopf.java not found");
            return;
        }

        var javaContent = File.ReadAllText(filePath);
        
        // Verify key properties exist with @JsonProperty annotations
        var expectedProperties = new[]
        {
            "Version",
            "AktenzeichenAbsender",
            "AktenzeichenEmpfaenger",
            "Erstellungszeitpunkt",
            "Absender",
            "Empfaenger"
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

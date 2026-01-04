#pragma warning disable SA1200 // Using directives should be placed correctly
using System.Reflection;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;
#pragma warning restore SA1200 // Using directives should be placed correctly

if (args.Length == 0)
{
    Console.WriteLine("Please provide the repository root path as an argument.");
    return;
}

string repoRoot = args[0];
string outputBaseDir = Path.Combine(repoRoot, "X.Justiz-Core-Versions");

Console.WriteLine($"Repository Root: {repoRoot}");
Console.WriteLine($"Output Base Dir: {outputBaseDir}");

var modelAssembly = typeof(UebermittlungSchriftgutobjekteNachricht).Assembly;
var referencedVersions = GetReferencedVersions(modelAssembly);
var allVersions = Enum.GetValues<XJustizCoreVersion>();

var usedVersions = allVersions.Intersect(referencedVersions).OrderBy(v => v).ToList();
var unusedVersions = allVersions.Except(referencedVersions).OrderBy(v => v).ToList();

Console.WriteLine("--------------------------------------------------");
Console.WriteLine("Version Detection Summary:");
Console.WriteLine("--------------------------------------------------");
Console.WriteLine($"Total known versions in Enum: {allVersions.Length}");
Console.WriteLine($"Versions referenced in code:  {referencedVersions.Count}");
Console.WriteLine("--------------------------------------------------");
Console.WriteLine("DETECTED / TO BE GENERATED:");

foreach (var v in usedVersions)
{
    Console.WriteLine($" - {v}");
}

if (unusedVersions.Count != 0)
{
    Console.WriteLine("UNUSED / GHOST VERSIONS (Skipped):");
    foreach (var v in unusedVersions)
    {
        Console.WriteLine($" - {v}");
    }
}
else
{
    Console.WriteLine("No unused versions detected.");
}

Console.WriteLine("--------------------------------------------------");
Console.WriteLine(string.Empty);

foreach (var version in allVersions)
{
    if (referencedVersions.Contains(version))
    {
        GenerateXsdForVersion(version, outputBaseDir);
    }
    else
    {
        Console.WriteLine($"Skipping version {version} (No schema changes defined).");
    }
}

void GenerateXsdForVersion(XJustizCoreVersion version, string baseDir)
{
    Console.WriteLine($"Generating XSD for version {version}...");

    // Format folder name: "1.0.0" from "V1_0_0"
    string versionString = version.ToString().Replace("V", string.Empty).Replace("_", ".");
    string outputDir = Path.Combine(baseDir, versionString);
    Directory.CreateDirectory(outputDir);

    var overrides = CreateOverrides(version);
    var importer = new XmlReflectionImporter(overrides, XJustizConstants.Tns);
    var schemas = new XmlSchemas();
    var exporter = new XmlSchemaExporter(schemas);

    var mapping = importer.ImportTypeMapping(typeof(UebermittlungSchriftgutobjekteNachricht));
    exporter.ExportTypeMapping(mapping);

    // Post-process schemas if necessary (e.g. set schemaLocation for imports if we had them,
    // but mostly everything is in TNS or standard XML/XSI which we might want to handle).

    // Core models use TNS.

    foreach (System.Xml.Schema.XmlSchema schema in schemas)
    {
        if (schema.TargetNamespace == XJustizConstants.Tns)
        {
             string filename = $"XJustiz-Core_{versionString}.xsd";
             string outputPath = Path.Combine(outputDir, filename);

             using var writer = new StreamWriter(outputPath);
             schema.Write(writer);
             Console.WriteLine($"Written {outputPath}");
        }
    }
}

XmlAttributeOverrides CreateOverrides(XJustizCoreVersion targetVersion)
{
    var overrides = new XmlAttributeOverrides();
    var assembly = typeof(UebermittlungSchriftgutobjekteNachricht).Assembly;

    foreach (var type in assembly.GetTypes())
    {
        foreach (var prop in type.GetProperties())
        {
            var availability = prop.GetCustomAttribute<XJustizCoreAvailabilityAttribute>();
            if (availability != null)
            {
                if (!availability.IsAvailableIn(targetVersion))
                {
                    overrides.Add(type, prop.Name, new XmlAttributes { XmlIgnore = true });
                    // Console.WriteLine($"Ignoring {type.Name}.{prop.Name} (Not available in {targetVersion})");
                }
            }
        }
    }

    return overrides;
}

HashSet<XJustizCoreVersion> GetReferencedVersions(Assembly assembly)
{
    var versions = new HashSet<XJustizCoreVersion>();

    foreach (var type in assembly.GetTypes())
    {
        // Check Type
        CheckAttribute(type.GetCustomAttribute<XJustizCoreAvailabilityAttribute>());

        // Check Properties
        foreach (var prop in type.GetProperties())
        {
             CheckAttribute(prop.GetCustomAttribute<XJustizCoreAvailabilityAttribute>());
        }

        // Check Fields (for Enum members)
        foreach (var field in type.GetFields())
        {
             CheckAttribute(field.GetCustomAttribute<XJustizCoreAvailabilityAttribute>());
        }
    }

    // Always include the oldest version if nothing is found?
    // Or assume implicit baseline?
    // Usually code starts with *some* version.

    return versions;

    void CheckAttribute(XJustizCoreAvailabilityAttribute? attr)
    {
        if (attr == null)
        {
            return;
        }

        versions.Add(attr.IntroducedIn);

        // If 'Removed' is set (it's not min/default), then that version is also a pivot point.
        // Assuming 0 or some default value indicates "not removed".
        // The attribute helper logic often handles this, but here we access the property directly.
        // Let's assume the default raw value 0 or similar means not set.
        // However, looking at the Attribute definition, Removed returns (XJustizCoreVersion)RemovedRaw.
        // We catch everything that is a valid enum value distinct from "unspecified".

        if (Enum.IsDefined(attr.Removed))
        {
             versions.Add(attr.Removed);
        }
    }
}

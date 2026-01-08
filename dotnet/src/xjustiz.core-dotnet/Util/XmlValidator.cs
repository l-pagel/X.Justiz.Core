namespace xjustiz.core_dotnet.Util;

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Schema;
using xjustiz.core_dotnet.Util.Versioning;

public static class XmlValidator
{
    private static readonly System.Collections.Concurrent.ConcurrentDictionary<XJustizVersion, Lazy<(XmlSchemaSet, List<string>)>> SchemaCache = new();

    /// <summary>
    /// Validates an XML file against the X.Justiz XSD schemas for the specified version.
    /// </summary>
    /// <param name="xmlPath">The absolute path to the XML file.</param>
    /// <param name="version">The X.Justiz version to validate against.</param>
    /// <returns>A list of validation errors. Returns an empty list if the XML is valid.</returns>
    public static async Task<List<string>> ValidateAsync(string xmlPath, XJustizVersion version)
    {
        ArgumentNullException.ThrowIfNull(version);

        if (string.IsNullOrWhiteSpace(xmlPath))
        {
            throw new ArgumentNullException(nameof(xmlPath));
        }

        if (!File.Exists(xmlPath))
        {
            throw new FileNotFoundException("XML file not found", xmlPath);
        }

        using var stream = File.OpenRead(xmlPath);
        return await ValidateAsync(stream, version);
    }

    /// <summary>
    /// Validates an XML stream against the X.Justiz XSD schemas for the specified version.
    /// </summary>
    /// <param name="xmlStream">The stream containing the XML data. Can be a MemoryStream.</param>
    /// <param name="version">The X.Justiz version to validate against.</param>
    /// <returns>A list of validation errors. Returns an empty list if the XML is valid.</returns>
    public static async Task<List<string>> ValidateAsync(Stream xmlStream, XJustizVersion version)
    {
        ArgumentNullException.ThrowIfNull(xmlStream);

        if (version == XJustizVersion.None)
        {
            throw new ArgumentException("Version cannot be None", nameof(version));
        }

        // Get schemas from cache (optimizing performance by loading once)
        var lazyResult = SchemaCache.GetOrAdd(version, v => new Lazy<(XmlSchemaSet, List<string>)>(() => LoadSchemas(v)));
        var (schemaSet, loadErrors) = lazyResult.Value;

        var errors = new List<string>(loadErrors);

        var settings = new XmlReaderSettings
        {
            ValidationType = ValidationType.Schema,
            Schemas = schemaSet,
            Async = true,
        };

        settings.ValidationFlags |= XmlSchemaValidationFlags.ProcessInlineSchema;
        settings.ValidationFlags |= XmlSchemaValidationFlags.ReportValidationWarnings;

        settings.ValidationEventHandler += (sender, args) =>
        {
            errors.Add($"[{args.Severity}] Line {args.Exception.LineNumber}, Pos {args.Exception.LinePosition}: {args.Message}");
        };

        try
        {
            // Reset stream position if possible
            if (xmlStream.CanSeek)
            {
                xmlStream.Position = 0;
            }

            using var reader = XmlReader.Create(xmlStream, settings);
            while (await reader.ReadAsync())
            {
                // do nothing while checking for errors
            }
        }
        catch (XmlException ex)
        {
            errors.Add($"[Error] XML Parsing failed: {ex.Message}");
        }
        catch (Exception ex)
        {
            errors.Add($"[Error] Unexpected error during validation: {ex.Message}");
        }

        return errors;
    }

    private static (XmlSchemaSet, List<string>) LoadSchemas(XJustizVersion version)
    {
        var errors = new List<string>();
        var xsdDir = GetXsdDirectory(version);

        if (string.IsNullOrEmpty(xsdDir) || !Directory.Exists(xsdDir))
        {
            // We throw here, which will be cached as an exception by Lazy.
            throw new DirectoryNotFoundException($"Could not find XSD directory for version {version}. Checked path: {xsdDir ?? "null"}");
        }

        var schemas = new XmlSchemaSet();

        // Load all XSD files from the directory.
        // Adding all schemas allows the validator to resolve any root element found in the XML,
        // as well as internal dependencies (imports/includes) which are resolved by relative paths.
        var xsdFiles = Directory.GetFiles(xsdDir, "*.xsd", SearchOption.AllDirectories);

        foreach (var xsdFile in xsdFiles)
        {
            try
            {
                schemas.Add(null, xsdFile);
            }
            catch (Exception ex)
            {
                // If a schema fails to load individually (e.g. due to missing dependencies not yet added),
                // we log it but continue. XmlSchemaSet is resilient; if the dependency is added later or found via relative path
                // during the add of another schema, it usually works out.
                // However, 'Add' with a file path sets BaseUri, so imports should work immediately.
                // If it fails, it's likely a malformed XSD or a missing file that shouldn't be missing.
                errors.Add($"[Warning] Failed to load schema {Path.GetFileName(xsdFile)}: {ex.Message}");
            }
        }

        try
        {
            schemas.Compile();
        }
        catch (Exception ex)
        {
            errors.Add($"[Error] Schema compilation failed: {ex.Message}");
        }

        return (schemas, errors);
    }

    private static string? GetXsdDirectory(XJustizVersion version)
    {
        // Convert Enum V3_4_1 -> 3.4.1
        var versionStr = version.ToString()[1..].Replace('_', '.');

        // Find the X.Justiz-Versions directory by traversing up from the base directory
        var currentDir = new DirectoryInfo(AppDomain.CurrentDomain.BaseDirectory);
        DirectoryInfo? xjustizVersionsRoot = null;

        while (currentDir != null)
        {
            // Check if "X.Justiz-Versions" exists in this directory
            var check = Path.Combine(currentDir.FullName, "X.Justiz-Versions");
            if (Directory.Exists(check))
            {
                xjustizVersionsRoot = new DirectoryInfo(check);
                break;
            }

            currentDir = currentDir.Parent;
        }

        if (xjustizVersionsRoot == null)
        {
            return null;
        }

        var versionSpecificDir = Path.Combine(xjustizVersionsRoot.FullName, versionStr);
        if (!Directory.Exists(versionSpecificDir))
        {
            return null;
        }

        // Inside the version directory, find the folder that contains "XSD" (e.g. "XJustiz 3.4.1 XSD")
        var xsdDirs = Directory.GetDirectories(versionSpecificDir, "*XSD");
        return xsdDirs.FirstOrDefault();
    }
}

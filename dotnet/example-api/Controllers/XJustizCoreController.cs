namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Converter;
using xjustiz.core_dotnet.Util.Versioning;
using static xjustiz.core_dotnet.Util.Versioning.CompatibilityChecker;

/// <summary>
/// Controller for X.Justiz Core operations.
/// </summary>
[ApiController]
[Route("[controller]")]
public class XJustizCoreController : ControllerBase
{
    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in JSON format.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The message payload to process.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    [HttpPost("json")]
    [ProducesResponseType(typeof(CompatibilityResult), StatusCodes.Status200OK)]
    public IActionResult SendXJustizCoreJson(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht)
    {
        var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
        return Ok(compatibilityResult);
    }

    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in XML format.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The message payload to process.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    [HttpPost("xml")]
    [Consumes("application/xml")]
    [ProducesResponseType(typeof(CompatibilityResult), StatusCodes.Status200OK)]
    public IActionResult SendXJustizCoreXml([FromBody] UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht)
    {
        var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
        return Ok(compatibilityResult);
    }

    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht from a JSON file.
    /// </summary>
    /// <param name="file">The JSON file containing the message payload.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    /// <response code="400">If the file is empty or invalid.</response>
    [HttpPost("json-file")]
    [Consumes("multipart/form-data")]
    [ProducesResponseType(typeof(CompatibilityResult), StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> SendXJustizCoreJsonFile(IFormFile file)
    {
        if (file == null || file.Length == 0)
        {
            return BadRequest("File is empty.");
        }

        var jsonSerializerOptions = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true,
        };

        var options = jsonSerializerOptions;
        options.Converters.Add(new JsonStringEnumConverter());

        try
        {
            var uebermittlungSchriftgutobjekteNachricht = await JsonSerializer.DeserializeAsync<UebermittlungSchriftgutobjekteNachricht>(file.OpenReadStream(), options);

            if (uebermittlungSchriftgutobjekteNachricht == null)
            {
                return BadRequest("Could not deserialize JSON.");
            }

            var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
            return Ok(compatibilityResult);
        }
        catch (JsonException ex)
        {
            return BadRequest($"Invalid JSON: {ex.Message}");
        }
    }

    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht from an XML file.
    /// </summary>
    /// <param name="file">The XML file containing the message payload.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    /// <response code="400">If the file is empty or invalid.</response>
    [HttpPost("xml-file")]
    [Consumes("multipart/form-data")]
    [ProducesResponseType(typeof(CompatibilityResult), StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public IActionResult SendXJustizCoreXmlFile(IFormFile file)
    {
        if (file == null || file.Length == 0)
        {
            return BadRequest("File is empty.");
        }

        var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));

        try
        {
            using var stream = file.OpenReadStream();
            var uebermittlungSchriftgutobjekteNachricht = (UebermittlungSchriftgutobjekteNachricht?)serializer.Deserialize(stream);

            if (uebermittlungSchriftgutobjekteNachricht == null)
            {
                return BadRequest("Could not deserialize XML.");
            }

            var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
            return Ok(compatibilityResult);
        }
        catch (InvalidOperationException ex)
        {
            return BadRequest($"Invalid XML: {ex.Message}");
        }
    }

    /// <summary>
    /// Generates a JSON file in the specified XJustiz-Core version from the provided body.
    /// </summary>
    /// <param name="version">Target XJustiz-Core version.</param>
    /// <param name="message">The message payload to convert.</param>
    /// <returns>A JSON file download.</returns>
    [HttpPost("json/generate-file")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public IActionResult GenerateJsonFile([FromQuery] XJustizCoreVersion version, [FromBody] UebermittlungSchriftgutobjekteNachricht message)
    {
        if (message == null)
        {
            return BadRequest("No message provided in body.");
        }

        return ProcessJsonGeneration(message, version);
    }

    /// <summary>
    /// Generates a JSON file in the specified XJustiz-Core version from a sample dataset.
    /// </summary>
    /// <param name="dataset">The name of the sample dataset.</param>
    /// <param name="version">Target XJustiz-Core version.</param>
    /// <returns>A JSON file download.</returns>
    [HttpGet("json/generate-file/sample/{dataset}")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> GenerateJsonSampleFile(DatasetType dataset, [FromQuery] XJustizCoreVersion version)
    {
        var sourceMessage = await GetSampleMessageAsync(dataset, isXml: false);
        if (sourceMessage == null)
        {
            return BadRequest($"Sample dataset '{dataset}' not found.");
        }

        return ProcessJsonGeneration(sourceMessage, version);
    }

    /// <summary>
    /// Generates an XML file in the specified XJustiz-Core version from the provided body.
    /// </summary>
    /// <param name="version">Target XJustiz-Core version.</param>
    /// <param name="message">The message payload to convert.</param>
    /// <returns>An XML file download.</returns>
    [HttpPost("xml/generate-file")]
    [Consumes("application/xml", "application/json")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public IActionResult GenerateXmlFile([FromQuery] XJustizCoreVersion version, [FromBody] UebermittlungSchriftgutobjekteNachricht message)
    {
        if (message == null)
        {
            return BadRequest("No message provided in body.");
        }

        return ProcessXmlGeneration(message, version);
    }

    /// <summary>
    /// Generates an XML file in the specified XJustiz-Core version from a sample dataset.
    /// </summary>
    /// <param name="dataset">The name of the sample dataset.</param>
    /// <param name="version">Target XJustiz-Core version.</param>
    /// <returns>An XML file download.</returns>
    [HttpGet("xml/generate-file/sample/{dataset}")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> GenerateXmlSampleFile(DatasetType dataset, [FromQuery] XJustizCoreVersion version)
    {
        var sourceMessage = await GetSampleMessageAsync(dataset, isXml: true);
        if (sourceMessage == null)
        {
            return BadRequest($"Sample dataset '{dataset}' not found.");
        }

        return ProcessXmlGeneration(sourceMessage, version);
    }

    private IActionResult ProcessJsonGeneration(UebermittlungSchriftgutobjekteNachricht message, XJustizCoreVersion version)
    {
        var converted = XJustizConverter.Convert(message, version).Result;
        if (converted == null)
        {
            return BadRequest("Conversion failed.");
        }

        var jsonSerializerOptions = new JsonSerializerOptions
        {
            WriteIndented = true,
            DefaultIgnoreCondition = JsonIgnoreCondition.WhenWritingNull,
        };

        var options = jsonSerializerOptions;
        options.Converters.Add(new JsonStringEnumConverter());

        var json = JsonSerializer.Serialize(converted, options);
        var bytes = System.Text.Encoding.UTF8.GetBytes(json);

        return File(bytes, "application/json", $"akte_{version}.json");
    }

    private IActionResult ProcessXmlGeneration(UebermittlungSchriftgutobjekteNachricht message, XJustizCoreVersion version)
    {
        var converted = XJustizConverter.Convert(message, version).Result;
        if (converted == null)
        {
            return BadRequest("Conversion failed.");
        }

        using var ms = new MemoryStream();
        var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
        var ns = new XmlSerializerNamespaces();
        ns.Add(string.Empty, XJustizConstants.Tns);
        ns.Add("xsi", XJustizConstants.Xsi);

        var settings = new XmlWriterSettings { Indent = true, Encoding = System.Text.Encoding.UTF8 };
        using (var writer = XmlWriter.Create(ms, settings))
        {
            serializer.Serialize(writer, converted, ns);
        }

        return File(ms.ToArray(), "application/xml", $"akte_{version}.xml");
    }

    private static async Task<UebermittlungSchriftgutobjekteNachricht?> GetSampleMessageAsync(DatasetType dataset, bool isXml)
    {
        var datasetName = dataset.ToString().ToLower();
        var ext = isXml ? "xml" : "json";
        var path = Path.Combine(AppContext.BaseDirectory, "..", "..", "..", "..", "..", "example-datasets", $"{datasetName}.{ext}");

        if (!System.IO.File.Exists(path))
        {
            path = Path.Combine(Directory.GetCurrentDirectory(), "example-datasets", $"{datasetName}.{ext}");
        }

        if (System.IO.File.Exists(path))
        {
            using var stream = System.IO.File.OpenRead(path);
            if (isXml)
            {
                var serializer = new XmlSerializer(typeof(UebermittlungSchriftgutobjekteNachricht));
                return (UebermittlungSchriftgutobjekteNachricht?)serializer.Deserialize(stream);
            }
            else
            {
                var jsonSerializerOptions = new JsonSerializerOptions { PropertyNameCaseInsensitive = true };
                var options = jsonSerializerOptions;

                options.Converters.Add(new JsonStringEnumConverter());
                return await JsonSerializer.DeserializeAsync<UebermittlungSchriftgutobjekteNachricht>(stream, options);
            }
        }

        return null;
    }
}
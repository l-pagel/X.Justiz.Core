namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using xjustiz.core_dotnet.Models;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Xml.Serialization;

/// <summary>
/// Controller for X.Justiz Core operations.
/// </summary>
[ApiController]
[Route("[controller]")]
public class XJustizCoreController() : ControllerBase
{
    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in JSON format.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The message payload to process.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    [HttpPost("json")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    public IActionResult SendXJustizCoreJson(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht)
    {
        var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
        return new OkObjectResult(compatibilityResult);
    }

    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht in XML format.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The message payload to process.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    [HttpPost("xml")]
    [Consumes("application/xml")]
    [ProducesResponseType(StatusCodes.Status200OK)]
    public IActionResult SendXJustizCoreXml([FromBody] UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht)
    {
        var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
        return new OkObjectResult(compatibilityResult);
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
    [ProducesResponseType(StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> SendXJustizCoreJsonFile(IFormFile file)
    {
        if (file == null || file.Length == 0)
        {
            return BadRequest("File is empty.");
        }

        var jsonSerializerOptions = new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
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
            return new OkObjectResult(compatibilityResult);
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
    [ProducesResponseType(StatusCodes.Status200OK)]
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
            return new OkObjectResult(compatibilityResult);
        }
        catch (InvalidOperationException ex)
        {
            return BadRequest($"Invalid XML: {ex.Message}");
        }
    }
}

namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Util;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Controller for X.Justiz Core operations.
/// </summary>
[ApiController]
[Route("[controller]")]
public class XJustizCoreController() : ControllerBase
{
    /// <summary>
    /// Checks compatibility and processes a UebermittlungSchriftgutobjekteNachricht.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The message payload to process.</param>
    /// <returns>The compatibility result of the message.</returns>
    /// <response code="200">Returns the compatibility result.</response>
    [HttpPost]
    [ProducesResponseType(StatusCodes.Status200OK)]
    public IActionResult SendXJustizCore(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht)
    {
        var compatibilityResult = uebermittlungSchriftgutobjekteNachricht.GetCompatibility();
        return new OkObjectResult(compatibilityResult);
    }
}

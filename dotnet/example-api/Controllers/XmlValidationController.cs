namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using xjustiz.core_dotnet.Util;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Controller for validating X.Justiz XML files.
/// </summary>
[ApiController]
[Route("[controller]")]
public class XmlValidationController : ControllerBase
{
    /// <summary>
    /// Validates an X.Justiz XML file against a specific version.
    /// </summary>
    /// <param name="file">The XML file to validate.</param>
    /// <param name="xJustizVersion">The X.Justiz version to validate against.</param>
    /// <returns>A success message if valid, or a list of validation errors if invalid.</returns>
    /// <response code="200">Returns if the validation succeeded.</response>
    /// <response code="400">Returns if the validation failed with errors.</response>
    [HttpPost("validate/xjustiz")]
    [ProducesResponseType(typeof(string), StatusCodes.Status200OK)]
    [ProducesResponseType(typeof(List<string>), StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> ValidateXJustizAsync(IFormFile file, XJustizVersion xJustizVersion)
    {
        var memoryStream = new MemoryStream();
        await file.CopyToAsync(memoryStream);
        memoryStream.Position = 0;

        var validationResult = await XmlValidator.ValidateAsync(memoryStream, xJustizVersion);

        return validationResult.Count != 0
            ? new BadRequestObjectResult(validationResult)
            : this.Ok($"Validation succeeded for X.Justiz version {xJustizVersion}.");
    }
}

namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using xjustiz.core_dotnet.Util;
using xjustiz.core_dotnet.Util.Versioning;

[ApiController]
[Route("[controller]")]
public class XmlValidationController() : ControllerBase
{
    [HttpGet("validate/xjustiz")]
    public async Task<IActionResult> ValidateXJustizAsync(IFormFile file, XJustizVersion xJustizVersion)
    {
        var memoryStream = new MemoryStream();
        await file.CopyToAsync(memoryStream);
        memoryStream.Position = 0;

        var validationResult = await XmlValidator.ValidateAsync(memoryStream, xJustizVersion);

        return validationResult.Count != 0
            ? new BadRequestObjectResult(validationResult)
            : Ok($"Validation succeeded for X.Justiz version {xJustizVersion}.");
    }
}

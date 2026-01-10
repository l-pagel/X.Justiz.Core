// <copyright file="ConversionController.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace example_api.Controllers;

using Microsoft.AspNetCore.Mvc;
using xjustiz.core_dotnet.Models;
using xjustiz.core_dotnet.Util.Converter;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Controller for converting X.Justiz and X.Justiz Core versions.
/// </summary>
[ApiController]
[Route("[controller]")]
public class ConversionController : ControllerBase
{
    /// <summary>
    /// Converts to the requested xJustizVersion.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The original object to convert.</param>
    /// <param name="xJustizVersion">Target converion version.</param>
    /// <returns>The converted object and a report about lost data.</returns>
    [HttpPost("to-xjustiz")]
    [ProducesResponseType(typeof(ConversionResult), StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> ConvertToXJustizAsync(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht, XJustizVersion xJustizVersion)
    {
        var conversionResult = XJustizConverter.Convert(uebermittlungSchriftgutobjekteNachricht, xJustizVersion);
        return this.Ok(conversionResult);
    }

    /// <summary>
    /// Converts to the requested xJustizVersion.
    /// </summary>
    /// <param name="uebermittlungSchriftgutobjekteNachricht">The original object to convert.</param>
    /// <param name="xJustizCoreVersion">Target converion version.</param>
    /// <returns>The converted object and a report about lost data.</returns>
    [HttpPost("to-xjustizcore")]
    [ProducesResponseType(typeof(ConversionResult), StatusCodes.Status200OK)]
    [ProducesResponseType(StatusCodes.Status400BadRequest)]
    public async Task<IActionResult> ConvertToXJustizCoreAsync(UebermittlungSchriftgutobjekteNachricht uebermittlungSchriftgutobjekteNachricht, XJustizCoreVersion xJustizCoreVersion)
    {
        var conversionResult = XJustizConverter.Convert(uebermittlungSchriftgutobjekteNachricht, xJustizCoreVersion);
        return this.Ok(conversionResult);
    }
}

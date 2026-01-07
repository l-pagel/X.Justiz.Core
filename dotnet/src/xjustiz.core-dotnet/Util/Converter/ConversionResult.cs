namespace xjustiz.core_dotnet.Util.Converter;

using System.Collections.Generic;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Result of the conversion process.
/// </summary>
public class ConversionResult
{
    /// <summary>
    /// Gets or sets the converted object.
    /// </summary>
    public UebermittlungSchriftgutobjekteNachricht? Result { get; set; }

    /// <summary>
    /// Gets or sets the list of data lost during conversion.
    /// </summary>
    public List<string> LostData { get; set; } = [];
}

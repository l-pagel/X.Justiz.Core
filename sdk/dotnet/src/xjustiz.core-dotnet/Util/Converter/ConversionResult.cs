namespace xjustiz.core_dotnet.Util.Converter;

using System.Collections.Generic;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Ergebnis des Konvertierungsvorgangs.<br/>
/// <u><b>Conversion result:</b></u> Result of the conversion process.
/// </summary>
public class ConversionResult
{
    /// <summary>
    /// Ruft das konvertierte Objekt ab oder legt dieses fest.<br/>
    /// <u><b>Result:</b></u> Gets or sets the converted object.
    /// </summary>
    public UebermittlungSchriftgutobjekteNachricht? Result { get; set; }

    /// <summary>
    /// Ruft die Liste der während der Konvertierung verlorenen Daten ab oder legt diese fest.<br/>
    /// <u><b>Lost data:</b></u> Gets or sets the list of data lost during conversion.
    /// </summary>
    public List<string> LostData { get; set; } = [];
}
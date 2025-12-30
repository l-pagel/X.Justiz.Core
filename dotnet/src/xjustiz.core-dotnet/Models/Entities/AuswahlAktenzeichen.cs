namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.
/// Selection structure for file references.
/// </summary>
[XJustizAvailability(XJustizVersion.Unknown)]
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.
    /// The complete file reference can be transmitted here as unstructured free text.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string? Freitext { get; set; }
}

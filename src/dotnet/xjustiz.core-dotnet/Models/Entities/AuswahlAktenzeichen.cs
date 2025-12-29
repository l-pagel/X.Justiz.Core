namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.
/// Selection structure for file references.
/// </summary>
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.
    /// The complete file reference can be transmitted here as unstructured free text.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Freitext { get; set; }
}

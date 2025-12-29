namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.
/// Selection structure for file references.
/// </summary>
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Das Aktenzeichen als Freitext.
    /// The file reference as free text.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Freitext { get; set; }
}

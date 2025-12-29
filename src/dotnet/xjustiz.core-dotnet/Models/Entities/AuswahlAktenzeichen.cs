namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Aktenzeichen.
/// </summary>
public class AuswahlAktenzeichen
{
    /// <summary>
    /// Hier kann das vollständige Aktenzeichen als unstrukturierter Freitext übermittelt werden.
    /// </summary>
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Freitext { get; set; }
}

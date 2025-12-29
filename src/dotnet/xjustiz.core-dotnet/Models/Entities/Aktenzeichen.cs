namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert ein Aktenzeichen.
/// </summary>
public class Aktenzeichen
{
    /// <summary>
    /// Auswahlstruktur für Aktenzeichen.
    /// </summary>
    [XmlElement("auswahl_aktenzeichen", Namespace = XJustizExport.Tns, Order = 1)]
    public AuswahlAktenzeichen Auswahl { get; set; } = new();
}

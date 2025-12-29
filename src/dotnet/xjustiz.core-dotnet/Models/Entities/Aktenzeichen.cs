namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert ein Aktenzeichen.
/// Represents a file reference / case number.
/// </summary>
public class Aktenzeichen
{
    /// <summary>
    /// Auswahlstruktur für Aktenzeichen.
    /// Selection structure for file references.
    /// </summary>
    [XmlElement("auswahl_aktenzeichen", Namespace = XJustizExport.Tns, Order = 1)]
    public AuswahlAktenzeichen Auswahl { get; set; } = new();
}

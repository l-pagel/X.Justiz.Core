namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert ein Aktenzeichen.
/// Represents a file reference / case number.
/// </summary>
public class Aktenzeichen
{
    /// <summary>
    /// Die Auswahl eines spezifischen Aktenzeichentyps.
    /// The selection of a specific file reference type.
    /// </summary>
    [XmlElement("auswahl_aktenzeichen", Namespace = XJustizExport.Tns, Order = 1)]
    public AuswahlAktenzeichen Auswahl { get; set; } = new();
}

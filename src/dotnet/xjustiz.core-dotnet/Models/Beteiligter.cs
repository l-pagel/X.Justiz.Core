namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert einen Beteiligten im Verfahren.
/// Represents a participant in the proceeding.
/// </summary>
public class Beteiligter
{
    /// <summary>
    /// Die Auswahl des konkreten Beteiligten (Person oder Organisation).
    /// The selection of the specific participant (person or organization).
    /// </summary>
    [XmlElement("auswahl_beteiligter", Namespace = XJustizExport.Tns)]
    public AuswahlBeteiligter Auswahl { get; set; } = new();
}

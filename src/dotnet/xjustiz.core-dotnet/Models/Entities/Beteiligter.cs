namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert einen Beteiligten im Verfahren.
/// Represents a participant in the proceeding.
/// </summary>
public class Beteiligter
{
    /// <summary>
    /// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
    /// </summary>
    [XmlElement("auswahl_beteiligter", Namespace = XJustizExport.Tns)]
    public AuswahlBeteiligter Auswahl { get; set; } = new();
}

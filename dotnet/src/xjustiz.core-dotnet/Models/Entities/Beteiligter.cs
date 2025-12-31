namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Beteiligten im Verfahren.
/// Represents a participant in the proceeding.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Beteiligter
{
    /// <summary>
    /// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
    /// </summary>
    [XmlElement("auswahl_beteiligter", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public AuswahlBeteiligter Auswahl { get; set; } = new();
}

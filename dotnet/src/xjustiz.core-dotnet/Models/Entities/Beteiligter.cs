namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert einen Beteiligten im Verfahren.<br/>
/// <u><b>Participant:</b></u> Represents a participant in the proceeding.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Beteiligter
{
    /// <summary>
    /// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).<br/>
    /// <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
    /// </summary>
    [XmlElement("auswahl_beteiligter", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public AuswahlBeteiligter Auswahl { get; set; } = new();
}

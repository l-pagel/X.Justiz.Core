namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).<br/>
/// <u><b>Participant selection:</b></u> Selection structure for a participant (natural person or organization).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class AuswahlBeteiligter
{
    /// <summary>
    /// Eine natürliche Person.<br/>
    /// <u><b>Natural person:</b></u> A natural person.
    /// </summary>
    [XmlElement("natuerlichePerson", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public NatuerlichePerson? NP { get; set; }

    /// <summary>
    /// Hier werden alle Beteiligten aufgeführt, die nicht mit dem Type.GDS.NatuerlichePerson abgedeckt werden können: Gesellschaften, Vereine, Bruchteilsgemeinschaften etc. Die Abgrenzung erfolgt nicht nach juristischen Kategorien, sondern nach datentechnischer Zweckmäßigkeit.<br/>
    /// <u><b>Organization:</b></u> All participants who cannot be covered by Type.GDS.NatuerlichePerson are listed here: companies, associations, fractional communities, etc. The distinction is not based on legal categories but on data technical expediency.
    /// </summary>
    [XmlElement("organisation", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Organisation? Org { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
/// Selection structure for a participant (natural person or organization).
/// </summary>
[XJustizAvailability(XJustizVersion.Unknown)]
public class AuswahlBeteiligter
{
    /// <summary>
    /// Eine natürliche Person. A natural person.
    /// </summary>
    [XmlElement("natuerlichePerson", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public NatuerlichePerson? NP { get; set; }

    /// <summary>
    /// Hier werden alle Beteiligten aufgeführt, die nicht mit dem Type.GDS.NatuerlichePerson abgedeckt werden können: Gesellschaften, Vereine, Bruchteilsgemeinschaften etc. Die Abgrenzung erfolgt nicht nach juristischen Kategorien, sondern nach datentechnischer Zweckmäßigkeit.
    /// All participants who cannot be covered by Type.GDS.NatuerlichePerson are listed here: companies, associations, fractional communities, etc. The distinction is not based on legal categories but on data technical expediency.
    /// </summary>
    [XmlElement("organisation", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public Organisation? Org { get; set; }
}

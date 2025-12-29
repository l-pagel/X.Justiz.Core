namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für einen Beteiligten (natürliche Person oder Organisation).
/// Selection structure for a participant (natural person or organization).
/// </summary>
public class AuswahlBeteiligter
{
    /// <summary>
    /// Eine natürliche Person als Beteiligter.
    /// A natural person as a participant.
    /// </summary>
    [XmlElement("natuerlichePerson", Namespace = XJustizExport.Tns)]
    public NatuerlichePerson? NP { get; set; }

    /// <summary>
    /// Eine Organisation als Beteiligter.
    /// An organization as a participant.
    /// </summary>
    [XmlElement("organisation", Namespace = XJustizExport.Tns)]
    public Organisation? Org { get; set; }
}

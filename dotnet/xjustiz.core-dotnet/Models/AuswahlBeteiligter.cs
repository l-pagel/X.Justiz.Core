namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class AuswahlBeteiligter
{
    [XmlElement("natuerlichePerson", Namespace = XJustizExport.Tns)]
    public NatuerlichePerson? NP { get; set; }

    [XmlElement("organisation", Namespace = XJustizExport.Tns)]
    public Organisation? Org { get; set; }
}

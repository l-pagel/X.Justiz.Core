namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Beteiligung
{
    [XmlElement("rolle", Namespace = XJustizExport.Tns, Order = 1)]
    public Rolle Rolle { get; set; } = new();

    [XmlElement("beteiligter", Namespace = XJustizExport.Tns, Order = 2)]
    public Beteiligter Beteiligter { get; set; } = new();
}

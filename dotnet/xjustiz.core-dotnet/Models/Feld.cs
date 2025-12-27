namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Feld
{
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Name { get; set; }

    [XmlElement("wert", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Wert { get; set; }
}

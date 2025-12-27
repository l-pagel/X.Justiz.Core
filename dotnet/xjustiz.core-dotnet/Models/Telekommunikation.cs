namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Telekommunikation
{
    [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
    public string? verbindung { get; set; }
}

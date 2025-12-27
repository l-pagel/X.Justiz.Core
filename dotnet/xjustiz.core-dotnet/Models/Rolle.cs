namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Rolle
{
    [XmlElement("rollenbezeichnung", Namespace = XJustizExport.Tns)]
    public Rollenbezeichnung Rollenbezeichnung { get; set; } = new();
}

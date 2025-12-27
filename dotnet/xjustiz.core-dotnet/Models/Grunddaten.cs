namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Grunddaten
{
    [XmlElement("verfahrensdaten", Namespace = XJustizExport.Tns)]
    public Verfahrensdaten? Verfahrensdaten { get; set; }
}

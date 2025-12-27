namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Bezeichnung
{
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
    public string? Aktuell { get; set; }
}

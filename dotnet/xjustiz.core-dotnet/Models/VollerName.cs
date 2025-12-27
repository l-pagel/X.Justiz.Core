namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class VollerName
{
    [XmlElement("vorname", Namespace = XJustizExport.Tns)]
    public string? Vorname { get; set; }

    [XmlElement("rufname", Namespace = XJustizExport.Tns)]
    public string? Rufname { get; set; }

    [XmlElement("titel", Namespace = XJustizExport.Tns)]
    public string? Titel { get; set; }

    [XmlElement("namensvorsatz", Namespace = XJustizExport.Tns)]
    public string? Namensvorsatz { get; set; }

    [XmlElement("nachname", Namespace = XJustizExport.Tns)]
    public string? Nachname { get; set; }
}

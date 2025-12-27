namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Anschrift
{
    [XmlElement("strasse", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Strasse { get; set; }

    [XmlElement("hausnummer", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Hausnummer { get; set; }

    [XmlElement("postleitzahl", Namespace = XJustizExport.Tns, Order = 3)]
    public string? Postleitzahl { get; set; }

    [XmlElement("ort", Namespace = XJustizExport.Tns, Order = 4)]
    public string? Ort { get; set; }

    [XmlElement("staat", Namespace = XJustizExport.Tns, Order = 5)]
    public Staat? Staat { get; set; }
}

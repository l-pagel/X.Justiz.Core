namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Akte
{
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    public Identifikation Identifikation { get; set; } = new();

    [XmlElement("anwendungsspezifischeErweiterung", Namespace = XJustizExport.Tns, Order = 2)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }

    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 3)]
    public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();
}

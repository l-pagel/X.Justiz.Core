namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class XjustizAkteFachspezifischeDaten
{
    [XmlElement("aktentyp", Namespace = XJustizExport.Tns, Order = 1)]
    public Aktentyp Aktentyp { get; set; } = new();

    [XmlElement("anzeigename", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Anzeigename { get; set; }

    [XmlElement("aktenzeichen", Namespace = XJustizExport.Tns, Order = 3)]
    public Aktenzeichen Aktenzeichen { get; set; } = new();
}

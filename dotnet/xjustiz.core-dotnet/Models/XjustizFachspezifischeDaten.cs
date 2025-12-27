namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class XjustizFachspezifischeDaten
{
    [XmlElement("dokumentklasse", Namespace = XJustizExport.Tns, Order = 1)]
    public DokumentklasseCode? Dokumentklasse { get; set; }

    [XmlElement("datei", Namespace = XJustizExport.Tns, Order = 2)]
    public Datei Datei { get; set; } = new();
}

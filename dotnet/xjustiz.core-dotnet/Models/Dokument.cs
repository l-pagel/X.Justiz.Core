namespace xjustiz.core_dotnet.Models;

using System;
using System.Xml.Serialization;

public class Dokument
{
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    public Identifikation Identifikation { get; set; } = new();

    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 2)]
    public XjustizFachspezifischeDaten FachspezifischeDaten { get; set; } = new();

    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, DataType = "dateTime", Order = 3)]
    public DateTime? Erstellungszeitpunkt { get; set; }
}

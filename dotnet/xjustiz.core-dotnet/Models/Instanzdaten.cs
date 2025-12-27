namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Instanzdaten
{
    [XmlElement("instanznummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Instanznummer { get; set; }

    [XmlElement("sachgebietszusatz", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Sachgebietszusatz { get; set; }

    [XmlElement("auswahl_instanzbehoerde", Namespace = XJustizExport.Tns, Order = 3)]
    public AuswahlInstanzbehoerde? AuswahlInstanzbehoerde { get; set; }
}

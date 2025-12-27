namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class Verfahrensdaten
{
    [XmlElement("verfahrensnummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Verfahrensnummer { get; set; }

    [XmlElement("instanzdaten", Namespace = XJustizExport.Tns, Order = 2)]
    public Instanzdaten? Instanzdaten { get; set; }

    [XmlElement("beteiligung", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Beteiligung>? Beteiligungen { get; set; }
}

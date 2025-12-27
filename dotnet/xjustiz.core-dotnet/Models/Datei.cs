namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class Datei
{
    [XmlElement("dateiname", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Dateiname { get; set; }

    [XmlElement("bestandteil", Namespace = XJustizExport.Tns, Order = 2)]
    public List<Bestandteil> Bestandteile { get; set; } = new();
}

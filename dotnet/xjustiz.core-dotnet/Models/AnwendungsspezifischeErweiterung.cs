namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class AnwendungsspezifischeErweiterung
{
    [XmlElement("kennung", Namespace = XJustizExport.Tns, Order = 1)]
    public string Kennung { get; set; } = "Mandatensoftware";

    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 2)]
    public string Name { get; set; } = "JL.Portal";

    [XmlElement("feldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? Feldgruppen { get; set; }

    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

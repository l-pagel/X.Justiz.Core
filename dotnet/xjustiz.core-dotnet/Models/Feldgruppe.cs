namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class Feldgruppe
{
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Name { get; set; }

    [XmlElement("beschreibung", Namespace = XJustizExport.Tns, Order = 2)]
    public string Beschreibung { get; set; } = string.Empty;

    [XmlElement("unterfeldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? UnterFeldgruppen { get; set; }

    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

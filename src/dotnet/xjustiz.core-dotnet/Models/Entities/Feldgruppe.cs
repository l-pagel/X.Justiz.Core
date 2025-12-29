namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Eine Gruppe von Feldern.
/// </summary>
public class Feldgruppe
{
    /// <summary>
    /// Der Name der Feldgruppe.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Name { get; set; }
    /// <summary>
    /// Die Hinweise und Erläuterungen zu einer Feldgruppe.
    /// </summary>
    [XmlElement("beschreibung", Namespace = XJustizExport.Tns, Order = 2)]
    public string Beschreibung { get; set; } = string.Empty;
    /// <summary>
    /// Über Unterfeldgruppe erfolgt die hierarchische Unterteilung einer Feldgruppe in weitere Feldgruppen.
    /// </summary>
    [XmlElement("unterfeldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? UnterFeldgruppen { get; set; }
    /// <summary>
    /// Über Feld erfolgt die Unterteilung einer Feldgruppe in konkrete Felder.
    /// </summary>
    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

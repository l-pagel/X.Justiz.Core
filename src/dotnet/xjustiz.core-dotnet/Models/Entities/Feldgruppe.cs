namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Eine Gruppe von Feldern.
/// A group of fields.
/// </summary>
public class Feldgruppe
{
    /// <summary>
    /// Der Name der Feldgruppe.
    /// The name of the field group.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Name { get; set; }

    /// <summary>
    /// Eine Beschreibung der Feldgruppe.
    /// A description of the field group.
    /// </summary>
    [XmlElement("beschreibung", Namespace = XJustizExport.Tns, Order = 2)]
    public string Beschreibung { get; set; } = string.Empty;

    /// <summary>
    /// Verschachtelte Unter-Feldgruppen.
    /// Nested sub-field groups.
    /// </summary>
    [XmlElement("unterfeldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? UnterFeldgruppen { get; set; }

    /// <summary>
    /// Die Felder in dieser Gruppe.
    /// The fields in this group.
    /// </summary>
    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

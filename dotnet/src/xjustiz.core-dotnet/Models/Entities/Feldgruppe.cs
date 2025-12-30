namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;
using xjustiz.core_dotnet.Models;

/// <summary>
/// Eine Gruppe von Feldern.
/// A group of fields.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Feldgruppe
{
    /// <summary>
    /// Der Name der Feldgruppe.
    /// The name of the field group.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string? Name { get; set; }

    /// <summary>
    /// Die Hinweise und Erläuterungen zu einer Feldgruppe.
    /// Notes and explanations for a field group.
    /// </summary>
    [XmlElement("beschreibung", Namespace = XJustizExport.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string Beschreibung { get; set; } = string.Empty;

    /// <summary>
    /// Über Unterfeldgruppe erfolgt die hierarchische Unterteilung einer Feldgruppe in weitere Feldgruppen.
    /// The hierarchical subdivision of a field group into further field groups takes place via 'Unterfeldgruppe'.
    /// </summary>
    [XmlElement("unterfeldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public List<Feldgruppe>? UnterFeldgruppen { get; set; }

    /// <summary>
    /// Über Feld erfolgt die Unterteilung einer Feldgruppe in konkrete Felder.
    /// The fields subdivision of a field group into concrete fields happens via 'Feld'.
    /// </summary>
    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public List<Feld>? Felder { get; set; }
}

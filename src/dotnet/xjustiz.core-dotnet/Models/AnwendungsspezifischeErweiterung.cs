namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Container für anwendungsspezifische Erweiterungen.
/// Container for application-specific extensions.
/// </summary>
public class AnwendungsspezifischeErweiterung
{
    /// <summary>
    /// Die Kennung der Erweiterung (Standard: "Mandatensoftware").
    /// The identifier of the extension (Default: "Mandatensoftware").
    /// </summary>
    [XmlElement("kennung", Namespace = XJustizExport.Tns, Order = 1)]
    public string Kennung { get; set; } = "Mandatensoftware";

    /// <summary>
    /// Der Name der Anwendung (Standard: "JL.Portal").
    /// The name of the application (Default: "JL.Portal").
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 2)]
    public string Name { get; set; } = "JL.Portal";

    /// <summary>
    /// Liste von Feldgruppen.
    /// List of field groups.
    /// </summary>
    [XmlElement("feldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? Feldgruppen { get; set; }

    /// <summary>
    /// Liste von einzelnen Feldern.
    /// List of individual fields.
    /// </summary>
    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

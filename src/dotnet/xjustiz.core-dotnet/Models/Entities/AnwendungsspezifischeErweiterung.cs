namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Container für anwendungsspezifische Erweiterungen.
/// </summary>
public class AnwendungsspezifischeErweiterung
{
    /// <summary>
    /// Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.
    /// </summary>
    [XmlElement("kennung", Namespace = XJustizExport.Tns, Order = 1)]
    public string Kennung { get; set; } = "Mandatensoftware";
    /// <summary>
    /// Der Name der anwendungsspezifischen Erweiterung.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 2)]
    public string Name { get; set; } = "JL.Portal";
    /// <summary>
    /// Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.
    /// </summary>
    [XmlElement("feldgruppe", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Feldgruppe>? Feldgruppen { get; set; }
    /// <summary>
    /// Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.
    /// </summary>
    [XmlElement("feld", Namespace = XJustizExport.Tns, Order = 4)]
    public List<Feld>? Felder { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert ein allgemeines Feld (Key-Value-Paar).
/// </summary>
public class Feld
{
    /// <summary>
    /// Der Name des Feldes.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Name { get; set; }
    /// <summary>
    /// Der Wert des Feldes.
    /// </summary>
    [XmlElement("wert", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Wert { get; set; }
}

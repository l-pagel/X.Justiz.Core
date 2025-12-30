namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein allgemeines Feld (Key-Value-Paar).
/// Represents a generic field (key-value pair).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Feld
{
    /// <summary>
    /// Der Name des Feldes.
    /// The name of the field.
    /// </summary>
    [XmlElement("name", Namespace = XJustizExport.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string? Name { get; set; }

    /// <summary>
    /// Der Wert des Feldes.
    /// The value of the field.
    /// </summary>
    [XmlElement("wert", Namespace = XJustizExport.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string? Wert { get; set; }
}

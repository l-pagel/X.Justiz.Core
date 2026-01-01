namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein allgemeines Feld (Key-Value-Paar).
/// Represents a generic field (key-value pair).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Feld
{
    /// <summary>
    /// Der Name des Feldes.
    /// The name of the field.
    /// </summary>
    [XmlElement("name", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Name { get; set; }

    /// <summary>
    /// Der Wert des Feldes.
    /// The value of the field.
    /// </summary>
    [XmlElement("wert", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Wert { get; set; }
}

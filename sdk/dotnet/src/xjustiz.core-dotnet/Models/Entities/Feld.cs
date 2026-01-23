namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein allgemeines Feld (Key-Value-Paar).<br/>
/// <u><b>Field:</b></u> Represents a generic field (key-value pair).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Feld
{
    /// <summary>
    /// Der Name des Feldes.<br/>
    /// <u><b>Name:</b></u> The name of the field.
    /// </summary>
    [XmlElement("name", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Name { get; set; }

    /// <summary>
    /// Die Hinweise und Erläuterungen zu einem Feld.<br/>
    /// <u><b>Description:</b></u> The notes and explanations for a field.
    /// </summary>
    [XmlElement("beschreibung", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Beschreibung { get; set; }

    /// <summary>
    /// Der Datentyp des Feldwertes. Gültige Angaben sind die W3C-Datentypen.<br/>
    /// <u><b>Data type:</b></u> The data type of the field value. Valid entries are the W3C data types.
    /// </summary>
    [XmlElement("datentyp", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Datentyp { get; set; }

    /// <summary>
    /// Der Wert des Feldes.<br/>
    /// <u><b>Value:</b></u> The value of the field.
    /// </summary>
    [XmlElement("wert", Namespace = SchemeConstants.XJustiz_Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Wert { get; set; }
}
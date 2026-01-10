namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Container für anwendungsspezifische Erweiterungen.<br/>
/// <u><b>Application-specific extension:</b></u> Container for application-specific extensions.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class AnwendungsspezifischeErweiterung
{
    /// <summary>
    /// Das Identifikationskennzeichen der anwendungsspezifischen Erweiterung.<br/>
    /// <u><b>Identifier:</b></u> The identification tag of the application-specific extension.
    /// </summary>
    [XmlElement("kennung", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Kennung { get; set; } = string.Empty;

    /// <summary>
    /// Der Name der anwendungsspezifischen Erweiterung.<br/>
    /// <u><b>Name:</b></u> The name of the application-specific extension.
    /// </summary>
    [XmlElement("name", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Name { get; set; } = string.Empty;

    /// <summary>
    /// Die textuelle Erläuterung zu einer anwendungsspezifischen Erweiterung.<br/>
    /// <u><b>Description:</b></u> The textual explanation of an application-specific extension.
    /// </summary>
    [XmlElement("beschreibung", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Beschreibung { get; set; }

    /// <summary>
    /// Eine Feldgruppe, die der anwendungsspezifischen Erweiterung zugeordnet ist.<br/>
    /// <u><b>Field groups:</b></u> A field group assigned to the application-specific extension.
    /// </summary>
    [XmlElement("feldgruppe", Namespace = SchemeConstants.XJustiz_Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Feldgruppe>? Feldgruppen { get; set; }

    /// <summary>
    /// Ein Feld, das der anwendungsspezifischen Erweiterung zugeordnet ist.<br/>
    /// <u><b>Fields:</b></u> A field assigned to the application-specific extension.
    /// </summary>
    [XmlElement("feld", Namespace = SchemeConstants.XJustiz_Tns, Order = 5)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Feld>? Felder { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Bezeichnung einer Organisation.<br/>
/// <u><b>Designation:</b></u> Designation of an organization.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Bezeichnung
{
    /// <summary>
    /// Aktueller offizieller Name der RA-Kanzlei.<br/>
    /// <u><b>Current designation:</b></u> Current official name of the law firm.
    /// </summary>
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Aktuell { get; set; }
}

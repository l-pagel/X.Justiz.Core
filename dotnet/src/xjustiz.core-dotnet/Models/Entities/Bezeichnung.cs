namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Bezeichnung einer Organisation.
/// Designation of an organization.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Bezeichnung
{
    /// <summary>
    /// Aktueller offizieller Name der RA-Kanzlei.
    /// Current official name of the law firm.
    /// </summary>
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Aktuell { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Rolle in einem Verfahren.
/// Represents a role in a proceeding.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Rolle
{
    /// <summary>
    /// Hier kann die fachliche Bezeichnung der Rolle des Beteiligten beschrieben werden.
    /// The technical designation of the role of the participant can be described here.
    /// </summary>
    [XmlElement("rollenbezeichnung", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Rollenbezeichnung Rollenbezeichnung { get; set; } = new();
}

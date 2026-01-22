namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Kopf der Nachricht für X.Justiz Core.<br/>
/// <u><b>Message header:</b></u> The header of the message for X.Justiz Core.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class NachrichtenkopfCore : Nachrichtenkopf
{
    /// <summary>
    /// Verwendete X.Justiz Core Version für diese Nachricht. Redundant zu <see cref="Version_XJustizCore"/><br/>
    /// <u><b>XJustiz Core version:</b></u> Used X.Justiz Core version for this message. Redundant to <see cref="Version_XJustizCore"/>
    /// </summary>
    [XmlAttribute("xjustizVersion")]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public new string Version { get; set; } = SchemeConstants.XJustizVersion.VersionString;

    /// <summary>
    /// Verwendete X.Justiz Core Version für diese Nachricht. Redundant zu <see cref="Version"/><br/>
    /// <u><b>XJustiz Core version:</b></u> Used X.Justiz Core version for this message. Redundant to <see cref="Version"/>
    /// </summary>
    [XmlElement("xjustizCoreVersion", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Version_XJustizCore { get; set; } = SchemeConstants.XJustizVersion.VersionString;

    /// <summary>
    /// Verwendete X.Justiz Core Version für diese Nachricht als String.<br/>
    /// <u><b>XJustiz Core version:</b></u> Used X.Justiz Core version for this message as string.
    /// </summary>
    [XmlElement("xjustizReferenzVersion", Namespace = SchemeConstants.XJustiz_Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string Version_XJustizReferenz { get; set; } = SchemeConstants.XJustizVersion.XJustizReferenzVersionString;
}

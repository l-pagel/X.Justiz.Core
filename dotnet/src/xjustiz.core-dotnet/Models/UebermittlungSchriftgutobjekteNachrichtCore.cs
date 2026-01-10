namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities.Core;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Basiselement zur Übermittlung von Daten im X.Justiz Core Format.<br/>
/// <u><b>Document Object Transmission Message:</b></u> Root element for the transmission of data in the X.Justiz Core format.
/// </summary>
[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = SchemeConstants.XJustiz_Tns)]
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class UebermittlungSchriftgutobjekteNachrichtCore : UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Kopf der Nachricht.<br/>
    /// <u><b>Message header:</b></u> The header of the message.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = SchemeConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public new NachrichtenkopfCore Kopf { get; set; } = new();
}
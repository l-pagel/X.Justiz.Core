using xjustiz.core_dotnet.Models.Entities;

namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = XJustizConstants.Tns)]
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Kopf der Nachricht.
    /// The header of the message.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Nachrichtenkopf Kopf { get; set; } = new();

    /// <summary>
    /// Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
    /// The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
    /// </summary>
    [XmlElement("grunddaten", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Grunddaten? Grunddaten { get; set; }

    /// <summary>
    /// Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
    /// This element is only used for communication with the electronic file repository for bailiffs.
    /// </summary>
    [XmlElement("schriftgutobjekte", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    /// <summary>
    /// Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
    /// Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
    /// </summary>
    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizConstants.Xsi)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string SchemaLocation { get; set; } = $"{XJustizConstants.Tns} xjustiz_0005_nachrichten_3_1.xsd";

    internal string? GetAktenzeichen() => Kopf?.AktenzeichenAbsender?.FirstOrDefault() ?? Kopf?.AktenzeichenEmpfaenger?.FirstOrDefault();
}

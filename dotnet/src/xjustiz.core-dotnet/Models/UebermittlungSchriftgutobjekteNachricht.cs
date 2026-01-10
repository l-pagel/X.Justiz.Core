namespace xjustiz.core_dotnet.Models;

using System.Linq;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities;
using xjustiz.core_dotnet.Models.Entities.Core;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;
using static xjustiz.core_dotnet.Util.Versioning.CompatibilityChecker;

/// <summary>
/// Basiselement zur Übermittlung von Daten im X.Justiz- bzw. X.Justiz Core Format.<br/>
/// <u><b>Document Object Transmission Message:</b></u> Root element for the transmission of data in the X.Justiz or X.Justiz Core format.
/// </summary>
[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = SchemaConstants.XJustiz_Tns)]
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Kopf der Nachricht.<br/>
    /// <u><b>Message header:</b></u> The header of the message.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public NachrichtenkopfCore Kopf { get; set; } = new();

    /// <summary>
    /// Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.<br/>
    /// <u><b>Basic data:</b></u> The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
    /// </summary>
    [XmlElement("grunddaten", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Grunddaten? Grunddaten { get; set; }

    /// <summary>
    /// Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.<br/>
    /// <u><b>Document objects:</b></u> This element is only used for communication with the electronic file repository for bailiffs.
    /// </summary>
    [XmlElement("schriftgutobjekte", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    /// <summary>
    /// Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.<br/>
    /// <u><b>Schema location:</b></u> Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
    /// </summary>
    [XmlAttribute(AttributeName = "schemaLocation", Namespace = SchemaConstants.Xsi)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string SchemaLocation { get; set; } = $"{SchemaConstants.XJustiz_Tns} xjustiz_0005_nachrichten_3_1.xsd";

    /// <summary>
    /// Gibt die kompatiblen Versionen von X.Justiz und X.JustizCore für <see cref = "UebermittlungSchriftgutobjekteNachricht" /> an.<br/>
    /// Specifies the compatible X.Justiz and X.JustizCore versions for <see cref = "UebermittlungSchriftgutobjekteNachricht" />.
    /// </summary>
    public CompatibilityResult GetCompatibility() => Check(this);

    /// <summary>
    /// Gibt das erste Aktenzeichen des <see cref="Nachrichtenkopf" /> zurück. Die Ermittlung erfolgt zunächst über <see cref = "Nachrichtenkopf.AktenzeichenAbsender" />, ersatzweise über<see cref = "Nachrichtenkopf.AktenzeichenEmpfaenger" />.<br/>
    /// Returns the first case reference of the <see cref="Nachrichtenkopf" />. Resolution is performed by first checking <see cref="Nachrichtenkopf.AktenzeichenAbsender" />, and falling back to <see cref = "Nachrichtenkopf.AktenzeichenEmpfaenger" /> if necessary.
    /// </summary>
    public string? GetAktenzeichen() => Kopf?.AktenzeichenAbsender?.FirstOrDefault() ?? Kopf?.AktenzeichenEmpfaenger?.FirstOrDefault();
}

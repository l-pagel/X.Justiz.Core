namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = XJustizExport.Tns)]
public class UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Kopf der Nachricht.
    /// The header of the message.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
    public Nachrichtenkopf Kopf { get; set; } = new();

    /// <summary>
    /// Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
    /// The Type.GDS.Grunddaten contains meta-information about the proceeding and its participants. It can also contain information about appointments.
    /// </summary>
    [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
    public Grunddaten? Grunddaten { get; set; }

    /// <summary>
    /// Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
    /// This element is only used for communication with the electronic file repository for bailiffs.
    /// </summary>
    [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    /// <summary>
    /// Gibt die Zuordnung zwischen XML-Namespaces und den Speicherorten der zugehörigen XML-Schemadateien an. Die Angabe erfolgt als Paare aus Namespace-URI und Schema-URL und dient Parsern/Validatoren als Hinweis, wo das Schema zu finden ist.
    /// Specifies the association between XML namespaces and the locations of their corresponding XML Schema documents. Provided as namespace–URI / schema‐URL pairs, it acts as a hint to validators and parsers where the schemas can be found.
    /// </summary>
    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
    public string SchemaLocation { get; set; } = $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
}

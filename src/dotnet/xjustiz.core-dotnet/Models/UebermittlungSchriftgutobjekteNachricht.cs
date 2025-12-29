namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Die Root-Nachricht für die Übermittlung von Schriftgutobjekten.
/// The root message for the transmission of document objects.
/// </summary>
[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = XJustizExport.Tns)]
public class UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Nachrichtenkopf.
    /// The message header.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
    public Nachrichtenkopf Kopf { get; set; } = new();

    /// <summary>
    /// Die Grunddaten der Nachricht.
    /// The basic data of the message.
    /// </summary>
    [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
    public Grunddaten? Grunddaten { get; set; }

    /// <summary>
    /// Die eigentlichen Schriftgutobjekte.
    /// The actual document objects.
    /// </summary>
    [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    /// <summary>
    /// Der Speicherort des Schemas.
    /// The location of the schema.
    /// </summary>
    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
    public string SchemaLocation { get; set; } =
        $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
}

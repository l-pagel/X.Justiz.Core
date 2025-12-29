namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = XJustizExport.Tns)]
public class UebermittlungSchriftgutobjekteNachricht
{
    /// <summary>
    /// Der Kopf der Nachricht. The header of the message.
    /// </summary>
    [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
    public Nachrichtenkopf Kopf { get; set; } = new();
    /// <summary>
    /// Der Type.GDS.Grunddaten enthält Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
    /// </summary>
    [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
    public Grunddaten? Grunddaten { get; set; }

    /// <summary>
    /// Dieses Element wird nur für die Kommunikation mit der elektronischen Aktenablage für Gerichtsvollzieher verwendet.
    /// </summary>
    [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }
    
    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
    public string SchemaLocation { get; set; } = $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
}

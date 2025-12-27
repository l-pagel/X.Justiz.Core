namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

[XmlRoot(
    ElementName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005",
    Namespace = XJustizExport.Tns)]
public class UebermittlungSchriftgutobjekteNachricht
{
    [XmlElement("nachrichtenkopf", Namespace = XJustizExport.Tns)]
    public Nachrichtenkopf Kopf { get; set; } = new();

    [XmlElement("grunddaten", Namespace = XJustizExport.Tns)]
    public Grunddaten? Grunddaten { get; set; }

    [XmlElement("schriftgutobjekte", Namespace = XJustizExport.Tns)]
    public Schriftgutobjekte? Schriftgutobjekte { get; set; }

    [XmlAttribute(AttributeName = "schemaLocation", Namespace = XJustizExport.Xsi)]
    public string SchemaLocation { get; set; } =
        $"{XJustizExport.Tns} xjustiz_0005_nachrichten_3_1.xsd";
}

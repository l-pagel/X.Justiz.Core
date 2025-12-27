namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Aktenzeichen
{
    [XmlElement("auswahl_aktenzeichen", Namespace = XJustizExport.Tns, Order = 1)]
    public AuswahlAktenzeichen Auswahl { get; set; } = new();
}

namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Beteiligter
{
    [XmlElement("auswahl_beteiligter", Namespace = XJustizExport.Tns)]
    public AuswahlBeteiligter Auswahl { get; set; } = new();
}

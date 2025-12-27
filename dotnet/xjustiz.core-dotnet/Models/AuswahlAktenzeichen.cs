namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class AuswahlAktenzeichen
{
    [XmlElement("aktenzeichen.freitext", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Freitext { get; set; }
}

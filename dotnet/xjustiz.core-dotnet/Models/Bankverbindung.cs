namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Bankverbindung
{
    [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
    public string? Kontoinhaber { get; set; }

    [XmlElement("iban", Namespace = XJustizExport.Tns)]
    public string? Iban { get; set; }

    [XmlElement("bic", Namespace = XJustizExport.Tns)]
    public string? Bic { get; set; }
}

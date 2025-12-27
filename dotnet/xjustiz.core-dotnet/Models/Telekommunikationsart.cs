namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Telekommunikationsart
{
    [XmlElement("code", Namespace = "")]
    public string? code { get; set; }
}

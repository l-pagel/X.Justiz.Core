namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Geschlecht
{
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}

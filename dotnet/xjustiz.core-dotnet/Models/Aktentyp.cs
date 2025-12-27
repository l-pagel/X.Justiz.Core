namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Aktentyp
{
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}

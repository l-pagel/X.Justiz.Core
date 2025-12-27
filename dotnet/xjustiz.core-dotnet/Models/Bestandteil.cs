namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class Bestandteil
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2.4";

    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}

namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class GerichtCode
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

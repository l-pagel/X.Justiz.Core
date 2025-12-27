namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

public class AuswahlInstanzbehoerde
{
    [XmlElement("gericht", Namespace = XJustizExport.Tns)]
    public GerichtCode? Gericht { get; set; }
}

namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class NatuerlichePerson
{
    [XmlElement("vollerName", Namespace = XJustizExport.Tns)]
    public VollerName VollerName { get; set; } = new();

    [XmlElement("geschlecht", Namespace = XJustizExport.Tns)]
    public Geschlecht Geschlecht { get; set; } = new();

    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    public Anschrift? Anschrift { get; set; }

    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

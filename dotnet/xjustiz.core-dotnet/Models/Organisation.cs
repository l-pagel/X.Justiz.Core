namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class Organisation
{
    [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
    public Bezeichnung? Bezeichnung { get; set; }

    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    public Anschrift? Anschrift { get; set; }

    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

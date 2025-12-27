namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

public class Schriftgutobjekte
{
    [XmlElement("akte", Namespace = XJustizExport.Tns)]
    public List<Akte>? Akte { get; set; }

    [XmlElement("dokument", Namespace = XJustizExport.Tns)]
    public List<Dokument>? Dokumente { get; set; }
}

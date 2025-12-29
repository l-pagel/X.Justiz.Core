namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für eine Instanzbehörde.
/// Selection structure for an instance authority.
/// </summary>
public class AuswahlInstanzbehoerde
{
    /// <summary>
    /// Das Gericht der Instanz.
    /// The court of the instance.
    /// </summary>
    [XmlElement("gericht", Namespace = XJustizExport.Tns)]
    public GerichtCode? Gericht { get; set; }
}

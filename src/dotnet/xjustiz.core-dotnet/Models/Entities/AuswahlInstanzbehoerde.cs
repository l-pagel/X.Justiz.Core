namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;

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

namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Ein Bestandteil einer Datei (z.B. Format, Version).
/// A component of a file (e.g., format, version).
/// </summary>
public class Bestandteil
{
    /// <summary>
    /// Die Version der Codeliste.
    /// The version of the code list.
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2.4";

    /// <summary>
    /// Der Code für den Bestandteil.
    /// The code for the component.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}

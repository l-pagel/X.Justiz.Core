namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert den Code eines Gerichts.
/// Represents the code of a court.
/// </summary>
public class GerichtCode
{
    /// <summary>
    /// Die Version der Codeliste.
    /// The version of the code list.
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// Der Gerichtscode.
    /// The court code.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

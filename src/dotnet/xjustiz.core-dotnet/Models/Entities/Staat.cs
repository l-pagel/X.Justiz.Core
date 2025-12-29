namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert einen Staat als Code.
/// Represents a country / state as a code.
/// </summary>
public class Staat
{
    /// <summary>
    /// Die Version der Codeliste.
    /// The version of the code list.
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// Der Ländercode.
    /// The country code.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

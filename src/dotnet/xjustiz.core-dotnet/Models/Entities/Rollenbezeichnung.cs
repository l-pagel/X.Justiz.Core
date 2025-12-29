namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert die Bezeichnung einer Rolle als Code.
/// Represents the designation of a role as a code.
/// </summary>
public class Rollenbezeichnung
{
    /// <summary>
    /// Die Version der Codeliste.
    /// The version of the code list.
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// Der Code für die Rollenbezeichnung.
    /// The code for the role designation.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

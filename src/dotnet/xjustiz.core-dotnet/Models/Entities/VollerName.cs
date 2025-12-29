namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Der volle Name einer natürlichen Person.
/// The full name of a natural person.
/// </summary>
public class VollerName
{
    /// <summary>
    /// Der Vorname.
    /// The first name.
    /// </summary>
    [XmlElement("vorname", Namespace = XJustizExport.Tns)]
    public string? Vorname { get; set; }

    /// <summary>
    /// Der Rufname.
    /// The called name / preferred name.
    /// </summary>
    [XmlElement("rufname", Namespace = XJustizExport.Tns)]
    public string? Rufname { get; set; }

    /// <summary>
    /// Der Titel.
    /// The title.
    /// </summary>
    [XmlElement("titel", Namespace = XJustizExport.Tns)]
    public string? Titel { get; set; }

    /// <summary>
    /// Der Namensvorsatz (z.B. "von").
    /// The name prefix (e.g., "von").
    /// </summary>
    [XmlElement("namensvorsatz", Namespace = XJustizExport.Tns)]
    public string? Namensvorsatz { get; set; }

    /// <summary>
    /// Der Nachname.
    /// The last name / surname.
    /// </summary>
    [XmlElement("nachname", Namespace = XJustizExport.Tns)]
    public string? Nachname { get; set; }
}

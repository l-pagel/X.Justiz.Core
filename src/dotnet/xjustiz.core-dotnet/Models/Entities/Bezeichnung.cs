namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Bezeichnung einer Organisation.
/// Designation of an organization.
/// </summary>
public class Bezeichnung
{
    /// <summary>
    /// Die aktuelle Bezeichnung der Organisation.
    /// The current designation of the organization.
    /// </summary>
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
    public string? Aktuell { get; set; }
}

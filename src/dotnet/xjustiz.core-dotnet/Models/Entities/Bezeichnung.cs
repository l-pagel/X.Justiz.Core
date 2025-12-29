namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Bezeichnung einer Organisation.
/// Designation of an organization.
/// </summary>
public class Bezeichnung
{
    /// <summary>
    /// Aktueller offizieller Name der RA-Kanzlei.
    /// Current official name of the law firm.
    /// </summary>
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
    public string? Aktuell { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Bezeichnung einer Organisation.
/// </summary>
public class Bezeichnung
{
    /// <summary>
    /// Aktueller offizieller Name der RA-Kanzlei.
    /// </summary>
    [XmlElement("bezeichnung.aktuell", Namespace = XJustizExport.Tns)]
    public string? Aktuell { get; set; }
}

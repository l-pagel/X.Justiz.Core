namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Informationen zur Telekommunikation (Telefon, Email, etc.).
/// </summary>
public class Telekommunikation
{
    /// <summary>
    /// Art der Telekommunikation als Code.
    /// </summary>
    [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    /// <summary>
    /// Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
    /// </summary>
    [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
    public string? verbindung { get; set; }
}

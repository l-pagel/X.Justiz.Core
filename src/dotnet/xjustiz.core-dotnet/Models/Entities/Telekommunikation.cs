namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Informationen zur Telekommunikation (Telefon, Email, etc.).
/// Information on telecommunication (phone, email, etc.).
/// </summary>
public class Telekommunikation
{
    /// <summary>
    /// Art der Telekommunikation als Code.
    /// Type of telecommunication as a code.
    /// </summary>
    [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    /// <summary>
    /// Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
    /// The telephone number, fax number, e-mail address, Safe-ID, or similar is communicated here.
    /// </summary>
    [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
    public string? verbindung { get; set; }
}

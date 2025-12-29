namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Informationen zur Telekommunikation (Telefon, Email, etc.).
/// Information on telecommunication (phone, email, etc.).
/// </summary>
public class Telekommunikation
{
    /// <summary>
    /// Die Art der Telekommunikation (Code).
    /// The type of telecommunication (code).
    /// </summary>
    [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    /// <summary>
    /// Die Verbindungsdaten (z.B. Telefonnummer oder E-Mail-Adresse).
    /// The connection data (e.g., phone number or email address).
    /// </summary>
    [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
    public string? verbindung { get; set; }
}

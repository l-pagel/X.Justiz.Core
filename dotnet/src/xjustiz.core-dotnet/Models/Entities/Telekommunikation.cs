namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Informationen zur Telekommunikation (Telefon, Email, etc.).
/// Information on telecommunication (phone, email, etc.).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Telekommunikation
{
    /// <summary>
    /// Art der Telekommunikation als Code.
    /// Type of telecommunication as a code.
    /// </summary>
    [XmlElement("telekommunikationsart", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    /// <summary>
    /// Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.
    /// The telephone number, fax number, e-mail address, Safe-ID, or similar is communicated here.
    /// </summary>
    [XmlElement("verbindung", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? verbindung { get; set; }
}

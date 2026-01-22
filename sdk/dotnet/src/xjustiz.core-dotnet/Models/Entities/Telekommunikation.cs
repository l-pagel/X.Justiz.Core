namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Informationen zur Telekommunikation (Telefon, Email, etc.).<br/>
/// <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Telekommunikation
{
    /// <summary>
    /// Art der Telekommunikation als CodeValue.<br/>
    /// <u><b>Telecommunication type:</b></u> Type of telecommunication as a code.
    /// </summary>
    [XmlElement("telekommunikationsart", Namespace = SchemeConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Telekommunikationsart? Telekommunikationsart { get; set; }

    /// <summary>
    /// Hier wird die Telefonnummer, Faxnummer, E-Mail-Adresse, Safe-ID oder dergleichen mitgeteilt.<br/>
    /// <u><b>Connection:</b></u> The telephone number, fax number, e-mail address, Safe-ID, or similar is communicated here.
    /// </summary>
    [XmlElement("verbindung", Namespace = SchemeConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Verbindung { get; set; }
}

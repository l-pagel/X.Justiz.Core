namespace xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Telekommunikationsart Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Codeliste GDS.Telekommunikationsart</a>.<br/>
/// <u><b>Telecommunication type codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Code list GDS.TelecommunicationType</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(TelekommunikationsartCodeJsonConverter))]
public enum TelekommunikationsartCode
{
    /// <summary>
    /// <b>E-Mail</b><br/>
    /// Code: 001<br/>
    /// </summary>
    [XmlEnum("001")]
    Email,

    /// <summary>
    /// <b>Fax</b><br/>
    /// Code: 002<br/>
    /// </summary>
    [XmlEnum("002")]
    Fax,

    /// <summary>
    /// <b>Internet</b><br/>
    /// Code: 003<br/>
    /// </summary>
    [XmlEnum("003")]
    Internet,

    /// <summary>
    /// <b>Mobiltelefon</b><br/>
    /// Code: 004<br/>
    /// </summary>
    [XmlEnum("004")]
    Mobiltelefon,

    /// <summary>
    /// <b>Pager</b><br/>
    /// Code: 005<br/>
    /// </summary>
    [XmlEnum("005")]
    Pager,

    /// <summary>
    /// <b>Sonstige</b><br/>
    /// Code: 006<br/>
    /// </summary>
    [XmlEnum("006")]
    Sonstige,

    /// <summary>
    /// <b>Telefon</b><br/>
    /// Code: 007<br/>
    /// </summary>
    [XmlEnum("007")]
    Telefon,

    /// <summary>
    /// <b>Rechtsverbindlicher elektronischer Kommunikationsweg</b><br/>
    /// Code: 008<br/>
    /// </summary>
    [XmlEnum("008")]
    RechtsverbindlicherElektronischerKommunikationsweg,
}

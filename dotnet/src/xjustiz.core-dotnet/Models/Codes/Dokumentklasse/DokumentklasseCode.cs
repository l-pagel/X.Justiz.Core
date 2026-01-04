namespace xjustiz.core_dotnet.Models.Codes.Dokumentklasse;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Dokumentklasse Codes from <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>XRepository: Codeliste GDS.Dokumentklasse</a>.<br/>
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(DokumentklasseCodeJsonConverter))]
public enum DokumentklasseCode
{
    /// <summary>
    /// <b>Andere / Sonstige / Other / Miscellaneous</b><br/>
    /// Code: 001<br/>
    /// </summary>
    [XmlEnum("001")]
    Andere_Sonstige,

    /// <summary>
    /// <b>Klage / Antrag / Complaint / Application</b><br/>
    /// Code: 003<br/>
    /// </summary>
    [XmlEnum("003")]
    Klage_Antrag,

    /// <summary>
    /// <b>Anlage</b><br/>
    /// Code: 005<br/>
    /// </summary>
    [XmlEnum("005")]
    Anlage,

    /// <summary>
    /// <b>Urteil / Judgment</b><br/>
    /// Code: 006<br/>
    /// </summary>
    [XmlEnum("006")]
    Urteil,

    /// <summary>
    /// <b>Beschluss / Resolution / Order</b><br/>
    /// Code: 007<br/>
    /// </summary>
    [XmlEnum("007")]
    Beschluss,

    /// <summary>
    /// <b>Verf&#252;gung / Decree / Disposition</b><br/>
    /// Code: 008<br/>
    /// </summary>
    [XmlEnum("008")]
    Verfuegung,

    /// <summary>
    /// <b>Vermerk / Note / Memo</b><br/>
    /// Code: 009<br/>
    /// </summary>
    [XmlEnum("009")]
    Vermerk,

    /// <summary>
    /// <b>Protokoll / Protocol / Minutes</b><br/>
    /// Code: 010<br/>
    /// </summary>
    [XmlEnum("010")]
    Protokoll,

    /// <summary>
    /// <b>Fehlblatt / Missing Sheet</b><br/>
    /// Code: 011<br/>
    /// </summary>
    [XmlEnum("011")]
    Fehlblatt,

    /// <summary>
    /// <b>Zustellungsdokument / Service Document</b><br/>
    /// Code: 012<br/>
    /// </summary>
    [XmlEnum("012")]
    Zustellungsdokument,

    /// <summary>
    /// <b>Gutachten / Expert Opinion</b><br/>
    /// Code: 013<br/>
    /// </summary>
    [XmlEnum("013")]
    Gutachten,

    /// <summary>
    /// <b>Technische Information / Technical Information</b><br/>
    /// Code: 014<br/>
    /// </summary>
    [XmlEnum("014")]
    Technische_Information,

    /// <summary>
    /// <b>Schreiben / Letter</b><br/>
    /// Code: 015<br/>
    /// </summary>
    [XmlEnum("015")]
    Schreiben,

    /// <summary>
    /// <b>Antrag (Beh&#246;rde) / Application (Authority)</b><br/>
    /// Code: 016<br/>
    /// </summary>
    [XmlEnum("016")]
    Antrag_Behoerde,

    /// <summary>
    /// <b>Bescheid / Decision / Notice</b><br/>
    /// Code: 017<br/>
    /// </summary>
    [XmlEnum("017")]
    Bescheid,

    /// <summary>
    /// <b>Einspruch / Widerspruch (Beh&#246;rde) / Objection / Opposition (Authority)</b><br/>
    /// Code: 018<br/>
    /// </summary>
    [XmlEnum("018")]
    Einspruch_Widerspruch_Behoerde,

    /// <summary>
    /// <b>Einspruchs- / Widerspruchsbescheid / Decision on Objection / Opposition</b><br/>
    /// Code: 019<br/>
    /// </summary>
    [XmlEnum("019")]
    Einspruchs_Widerspruchsbescheid,

    /// <summary>
    /// <b>Kostendokument / Cost Document</b><br/>
    /// Code: 020<br/>
    /// </summary>
    [XmlEnum("020")]
    Kostendokument,

    /// <summary>
    /// <b>Gerichtsbescheid / Court Order</b><br/>
    /// Code: 021<br/>
    /// </summary>
    [XmlEnum("021")]
    Gerichtsbescheid,
}

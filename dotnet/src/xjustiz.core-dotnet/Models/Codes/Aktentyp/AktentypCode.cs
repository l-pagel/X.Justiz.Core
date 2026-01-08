namespace xjustiz.core_dotnet.Models.Codes.Aktentyp;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Aktentyp Codes.<br/>
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(AktentypCodeJsonConverter))]
public enum AktentypCode
{
    /// <summary>
    /// <b>Zivilakte / Civil Case File</b><br/>
    /// Code: 001<br/>
    /// </summary>
    [XmlEnum("001")]
    Zivilakte,

    /// <summary>
    /// <b>Betreuungsakte / Guardianship Case File</b><br/>
    /// Code: 002<br/>
    /// </summary>
    [XmlEnum("002")]
    Betreuungsakte,

    /// <summary>
    /// <b>Familienakte / Family Case File</b><br/>
    /// Code: 003<br/>
    /// </summary>
    [XmlEnum("003")]
    Familienakte,

    /// <summary>
    /// <b>Nachlassakte / Probate Case File</b><br/>
    /// Code: 004<br/>
    /// </summary>
    [XmlEnum("004")]
    Nachlassakte,

    /// <summary>
    /// <b>Insolvenzakte / Insolvency Case File</b><br/>
    /// Code: 005<br/>
    /// </summary>
    [XmlEnum("005")]
    Insolvenzakte,

    /// <summary>
    /// <b>Grundakte / Land Registry File</b><br/>
    /// Code: 006<br/>
    /// </summary>
    [XmlEnum("006")]
    Grundakte,

    /// <summary>
    /// <b>Registerakte / Register File</b><br/>
    /// Code: 007<br/>
    /// </summary>
    [XmlEnum("007")]
    Registerakte,

    /// <summary>
    /// <b>Zwangsvollstreckungsakte / Enforcement Case File</b><br/>
    /// Code: 008<br/>
    /// </summary>
    [XmlEnum("008")]
    Zwangsvollstreckungsakte,

    /// <summary>
    /// <b>Justizverwaltungsakte / Judicial Administration File</b><br/>
    /// Code: 009<br/>
    /// </summary>
    [XmlEnum("009")]
    Justizverwaltungsakte,

    /// <summary>
    /// <b>Bu&#223;geldakte / Fine Proceedings File</b><br/>
    /// Code: 010<br/>
    /// </summary>
    [XmlEnum("010")]
    Bussgeldakte,

    /// <summary>
    /// <b>Bew&#228;hrungshilfeakte / Probation Service File</b><br/>
    /// Code: 011<br/>
    /// </summary>
    [XmlEnum("011")]
    Bewaehrungshilfeakte,

    /// <summary>
    /// <b>Strafakte / Criminal Case File</b><br/>
    /// Code: 012<br/>
    /// </summary>
    [XmlEnum("012")]
    Strafakte,

    /// <summary>
    /// <b>Arbeitsgerichtsakte / Labor Court File</b><br/>
    /// Code: 013<br/>
    /// </summary>
    [XmlEnum("013")]
    Arbeitsgerichtsakte,

    /// <summary>
    /// <b>Finanzgerichtsakte / Fiscal Court File</b><br/>
    /// Code: 014<br/>
    /// </summary>
    [XmlEnum("014")]
    Finanzgerichtsakte,

    /// <summary>
    /// <b>Sozialgerichtsakte / Social Court File</b><br/>
    /// Code: 015<br/>
    /// </summary>
    [XmlEnum("015")]
    Sozialgerichtsakte,

    /// <summary>
    /// <b>Verwaltungsgerichtsakte / Administrative Court File</b><br/>
    /// Code: 016<br/>
    /// </summary>
    [XmlEnum("016")]
    Verwaltungsgerichtsakte,

    /// <summary>
    /// <b>Andere / Sonstige / Other/Miscellaneous</b><br/>
    /// Code: 017<br/>
    /// </summary>
    [XmlEnum("017")]
    Andere_oder_Sonstige,

    /// <summary>
    /// <b>Beh&#246;rdenakte / Authority File</b><br/>
    /// Code: 018<br/>
    /// </summary>
    [XmlEnum("018")]
    Behoerdenakte,

    /// <summary>
    /// <b>Hinterlegungsakte / Deposit File</b><br/>
    /// Code: 019<br/>
    /// </summary>
    [XmlEnum("019")]
    Hinterlegungsakte,

    /// <summary>
    /// <b>Gerichtsvollzieherverfahrensakte / Bailiff Proceedings File</b><br/>
    /// Code: 020<br/>
    /// </summary>
    [XmlEnum("020")]
    Gerichtsvollzieherverfahrensakte,

    /// <summary>
    /// <b>Gerichtsvollziehergesch&#228;ftsbuch DR I / Bailiff&#39;s Register DR I</b><br/>
    /// Code: 021<br/>
    /// </summary>
    [XmlEnum("021")]
    Gerichtsvollziehergeschaeftsbuch_DR_I,

    /// <summary>
    /// <b>Gerichtsvollziehergesch&#228;ftsbuch DR II / Bailiff&#39;s Register DR II</b><br/>
    /// Code: 022<br/>
    /// </summary>
    [XmlEnum("022")]
    Gerichtsvollziehergeschaeftsbuch_DR_II,

    /// <summary>
    /// <b>Gerichtsvollziehergesch&#228;ftsbuch KB I / Bailiff&#39;s Register KB I</b><br/>
    /// Code: 023<br/>
    /// </summary>
    [XmlEnum("023")]
    Gerichtsvollziehergeschaeftsbuch_KB_I,

    /// <summary>
    /// <b>Gerichtsvollziehergesch&#228;ftsbuch KB II / Bailiff&#39;s Register KB II</b><br/>
    /// Code: 024<br/>
    /// </summary>
    [XmlEnum("024")]
    Gerichtsvollziehergeschaeftsbuch_KB_II,
}

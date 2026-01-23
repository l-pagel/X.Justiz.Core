namespace xjustiz.core_dotnet.Models.Codes.Bestandteil;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Bestandteil Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codeliste GDS.Bestandteiltyp</a>.<br/>
/// <u><b>Component codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code list GDS.Components</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(BestandteiltypCodeJsonConverter))]
public enum BestandteiltypCode
{
    /// <summary>
    /// <b>Original / Original</b><br/>
    /// Code: 001<br/>
    /// </summary>
    [XmlEnum("001")]
    Original,

    /// <summary>
    /// <b>Repr&#228;sentat / Representation Copy</b><br/>
    /// Code: 002<br/>
    /// </summary>
    [XmlEnum("002")]
    Repraesentat,

    /// <summary>
    /// <b>Signaturdatei / Signature File</b><br/>
    /// Code: 003<br/>
    /// </summary>
    [XmlEnum("003")]
    Signaturdatei,

    /// <summary>
    /// <b>signierte Vorversion / Signed Previous Version</b><br/>
    /// Code: 004<br/>
    /// </summary>
    [XmlEnum("004")]
    signierte_Vorversion,

    /// <summary>
    /// <b>Transfervermerk / Transfer Record</b><br/>
    /// Code: 006<br/>
    /// </summary>
    [XmlEnum("006")]
    Transfervermerk,

    /// <summary>
    /// <b>Pr&#252;fvermerk / Verification Record</b><br/>
    /// Code: 010<br/>
    /// </summary>
    [XmlEnum("010")]
    Pruefvermerk,

    /// <summary>
    /// <b>VHN / Trusted Origin Evidence (VHN)</b><br/>
    /// Code: 011<br/>
    /// </summary>
    [XmlEnum("011")]
    VHN,

    /// <summary>
    /// <b>hinlaufendes eEB / Incoming eEB</b><br/>
    /// Code: 012<br/>
    /// </summary>
    [XmlEnum("012")]
    hinlaufendes_eEB,
}
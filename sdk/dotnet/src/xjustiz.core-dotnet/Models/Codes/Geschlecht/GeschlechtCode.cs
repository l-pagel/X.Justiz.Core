namespace xjustiz.core_dotnet.Models.Codes.Geschlecht;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Geschlecht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codeliste GDS.Geschlecht</a>.<br/>
/// <u><b>Gender codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code list GDS.Gender</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(GeschlechtCodeJsonConverter))]
public enum GeschlechtCode
{
    /// <summary>
    /// <b>Unbekannt / Unknown</b><br/>
    /// Code: 0<br/>
    /// </summary>
    [XmlEnum("0")]
    Unbekannt,

    /// <summary>
    /// <b>M&#228;nnlich / Male</b><br/>
    /// Code: 1<br/>
    /// </summary>
    [XmlEnum("1")]
    Maennlich,

    /// <summary>
    /// <b>Weiblich / Female</b><br/>
    /// Code: 2<br/>
    /// </summary>
    [XmlEnum("2")]
    Weiblich,

    /// <summary>
    /// <b>Divers / Diverse</b><br/>
    /// Code: 3<br/>
    /// </summary>
    [XmlEnum("3")]
    Divers,

    /// <summary>
    /// <b>S&#228;chlich / Neuter</b><br/>
    /// Code: 4<br/>
    /// </summary>
    [XmlEnum("4")]
    Saechlich,
}
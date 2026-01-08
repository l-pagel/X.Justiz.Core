namespace xjustiz.core_dotnet.Models.Codes.Geschlecht;

/// <summary>
/// Versionslisten für <see cref="GeschlechtCode"/> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codelisten GDS.Geschlecht</a>.<br/>
/// <u><b>Gender code lists:</b></u> for <see cref="GeschlechtCode"/> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code lists GDS.Gender</a>.
/// </summary>
public sealed class GeschlechtCodeLists : ICodeListCollection<GeschlechtCode>
{
    /// <summary>
    /// Geschlecht Codes Version <b>2.1</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.geschlecht_2.1:technischerBestandteilGenericode">XRepository: GDS.Geschlecht</a>.<br/>
    /// <u><b>Gender codes:</b></u> version <b>2.1</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.geschlecht_2.1:technischerBestandteilGenericode">XRepository: Code lists GDS.Gender</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Keine. Dies ist die erste Version.<br/>
    /// <b>Changelog:</b> None. This is the first version.
    /// </summary>
    public static readonly VersionedCodeList<GeschlechtCode> V2_1 = new("2.1")
    {
        GeschlechtCode.Unbekannt,
        GeschlechtCode.Maennlich,
        GeschlechtCode.Weiblich,
        GeschlechtCode.Divers,
        GeschlechtCode.Saechlich,
    };

    public static string Uri => "urn:de:xauslaender:codelist:geschlecht";

    public static IVersionedCodeList<GeschlechtCode> LatestList => V2_1;
}

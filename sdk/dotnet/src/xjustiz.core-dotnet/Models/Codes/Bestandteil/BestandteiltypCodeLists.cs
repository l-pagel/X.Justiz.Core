namespace xjustiz.core_dotnet.Models.Codes.Bestandteil;

/// <summary>
/// Versionslisten für <see cref="BestandteiltypCode"/> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codelisten GDS.Bestandteiltyp</a>.<br/>
/// <u><b>Component code lists:</b></u> for <see cref="BestandteiltypCode"/> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code lists GDS.Components</a>.
/// </summary>
public sealed class BestandteiltypCodeLists : ICodeListCollection<BestandteiltypCode>
{
    /// <summary>
    /// Bestandteil Codes Version <b>2.4</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp_2.4:technischerBestandteilGenericode">XRepository: GDS.Bestandteiltyp</a>.<br/>
    /// <u><b>Components codes:</b></u> version <b>2.4</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp_2.4:technischerBestandteilGenericode">XRepository: Code lists GDS.Components</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Keine. Dies ist die erste Version.<br/>
    /// <b>Changelog:</b> None. This is the first version.
    /// </summary>
    public static IVersionedCodeList<BestandteiltypCode> V2_4 { get; } = new VersionedCodeList<BestandteiltypCode>("2.4")
    {
        BestandteiltypCode.Original,
        BestandteiltypCode.Repraesentat,
        BestandteiltypCode.Signaturdatei,
        BestandteiltypCode.signierte_Vorversion,
        BestandteiltypCode.Transfervermerk,
        BestandteiltypCode.Pruefvermerk,
        BestandteiltypCode.VHN,
        BestandteiltypCode.hinlaufendes_eEB,
    };

    public static string Uri => "urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp";

    public static IVersionedCodeList<BestandteiltypCode> LatestList => V2_4;
}

namespace xjustiz.core_dotnet.Models.Codes.Aktentyp;

/// <summary>
/// Versionslisten für <see cref="AktentypCode"/> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp">XRepository: Codelisten GDS.Aktentyp</a>.<br/>
/// <u><b>CaseFileType code lists:</b></u> for <see cref="AktentypCode"/> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp">XRepository: Code lists GDS.CaseFileType</a>.
/// </summary>
public sealed class AktentypCodeLists : ICodeListCollection<AktentypCode>
{
    /// <summary>
    /// Aktentyp Codes Version <b>2.2</b> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp_2.2#version">XRepository: GDS.Aktentyp</a>.<br/>
    /// <u><b>CaseFileType codes:</b></u> version <b>2.2</b> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp_2.2#version">XRepository: Code lists GDS.CaseFileType</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Keine. Dies ist die erste Version.<br/>
    /// <b>Changelog:</b> None. This is the first version.
    /// </summary>
    public static readonly VersionedCodeList<AktentypCode> V2_2 = new("2.2")
    {
        AktentypCode.Zivilakte,
        AktentypCode.Betreuungsakte,
        AktentypCode.Familienakte,
        AktentypCode.Nachlassakte,
        AktentypCode.Insolvenzakte,
        AktentypCode.Grundakte,
        AktentypCode.Registerakte,
        AktentypCode.Zwangsvollstreckungsakte,
        AktentypCode.Justizverwaltungsakte,
        AktentypCode.Bussgeldakte,
        AktentypCode.Bewaehrungshilfeakte,
        AktentypCode.Strafakte,
        AktentypCode.Arbeitsgerichtsakte,
        AktentypCode.Finanzgerichtsakte,
        AktentypCode.Sozialgerichtsakte,
        AktentypCode.Verwaltungsgerichtsakte,
        AktentypCode.Andere_oder_Sonstige,
        AktentypCode.Behoerdenakte,
        AktentypCode.Hinterlegungsakte,
        AktentypCode.Gerichtsvollzieherverfahrensakte,
        AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_I,
        AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_II,
        AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_I,
        AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_II,
    };

    public static string Uri => "urn:xoev-de:xjustiz:codeliste:gds.aktentyp";

    public static IVersionedCodeList<AktentypCode> LatestList => V2_2;
}

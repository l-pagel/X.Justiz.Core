namespace xjustiz.core_dotnet.Models.Codes.Telekommunikationsart;

/// <summary>
/// Versionslisten für <see cref="TelekommunikationsartCode"/> aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Codelisten GDS.Telekommunikationsart</a>.<br/>
/// <u><b>Telecommunication type code lists:</b></u> for <see cref="TelekommunikationsartCode"/> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Code lists GDS.TelecommunicationType</a>.
/// </summary>
public sealed class TelekommunikationsartCodeLists : ICodeListCollection<TelekommunikationsartCode>
{
    /// <summary>
    /// Telekommunikationsart Codes Version <b>2.2</b> aus <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart_2.2:technischerBestandteilGenericode">XRepository: GDS.Telekommunikationsart</a>.<br/>
    /// <u><b>Telecommunication type codes:</b></u> version <b>2.2</b> from <a href="https://www.xrepository.de/api/xrepository/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart_2.2:technischerBestandteilGenericode">XRepository: Code lists GDS.TelecommunicationType</a>.
    /// <br/><br/>
    /// <b>Änderung zur Vorversion:</b> Keine. Dies ist die erste Version.<br/>
    /// <b>Changelog:</b> None. This is the first version.
    /// </summary>
    public static IVersionedCodeList<TelekommunikationsartCode> V2_2 { get; } = new VersionedCodeList<TelekommunikationsartCode>("2.2")
    {
        TelekommunikationsartCode.Email,
        TelekommunikationsartCode.Fax,
        TelekommunikationsartCode.Internet,
        TelekommunikationsartCode.Mobiltelefon,
        TelekommunikationsartCode.Pager,
        TelekommunikationsartCode.Sonstige,
        TelekommunikationsartCode.Telefon,
        TelekommunikationsartCode.RechtsverbindlicherElektronischerKommunikationsweg,
    };

    public static string Uri => "urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart";

    public static IVersionedCodeList<TelekommunikationsartCode> LatestList => V2_2;
}
namespace xjustiz.core_dotnet.Models.Codes.Rolle;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Rolle Codes.<br/>
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
[System.Text.Json.Serialization.JsonConverter(typeof(RollenCodeJsonConverter))]
public enum RollenCode
{
    /// <summary>
    /// <b>Abwesenheitspfleger(in) / Absentee Curator</b><br/>
    /// Code: 001<br/>
    /// </summary>
    [XmlEnum("001")]
    Abwesenheitspfleger,

    /// <summary>
    /// <b>Aliasidentit&#228;t / Alias Identity</b><br/>
    /// Code: 002<br/>
    /// </summary>
    [XmlEnum("002")]
    Aliasidentitaet,

    /// <summary>
    /// <b>Angeh&#246;rige(r) / Relative</b><br/>
    /// Code: 003<br/>
    /// </summary>
    [XmlEnum("003")]
    Angehoerige,

    /// <summary>
    /// <b>Angeklagte(r) / Accused</b><br/>
    /// Code: 004<br/>
    /// </summary>
    [XmlEnum("004")]
    Angeklagte,

    /// <summary>
    /// <b>Angeschuldigte(r) / Indicted</b><br/>
    /// Code: 005<br/>
    /// </summary>
    [XmlEnum("005")]
    Angeschuldigte,

    /// <summary>
    /// <b>Annehmende(r) / Adopter</b><br/>
    /// Code: 006<br/>
    /// </summary>
    [XmlEnum("006")]
    Annehmende,

    /// <summary>
    /// <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b><br/>
    /// Code: 007<br/>
    /// </summary>
    [XmlEnum("007")]
    Anschlussberufungsbeklagte,

    /// <summary>
    /// <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b><br/>
    /// Code: 008<br/>
    /// </summary>
    [XmlEnum("008")]
    Anschlussberufungsklaeger,

    /// <summary>
    /// <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b><br/>
    /// Code: 009<br/>
    /// </summary>
    [XmlEnum("009")]
    Anschlussbeschwerdefuehrer,

    /// <summary>
    /// <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b><br/>
    /// Code: 010<br/>
    /// </summary>
    [XmlEnum("010")]
    Anschlussbeschwerdegegner,

    /// <summary>
    /// <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b><br/>
    /// Code: 011<br/>
    /// </summary>
    [XmlEnum("011")]
    Anschlussrechtsbeschwerdefuehrer,

    /// <summary>
    /// <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b><br/>
    /// Code: 012<br/>
    /// </summary>
    [XmlEnum("012")]
    Anschlussrechtsbeschwerdegegner,

    /// <summary>
    /// <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b><br/>
    /// Code: 013<br/>
    /// </summary>
    [XmlEnum("013")]
    Anschlussrevisionsbeklagte,

    /// <summary>
    /// <b>Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)</b><br/>
    /// Code: 014<br/>
    /// </summary>
    [XmlEnum("014")]
    Anschlussrevisionsklaeger,

    /// <summary>
    /// <b>Antragsgegner(in) / Respondent</b><br/>
    /// Code: 015<br/>
    /// </summary>
    [XmlEnum("015")]
    Antragsgegner,

    /// <summary>
    /// <b>Antragsteller(in) / Applicant</b><br/>
    /// Code: 016<br/>
    /// </summary>
    [XmlEnum("016")]
    Antragsteller,

    /// <summary>
    /// <b>Anzeigeerstatter(in) / Complainant</b><br/>
    /// Code: 017<br/>
    /// </summary>
    [XmlEnum("017")]
    Anzeigeerstatter,

    /// <summary>
    /// <b>Anzunehmende(r) / Anzunehmende(r)</b><br/>
    /// Code: 018<br/>
    /// </summary>
    [XmlEnum("018")]
    Anzunehmende,

    /// <summary>
    /// <b>Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)</b><br/>
    /// Code: 019<br/>
    /// </summary>
    [XmlEnum("019")]
    Arrestglaeubiger,

    /// <summary>
    /// <b>Arrestschuldner(in) / Arrestschuldner(in)</b><br/>
    /// Code: 020<br/>
    /// </summary>
    [XmlEnum("020")]
    Arrestschuldner,

    /// <summary>
    /// <b>Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde</b><br/>
    /// Code: 021<br/>
    /// </summary>
    [XmlEnum("021")]
    Aufsichtsbehoerde,

    /// <summary>
    /// <b>Ausschlagende(r) / Ausschlagende(r)</b><br/>
    /// Code: 022<br/>
    /// </summary>
    [XmlEnum("022")]
    Ausschlagende,

    /// <summary>
    /// <b>Beamter (Beamtin) / Beamter (Beamtin)</b><br/>
    /// Code: 023<br/>
    /// </summary>
    [XmlEnum("023")]
    Beamter_Beamtin,

    /// <summary>
    /// <b>Beh&#246;rde / Beh&#246;rde</b><br/>
    /// Code: 024<br/>
    /// </summary>
    [XmlEnum("024")]
    Behoerde,

    /// <summary>
    /// <b>Beigeladene(r) / Beigeladene(r)</b><br/>
    /// Code: 025<br/>
    /// </summary>
    [XmlEnum("025")]
    Beigeladene,

    /// <summary>
    /// <b>Beistand / Beistand</b><br/>
    /// Code: 026<br/>
    /// </summary>
    [XmlEnum("026")]
    Beistand,

    /// <summary>
    /// <b>Bekannte(r) / Bekannte(r)</b><br/>
    /// Code: 027<br/>
    /// </summary>
    [XmlEnum("027")]
    Bekannte,

    /// <summary>
    /// <b>Beklagte(r) / Beklagte(r)</b><br/>
    /// Code: 028<br/>
    /// </summary>
    [XmlEnum("028")]
    Beklagte,

    /// <summary>
    /// <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b><br/>
    /// Code: 029<br/>
    /// </summary>
    [XmlEnum("029")]
    Berufungsbeklagte,

    /// <summary>
    /// <b>Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)</b><br/>
    /// Code: 030<br/>
    /// </summary>
    [XmlEnum("030")]
    Berufungsklaeger,

    /// <summary>
    /// <b>Beschuldigte(r) / Accused (Prelim.)</b><br/>
    /// Code: 031<br/>
    /// </summary>
    [XmlEnum("031")]
    Beschuldigte,

    /// <summary>
    /// <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b><br/>
    /// Code: 032<br/>
    /// </summary>
    [XmlEnum("032")]
    Beschwerdefuehrer,

    /// <summary>
    /// <b>Beschwerdegegner(in) / Beschwerdegegner(in)</b><br/>
    /// Code: 033<br/>
    /// </summary>
    [XmlEnum("033")]
    Beschwerdegegner,

    /// <summary>
    /// <b>Besucher(in) / Besucher(in)</b><br/>
    /// Code: 034<br/>
    /// </summary>
    [XmlEnum("034")]
    Besucher,

    /// <summary>
    /// <b>Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)</b><br/>
    /// Code: 036<br/>
    /// </summary>
    [XmlEnum("036")]
    Betreibende_Glaeubige,

    /// <summary>
    /// <b>Betreuer(in) / Guardian</b><br/>
    /// Code: 037<br/>
    /// </summary>
    [XmlEnum("037")]
    Betreuer,

    /// <summary>
    /// <b>Betreute(r) / Ward</b><br/>
    /// Code: 038<br/>
    /// </summary>
    [XmlEnum("038")]
    Betreute,

    /// <summary>
    /// <b>Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde</b><br/>
    /// Code: 039<br/>
    /// </summary>
    [XmlEnum("039")]
    Betreuungsbehoerde,

    /// <summary>
    /// <b>Betroffene(r) / Betroffene(r)</b><br/>
    /// Code: 040<br/>
    /// </summary>
    [XmlEnum("040")]
    Betroffene,

    /// <summary>
    /// <b>Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)</b><br/>
    /// Code: 041<br/>
    /// </summary>
    [XmlEnum("041")]
    Bevollmaechtigte,

    /// <summary>
    /// <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b><br/>
    /// Code: 042<br/>
    /// </summary>
    [XmlEnum("042")]
    Bewaehrungshelfer,

    /// <summary>
    /// <b>Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 043<br/>
    /// </summary>
    [XmlEnum("043")]
    Beweisanwalt,

    /// <summary>
    /// <b>Bruder (Schwester) / Bruder (Schwester)</b><br/>
    /// Code: 044<br/>
    /// </summary>
    [XmlEnum("044")]
    Bruder_Schwester,

    /// <summary>
    /// <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b><br/>
    /// Code: 045<br/>
    /// </summary>
    [XmlEnum("045")]
    Bundeswehrdisziplinaranwalt,

    /// <summary>
    /// <b>Bu&#223;geldempf&#228;nger(in) / Bu&#223;geldempf&#228;nger(in)</b><br/>
    /// Code: 046<br/>
    /// </summary>
    [XmlEnum("046")]
    Bussgeldempfaenger,

    /// <summary>
    /// <b>Cousin(e) / Cousin(e)</b><br/>
    /// Code: 047<br/>
    /// </summary>
    [XmlEnum("047")]
    Cousin,

    /// <summary>
    /// <b>Dienstvorgesetzte(r) / Dienstvorgesetzte(r)</b><br/>
    /// Code: 048<br/>
    /// </summary>
    [XmlEnum("048")]
    Dienstvorgesetzte,

    /// <summary>
    /// <b>director / director</b><br/>
    /// Code: 049<br/>
    /// </summary>
    [XmlEnum("049")]
    director,

    /// <summary>
    /// <b>Dolmetscher(in) / Interpreter</b><br/>
    /// Code: 050<br/>
    /// </summary>
    [XmlEnum("050")]
    Dolmetscher,

    /// <summary>
    /// <b>Dritte(r) / Dritte(r)</b><br/>
    /// Code: 051<br/>
    /// </summary>
    [XmlEnum("051")]
    Dritte,

    /// <summary>
    /// <b>Drittschuldner(in) / Drittschuldner(in)</b><br/>
    /// Code: 052<br/>
    /// </summary>
    [XmlEnum("052")]
    Drittschuldner,

    /// <summary>
    /// <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b><br/>
    /// Code: 053<br/>
    /// </summary>
    [XmlEnum("053")]
    Drittwiderbeklagte,

    /// <summary>
    /// <b>Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)</b><br/>
    /// Code: 054<br/>
    /// </summary>
    [XmlEnum("054")]
    Drittwiderklaeger,

    /// <summary>
    /// <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b><br/>
    /// Code: 056<br/>
    /// </summary>
    [XmlEnum("056")]
    Ehemann_Ehefrau,

    /// <summary>
    /// <b>Eigent&#252;mer(in) / Eigent&#252;mer(in)</b><br/>
    /// Code: 057<br/>
    /// </summary>
    [XmlEnum("057")]
    Eigentuemer,

    /// <summary>
    /// <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b><br/>
    /// Code: 058<br/>
    /// </summary>
    [XmlEnum("058")]
    Eingetragene_Lebenspartner,

    /// <summary>
    /// <b>Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde</b><br/>
    /// Code: 059<br/>
    /// </summary>
    [XmlEnum("059")]
    Einleitungsbehoerde,

    /// <summary>
    /// <b>Eltern / Eltern</b><br/>
    /// Code: 060<br/>
    /// </summary>
    [XmlEnum("060")]
    Eltern,

    /// <summary>
    /// <b>Elternteil / Elternteil</b><br/>
    /// Code: 061<br/>
    /// </summary>
    [XmlEnum("061")]
    Elternteil,

    /// <summary>
    /// <b>Enkel(in) / Enkel(in)</b><br/>
    /// Code: 062<br/>
    /// </summary>
    [XmlEnum("062")]
    Enkel,

    /// <summary>
    /// <b>Erbe (Erbin) / Erbe (Erbin)</b><br/>
    /// Code: 063<br/>
    /// </summary>
    [XmlEnum("063")]
    Erbe_Erbin,

    /// <summary>
    /// <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b><br/>
    /// Code: 064<br/>
    /// </summary>
    [XmlEnum("064")]
    Erbe_Erbin_ausschlagend,

    /// <summary>
    /// <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b><br/>
    /// Code: 065<br/>
    /// </summary>
    [XmlEnum("065")]
    Erbe_Erbin_vorverstorben,

    /// <summary>
    /// <b>Erblasser(in) / Erblasser(in)</b><br/>
    /// Code: 066<br/>
    /// </summary>
    [XmlEnum("066")]
    Erblasser,

    /// <summary>
    /// <b>Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)</b><br/>
    /// Code: 067<br/>
    /// </summary>
    [XmlEnum("067")]
    Ergaenzungspfleger,

    /// <summary>
    /// <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b><br/>
    /// Code: 068<br/>
    /// </summary>
    [XmlEnum("068")]
    Erinnerungsfuehrer,

    /// <summary>
    /// <b>Erinnerungsgegner(in) / Erinnerungsgegner(in)</b><br/>
    /// Code: 069<br/>
    /// </summary>
    [XmlEnum("069")]
    Erinnerungsgegner,

    /// <summary>
    /// <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b><br/>
    /// Code: 070<br/>
    /// </summary>
    [XmlEnum("070")]
    Ersatzbetreuer,

    /// <summary>
    /// <b>Ersteher(in) / Ersteher(in)</b><br/>
    /// Code: 071<br/>
    /// </summary>
    [XmlEnum("071")]
    Ersteher,

    /// <summary>
    /// <b>Erwerber(in) / Erwerber(in)</b><br/>
    /// Code: 072<br/>
    /// </summary>
    [XmlEnum("072")]
    Erwerber,

    /// <summary>
    /// <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b><br/>
    /// Code: 073<br/>
    /// </summary>
    [XmlEnum("073")]
    Erziehungsberechtigte,

    /// <summary>
    /// <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b><br/>
    /// Code: 074<br/>
    /// </summary>
    [XmlEnum("074")]
    Fruehere_Ehegatte_Ehegattin,

    /// <summary>
    /// <b>Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)</b><br/>
    /// Code: 075<br/>
    /// </summary>
    [XmlEnum("075")]
    Fruehere_Beklagte,

    /// <summary>
    /// <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b><br/>
    /// Code: 076<br/>
    /// </summary>
    [XmlEnum("076")]
    Fruehere_Beteiligte,

    /// <summary>
    /// <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b><br/>
    /// Code: 077<br/>
    /// </summary>
    [XmlEnum("077")]
    Fruehere_Glaeubiger,

    /// <summary>
    /// <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b><br/>
    /// Code: 078<br/>
    /// </summary>
    [XmlEnum("078")]
    Fruehere_Klaeger,

    /// <summary>
    /// <b>Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)</b><br/>
    /// Code: 079<br/>
    /// </summary>
    [XmlEnum("079")]
    Fruehere_Soldat,

    /// <summary>
    /// <b>Gegenvormund / Gegenvormund</b><br/>
    /// Code: 080<br/>
    /// </summary>
    [XmlEnum("080")]
    Gegenvormund,

    /// <summary>
    /// <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 081<br/>
    /// </summary>
    [XmlEnum("081")]
    Generalbundesanwalt,

    /// <summary>
    /// <b>Gericht / Gericht</b><br/>
    /// Code: 082<br/>
    /// </summary>
    [XmlEnum("082")]
    Gericht,

    /// <summary>
    /// <b>Gerichtsvollzieher(in) / Gerichtsvollzieher(in)</b><br/>
    /// Code: 083<br/>
    /// </summary>
    [XmlEnum("083")]
    Gerichtsvollzieher,

    /// <summary>
    /// <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b><br/>
    /// Code: 084<br/>
    /// </summary>
    [XmlEnum("084")]
    Geschaedigte,

    /// <summary>
    /// <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b><br/>
    /// Code: 085<br/>
    /// </summary>
    [XmlEnum("085")]
    Geschaeftsfuehrende_Gesellschafter,

    /// <summary>
    /// <b>Gesch&#228;ftsf&#252;hrer(in) / Gesch&#228;ftsf&#252;hrer(in)</b><br/>
    /// Code: 086<br/>
    /// </summary>
    [XmlEnum("086")]
    Geschaeftsfuehrer,

    /// <summary>
    /// <b>Gesetzliche(r) Erbe (Erbin) / Gesetzliche(r) Erbe (Erbin)</b><br/>
    /// Code: 087<br/>
    /// </summary>
    [XmlEnum("087")]
    Gesetzliche_Erbe_Erbin,

    /// <summary>
    /// <b>Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)</b><br/>
    /// Code: 088<br/>
    /// </summary>
    [XmlEnum("088")]
    Gesetzliche_Vertreter,

    /// <summary>
    /// <b>Gl&#228;ubiger(in) / Creditor</b><br/>
    /// Code: 089<br/>
    /// </summary>
    [XmlEnum("089")]
    Glaeubiger,

    /// <summary>
    /// <b>Gro&#223;eltern / Gro&#223;eltern</b><br/>
    /// Code: 090<br/>
    /// </summary>
    [XmlEnum("090")]
    Grosseltern,

    /// <summary>
    /// <b>Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)</b><br/>
    /// Code: 092<br/>
    /// </summary>
    [XmlEnum("092")]
    Grossvater_Grossmutter,

    /// <summary>
    /// <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b><br/>
    /// Code: 093<br/>
    /// </summary>
    [XmlEnum("093")]
    Hauptbevollmaechtigte,

    /// <summary>
    /// <b>Hoferbe (Hoferbin) / Hoferbe (Hoferbin)</b><br/>
    /// Code: 094<br/>
    /// </summary>
    [XmlEnum("094")]
    Hoferbe_Hoferbin,

    /// <summary>
    /// <b>Inhaber(in) der Firma / Inhaber(in) der Firma</b><br/>
    /// Code: 095<br/>
    /// </summary>
    [XmlEnum("095")]
    Inhaber_der_Firma,

    /// <summary>
    /// <b>Insolvenzverwalter(in) / Insolvency Administrator</b><br/>
    /// Code: 096<br/>
    /// </summary>
    [XmlEnum("096")]
    Insolvenzverwalter,

    /// <summary>
    /// <b>Jugendamt / Jugendamt</b><br/>
    /// Code: 097<br/>
    /// </summary>
    [XmlEnum("097")]
    Jugendamt,

    /// <summary>
    /// <b>Kammer / Kammer</b><br/>
    /// Code: 098<br/>
    /// </summary>
    [XmlEnum("098")]
    Kammer,

    /// <summary>
    /// <b>Kammermitglied / Kammermitglied</b><br/>
    /// Code: 099<br/>
    /// </summary>
    [XmlEnum("099")]
    Kammermitglied,

    /// <summary>
    /// <b>Kind / Kind</b><br/>
    /// Code: 100<br/>
    /// </summary>
    [XmlEnum("100")]
    Kind,

    /// <summary>
    /// <b>Kl&#228;ger(in) / Plaintiff</b><br/>
    /// Code: 101<br/>
    /// </summary>
    [XmlEnum("101")]
    Klaeger,

    /// <summary>
    /// <b>Kontrollbetreuer(in) / Kontrollbetreuer(in)</b><br/>
    /// Code: 102<br/>
    /// </summary>
    [XmlEnum("102")]
    Kontrollbetreuer,

    /// <summary>
    /// <b>Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 103<br/>
    /// </summary>
    [XmlEnum("103")]
    Korrespondenzanwalt,

    /// <summary>
    /// <b>Kostenschuldner(in) / Kostenschuldner(in)</b><br/>
    /// Code: 104<br/>
    /// </summary>
    [XmlEnum("104")]
    Kostenschuldner,

    /// <summary>
    /// <b>Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)</b><br/>
    /// Code: 105<br/>
    /// </summary>
    [XmlEnum("105")]
    Landwirtschaftsrichter,

    /// <summary>
    /// <b>Lebenspartner(in) / Lebenspartner(in)</b><br/>
    /// Code: 106<br/>
    /// </summary>
    [XmlEnum("106")]
    Lebenspartner,

    /// <summary>
    /// <b>Liquidator(in) / Liquidator(in)</b><br/>
    /// Code: 107<br/>
    /// </summary>
    [XmlEnum("107")]
    Liquidator,

    /// <summary>
    /// <b>Minderj&#228;hrige(r) / Minderj&#228;hrige(r)</b><br/>
    /// Code: 108<br/>
    /// </summary>
    [XmlEnum("108")]
    Minderjaehrige,

    /// <summary>
    /// <b>Mitvormund / Mitvormund</b><br/>
    /// Code: 109<br/>
    /// </summary>
    [XmlEnum("109")]
    Mitvormund,

    /// <summary>
    /// <b>M&#252;ndel / M&#252;ndel</b><br/>
    /// Code: 110<br/>
    /// </summary>
    [XmlEnum("110")]
    Muendel,

    /// <summary>
    /// <b>Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)</b><br/>
    /// Code: 112<br/>
    /// </summary>
    [XmlEnum("112")]
    Nachbesserungsglaeubiger,

    /// <summary>
    /// <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b><br/>
    /// Code: 113<br/>
    /// </summary>
    [XmlEnum("113")]
    Nachlasspfleger,

    /// <summary>
    /// <b>Nachlassverwalter(in) / Nachlassverwalter(in)</b><br/>
    /// Code: 114<br/>
    /// </summary>
    [XmlEnum("114")]
    Nachlassverwalter,

    /// <summary>
    /// <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b><br/>
    /// Code: 115<br/>
    /// </summary>
    [XmlEnum("115")]
    Nebenklaeger,

    /// <summary>
    /// <b>Neffe (Nichte) / Neffe (Nichte)</b><br/>
    /// Code: 116<br/>
    /// </summary>
    [XmlEnum("116")]
    Neffe_Nichte,

    /// <summary>
    /// <b>Nicht verwandt / Nicht verwandt</b><br/>
    /// Code: 117<br/>
    /// </summary>
    [XmlEnum("117")]
    Nicht_verwandt,

    /// <summary>
    /// <b>Onkel (Tante) / Onkel (Tante)</b><br/>
    /// Code: 118<br/>
    /// </summary>
    [XmlEnum("118")]
    Onkel_Tante,

    /// <summary>
    /// <b>Opfer / Opfer</b><br/>
    /// Code: 119<br/>
    /// </summary>
    [XmlEnum("119")]
    Opfer,

    /// <summary>
    /// <b>P&#228;chter(in) / P&#228;chter(in)</b><br/>
    /// Code: 120<br/>
    /// </summary>
    [XmlEnum("120")]
    Paechter,

    /// <summary>
    /// <b>Pflegeeltern / Pflegeeltern</b><br/>
    /// Code: 121<br/>
    /// </summary>
    [XmlEnum("121")]
    Pflegeeltern,

    /// <summary>
    /// <b>Pfleger(in) / Pfleger(in)</b><br/>
    /// Code: 123<br/>
    /// </summary>
    [XmlEnum("123")]
    Pfleger,

    /// <summary>
    /// <b>Pfleger(in) f&#252;r das Sammelverm&#246;gen / Pfleger(in) f&#252;r das Sammelverm&#246;gen</b><br/>
    /// Code: 124<br/>
    /// </summary>
    [XmlEnum("124")]
    Pfleger_fuer_das_Sammelvermoegen,

    /// <summary>
    /// <b>Pfleger(in) f&#252;r die Leibesfrucht / Pfleger(in) f&#252;r die Leibesfrucht</b><br/>
    /// Code: 125<br/>
    /// </summary>
    [XmlEnum("125")]
    Pfleger_fuer_die_Leibesfrucht,

    /// <summary>
    /// <b>Pflegevater (Pflegemutter) des M&#252;ndels / Pflegevater (Pflegemutter) des M&#252;ndels</b><br/>
    /// Code: 126<br/>
    /// </summary>
    [XmlEnum("126")]
    Pflegevater_Pflegemutter_des_Muendels,

    /// <summary>
    /// <b>Pflegling / Pflegling</b><br/>
    /// Code: 127<br/>
    /// </summary>
    [XmlEnum("127")]
    Pflegling,

    /// <summary>
    /// <b>Pflichtverteidiger(in) / Pflichtverteidiger(in)</b><br/>
    /// Code: 128<br/>
    /// </summary>
    [XmlEnum("128")]
    Pflichtverteidiger,

    /// <summary>
    /// <b>Polizei / Polizei</b><br/>
    /// Code: 129<br/>
    /// </summary>
    [XmlEnum("129")]
    Polizei,

    /// <summary>
    /// <b>Privatbeklagte(r) / Privatbeklagte(r)</b><br/>
    /// Code: 130<br/>
    /// </summary>
    [XmlEnum("130")]
    Privatbeklagte,

    /// <summary>
    /// <b>Privatkl&#228;ger(in) / Privatkl&#228;ger(in)</b><br/>
    /// Code: 131<br/>
    /// </summary>
    [XmlEnum("131")]
    Privatklaeger,

    /// <summary>
    /// <b>Prozessbevollm&#228;chtigte(r) / Prozessbevollm&#228;chtigte(r)</b><br/>
    /// Code: 132<br/>
    /// </summary>
    [XmlEnum("132")]
    Prozessbevollmaechtigte,

    /// <summary>
    /// <b>Prozesskostenhilfe-Anwalt (-Anw&#228;ltin) / Prozesskostenhilfe-Anwalt (-Anw&#228;ltin)</b><br/>
    /// Code: 133<br/>
    /// </summary>
    [XmlEnum("133")]
    Prozesskostenhilfe_Anwalt_Anwaeltin,

    /// <summary>
    /// <b>Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 134<br/>
    /// </summary>
    [XmlEnum("134")]
    Prozesskostenhilfe_Korrespondenzanwalt,

    /// <summary>
    /// <b>Rechtsanwalt (-anw&#228;ltin) / Rechtsanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 135<br/>
    /// </summary>
    [XmlEnum("135")]
    Rechtsanwalt,

    /// <summary>
    /// <b>Rechtsbeistand / Rechtsbeistand</b><br/>
    /// Code: 136<br/>
    /// </summary>
    [XmlEnum("136")]
    Rechtsbeistand,

    /// <summary>
    /// <b>Rechtsbeschwerdef&#252;hrer(in) / Rechtsbeschwerdef&#252;hrer(in)</b><br/>
    /// Code: 137<br/>
    /// </summary>
    [XmlEnum("137")]
    Rechtsbeschwerdefuehrer,

    /// <summary>
    /// <b>Rechtsbeschwerdegegner(in) / Rechtsbeschwerdegegner(in)</b><br/>
    /// Code: 138<br/>
    /// </summary>
    [XmlEnum("138")]
    Rechtsbeschwerdegegner,

    /// <summary>
    /// <b>Revisionsbeklagte(r) / Revisionsbeklagte(r)</b><br/>
    /// Code: 139<br/>
    /// </summary>
    [XmlEnum("139")]
    Revisionsbeklagte,

    /// <summary>
    /// <b>Revisionskl&#228;ger(in) / Revisionskl&#228;ger(in)</b><br/>
    /// Code: 140<br/>
    /// </summary>
    [XmlEnum("140")]
    Revisionsklaeger,

    /// <summary>
    /// <b>Sachbearbeiter(in) / Sachbearbeiter(in)</b><br/>
    /// Code: 141<br/>
    /// </summary>
    [XmlEnum("141")]
    Sachbearbeiter,

    /// <summary>
    /// <b>Sachverst&#228;ndige(r) / Sachverst&#228;ndige(r)</b><br/>
    /// Code: 142<br/>
    /// </summary>
    [XmlEnum("142")]
    Sachverstaendige,

    /// <summary>
    /// <b>Schuldner(in) / Debtor</b><br/>
    /// Code: 143<br/>
    /// </summary>
    [XmlEnum("143")]
    Schuldner,

    /// <summary>
    /// <b>Schwager (Schw&#228;gerin) / Schwager (Schw&#228;gerin)</b><br/>
    /// Code: 144<br/>
    /// </summary>
    [XmlEnum("144")]
    Schwager_Schwaegerin,

    /// <summary>
    /// <b>Schwiegersohn (Schwiegertochter) / Schwiegersohn (Schwiegertochter)</b><br/>
    /// Code: 146<br/>
    /// </summary>
    [XmlEnum("146")]
    Schwiegersohn_Schwiegertochter,

    /// <summary>
    /// <b>Schwiegervater (Schwiegermutter) / Schwiegervater (Schwiegermutter)</b><br/>
    /// Code: 148<br/>
    /// </summary>
    [XmlEnum("148")]
    Schwiegervater_Schwiegermutter,

    /// <summary>
    /// <b>Sohn (Tochter) / Sohn (Tochter)</b><br/>
    /// Code: 149<br/>
    /// </summary>
    [XmlEnum("149")]
    Sohn_Tochter,

    /// <summary>
    /// <b>Soldat(in) / Soldat(in)</b><br/>
    /// Code: 150<br/>
    /// </summary>
    [XmlEnum("150")]
    Soldat,

    /// <summary>
    /// <b>Sonstige(r) Beteiligte(r) / Sonstige(r) Beteiligte(r)</b><br/>
    /// Code: 151<br/>
    /// </summary>
    [XmlEnum("151")]
    Sonstige_Beteiligte,

    /// <summary>
    /// <b>Sonstige(r) Vertreter(in) / Sonstige(r) Vertreter(in)</b><br/>
    /// Code: 152<br/>
    /// </summary>
    [XmlEnum("152")]
    Sonstige_Vertreter,

    /// <summary>
    /// <b>Staatsanwaltschaft / Staatsanwaltschaft</b><br/>
    /// Code: 153<br/>
    /// </summary>
    [XmlEnum("153")]
    Staatsanwaltschaft,

    /// <summary>
    /// <b>Stiefeltern / Stiefeltern</b><br/>
    /// Code: 154<br/>
    /// </summary>
    [XmlEnum("154")]
    Stiefeltern,

    /// <summary>
    /// <b>Stiefvater (Stiefmutter) / Stiefvater (Stiefmutter)</b><br/>
    /// Code: 156<br/>
    /// </summary>
    [XmlEnum("156")]
    Stiefvater_Stiefmutter,

    /// <summary>
    /// <b>Terminsbevollm&#228;chtigte(r) / Terminsbevollm&#228;chtigte(r)</b><br/>
    /// Code: 161<br/>
    /// </summary>
    [XmlEnum("161")]
    Terminsbevollmaechtigte,

    /// <summary>
    /// <b>Testamentsvollstrecker(in) / Testamentsvollstrecker(in)</b><br/>
    /// Code: 162<br/>
    /// </summary>
    [XmlEnum("162")]
    Testamentsvollstrecker,

    /// <summary>
    /// <b>Testator(in) / Testator(in)</b><br/>
    /// Code: 163<br/>
    /// </summary>
    [XmlEnum("163")]
    Testator,

    /// <summary>
    /// <b>&#220;bernehmer(in) / &#220;bernehmer(in)</b><br/>
    /// Code: 164<br/>
    /// </summary>
    [XmlEnum("164")]
    Uebernehmer,

    /// <summary>
    /// <b>Unterbevollm&#228;chtigte(r) / Unterbevollm&#228;chtigte(r)</b><br/>
    /// Code: 165<br/>
    /// </summary>
    [XmlEnum("165")]
    Unterbevollmaechtigte,

    /// <summary>
    /// <b>Ur-Enkel(in) / Ur-Enkel(in)</b><br/>
    /// Code: 166<br/>
    /// </summary>
    [XmlEnum("166")]
    Ur_Enkel,

    /// <summary>
    /// <b>Vater (Mutter) / Vater (Mutter)</b><br/>
    /// Code: 167<br/>
    /// </summary>
    [XmlEnum("167")]
    Vater_Mutter,

    /// <summary>
    /// <b>Ver&#228;u&#223;erer (Ver&#228;u&#223;erin) / Ver&#228;u&#223;erer (Ver&#228;u&#223;erin)</b><br/>
    /// Code: 168<br/>
    /// </summary>
    [XmlEnum("168")]
    Veraeusserer_Veraeusserin,

    /// <summary>
    /// <b>Verfahrensbevollm&#228;chtigte(r) / Verfahrensbevollm&#228;chtigte(r)</b><br/>
    /// Code: 169<br/>
    /// </summary>
    [XmlEnum("169")]
    Verfahrensbevollmaechtigte,

    /// <summary>
    /// <b>Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin) / Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin)</b><br/>
    /// Code: 170<br/>
    /// </summary>
    [XmlEnum("170")]
    Verfahrenskostenhilfe_Anwalt_Anwaeltin,

    /// <summary>
    /// <b>Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 171<br/>
    /// </summary>
    [XmlEnum("171")]
    Verfahrenskostenhilfe_Korrespondenzanwalt,

    /// <summary>
    /// <b>Verfahrenspfleger(in) / Verfahrenspfleger(in)</b><br/>
    /// Code: 172<br/>
    /// </summary>
    [XmlEnum("172")]
    Verfahrenspfleger,

    /// <summary>
    /// <b>Verfahrensvertreter(in) (&#167;787 ZPO) / Verfahrensvertreter(in) (&#167;787 ZPO)</b><br/>
    /// Code: 173<br/>
    /// </summary>
    [XmlEnum("173")]
    Verfahrensvertreter_787_ZPO,

    /// <summary>
    /// <b>Verf&#252;gungsbeklagte(r) / Verf&#252;gungsbeklagte(r)</b><br/>
    /// Code: 174<br/>
    /// </summary>
    [XmlEnum("174")]
    Verfuegungsbeklagte,

    /// <summary>
    /// <b>Verf&#252;gungskl&#228;ger(in) / Verf&#252;gungskl&#228;ger(in)</b><br/>
    /// Code: 175<br/>
    /// </summary>
    [XmlEnum("175")]
    Verfuegungsklaeger,

    /// <summary>
    /// <b>Verkehrsanwalt (-anw&#228;ltin) / Verkehrsanwalt (-anw&#228;ltin)</b><br/>
    /// Code: 176<br/>
    /// </summary>
    [XmlEnum("176")]
    Verkehrsanwalt,

    /// <summary>
    /// <b>Verlobte(r) / Verlobte(r)</b><br/>
    /// Code: 177<br/>
    /// </summary>
    [XmlEnum("177")]
    Verlobte,

    /// <summary>
    /// <b>Verm&#228;chtnisnehmer(in) / Verm&#228;chtnisnehmer(in)</b><br/>
    /// Code: 178<br/>
    /// </summary>
    [XmlEnum("178")]
    Vermaechtnisnehmer,

    /// <summary>
    /// <b>Vermieter(in) / Vermieter(in)</b><br/>
    /// Code: 179<br/>
    /// </summary>
    [XmlEnum("179")]
    Vermieter,

    /// <summary>
    /// <b>Verp&#228;chter(in) / Verp&#228;chter(in)</b><br/>
    /// Code: 180<br/>
    /// </summary>
    [XmlEnum("180")]
    Verpaechter,

    /// <summary>
    /// <b>Versorgungstr&#228;ger(in) / Versorgungstr&#228;ger(in)</b><br/>
    /// Code: 181<br/>
    /// </summary>
    [XmlEnum("181")]
    Versorgungstraeger,

    /// <summary>
    /// <b>Verteidiger(in) / Defense Counsel</b><br/>
    /// Code: 182<br/>
    /// </summary>
    [XmlEnum("182")]
    Verteidiger,

    /// <summary>
    /// <b>Vertreter(in) der Interessen des Ausgleichsfonds / Vertreter(in) der Interessen des Ausgleichsfonds</b><br/>
    /// Code: 183<br/>
    /// </summary>
    [XmlEnum("183")]
    Vertreter_der_Interessen_des_Ausgleichsfonds,

    /// <summary>
    /// <b>Vertreter(in) der Staatskasse / Vertreter(in) der Staatskasse</b><br/>
    /// Code: 184<br/>
    /// </summary>
    [XmlEnum("184")]
    Vertreter_der_Staatskasse,

    /// <summary>
    /// <b>Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht / Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht</b><br/>
    /// Code: 185<br/>
    /// </summary>
    [XmlEnum("185")]
    Vertreter_des_Bundesinteresses_beim_Bundesverwaltungsgericht,

    /// <summary>
    /// <b>Vertreter(in) des &#246;ffentlichen Interesses / Vertreter(in) des &#246;ffentlichen Interesses</b><br/>
    /// Code: 186<br/>
    /// </summary>
    [XmlEnum("186")]
    Vertreter_des_oeffentlichen_Interesses,

    /// <summary>
    /// <b>Verurteilte(r) / Verurteilte(r)</b><br/>
    /// Code: 187<br/>
    /// </summary>
    [XmlEnum("187")]
    Verurteilte,

    /// <summary>
    /// <b>Verwalter(in) der Wohnungseigent&#252;mergemeinschaft / Verwalter(in) der Wohnungseigent&#252;mergemeinschaft</b><br/>
    /// Code: 188<br/>
    /// </summary>
    [XmlEnum("188")]
    Verwalter_der_Wohnungseigentuemergemeinschaft,

    /// <summary>
    /// <b>Verwaltungsbeh&#246;rde / Verwaltungsbeh&#246;rde</b><br/>
    /// Code: 189<br/>
    /// </summary>
    [XmlEnum("189")]
    Verwaltungsbehoerde,

    /// <summary>
    /// <b>Vollstreckungsgl&#228;ubiger(in) / Vollstreckungsgl&#228;ubiger(in)</b><br/>
    /// Code: 190<br/>
    /// </summary>
    [XmlEnum("190")]
    Vollstreckungsglaeubiger,

    /// <summary>
    /// <b>Vollstreckungsschuldner(in) / Vollstreckungsschuldner(in)</b><br/>
    /// Code: 191<br/>
    /// </summary>
    [XmlEnum("191")]
    Vollstreckungsschuldner,

    /// <summary>
    /// <b>Vorl&#228;ufige(r) Betreuer(in) / Vorl&#228;ufige(r) Betreuer(in)</b><br/>
    /// Code: 192<br/>
    /// </summary>
    [XmlEnum("192")]
    Vorlaeufige_Betreuer,

    /// <summary>
    /// <b>Vormund / Vormund</b><br/>
    /// Code: 193<br/>
    /// </summary>
    [XmlEnum("193")]
    Vormund,

    /// <summary>
    /// <b>Vorstand / Vorstand</b><br/>
    /// Code: 194<br/>
    /// </summary>
    [XmlEnum("194")]
    Vorstand,

    /// <summary>
    /// <b>Vorsorgebevollm&#228;chtigte(r) / Vorsorgebevollm&#228;chtigte(r)</b><br/>
    /// Code: 195<br/>
    /// </summary>
    [XmlEnum("195")]
    Vorsorgebevollmaechtigte,

    /// <summary>
    /// <b>Wahlverteidiger(in) / Wahlverteidiger(in)</b><br/>
    /// Code: 196<br/>
    /// </summary>
    [XmlEnum("196")]
    Wahlverteidiger,

    /// <summary>
    /// <b>Widerbeklagte(r) / Widerbeklagte(r)</b><br/>
    /// Code: 197<br/>
    /// </summary>
    [XmlEnum("197")]
    Widerbeklagte,

    /// <summary>
    /// <b>Widerkl&#228;ger(in) / Widerkl&#228;ger(in)</b><br/>
    /// Code: 198<br/>
    /// </summary>
    [XmlEnum("198")]
    Widerklaeger,

    /// <summary>
    /// <b>Wiederaufnahmebeklagte(r) / Wiederaufnahmebeklagte(r)</b><br/>
    /// Code: 199<br/>
    /// </summary>
    [XmlEnum("199")]
    Wiederaufnahmebeklagte,

    /// <summary>
    /// <b>Wiederaufnahmekl&#228;ger(in) / Wiederaufnahmekl&#228;ger(in)</b><br/>
    /// Code: 200<br/>
    /// </summary>
    [XmlEnum("200")]
    Wiederaufnahmeklaeger,

    /// <summary>
    /// <b>Zahlungs- und Auflagenempf&#228;nger(in) / Zahlungs- und Auflagenempf&#228;nger(in)</b><br/>
    /// Code: 201<br/>
    /// </summary>
    [XmlEnum("201")]
    Zahlungs_und_Auflagenempfaenger,

    /// <summary>
    /// <b>Zeuge (Zeugin) / Zeuge (Zeugin)</b><br/>
    /// Code: 202<br/>
    /// </summary>
    [XmlEnum("202")]
    Zeuge_Zeugin,

    /// <summary>
    /// <b>Zeugenbeistand / Zeugenbeistand</b><br/>
    /// Code: 203<br/>
    /// </summary>
    [XmlEnum("203")]
    Zeugenbeistand,

    /// <summary>
    /// <b>Zulassungsantragsgegner(in) / Zulassungsantragsgegner(in)</b><br/>
    /// Code: 204<br/>
    /// </summary>
    [XmlEnum("204")]
    Zulassungsantragsgegner,

    /// <summary>
    /// <b>Zulassungsantragsteller(in) / Zulassungsantragsteller(in)</b><br/>
    /// Code: 205<br/>
    /// </summary>
    [XmlEnum("205")]
    Zulassungsantragsteller,

    /// <summary>
    /// <b>Zustellungsbevollm&#228;chtigte(r) / Zustellungsbevollm&#228;chtigte(r)</b><br/>
    /// Code: 206<br/>
    /// </summary>
    [XmlEnum("206")]
    Zustellungsbevollmaechtigte,

    /// <summary>
    /// <b>Zustellungsvertreter(in) (&#167;6 ZVG) / Zustellungsvertreter(in) (&#167;6 ZVG)</b><br/>
    /// Code: 207<br/>
    /// </summary>
    [XmlEnum("207")]
    Zustellungsvertreter_6_ZVG,

    /// <summary>
    /// <b>Notar(in) / Notary</b><br/>
    /// Code: 208<br/>
    /// </summary>
    [XmlEnum("208")]
    Notar,

    /// <summary>
    /// <b>Auskunftsempf&#228;nger(in) / Auskunftsempf&#228;nger(in)</b><br/>
    /// Code: 209<br/>
    /// </summary>
    [XmlEnum("209")]
    Auskunftsempfaenger,

    /// <summary>
    /// <b>Melder(in) / Melder(in)</b><br/>
    /// Code: 210<br/>
    /// </summary>
    [XmlEnum("210")]
    Melder,

    /// <summary>
    /// <b>Verwahrstelle / Verwahrstelle</b><br/>
    /// Code: 211<br/>
    /// </summary>
    [XmlEnum("211")]
    Verwahrstelle,

    /// <summary>
    /// <b>Aussteller(in) / Aussteller(in)</b><br/>
    /// Code: 212<br/>
    /// </summary>
    [XmlEnum("212")]
    Aussteller,

    /// <summary>
    /// <b>Berechtigte(r) / Berechtigte(r)</b><br/>
    /// Code: 213<br/>
    /// </summary>
    [XmlEnum("213")]
    Berechtigte,

    /// <summary>
    /// <b>Berechtigte(r) an einem Recht / Berechtigte(r) an einem Recht</b><br/>
    /// Code: 214<br/>
    /// </summary>
    [XmlEnum("214")]
    Berechtigte_an_einem_Recht,

    /// <summary>
    /// <b>Einreicher(in) / Einreicher(in)</b><br/>
    /// Code: 215<br/>
    /// </summary>
    [XmlEnum("215")]
    Einreicher,

    /// <summary>
    /// <b>Erbbauberechtigte(r) / Erbbauberechtigte(r)</b><br/>
    /// Code: 216<br/>
    /// </summary>
    [XmlEnum("216")]
    Erbbauberechtigte,

    /// <summary>
    /// <b>Finanzamt / Finanzamt</b><br/>
    /// Code: 217<br/>
    /// </summary>
    [XmlEnum("217")]
    Finanzamt,

    /// <summary>
    /// <b>Grundbuchvertreter(in) / Grundbuchvertreter(in)</b><br/>
    /// Code: 218<br/>
    /// </summary>
    [XmlEnum("218")]
    Grundbuchvertreter,

    /// <summary>
    /// <b>Insolvenzgericht / Insolvenzgericht</b><br/>
    /// Code: 219<br/>
    /// </summary>
    [XmlEnum("219")]
    Insolvenzgericht,

    /// <summary>
    /// <b>Mitteilungsempf&#228;nger(in) / Mitteilungsempf&#228;nger(in)</b><br/>
    /// Code: 220<br/>
    /// </summary>
    [XmlEnum("220")]
    Mitteilungsempfaenger,

    /// <summary>
    /// <b>Nacherbe (Nacherbin) / Nacherbe (Nacherbin)</b><br/>
    /// Code: 221<br/>
    /// </summary>
    [XmlEnum("221")]
    Nacherbe_Nacherbin,

    /// <summary>
    /// <b>Rechnungsempf&#228;nger(in) / Rechnungsempf&#228;nger(in)</b><br/>
    /// Code: 222<br/>
    /// </summary>
    [XmlEnum("222")]
    Rechnungsempfaenger,

    /// <summary>
    /// <b>Veranlasser(in) / Veranlasser(in)</b><br/>
    /// Code: 223<br/>
    /// </summary>
    [XmlEnum("223")]
    Veranlasser,

    /// <summary>
    /// <b>Versteigerungsabteilung / Versteigerungsabteilung</b><br/>
    /// Code: 224<br/>
    /// </summary>
    [XmlEnum("224")]
    Versteigerungsabteilung,

    /// <summary>
    /// <b>Vertretungsberechtigte(r) / Vertretungsberechtigte(r)</b><br/>
    /// Code: 225<br/>
    /// </summary>
    [XmlEnum("225")]
    Vertretungsberechtigte,

    /// <summary>
    /// <b>Zweitschuldner(in) / Zweitschuldner(in)</b><br/>
    /// Code: 226<br/>
    /// </summary>
    [XmlEnum("226")]
    Zweitschuldner,

    /// <summary>
    /// <b>Vertreter(in) / Vertreter(in)</b><br/>
    /// Code: 227<br/>
    /// </summary>
    [XmlEnum("227")]
    Vertreter,

    /// <summary>
    /// <b>Arbeitgeber(in) / Arbeitgeber(in)</b><br/>
    /// Code: 228<br/>
    /// </summary>
    [XmlEnum("228")]
    Arbeitgeber,

    /// <summary>
    /// <b>RV-Tr&#228;ger(in) / RV-Tr&#228;ger(in)</b><br/>
    /// Code: 229<br/>
    /// </summary>
    [XmlEnum("229")]
    RV_Traeger,

    /// <summary>
    /// <b>Vollstreckungsstelle / Vollstreckungsstelle</b><br/>
    /// Code: 230<br/>
    /// </summary>
    [XmlEnum("230")]
    Vollstreckungsstelle,

    /// <summary>
    /// <b>Abk&#246;mmling / Abk&#246;mmling</b><br/>
    /// Code: 231<br/>
    /// </summary>
    [XmlEnum("231")]
    Abkoemmling,

    /// <summary>
    /// <b>Kreditnehmer(in) / Kreditnehmer(in)</b><br/>
    /// Code: 232<br/>
    /// </summary>
    [XmlEnum("232")]
    Kreditnehmer,

    /// <summary>
    /// <b>Neu vorzutragende(r) Eigent&#252;mer(in) / Neu vorzutragende(r) Eigent&#252;mer(in)</b><br/>
    /// Code: 233<br/>
    /// </summary>
    [XmlEnum("233")]
    Neu_vorzutragende_Eigentuemer,

    /// <summary>
    /// <b>Notariatsverwalter(in) / Notariatsverwalter(in)</b><br/>
    /// Code: 234<br/>
    /// </summary>
    [XmlEnum("234")]
    Notariatsverwalter,

    /// <summary>
    /// <b>Notarvertreter(in) / Notarvertreter(in)</b><br/>
    /// Code: 235<br/>
    /// </summary>
    [XmlEnum("235")]
    Notarvertreter,

    /// <summary>
    /// <b>Partei kraft Amtes / Partei kraft Amtes</b><br/>
    /// Code: 236<br/>
    /// </summary>
    [XmlEnum("236")]
    Partei_kraft_Amtes,

    /// <summary>
    /// <b>Sequester / Sequester</b><br/>
    /// Code: 237<br/>
    /// </summary>
    [XmlEnum("237")]
    Sequester,

    /// <summary>
    /// <b>Treuh&#228;nder(in) / Treuh&#228;nder(in)</b><br/>
    /// Code: 238<br/>
    /// </summary>
    [XmlEnum("238")]
    Treuhaender,

    /// <summary>
    /// <b>Zustimmende(r) / Zustimmende(r)</b><br/>
    /// Code: 239<br/>
    /// </summary>
    [XmlEnum("239")]
    Zustimmende,

    /// <summary>
    /// <b>Gl&#228;ubigervertreter(in) / Gl&#228;ubigervertreter(in)</b><br/>
    /// Code: 240<br/>
    /// </summary>
    [XmlEnum("240")]
    Glaeubigervertreter,

    /// <summary>
    /// <b>Schuldnervertreter(in) / Schuldnervertreter(in)</b><br/>
    /// Code: 241<br/>
    /// </summary>
    [XmlEnum("241")]
    Schuldnervertreter,

    /// <summary>
    /// <b>Zahlungsempf&#228;nger(in) / Zahlungsempf&#228;nger(in)</b><br/>
    /// Code: 242<br/>
    /// </summary>
    [XmlEnum("242")]
    Zahlungsempfaenger,

    /// <summary>
    /// <b>Anteilsinhaber(in) / Anteilsinhaber(in)</b><br/>
    /// Code: 243<br/>
    /// </summary>
    [XmlEnum("243")]
    Anteilsinhaber,

    /// <summary>
    /// <b>Antragsteller(in) -Er&#246;ffnung / Antragsteller(in) -Er&#246;ffnung</b><br/>
    /// Code: 244<br/>
    /// </summary>
    [XmlEnum("244")]
    Antragsteller_Eroeffnung,

    /// <summary>
    /// <b>Debitor(in) / Debitor(in)</b><br/>
    /// Code: 245<br/>
    /// </summary>
    [XmlEnum("245")]
    Debitor,

    /// <summary>
    /// <b>Gesellschafter(in) / Gesellschafter(in)</b><br/>
    /// Code: 246<br/>
    /// </summary>
    [XmlEnum("246")]
    Gesellschafter,

    /// <summary>
    /// <b>Handlungsbevollm&#228;chtigte(r) / Handlungsbevollm&#228;chtigte(r)</b><br/>
    /// Code: 247<br/>
    /// </summary>
    [XmlEnum("247")]
    Handlungsbevollmaechtigte,

    /// <summary>
    /// <b>Mitglied einer Gesamt-Anteilsinhaberschaft / Mitglied einer Gesamt-Anteilsinhaberschaft</b><br/>
    /// Code: 248<br/>
    /// </summary>
    [XmlEnum("248")]
    Mitglied_einer_Gesamt_Anteilsinhaberschaft,

    /// <summary>
    /// <b>Mitglied einer Gl&#228;ubigergemeinschaft / Mitglied einer Gl&#228;ubigergemeinschaft</b><br/>
    /// Code: 249<br/>
    /// </summary>
    [XmlEnum("249")]
    Mitglied_einer_Glaeubigergemeinschaft,

    /// <summary>
    /// <b>Mitreeder(in) / Mitreeder(in)</b><br/>
    /// Code: 250<br/>
    /// </summary>
    [XmlEnum("250")]
    Mitreeder,

    /// <summary>
    /// <b>Partner(in) / Partner(in)</b><br/>
    /// Code: 251<br/>
    /// </summary>
    [XmlEnum("251")]
    Partner,

    /// <summary>
    /// <b>Pers&#246;nlich haftende(r) Gesellschafter(in) / Pers&#246;nlich haftende(r) Gesellschafter(in)</b><br/>
    /// Code: 252<br/>
    /// </summary>
    [XmlEnum("252")]
    Persoenlich_haftende_Gesellschafter,

    /// <summary>
    /// <b>Prozesspfleger(in) / Prozesspfleger(in)</b><br/>
    /// Code: 253<br/>
    /// </summary>
    [XmlEnum("253")]
    Prozesspfleger,

    /// <summary>
    /// <b>Sachwalter(in) / Sachwalter(in)</b><br/>
    /// Code: 254<br/>
    /// </summary>
    [XmlEnum("254")]
    Sachwalter,

    /// <summary>
    /// <b>Treuh&#228;nder(in) (Wohlverhaltensperiode) / Treuh&#228;nder(in) (Wohlverhaltensperiode)</b><br/>
    /// Code: 255<br/>
    /// </summary>
    [XmlEnum("255")]
    Treuhaender_Wohlverhaltensperiode,

    /// <summary>
    /// <b>Verm&#246;genstr&#228;ger(in) / Verm&#246;genstr&#228;ger(in)</b><br/>
    /// Code: 256<br/>
    /// </summary>
    [XmlEnum("256")]
    Vermoegenstraeger,

    /// <summary>
    /// <b>Vorl&#228;ufige(r) Insolvenzverwalter(in) / Vorl&#228;ufige(r) Insolvenzverwalter(in)</b><br/>
    /// Code: 257<br/>
    /// </summary>
    [XmlEnum("257")]
    Vorlaeufige_Insolvenzverwalter,

    /// <summary>
    /// <b>Vorl&#228;ufige(r) Treuh&#228;nder(in) / Vorl&#228;ufige(r) Treuh&#228;nder(in)</b><br/>
    /// Code: 258<br/>
    /// </summary>
    [XmlEnum("258")]
    Vorlaeufige_Treuhaender,

    /// <summary>
    /// <b>Sondersachwalter(in) / Sondersachwalter(in)</b><br/>
    /// Code: 259<br/>
    /// </summary>
    [XmlEnum("259")]
    Sondersachwalter,

    /// <summary>
    /// <b>Sonderinsolvenzverwalter(in) / Sonderinsolvenzverwalter(in)</b><br/>
    /// Code: 260<br/>
    /// </summary>
    [XmlEnum("260")]
    Sonderinsolvenzverwalter,

    /// <summary>
    /// <b>Vorl&#228;ufige(r) Sachwalter(in) / Vorl&#228;ufige(r) Sachwalter(in)</b><br/>
    /// Code: 261<br/>
    /// </summary>
    [XmlEnum("261")]
    Vorlaeufige_Sachwalter,

    /// <summary>
    /// <b>Abwickler(in) / Abwickler(in)</b><br/>
    /// Code: 262<br/>
    /// </summary>
    [XmlEnum("262")]
    Abwickler,

    /// <summary>
    /// <b>&#220;bernehmender Rechtstr&#228;ger / &#220;bernehmender Rechtstr&#228;ger</b><br/>
    /// Code: 263<br/>
    /// </summary>
    [XmlEnum("263")]
    Uebernehmender_Rechtstraeger,

    /// <summary>
    /// <b>Aufsichtsrat (-r&#228;tin) / Aufsichtsrat (-r&#228;tin)</b><br/>
    /// Code: 264<br/>
    /// </summary>
    [XmlEnum("264")]
    Aufsichtsrat_raetin,

    /// <summary>
    /// <b>Besondere(r) Vertreter(in) nach &#167; 30 BGB / Besondere(r) Vertreter(in) nach &#167; 30 BGB</b><br/>
    /// Code: 265<br/>
    /// </summary>
    [XmlEnum("265")]
    Besondere_Vertreter_nach_30_BGB,

    /// <summary>
    /// <b>Betriebsleiter(in) / Betriebsleiter(in)</b><br/>
    /// Code: 266<br/>
    /// </summary>
    [XmlEnum("266")]
    Betriebsleiter,

    /// <summary>
    /// <b>Empfangsberechtigte(r) / Empfangsberechtigte(r)</b><br/>
    /// Code: 267<br/>
    /// </summary>
    [XmlEnum("267")]
    Empfangsberechtigte,

    /// <summary>
    /// <b>Gesch&#228;ftsf&#252;hrende(r) Direktor(in) / Gesch&#228;ftsf&#252;hrende(r) Direktor(in)</b><br/>
    /// Code: 268<br/>
    /// </summary>
    [XmlEnum("268")]
    Geschaeftsfuehrende_Direktor,

    /// <summary>
    /// <b>Gesch&#228;ftsleiter(in) / Gesch&#228;ftsleiter(in)</b><br/>
    /// Code: 269<br/>
    /// </summary>
    [XmlEnum("269")]
    Geschaeftsleiter,

    /// <summary>
    /// <b>Gr&#252;nder(in) / Gr&#252;nder(in)</b><br/>
    /// Code: 271<br/>
    /// </summary>
    [XmlEnum("271")]
    Gruender,

    /// <summary>
    /// <b>Gr&#252;ndungspr&#252;fer(in) / Gr&#252;ndungspr&#252;fer(in)</b><br/>
    /// Code: 272<br/>
    /// </summary>
    [XmlEnum("272")]
    Gruendungspruefer,

    /// <summary>
    /// <b>Hauptniederlassung / Hauptniederlassung</b><br/>
    /// Code: 273<br/>
    /// </summary>
    [XmlEnum("273")]
    Hauptniederlassung,

    /// <summary>
    /// <b>Inhaber(in) / Inhaber(in)</b><br/>
    /// Code: 274<br/>
    /// </summary>
    [XmlEnum("274")]
    Inhaber,

    /// <summary>
    /// <b>Kommanditist(in) / Kommanditist(in)</b><br/>
    /// Code: 275<br/>
    /// </summary>
    [XmlEnum("275")]
    Kommanditist,

    /// <summary>
    /// <b>Konkursverwalter(in) / Konkursverwalter(in)</b><br/>
    /// Code: 276<br/>
    /// </summary>
    [XmlEnum("276")]
    Konkursverwalter,

    /// <summary>
    /// <b>Mitglied des Leitungsorgans / Mitglied des Leitungsorgans</b><br/>
    /// Code: 277<br/>
    /// </summary>
    [XmlEnum("277")]
    Mitglied_des_Leitungsorgans,

    /// <summary>
    /// <b>Mitglied EWIV / Mitglied EWIV</b><br/>
    /// Code: 278<br/>
    /// </summary>
    [XmlEnum("278")]
    Mitglied_EWIV,

    /// <summary>
    /// <b>Nachgr&#252;ndungspr&#252;fer(in) / Nachgr&#252;ndungspr&#252;fer(in)</b><br/>
    /// Code: 279<br/>
    /// </summary>
    [XmlEnum("279")]
    Nachgruendungspruefer,

    /// <summary>
    /// <b>Nachtragsabwickler(in) / Nachtragsabwickler(in)</b><br/>
    /// Code: 280<br/>
    /// </summary>
    [XmlEnum("280")]
    Nachtragsabwickler,

    /// <summary>
    /// <b>Nachtragsliquidator(in) / Nachtragsliquidator(in)</b><br/>
    /// Code: 281<br/>
    /// </summary>
    [XmlEnum("281")]
    Nachtragsliquidator,

    /// <summary>
    /// <b>Notgesch&#228;ftsf&#252;hrer(in) / Notgesch&#228;ftsf&#252;hrer(in)</b><br/>
    /// Code: 282<br/>
    /// </summary>
    [XmlEnum("282")]
    Notgeschaeftsfuehrer,

    /// <summary>
    /// <b>Notliquidator(in) / Notliquidator(in)</b><br/>
    /// Code: 283<br/>
    /// </summary>
    [XmlEnum("283")]
    Notliquidator,

    /// <summary>
    /// <b>Notvorstand / Notvorstand</b><br/>
    /// Code: 284<br/>
    /// </summary>
    [XmlEnum("284")]
    Notvorstand,

    /// <summary>
    /// <b>Prokurist(in) / Prokurist(in)</b><br/>
    /// Code: 285<br/>
    /// </summary>
    [XmlEnum("285")]
    Prokurist,

    /// <summary>
    /// <b>Rechtstr&#228;ger(in) / Rechtstr&#228;ger(in)</b><br/>
    /// Code: 287<br/>
    /// </summary>
    [XmlEnum("287")]
    Rechtstraeger,

    /// <summary>
    /// <b>Registergericht / Registergericht</b><br/>
    /// Code: 288<br/>
    /// </summary>
    [XmlEnum("288")]
    Registergericht,

    /// <summary>
    /// <b>Sacheinlagenpr&#252;fer(in) / Sacheinlagenpr&#252;fer(in)</b><br/>
    /// Code: 289<br/>
    /// </summary>
    [XmlEnum("289")]
    Sacheinlagenpruefer,

    /// <summary>
    /// <b>St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung / St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung</b><br/>
    /// Code: 290<br/>
    /// </summary>
    [XmlEnum("290")]
    Staendige_Vertreter_fuer_die_Zweigniederlassung,

    /// <summary>
    /// <b>&#220;bertragender Rechtstr&#228;ger / &#220;bertragender Rechtstr&#228;ger</b><br/>
    /// Code: 291<br/>
    /// </summary>
    [XmlEnum("291")]
    Uebertragender_Rechtstraeger,

    /// <summary>
    /// <b>Vergleichsverwalter(in) / Vergleichsverwalter(in)</b><br/>
    /// Code: 292<br/>
    /// </summary>
    [XmlEnum("292")]
    Vergleichsverwalter,

    /// <summary>
    /// <b>Verwaltungsrat (-r&#228;tin) / Verwaltungsrat (-r&#228;tin)</b><br/>
    /// Code: 293<br/>
    /// </summary>
    [XmlEnum("293")]
    Verwaltungsrat_raetin,

    /// <summary>
    /// <b>Vorstandsvorsitzende(r) / Vorstandsvorsitzende(r)</b><br/>
    /// Code: 294<br/>
    /// </summary>
    [XmlEnum("294")]
    Vorstandsvorsitzende,

    /// <summary>
    /// <b>Zweigniederlassung / Zweigniederlassung</b><br/>
    /// Code: 295<br/>
    /// </summary>
    [XmlEnum("295")]
    Zweigniederlassung,

    /// <summary>
    /// <b>Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin / Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin</b><br/>
    /// Code: 296<br/>
    /// </summary>
    [XmlEnum("296")]
    Vertreter_des_Klaegers_oder_der_Klaegerin,

    /// <summary>
    /// <b>Vertreter(in) des/der Beklagten / Vertreter(in) des/der Beklagten</b><br/>
    /// Code: 297<br/>
    /// </summary>
    [XmlEnum("297")]
    Vertreter_des_oder_der_Beklagten,

    /// <summary>
    /// <b>Bew&#228;hrungshilfe / Bew&#228;hrungshilfe</b><br/>
    /// Code: 298<br/>
    /// </summary>
    [XmlEnum("298")]
    Bewaehrungshilfe,

    /// <summary>
    /// <b>Gerichtshilfe / Gerichtshilfe</b><br/>
    /// Code: 299<br/>
    /// </summary>
    [XmlEnum("299")]
    Gerichtshilfe,

    /// <summary>
    /// <b>Justizvollzug / Justizvollzug</b><br/>
    /// Code: 300<br/>
    /// </summary>
    [XmlEnum("300")]
    Justizvollzug,

    /// <summary>
    /// <b>Pseudoname / Pseudoname</b><br/>
    /// Code: 301<br/>
    /// </summary>
    [XmlEnum("301")]
    Pseudoname,

    /// <summary>
    /// <b>Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin / Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin</b><br/>
    /// Code: 302<br/>
    /// </summary>
    [XmlEnum("302")]
    Gesetzliche_Vertreter_des_Glaeubigers_oder_der_Glaeubigerin,

    /// <summary>
    /// <b>Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin / Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin</b><br/>
    /// Code: 303<br/>
    /// </summary>
    [XmlEnum("303")]
    Gesetzliche_Vertreter_des_Schuldners_oder_der_Schuldnerin,

    /// <summary>
    /// <b>Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin / Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin</b><br/>
    /// Code: 304<br/>
    /// </summary>
    [XmlEnum("304")]
    Bevollmaechtigte_des_Glaeubigers_oder_der_Glaeubigerin,

    /// <summary>
    /// <b>Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin / Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin</b><br/>
    /// Code: 305<br/>
    /// </summary>
    [XmlEnum("305")]
    Bevollmaechtigte_des_Schuldners_oder_der_Schuldnerin,

    /// <summary>
    /// <b>Fahrzeughalter(in) / Fahrzeughalter(in)</b><br/>
    /// Code: 306<br/>
    /// </summary>
    [XmlEnum("306")]
    Fahrzeughalter,

    /// <summary>
    /// <b>Fr&#252;here(r) Lebenspartner(in) / Fr&#252;here(r) Lebenspartner(in)</b><br/>
    /// Code: 307<br/>
    /// </summary>
    [XmlEnum("307")]
    Fruehere_Lebenspartner,

    /// <summary>
    /// <b>Sicherungsverwalter(in) / Sicherungsverwalter(in)</b><br/>
    /// Code: 308<br/>
    /// </summary>
    [XmlEnum("308")]
    Sicherungsverwalter,

    /// <summary>
    /// <b>Zwangsverwalter(in) / Zwangsverwalter(in)</b><br/>
    /// Code: 309<br/>
    /// </summary>
    [XmlEnum("309")]
    Zwangsverwalter,

    /// <summary>
    /// <b>Mieter(in) / Mieter(in)</b><br/>
    /// Code: 310<br/>
    /// </summary>
    [XmlEnum("310")]
    Mieter,

    /// <summary>
    /// <b>B&#252;rge (B&#252;rgin) / B&#252;rge (B&#252;rgin)</b><br/>
    /// Code: 311<br/>
    /// </summary>
    [XmlEnum("311")]
    Buerge_Buergin,

    /// <summary>
    /// <b>Meistbietende(r) / Meistbietende(r)</b><br/>
    /// Code: 312<br/>
    /// </summary>
    [XmlEnum("312")]
    Meistbietende,

    /// <summary>
    /// <b>Abschlusspr&#252;fer(in) / Abschlusspr&#252;fer(in)</b><br/>
    /// Code: 313<br/>
    /// </summary>
    [XmlEnum("313")]
    Abschlusspruefer,

    /// <summary>
    /// <b>Antragstellervertreter(in) / Antragstellervertreter(in)</b><br/>
    /// Code: 314<br/>
    /// </summary>
    [XmlEnum("314")]
    Antragstellervertreter,

    /// <summary>
    /// <b>Aufsichtsratsvorsitzende(r) / Aufsichtsratsvorsitzende(r)</b><br/>
    /// Code: 315<br/>
    /// </summary>
    [XmlEnum("315")]
    Aufsichtsratsvorsitzende,

    /// <summary>
    /// <b>Berufskammer / Berufskammer</b><br/>
    /// Code: 316<br/>
    /// </summary>
    [XmlEnum("316")]
    Berufskammer,

    /// <summary>
    /// <b>Betroffenenvertreter(in) / Betroffenenvertreter(in)</b><br/>
    /// Code: 317<br/>
    /// </summary>
    [XmlEnum("317")]
    Betroffenenvertreter,

    /// <summary>
    /// <b>B&#252;rgermeister(in) / B&#252;rgermeister(in)</b><br/>
    /// Code: 318<br/>
    /// </summary>
    [XmlEnum("318")]
    Buergermeister,

    /// <summary>
    /// <b>Eingliederungsbeteiligte(r) / Eingliederungsbeteiligte(r)</b><br/>
    /// Code: 319<br/>
    /// </summary>
    [XmlEnum("319")]
    Eingliederungsbeteiligte,

    /// <summary>
    /// <b>Formwechselnder Rechtstr&#228;ger / Formwechselnder Rechtstr&#228;ger</b><br/>
    /// Code: 320<br/>
    /// </summary>
    [XmlEnum("320")]
    Formwechselnder_Rechtstraeger,

    /// <summary>
    /// <b>Gewerbeamt / Gewerbeamt</b><br/>
    /// Code: 321<br/>
    /// </summary>
    [XmlEnum("321")]
    Gewerbeamt,

    /// <summary>
    /// <b>Inhaber(in) (nicht eingetragen) / Inhaber(in) (nicht eingetragen)</b><br/>
    /// Code: 322<br/>
    /// </summary>
    [XmlEnum("322")]
    Inhaber_nicht_eingetragen,

    /// <summary>
    /// <b>Kostenempf&#228;nger(in) / Kostenempf&#228;nger(in)</b><br/>
    /// Code: 323<br/>
    /// </summary>
    [XmlEnum("323")]
    Kostenempfaenger,

    /// <summary>
    /// <b>Nachlassgericht / Nachlassgericht</b><br/>
    /// Code: 324<br/>
    /// </summary>
    [XmlEnum("324")]
    Nachlassgericht,

    /// <summary>
    /// <b>Sonderpr&#252;fer(in) / Sonderpr&#252;fer(in)</b><br/>
    /// Code: 325<br/>
    /// </summary>
    [XmlEnum("325")]
    Sonderpruefer,

    /// <summary>
    /// <b>Sonstige(r) gerichtlich bestellte(r) Vertreter(in) / Sonstige(r) gerichtlich bestellte(r) Vertreter(in)</b><br/>
    /// Code: 326<br/>
    /// </summary>
    [XmlEnum("326")]
    Sonstige_gerichtlich_bestellte_Vertreter,

    /// <summary>
    /// <b>Sonstige(r) gesetzliche(r) Vertreter(in) BGB / Sonstige(r) gesetzliche(r) Vertreter(in) BGB</b><br/>
    /// Code: 327<br/>
    /// </summary>
    [XmlEnum("327")]
    Sonstige_gesetzliche_Vertreter_BGB,

    /// <summary>
    /// <b>Sonstige(r) organschaftliche(r) Vertreter(in) HRB / Sonstige(r) organschaftliche(r) Vertreter(in) HRB</b><br/>
    /// Code: 328<br/>
    /// </summary>
    [XmlEnum("328")]
    Sonstige_organschaftliche_Vertreter_HRB,

    /// <summary>
    /// <b>Standardkostenschuldner(in) / Standardkostenschuldner(in)</b><br/>
    /// Code: 329<br/>
    /// </summary>
    [XmlEnum("329")]
    Standardkostenschuldner,

    /// <summary>
    /// <b>&#220;bernahmeschuldner(in) / &#220;bernahmeschuldner(in)</b><br/>
    /// Code: 330<br/>
    /// </summary>
    [XmlEnum("330")]
    Uebernahmeschuldner,

    /// <summary>
    /// <b>Unternehmensvertragsbeteiligte(r) / Unternehmensvertragsbeteiligte(r)</b><br/>
    /// Code: 331<br/>
    /// </summary>
    [XmlEnum("331")]
    Unternehmensvertragsbeteiligte,

    /// <summary>
    /// <b>Vertreter(in) des pers&#246;nlich haftenden Gesellschafters / Vertreter(in) des pers&#246;nlich haftenden Gesellschafters</b><br/>
    /// Code: 332<br/>
    /// </summary>
    [XmlEnum("332")]
    Vertreter_des_persoenlich_haftenden_Gesellschafters,

    /// <summary>
    /// <b>Werkleiter(in) / Werkleiter(in)</b><br/>
    /// Code: 333<br/>
    /// </summary>
    [XmlEnum("333")]
    Werkleiter,

    /// <summary>
    /// <b>Mehrfachsitz / Mehrfachsitz</b><br/>
    /// Code: 334<br/>
    /// </summary>
    [XmlEnum("334")]
    Mehrfachsitz,

    /// <summary>
    /// <b>Mitglied VR / Mitglied VR</b><br/>
    /// Code: 335<br/>
    /// </summary>
    [XmlEnum("335")]
    Mitglied_VR,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als Abwicklerin / Mitglied e. BGB-Gesellschaft als Abwicklerin</b><br/>
    /// Code: 336<br/>
    /// </summary>
    [XmlEnum("336")]
    Mitglied_e_BGB_Gesellschaft_als_Abwicklerin,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als ges. Vertreterin / Mitglied e. BGB-Gesellschaft als ges. Vertreterin</b><br/>
    /// Code: 337<br/>
    /// </summary>
    [XmlEnum("337")]
    Mitglied_e_BGB_Gesellschaft_als_ges_Vertreterin,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als Kommanditistin / Mitglied e. BGB-Gesellschaft als Kommanditistin</b><br/>
    /// Code: 338<br/>
    /// </summary>
    [XmlEnum("338")]
    Mitglied_e_BGB_Gesellschaft_als_Kommanditistin,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als Liquidatorin / Mitglied e. BGB-Gesellschaft als Liquidatorin</b><br/>
    /// Code: 339<br/>
    /// </summary>
    [XmlEnum("339")]
    Mitglied_e_BGB_Gesellschaft_als_Liquidatorin,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV / Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV</b><br/>
    /// Code: 340<br/>
    /// </summary>
    [XmlEnum("340")]
    Mitglied_e_BGB_Gesellschaft_als_Mitglied_e_EWIV,

    /// <summary>
    /// <b>Mitglied e. BGB-Gesellschaft als phG / Mitglied e. BGB-Gesellschaft als phG</b><br/>
    /// Code: 341<br/>
    /// </summary>
    [XmlEnum("341")]
    Mitglied_e_BGB_Gesellschaft_als_phG,

    /// <summary>
    /// <b>Mitglied e. Erbengemeinschaft als ges. Vertreterin / Mitglied e. Erbengemeinschaft als ges. Vertreterin</b><br/>
    /// Code: 342<br/>
    /// </summary>
    [XmlEnum("342")]
    Mitglied_e_Erbengemeinschaft_als_ges_Vertreterin,

    /// <summary>
    /// <b>Mitglied e. Erbengemeinschaft als Inhaberin / Mitglied e. Erbengemeinschaft als Inhaberin</b><br/>
    /// Code: 343<br/>
    /// </summary>
    [XmlEnum("343")]
    Mitglied_e_Erbengemeinschaft_als_Inhaberin,

    /// <summary>
    /// <b>Mitglied e. Erbengemeinschaft als Kommanditistin / Mitglied e. Erbengemeinschaft als Kommanditistin</b><br/>
    /// Code: 344<br/>
    /// </summary>
    [XmlEnum("344")]
    Mitglied_e_Erbengemeinschaft_als_Kommanditistin,

    /// <summary>
    /// <b>Mitglied e. Erbengemeinschaft als Mitglied e. EWIV / Mitglied e. Erbengemeinschaft als Mitglied e. EWIV</b><br/>
    /// Code: 345<br/>
    /// </summary>
    [XmlEnum("345")]
    Mitglied_e_Erbengemeinschaft_als_Mitglied_e_EWIV,

    /// <summary>
    /// <b>Nebensitz / Nebensitz</b><br/>
    /// Code: 346<br/>
    /// </summary>
    [XmlEnum("346")]
    Nebensitz,

    /// <summary>
    /// <b>Gesamthandsgemeinschaft / Gesamthandsgemeinschaft</b><br/>
    /// Code: 347<br/>
    /// </summary>
    [XmlEnum("347")]
    Gesamthandsgemeinschaft,

    /// <summary>
    /// <b>Mitglied einer Gesamthandsgemeinschaft / Mitglied einer Gesamthandsgemeinschaft</b><br/>
    /// Code: 348<br/>
    /// </summary>
    [XmlEnum("348")]
    Mitglied_einer_Gesamthandsgemeinschaft,

    /// <summary>
    /// <b>Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG / Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG</b><br/>
    /// Code: 349<br/>
    /// </summary>
    [XmlEnum("349")]
    Leitungsperson_iSv_30_Abs_1_Nr_1_bis_5_OWiG,

    /// <summary>
    /// <b>Einziehungsbeteiligter / Einziehungsbeteiligter</b><br/>
    /// Code: 350<br/>
    /// </summary>
    [XmlEnum("350")]
    Einziehungsbeteiligter,

    /// <summary>
    /// <b>Antragsgegnervertreter(in) / Antragsgegnervertreter(in)</b><br/>
    /// Code: 351<br/>
    /// </summary>
    [XmlEnum("351")]
    Antragsgegnervertreter,

    /// <summary>
    /// <b>Verbraucher(in) / Verbraucher(in)</b><br/>
    /// Code: 352<br/>
    /// </summary>
    [XmlEnum("352")]
    Verbraucher,

    /// <summary>
    /// <b>Vielmelder(in) / Vielmelder(in)</b><br/>
    /// Code: 353<br/>
    /// </summary>
    [XmlEnum("353")]
    Vielmelder,

    /// <summary>
    /// <b>Vollmachtgeber(in) / Vollmachtgeber(in)</b><br/>
    /// Code: 354<br/>
    /// </summary>
    [XmlEnum("354")]
    Vollmachtgeber,

    /// <summary>
    /// <b>Nebenbeteiligte(r) &#167; 444 StPO / Nebenbeteiligte(r) &#167; 444 StPO</b><br/>
    /// Code: 355<br/>
    /// </summary>
    [XmlEnum("355")]
    Nebenbeteiligte_444_StPO,

    /// <summary>
    /// <b>Verfallsbeteiligte(r) &#167; 442 StPO a.F. / Verfallsbeteiligte(r) &#167; 442 StPO a.F.</b><br/>
    /// Code: 356<br/>
    /// </summary>
    [XmlEnum("356")]
    Verfallsbeteiligte_442_StPO_aF,

    /// <summary>
    /// <b>Verfolgte(r) &#167; 34 IRG / Verfolgte(r) &#167; 34 IRG</b><br/>
    /// Code: 357<br/>
    /// </summary>
    [XmlEnum("357")]
    Verfolgte_34_IRG,

    /// <summary>
    /// <b>Rechtsnachfolger(in) / Rechtsnachfolger(in)</b><br/>
    /// Code: 358<br/>
    /// </summary>
    [XmlEnum("358")]
    Rechtsnachfolger,

    /// <summary>
    /// <b>Statuswechselnde(r) Rechtstr&#228;ger(in) / Statuswechselnde(r) Rechtstr&#228;ger(in)</b><br/>
    /// Code: 359<br/>
    /// </summary>
    [XmlEnum("359")]
    Statuswechselnde_Rechtstraeger,

    /// <summary>
    /// <b>Haftangeh&#246;rige / Haftangeh&#246;rige</b><br/>
    /// Code: 360<br/>
    /// </summary>
    [XmlEnum("360")]
    Haftangehoerige,

    /// <summary>
    /// <b>Restrukturierungsbeauftragte(r) / Restrukturierungsbeauftragte(r)</b><br/>
    /// Code: 361<br/>
    /// </summary>
    [XmlEnum("361")]
    Restrukturierungsbeauftragte,

    /// <summary>
    /// <b>Sanierungsmoderator(in) / Sanierungsmoderator(in)</b><br/>
    /// Code: 362<br/>
    /// </summary>
    [XmlEnum("362")]
    Sanierungsmoderator,

    /// <summary>
    /// <b>Abschriftenempf&#228;nger(in) / Abschriftenempf&#228;nger(in)</b><br/>
    /// Code: 363<br/>
    /// </summary>
    [XmlEnum("363")]
    Abschriftenempfaenger,

    /// <summary>
    /// <b>Kostenbeamte(r) / Kostenbeamte(r)</b><br/>
    /// Code: 364<br/>
    /// </summary>
    [XmlEnum("364")]
    Kostenbeamte,

    /// <summary>
    /// <b>Urkundsbeamte(r) der Gesch&#228;ftsstelle / Urkundsbeamte(r) der Gesch&#228;ftsstelle</b><br/>
    /// Code: 365<br/>
    /// </summary>
    [XmlEnum("365")]
    Urkundsbeamte_der_Geschaeftsstelle,

    /// <summary>
    /// <b>Anordnungsbefugte(r) / Anordnungsbefugte(r)</b><br/>
    /// Code: 366<br/>
    /// </summary>
    [XmlEnum("366")]
    Anordnungsbefugte,

    /// <summary>
    /// <b>Erstschuldner(in) / Erstschuldner(in)</b><br/>
    /// Code: 367<br/>
    /// </summary>
    [XmlEnum("367")]
    Erstschuldner,

    /// <summary>
    /// <b>Kasse / Kasse</b><br/>
    /// Code: 368<br/>
    /// </summary>
    [XmlEnum("368")]
    Kasse,

    /// <summary>
    /// <b>Arrestbeklagte(r) / Arrestbeklagte(r)</b><br/>
    /// Code: 369<br/>
    /// </summary>
    [XmlEnum("369")]
    Arrestbeklagte,

    /// <summary>
    /// <b>Arrestkl&#228;ger(in) / Arrestkl&#228;ger(in)</b><br/>
    /// Code: 370<br/>
    /// </summary>
    [XmlEnum("370")]
    Arrestklaeger,

    /// <summary>
    /// <b>Bezirksrevisor(in) / Bezirksrevisor(in)</b><br/>
    /// Code: 371<br/>
    /// </summary>
    [XmlEnum("371")]
    Bezirksrevisor,

    /// <summary>
    /// <b>Nebenintervenient(in) / Nebenintervenient(in)</b><br/>
    /// Code: 372<br/>
    /// </summary>
    [XmlEnum("372")]
    Nebenintervenient,

    /// <summary>
    /// <b>Restitutionsbeklagte(r) / Restitutionsbeklagte(r)</b><br/>
    /// Code: 373<br/>
    /// </summary>
    [XmlEnum("373")]
    Restitutionsbeklagte,

    /// <summary>
    /// <b>Restitutionskl&#228;ger(in) / Restitutionskl&#228;ger(in)</b><br/>
    /// Code: 374<br/>
    /// </summary>
    [XmlEnum("374")]
    Restitutionsklaeger,

    /// <summary>
    /// <b>Streithelfer(in) / Streithelfer(in)</b><br/>
    /// Code: 375<br/>
    /// </summary>
    [XmlEnum("375")]
    Streithelfer,

    /// <summary>
    /// <b>Streitverk&#252;ndete(r) / Streitverk&#252;ndete(r)</b><br/>
    /// Code: 376<br/>
    /// </summary>
    [XmlEnum("376")]
    Streitverkuendete,

    /// <summary>
    /// <b>&#220;bersetzer(in) / &#220;bersetzer(in)</b><br/>
    /// Code: 377<br/>
    /// </summary>
    [XmlEnum("377")]
    Uebersetzer,

    /// <summary>
    /// <b>Unternehmen / Company</b><br/>
    /// Code: 378<br/>
    /// </summary>
    [XmlEnum("378")]
    Unternehmen_378,

    /// <summary>
    /// <b>Kontaktperson des Unternehmens / Kontaktperson des Unternehmens</b><br/>
    /// Code: 379<br/>
    /// </summary>
    [XmlEnum("379")]
    Kontaktperson_des_Unternehmens,

    /// <summary>
    /// <b>Beigetretene(r) / Beigetretene(r)</b><br/>
    /// Code: 380<br/>
    /// </summary>
    [XmlEnum("380")]
    Beigetretene,

    /// <summary>
    /// <b>Erkl&#228;rende(r) / Erkl&#228;rende(r)</b><br/>
    /// Code: 381<br/>
    /// </summary>
    [XmlEnum("381")]
    Erklaerende,

    /// <summary>
    /// <b>Heim / Heim</b><br/>
    /// Code: 382<br/>
    /// </summary>
    [XmlEnum("382")]
    Heim,

    /// <summary>
    /// <b>Inhaftierte Person / Inhaftierte Person</b><br/>
    /// Code: 383<br/>
    /// </summary>
    [XmlEnum("383")]
    Inhaftierte_Person,

    /// <summary>
    /// <b>Jugendgerichtshilfe / Jugendgerichtshilfe</b><br/>
    /// Code: 384<br/>
    /// </summary>
    [XmlEnum("384")]
    Jugendgerichtshilfe,

    /// <summary>
    /// <b>Krankenhaus / Krankenhaus</b><br/>
    /// Code: 385<br/>
    /// </summary>
    [XmlEnum("385")]
    Krankenhaus,

    /// <summary>
    /// <b>Nebenbetroffene(r) / Nebenbetroffene(r)</b><br/>
    /// Code: 386<br/>
    /// </summary>
    [XmlEnum("386")]
    Nebenbetroffene,

    /// <summary>
    /// <b>Nebenkl&#228;gervertreter(in) / Nebenkl&#228;gervertreter(in)</b><br/>
    /// Code: 387<br/>
    /// </summary>
    [XmlEnum("387")]
    Nebenklaegervertreter,

    /// <summary>
    /// <b>Psychosoziale(r) Prozessbegleiter(in) / Psychosoziale(r) Prozessbegleiter(in)</b><br/>
    /// Code: 388<br/>
    /// </summary>
    [XmlEnum("388")]
    Psychosoziale_Prozessbegleiter,

    /// <summary>
    /// <b>Rentenberater(in) / Rentenberater(in)</b><br/>
    /// Code: 389<br/>
    /// </summary>
    [XmlEnum("389")]
    Rentenberater,

    /// <summary>
    /// <b>Sachverst&#228;ndige(n) Zeuge (Zeugin) / Sachverst&#228;ndige(n) Zeuge (Zeugin)</b><br/>
    /// Code: 390<br/>
    /// </summary>
    [XmlEnum("390")]
    Sachverstaendigen_Zeuge_Zeugin,

    /// <summary>
    /// <b>Steuerberater(in) / Steuerberater(in)</b><br/>
    /// Code: 391<br/>
    /// </summary>
    [XmlEnum("391")]
    Steuerberater,

    /// <summary>
    /// <b>Unternehmen / Company</b><br/>
    /// Code: 392<br/>
    /// </summary>
    [XmlEnum("392")]
    Unternehmen_392,

    /// <summary>
    /// <b>Verfahrensbeistand / Verfahrensbeistand</b><br/>
    /// Code: 393<br/>
    /// </summary>
    [XmlEnum("393")]
    Verfahrensbeistand,

    /// <summary>
    /// <b>Verfahrensbeteiligte(r) / Verfahrensbeteiligte(r)</b><br/>
    /// Code: 394<br/>
    /// </summary>
    [XmlEnum("394")]
    Verfahrensbeteiligte,

    /// <summary>
    /// <b>Verhinderungsbetreuer / Verhinderungsbetreuer</b><br/>
    /// Code: 395<br/>
    /// </summary>
    [XmlEnum("395")]
    Verhinderungsbetreuer,

    /// <summary>
    /// <b>Verletztenbeistand / Verletztenbeistand</b><br/>
    /// Code: 396<br/>
    /// </summary>
    [XmlEnum("396")]
    Verletztenbeistand,

    /// <summary>
    /// <b>Wirtschaftspr&#252;fer(in) / Wirtschaftspr&#252;fer(in)</b><br/>
    /// Code: 397<br/>
    /// </summary>
    [XmlEnum("397")]
    Wirtschaftspruefer,

    /// <summary>
    /// <b>Zedent(in) / Zedent(in)</b><br/>
    /// Code: 398<br/>
    /// </summary>
    [XmlEnum("398")]
    Zedent,

    /// <summary>
    /// <b>Registerf&#252;hrende Beh&#246;rde/Stelle / Registerf&#252;hrende Beh&#246;rde/Stelle</b><br/>
    /// Code: 399<br/>
    /// </summary>
    [XmlEnum("399")]
    Registerfuehrende_Behoerde_oder_Stelle,
}

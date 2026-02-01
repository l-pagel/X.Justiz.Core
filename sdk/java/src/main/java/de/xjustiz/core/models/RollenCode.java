package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Rolle Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Codeliste GDS.Rollenbezeichnung</a>.
 *  * <p>
 *  *  <u><b>Role codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Code list GDS.RoleName</a>.
 */
@XmlType
@XmlEnum
public enum RollenCode {

    /**
     * <b>Abwesenheitspfleger(in) / Absentee Curator</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Abwesenheitspfleger("001"),

    /**
     * <b>Aliasidentit&#228;t / Alias Identity</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Aliasidentitaet("002"),

    /**
     * <b>Angeh&#246;rige(r) / Relative</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Angehoerige("003"),

    /**
     * <b>Angeklagte(r) / Accused</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    Angeklagte("004"),

    /**
     * <b>Angeschuldigte(r) / Indicted</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Angeschuldigte("005"),

    /**
     * <b>Annehmende(r) / Adopter</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Annehmende("006"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Anschlussberufungsbeklagte("007"),

    /**
     * <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    Anschlussberufungsklaeger("008"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("009")
    @XmlEnumValue("009")
    Anschlussbeschwerdefuehrer("009"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Anschlussbeschwerdegegner("010"),

    /**
     * <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Anschlussrechtsbeschwerdefuehrer("011"),

    /**
     * <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Anschlussrechtsbeschwerdegegner("012"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Anschlussrevisionsbeklagte("013"),

    /**
     * <b>Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Anschlussrevisionsklaeger("014"),

    /**
     * <b>Antragsgegner(in) / Respondent</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Antragsgegner("015"),

    /**
     * <b>Antragsteller(in) / Applicant</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("016")
    @XmlEnumValue("016")
    Antragsteller("016"),

    /**
     * <b>Anzeigeerstatter(in) / Complainant</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("017")
    @XmlEnumValue("017")
    Anzeigeerstatter("017"),

    /**
     * <b>Anzunehmende(r) / Anzunehmende(r)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("018")
    @XmlEnumValue("018")
    Anzunehmende("018"),

    /**
     * <b>Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("019")
    @XmlEnumValue("019")
    Arrestglaeubiger("019"),

    /**
     * <b>Arrestschuldner(in) / Arrestschuldner(in)</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("020")
    @XmlEnumValue("020")
    Arrestschuldner("020"),

    /**
     * <b>Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Aufsichtsbehoerde("021"),

    /**
     * <b>Ausschlagende(r) / Ausschlagende(r)</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("022")
    @XmlEnumValue("022")
    Ausschlagende("022"),

    /**
     * <b>Beamter (Beamtin) / Beamter (Beamtin)</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("023")
    @XmlEnumValue("023")
    Beamter_Beamtin("023"),

    /**
     * <b>Beh&#246;rde / Beh&#246;rde</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("024")
    @XmlEnumValue("024")
    Behoerde("024"),

    /**
     * <b>Beigeladene(r) / Beigeladene(r)</b>
     *  * <p>
     *  *  Code: 025
     *  * <p>
     *  * 
     */
    @JsonProperty("025")
    @XmlEnumValue("025")
    Beigeladene("025"),

    /**
     * <b>Beistand / Beistand</b>
     *  * <p>
     *  *  Code: 026
     *  * <p>
     *  * 
     */
    @JsonProperty("026")
    @XmlEnumValue("026")
    Beistand("026"),

    /**
     * <b>Bekannte(r) / Bekannte(r)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("027")
    @XmlEnumValue("027")
    Bekannte("027"),

    /**
     * <b>Beklagte(r) / Beklagte(r)</b>
     *  * <p>
     *  *  Code: 028
     *  * <p>
     *  * 
     */
    @JsonProperty("028")
    @XmlEnumValue("028")
    Beklagte("028"),

    /**
     * <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("029")
    @XmlEnumValue("029")
    Berufungsbeklagte("029"),

    /**
     * <b>Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 030
     *  * <p>
     *  * 
     */
    @JsonProperty("030")
    @XmlEnumValue("030")
    Berufungsklaeger("030"),

    /**
     * <b>Beschuldigte(r) / Accused (Prelim.)</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("031")
    @XmlEnumValue("031")
    Beschuldigte("031"),

    /**
     * <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 032
     *  * <p>
     *  * 
     */
    @JsonProperty("032")
    @XmlEnumValue("032")
    Beschwerdefuehrer("032"),

    /**
     * <b>Beschwerdegegner(in) / Beschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 033
     *  * <p>
     *  * 
     */
    @JsonProperty("033")
    @XmlEnumValue("033")
    Beschwerdegegner("033"),

    /**
     * <b>Besucher(in) / Besucher(in)</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("034")
    @XmlEnumValue("034")
    Besucher("034"),

    /**
     * <b>Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)</b>
     *  * <p>
     *  *  Code: 036
     *  * <p>
     *  * 
     */
    @JsonProperty("036")
    @XmlEnumValue("036")
    Betreibende_Glaeubige("036"),

    /**
     * <b>Betreuer(in) / Guardian</b>
     *  * <p>
     *  *  Code: 037
     *  * <p>
     *  * 
     */
    @JsonProperty("037")
    @XmlEnumValue("037")
    Betreuer("037"),

    /**
     * <b>Betreute(r) / Ward</b>
     *  * <p>
     *  *  Code: 038
     *  * <p>
     *  * 
     */
    @JsonProperty("038")
    @XmlEnumValue("038")
    Betreute("038"),

    /**
     * <b>Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 039
     *  * <p>
     *  * 
     */
    @JsonProperty("039")
    @XmlEnumValue("039")
    Betreuungsbehoerde("039"),

    /**
     * <b>Betroffene(r) / Betroffene(r)</b>
     *  * <p>
     *  *  Code: 040
     *  * <p>
     *  * 
     */
    @JsonProperty("040")
    @XmlEnumValue("040")
    Betroffene("040"),

    /**
     * <b>Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 041
     *  * <p>
     *  * 
     */
    @JsonProperty("041")
    @XmlEnumValue("041")
    Bevollmaechtigte("041"),

    /**
     * <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("042")
    @XmlEnumValue("042")
    Bewaehrungshelfer("042"),

    /**
     * <b>Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 043
     *  * <p>
     *  * 
     */
    @JsonProperty("043")
    @XmlEnumValue("043")
    Beweisanwalt("043"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("044")
    @XmlEnumValue("044")
    Bruder_Schwester("044"),

    /**
     * <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("045")
    @XmlEnumValue("045")
    Bundeswehrdisziplinaranwalt("045"),

    /**
     * <b>Bu&#223;geldempf&#228;nger(in) / Bu&#223;geldempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 046
     *  * <p>
     *  * 
     */
    @JsonProperty("046")
    @XmlEnumValue("046")
    Bussgeldempfaenger("046"),

    /**
     * <b>Cousin(e) / Cousin(e)</b>
     *  * <p>
     *  *  Code: 047
     *  * <p>
     *  * 
     */
    @JsonProperty("047")
    @XmlEnumValue("047")
    Cousin("047"),

    /**
     * <b>Dienstvorgesetzte(r) / Dienstvorgesetzte(r)</b>
     *  * <p>
     *  *  Code: 048
     *  * <p>
     *  * 
     */
    @JsonProperty("048")
    @XmlEnumValue("048")
    Dienstvorgesetzte("048"),

    /**
     * <b>director / director</b>
     *  * <p>
     *  *  Code: 049
     *  * <p>
     *  * 
     */
    @JsonProperty("049")
    @XmlEnumValue("049")
    director("049"),

    /**
     * <b>Dolmetscher(in) / Interpreter</b>
     *  * <p>
     *  *  Code: 050
     *  * <p>
     *  * 
     */
    @JsonProperty("050")
    @XmlEnumValue("050")
    Dolmetscher("050"),

    /**
     * <b>Dritte(r) / Dritte(r)</b>
     *  * <p>
     *  *  Code: 051
     *  * <p>
     *  * 
     */
    @JsonProperty("051")
    @XmlEnumValue("051")
    Dritte("051"),

    /**
     * <b>Drittschuldner(in) / Drittschuldner(in)</b>
     *  * <p>
     *  *  Code: 052
     *  * <p>
     *  * 
     */
    @JsonProperty("052")
    @XmlEnumValue("052")
    Drittschuldner("052"),

    /**
     * <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("053")
    @XmlEnumValue("053")
    Drittwiderbeklagte("053"),

    /**
     * <b>Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 054
     *  * <p>
     *  * 
     */
    @JsonProperty("054")
    @XmlEnumValue("054")
    Drittwiderklaeger("054"),

    /**
     * <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b>
     *  * <p>
     *  *  Code: 056
     *  * <p>
     *  * 
     */
    @JsonProperty("056")
    @XmlEnumValue("056")
    Ehemann_Ehefrau("056"),

    /**
     * <b>Eigent&#252;mer(in) / Eigent&#252;mer(in)</b>
     *  * <p>
     *  *  Code: 057
     *  * <p>
     *  * 
     */
    @JsonProperty("057")
    @XmlEnumValue("057")
    Eigentuemer("057"),

    /**
     * <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 058
     *  * <p>
     *  * 
     */
    @JsonProperty("058")
    @XmlEnumValue("058")
    Eingetragene_Lebenspartner("058"),

    /**
     * <b>Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 059
     *  * <p>
     *  * 
     */
    @JsonProperty("059")
    @XmlEnumValue("059")
    Einleitungsbehoerde("059"),

    /**
     * <b>Eltern / Eltern</b>
     *  * <p>
     *  *  Code: 060
     *  * <p>
     *  * 
     */
    @JsonProperty("060")
    @XmlEnumValue("060")
    Eltern("060"),

    /**
     * <b>Elternteil / Elternteil</b>
     *  * <p>
     *  *  Code: 061
     *  * <p>
     *  * 
     */
    @JsonProperty("061")
    @XmlEnumValue("061")
    Elternteil("061"),

    /**
     * <b>Enkel(in) / Enkel(in)</b>
     *  * <p>
     *  *  Code: 062
     *  * <p>
     *  * 
     */
    @JsonProperty("062")
    @XmlEnumValue("062")
    Enkel("062"),

    /**
     * <b>Erbe (Erbin) / Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 063
     *  * <p>
     *  * 
     */
    @JsonProperty("063")
    @XmlEnumValue("063")
    Erbe_Erbin("063"),

    /**
     * <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b>
     *  * <p>
     *  *  Code: 064
     *  * <p>
     *  * 
     */
    @JsonProperty("064")
    @XmlEnumValue("064")
    Erbe_Erbin_ausschlagend("064"),

    /**
     * <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("065")
    @XmlEnumValue("065")
    Erbe_Erbin_vorverstorben("065"),

    /**
     * <b>Erblasser(in) / Erblasser(in)</b>
     *  * <p>
     *  *  Code: 066
     *  * <p>
     *  * 
     */
    @JsonProperty("066")
    @XmlEnumValue("066")
    Erblasser("066"),

    /**
     * <b>Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)</b>
     *  * <p>
     *  *  Code: 067
     *  * <p>
     *  * 
     */
    @JsonProperty("067")
    @XmlEnumValue("067")
    Ergaenzungspfleger("067"),

    /**
     * <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 068
     *  * <p>
     *  * 
     */
    @JsonProperty("068")
    @XmlEnumValue("068")
    Erinnerungsfuehrer("068"),

    /**
     * <b>Erinnerungsgegner(in) / Erinnerungsgegner(in)</b>
     *  * <p>
     *  *  Code: 069
     *  * <p>
     *  * 
     */
    @JsonProperty("069")
    @XmlEnumValue("069")
    Erinnerungsgegner("069"),

    /**
     * <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b>
     *  * <p>
     *  *  Code: 070
     *  * <p>
     *  * 
     */
    @JsonProperty("070")
    @XmlEnumValue("070")
    Ersatzbetreuer("070"),

    /**
     * <b>Ersteher(in) / Ersteher(in)</b>
     *  * <p>
     *  *  Code: 071
     *  * <p>
     *  * 
     */
    @JsonProperty("071")
    @XmlEnumValue("071")
    Ersteher("071"),

    /**
     * <b>Erwerber(in) / Erwerber(in)</b>
     *  * <p>
     *  *  Code: 072
     *  * <p>
     *  * 
     */
    @JsonProperty("072")
    @XmlEnumValue("072")
    Erwerber("072"),

    /**
     * <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("073")
    @XmlEnumValue("073")
    Erziehungsberechtigte("073"),

    /**
     * <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b>
     *  * <p>
     *  *  Code: 074
     *  * <p>
     *  * 
     */
    @JsonProperty("074")
    @XmlEnumValue("074")
    Fruehere_Ehegatte_Ehegattin("074"),

    /**
     * <b>Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)</b>
     *  * <p>
     *  *  Code: 075
     *  * <p>
     *  * 
     */
    @JsonProperty("075")
    @XmlEnumValue("075")
    Fruehere_Beklagte("075"),

    /**
     * <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("076")
    @XmlEnumValue("076")
    Fruehere_Beteiligte("076"),

    /**
     * <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 077
     *  * <p>
     *  * 
     */
    @JsonProperty("077")
    @XmlEnumValue("077")
    Fruehere_Glaeubiger("077"),

    /**
     * <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 078
     *  * <p>
     *  * 
     */
    @JsonProperty("078")
    @XmlEnumValue("078")
    Fruehere_Klaeger("078"),

    /**
     * <b>Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)</b>
     *  * <p>
     *  *  Code: 079
     *  * <p>
     *  * 
     */
    @JsonProperty("079")
    @XmlEnumValue("079")
    Fruehere_Soldat("079"),

    /**
     * <b>Gegenvormund / Gegenvormund</b>
     *  * <p>
     *  *  Code: 080
     *  * <p>
     *  * 
     */
    @JsonProperty("080")
    @XmlEnumValue("080")
    Gegenvormund("080"),

    /**
     * <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("081")
    @XmlEnumValue("081")
    Generalbundesanwalt("081"),

    /**
     * <b>Gericht / Gericht</b>
     *  * <p>
     *  *  Code: 082
     *  * <p>
     *  * 
     */
    @JsonProperty("082")
    @XmlEnumValue("082")
    Gericht("082"),

    /**
     * <b>Gerichtsvollzieher(in) / Gerichtsvollzieher(in)</b>
     *  * <p>
     *  *  Code: 083
     *  * <p>
     *  * 
     */
    @JsonProperty("083")
    @XmlEnumValue("083")
    Gerichtsvollzieher("083"),

    /**
     * <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b>
     *  * <p>
     *  *  Code: 084
     *  * <p>
     *  * 
     */
    @JsonProperty("084")
    @XmlEnumValue("084")
    Geschaedigte("084"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 085
     *  * <p>
     *  * 
     */
    @JsonProperty("085")
    @XmlEnumValue("085")
    Geschaeftsfuehrende_Gesellschafter("085"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrer(in) / Gesch&#228;ftsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 086
     *  * <p>
     *  * 
     */
    @JsonProperty("086")
    @XmlEnumValue("086")
    Geschaeftsfuehrer("086"),

    /**
     * <b>Gesetzliche(r) Erbe (Erbin) / Gesetzliche(r) Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 087
     *  * <p>
     *  * 
     */
    @JsonProperty("087")
    @XmlEnumValue("087")
    Gesetzliche_Erbe_Erbin("087"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 088
     *  * <p>
     *  * 
     */
    @JsonProperty("088")
    @XmlEnumValue("088")
    Gesetzliche_Vertreter("088"),

    /**
     * <b>Gl&#228;ubiger(in) / Creditor</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("089")
    @XmlEnumValue("089")
    Glaeubiger("089"),

    /**
     * <b>Gro&#223;eltern / Gro&#223;eltern</b>
     *  * <p>
     *  *  Code: 090
     *  * <p>
     *  * 
     */
    @JsonProperty("090")
    @XmlEnumValue("090")
    Grosseltern("090"),

    /**
     * <b>Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)</b>
     *  * <p>
     *  *  Code: 092
     *  * <p>
     *  * 
     */
    @JsonProperty("092")
    @XmlEnumValue("092")
    Grossvater_Grossmutter("092"),

    /**
     * <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 093
     *  * <p>
     *  * 
     */
    @JsonProperty("093")
    @XmlEnumValue("093")
    Hauptbevollmaechtigte("093"),

    /**
     * <b>Hoferbe (Hoferbin) / Hoferbe (Hoferbin)</b>
     *  * <p>
     *  *  Code: 094
     *  * <p>
     *  * 
     */
    @JsonProperty("094")
    @XmlEnumValue("094")
    Hoferbe_Hoferbin("094"),

    /**
     * <b>Inhaber(in) der Firma / Inhaber(in) der Firma</b>
     *  * <p>
     *  *  Code: 095
     *  * <p>
     *  * 
     */
    @JsonProperty("095")
    @XmlEnumValue("095")
    Inhaber_der_Firma("095"),

    /**
     * <b>Insolvenzverwalter(in) / Insolvency Administrator</b>
     *  * <p>
     *  *  Code: 096
     *  * <p>
     *  * 
     */
    @JsonProperty("096")
    @XmlEnumValue("096")
    Insolvenzverwalter("096"),

    /**
     * <b>Jugendamt / Jugendamt</b>
     *  * <p>
     *  *  Code: 097
     *  * <p>
     *  * 
     */
    @JsonProperty("097")
    @XmlEnumValue("097")
    Jugendamt("097"),

    /**
     * <b>Kammer / Kammer</b>
     *  * <p>
     *  *  Code: 098
     *  * <p>
     *  * 
     */
    @JsonProperty("098")
    @XmlEnumValue("098")
    Kammer("098"),

    /**
     * <b>Kammermitglied / Kammermitglied</b>
     *  * <p>
     *  *  Code: 099
     *  * <p>
     *  * 
     */
    @JsonProperty("099")
    @XmlEnumValue("099")
    Kammermitglied("099"),

    /**
     * <b>Kind / Kind</b>
     *  * <p>
     *  *  Code: 100
     *  * <p>
     *  * 
     */
    @JsonProperty("100")
    @XmlEnumValue("100")
    Kind("100"),

    /**
     * <b>Kl&#228;ger(in) / Plaintiff</b>
     *  * <p>
     *  *  Code: 101
     *  * <p>
     *  * 
     */
    @JsonProperty("101")
    @XmlEnumValue("101")
    Klaeger("101"),

    /**
     * <b>Kontrollbetreuer(in) / Kontrollbetreuer(in)</b>
     *  * <p>
     *  *  Code: 102
     *  * <p>
     *  * 
     */
    @JsonProperty("102")
    @XmlEnumValue("102")
    Kontrollbetreuer("102"),

    /**
     * <b>Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 103
     *  * <p>
     *  * 
     */
    @JsonProperty("103")
    @XmlEnumValue("103")
    Korrespondenzanwalt("103"),

    /**
     * <b>Kostenschuldner(in) / Kostenschuldner(in)</b>
     *  * <p>
     *  *  Code: 104
     *  * <p>
     *  * 
     */
    @JsonProperty("104")
    @XmlEnumValue("104")
    Kostenschuldner("104"),

    /**
     * <b>Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)</b>
     *  * <p>
     *  *  Code: 105
     *  * <p>
     *  * 
     */
    @JsonProperty("105")
    @XmlEnumValue("105")
    Landwirtschaftsrichter("105"),

    /**
     * <b>Lebenspartner(in) / Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 106
     *  * <p>
     *  * 
     */
    @JsonProperty("106")
    @XmlEnumValue("106")
    Lebenspartner("106"),

    /**
     * <b>Liquidator(in) / Liquidator(in)</b>
     *  * <p>
     *  *  Code: 107
     *  * <p>
     *  * 
     */
    @JsonProperty("107")
    @XmlEnumValue("107")
    Liquidator("107"),

    /**
     * <b>Minderj&#228;hrige(r) / Minderj&#228;hrige(r)</b>
     *  * <p>
     *  *  Code: 108
     *  * <p>
     *  * 
     */
    @JsonProperty("108")
    @XmlEnumValue("108")
    Minderjaehrige("108"),

    /**
     * <b>Mitvormund / Mitvormund</b>
     *  * <p>
     *  *  Code: 109
     *  * <p>
     *  * 
     */
    @JsonProperty("109")
    @XmlEnumValue("109")
    Mitvormund("109"),

    /**
     * <b>M&#252;ndel / M&#252;ndel</b>
     *  * <p>
     *  *  Code: 110
     *  * <p>
     *  * 
     */
    @JsonProperty("110")
    @XmlEnumValue("110")
    Muendel("110"),

    /**
     * <b>Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 112
     *  * <p>
     *  * 
     */
    @JsonProperty("112")
    @XmlEnumValue("112")
    Nachbesserungsglaeubiger("112"),

    /**
     * <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b>
     *  * <p>
     *  *  Code: 113
     *  * <p>
     *  * 
     */
    @JsonProperty("113")
    @XmlEnumValue("113")
    Nachlasspfleger("113"),

    /**
     * <b>Nachlassverwalter(in) / Nachlassverwalter(in)</b>
     *  * <p>
     *  *  Code: 114
     *  * <p>
     *  * 
     */
    @JsonProperty("114")
    @XmlEnumValue("114")
    Nachlassverwalter("114"),

    /**
     * <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 115
     *  * <p>
     *  * 
     */
    @JsonProperty("115")
    @XmlEnumValue("115")
    Nebenklaeger("115"),

    /**
     * <b>Neffe (Nichte) / Neffe (Nichte)</b>
     *  * <p>
     *  *  Code: 116
     *  * <p>
     *  * 
     */
    @JsonProperty("116")
    @XmlEnumValue("116")
    Neffe_Nichte("116"),

    /**
     * <b>Nicht verwandt / Nicht verwandt</b>
     *  * <p>
     *  *  Code: 117
     *  * <p>
     *  * 
     */
    @JsonProperty("117")
    @XmlEnumValue("117")
    Nicht_verwandt("117"),

    /**
     * <b>Onkel (Tante) / Onkel (Tante)</b>
     *  * <p>
     *  *  Code: 118
     *  * <p>
     *  * 
     */
    @JsonProperty("118")
    @XmlEnumValue("118")
    Onkel_Tante("118"),

    /**
     * <b>Opfer / Opfer</b>
     *  * <p>
     *  *  Code: 119
     *  * <p>
     *  * 
     */
    @JsonProperty("119")
    @XmlEnumValue("119")
    Opfer("119"),

    /**
     * <b>P&#228;chter(in) / P&#228;chter(in)</b>
     *  * <p>
     *  *  Code: 120
     *  * <p>
     *  * 
     */
    @JsonProperty("120")
    @XmlEnumValue("120")
    Paechter("120"),

    /**
     * <b>Pflegeeltern / Pflegeeltern</b>
     *  * <p>
     *  *  Code: 121
     *  * <p>
     *  * 
     */
    @JsonProperty("121")
    @XmlEnumValue("121")
    Pflegeeltern("121"),

    /**
     * <b>Pfleger(in) / Pfleger(in)</b>
     *  * <p>
     *  *  Code: 123
     *  * <p>
     *  * 
     */
    @JsonProperty("123")
    @XmlEnumValue("123")
    Pfleger("123"),

    /**
     * <b>Pfleger(in) f&#252;r das Sammelverm&#246;gen / Pfleger(in) f&#252;r das Sammelverm&#246;gen</b>
     *  * <p>
     *  *  Code: 124
     *  * <p>
     *  * 
     */
    @JsonProperty("124")
    @XmlEnumValue("124")
    Pfleger_fuer_das_Sammelvermoegen("124"),

    /**
     * <b>Pfleger(in) f&#252;r die Leibesfrucht / Pfleger(in) f&#252;r die Leibesfrucht</b>
     *  * <p>
     *  *  Code: 125
     *  * <p>
     *  * 
     */
    @JsonProperty("125")
    @XmlEnumValue("125")
    Pfleger_fuer_die_Leibesfrucht("125"),

    /**
     * <b>Pflegevater (Pflegemutter) des M&#252;ndels / Pflegevater (Pflegemutter) des M&#252;ndels</b>
     *  * <p>
     *  *  Code: 126
     *  * <p>
     *  * 
     */
    @JsonProperty("126")
    @XmlEnumValue("126")
    Pflegevater_Pflegemutter_des_Muendels("126"),

    /**
     * <b>Pflegling / Pflegling</b>
     *  * <p>
     *  *  Code: 127
     *  * <p>
     *  * 
     */
    @JsonProperty("127")
    @XmlEnumValue("127")
    Pflegling("127"),

    /**
     * <b>Pflichtverteidiger(in) / Pflichtverteidiger(in)</b>
     *  * <p>
     *  *  Code: 128
     *  * <p>
     *  * 
     */
    @JsonProperty("128")
    @XmlEnumValue("128")
    Pflichtverteidiger("128"),

    /**
     * <b>Polizei / Polizei</b>
     *  * <p>
     *  *  Code: 129
     *  * <p>
     *  * 
     */
    @JsonProperty("129")
    @XmlEnumValue("129")
    Polizei("129"),

    /**
     * <b>Privatbeklagte(r) / Privatbeklagte(r)</b>
     *  * <p>
     *  *  Code: 130
     *  * <p>
     *  * 
     */
    @JsonProperty("130")
    @XmlEnumValue("130")
    Privatbeklagte("130"),

    /**
     * <b>Privatkl&#228;ger(in) / Privatkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 131
     *  * <p>
     *  * 
     */
    @JsonProperty("131")
    @XmlEnumValue("131")
    Privatklaeger("131"),

    /**
     * <b>Prozessbevollm&#228;chtigte(r) / Prozessbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 132
     *  * <p>
     *  * 
     */
    @JsonProperty("132")
    @XmlEnumValue("132")
    Prozessbevollmaechtigte("132"),

    /**
     * <b>Prozesskostenhilfe-Anwalt (-Anw&#228;ltin) / Prozesskostenhilfe-Anwalt (-Anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 133
     *  * <p>
     *  * 
     */
    @JsonProperty("133")
    @XmlEnumValue("133")
    Prozesskostenhilfe_Anwalt_Anwaeltin("133"),

    /**
     * <b>Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 134
     *  * <p>
     *  * 
     */
    @JsonProperty("134")
    @XmlEnumValue("134")
    Prozesskostenhilfe_Korrespondenzanwalt("134"),

    /**
     * <b>Rechtsanwalt (-anw&#228;ltin) / Rechtsanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 135
     *  * <p>
     *  * 
     */
    @JsonProperty("135")
    @XmlEnumValue("135")
    Rechtsanwalt("135"),

    /**
     * <b>Rechtsbeistand / Rechtsbeistand</b>
     *  * <p>
     *  *  Code: 136
     *  * <p>
     *  * 
     */
    @JsonProperty("136")
    @XmlEnumValue("136")
    Rechtsbeistand("136"),

    /**
     * <b>Rechtsbeschwerdef&#252;hrer(in) / Rechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 137
     *  * <p>
     *  * 
     */
    @JsonProperty("137")
    @XmlEnumValue("137")
    Rechtsbeschwerdefuehrer("137"),

    /**
     * <b>Rechtsbeschwerdegegner(in) / Rechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 138
     *  * <p>
     *  * 
     */
    @JsonProperty("138")
    @XmlEnumValue("138")
    Rechtsbeschwerdegegner("138"),

    /**
     * <b>Revisionsbeklagte(r) / Revisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 139
     *  * <p>
     *  * 
     */
    @JsonProperty("139")
    @XmlEnumValue("139")
    Revisionsbeklagte("139"),

    /**
     * <b>Revisionskl&#228;ger(in) / Revisionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 140
     *  * <p>
     *  * 
     */
    @JsonProperty("140")
    @XmlEnumValue("140")
    Revisionsklaeger("140"),

    /**
     * <b>Sachbearbeiter(in) / Sachbearbeiter(in)</b>
     *  * <p>
     *  *  Code: 141
     *  * <p>
     *  * 
     */
    @JsonProperty("141")
    @XmlEnumValue("141")
    Sachbearbeiter("141"),

    /**
     * <b>Sachverst&#228;ndige(r) / Sachverst&#228;ndige(r)</b>
     *  * <p>
     *  *  Code: 142
     *  * <p>
     *  * 
     */
    @JsonProperty("142")
    @XmlEnumValue("142")
    Sachverstaendige("142"),

    /**
     * <b>Schuldner(in) / Debtor</b>
     *  * <p>
     *  *  Code: 143
     *  * <p>
     *  * 
     */
    @JsonProperty("143")
    @XmlEnumValue("143")
    Schuldner("143"),

    /**
     * <b>Schwager (Schw&#228;gerin) / Schwager (Schw&#228;gerin)</b>
     *  * <p>
     *  *  Code: 144
     *  * <p>
     *  * 
     */
    @JsonProperty("144")
    @XmlEnumValue("144")
    Schwager_Schwaegerin("144"),

    /**
     * <b>Schwiegersohn (Schwiegertochter) / Schwiegersohn (Schwiegertochter)</b>
     *  * <p>
     *  *  Code: 146
     *  * <p>
     *  * 
     */
    @JsonProperty("146")
    @XmlEnumValue("146")
    Schwiegersohn_Schwiegertochter("146"),

    /**
     * <b>Schwiegervater (Schwiegermutter) / Schwiegervater (Schwiegermutter)</b>
     *  * <p>
     *  *  Code: 148
     *  * <p>
     *  * 
     */
    @JsonProperty("148")
    @XmlEnumValue("148")
    Schwiegervater_Schwiegermutter("148"),

    /**
     * <b>Sohn (Tochter) / Sohn (Tochter)</b>
     *  * <p>
     *  *  Code: 149
     *  * <p>
     *  * 
     */
    @JsonProperty("149")
    @XmlEnumValue("149")
    Sohn_Tochter("149"),

    /**
     * <b>Soldat(in) / Soldat(in)</b>
     *  * <p>
     *  *  Code: 150
     *  * <p>
     *  * 
     */
    @JsonProperty("150")
    @XmlEnumValue("150")
    Soldat("150"),

    /**
     * <b>Sonstige(r) Beteiligte(r) / Sonstige(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 151
     *  * <p>
     *  * 
     */
    @JsonProperty("151")
    @XmlEnumValue("151")
    Sonstige_Beteiligte("151"),

    /**
     * <b>Sonstige(r) Vertreter(in) / Sonstige(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 152
     *  * <p>
     *  * 
     */
    @JsonProperty("152")
    @XmlEnumValue("152")
    Sonstige_Vertreter("152"),

    /**
     * <b>Staatsanwaltschaft / Staatsanwaltschaft</b>
     *  * <p>
     *  *  Code: 153
     *  * <p>
     *  * 
     */
    @JsonProperty("153")
    @XmlEnumValue("153")
    Staatsanwaltschaft("153"),

    /**
     * <b>Stiefeltern / Stiefeltern</b>
     *  * <p>
     *  *  Code: 154
     *  * <p>
     *  * 
     */
    @JsonProperty("154")
    @XmlEnumValue("154")
    Stiefeltern("154"),

    /**
     * <b>Stiefvater (Stiefmutter) / Stiefvater (Stiefmutter)</b>
     *  * <p>
     *  *  Code: 156
     *  * <p>
     *  * 
     */
    @JsonProperty("156")
    @XmlEnumValue("156")
    Stiefvater_Stiefmutter("156"),

    /**
     * <b>Terminsbevollm&#228;chtigte(r) / Terminsbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 161
     *  * <p>
     *  * 
     */
    @JsonProperty("161")
    @XmlEnumValue("161")
    Terminsbevollmaechtigte("161"),

    /**
     * <b>Testamentsvollstrecker(in) / Testamentsvollstrecker(in)</b>
     *  * <p>
     *  *  Code: 162
     *  * <p>
     *  * 
     */
    @JsonProperty("162")
    @XmlEnumValue("162")
    Testamentsvollstrecker("162"),

    /**
     * <b>Testator(in) / Testator(in)</b>
     *  * <p>
     *  *  Code: 163
     *  * <p>
     *  * 
     */
    @JsonProperty("163")
    @XmlEnumValue("163")
    Testator("163"),

    /**
     * <b>&#220;bernehmer(in) / &#220;bernehmer(in)</b>
     *  * <p>
     *  *  Code: 164
     *  * <p>
     *  * 
     */
    @JsonProperty("164")
    @XmlEnumValue("164")
    Uebernehmer("164"),

    /**
     * <b>Unterbevollm&#228;chtigte(r) / Unterbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 165
     *  * <p>
     *  * 
     */
    @JsonProperty("165")
    @XmlEnumValue("165")
    Unterbevollmaechtigte("165"),

    /**
     * <b>Ur-Enkel(in) / Ur-Enkel(in)</b>
     *  * <p>
     *  *  Code: 166
     *  * <p>
     *  * 
     */
    @JsonProperty("166")
    @XmlEnumValue("166")
    Ur_Enkel("166"),

    /**
     * <b>Vater (Mutter) / Vater (Mutter)</b>
     *  * <p>
     *  *  Code: 167
     *  * <p>
     *  * 
     */
    @JsonProperty("167")
    @XmlEnumValue("167")
    Vater_Mutter("167"),

    /**
     * <b>Ver&#228;u&#223;erer (Ver&#228;u&#223;erin) / Ver&#228;u&#223;erer (Ver&#228;u&#223;erin)</b>
     *  * <p>
     *  *  Code: 168
     *  * <p>
     *  * 
     */
    @JsonProperty("168")
    @XmlEnumValue("168")
    Veraeusserer_Veraeusserin("168"),

    /**
     * <b>Verfahrensbevollm&#228;chtigte(r) / Verfahrensbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 169
     *  * <p>
     *  * 
     */
    @JsonProperty("169")
    @XmlEnumValue("169")
    Verfahrensbevollmaechtigte("169"),

    /**
     * <b>Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin) / Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 170
     *  * <p>
     *  * 
     */
    @JsonProperty("170")
    @XmlEnumValue("170")
    Verfahrenskostenhilfe_Anwalt_Anwaeltin("170"),

    /**
     * <b>Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 171
     *  * <p>
     *  * 
     */
    @JsonProperty("171")
    @XmlEnumValue("171")
    Verfahrenskostenhilfe_Korrespondenzanwalt("171"),

    /**
     * <b>Verfahrenspfleger(in) / Verfahrenspfleger(in)</b>
     *  * <p>
     *  *  Code: 172
     *  * <p>
     *  * 
     */
    @JsonProperty("172")
    @XmlEnumValue("172")
    Verfahrenspfleger("172"),

    /**
     * <b>Verfahrensvertreter(in) (&#167;787 ZPO) / Verfahrensvertreter(in) (&#167;787 ZPO)</b>
     *  * <p>
     *  *  Code: 173
     *  * <p>
     *  * 
     */
    @JsonProperty("173")
    @XmlEnumValue("173")
    Verfahrensvertreter_787_ZPO("173"),

    /**
     * <b>Verf&#252;gungsbeklagte(r) / Verf&#252;gungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 174
     *  * <p>
     *  * 
     */
    @JsonProperty("174")
    @XmlEnumValue("174")
    Verfuegungsbeklagte("174"),

    /**
     * <b>Verf&#252;gungskl&#228;ger(in) / Verf&#252;gungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 175
     *  * <p>
     *  * 
     */
    @JsonProperty("175")
    @XmlEnumValue("175")
    Verfuegungsklaeger("175"),

    /**
     * <b>Verkehrsanwalt (-anw&#228;ltin) / Verkehrsanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 176
     *  * <p>
     *  * 
     */
    @JsonProperty("176")
    @XmlEnumValue("176")
    Verkehrsanwalt("176"),

    /**
     * <b>Verlobte(r) / Verlobte(r)</b>
     *  * <p>
     *  *  Code: 177
     *  * <p>
     *  * 
     */
    @JsonProperty("177")
    @XmlEnumValue("177")
    Verlobte("177"),

    /**
     * <b>Verm&#228;chtnisnehmer(in) / Verm&#228;chtnisnehmer(in)</b>
     *  * <p>
     *  *  Code: 178
     *  * <p>
     *  * 
     */
    @JsonProperty("178")
    @XmlEnumValue("178")
    Vermaechtnisnehmer("178"),

    /**
     * <b>Vermieter(in) / Vermieter(in)</b>
     *  * <p>
     *  *  Code: 179
     *  * <p>
     *  * 
     */
    @JsonProperty("179")
    @XmlEnumValue("179")
    Vermieter("179"),

    /**
     * <b>Verp&#228;chter(in) / Verp&#228;chter(in)</b>
     *  * <p>
     *  *  Code: 180
     *  * <p>
     *  * 
     */
    @JsonProperty("180")
    @XmlEnumValue("180")
    Verpaechter("180"),

    /**
     * <b>Versorgungstr&#228;ger(in) / Versorgungstr&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 181
     *  * <p>
     *  * 
     */
    @JsonProperty("181")
    @XmlEnumValue("181")
    Versorgungstraeger("181"),

    /**
     * <b>Verteidiger(in) / Defense Counsel</b>
     *  * <p>
     *  *  Code: 182
     *  * <p>
     *  * 
     */
    @JsonProperty("182")
    @XmlEnumValue("182")
    Verteidiger("182"),

    /**
     * <b>Vertreter(in) der Interessen des Ausgleichsfonds / Vertreter(in) der Interessen des Ausgleichsfonds</b>
     *  * <p>
     *  *  Code: 183
     *  * <p>
     *  * 
     */
    @JsonProperty("183")
    @XmlEnumValue("183")
    Vertreter_der_Interessen_des_Ausgleichsfonds("183"),

    /**
     * <b>Vertreter(in) der Staatskasse / Vertreter(in) der Staatskasse</b>
     *  * <p>
     *  *  Code: 184
     *  * <p>
     *  * 
     */
    @JsonProperty("184")
    @XmlEnumValue("184")
    Vertreter_der_Staatskasse("184"),

    /**
     * <b>Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht / Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht</b>
     *  * <p>
     *  *  Code: 185
     *  * <p>
     *  * 
     */
    @JsonProperty("185")
    @XmlEnumValue("185")
    Vertreter_des_Bundesinteresses_beim_Bundesverwaltungsgericht("185"),

    /**
     * <b>Vertreter(in) des &#246;ffentlichen Interesses / Vertreter(in) des &#246;ffentlichen Interesses</b>
     *  * <p>
     *  *  Code: 186
     *  * <p>
     *  * 
     */
    @JsonProperty("186")
    @XmlEnumValue("186")
    Vertreter_des_oeffentlichen_Interesses("186"),

    /**
     * <b>Verurteilte(r) / Verurteilte(r)</b>
     *  * <p>
     *  *  Code: 187
     *  * <p>
     *  * 
     */
    @JsonProperty("187")
    @XmlEnumValue("187")
    Verurteilte("187"),

    /**
     * <b>Verwalter(in) der Wohnungseigent&#252;mergemeinschaft / Verwalter(in) der Wohnungseigent&#252;mergemeinschaft</b>
     *  * <p>
     *  *  Code: 188
     *  * <p>
     *  * 
     */
    @JsonProperty("188")
    @XmlEnumValue("188")
    Verwalter_der_Wohnungseigentuemergemeinschaft("188"),

    /**
     * <b>Verwaltungsbeh&#246;rde / Verwaltungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 189
     *  * <p>
     *  * 
     */
    @JsonProperty("189")
    @XmlEnumValue("189")
    Verwaltungsbehoerde("189"),

    /**
     * <b>Vollstreckungsgl&#228;ubiger(in) / Vollstreckungsgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 190
     *  * <p>
     *  * 
     */
    @JsonProperty("190")
    @XmlEnumValue("190")
    Vollstreckungsglaeubiger("190"),

    /**
     * <b>Vollstreckungsschuldner(in) / Vollstreckungsschuldner(in)</b>
     *  * <p>
     *  *  Code: 191
     *  * <p>
     *  * 
     */
    @JsonProperty("191")
    @XmlEnumValue("191")
    Vollstreckungsschuldner("191"),

    /**
     * <b>Vorl&#228;ufige(r) Betreuer(in) / Vorl&#228;ufige(r) Betreuer(in)</b>
     *  * <p>
     *  *  Code: 192
     *  * <p>
     *  * 
     */
    @JsonProperty("192")
    @XmlEnumValue("192")
    Vorlaeufige_Betreuer("192"),

    /**
     * <b>Vormund / Vormund</b>
     *  * <p>
     *  *  Code: 193
     *  * <p>
     *  * 
     */
    @JsonProperty("193")
    @XmlEnumValue("193")
    Vormund("193"),

    /**
     * <b>Vorstand / Vorstand</b>
     *  * <p>
     *  *  Code: 194
     *  * <p>
     *  * 
     */
    @JsonProperty("194")
    @XmlEnumValue("194")
    Vorstand("194"),

    /**
     * <b>Vorsorgebevollm&#228;chtigte(r) / Vorsorgebevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 195
     *  * <p>
     *  * 
     */
    @JsonProperty("195")
    @XmlEnumValue("195")
    Vorsorgebevollmaechtigte("195"),

    /**
     * <b>Wahlverteidiger(in) / Wahlverteidiger(in)</b>
     *  * <p>
     *  *  Code: 196
     *  * <p>
     *  * 
     */
    @JsonProperty("196")
    @XmlEnumValue("196")
    Wahlverteidiger("196"),

    /**
     * <b>Widerbeklagte(r) / Widerbeklagte(r)</b>
     *  * <p>
     *  *  Code: 197
     *  * <p>
     *  * 
     */
    @JsonProperty("197")
    @XmlEnumValue("197")
    Widerbeklagte("197"),

    /**
     * <b>Widerkl&#228;ger(in) / Widerkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 198
     *  * <p>
     *  * 
     */
    @JsonProperty("198")
    @XmlEnumValue("198")
    Widerklaeger("198"),

    /**
     * <b>Wiederaufnahmebeklagte(r) / Wiederaufnahmebeklagte(r)</b>
     *  * <p>
     *  *  Code: 199
     *  * <p>
     *  * 
     */
    @JsonProperty("199")
    @XmlEnumValue("199")
    Wiederaufnahmebeklagte("199"),

    /**
     * <b>Wiederaufnahmekl&#228;ger(in) / Wiederaufnahmekl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 200
     *  * <p>
     *  * 
     */
    @JsonProperty("200")
    @XmlEnumValue("200")
    Wiederaufnahmeklaeger("200"),

    /**
     * <b>Zahlungs- und Auflagenempf&#228;nger(in) / Zahlungs- und Auflagenempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 201
     *  * <p>
     *  * 
     */
    @JsonProperty("201")
    @XmlEnumValue("201")
    Zahlungs_und_Auflagenempfaenger("201"),

    /**
     * <b>Zeuge (Zeugin) / Zeuge (Zeugin)</b>
     *  * <p>
     *  *  Code: 202
     *  * <p>
     *  * 
     */
    @JsonProperty("202")
    @XmlEnumValue("202")
    Zeuge_Zeugin("202"),

    /**
     * <b>Zeugenbeistand / Zeugenbeistand</b>
     *  * <p>
     *  *  Code: 203
     *  * <p>
     *  * 
     */
    @JsonProperty("203")
    @XmlEnumValue("203")
    Zeugenbeistand("203"),

    /**
     * <b>Zulassungsantragsgegner(in) / Zulassungsantragsgegner(in)</b>
     *  * <p>
     *  *  Code: 204
     *  * <p>
     *  * 
     */
    @JsonProperty("204")
    @XmlEnumValue("204")
    Zulassungsantragsgegner("204"),

    /**
     * <b>Zulassungsantragsteller(in) / Zulassungsantragsteller(in)</b>
     *  * <p>
     *  *  Code: 205
     *  * <p>
     *  * 
     */
    @JsonProperty("205")
    @XmlEnumValue("205")
    Zulassungsantragsteller("205"),

    /**
     * <b>Zustellungsbevollm&#228;chtigte(r) / Zustellungsbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 206
     *  * <p>
     *  * 
     */
    @JsonProperty("206")
    @XmlEnumValue("206")
    Zustellungsbevollmaechtigte("206"),

    /**
     * <b>Zustellungsvertreter(in) (&#167;6 ZVG) / Zustellungsvertreter(in) (&#167;6 ZVG)</b>
     *  * <p>
     *  *  Code: 207
     *  * <p>
     *  * 
     */
    @JsonProperty("207")
    @XmlEnumValue("207")
    Zustellungsvertreter_6_ZVG("207"),

    /**
     * <b>Notar(in) / Notary</b>
     *  * <p>
     *  *  Code: 208
     *  * <p>
     *  * 
     */
    @JsonProperty("208")
    @XmlEnumValue("208")
    Notar("208"),

    /**
     * <b>Auskunftsempf&#228;nger(in) / Auskunftsempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 209
     *  * <p>
     *  * 
     */
    @JsonProperty("209")
    @XmlEnumValue("209")
    Auskunftsempfaenger("209"),

    /**
     * <b>Melder(in) / Melder(in)</b>
     *  * <p>
     *  *  Code: 210
     *  * <p>
     *  * 
     */
    @JsonProperty("210")
    @XmlEnumValue("210")
    Melder("210"),

    /**
     * <b>Verwahrstelle / Verwahrstelle</b>
     *  * <p>
     *  *  Code: 211
     *  * <p>
     *  * 
     */
    @JsonProperty("211")
    @XmlEnumValue("211")
    Verwahrstelle("211"),

    /**
     * <b>Aussteller(in) / Aussteller(in)</b>
     *  * <p>
     *  *  Code: 212
     *  * <p>
     *  * 
     */
    @JsonProperty("212")
    @XmlEnumValue("212")
    Aussteller("212"),

    /**
     * <b>Berechtigte(r) / Berechtigte(r)</b>
     *  * <p>
     *  *  Code: 213
     *  * <p>
     *  * 
     */
    @JsonProperty("213")
    @XmlEnumValue("213")
    Berechtigte("213"),

    /**
     * <b>Berechtigte(r) an einem Recht / Berechtigte(r) an einem Recht</b>
     *  * <p>
     *  *  Code: 214
     *  * <p>
     *  * 
     */
    @JsonProperty("214")
    @XmlEnumValue("214")
    Berechtigte_an_einem_Recht("214"),

    /**
     * <b>Einreicher(in) / Einreicher(in)</b>
     *  * <p>
     *  *  Code: 215
     *  * <p>
     *  * 
     */
    @JsonProperty("215")
    @XmlEnumValue("215")
    Einreicher("215"),

    /**
     * <b>Erbbauberechtigte(r) / Erbbauberechtigte(r)</b>
     *  * <p>
     *  *  Code: 216
     *  * <p>
     *  * 
     */
    @JsonProperty("216")
    @XmlEnumValue("216")
    Erbbauberechtigte("216"),

    /**
     * <b>Finanzamt / Finanzamt</b>
     *  * <p>
     *  *  Code: 217
     *  * <p>
     *  * 
     */
    @JsonProperty("217")
    @XmlEnumValue("217")
    Finanzamt("217"),

    /**
     * <b>Grundbuchvertreter(in) / Grundbuchvertreter(in)</b>
     *  * <p>
     *  *  Code: 218
     *  * <p>
     *  * 
     */
    @JsonProperty("218")
    @XmlEnumValue("218")
    Grundbuchvertreter("218"),

    /**
     * <b>Insolvenzgericht / Insolvenzgericht</b>
     *  * <p>
     *  *  Code: 219
     *  * <p>
     *  * 
     */
    @JsonProperty("219")
    @XmlEnumValue("219")
    Insolvenzgericht("219"),

    /**
     * <b>Mitteilungsempf&#228;nger(in) / Mitteilungsempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 220
     *  * <p>
     *  * 
     */
    @JsonProperty("220")
    @XmlEnumValue("220")
    Mitteilungsempfaenger("220"),

    /**
     * <b>Nacherbe (Nacherbin) / Nacherbe (Nacherbin)</b>
     *  * <p>
     *  *  Code: 221
     *  * <p>
     *  * 
     */
    @JsonProperty("221")
    @XmlEnumValue("221")
    Nacherbe_Nacherbin("221"),

    /**
     * <b>Rechnungsempf&#228;nger(in) / Rechnungsempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 222
     *  * <p>
     *  * 
     */
    @JsonProperty("222")
    @XmlEnumValue("222")
    Rechnungsempfaenger("222"),

    /**
     * <b>Veranlasser(in) / Veranlasser(in)</b>
     *  * <p>
     *  *  Code: 223
     *  * <p>
     *  * 
     */
    @JsonProperty("223")
    @XmlEnumValue("223")
    Veranlasser("223"),

    /**
     * <b>Versteigerungsabteilung / Versteigerungsabteilung</b>
     *  * <p>
     *  *  Code: 224
     *  * <p>
     *  * 
     */
    @JsonProperty("224")
    @XmlEnumValue("224")
    Versteigerungsabteilung("224"),

    /**
     * <b>Vertretungsberechtigte(r) / Vertretungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 225
     *  * <p>
     *  * 
     */
    @JsonProperty("225")
    @XmlEnumValue("225")
    Vertretungsberechtigte("225"),

    /**
     * <b>Zweitschuldner(in) / Zweitschuldner(in)</b>
     *  * <p>
     *  *  Code: 226
     *  * <p>
     *  * 
     */
    @JsonProperty("226")
    @XmlEnumValue("226")
    Zweitschuldner("226"),

    /**
     * <b>Vertreter(in) / Vertreter(in)</b>
     *  * <p>
     *  *  Code: 227
     *  * <p>
     *  * 
     */
    @JsonProperty("227")
    @XmlEnumValue("227")
    Vertreter("227"),

    /**
     * <b>Arbeitgeber(in) / Arbeitgeber(in)</b>
     *  * <p>
     *  *  Code: 228
     *  * <p>
     *  * 
     */
    @JsonProperty("228")
    @XmlEnumValue("228")
    Arbeitgeber("228"),

    /**
     * <b>RV-Tr&#228;ger(in) / RV-Tr&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 229
     *  * <p>
     *  * 
     */
    @JsonProperty("229")
    @XmlEnumValue("229")
    RV_Traeger("229"),

    /**
     * <b>Vollstreckungsstelle / Vollstreckungsstelle</b>
     *  * <p>
     *  *  Code: 230
     *  * <p>
     *  * 
     */
    @JsonProperty("230")
    @XmlEnumValue("230")
    Vollstreckungsstelle("230"),

    /**
     * <b>Abk&#246;mmling / Abk&#246;mmling</b>
     *  * <p>
     *  *  Code: 231
     *  * <p>
     *  * 
     */
    @JsonProperty("231")
    @XmlEnumValue("231")
    Abkoemmling("231"),

    /**
     * <b>Kreditnehmer(in) / Kreditnehmer(in)</b>
     *  * <p>
     *  *  Code: 232
     *  * <p>
     *  * 
     */
    @JsonProperty("232")
    @XmlEnumValue("232")
    Kreditnehmer("232"),

    /**
     * <b>Neu vorzutragende(r) Eigent&#252;mer(in) / Neu vorzutragende(r) Eigent&#252;mer(in)</b>
     *  * <p>
     *  *  Code: 233
     *  * <p>
     *  * 
     */
    @JsonProperty("233")
    @XmlEnumValue("233")
    Neu_vorzutragende_Eigentuemer("233"),

    /**
     * <b>Notariatsverwalter(in) / Notariatsverwalter(in)</b>
     *  * <p>
     *  *  Code: 234
     *  * <p>
     *  * 
     */
    @JsonProperty("234")
    @XmlEnumValue("234")
    Notariatsverwalter("234"),

    /**
     * <b>Notarvertreter(in) / Notarvertreter(in)</b>
     *  * <p>
     *  *  Code: 235
     *  * <p>
     *  * 
     */
    @JsonProperty("235")
    @XmlEnumValue("235")
    Notarvertreter("235"),

    /**
     * <b>Partei kraft Amtes / Partei kraft Amtes</b>
     *  * <p>
     *  *  Code: 236
     *  * <p>
     *  * 
     */
    @JsonProperty("236")
    @XmlEnumValue("236")
    Partei_kraft_Amtes("236"),

    /**
     * <b>Sequester / Sequester</b>
     *  * <p>
     *  *  Code: 237
     *  * <p>
     *  * 
     */
    @JsonProperty("237")
    @XmlEnumValue("237")
    Sequester("237"),

    /**
     * <b>Treuh&#228;nder(in) / Treuh&#228;nder(in)</b>
     *  * <p>
     *  *  Code: 238
     *  * <p>
     *  * 
     */
    @JsonProperty("238")
    @XmlEnumValue("238")
    Treuhaender("238"),

    /**
     * <b>Zustimmende(r) / Zustimmende(r)</b>
     *  * <p>
     *  *  Code: 239
     *  * <p>
     *  * 
     */
    @JsonProperty("239")
    @XmlEnumValue("239")
    Zustimmende("239"),

    /**
     * <b>Gl&#228;ubigervertreter(in) / Gl&#228;ubigervertreter(in)</b>
     *  * <p>
     *  *  Code: 240
     *  * <p>
     *  * 
     */
    @JsonProperty("240")
    @XmlEnumValue("240")
    Glaeubigervertreter("240"),

    /**
     * <b>Schuldnervertreter(in) / Schuldnervertreter(in)</b>
     *  * <p>
     *  *  Code: 241
     *  * <p>
     *  * 
     */
    @JsonProperty("241")
    @XmlEnumValue("241")
    Schuldnervertreter("241"),

    /**
     * <b>Zahlungsempf&#228;nger(in) / Zahlungsempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 242
     *  * <p>
     *  * 
     */
    @JsonProperty("242")
    @XmlEnumValue("242")
    Zahlungsempfaenger("242"),

    /**
     * <b>Anteilsinhaber(in) / Anteilsinhaber(in)</b>
     *  * <p>
     *  *  Code: 243
     *  * <p>
     *  * 
     */
    @JsonProperty("243")
    @XmlEnumValue("243")
    Anteilsinhaber("243"),

    /**
     * <b>Antragsteller(in) -Er&#246;ffnung / Antragsteller(in) -Er&#246;ffnung</b>
     *  * <p>
     *  *  Code: 244
     *  * <p>
     *  * 
     */
    @JsonProperty("244")
    @XmlEnumValue("244")
    Antragsteller_Eroeffnung("244"),

    /**
     * <b>Debitor(in) / Debitor(in)</b>
     *  * <p>
     *  *  Code: 245
     *  * <p>
     *  * 
     */
    @JsonProperty("245")
    @XmlEnumValue("245")
    Debitor("245"),

    /**
     * <b>Gesellschafter(in) / Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 246
     *  * <p>
     *  * 
     */
    @JsonProperty("246")
    @XmlEnumValue("246")
    Gesellschafter("246"),

    /**
     * <b>Handlungsbevollm&#228;chtigte(r) / Handlungsbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 247
     *  * <p>
     *  * 
     */
    @JsonProperty("247")
    @XmlEnumValue("247")
    Handlungsbevollmaechtigte("247"),

    /**
     * <b>Mitglied einer Gesamt-Anteilsinhaberschaft / Mitglied einer Gesamt-Anteilsinhaberschaft</b>
     *  * <p>
     *  *  Code: 248
     *  * <p>
     *  * 
     */
    @JsonProperty("248")
    @XmlEnumValue("248")
    Mitglied_einer_Gesamt_Anteilsinhaberschaft("248"),

    /**
     * <b>Mitglied einer Gl&#228;ubigergemeinschaft / Mitglied einer Gl&#228;ubigergemeinschaft</b>
     *  * <p>
     *  *  Code: 249
     *  * <p>
     *  * 
     */
    @JsonProperty("249")
    @XmlEnumValue("249")
    Mitglied_einer_Glaeubigergemeinschaft("249"),

    /**
     * <b>Mitreeder(in) / Mitreeder(in)</b>
     *  * <p>
     *  *  Code: 250
     *  * <p>
     *  * 
     */
    @JsonProperty("250")
    @XmlEnumValue("250")
    Mitreeder("250"),

    /**
     * <b>Partner(in) / Partner(in)</b>
     *  * <p>
     *  *  Code: 251
     *  * <p>
     *  * 
     */
    @JsonProperty("251")
    @XmlEnumValue("251")
    Partner("251"),

    /**
     * <b>Pers&#246;nlich haftende(r) Gesellschafter(in) / Pers&#246;nlich haftende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 252
     *  * <p>
     *  * 
     */
    @JsonProperty("252")
    @XmlEnumValue("252")
    Persoenlich_haftende_Gesellschafter("252"),

    /**
     * <b>Prozesspfleger(in) / Prozesspfleger(in)</b>
     *  * <p>
     *  *  Code: 253
     *  * <p>
     *  * 
     */
    @JsonProperty("253")
    @XmlEnumValue("253")
    Prozesspfleger("253"),

    /**
     * <b>Sachwalter(in) / Sachwalter(in)</b>
     *  * <p>
     *  *  Code: 254
     *  * <p>
     *  * 
     */
    @JsonProperty("254")
    @XmlEnumValue("254")
    Sachwalter("254"),

    /**
     * <b>Treuh&#228;nder(in) (Wohlverhaltensperiode) / Treuh&#228;nder(in) (Wohlverhaltensperiode)</b>
     *  * <p>
     *  *  Code: 255
     *  * <p>
     *  * 
     */
    @JsonProperty("255")
    @XmlEnumValue("255")
    Treuhaender_Wohlverhaltensperiode("255"),

    /**
     * <b>Verm&#246;genstr&#228;ger(in) / Verm&#246;genstr&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 256
     *  * <p>
     *  * 
     */
    @JsonProperty("256")
    @XmlEnumValue("256")
    Vermoegenstraeger("256"),

    /**
     * <b>Vorl&#228;ufige(r) Insolvenzverwalter(in) / Vorl&#228;ufige(r) Insolvenzverwalter(in)</b>
     *  * <p>
     *  *  Code: 257
     *  * <p>
     *  * 
     */
    @JsonProperty("257")
    @XmlEnumValue("257")
    Vorlaeufige_Insolvenzverwalter("257"),

    /**
     * <b>Vorl&#228;ufige(r) Treuh&#228;nder(in) / Vorl&#228;ufige(r) Treuh&#228;nder(in)</b>
     *  * <p>
     *  *  Code: 258
     *  * <p>
     *  * 
     */
    @JsonProperty("258")
    @XmlEnumValue("258")
    Vorlaeufige_Treuhaender("258"),

    /**
     * <b>Sondersachwalter(in) / Sondersachwalter(in)</b>
     *  * <p>
     *  *  Code: 259
     *  * <p>
     *  * 
     */
    @JsonProperty("259")
    @XmlEnumValue("259")
    Sondersachwalter("259"),

    /**
     * <b>Sonderinsolvenzverwalter(in) / Sonderinsolvenzverwalter(in)</b>
     *  * <p>
     *  *  Code: 260
     *  * <p>
     *  * 
     */
    @JsonProperty("260")
    @XmlEnumValue("260")
    Sonderinsolvenzverwalter("260"),

    /**
     * <b>Vorl&#228;ufige(r) Sachwalter(in) / Vorl&#228;ufige(r) Sachwalter(in)</b>
     *  * <p>
     *  *  Code: 261
     *  * <p>
     *  * 
     */
    @JsonProperty("261")
    @XmlEnumValue("261")
    Vorlaeufige_Sachwalter("261"),

    /**
     * <b>Abwickler(in) / Abwickler(in)</b>
     *  * <p>
     *  *  Code: 262
     *  * <p>
     *  * 
     */
    @JsonProperty("262")
    @XmlEnumValue("262")
    Abwickler("262"),

    /**
     * <b>&#220;bernehmender Rechtstr&#228;ger / &#220;bernehmender Rechtstr&#228;ger</b>
     *  * <p>
     *  *  Code: 263
     *  * <p>
     *  * 
     */
    @JsonProperty("263")
    @XmlEnumValue("263")
    Uebernehmender_Rechtstraeger("263"),

    /**
     * <b>Aufsichtsrat (-r&#228;tin) / Aufsichtsrat (-r&#228;tin)</b>
     *  * <p>
     *  *  Code: 264
     *  * <p>
     *  * 
     */
    @JsonProperty("264")
    @XmlEnumValue("264")
    Aufsichtsrat_raetin("264"),

    /**
     * <b>Besondere(r) Vertreter(in) nach &#167; 30 BGB / Besondere(r) Vertreter(in) nach &#167; 30 BGB</b>
     *  * <p>
     *  *  Code: 265
     *  * <p>
     *  * 
     */
    @JsonProperty("265")
    @XmlEnumValue("265")
    Besondere_Vertreter_nach_30_BGB("265"),

    /**
     * <b>Betriebsleiter(in) / Betriebsleiter(in)</b>
     *  * <p>
     *  *  Code: 266
     *  * <p>
     *  * 
     */
    @JsonProperty("266")
    @XmlEnumValue("266")
    Betriebsleiter("266"),

    /**
     * <b>Empfangsberechtigte(r) / Empfangsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 267
     *  * <p>
     *  * 
     */
    @JsonProperty("267")
    @XmlEnumValue("267")
    Empfangsberechtigte("267"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Direktor(in) / Gesch&#228;ftsf&#252;hrende(r) Direktor(in)</b>
     *  * <p>
     *  *  Code: 268
     *  * <p>
     *  * 
     */
    @JsonProperty("268")
    @XmlEnumValue("268")
    Geschaeftsfuehrende_Direktor("268"),

    /**
     * <b>Gesch&#228;ftsleiter(in) / Gesch&#228;ftsleiter(in)</b>
     *  * <p>
     *  *  Code: 269
     *  * <p>
     *  * 
     */
    @JsonProperty("269")
    @XmlEnumValue("269")
    Geschaeftsleiter("269"),

    /**
     * <b>Gr&#252;nder(in) / Gr&#252;nder(in)</b>
     *  * <p>
     *  *  Code: 271
     *  * <p>
     *  * 
     */
    @JsonProperty("271")
    @XmlEnumValue("271")
    Gruender("271"),

    /**
     * <b>Gr&#252;ndungspr&#252;fer(in) / Gr&#252;ndungspr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 272
     *  * <p>
     *  * 
     */
    @JsonProperty("272")
    @XmlEnumValue("272")
    Gruendungspruefer("272"),

    /**
     * <b>Hauptniederlassung / Hauptniederlassung</b>
     *  * <p>
     *  *  Code: 273
     *  * <p>
     *  * 
     */
    @JsonProperty("273")
    @XmlEnumValue("273")
    Hauptniederlassung("273"),

    /**
     * <b>Inhaber(in) / Inhaber(in)</b>
     *  * <p>
     *  *  Code: 274
     *  * <p>
     *  * 
     */
    @JsonProperty("274")
    @XmlEnumValue("274")
    Inhaber("274"),

    /**
     * <b>Kommanditist(in) / Kommanditist(in)</b>
     *  * <p>
     *  *  Code: 275
     *  * <p>
     *  * 
     */
    @JsonProperty("275")
    @XmlEnumValue("275")
    Kommanditist("275"),

    /**
     * <b>Konkursverwalter(in) / Konkursverwalter(in)</b>
     *  * <p>
     *  *  Code: 276
     *  * <p>
     *  * 
     */
    @JsonProperty("276")
    @XmlEnumValue("276")
    Konkursverwalter("276"),

    /**
     * <b>Mitglied des Leitungsorgans / Mitglied des Leitungsorgans</b>
     *  * <p>
     *  *  Code: 277
     *  * <p>
     *  * 
     */
    @JsonProperty("277")
    @XmlEnumValue("277")
    Mitglied_des_Leitungsorgans("277"),

    /**
     * <b>Mitglied EWIV / Mitglied EWIV</b>
     *  * <p>
     *  *  Code: 278
     *  * <p>
     *  * 
     */
    @JsonProperty("278")
    @XmlEnumValue("278")
    Mitglied_EWIV("278"),

    /**
     * <b>Nachgr&#252;ndungspr&#252;fer(in) / Nachgr&#252;ndungspr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 279
     *  * <p>
     *  * 
     */
    @JsonProperty("279")
    @XmlEnumValue("279")
    Nachgruendungspruefer("279"),

    /**
     * <b>Nachtragsabwickler(in) / Nachtragsabwickler(in)</b>
     *  * <p>
     *  *  Code: 280
     *  * <p>
     *  * 
     */
    @JsonProperty("280")
    @XmlEnumValue("280")
    Nachtragsabwickler("280"),

    /**
     * <b>Nachtragsliquidator(in) / Nachtragsliquidator(in)</b>
     *  * <p>
     *  *  Code: 281
     *  * <p>
     *  * 
     */
    @JsonProperty("281")
    @XmlEnumValue("281")
    Nachtragsliquidator("281"),

    /**
     * <b>Notgesch&#228;ftsf&#252;hrer(in) / Notgesch&#228;ftsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 282
     *  * <p>
     *  * 
     */
    @JsonProperty("282")
    @XmlEnumValue("282")
    Notgeschaeftsfuehrer("282"),

    /**
     * <b>Notliquidator(in) / Notliquidator(in)</b>
     *  * <p>
     *  *  Code: 283
     *  * <p>
     *  * 
     */
    @JsonProperty("283")
    @XmlEnumValue("283")
    Notliquidator("283"),

    /**
     * <b>Notvorstand / Notvorstand</b>
     *  * <p>
     *  *  Code: 284
     *  * <p>
     *  * 
     */
    @JsonProperty("284")
    @XmlEnumValue("284")
    Notvorstand("284"),

    /**
     * <b>Prokurist(in) / Prokurist(in)</b>
     *  * <p>
     *  *  Code: 285
     *  * <p>
     *  * 
     */
    @JsonProperty("285")
    @XmlEnumValue("285")
    Prokurist("285"),

    /**
     * <b>Rechtstr&#228;ger(in) / Rechtstr&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 287
     *  * <p>
     *  * 
     */
    @JsonProperty("287")
    @XmlEnumValue("287")
    Rechtstraeger("287"),

    /**
     * <b>Registergericht / Registergericht</b>
     *  * <p>
     *  *  Code: 288
     *  * <p>
     *  * 
     */
    @JsonProperty("288")
    @XmlEnumValue("288")
    Registergericht("288"),

    /**
     * <b>Sacheinlagenpr&#252;fer(in) / Sacheinlagenpr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 289
     *  * <p>
     *  * 
     */
    @JsonProperty("289")
    @XmlEnumValue("289")
    Sacheinlagenpruefer("289"),

    /**
     * <b>St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung / St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung</b>
     *  * <p>
     *  *  Code: 290
     *  * <p>
     *  * 
     */
    @JsonProperty("290")
    @XmlEnumValue("290")
    Staendige_Vertreter_fuer_die_Zweigniederlassung("290"),

    /**
     * <b>&#220;bertragender Rechtstr&#228;ger / &#220;bertragender Rechtstr&#228;ger</b>
     *  * <p>
     *  *  Code: 291
     *  * <p>
     *  * 
     */
    @JsonProperty("291")
    @XmlEnumValue("291")
    Uebertragender_Rechtstraeger("291"),

    /**
     * <b>Vergleichsverwalter(in) / Vergleichsverwalter(in)</b>
     *  * <p>
     *  *  Code: 292
     *  * <p>
     *  * 
     */
    @JsonProperty("292")
    @XmlEnumValue("292")
    Vergleichsverwalter("292"),

    /**
     * <b>Verwaltungsrat (-r&#228;tin) / Verwaltungsrat (-r&#228;tin)</b>
     *  * <p>
     *  *  Code: 293
     *  * <p>
     *  * 
     */
    @JsonProperty("293")
    @XmlEnumValue("293")
    Verwaltungsrat_raetin("293"),

    /**
     * <b>Vorstandsvorsitzende(r) / Vorstandsvorsitzende(r)</b>
     *  * <p>
     *  *  Code: 294
     *  * <p>
     *  * 
     */
    @JsonProperty("294")
    @XmlEnumValue("294")
    Vorstandsvorsitzende("294"),

    /**
     * <b>Zweigniederlassung / Zweigniederlassung</b>
     *  * <p>
     *  *  Code: 295
     *  * <p>
     *  * 
     */
    @JsonProperty("295")
    @XmlEnumValue("295")
    Zweigniederlassung("295"),

    /**
     * <b>Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin / Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin</b>
     *  * <p>
     *  *  Code: 296
     *  * <p>
     *  * 
     */
    @JsonProperty("296")
    @XmlEnumValue("296")
    Vertreter_des_Klaegers_oder_der_Klaegerin("296"),

    /**
     * <b>Vertreter(in) des/der Beklagten / Vertreter(in) des/der Beklagten</b>
     *  * <p>
     *  *  Code: 297
     *  * <p>
     *  * 
     */
    @JsonProperty("297")
    @XmlEnumValue("297")
    Vertreter_des_oder_der_Beklagten("297"),

    /**
     * <b>Bew&#228;hrungshilfe / Bew&#228;hrungshilfe</b>
     *  * <p>
     *  *  Code: 298
     *  * <p>
     *  * 
     */
    @JsonProperty("298")
    @XmlEnumValue("298")
    Bewaehrungshilfe("298"),

    /**
     * <b>Gerichtshilfe / Gerichtshilfe</b>
     *  * <p>
     *  *  Code: 299
     *  * <p>
     *  * 
     */
    @JsonProperty("299")
    @XmlEnumValue("299")
    Gerichtshilfe("299"),

    /**
     * <b>Justizvollzug / Justizvollzug</b>
     *  * <p>
     *  *  Code: 300
     *  * <p>
     *  * 
     */
    @JsonProperty("300")
    @XmlEnumValue("300")
    Justizvollzug("300"),

    /**
     * <b>Pseudoname / Pseudoname</b>
     *  * <p>
     *  *  Code: 301
     *  * <p>
     *  * 
     */
    @JsonProperty("301")
    @XmlEnumValue("301")
    Pseudoname("301"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin / Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin</b>
     *  * <p>
     *  *  Code: 302
     *  * <p>
     *  * 
     */
    @JsonProperty("302")
    @XmlEnumValue("302")
    Gesetzliche_Vertreter_des_Glaeubigers_oder_der_Glaeubigerin("302"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin / Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin</b>
     *  * <p>
     *  *  Code: 303
     *  * <p>
     *  * 
     */
    @JsonProperty("303")
    @XmlEnumValue("303")
    Gesetzliche_Vertreter_des_Schuldners_oder_der_Schuldnerin("303"),

    /**
     * <b>Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin / Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin</b>
     *  * <p>
     *  *  Code: 304
     *  * <p>
     *  * 
     */
    @JsonProperty("304")
    @XmlEnumValue("304")
    Bevollmaechtigte_des_Glaeubigers_oder_der_Glaeubigerin("304"),

    /**
     * <b>Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin / Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin</b>
     *  * <p>
     *  *  Code: 305
     *  * <p>
     *  * 
     */
    @JsonProperty("305")
    @XmlEnumValue("305")
    Bevollmaechtigte_des_Schuldners_oder_der_Schuldnerin("305"),

    /**
     * <b>Fahrzeughalter(in) / Fahrzeughalter(in)</b>
     *  * <p>
     *  *  Code: 306
     *  * <p>
     *  * 
     */
    @JsonProperty("306")
    @XmlEnumValue("306")
    Fahrzeughalter("306"),

    /**
     * <b>Fr&#252;here(r) Lebenspartner(in) / Fr&#252;here(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 307
     *  * <p>
     *  * 
     */
    @JsonProperty("307")
    @XmlEnumValue("307")
    Fruehere_Lebenspartner("307"),

    /**
     * <b>Sicherungsverwalter(in) / Sicherungsverwalter(in)</b>
     *  * <p>
     *  *  Code: 308
     *  * <p>
     *  * 
     */
    @JsonProperty("308")
    @XmlEnumValue("308")
    Sicherungsverwalter("308"),

    /**
     * <b>Zwangsverwalter(in) / Zwangsverwalter(in)</b>
     *  * <p>
     *  *  Code: 309
     *  * <p>
     *  * 
     */
    @JsonProperty("309")
    @XmlEnumValue("309")
    Zwangsverwalter("309"),

    /**
     * <b>Mieter(in) / Mieter(in)</b>
     *  * <p>
     *  *  Code: 310
     *  * <p>
     *  * 
     */
    @JsonProperty("310")
    @XmlEnumValue("310")
    Mieter("310"),

    /**
     * <b>B&#252;rge (B&#252;rgin) / B&#252;rge (B&#252;rgin)</b>
     *  * <p>
     *  *  Code: 311
     *  * <p>
     *  * 
     */
    @JsonProperty("311")
    @XmlEnumValue("311")
    Buerge_Buergin("311"),

    /**
     * <b>Meistbietende(r) / Meistbietende(r)</b>
     *  * <p>
     *  *  Code: 312
     *  * <p>
     *  * 
     */
    @JsonProperty("312")
    @XmlEnumValue("312")
    Meistbietende("312"),

    /**
     * <b>Abschlusspr&#252;fer(in) / Abschlusspr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 313
     *  * <p>
     *  * 
     */
    @JsonProperty("313")
    @XmlEnumValue("313")
    Abschlusspruefer("313"),

    /**
     * <b>Antragstellervertreter(in) / Antragstellervertreter(in)</b>
     *  * <p>
     *  *  Code: 314
     *  * <p>
     *  * 
     */
    @JsonProperty("314")
    @XmlEnumValue("314")
    Antragstellervertreter("314"),

    /**
     * <b>Aufsichtsratsvorsitzende(r) / Aufsichtsratsvorsitzende(r)</b>
     *  * <p>
     *  *  Code: 315
     *  * <p>
     *  * 
     */
    @JsonProperty("315")
    @XmlEnumValue("315")
    Aufsichtsratsvorsitzende("315"),

    /**
     * <b>Berufskammer / Berufskammer</b>
     *  * <p>
     *  *  Code: 316
     *  * <p>
     *  * 
     */
    @JsonProperty("316")
    @XmlEnumValue("316")
    Berufskammer("316"),

    /**
     * <b>Betroffenenvertreter(in) / Betroffenenvertreter(in)</b>
     *  * <p>
     *  *  Code: 317
     *  * <p>
     *  * 
     */
    @JsonProperty("317")
    @XmlEnumValue("317")
    Betroffenenvertreter("317"),

    /**
     * <b>B&#252;rgermeister(in) / B&#252;rgermeister(in)</b>
     *  * <p>
     *  *  Code: 318
     *  * <p>
     *  * 
     */
    @JsonProperty("318")
    @XmlEnumValue("318")
    Buergermeister("318"),

    /**
     * <b>Eingliederungsbeteiligte(r) / Eingliederungsbeteiligte(r)</b>
     *  * <p>
     *  *  Code: 319
     *  * <p>
     *  * 
     */
    @JsonProperty("319")
    @XmlEnumValue("319")
    Eingliederungsbeteiligte("319"),

    /**
     * <b>Formwechselnder Rechtstr&#228;ger / Formwechselnder Rechtstr&#228;ger</b>
     *  * <p>
     *  *  Code: 320
     *  * <p>
     *  * 
     */
    @JsonProperty("320")
    @XmlEnumValue("320")
    Formwechselnder_Rechtstraeger("320"),

    /**
     * <b>Gewerbeamt / Gewerbeamt</b>
     *  * <p>
     *  *  Code: 321
     *  * <p>
     *  * 
     */
    @JsonProperty("321")
    @XmlEnumValue("321")
    Gewerbeamt("321"),

    /**
     * <b>Inhaber(in) (nicht eingetragen) / Inhaber(in) (nicht eingetragen)</b>
     *  * <p>
     *  *  Code: 322
     *  * <p>
     *  * 
     */
    @JsonProperty("322")
    @XmlEnumValue("322")
    Inhaber_nicht_eingetragen("322"),

    /**
     * <b>Kostenempf&#228;nger(in) / Kostenempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 323
     *  * <p>
     *  * 
     */
    @JsonProperty("323")
    @XmlEnumValue("323")
    Kostenempfaenger("323"),

    /**
     * <b>Nachlassgericht / Nachlassgericht</b>
     *  * <p>
     *  *  Code: 324
     *  * <p>
     *  * 
     */
    @JsonProperty("324")
    @XmlEnumValue("324")
    Nachlassgericht("324"),

    /**
     * <b>Sonderpr&#252;fer(in) / Sonderpr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 325
     *  * <p>
     *  * 
     */
    @JsonProperty("325")
    @XmlEnumValue("325")
    Sonderpruefer("325"),

    /**
     * <b>Sonstige(r) gerichtlich bestellte(r) Vertreter(in) / Sonstige(r) gerichtlich bestellte(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 326
     *  * <p>
     *  * 
     */
    @JsonProperty("326")
    @XmlEnumValue("326")
    Sonstige_gerichtlich_bestellte_Vertreter("326"),

    /**
     * <b>Sonstige(r) gesetzliche(r) Vertreter(in) BGB / Sonstige(r) gesetzliche(r) Vertreter(in) BGB</b>
     *  * <p>
     *  *  Code: 327
     *  * <p>
     *  * 
     */
    @JsonProperty("327")
    @XmlEnumValue("327")
    Sonstige_gesetzliche_Vertreter_BGB("327"),

    /**
     * <b>Sonstige(r) organschaftliche(r) Vertreter(in) HRB / Sonstige(r) organschaftliche(r) Vertreter(in) HRB</b>
     *  * <p>
     *  *  Code: 328
     *  * <p>
     *  * 
     */
    @JsonProperty("328")
    @XmlEnumValue("328")
    Sonstige_organschaftliche_Vertreter_HRB("328"),

    /**
     * <b>Standardkostenschuldner(in) / Standardkostenschuldner(in)</b>
     *  * <p>
     *  *  Code: 329
     *  * <p>
     *  * 
     */
    @JsonProperty("329")
    @XmlEnumValue("329")
    Standardkostenschuldner("329"),

    /**
     * <b>&#220;bernahmeschuldner(in) / &#220;bernahmeschuldner(in)</b>
     *  * <p>
     *  *  Code: 330
     *  * <p>
     *  * 
     */
    @JsonProperty("330")
    @XmlEnumValue("330")
    Uebernahmeschuldner("330"),

    /**
     * <b>Unternehmensvertragsbeteiligte(r) / Unternehmensvertragsbeteiligte(r)</b>
     *  * <p>
     *  *  Code: 331
     *  * <p>
     *  * 
     */
    @JsonProperty("331")
    @XmlEnumValue("331")
    Unternehmensvertragsbeteiligte("331"),

    /**
     * <b>Vertreter(in) des pers&#246;nlich haftenden Gesellschafters / Vertreter(in) des pers&#246;nlich haftenden Gesellschafters</b>
     *  * <p>
     *  *  Code: 332
     *  * <p>
     *  * 
     */
    @JsonProperty("332")
    @XmlEnumValue("332")
    Vertreter_des_persoenlich_haftenden_Gesellschafters("332"),

    /**
     * <b>Werkleiter(in) / Werkleiter(in)</b>
     *  * <p>
     *  *  Code: 333
     *  * <p>
     *  * 
     */
    @JsonProperty("333")
    @XmlEnumValue("333")
    Werkleiter("333"),

    /**
     * <b>Mehrfachsitz / Mehrfachsitz</b>
     *  * <p>
     *  *  Code: 334
     *  * <p>
     *  * 
     */
    @JsonProperty("334")
    @XmlEnumValue("334")
    Mehrfachsitz("334"),

    /**
     * <b>Mitglied VR / Mitglied VR</b>
     *  * <p>
     *  *  Code: 335
     *  * <p>
     *  * 
     */
    @JsonProperty("335")
    @XmlEnumValue("335")
    Mitglied_VR("335"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als Abwicklerin / Mitglied e. BGB-Gesellschaft als Abwicklerin</b>
     *  * <p>
     *  *  Code: 336
     *  * <p>
     *  * 
     */
    @JsonProperty("336")
    @XmlEnumValue("336")
    Mitglied_e_BGB_Gesellschaft_als_Abwicklerin("336"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als ges. Vertreterin / Mitglied e. BGB-Gesellschaft als ges. Vertreterin</b>
     *  * <p>
     *  *  Code: 337
     *  * <p>
     *  * 
     */
    @JsonProperty("337")
    @XmlEnumValue("337")
    Mitglied_e_BGB_Gesellschaft_als_ges_Vertreterin("337"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als Kommanditistin / Mitglied e. BGB-Gesellschaft als Kommanditistin</b>
     *  * <p>
     *  *  Code: 338
     *  * <p>
     *  * 
     */
    @JsonProperty("338")
    @XmlEnumValue("338")
    Mitglied_e_BGB_Gesellschaft_als_Kommanditistin("338"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als Liquidatorin / Mitglied e. BGB-Gesellschaft als Liquidatorin</b>
     *  * <p>
     *  *  Code: 339
     *  * <p>
     *  * 
     */
    @JsonProperty("339")
    @XmlEnumValue("339")
    Mitglied_e_BGB_Gesellschaft_als_Liquidatorin("339"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV / Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV</b>
     *  * <p>
     *  *  Code: 340
     *  * <p>
     *  * 
     */
    @JsonProperty("340")
    @XmlEnumValue("340")
    Mitglied_e_BGB_Gesellschaft_als_Mitglied_e_EWIV("340"),

    /**
     * <b>Mitglied e. BGB-Gesellschaft als phG / Mitglied e. BGB-Gesellschaft als phG</b>
     *  * <p>
     *  *  Code: 341
     *  * <p>
     *  * 
     */
    @JsonProperty("341")
    @XmlEnumValue("341")
    Mitglied_e_BGB_Gesellschaft_als_phG("341"),

    /**
     * <b>Mitglied e. Erbengemeinschaft als ges. Vertreterin / Mitglied e. Erbengemeinschaft als ges. Vertreterin</b>
     *  * <p>
     *  *  Code: 342
     *  * <p>
     *  * 
     */
    @JsonProperty("342")
    @XmlEnumValue("342")
    Mitglied_e_Erbengemeinschaft_als_ges_Vertreterin("342"),

    /**
     * <b>Mitglied e. Erbengemeinschaft als Inhaberin / Mitglied e. Erbengemeinschaft als Inhaberin</b>
     *  * <p>
     *  *  Code: 343
     *  * <p>
     *  * 
     */
    @JsonProperty("343")
    @XmlEnumValue("343")
    Mitglied_e_Erbengemeinschaft_als_Inhaberin("343"),

    /**
     * <b>Mitglied e. Erbengemeinschaft als Kommanditistin / Mitglied e. Erbengemeinschaft als Kommanditistin</b>
     *  * <p>
     *  *  Code: 344
     *  * <p>
     *  * 
     */
    @JsonProperty("344")
    @XmlEnumValue("344")
    Mitglied_e_Erbengemeinschaft_als_Kommanditistin("344"),

    /**
     * <b>Mitglied e. Erbengemeinschaft als Mitglied e. EWIV / Mitglied e. Erbengemeinschaft als Mitglied e. EWIV</b>
     *  * <p>
     *  *  Code: 345
     *  * <p>
     *  * 
     */
    @JsonProperty("345")
    @XmlEnumValue("345")
    Mitglied_e_Erbengemeinschaft_als_Mitglied_e_EWIV("345"),

    /**
     * <b>Nebensitz / Nebensitz</b>
     *  * <p>
     *  *  Code: 346
     *  * <p>
     *  * 
     */
    @JsonProperty("346")
    @XmlEnumValue("346")
    Nebensitz("346"),

    /**
     * <b>Gesamthandsgemeinschaft / Gesamthandsgemeinschaft</b>
     *  * <p>
     *  *  Code: 347
     *  * <p>
     *  * 
     */
    @JsonProperty("347")
    @XmlEnumValue("347")
    Gesamthandsgemeinschaft("347"),

    /**
     * <b>Mitglied einer Gesamthandsgemeinschaft / Mitglied einer Gesamthandsgemeinschaft</b>
     *  * <p>
     *  *  Code: 348
     *  * <p>
     *  * 
     */
    @JsonProperty("348")
    @XmlEnumValue("348")
    Mitglied_einer_Gesamthandsgemeinschaft("348"),

    /**
     * <b>Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG / Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG</b>
     *  * <p>
     *  *  Code: 349
     *  * <p>
     *  * 
     */
    @JsonProperty("349")
    @XmlEnumValue("349")
    Leitungsperson_iSv_30_Abs_1_Nr_1_bis_5_OWiG("349"),

    /**
     * <b>Einziehungsbeteiligter / Einziehungsbeteiligter</b>
     *  * <p>
     *  *  Code: 350
     *  * <p>
     *  * 
     */
    @JsonProperty("350")
    @XmlEnumValue("350")
    Einziehungsbeteiligter("350"),

    /**
     * <b>Antragsgegnervertreter(in) / Antragsgegnervertreter(in)</b>
     *  * <p>
     *  *  Code: 351
     *  * <p>
     *  * 
     */
    @JsonProperty("351")
    @XmlEnumValue("351")
    Antragsgegnervertreter("351"),

    /**
     * <b>Verbraucher(in) / Verbraucher(in)</b>
     *  * <p>
     *  *  Code: 352
     *  * <p>
     *  * 
     */
    @JsonProperty("352")
    @XmlEnumValue("352")
    Verbraucher("352"),

    /**
     * <b>Vielmelder(in) / Vielmelder(in)</b>
     *  * <p>
     *  *  Code: 353
     *  * <p>
     *  * 
     */
    @JsonProperty("353")
    @XmlEnumValue("353")
    Vielmelder("353"),

    /**
     * <b>Vollmachtgeber(in) / Vollmachtgeber(in)</b>
     *  * <p>
     *  *  Code: 354
     *  * <p>
     *  * 
     */
    @JsonProperty("354")
    @XmlEnumValue("354")
    Vollmachtgeber("354"),

    /**
     * <b>Nebenbeteiligte(r) &#167; 444 StPO / Nebenbeteiligte(r) &#167; 444 StPO</b>
     *  * <p>
     *  *  Code: 355
     *  * <p>
     *  * 
     */
    @JsonProperty("355")
    @XmlEnumValue("355")
    Nebenbeteiligte_444_StPO("355"),

    /**
     * <b>Verfallsbeteiligte(r) &#167; 442 StPO a.F. / Verfallsbeteiligte(r) &#167; 442 StPO a.F.</b>
     *  * <p>
     *  *  Code: 356
     *  * <p>
     *  * 
     */
    @JsonProperty("356")
    @XmlEnumValue("356")
    Verfallsbeteiligte_442_StPO_aF("356"),

    /**
     * <b>Verfolgte(r) &#167; 34 IRG / Verfolgte(r) &#167; 34 IRG</b>
     *  * <p>
     *  *  Code: 357
     *  * <p>
     *  * 
     */
    @JsonProperty("357")
    @XmlEnumValue("357")
    Verfolgte_34_IRG("357"),

    /**
     * <b>Rechtsnachfolger(in) / Rechtsnachfolger(in)</b>
     *  * <p>
     *  *  Code: 358
     *  * <p>
     *  * 
     */
    @JsonProperty("358")
    @XmlEnumValue("358")
    Rechtsnachfolger("358"),

    /**
     * <b>Statuswechselnde(r) Rechtstr&#228;ger(in) / Statuswechselnde(r) Rechtstr&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 359
     *  * <p>
     *  * 
     */
    @JsonProperty("359")
    @XmlEnumValue("359")
    Statuswechselnde_Rechtstraeger("359"),

    /**
     * <b>Haftangeh&#246;rige / Haftangeh&#246;rige</b>
     *  * <p>
     *  *  Code: 360
     *  * <p>
     *  * 
     */
    @JsonProperty("360")
    @XmlEnumValue("360")
    Haftangehoerige("360"),

    /**
     * <b>Restrukturierungsbeauftragte(r) / Restrukturierungsbeauftragte(r)</b>
     *  * <p>
     *  *  Code: 361
     *  * <p>
     *  * 
     */
    @JsonProperty("361")
    @XmlEnumValue("361")
    Restrukturierungsbeauftragte("361"),

    /**
     * <b>Sanierungsmoderator(in) / Sanierungsmoderator(in)</b>
     *  * <p>
     *  *  Code: 362
     *  * <p>
     *  * 
     */
    @JsonProperty("362")
    @XmlEnumValue("362")
    Sanierungsmoderator("362"),

    /**
     * <b>Abschriftenempf&#228;nger(in) / Abschriftenempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 363
     *  * <p>
     *  * 
     */
    @JsonProperty("363")
    @XmlEnumValue("363")
    Abschriftenempfaenger("363"),

    /**
     * <b>Kostenbeamte(r) / Kostenbeamte(r)</b>
     *  * <p>
     *  *  Code: 364
     *  * <p>
     *  * 
     */
    @JsonProperty("364")
    @XmlEnumValue("364")
    Kostenbeamte("364"),

    /**
     * <b>Urkundsbeamte(r) der Gesch&#228;ftsstelle / Urkundsbeamte(r) der Gesch&#228;ftsstelle</b>
     *  * <p>
     *  *  Code: 365
     *  * <p>
     *  * 
     */
    @JsonProperty("365")
    @XmlEnumValue("365")
    Urkundsbeamte_der_Geschaeftsstelle("365"),

    /**
     * <b>Anordnungsbefugte(r) / Anordnungsbefugte(r)</b>
     *  * <p>
     *  *  Code: 366
     *  * <p>
     *  * 
     */
    @JsonProperty("366")
    @XmlEnumValue("366")
    Anordnungsbefugte("366"),

    /**
     * <b>Erstschuldner(in) / Erstschuldner(in)</b>
     *  * <p>
     *  *  Code: 367
     *  * <p>
     *  * 
     */
    @JsonProperty("367")
    @XmlEnumValue("367")
    Erstschuldner("367"),

    /**
     * <b>Kasse / Kasse</b>
     *  * <p>
     *  *  Code: 368
     *  * <p>
     *  * 
     */
    @JsonProperty("368")
    @XmlEnumValue("368")
    Kasse("368"),

    /**
     * <b>Arrestbeklagte(r) / Arrestbeklagte(r)</b>
     *  * <p>
     *  *  Code: 369
     *  * <p>
     *  * 
     */
    @JsonProperty("369")
    @XmlEnumValue("369")
    Arrestbeklagte("369"),

    /**
     * <b>Arrestkl&#228;ger(in) / Arrestkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 370
     *  * <p>
     *  * 
     */
    @JsonProperty("370")
    @XmlEnumValue("370")
    Arrestklaeger("370"),

    /**
     * <b>Bezirksrevisor(in) / Bezirksrevisor(in)</b>
     *  * <p>
     *  *  Code: 371
     *  * <p>
     *  * 
     */
    @JsonProperty("371")
    @XmlEnumValue("371")
    Bezirksrevisor("371"),

    /**
     * <b>Nebenintervenient(in) / Nebenintervenient(in)</b>
     *  * <p>
     *  *  Code: 372
     *  * <p>
     *  * 
     */
    @JsonProperty("372")
    @XmlEnumValue("372")
    Nebenintervenient("372"),

    /**
     * <b>Restitutionsbeklagte(r) / Restitutionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 373
     *  * <p>
     *  * 
     */
    @JsonProperty("373")
    @XmlEnumValue("373")
    Restitutionsbeklagte("373"),

    /**
     * <b>Restitutionskl&#228;ger(in) / Restitutionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 374
     *  * <p>
     *  * 
     */
    @JsonProperty("374")
    @XmlEnumValue("374")
    Restitutionsklaeger("374"),

    /**
     * <b>Streithelfer(in) / Streithelfer(in)</b>
     *  * <p>
     *  *  Code: 375
     *  * <p>
     *  * 
     */
    @JsonProperty("375")
    @XmlEnumValue("375")
    Streithelfer("375"),

    /**
     * <b>Streitverk&#252;ndete(r) / Streitverk&#252;ndete(r)</b>
     *  * <p>
     *  *  Code: 376
     *  * <p>
     *  * 
     */
    @JsonProperty("376")
    @XmlEnumValue("376")
    Streitverkuendete("376"),

    /**
     * <b>&#220;bersetzer(in) / &#220;bersetzer(in)</b>
     *  * <p>
     *  *  Code: 377
     *  * <p>
     *  * 
     */
    @JsonProperty("377")
    @XmlEnumValue("377")
    Uebersetzer("377"),

    /**
     * <b>Unternehmen / Company</b>
     *  * <p>
     *  *  Code: 378
     *  * <p>
     *  * 
     */
    @JsonProperty("378")
    @XmlEnumValue("378")
    Unternehmen_378("378"),

    /**
     * <b>Kontaktperson des Unternehmens / Kontaktperson des Unternehmens</b>
     *  * <p>
     *  *  Code: 379
     *  * <p>
     *  * 
     */
    @JsonProperty("379")
    @XmlEnumValue("379")
    Kontaktperson_des_Unternehmens("379"),

    /**
     * <b>Beigetretene(r) / Beigetretene(r)</b>
     *  * <p>
     *  *  Code: 380
     *  * <p>
     *  * 
     */
    @JsonProperty("380")
    @XmlEnumValue("380")
    Beigetretene("380"),

    /**
     * <b>Erkl&#228;rende(r) / Erkl&#228;rende(r)</b>
     *  * <p>
     *  *  Code: 381
     *  * <p>
     *  * 
     */
    @JsonProperty("381")
    @XmlEnumValue("381")
    Erklaerende("381"),

    /**
     * <b>Heim / Heim</b>
     *  * <p>
     *  *  Code: 382
     *  * <p>
     *  * 
     */
    @JsonProperty("382")
    @XmlEnumValue("382")
    Heim("382"),

    /**
     * <b>Inhaftierte Person / Inhaftierte Person</b>
     *  * <p>
     *  *  Code: 383
     *  * <p>
     *  * 
     */
    @JsonProperty("383")
    @XmlEnumValue("383")
    Inhaftierte_Person("383"),

    /**
     * <b>Jugendgerichtshilfe / Jugendgerichtshilfe</b>
     *  * <p>
     *  *  Code: 384
     *  * <p>
     *  * 
     */
    @JsonProperty("384")
    @XmlEnumValue("384")
    Jugendgerichtshilfe("384"),

    /**
     * <b>Krankenhaus / Krankenhaus</b>
     *  * <p>
     *  *  Code: 385
     *  * <p>
     *  * 
     */
    @JsonProperty("385")
    @XmlEnumValue("385")
    Krankenhaus("385"),

    /**
     * <b>Nebenbetroffene(r) / Nebenbetroffene(r)</b>
     *  * <p>
     *  *  Code: 386
     *  * <p>
     *  * 
     */
    @JsonProperty("386")
    @XmlEnumValue("386")
    Nebenbetroffene("386"),

    /**
     * <b>Nebenkl&#228;gervertreter(in) / Nebenkl&#228;gervertreter(in)</b>
     *  * <p>
     *  *  Code: 387
     *  * <p>
     *  * 
     */
    @JsonProperty("387")
    @XmlEnumValue("387")
    Nebenklaegervertreter("387"),

    /**
     * <b>Psychosoziale(r) Prozessbegleiter(in) / Psychosoziale(r) Prozessbegleiter(in)</b>
     *  * <p>
     *  *  Code: 388
     *  * <p>
     *  * 
     */
    @JsonProperty("388")
    @XmlEnumValue("388")
    Psychosoziale_Prozessbegleiter("388"),

    /**
     * <b>Rentenberater(in) / Rentenberater(in)</b>
     *  * <p>
     *  *  Code: 389
     *  * <p>
     *  * 
     */
    @JsonProperty("389")
    @XmlEnumValue("389")
    Rentenberater("389"),

    /**
     * <b>Sachverst&#228;ndige(n) Zeuge (Zeugin) / Sachverst&#228;ndige(n) Zeuge (Zeugin)</b>
     *  * <p>
     *  *  Code: 390
     *  * <p>
     *  * 
     */
    @JsonProperty("390")
    @XmlEnumValue("390")
    Sachverstaendigen_Zeuge_Zeugin("390"),

    /**
     * <b>Steuerberater(in) / Steuerberater(in)</b>
     *  * <p>
     *  *  Code: 391
     *  * <p>
     *  * 
     */
    @JsonProperty("391")
    @XmlEnumValue("391")
    Steuerberater("391"),

    /**
     * <b>Unternehmen / Company</b>
     *  * <p>
     *  *  Code: 392
     *  * <p>
     *  * 
     */
    @JsonProperty("392")
    @XmlEnumValue("392")
    Unternehmen_392("392"),

    /**
     * <b>Verfahrensbeistand / Verfahrensbeistand</b>
     *  * <p>
     *  *  Code: 393
     *  * <p>
     *  * 
     */
    @JsonProperty("393")
    @XmlEnumValue("393")
    Verfahrensbeistand("393"),

    /**
     * <b>Verfahrensbeteiligte(r) / Verfahrensbeteiligte(r)</b>
     *  * <p>
     *  *  Code: 394
     *  * <p>
     *  * 
     */
    @JsonProperty("394")
    @XmlEnumValue("394")
    Verfahrensbeteiligte("394"),

    /**
     * <b>Verhinderungsbetreuer / Verhinderungsbetreuer</b>
     *  * <p>
     *  *  Code: 395
     *  * <p>
     *  * 
     */
    @JsonProperty("395")
    @XmlEnumValue("395")
    Verhinderungsbetreuer("395"),

    /**
     * <b>Verletztenbeistand / Verletztenbeistand</b>
     *  * <p>
     *  *  Code: 396
     *  * <p>
     *  * 
     */
    @JsonProperty("396")
    @XmlEnumValue("396")
    Verletztenbeistand("396"),

    /**
     * <b>Wirtschaftspr&#252;fer(in) / Wirtschaftspr&#252;fer(in)</b>
     *  * <p>
     *  *  Code: 397
     *  * <p>
     *  * 
     */
    @JsonProperty("397")
    @XmlEnumValue("397")
    Wirtschaftspruefer("397"),

    /**
     * <b>Zedent(in) / Zedent(in)</b>
     *  * <p>
     *  *  Code: 398
     *  * <p>
     *  * 
     */
    @JsonProperty("398")
    @XmlEnumValue("398")
    Zedent("398"),

    /**
     * <b>Registerf&#252;hrende Beh&#246;rde/Stelle / Registerf&#252;hrende Beh&#246;rde/Stelle</b>
     *  * <p>
     *  *  Code: 399
     *  * <p>
     *  * 
     */
    @JsonProperty("399")
    @XmlEnumValue("399")
    Registerfuehrende_Behoerde_oder_Stelle("399");

    private final String value;
    RollenCode(String value) { this.value = value; }
    private static final java.util.Map<String, RollenCode> ALIASES = new java.util.HashMap<>();
    static {
        initAliases0();
        initAliases1();
    }

    private static void initAliases0() {
        ALIASES.put("Abwesenheitspfleger(in) / Absentee Curator".toLowerCase(), Abwesenheitspfleger);
        ALIASES.put("Aliasidentit&#228;t / Alias Identity".toLowerCase(), Aliasidentitaet);
        ALIASES.put("Angeh&#246;rige(r) / Relative".toLowerCase(), Angehoerige);
        ALIASES.put("Angeklagte(r) / Accused".toLowerCase(), Angeklagte);
        ALIASES.put("Angeschuldigte(r) / Indicted".toLowerCase(), Angeschuldigte);
        ALIASES.put("Annehmende(r) / Adopter".toLowerCase(), Annehmende);
        ALIASES.put("Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)".toLowerCase(), Anschlussberufungsbeklagte);
        ALIASES.put("Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)".toLowerCase(), Anschlussberufungsklaeger);
        ALIASES.put("Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)".toLowerCase(), Anschlussbeschwerdefuehrer);
        ALIASES.put("Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)".toLowerCase(), Anschlussbeschwerdegegner);
        ALIASES.put("Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)".toLowerCase(), Anschlussrechtsbeschwerdefuehrer);
        ALIASES.put("Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)".toLowerCase(), Anschlussrechtsbeschwerdegegner);
        ALIASES.put("Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)".toLowerCase(), Anschlussrevisionsbeklagte);
        ALIASES.put("Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)".toLowerCase(), Anschlussrevisionsklaeger);
        ALIASES.put("Antragsgegner(in) / Respondent".toLowerCase(), Antragsgegner);
        ALIASES.put("Antragsteller(in) / Applicant".toLowerCase(), Antragsteller);
        ALIASES.put("Anzeigeerstatter(in) / Complainant".toLowerCase(), Anzeigeerstatter);
        ALIASES.put("Anzunehmende(r) / Anzunehmende(r)".toLowerCase(), Anzunehmende);
        ALIASES.put("Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)".toLowerCase(), Arrestglaeubiger);
        ALIASES.put("Arrestschuldner(in) / Arrestschuldner(in)".toLowerCase(), Arrestschuldner);
        ALIASES.put("Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde".toLowerCase(), Aufsichtsbehoerde);
        ALIASES.put("Ausschlagende(r) / Ausschlagende(r)".toLowerCase(), Ausschlagende);
        ALIASES.put("Beamter (Beamtin) / Beamter (Beamtin)".toLowerCase(), Beamter_Beamtin);
        ALIASES.put("Beh&#246;rde / Beh&#246;rde".toLowerCase(), Behoerde);
        ALIASES.put("Beigeladene(r) / Beigeladene(r)".toLowerCase(), Beigeladene);
        ALIASES.put("Beistand / Beistand".toLowerCase(), Beistand);
        ALIASES.put("Bekannte(r) / Bekannte(r)".toLowerCase(), Bekannte);
        ALIASES.put("Beklagte(r) / Beklagte(r)".toLowerCase(), Beklagte);
        ALIASES.put("Berufungsbeklagte(r) / Berufungsbeklagte(r)".toLowerCase(), Berufungsbeklagte);
        ALIASES.put("Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)".toLowerCase(), Berufungsklaeger);
        ALIASES.put("Beschuldigte(r) / Accused (Prelim.)".toLowerCase(), Beschuldigte);
        ALIASES.put("Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)".toLowerCase(), Beschwerdefuehrer);
        ALIASES.put("Beschwerdegegner(in) / Beschwerdegegner(in)".toLowerCase(), Beschwerdegegner);
        ALIASES.put("Besucher(in) / Besucher(in)".toLowerCase(), Besucher);
        ALIASES.put("Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)".toLowerCase(), Betreibende_Glaeubige);
        ALIASES.put("Betreuer(in) / Guardian".toLowerCase(), Betreuer);
        ALIASES.put("Betreute(r) / Ward".toLowerCase(), Betreute);
        ALIASES.put("Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde".toLowerCase(), Betreuungsbehoerde);
        ALIASES.put("Betroffene(r) / Betroffene(r)".toLowerCase(), Betroffene);
        ALIASES.put("Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)".toLowerCase(), Bevollmaechtigte);
        ALIASES.put("Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)".toLowerCase(), Bewaehrungshelfer);
        ALIASES.put("Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)".toLowerCase(), Beweisanwalt);
        ALIASES.put("Bruder (Schwester) / Bruder (Schwester)".toLowerCase(), Bruder_Schwester);
        ALIASES.put("Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)".toLowerCase(), Bundeswehrdisziplinaranwalt);
        ALIASES.put("Bu&#223;geldempf&#228;nger(in) / Bu&#223;geldempf&#228;nger(in)".toLowerCase(), Bussgeldempfaenger);
        ALIASES.put("Cousin(e) / Cousin(e)".toLowerCase(), Cousin);
        ALIASES.put("Dienstvorgesetzte(r) / Dienstvorgesetzte(r)".toLowerCase(), Dienstvorgesetzte);
        ALIASES.put("director / director".toLowerCase(), director);
        ALIASES.put("Dolmetscher(in) / Interpreter".toLowerCase(), Dolmetscher);
        ALIASES.put("Dritte(r) / Dritte(r)".toLowerCase(), Dritte);
        ALIASES.put("Drittschuldner(in) / Drittschuldner(in)".toLowerCase(), Drittschuldner);
        ALIASES.put("Drittwiderbeklagte(r) / Drittwiderbeklagte(r)".toLowerCase(), Drittwiderbeklagte);
        ALIASES.put("Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)".toLowerCase(), Drittwiderklaeger);
        ALIASES.put("Ehemann (Ehefrau) / Ehemann (Ehefrau)".toLowerCase(), Ehemann_Ehefrau);
        ALIASES.put("Eigent&#252;mer(in) / Eigent&#252;mer(in)".toLowerCase(), Eigentuemer);
        ALIASES.put("Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)".toLowerCase(), Eingetragene_Lebenspartner);
        ALIASES.put("Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde".toLowerCase(), Einleitungsbehoerde);
        ALIASES.put("Eltern / Eltern".toLowerCase(), Eltern);
        ALIASES.put("Elternteil / Elternteil".toLowerCase(), Elternteil);
        ALIASES.put("Enkel(in) / Enkel(in)".toLowerCase(), Enkel);
        ALIASES.put("Erbe (Erbin) / Erbe (Erbin)".toLowerCase(), Erbe_Erbin);
        ALIASES.put("Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)".toLowerCase(), Erbe_Erbin_ausschlagend);
        ALIASES.put("Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)".toLowerCase(), Erbe_Erbin_vorverstorben);
        ALIASES.put("Erblasser(in) / Erblasser(in)".toLowerCase(), Erblasser);
        ALIASES.put("Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)".toLowerCase(), Ergaenzungspfleger);
        ALIASES.put("Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)".toLowerCase(), Erinnerungsfuehrer);
        ALIASES.put("Erinnerungsgegner(in) / Erinnerungsgegner(in)".toLowerCase(), Erinnerungsgegner);
        ALIASES.put("Ersatzbetreuer(in) / Ersatzbetreuer(in)".toLowerCase(), Ersatzbetreuer);
        ALIASES.put("Ersteher(in) / Ersteher(in)".toLowerCase(), Ersteher);
        ALIASES.put("Erwerber(in) / Erwerber(in)".toLowerCase(), Erwerber);
        ALIASES.put("Erziehungsberechtigte(r) / Erziehungsberechtigte(r)".toLowerCase(), Erziehungsberechtigte);
        ALIASES.put("Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)".toLowerCase(), Fruehere_Ehegatte_Ehegattin);
        ALIASES.put("Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)".toLowerCase(), Fruehere_Beklagte);
        ALIASES.put("Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)".toLowerCase(), Fruehere_Beteiligte);
        ALIASES.put("Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)".toLowerCase(), Fruehere_Glaeubiger);
        ALIASES.put("Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)".toLowerCase(), Fruehere_Klaeger);
        ALIASES.put("Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)".toLowerCase(), Fruehere_Soldat);
        ALIASES.put("Gegenvormund / Gegenvormund".toLowerCase(), Gegenvormund);
        ALIASES.put("Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)".toLowerCase(), Generalbundesanwalt);
        ALIASES.put("Gericht / Gericht".toLowerCase(), Gericht);
        ALIASES.put("Gerichtsvollzieher(in) / Gerichtsvollzieher(in)".toLowerCase(), Gerichtsvollzieher);
        ALIASES.put("Gesch&#228;digte(r) / Gesch&#228;digte(r)".toLowerCase(), Geschaedigte);
        ALIASES.put("Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)".toLowerCase(), Geschaeftsfuehrende_Gesellschafter);
        ALIASES.put("Gesch&#228;ftsf&#252;hrer(in) / Gesch&#228;ftsf&#252;hrer(in)".toLowerCase(), Geschaeftsfuehrer);
        ALIASES.put("Gesetzliche(r) Erbe (Erbin) / Gesetzliche(r) Erbe (Erbin)".toLowerCase(), Gesetzliche_Erbe_Erbin);
        ALIASES.put("Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)".toLowerCase(), Gesetzliche_Vertreter);
        ALIASES.put("Gl&#228;ubiger(in) / Creditor".toLowerCase(), Glaeubiger);
        ALIASES.put("Gro&#223;eltern / Gro&#223;eltern".toLowerCase(), Grosseltern);
        ALIASES.put("Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)".toLowerCase(), Grossvater_Grossmutter);
        ALIASES.put("Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)".toLowerCase(), Hauptbevollmaechtigte);
        ALIASES.put("Hoferbe (Hoferbin) / Hoferbe (Hoferbin)".toLowerCase(), Hoferbe_Hoferbin);
        ALIASES.put("Inhaber(in) der Firma / Inhaber(in) der Firma".toLowerCase(), Inhaber_der_Firma);
        ALIASES.put("Insolvenzverwalter(in) / Insolvency Administrator".toLowerCase(), Insolvenzverwalter);
        ALIASES.put("Jugendamt / Jugendamt".toLowerCase(), Jugendamt);
        ALIASES.put("Kammer / Kammer".toLowerCase(), Kammer);
        ALIASES.put("Kammermitglied / Kammermitglied".toLowerCase(), Kammermitglied);
        ALIASES.put("Kind / Kind".toLowerCase(), Kind);
        ALIASES.put("Kl&#228;ger(in) / Plaintiff".toLowerCase(), Klaeger);
        ALIASES.put("Kontrollbetreuer(in) / Kontrollbetreuer(in)".toLowerCase(), Kontrollbetreuer);
        ALIASES.put("Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)".toLowerCase(), Korrespondenzanwalt);
        ALIASES.put("Kostenschuldner(in) / Kostenschuldner(in)".toLowerCase(), Kostenschuldner);
        ALIASES.put("Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)".toLowerCase(), Landwirtschaftsrichter);
        ALIASES.put("Lebenspartner(in) / Lebenspartner(in)".toLowerCase(), Lebenspartner);
        ALIASES.put("Liquidator(in) / Liquidator(in)".toLowerCase(), Liquidator);
        ALIASES.put("Minderj&#228;hrige(r) / Minderj&#228;hrige(r)".toLowerCase(), Minderjaehrige);
        ALIASES.put("Mitvormund / Mitvormund".toLowerCase(), Mitvormund);
        ALIASES.put("M&#252;ndel / M&#252;ndel".toLowerCase(), Muendel);
        ALIASES.put("Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)".toLowerCase(), Nachbesserungsglaeubiger);
        ALIASES.put("Nachlasspfleger(in) / Nachlasspfleger(in)".toLowerCase(), Nachlasspfleger);
        ALIASES.put("Nachlassverwalter(in) / Nachlassverwalter(in)".toLowerCase(), Nachlassverwalter);
        ALIASES.put("Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)".toLowerCase(), Nebenklaeger);
        ALIASES.put("Neffe (Nichte) / Neffe (Nichte)".toLowerCase(), Neffe_Nichte);
        ALIASES.put("Nicht verwandt / Nicht verwandt".toLowerCase(), Nicht_verwandt);
        ALIASES.put("Onkel (Tante) / Onkel (Tante)".toLowerCase(), Onkel_Tante);
        ALIASES.put("Opfer / Opfer".toLowerCase(), Opfer);
        ALIASES.put("P&#228;chter(in) / P&#228;chter(in)".toLowerCase(), Paechter);
        ALIASES.put("Pflegeeltern / Pflegeeltern".toLowerCase(), Pflegeeltern);
        ALIASES.put("Pfleger(in) / Pfleger(in)".toLowerCase(), Pfleger);
        ALIASES.put("Pfleger(in) f&#252;r das Sammelverm&#246;gen / Pfleger(in) f&#252;r das Sammelverm&#246;gen".toLowerCase(), Pfleger_fuer_das_Sammelvermoegen);
        ALIASES.put("Pfleger(in) f&#252;r die Leibesfrucht / Pfleger(in) f&#252;r die Leibesfrucht".toLowerCase(), Pfleger_fuer_die_Leibesfrucht);
        ALIASES.put("Pflegevater (Pflegemutter) des M&#252;ndels / Pflegevater (Pflegemutter) des M&#252;ndels".toLowerCase(), Pflegevater_Pflegemutter_des_Muendels);
        ALIASES.put("Pflegling / Pflegling".toLowerCase(), Pflegling);
        ALIASES.put("Pflichtverteidiger(in) / Pflichtverteidiger(in)".toLowerCase(), Pflichtverteidiger);
        ALIASES.put("Polizei / Polizei".toLowerCase(), Polizei);
        ALIASES.put("Privatbeklagte(r) / Privatbeklagte(r)".toLowerCase(), Privatbeklagte);
        ALIASES.put("Privatkl&#228;ger(in) / Privatkl&#228;ger(in)".toLowerCase(), Privatklaeger);
        ALIASES.put("Prozessbevollm&#228;chtigte(r) / Prozessbevollm&#228;chtigte(r)".toLowerCase(), Prozessbevollmaechtigte);
        ALIASES.put("Prozesskostenhilfe-Anwalt (-Anw&#228;ltin) / Prozesskostenhilfe-Anwalt (-Anw&#228;ltin)".toLowerCase(), Prozesskostenhilfe_Anwalt_Anwaeltin);
        ALIASES.put("Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Prozesskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)".toLowerCase(), Prozesskostenhilfe_Korrespondenzanwalt);
        ALIASES.put("Rechtsanwalt (-anw&#228;ltin) / Rechtsanwalt (-anw&#228;ltin)".toLowerCase(), Rechtsanwalt);
        ALIASES.put("Rechtsbeistand / Rechtsbeistand".toLowerCase(), Rechtsbeistand);
        ALIASES.put("Rechtsbeschwerdef&#252;hrer(in) / Rechtsbeschwerdef&#252;hrer(in)".toLowerCase(), Rechtsbeschwerdefuehrer);
        ALIASES.put("Rechtsbeschwerdegegner(in) / Rechtsbeschwerdegegner(in)".toLowerCase(), Rechtsbeschwerdegegner);
        ALIASES.put("Revisionsbeklagte(r) / Revisionsbeklagte(r)".toLowerCase(), Revisionsbeklagte);
        ALIASES.put("Revisionskl&#228;ger(in) / Revisionskl&#228;ger(in)".toLowerCase(), Revisionsklaeger);
        ALIASES.put("Sachbearbeiter(in) / Sachbearbeiter(in)".toLowerCase(), Sachbearbeiter);
        ALIASES.put("Sachverst&#228;ndige(r) / Sachverst&#228;ndige(r)".toLowerCase(), Sachverstaendige);
        ALIASES.put("Schuldner(in) / Debtor".toLowerCase(), Schuldner);
        ALIASES.put("Schwager (Schw&#228;gerin) / Schwager (Schw&#228;gerin)".toLowerCase(), Schwager_Schwaegerin);
        ALIASES.put("Schwiegersohn (Schwiegertochter) / Schwiegersohn (Schwiegertochter)".toLowerCase(), Schwiegersohn_Schwiegertochter);
        ALIASES.put("Schwiegervater (Schwiegermutter) / Schwiegervater (Schwiegermutter)".toLowerCase(), Schwiegervater_Schwiegermutter);
        ALIASES.put("Sohn (Tochter) / Sohn (Tochter)".toLowerCase(), Sohn_Tochter);
        ALIASES.put("Soldat(in) / Soldat(in)".toLowerCase(), Soldat);
        ALIASES.put("Sonstige(r) Beteiligte(r) / Sonstige(r) Beteiligte(r)".toLowerCase(), Sonstige_Beteiligte);
        ALIASES.put("Sonstige(r) Vertreter(in) / Sonstige(r) Vertreter(in)".toLowerCase(), Sonstige_Vertreter);
        ALIASES.put("Staatsanwaltschaft / Staatsanwaltschaft".toLowerCase(), Staatsanwaltschaft);
        ALIASES.put("Stiefeltern / Stiefeltern".toLowerCase(), Stiefeltern);
        ALIASES.put("Stiefvater (Stiefmutter) / Stiefvater (Stiefmutter)".toLowerCase(), Stiefvater_Stiefmutter);
        ALIASES.put("Terminsbevollm&#228;chtigte(r) / Terminsbevollm&#228;chtigte(r)".toLowerCase(), Terminsbevollmaechtigte);
        ALIASES.put("Testamentsvollstrecker(in) / Testamentsvollstrecker(in)".toLowerCase(), Testamentsvollstrecker);
        ALIASES.put("Testator(in) / Testator(in)".toLowerCase(), Testator);
        ALIASES.put("&#220;bernehmer(in) / &#220;bernehmer(in)".toLowerCase(), Uebernehmer);
        ALIASES.put("Unterbevollm&#228;chtigte(r) / Unterbevollm&#228;chtigte(r)".toLowerCase(), Unterbevollmaechtigte);
        ALIASES.put("Ur-Enkel(in) / Ur-Enkel(in)".toLowerCase(), Ur_Enkel);
        ALIASES.put("Vater (Mutter) / Vater (Mutter)".toLowerCase(), Vater_Mutter);
        ALIASES.put("Ver&#228;u&#223;erer (Ver&#228;u&#223;erin) / Ver&#228;u&#223;erer (Ver&#228;u&#223;erin)".toLowerCase(), Veraeusserer_Veraeusserin);
        ALIASES.put("Verfahrensbevollm&#228;chtigte(r) / Verfahrensbevollm&#228;chtigte(r)".toLowerCase(), Verfahrensbevollmaechtigte);
        ALIASES.put("Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin) / Verfahrenskostenhilfe-Anwalt(-Anw&#228;ltin)".toLowerCase(), Verfahrenskostenhilfe_Anwalt_Anwaeltin);
        ALIASES.put("Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin) / Verfahrenskostenhilfe-Korrespondenzanwalt (-anw&#228;ltin)".toLowerCase(), Verfahrenskostenhilfe_Korrespondenzanwalt);
        ALIASES.put("Verfahrenspfleger(in) / Verfahrenspfleger(in)".toLowerCase(), Verfahrenspfleger);
        ALIASES.put("Verfahrensvertreter(in) (&#167;787 ZPO) / Verfahrensvertreter(in) (&#167;787 ZPO)".toLowerCase(), Verfahrensvertreter_787_ZPO);
        ALIASES.put("Verf&#252;gungsbeklagte(r) / Verf&#252;gungsbeklagte(r)".toLowerCase(), Verfuegungsbeklagte);
        ALIASES.put("Verf&#252;gungskl&#228;ger(in) / Verf&#252;gungskl&#228;ger(in)".toLowerCase(), Verfuegungsklaeger);
        ALIASES.put("Verkehrsanwalt (-anw&#228;ltin) / Verkehrsanwalt (-anw&#228;ltin)".toLowerCase(), Verkehrsanwalt);
        ALIASES.put("Verlobte(r) / Verlobte(r)".toLowerCase(), Verlobte);
        ALIASES.put("Verm&#228;chtnisnehmer(in) / Verm&#228;chtnisnehmer(in)".toLowerCase(), Vermaechtnisnehmer);
        ALIASES.put("Vermieter(in) / Vermieter(in)".toLowerCase(), Vermieter);
        ALIASES.put("Verp&#228;chter(in) / Verp&#228;chter(in)".toLowerCase(), Verpaechter);
        ALIASES.put("Versorgungstr&#228;ger(in) / Versorgungstr&#228;ger(in)".toLowerCase(), Versorgungstraeger);
        ALIASES.put("Verteidiger(in) / Defense Counsel".toLowerCase(), Verteidiger);
        ALIASES.put("Vertreter(in) der Interessen des Ausgleichsfonds / Vertreter(in) der Interessen des Ausgleichsfonds".toLowerCase(), Vertreter_der_Interessen_des_Ausgleichsfonds);
        ALIASES.put("Vertreter(in) der Staatskasse / Vertreter(in) der Staatskasse".toLowerCase(), Vertreter_der_Staatskasse);
        ALIASES.put("Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht / Vertreter(in) des Bundesinteresses beim Bundesverwaltungsgericht".toLowerCase(), Vertreter_des_Bundesinteresses_beim_Bundesverwaltungsgericht);
        ALIASES.put("Vertreter(in) des &#246;ffentlichen Interesses / Vertreter(in) des &#246;ffentlichen Interesses".toLowerCase(), Vertreter_des_oeffentlichen_Interesses);
        ALIASES.put("Verurteilte(r) / Verurteilte(r)".toLowerCase(), Verurteilte);
        ALIASES.put("Verwalter(in) der Wohnungseigent&#252;mergemeinschaft / Verwalter(in) der Wohnungseigent&#252;mergemeinschaft".toLowerCase(), Verwalter_der_Wohnungseigentuemergemeinschaft);
        ALIASES.put("Verwaltungsbeh&#246;rde / Verwaltungsbeh&#246;rde".toLowerCase(), Verwaltungsbehoerde);
        ALIASES.put("Vollstreckungsgl&#228;ubiger(in) / Vollstreckungsgl&#228;ubiger(in)".toLowerCase(), Vollstreckungsglaeubiger);
        ALIASES.put("Vollstreckungsschuldner(in) / Vollstreckungsschuldner(in)".toLowerCase(), Vollstreckungsschuldner);
        ALIASES.put("Vorl&#228;ufige(r) Betreuer(in) / Vorl&#228;ufige(r) Betreuer(in)".toLowerCase(), Vorlaeufige_Betreuer);
        ALIASES.put("Vormund / Vormund".toLowerCase(), Vormund);
        ALIASES.put("Vorstand / Vorstand".toLowerCase(), Vorstand);
        ALIASES.put("Vorsorgebevollm&#228;chtigte(r) / Vorsorgebevollm&#228;chtigte(r)".toLowerCase(), Vorsorgebevollmaechtigte);
        ALIASES.put("Wahlverteidiger(in) / Wahlverteidiger(in)".toLowerCase(), Wahlverteidiger);
        ALIASES.put("Widerbeklagte(r) / Widerbeklagte(r)".toLowerCase(), Widerbeklagte);
        ALIASES.put("Widerkl&#228;ger(in) / Widerkl&#228;ger(in)".toLowerCase(), Widerklaeger);
        ALIASES.put("Wiederaufnahmebeklagte(r) / Wiederaufnahmebeklagte(r)".toLowerCase(), Wiederaufnahmebeklagte);
        ALIASES.put("Wiederaufnahmekl&#228;ger(in) / Wiederaufnahmekl&#228;ger(in)".toLowerCase(), Wiederaufnahmeklaeger);
        ALIASES.put("Zahlungs- und Auflagenempf&#228;nger(in) / Zahlungs- und Auflagenempf&#228;nger(in)".toLowerCase(), Zahlungs_und_Auflagenempfaenger);
        ALIASES.put("Zeuge (Zeugin) / Zeuge (Zeugin)".toLowerCase(), Zeuge_Zeugin);
        ALIASES.put("Zeugenbeistand / Zeugenbeistand".toLowerCase(), Zeugenbeistand);
        ALIASES.put("Zulassungsantragsgegner(in) / Zulassungsantragsgegner(in)".toLowerCase(), Zulassungsantragsgegner);
        ALIASES.put("Zulassungsantragsteller(in) / Zulassungsantragsteller(in)".toLowerCase(), Zulassungsantragsteller);
        ALIASES.put("Zustellungsbevollm&#228;chtigte(r) / Zustellungsbevollm&#228;chtigte(r)".toLowerCase(), Zustellungsbevollmaechtigte);
        ALIASES.put("Zustellungsvertreter(in) (&#167;6 ZVG) / Zustellungsvertreter(in) (&#167;6 ZVG)".toLowerCase(), Zustellungsvertreter_6_ZVG);
        ALIASES.put("Notar(in) / Notary".toLowerCase(), Notar);
        ALIASES.put("Auskunftsempf&#228;nger(in) / Auskunftsempf&#228;nger(in)".toLowerCase(), Auskunftsempfaenger);
        ALIASES.put("Melder(in) / Melder(in)".toLowerCase(), Melder);
        ALIASES.put("Verwahrstelle / Verwahrstelle".toLowerCase(), Verwahrstelle);
        ALIASES.put("Aussteller(in) / Aussteller(in)".toLowerCase(), Aussteller);
        ALIASES.put("Berechtigte(r) / Berechtigte(r)".toLowerCase(), Berechtigte);
        ALIASES.put("Berechtigte(r) an einem Recht / Berechtigte(r) an einem Recht".toLowerCase(), Berechtigte_an_einem_Recht);
        ALIASES.put("Einreicher(in) / Einreicher(in)".toLowerCase(), Einreicher);
        ALIASES.put("Erbbauberechtigte(r) / Erbbauberechtigte(r)".toLowerCase(), Erbbauberechtigte);
        ALIASES.put("Finanzamt / Finanzamt".toLowerCase(), Finanzamt);
        ALIASES.put("Grundbuchvertreter(in) / Grundbuchvertreter(in)".toLowerCase(), Grundbuchvertreter);
        ALIASES.put("Insolvenzgericht / Insolvenzgericht".toLowerCase(), Insolvenzgericht);
        ALIASES.put("Mitteilungsempf&#228;nger(in) / Mitteilungsempf&#228;nger(in)".toLowerCase(), Mitteilungsempfaenger);
        ALIASES.put("Nacherbe (Nacherbin) / Nacherbe (Nacherbin)".toLowerCase(), Nacherbe_Nacherbin);
        ALIASES.put("Rechnungsempf&#228;nger(in) / Rechnungsempf&#228;nger(in)".toLowerCase(), Rechnungsempfaenger);
        ALIASES.put("Veranlasser(in) / Veranlasser(in)".toLowerCase(), Veranlasser);
        ALIASES.put("Versteigerungsabteilung / Versteigerungsabteilung".toLowerCase(), Versteigerungsabteilung);
        ALIASES.put("Vertretungsberechtigte(r) / Vertretungsberechtigte(r)".toLowerCase(), Vertretungsberechtigte);
        ALIASES.put("Zweitschuldner(in) / Zweitschuldner(in)".toLowerCase(), Zweitschuldner);
        ALIASES.put("Vertreter(in) / Vertreter(in)".toLowerCase(), Vertreter);
        ALIASES.put("Arbeitgeber(in) / Arbeitgeber(in)".toLowerCase(), Arbeitgeber);
        ALIASES.put("RV-Tr&#228;ger(in) / RV-Tr&#228;ger(in)".toLowerCase(), RV_Traeger);
        ALIASES.put("Vollstreckungsstelle / Vollstreckungsstelle".toLowerCase(), Vollstreckungsstelle);
        ALIASES.put("Abk&#246;mmling / Abk&#246;mmling".toLowerCase(), Abkoemmling);
        ALIASES.put("Kreditnehmer(in) / Kreditnehmer(in)".toLowerCase(), Kreditnehmer);
        ALIASES.put("Neu vorzutragende(r) Eigent&#252;mer(in) / Neu vorzutragende(r) Eigent&#252;mer(in)".toLowerCase(), Neu_vorzutragende_Eigentuemer);
        ALIASES.put("Notariatsverwalter(in) / Notariatsverwalter(in)".toLowerCase(), Notariatsverwalter);
        ALIASES.put("Notarvertreter(in) / Notarvertreter(in)".toLowerCase(), Notarvertreter);
        ALIASES.put("Partei kraft Amtes / Partei kraft Amtes".toLowerCase(), Partei_kraft_Amtes);
        ALIASES.put("Sequester / Sequester".toLowerCase(), Sequester);
        ALIASES.put("Treuh&#228;nder(in) / Treuh&#228;nder(in)".toLowerCase(), Treuhaender);
        ALIASES.put("Zustimmende(r) / Zustimmende(r)".toLowerCase(), Zustimmende);
        ALIASES.put("Gl&#228;ubigervertreter(in) / Gl&#228;ubigervertreter(in)".toLowerCase(), Glaeubigervertreter);
        ALIASES.put("Schuldnervertreter(in) / Schuldnervertreter(in)".toLowerCase(), Schuldnervertreter);
        ALIASES.put("Zahlungsempf&#228;nger(in) / Zahlungsempf&#228;nger(in)".toLowerCase(), Zahlungsempfaenger);
        ALIASES.put("Anteilsinhaber(in) / Anteilsinhaber(in)".toLowerCase(), Anteilsinhaber);
        ALIASES.put("Antragsteller(in) -Er&#246;ffnung / Antragsteller(in) -Er&#246;ffnung".toLowerCase(), Antragsteller_Eroeffnung);
        ALIASES.put("Debitor(in) / Debitor(in)".toLowerCase(), Debitor);
        ALIASES.put("Gesellschafter(in) / Gesellschafter(in)".toLowerCase(), Gesellschafter);
        ALIASES.put("Handlungsbevollm&#228;chtigte(r) / Handlungsbevollm&#228;chtigte(r)".toLowerCase(), Handlungsbevollmaechtigte);
        ALIASES.put("Mitglied einer Gesamt-Anteilsinhaberschaft / Mitglied einer Gesamt-Anteilsinhaberschaft".toLowerCase(), Mitglied_einer_Gesamt_Anteilsinhaberschaft);
        ALIASES.put("Mitglied einer Gl&#228;ubigergemeinschaft / Mitglied einer Gl&#228;ubigergemeinschaft".toLowerCase(), Mitglied_einer_Glaeubigergemeinschaft);
        ALIASES.put("Mitreeder(in) / Mitreeder(in)".toLowerCase(), Mitreeder);
        ALIASES.put("Partner(in) / Partner(in)".toLowerCase(), Partner);
        ALIASES.put("Pers&#246;nlich haftende(r) Gesellschafter(in) / Pers&#246;nlich haftende(r) Gesellschafter(in)".toLowerCase(), Persoenlich_haftende_Gesellschafter);
        ALIASES.put("Prozesspfleger(in) / Prozesspfleger(in)".toLowerCase(), Prozesspfleger);
        ALIASES.put("Sachwalter(in) / Sachwalter(in)".toLowerCase(), Sachwalter);
        ALIASES.put("Treuh&#228;nder(in) (Wohlverhaltensperiode) / Treuh&#228;nder(in) (Wohlverhaltensperiode)".toLowerCase(), Treuhaender_Wohlverhaltensperiode);
        ALIASES.put("Verm&#246;genstr&#228;ger(in) / Verm&#246;genstr&#228;ger(in)".toLowerCase(), Vermoegenstraeger);
        ALIASES.put("Vorl&#228;ufige(r) Insolvenzverwalter(in) / Vorl&#228;ufige(r) Insolvenzverwalter(in)".toLowerCase(), Vorlaeufige_Insolvenzverwalter);
        ALIASES.put("Vorl&#228;ufige(r) Treuh&#228;nder(in) / Vorl&#228;ufige(r) Treuh&#228;nder(in)".toLowerCase(), Vorlaeufige_Treuhaender);
        ALIASES.put("Sondersachwalter(in) / Sondersachwalter(in)".toLowerCase(), Sondersachwalter);
        ALIASES.put("Sonderinsolvenzverwalter(in) / Sonderinsolvenzverwalter(in)".toLowerCase(), Sonderinsolvenzverwalter);
        ALIASES.put("Vorl&#228;ufige(r) Sachwalter(in) / Vorl&#228;ufige(r) Sachwalter(in)".toLowerCase(), Vorlaeufige_Sachwalter);
        ALIASES.put("Abwickler(in) / Abwickler(in)".toLowerCase(), Abwickler);
        ALIASES.put("&#220;bernehmender Rechtstr&#228;ger / &#220;bernehmender Rechtstr&#228;ger".toLowerCase(), Uebernehmender_Rechtstraeger);
        ALIASES.put("Aufsichtsrat (-r&#228;tin) / Aufsichtsrat (-r&#228;tin)".toLowerCase(), Aufsichtsrat_raetin);
        ALIASES.put("Besondere(r) Vertreter(in) nach &#167; 30 BGB / Besondere(r) Vertreter(in) nach &#167; 30 BGB".toLowerCase(), Besondere_Vertreter_nach_30_BGB);
        ALIASES.put("Betriebsleiter(in) / Betriebsleiter(in)".toLowerCase(), Betriebsleiter);
        ALIASES.put("Empfangsberechtigte(r) / Empfangsberechtigte(r)".toLowerCase(), Empfangsberechtigte);
        ALIASES.put("Gesch&#228;ftsf&#252;hrende(r) Direktor(in) / Gesch&#228;ftsf&#252;hrende(r) Direktor(in)".toLowerCase(), Geschaeftsfuehrende_Direktor);
        ALIASES.put("Gesch&#228;ftsleiter(in) / Gesch&#228;ftsleiter(in)".toLowerCase(), Geschaeftsleiter);
        ALIASES.put("Gr&#252;nder(in) / Gr&#252;nder(in)".toLowerCase(), Gruender);
        ALIASES.put("Gr&#252;ndungspr&#252;fer(in) / Gr&#252;ndungspr&#252;fer(in)".toLowerCase(), Gruendungspruefer);
        ALIASES.put("Hauptniederlassung / Hauptniederlassung".toLowerCase(), Hauptniederlassung);
        ALIASES.put("Inhaber(in) / Inhaber(in)".toLowerCase(), Inhaber);
        ALIASES.put("Kommanditist(in) / Kommanditist(in)".toLowerCase(), Kommanditist);
        ALIASES.put("Konkursverwalter(in) / Konkursverwalter(in)".toLowerCase(), Konkursverwalter);
        ALIASES.put("Mitglied des Leitungsorgans / Mitglied des Leitungsorgans".toLowerCase(), Mitglied_des_Leitungsorgans);
        ALIASES.put("Mitglied EWIV / Mitglied EWIV".toLowerCase(), Mitglied_EWIV);
        ALIASES.put("Nachgr&#252;ndungspr&#252;fer(in) / Nachgr&#252;ndungspr&#252;fer(in)".toLowerCase(), Nachgruendungspruefer);
        ALIASES.put("Nachtragsabwickler(in) / Nachtragsabwickler(in)".toLowerCase(), Nachtragsabwickler);
        ALIASES.put("Nachtragsliquidator(in) / Nachtragsliquidator(in)".toLowerCase(), Nachtragsliquidator);
        ALIASES.put("Notgesch&#228;ftsf&#252;hrer(in) / Notgesch&#228;ftsf&#252;hrer(in)".toLowerCase(), Notgeschaeftsfuehrer);
        ALIASES.put("Notliquidator(in) / Notliquidator(in)".toLowerCase(), Notliquidator);
        ALIASES.put("Notvorstand / Notvorstand".toLowerCase(), Notvorstand);
        ALIASES.put("Prokurist(in) / Prokurist(in)".toLowerCase(), Prokurist);
        ALIASES.put("Rechtstr&#228;ger(in) / Rechtstr&#228;ger(in)".toLowerCase(), Rechtstraeger);
        ALIASES.put("Registergericht / Registergericht".toLowerCase(), Registergericht);
        ALIASES.put("Sacheinlagenpr&#252;fer(in) / Sacheinlagenpr&#252;fer(in)".toLowerCase(), Sacheinlagenpruefer);
        ALIASES.put("St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung / St&#228;ndige(r) Vertreter(in) f&#252;r die Zweigniederlassung".toLowerCase(), Staendige_Vertreter_fuer_die_Zweigniederlassung);
        ALIASES.put("&#220;bertragender Rechtstr&#228;ger / &#220;bertragender Rechtstr&#228;ger".toLowerCase(), Uebertragender_Rechtstraeger);
        ALIASES.put("Vergleichsverwalter(in) / Vergleichsverwalter(in)".toLowerCase(), Vergleichsverwalter);
        ALIASES.put("Verwaltungsrat (-r&#228;tin) / Verwaltungsrat (-r&#228;tin)".toLowerCase(), Verwaltungsrat_raetin);
        ALIASES.put("Vorstandsvorsitzende(r) / Vorstandsvorsitzende(r)".toLowerCase(), Vorstandsvorsitzende);
        ALIASES.put("Zweigniederlassung / Zweigniederlassung".toLowerCase(), Zweigniederlassung);
        ALIASES.put("Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin / Vertreter(in) des Kl&#228;gers/der Kl&#228;gerin".toLowerCase(), Vertreter_des_Klaegers_oder_der_Klaegerin);
        ALIASES.put("Vertreter(in) des/der Beklagten / Vertreter(in) des/der Beklagten".toLowerCase(), Vertreter_des_oder_der_Beklagten);
        ALIASES.put("Bew&#228;hrungshilfe / Bew&#228;hrungshilfe".toLowerCase(), Bewaehrungshilfe);
        ALIASES.put("Gerichtshilfe / Gerichtshilfe".toLowerCase(), Gerichtshilfe);
        ALIASES.put("Justizvollzug / Justizvollzug".toLowerCase(), Justizvollzug);
        ALIASES.put("Pseudoname / Pseudoname".toLowerCase(), Pseudoname);
        ALIASES.put("Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin / Gesetzliche(r) Vertreter(in) des Gl&#228;ubigers/der Gl&#228;ubigerin".toLowerCase(), Gesetzliche_Vertreter_des_Glaeubigers_oder_der_Glaeubigerin);
        ALIASES.put("Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin / Gesetzliche(r) Vertreter(in) des Schuldners/der Schuldnerin".toLowerCase(), Gesetzliche_Vertreter_des_Schuldners_oder_der_Schuldnerin);
        ALIASES.put("Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin / Bevollm&#228;chtigte(r) des Gl&#228;ubigers/der Gl&#228;ubigerin".toLowerCase(), Bevollmaechtigte_des_Glaeubigers_oder_der_Glaeubigerin);
        ALIASES.put("Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin / Bevollm&#228;chtigte(r) des Schuldners/der Schuldnerin".toLowerCase(), Bevollmaechtigte_des_Schuldners_oder_der_Schuldnerin);
        ALIASES.put("Fahrzeughalter(in) / Fahrzeughalter(in)".toLowerCase(), Fahrzeughalter);
        ALIASES.put("Fr&#252;here(r) Lebenspartner(in) / Fr&#252;here(r) Lebenspartner(in)".toLowerCase(), Fruehere_Lebenspartner);
        ALIASES.put("Sicherungsverwalter(in) / Sicherungsverwalter(in)".toLowerCase(), Sicherungsverwalter);
        ALIASES.put("Zwangsverwalter(in) / Zwangsverwalter(in)".toLowerCase(), Zwangsverwalter);
        ALIASES.put("Mieter(in) / Mieter(in)".toLowerCase(), Mieter);
        ALIASES.put("B&#252;rge (B&#252;rgin) / B&#252;rge (B&#252;rgin)".toLowerCase(), Buerge_Buergin);
        ALIASES.put("Meistbietende(r) / Meistbietende(r)".toLowerCase(), Meistbietende);
        ALIASES.put("Abschlusspr&#252;fer(in) / Abschlusspr&#252;fer(in)".toLowerCase(), Abschlusspruefer);
        ALIASES.put("Antragstellervertreter(in) / Antragstellervertreter(in)".toLowerCase(), Antragstellervertreter);
    }

    private static void initAliases1() {
        ALIASES.put("Aufsichtsratsvorsitzende(r) / Aufsichtsratsvorsitzende(r)".toLowerCase(), Aufsichtsratsvorsitzende);
        ALIASES.put("Berufskammer / Berufskammer".toLowerCase(), Berufskammer);
        ALIASES.put("Betroffenenvertreter(in) / Betroffenenvertreter(in)".toLowerCase(), Betroffenenvertreter);
        ALIASES.put("B&#252;rgermeister(in) / B&#252;rgermeister(in)".toLowerCase(), Buergermeister);
        ALIASES.put("Eingliederungsbeteiligte(r) / Eingliederungsbeteiligte(r)".toLowerCase(), Eingliederungsbeteiligte);
        ALIASES.put("Formwechselnder Rechtstr&#228;ger / Formwechselnder Rechtstr&#228;ger".toLowerCase(), Formwechselnder_Rechtstraeger);
        ALIASES.put("Gewerbeamt / Gewerbeamt".toLowerCase(), Gewerbeamt);
        ALIASES.put("Inhaber(in) (nicht eingetragen) / Inhaber(in) (nicht eingetragen)".toLowerCase(), Inhaber_nicht_eingetragen);
        ALIASES.put("Kostenempf&#228;nger(in) / Kostenempf&#228;nger(in)".toLowerCase(), Kostenempfaenger);
        ALIASES.put("Nachlassgericht / Nachlassgericht".toLowerCase(), Nachlassgericht);
        ALIASES.put("Sonderpr&#252;fer(in) / Sonderpr&#252;fer(in)".toLowerCase(), Sonderpruefer);
        ALIASES.put("Sonstige(r) gerichtlich bestellte(r) Vertreter(in) / Sonstige(r) gerichtlich bestellte(r) Vertreter(in)".toLowerCase(), Sonstige_gerichtlich_bestellte_Vertreter);
        ALIASES.put("Sonstige(r) gesetzliche(r) Vertreter(in) BGB / Sonstige(r) gesetzliche(r) Vertreter(in) BGB".toLowerCase(), Sonstige_gesetzliche_Vertreter_BGB);
        ALIASES.put("Sonstige(r) organschaftliche(r) Vertreter(in) HRB / Sonstige(r) organschaftliche(r) Vertreter(in) HRB".toLowerCase(), Sonstige_organschaftliche_Vertreter_HRB);
        ALIASES.put("Standardkostenschuldner(in) / Standardkostenschuldner(in)".toLowerCase(), Standardkostenschuldner);
        ALIASES.put("&#220;bernahmeschuldner(in) / &#220;bernahmeschuldner(in)".toLowerCase(), Uebernahmeschuldner);
        ALIASES.put("Unternehmensvertragsbeteiligte(r) / Unternehmensvertragsbeteiligte(r)".toLowerCase(), Unternehmensvertragsbeteiligte);
        ALIASES.put("Vertreter(in) des pers&#246;nlich haftenden Gesellschafters / Vertreter(in) des pers&#246;nlich haftenden Gesellschafters".toLowerCase(), Vertreter_des_persoenlich_haftenden_Gesellschafters);
        ALIASES.put("Werkleiter(in) / Werkleiter(in)".toLowerCase(), Werkleiter);
        ALIASES.put("Mehrfachsitz / Mehrfachsitz".toLowerCase(), Mehrfachsitz);
        ALIASES.put("Mitglied VR / Mitglied VR".toLowerCase(), Mitglied_VR);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als Abwicklerin / Mitglied e. BGB-Gesellschaft als Abwicklerin".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_Abwicklerin);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als ges. Vertreterin / Mitglied e. BGB-Gesellschaft als ges. Vertreterin".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_ges_Vertreterin);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als Kommanditistin / Mitglied e. BGB-Gesellschaft als Kommanditistin".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_Kommanditistin);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als Liquidatorin / Mitglied e. BGB-Gesellschaft als Liquidatorin".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_Liquidatorin);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV / Mitglied e. BGB-Gesellschaft als Mitglied e. EWIV".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_Mitglied_e_EWIV);
        ALIASES.put("Mitglied e. BGB-Gesellschaft als phG / Mitglied e. BGB-Gesellschaft als phG".toLowerCase(), Mitglied_e_BGB_Gesellschaft_als_phG);
        ALIASES.put("Mitglied e. Erbengemeinschaft als ges. Vertreterin / Mitglied e. Erbengemeinschaft als ges. Vertreterin".toLowerCase(), Mitglied_e_Erbengemeinschaft_als_ges_Vertreterin);
        ALIASES.put("Mitglied e. Erbengemeinschaft als Inhaberin / Mitglied e. Erbengemeinschaft als Inhaberin".toLowerCase(), Mitglied_e_Erbengemeinschaft_als_Inhaberin);
        ALIASES.put("Mitglied e. Erbengemeinschaft als Kommanditistin / Mitglied e. Erbengemeinschaft als Kommanditistin".toLowerCase(), Mitglied_e_Erbengemeinschaft_als_Kommanditistin);
        ALIASES.put("Mitglied e. Erbengemeinschaft als Mitglied e. EWIV / Mitglied e. Erbengemeinschaft als Mitglied e. EWIV".toLowerCase(), Mitglied_e_Erbengemeinschaft_als_Mitglied_e_EWIV);
        ALIASES.put("Nebensitz / Nebensitz".toLowerCase(), Nebensitz);
        ALIASES.put("Gesamthandsgemeinschaft / Gesamthandsgemeinschaft".toLowerCase(), Gesamthandsgemeinschaft);
        ALIASES.put("Mitglied einer Gesamthandsgemeinschaft / Mitglied einer Gesamthandsgemeinschaft".toLowerCase(), Mitglied_einer_Gesamthandsgemeinschaft);
        ALIASES.put("Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG / Leitungsperson i.S.v. &#167; 30 Abs. 1 Nr. 1 bis 5 OWiG".toLowerCase(), Leitungsperson_iSv_30_Abs_1_Nr_1_bis_5_OWiG);
        ALIASES.put("Einziehungsbeteiligter / Einziehungsbeteiligter".toLowerCase(), Einziehungsbeteiligter);
        ALIASES.put("Antragsgegnervertreter(in) / Antragsgegnervertreter(in)".toLowerCase(), Antragsgegnervertreter);
        ALIASES.put("Verbraucher(in) / Verbraucher(in)".toLowerCase(), Verbraucher);
        ALIASES.put("Vielmelder(in) / Vielmelder(in)".toLowerCase(), Vielmelder);
        ALIASES.put("Vollmachtgeber(in) / Vollmachtgeber(in)".toLowerCase(), Vollmachtgeber);
        ALIASES.put("Nebenbeteiligte(r) &#167; 444 StPO / Nebenbeteiligte(r) &#167; 444 StPO".toLowerCase(), Nebenbeteiligte_444_StPO);
        ALIASES.put("Verfallsbeteiligte(r) &#167; 442 StPO a.F. / Verfallsbeteiligte(r) &#167; 442 StPO a.F.".toLowerCase(), Verfallsbeteiligte_442_StPO_aF);
        ALIASES.put("Verfolgte(r) &#167; 34 IRG / Verfolgte(r) &#167; 34 IRG".toLowerCase(), Verfolgte_34_IRG);
        ALIASES.put("Rechtsnachfolger(in) / Rechtsnachfolger(in)".toLowerCase(), Rechtsnachfolger);
        ALIASES.put("Statuswechselnde(r) Rechtstr&#228;ger(in) / Statuswechselnde(r) Rechtstr&#228;ger(in)".toLowerCase(), Statuswechselnde_Rechtstraeger);
        ALIASES.put("Haftangeh&#246;rige / Haftangeh&#246;rige".toLowerCase(), Haftangehoerige);
        ALIASES.put("Restrukturierungsbeauftragte(r) / Restrukturierungsbeauftragte(r)".toLowerCase(), Restrukturierungsbeauftragte);
        ALIASES.put("Sanierungsmoderator(in) / Sanierungsmoderator(in)".toLowerCase(), Sanierungsmoderator);
        ALIASES.put("Abschriftenempf&#228;nger(in) / Abschriftenempf&#228;nger(in)".toLowerCase(), Abschriftenempfaenger);
        ALIASES.put("Kostenbeamte(r) / Kostenbeamte(r)".toLowerCase(), Kostenbeamte);
        ALIASES.put("Urkundsbeamte(r) der Gesch&#228;ftsstelle / Urkundsbeamte(r) der Gesch&#228;ftsstelle".toLowerCase(), Urkundsbeamte_der_Geschaeftsstelle);
        ALIASES.put("Anordnungsbefugte(r) / Anordnungsbefugte(r)".toLowerCase(), Anordnungsbefugte);
        ALIASES.put("Erstschuldner(in) / Erstschuldner(in)".toLowerCase(), Erstschuldner);
        ALIASES.put("Kasse / Kasse".toLowerCase(), Kasse);
        ALIASES.put("Arrestbeklagte(r) / Arrestbeklagte(r)".toLowerCase(), Arrestbeklagte);
        ALIASES.put("Arrestkl&#228;ger(in) / Arrestkl&#228;ger(in)".toLowerCase(), Arrestklaeger);
        ALIASES.put("Bezirksrevisor(in) / Bezirksrevisor(in)".toLowerCase(), Bezirksrevisor);
        ALIASES.put("Nebenintervenient(in) / Nebenintervenient(in)".toLowerCase(), Nebenintervenient);
        ALIASES.put("Restitutionsbeklagte(r) / Restitutionsbeklagte(r)".toLowerCase(), Restitutionsbeklagte);
        ALIASES.put("Restitutionskl&#228;ger(in) / Restitutionskl&#228;ger(in)".toLowerCase(), Restitutionsklaeger);
        ALIASES.put("Streithelfer(in) / Streithelfer(in)".toLowerCase(), Streithelfer);
        ALIASES.put("Streitverk&#252;ndete(r) / Streitverk&#252;ndete(r)".toLowerCase(), Streitverkuendete);
        ALIASES.put("&#220;bersetzer(in) / &#220;bersetzer(in)".toLowerCase(), Uebersetzer);
        ALIASES.put("Unternehmen / Company".toLowerCase(), Unternehmen_378);
        ALIASES.put("Kontaktperson des Unternehmens / Kontaktperson des Unternehmens".toLowerCase(), Kontaktperson_des_Unternehmens);
        ALIASES.put("Beigetretene(r) / Beigetretene(r)".toLowerCase(), Beigetretene);
        ALIASES.put("Erkl&#228;rende(r) / Erkl&#228;rende(r)".toLowerCase(), Erklaerende);
        ALIASES.put("Heim / Heim".toLowerCase(), Heim);
        ALIASES.put("Inhaftierte Person / Inhaftierte Person".toLowerCase(), Inhaftierte_Person);
        ALIASES.put("Jugendgerichtshilfe / Jugendgerichtshilfe".toLowerCase(), Jugendgerichtshilfe);
        ALIASES.put("Krankenhaus / Krankenhaus".toLowerCase(), Krankenhaus);
        ALIASES.put("Nebenbetroffene(r) / Nebenbetroffene(r)".toLowerCase(), Nebenbetroffene);
        ALIASES.put("Nebenkl&#228;gervertreter(in) / Nebenkl&#228;gervertreter(in)".toLowerCase(), Nebenklaegervertreter);
        ALIASES.put("Psychosoziale(r) Prozessbegleiter(in) / Psychosoziale(r) Prozessbegleiter(in)".toLowerCase(), Psychosoziale_Prozessbegleiter);
        ALIASES.put("Rentenberater(in) / Rentenberater(in)".toLowerCase(), Rentenberater);
        ALIASES.put("Sachverst&#228;ndige(n) Zeuge (Zeugin) / Sachverst&#228;ndige(n) Zeuge (Zeugin)".toLowerCase(), Sachverstaendigen_Zeuge_Zeugin);
        ALIASES.put("Steuerberater(in) / Steuerberater(in)".toLowerCase(), Steuerberater);
        ALIASES.put("Unternehmen / Company".toLowerCase(), Unternehmen_392);
        ALIASES.put("Verfahrensbeistand / Verfahrensbeistand".toLowerCase(), Verfahrensbeistand);
        ALIASES.put("Verfahrensbeteiligte(r) / Verfahrensbeteiligte(r)".toLowerCase(), Verfahrensbeteiligte);
        ALIASES.put("Verhinderungsbetreuer / Verhinderungsbetreuer".toLowerCase(), Verhinderungsbetreuer);
        ALIASES.put("Verletztenbeistand / Verletztenbeistand".toLowerCase(), Verletztenbeistand);
        ALIASES.put("Wirtschaftspr&#252;fer(in) / Wirtschaftspr&#252;fer(in)".toLowerCase(), Wirtschaftspruefer);
        ALIASES.put("Zedent(in) / Zedent(in)".toLowerCase(), Zedent);
        ALIASES.put("Registerf&#252;hrende Beh&#246;rde/Stelle / Registerf&#252;hrende Beh&#246;rde/Stelle".toLowerCase(), Registerfuehrende_Behoerde_oder_Stelle);
    }

    /**
     * Gets the xml value.
     * @return the xml value
     */
    @JsonValue
    public String getValue() { return value; }

    /**
     * Creates an enum from a string value.
     * @param value the string value
     * @return the enum value
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static RollenCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (RollenCode e : RollenCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        RollenCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
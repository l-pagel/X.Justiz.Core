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
     * Rolle Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Codeliste GDS.Rollenbezeichnung</a>.
     *  * <p>
     *  *  <u><b>Role codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Code list GDS.RoleName</a>.
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Abwesenheitspfleger("001"),

    /**
     * Rolle Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Codeliste GDS.Rollenbezeichnung</a>.
     *  * <p>
     *  *  <u><b>Role codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Code list GDS.RoleName</a>.
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Aliasidentitaet("002"),

    /**
     * Rolle Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Codeliste GDS.Rollenbezeichnung</a>.
     *  * <p>
     *  *  <u><b>Role codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.rollenbezeichnung">XRepository: Code list GDS.RoleName</a>.
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Angehoerige("003"),

    /**
     * <b>Abwesenheitspfleger(in) / Absentee Curator</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    Angeklagte("004"),

    /**
     * <b>Abwesenheitspfleger(in) / Absentee Curator</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Angeschuldigte("005"),

    /**
     * <b>Abwesenheitspfleger(in) / Absentee Curator</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Annehmende("006"),

    /**
     * <b>Abwesenheitspfleger(in) / Absentee Curator</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Anschlussberufungsbeklagte("007"),

    /**
     * <b>Aliasidentit&#228;t / Alias Identity</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    Anschlussberufungsklaeger("008"),

    /**
     * <b>Aliasidentit&#228;t / Alias Identity</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("009")
    @XmlEnumValue("009")
    Anschlussbeschwerdefuehrer("009"),

    /**
     * <b>Angeh&#246;rige(r) / Relative</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Anschlussbeschwerdegegner("010"),

    /**
     * <b>Angeh&#246;rige(r) / Relative</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Anschlussrechtsbeschwerdefuehrer("011"),

    /**
     * <b>Angeh&#246;rige(r) / Relative</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Anschlussrechtsbeschwerdegegner("012"),

    /**
     * <b>Angeklagte(r) / Accused</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Anschlussrevisionsbeklagte("013"),

    /**
     * <b>Angeklagte(r) / Accused</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Anschlussrevisionsklaeger("014"),

    /**
     * <b>Angeschuldigte(r) / Indicted</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Antragsgegner("015"),

    /**
     * <b>Angeschuldigte(r) / Indicted</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("016")
    @XmlEnumValue("016")
    Antragsteller("016"),

    /**
     * <b>Angeschuldigte(r) / Indicted</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("017")
    @XmlEnumValue("017")
    Anzeigeerstatter("017"),

    /**
     * <b>Annehmende(r) / Adopter</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("018")
    @XmlEnumValue("018")
    Anzunehmende("018"),

    /**
     * <b>Annehmende(r) / Adopter</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("019")
    @XmlEnumValue("019")
    Arrestglaeubiger("019"),

    /**
     * <b>Annehmende(r) / Adopter</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("020")
    @XmlEnumValue("020")
    Arrestschuldner("020"),

    /**
     * <b>Annehmende(r) / Adopter</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Aufsichtsbehoerde("021"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("022")
    @XmlEnumValue("022")
    Ausschlagende("022"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("023")
    @XmlEnumValue("023")
    Beamter_Beamtin("023"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("024")
    @XmlEnumValue("024")
    Behoerde("024"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("025")
    @XmlEnumValue("025")
    Beigeladene("025"),

    /**
     * <b>Anschlussberufungsbeklagte(r) / Anschlussberufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("026")
    @XmlEnumValue("026")
    Beistand("026"),

    /**
     * <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("027")
    @XmlEnumValue("027")
    Bekannte("027"),

    /**
     * <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("028")
    @XmlEnumValue("028")
    Beklagte("028"),

    /**
     * <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("029")
    @XmlEnumValue("029")
    Berufungsbeklagte("029"),

    /**
     * <b>Anschlussberufungskl&#228;ger(in) / Anschlussberufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("030")
    @XmlEnumValue("030")
    Berufungsklaeger("030"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("031")
    @XmlEnumValue("031")
    Beschuldigte("031"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("032")
    @XmlEnumValue("032")
    Beschwerdefuehrer("032"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("033")
    @XmlEnumValue("033")
    Beschwerdegegner("033"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("034")
    @XmlEnumValue("034")
    Besucher("034"),

    /**
     * <b>Anschlussbeschwerdef&#252;hrer(in) / Anschlussbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("036")
    @XmlEnumValue("036")
    Betreibende_Glaeubige("036"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("037")
    @XmlEnumValue("037")
    Betreuer("037"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("038")
    @XmlEnumValue("038")
    Betreute("038"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("039")
    @XmlEnumValue("039")
    Betreuungsbehoerde("039"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("040")
    @XmlEnumValue("040")
    Betroffene("040"),

    /**
     * <b>Anschlussbeschwerdegegner(in) / Anschlussbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("041")
    @XmlEnumValue("041")
    Bevollmaechtigte("041"),

    /**
     * <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("042")
    @XmlEnumValue("042")
    Bewaehrungshelfer("042"),

    /**
     * <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("043")
    @XmlEnumValue("043")
    Beweisanwalt("043"),

    /**
     * <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("044")
    @XmlEnumValue("044")
    Bruder_Schwester("044"),

    /**
     * <b>Anschlussrechtsbeschwerdef&#252;hrer(in) / Anschlussrechtsbeschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("045")
    @XmlEnumValue("045")
    Bundeswehrdisziplinaranwalt("045"),

    /**
     * <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("046")
    @XmlEnumValue("046")
    Bussgeldempfaenger("046"),

    /**
     * <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("047")
    @XmlEnumValue("047")
    Cousin("047"),

    /**
     * <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("048")
    @XmlEnumValue("048")
    Dienstvorgesetzte("048"),

    /**
     * <b>Anschlussrechtsbeschwerdegegner(in) / Anschlussrechtsbeschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("049")
    @XmlEnumValue("049")
    director("049"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("050")
    @XmlEnumValue("050")
    Dolmetscher("050"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("051")
    @XmlEnumValue("051")
    Dritte("051"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("052")
    @XmlEnumValue("052")
    Drittschuldner("052"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("053")
    @XmlEnumValue("053")
    Drittwiderbeklagte("053"),

    /**
     * <b>Anschlussrevisionsbeklagte(r) / Anschlussrevisionsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("054")
    @XmlEnumValue("054")
    Drittwiderklaeger("054"),

    /**
     * <b>Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("056")
    @XmlEnumValue("056")
    Ehemann_Ehefrau("056"),

    /**
     * <b>Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("057")
    @XmlEnumValue("057")
    Eigentuemer("057"),

    /**
     * <b>Anschlussrevisionskl&#228;ger(in) / Anschlussrevisionskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("058")
    @XmlEnumValue("058")
    Eingetragene_Lebenspartner("058"),

    /**
     * <b>Antragsgegner(in) / Respondent</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("059")
    @XmlEnumValue("059")
    Einleitungsbehoerde("059"),

    /**
     * <b>Antragsgegner(in) / Respondent</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("060")
    @XmlEnumValue("060")
    Eltern("060"),

    /**
     * <b>Antragsgegner(in) / Respondent</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("061")
    @XmlEnumValue("061")
    Elternteil("061"),

    /**
     * <b>Antragsgegner(in) / Respondent</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("062")
    @XmlEnumValue("062")
    Enkel("062"),

    /**
     * <b>Antragsteller(in) / Applicant</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("063")
    @XmlEnumValue("063")
    Erbe_Erbin("063"),

    /**
     * <b>Antragsteller(in) / Applicant</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("064")
    @XmlEnumValue("064")
    Erbe_Erbin_ausschlagend("064"),

    /**
     * <b>Antragsteller(in) / Applicant</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("065")
    @XmlEnumValue("065")
    Erbe_Erbin_vorverstorben("065"),

    /**
     * <b>Anzeigeerstatter(in) / Complainant</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("066")
    @XmlEnumValue("066")
    Erblasser("066"),

    /**
     * <b>Anzeigeerstatter(in) / Complainant</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("067")
    @XmlEnumValue("067")
    Ergaenzungspfleger("067"),

    /**
     * <b>Anzeigeerstatter(in) / Complainant</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("068")
    @XmlEnumValue("068")
    Erinnerungsfuehrer("068"),

    /**
     * <b>Anzunehmende(r) / Anzunehmende(r)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("069")
    @XmlEnumValue("069")
    Erinnerungsgegner("069"),

    /**
     * <b>Anzunehmende(r) / Anzunehmende(r)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("070")
    @XmlEnumValue("070")
    Ersatzbetreuer("070"),

    /**
     * <b>Anzunehmende(r) / Anzunehmende(r)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("071")
    @XmlEnumValue("071")
    Ersteher("071"),

    /**
     * <b>Anzunehmende(r) / Anzunehmende(r)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("072")
    @XmlEnumValue("072")
    Erwerber("072"),

    /**
     * <b>Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("073")
    @XmlEnumValue("073")
    Erziehungsberechtigte("073"),

    /**
     * <b>Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("074")
    @XmlEnumValue("074")
    Fruehere_Ehegatte_Ehegattin("074"),

    /**
     * <b>Arrestgl&#228;ubiger(in) / Arrestgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("075")
    @XmlEnumValue("075")
    Fruehere_Beklagte("075"),

    /**
     * <b>Arrestschuldner(in) / Arrestschuldner(in)</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("076")
    @XmlEnumValue("076")
    Fruehere_Beteiligte("076"),

    /**
     * <b>Arrestschuldner(in) / Arrestschuldner(in)</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("077")
    @XmlEnumValue("077")
    Fruehere_Glaeubiger("077"),

    /**
     * <b>Arrestschuldner(in) / Arrestschuldner(in)</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("078")
    @XmlEnumValue("078")
    Fruehere_Klaeger("078"),

    /**
     * <b>Arrestschuldner(in) / Arrestschuldner(in)</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("079")
    @XmlEnumValue("079")
    Fruehere_Soldat("079"),

    /**
     * <b>Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("080")
    @XmlEnumValue("080")
    Gegenvormund("080"),

    /**
     * <b>Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("081")
    @XmlEnumValue("081")
    Generalbundesanwalt("081"),

    /**
     * <b>Aufsichtsbeh&#246;rde / Aufsichtsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("082")
    @XmlEnumValue("082")
    Gericht("082"),

    /**
     * <b>Ausschlagende(r) / Ausschlagende(r)</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("083")
    @XmlEnumValue("083")
    Gerichtsvollzieher("083"),

    /**
     * <b>Ausschlagende(r) / Ausschlagende(r)</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("084")
    @XmlEnumValue("084")
    Geschaedigte("084"),

    /**
     * <b>Ausschlagende(r) / Ausschlagende(r)</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("085")
    @XmlEnumValue("085")
    Geschaeftsfuehrende_Gesellschafter("085"),

    /**
     * <b>Beamter (Beamtin) / Beamter (Beamtin)</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("086")
    @XmlEnumValue("086")
    Geschaeftsfuehrer("086"),

    /**
     * <b>Beamter (Beamtin) / Beamter (Beamtin)</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("087")
    @XmlEnumValue("087")
    Gesetzliche_Erbe_Erbin("087"),

    /**
     * <b>Beamter (Beamtin) / Beamter (Beamtin)</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("088")
    @XmlEnumValue("088")
    Gesetzliche_Vertreter("088"),

    /**
     * <b>Beh&#246;rde / Beh&#246;rde</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("089")
    @XmlEnumValue("089")
    Glaeubiger("089"),

    /**
     * <b>Beh&#246;rde / Beh&#246;rde</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("090")
    @XmlEnumValue("090")
    Grosseltern("090"),

    /**
     * <b>Beh&#246;rde / Beh&#246;rde</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("092")
    @XmlEnumValue("092")
    Grossvater_Grossmutter("092"),

    /**
     * <b>Beigeladene(r) / Beigeladene(r)</b>
     *  * <p>
     *  *  Code: 025
     *  * <p>
     *  * 
     */
    @JsonProperty("093")
    @XmlEnumValue("093")
    Hauptbevollmaechtigte("093"),

    /**
     * <b>Beigeladene(r) / Beigeladene(r)</b>
     *  * <p>
     *  *  Code: 025
     *  * <p>
     *  * 
     */
    @JsonProperty("094")
    @XmlEnumValue("094")
    Hoferbe_Hoferbin("094"),

    /**
     * <b>Beigeladene(r) / Beigeladene(r)</b>
     *  * <p>
     *  *  Code: 025
     *  * <p>
     *  * 
     */
    @JsonProperty("095")
    @XmlEnumValue("095")
    Inhaber_der_Firma("095"),

    /**
     * <b>Beistand / Beistand</b>
     *  * <p>
     *  *  Code: 026
     *  * <p>
     *  * 
     */
    @JsonProperty("096")
    @XmlEnumValue("096")
    Insolvenzverwalter("096"),

    /**
     * <b>Beistand / Beistand</b>
     *  * <p>
     *  *  Code: 026
     *  * <p>
     *  * 
     */
    @JsonProperty("097")
    @XmlEnumValue("097")
    Jugendamt("097"),

    /**
     * <b>Beistand / Beistand</b>
     *  * <p>
     *  *  Code: 026
     *  * <p>
     *  * 
     */
    @JsonProperty("098")
    @XmlEnumValue("098")
    Kammer("098"),

    /**
     * <b>Bekannte(r) / Bekannte(r)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("099")
    @XmlEnumValue("099")
    Kammermitglied("099"),

    /**
     * <b>Bekannte(r) / Bekannte(r)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("100")
    @XmlEnumValue("100")
    Kind("100"),

    /**
     * <b>Bekannte(r) / Bekannte(r)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("101")
    @XmlEnumValue("101")
    Klaeger("101"),

    /**
     * <b>Bekannte(r) / Bekannte(r)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("102")
    @XmlEnumValue("102")
    Kontrollbetreuer("102"),

    /**
     * <b>Beklagte(r) / Beklagte(r)</b>
     *  * <p>
     *  *  Code: 028
     *  * <p>
     *  * 
     */
    @JsonProperty("103")
    @XmlEnumValue("103")
    Korrespondenzanwalt("103"),

    /**
     * <b>Beklagte(r) / Beklagte(r)</b>
     *  * <p>
     *  *  Code: 028
     *  * <p>
     *  * 
     */
    @JsonProperty("104")
    @XmlEnumValue("104")
    Kostenschuldner("104"),

    /**
     * <b>Beklagte(r) / Beklagte(r)</b>
     *  * <p>
     *  *  Code: 028
     *  * <p>
     *  * 
     */
    @JsonProperty("105")
    @XmlEnumValue("105")
    Landwirtschaftsrichter("105"),

    /**
     * <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("106")
    @XmlEnumValue("106")
    Lebenspartner("106"),

    /**
     * <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("107")
    @XmlEnumValue("107")
    Liquidator("107"),

    /**
     * <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("108")
    @XmlEnumValue("108")
    Minderjaehrige("108"),

    /**
     * <b>Berufungsbeklagte(r) / Berufungsbeklagte(r)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("109")
    @XmlEnumValue("109")
    Mitvormund("109"),

    /**
     * <b>Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 030
     *  * <p>
     *  * 
     */
    @JsonProperty("110")
    @XmlEnumValue("110")
    Muendel("110"),

    /**
     * <b>Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 030
     *  * <p>
     *  * 
     */
    @JsonProperty("112")
    @XmlEnumValue("112")
    Nachbesserungsglaeubiger("112"),

    /**
     * <b>Berufungskl&#228;ger(in) / Berufungskl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 030
     *  * <p>
     *  * 
     */
    @JsonProperty("113")
    @XmlEnumValue("113")
    Nachlasspfleger("113"),

    /**
     * <b>Beschuldigte(r) / Accused (Prelim.)</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("114")
    @XmlEnumValue("114")
    Nachlassverwalter("114"),

    /**
     * <b>Beschuldigte(r) / Accused (Prelim.)</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("115")
    @XmlEnumValue("115")
    Nebenklaeger("115"),

    /**
     * <b>Beschuldigte(r) / Accused (Prelim.)</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("116")
    @XmlEnumValue("116")
    Neffe_Nichte("116"),

    /**
     * <b>Beschuldigte(r) / Accused (Prelim.)</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("117")
    @XmlEnumValue("117")
    Nicht_verwandt("117"),

    /**
     * <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 032
     *  * <p>
     *  * 
     */
    @JsonProperty("118")
    @XmlEnumValue("118")
    Onkel_Tante("118"),

    /**
     * <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 032
     *  * <p>
     *  * 
     */
    @JsonProperty("119")
    @XmlEnumValue("119")
    Opfer("119"),

    /**
     * <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 032
     *  * <p>
     *  * 
     */
    @JsonProperty("120")
    @XmlEnumValue("120")
    Paechter("120"),

    /**
     * <b>Beschwerdef&#252;hrer(in) / Beschwerdef&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 032
     *  * <p>
     *  * 
     */
    @JsonProperty("121")
    @XmlEnumValue("121")
    Pflegeeltern("121"),

    /**
     * <b>Beschwerdegegner(in) / Beschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 033
     *  * <p>
     *  * 
     */
    @JsonProperty("123")
    @XmlEnumValue("123")
    Pfleger("123"),

    /**
     * <b>Beschwerdegegner(in) / Beschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 033
     *  * <p>
     *  * 
     */
    @JsonProperty("124")
    @XmlEnumValue("124")
    Pfleger_fuer_das_Sammelvermoegen("124"),

    /**
     * <b>Beschwerdegegner(in) / Beschwerdegegner(in)</b>
     *  * <p>
     *  *  Code: 033
     *  * <p>
     *  * 
     */
    @JsonProperty("125")
    @XmlEnumValue("125")
    Pfleger_fuer_die_Leibesfrucht("125"),

    /**
     * <b>Besucher(in) / Besucher(in)</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("126")
    @XmlEnumValue("126")
    Pflegevater_Pflegemutter_des_Muendels("126"),

    /**
     * <b>Besucher(in) / Besucher(in)</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("127")
    @XmlEnumValue("127")
    Pflegling("127"),

    /**
     * <b>Besucher(in) / Besucher(in)</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("128")
    @XmlEnumValue("128")
    Pflichtverteidiger("128"),

    /**
     * <b>Besucher(in) / Besucher(in)</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("129")
    @XmlEnumValue("129")
    Polizei("129"),

    /**
     * <b>Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)</b>
     *  * <p>
     *  *  Code: 036
     *  * <p>
     *  * 
     */
    @JsonProperty("130")
    @XmlEnumValue("130")
    Privatbeklagte("130"),

    /**
     * <b>Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)</b>
     *  * <p>
     *  *  Code: 036
     *  * <p>
     *  * 
     */
    @JsonProperty("131")
    @XmlEnumValue("131")
    Privatklaeger("131"),

    /**
     * <b>Betreibende(r) Gl&#228;ubige(r) / Betreibende(r) Gl&#228;ubige(r)</b>
     *  * <p>
     *  *  Code: 036
     *  * <p>
     *  * 
     */
    @JsonProperty("132")
    @XmlEnumValue("132")
    Prozessbevollmaechtigte("132"),

    /**
     * <b>Betreuer(in) / Guardian</b>
     *  * <p>
     *  *  Code: 037
     *  * <p>
     *  * 
     */
    @JsonProperty("133")
    @XmlEnumValue("133")
    Prozesskostenhilfe_Anwalt_Anwaeltin("133"),

    /**
     * <b>Betreuer(in) / Guardian</b>
     *  * <p>
     *  *  Code: 037
     *  * <p>
     *  * 
     */
    @JsonProperty("134")
    @XmlEnumValue("134")
    Prozesskostenhilfe_Korrespondenzanwalt("134"),

    /**
     * <b>Betreute(r) / Ward</b>
     *  * <p>
     *  *  Code: 038
     *  * <p>
     *  * 
     */
    @JsonProperty("135")
    @XmlEnumValue("135")
    Rechtsanwalt("135"),

    /**
     * <b>Betreute(r) / Ward</b>
     *  * <p>
     *  *  Code: 038
     *  * <p>
     *  * 
     */
    @JsonProperty("136")
    @XmlEnumValue("136")
    Rechtsbeistand("136"),

    /**
     * <b>Betreute(r) / Ward</b>
     *  * <p>
     *  *  Code: 038
     *  * <p>
     *  * 
     */
    @JsonProperty("137")
    @XmlEnumValue("137")
    Rechtsbeschwerdefuehrer("137"),

    /**
     * <b>Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 039
     *  * <p>
     *  * 
     */
    @JsonProperty("138")
    @XmlEnumValue("138")
    Rechtsbeschwerdegegner("138"),

    /**
     * <b>Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 039
     *  * <p>
     *  * 
     */
    @JsonProperty("139")
    @XmlEnumValue("139")
    Revisionsbeklagte("139"),

    /**
     * <b>Betreuungsbeh&#246;rde / Betreuungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 039
     *  * <p>
     *  * 
     */
    @JsonProperty("140")
    @XmlEnumValue("140")
    Revisionsklaeger("140"),

    /**
     * <b>Betroffene(r) / Betroffene(r)</b>
     *  * <p>
     *  *  Code: 040
     *  * <p>
     *  * 
     */
    @JsonProperty("141")
    @XmlEnumValue("141")
    Sachbearbeiter("141"),

    /**
     * <b>Betroffene(r) / Betroffene(r)</b>
     *  * <p>
     *  *  Code: 040
     *  * <p>
     *  * 
     */
    @JsonProperty("142")
    @XmlEnumValue("142")
    Sachverstaendige("142"),

    /**
     * <b>Betroffene(r) / Betroffene(r)</b>
     *  * <p>
     *  *  Code: 040
     *  * <p>
     *  * 
     */
    @JsonProperty("143")
    @XmlEnumValue("143")
    Schuldner("143"),

    /**
     * <b>Betroffene(r) / Betroffene(r)</b>
     *  * <p>
     *  *  Code: 040
     *  * <p>
     *  * 
     */
    @JsonProperty("144")
    @XmlEnumValue("144")
    Schwager_Schwaegerin("144"),

    /**
     * <b>Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 041
     *  * <p>
     *  * 
     */
    @JsonProperty("146")
    @XmlEnumValue("146")
    Schwiegersohn_Schwiegertochter("146"),

    /**
     * <b>Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 041
     *  * <p>
     *  * 
     */
    @JsonProperty("148")
    @XmlEnumValue("148")
    Schwiegervater_Schwiegermutter("148"),

    /**
     * <b>Bevollm&#228;chtigte(r) / Bevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 041
     *  * <p>
     *  * 
     */
    @JsonProperty("149")
    @XmlEnumValue("149")
    Sohn_Tochter("149"),

    /**
     * <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("150")
    @XmlEnumValue("150")
    Soldat("150"),

    /**
     * <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("151")
    @XmlEnumValue("151")
    Sonstige_Beteiligte("151"),

    /**
     * <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("152")
    @XmlEnumValue("152")
    Sonstige_Vertreter("152"),

    /**
     * <b>Bew&#228;hrungshelfer(in) / Bew&#228;hrungshelfer(in)</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("153")
    @XmlEnumValue("153")
    Staatsanwaltschaft("153"),

    /**
     * <b>Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 043
     *  * <p>
     *  * 
     */
    @JsonProperty("154")
    @XmlEnumValue("154")
    Stiefeltern("154"),

    /**
     * <b>Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 043
     *  * <p>
     *  * 
     */
    @JsonProperty("156")
    @XmlEnumValue("156")
    Stiefvater_Stiefmutter("156"),

    /**
     * <b>Beweisanwalt (-anw&#228;ltin) / Beweisanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 043
     *  * <p>
     *  * 
     */
    @JsonProperty("161")
    @XmlEnumValue("161")
    Terminsbevollmaechtigte("161"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("162")
    @XmlEnumValue("162")
    Testamentsvollstrecker("162"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("163")
    @XmlEnumValue("163")
    Testator("163"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("164")
    @XmlEnumValue("164")
    Uebernehmer("164"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("165")
    @XmlEnumValue("165")
    Unterbevollmaechtigte("165"),

    /**
     * <b>Bruder (Schwester) / Bruder (Schwester)</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("166")
    @XmlEnumValue("166")
    Ur_Enkel("166"),

    /**
     * <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("167")
    @XmlEnumValue("167")
    Vater_Mutter("167"),

    /**
     * <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("168")
    @XmlEnumValue("168")
    Veraeusserer_Veraeusserin("168"),

    /**
     * <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("169")
    @XmlEnumValue("169")
    Verfahrensbevollmaechtigte("169"),

    /**
     * <b>Bundeswehrdisziplinaranwalt (-anw&#228;ltin) / Bundeswehrdisziplinaranwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("170")
    @XmlEnumValue("170")
    Verfahrenskostenhilfe_Anwalt_Anwaeltin("170"),

    /**
     * <b>Bu&#223;geldempf&#228;nger(in) / Bu&#223;geldempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 046
     *  * <p>
     *  * 
     */
    @JsonProperty("171")
    @XmlEnumValue("171")
    Verfahrenskostenhilfe_Korrespondenzanwalt("171"),

    /**
     * <b>Bu&#223;geldempf&#228;nger(in) / Bu&#223;geldempf&#228;nger(in)</b>
     *  * <p>
     *  *  Code: 046
     *  * <p>
     *  * 
     */
    @JsonProperty("172")
    @XmlEnumValue("172")
    Verfahrenspfleger("172"),

    /**
     * <b>Cousin(e) / Cousin(e)</b>
     *  * <p>
     *  *  Code: 047
     *  * <p>
     *  * 
     */
    @JsonProperty("173")
    @XmlEnumValue("173")
    Verfahrensvertreter_787_ZPO("173"),

    /**
     * <b>Cousin(e) / Cousin(e)</b>
     *  * <p>
     *  *  Code: 047
     *  * <p>
     *  * 
     */
    @JsonProperty("174")
    @XmlEnumValue("174")
    Verfuegungsbeklagte("174"),

    /**
     * <b>Cousin(e) / Cousin(e)</b>
     *  * <p>
     *  *  Code: 047
     *  * <p>
     *  * 
     */
    @JsonProperty("175")
    @XmlEnumValue("175")
    Verfuegungsklaeger("175"),

    /**
     * <b>Dienstvorgesetzte(r) / Dienstvorgesetzte(r)</b>
     *  * <p>
     *  *  Code: 048
     *  * <p>
     *  * 
     */
    @JsonProperty("176")
    @XmlEnumValue("176")
    Verkehrsanwalt("176"),

    /**
     * <b>Dienstvorgesetzte(r) / Dienstvorgesetzte(r)</b>
     *  * <p>
     *  *  Code: 048
     *  * <p>
     *  * 
     */
    @JsonProperty("177")
    @XmlEnumValue("177")
    Verlobte("177"),

    /**
     * <b>Dienstvorgesetzte(r) / Dienstvorgesetzte(r)</b>
     *  * <p>
     *  *  Code: 048
     *  * <p>
     *  * 
     */
    @JsonProperty("178")
    @XmlEnumValue("178")
    Vermaechtnisnehmer("178"),

    /**
     * <b>director / director</b>
     *  * <p>
     *  *  Code: 049
     *  * <p>
     *  * 
     */
    @JsonProperty("179")
    @XmlEnumValue("179")
    Vermieter("179"),

    /**
     * <b>director / director</b>
     *  * <p>
     *  *  Code: 049
     *  * <p>
     *  * 
     */
    @JsonProperty("180")
    @XmlEnumValue("180")
    Verpaechter("180"),

    /**
     * <b>director / director</b>
     *  * <p>
     *  *  Code: 049
     *  * <p>
     *  * 
     */
    @JsonProperty("181")
    @XmlEnumValue("181")
    Versorgungstraeger("181"),

    /**
     * <b>Dolmetscher(in) / Interpreter</b>
     *  * <p>
     *  *  Code: 050
     *  * <p>
     *  * 
     */
    @JsonProperty("182")
    @XmlEnumValue("182")
    Verteidiger("182"),

    /**
     * <b>Dolmetscher(in) / Interpreter</b>
     *  * <p>
     *  *  Code: 050
     *  * <p>
     *  * 
     */
    @JsonProperty("183")
    @XmlEnumValue("183")
    Vertreter_der_Interessen_des_Ausgleichsfonds("183"),

    /**
     * <b>Dolmetscher(in) / Interpreter</b>
     *  * <p>
     *  *  Code: 050
     *  * <p>
     *  * 
     */
    @JsonProperty("184")
    @XmlEnumValue("184")
    Vertreter_der_Staatskasse("184"),

    /**
     * <b>Dritte(r) / Dritte(r)</b>
     *  * <p>
     *  *  Code: 051
     *  * <p>
     *  * 
     */
    @JsonProperty("185")
    @XmlEnumValue("185")
    Vertreter_des_Bundesinteresses_beim_Bundesverwaltungsgericht("185"),

    /**
     * <b>Dritte(r) / Dritte(r)</b>
     *  * <p>
     *  *  Code: 051
     *  * <p>
     *  * 
     */
    @JsonProperty("186")
    @XmlEnumValue("186")
    Vertreter_des_oeffentlichen_Interesses("186"),

    /**
     * <b>Drittschuldner(in) / Drittschuldner(in)</b>
     *  * <p>
     *  *  Code: 052
     *  * <p>
     *  * 
     */
    @JsonProperty("187")
    @XmlEnumValue("187")
    Verurteilte("187"),

    /**
     * <b>Drittschuldner(in) / Drittschuldner(in)</b>
     *  * <p>
     *  *  Code: 052
     *  * <p>
     *  * 
     */
    @JsonProperty("188")
    @XmlEnumValue("188")
    Verwalter_der_Wohnungseigentuemergemeinschaft("188"),

    /**
     * <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("189")
    @XmlEnumValue("189")
    Verwaltungsbehoerde("189"),

    /**
     * <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("190")
    @XmlEnumValue("190")
    Vollstreckungsglaeubiger("190"),

    /**
     * <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("191")
    @XmlEnumValue("191")
    Vollstreckungsschuldner("191"),

    /**
     * <b>Drittwiderbeklagte(r) / Drittwiderbeklagte(r)</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("192")
    @XmlEnumValue("192")
    Vorlaeufige_Betreuer("192"),

    /**
     * <b>Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 054
     *  * <p>
     *  * 
     */
    @JsonProperty("193")
    @XmlEnumValue("193")
    Vormund("193"),

    /**
     * <b>Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 054
     *  * <p>
     *  * 
     */
    @JsonProperty("194")
    @XmlEnumValue("194")
    Vorstand("194"),

    /**
     * <b>Drittwiderkl&#228;ger(in) / Drittwiderkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 054
     *  * <p>
     *  * 
     */
    @JsonProperty("195")
    @XmlEnumValue("195")
    Vorsorgebevollmaechtigte("195"),

    /**
     * <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b>
     *  * <p>
     *  *  Code: 056
     *  * <p>
     *  * 
     */
    @JsonProperty("196")
    @XmlEnumValue("196")
    Wahlverteidiger("196"),

    /**
     * <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b>
     *  * <p>
     *  *  Code: 056
     *  * <p>
     *  * 
     */
    @JsonProperty("197")
    @XmlEnumValue("197")
    Widerbeklagte("197"),

    /**
     * <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b>
     *  * <p>
     *  *  Code: 056
     *  * <p>
     *  * 
     */
    @JsonProperty("198")
    @XmlEnumValue("198")
    Widerklaeger("198"),

    /**
     * <b>Ehemann (Ehefrau) / Ehemann (Ehefrau)</b>
     *  * <p>
     *  *  Code: 056
     *  * <p>
     *  * 
     */
    @JsonProperty("199")
    @XmlEnumValue("199")
    Wiederaufnahmebeklagte("199"),

    /**
     * <b>Eigent&#252;mer(in) / Eigent&#252;mer(in)</b>
     *  * <p>
     *  *  Code: 057
     *  * <p>
     *  * 
     */
    @JsonProperty("200")
    @XmlEnumValue("200")
    Wiederaufnahmeklaeger("200"),

    /**
     * <b>Eigent&#252;mer(in) / Eigent&#252;mer(in)</b>
     *  * <p>
     *  *  Code: 057
     *  * <p>
     *  * 
     */
    @JsonProperty("201")
    @XmlEnumValue("201")
    Zahlungs_und_Auflagenempfaenger("201"),

    /**
     * <b>Eigent&#252;mer(in) / Eigent&#252;mer(in)</b>
     *  * <p>
     *  *  Code: 057
     *  * <p>
     *  * 
     */
    @JsonProperty("202")
    @XmlEnumValue("202")
    Zeuge_Zeugin("202"),

    /**
     * <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 058
     *  * <p>
     *  * 
     */
    @JsonProperty("203")
    @XmlEnumValue("203")
    Zeugenbeistand("203"),

    /**
     * <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 058
     *  * <p>
     *  * 
     */
    @JsonProperty("204")
    @XmlEnumValue("204")
    Zulassungsantragsgegner("204"),

    /**
     * <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 058
     *  * <p>
     *  * 
     */
    @JsonProperty("205")
    @XmlEnumValue("205")
    Zulassungsantragsteller("205"),

    /**
     * <b>Eingetragene(r) Lebenspartner(in) / Eingetragene(r) Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 058
     *  * <p>
     *  * 
     */
    @JsonProperty("206")
    @XmlEnumValue("206")
    Zustellungsbevollmaechtigte("206"),

    /**
     * <b>Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 059
     *  * <p>
     *  * 
     */
    @JsonProperty("207")
    @XmlEnumValue("207")
    Zustellungsvertreter_6_ZVG("207"),

    /**
     * <b>Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 059
     *  * <p>
     *  * 
     */
    @JsonProperty("208")
    @XmlEnumValue("208")
    Notar("208"),

    /**
     * <b>Einleitungsbeh&#246;rde / Einleitungsbeh&#246;rde</b>
     *  * <p>
     *  *  Code: 059
     *  * <p>
     *  * 
     */
    @JsonProperty("209")
    @XmlEnumValue("209")
    Auskunftsempfaenger("209"),

    /**
     * <b>Eltern / Eltern</b>
     *  * <p>
     *  *  Code: 060
     *  * <p>
     *  * 
     */
    @JsonProperty("210")
    @XmlEnumValue("210")
    Melder("210"),

    /**
     * <b>Eltern / Eltern</b>
     *  * <p>
     *  *  Code: 060
     *  * <p>
     *  * 
     */
    @JsonProperty("211")
    @XmlEnumValue("211")
    Verwahrstelle("211"),

    /**
     * <b>Eltern / Eltern</b>
     *  * <p>
     *  *  Code: 060
     *  * <p>
     *  * 
     */
    @JsonProperty("212")
    @XmlEnumValue("212")
    Aussteller("212"),

    /**
     * <b>Elternteil / Elternteil</b>
     *  * <p>
     *  *  Code: 061
     *  * <p>
     *  * 
     */
    @JsonProperty("213")
    @XmlEnumValue("213")
    Berechtigte("213"),

    /**
     * <b>Elternteil / Elternteil</b>
     *  * <p>
     *  *  Code: 061
     *  * <p>
     *  * 
     */
    @JsonProperty("214")
    @XmlEnumValue("214")
    Berechtigte_an_einem_Recht("214"),

    /**
     * <b>Elternteil / Elternteil</b>
     *  * <p>
     *  *  Code: 061
     *  * <p>
     *  * 
     */
    @JsonProperty("215")
    @XmlEnumValue("215")
    Einreicher("215"),

    /**
     * <b>Enkel(in) / Enkel(in)</b>
     *  * <p>
     *  *  Code: 062
     *  * <p>
     *  * 
     */
    @JsonProperty("216")
    @XmlEnumValue("216")
    Erbbauberechtigte("216"),

    /**
     * <b>Enkel(in) / Enkel(in)</b>
     *  * <p>
     *  *  Code: 062
     *  * <p>
     *  * 
     */
    @JsonProperty("217")
    @XmlEnumValue("217")
    Finanzamt("217"),

    /**
     * <b>Enkel(in) / Enkel(in)</b>
     *  * <p>
     *  *  Code: 062
     *  * <p>
     *  * 
     */
    @JsonProperty("218")
    @XmlEnumValue("218")
    Grundbuchvertreter("218"),

    /**
     * <b>Erbe (Erbin) / Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 063
     *  * <p>
     *  * 
     */
    @JsonProperty("219")
    @XmlEnumValue("219")
    Insolvenzgericht("219"),

    /**
     * <b>Erbe (Erbin) / Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 063
     *  * <p>
     *  * 
     */
    @JsonProperty("220")
    @XmlEnumValue("220")
    Mitteilungsempfaenger("220"),

    /**
     * <b>Erbe (Erbin) / Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 063
     *  * <p>
     *  * 
     */
    @JsonProperty("221")
    @XmlEnumValue("221")
    Nacherbe_Nacherbin("221"),

    /**
     * <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b>
     *  * <p>
     *  *  Code: 064
     *  * <p>
     *  * 
     */
    @JsonProperty("222")
    @XmlEnumValue("222")
    Rechnungsempfaenger("222"),

    /**
     * <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b>
     *  * <p>
     *  *  Code: 064
     *  * <p>
     *  * 
     */
    @JsonProperty("223")
    @XmlEnumValue("223")
    Veranlasser("223"),

    /**
     * <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b>
     *  * <p>
     *  *  Code: 064
     *  * <p>
     *  * 
     */
    @JsonProperty("224")
    @XmlEnumValue("224")
    Versteigerungsabteilung("224"),

    /**
     * <b>Erbe (Erbin) (ausschlagend) / Erbe (Erbin) (ausschlagend)</b>
     *  * <p>
     *  *  Code: 064
     *  * <p>
     *  * 
     */
    @JsonProperty("225")
    @XmlEnumValue("225")
    Vertretungsberechtigte("225"),

    /**
     * <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("226")
    @XmlEnumValue("226")
    Zweitschuldner("226"),

    /**
     * <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("227")
    @XmlEnumValue("227")
    Vertreter("227"),

    /**
     * <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("228")
    @XmlEnumValue("228")
    Arbeitgeber("228"),

    /**
     * <b>Erbe (Erbin) (vorverstorben) / Erbe (Erbin) (vorverstorben)</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("229")
    @XmlEnumValue("229")
    RV_Traeger("229"),

    /**
     * <b>Erblasser(in) / Erblasser(in)</b>
     *  * <p>
     *  *  Code: 066
     *  * <p>
     *  * 
     */
    @JsonProperty("230")
    @XmlEnumValue("230")
    Vollstreckungsstelle("230"),

    /**
     * <b>Erblasser(in) / Erblasser(in)</b>
     *  * <p>
     *  *  Code: 066
     *  * <p>
     *  * 
     */
    @JsonProperty("231")
    @XmlEnumValue("231")
    Abkoemmling("231"),

    /**
     * <b>Erblasser(in) / Erblasser(in)</b>
     *  * <p>
     *  *  Code: 066
     *  * <p>
     *  * 
     */
    @JsonProperty("232")
    @XmlEnumValue("232")
    Kreditnehmer("232"),

    /**
     * <b>Erblasser(in) / Erblasser(in)</b>
     *  * <p>
     *  *  Code: 066
     *  * <p>
     *  * 
     */
    @JsonProperty("233")
    @XmlEnumValue("233")
    Neu_vorzutragende_Eigentuemer("233"),

    /**
     * <b>Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)</b>
     *  * <p>
     *  *  Code: 067
     *  * <p>
     *  * 
     */
    @JsonProperty("234")
    @XmlEnumValue("234")
    Notariatsverwalter("234"),

    /**
     * <b>Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)</b>
     *  * <p>
     *  *  Code: 067
     *  * <p>
     *  * 
     */
    @JsonProperty("235")
    @XmlEnumValue("235")
    Notarvertreter("235"),

    /**
     * <b>Erg&#228;nzungspfleger(in) / Erg&#228;nzungspfleger(in)</b>
     *  * <p>
     *  *  Code: 067
     *  * <p>
     *  * 
     */
    @JsonProperty("236")
    @XmlEnumValue("236")
    Partei_kraft_Amtes("236"),

    /**
     * <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 068
     *  * <p>
     *  * 
     */
    @JsonProperty("237")
    @XmlEnumValue("237")
    Sequester("237"),

    /**
     * <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 068
     *  * <p>
     *  * 
     */
    @JsonProperty("238")
    @XmlEnumValue("238")
    Treuhaender("238"),

    /**
     * <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 068
     *  * <p>
     *  * 
     */
    @JsonProperty("239")
    @XmlEnumValue("239")
    Zustimmende("239"),

    /**
     * <b>Erinnerungsf&#252;hrer(in) / Erinnerungsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 068
     *  * <p>
     *  * 
     */
    @JsonProperty("240")
    @XmlEnumValue("240")
    Glaeubigervertreter("240"),

    /**
     * <b>Erinnerungsgegner(in) / Erinnerungsgegner(in)</b>
     *  * <p>
     *  *  Code: 069
     *  * <p>
     *  * 
     */
    @JsonProperty("241")
    @XmlEnumValue("241")
    Schuldnervertreter("241"),

    /**
     * <b>Erinnerungsgegner(in) / Erinnerungsgegner(in)</b>
     *  * <p>
     *  *  Code: 069
     *  * <p>
     *  * 
     */
    @JsonProperty("242")
    @XmlEnumValue("242")
    Zahlungsempfaenger("242"),

    /**
     * <b>Erinnerungsgegner(in) / Erinnerungsgegner(in)</b>
     *  * <p>
     *  *  Code: 069
     *  * <p>
     *  * 
     */
    @JsonProperty("243")
    @XmlEnumValue("243")
    Anteilsinhaber("243"),

    /**
     * <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b>
     *  * <p>
     *  *  Code: 070
     *  * <p>
     *  * 
     */
    @JsonProperty("244")
    @XmlEnumValue("244")
    Antragsteller_Eroeffnung("244"),

    /**
     * <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b>
     *  * <p>
     *  *  Code: 070
     *  * <p>
     *  * 
     */
    @JsonProperty("245")
    @XmlEnumValue("245")
    Debitor("245"),

    /**
     * <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b>
     *  * <p>
     *  *  Code: 070
     *  * <p>
     *  * 
     */
    @JsonProperty("246")
    @XmlEnumValue("246")
    Gesellschafter("246"),

    /**
     * <b>Ersatzbetreuer(in) / Ersatzbetreuer(in)</b>
     *  * <p>
     *  *  Code: 070
     *  * <p>
     *  * 
     */
    @JsonProperty("247")
    @XmlEnumValue("247")
    Handlungsbevollmaechtigte("247"),

    /**
     * <b>Ersteher(in) / Ersteher(in)</b>
     *  * <p>
     *  *  Code: 071
     *  * <p>
     *  * 
     */
    @JsonProperty("248")
    @XmlEnumValue("248")
    Mitglied_einer_Gesamt_Anteilsinhaberschaft("248"),

    /**
     * <b>Ersteher(in) / Ersteher(in)</b>
     *  * <p>
     *  *  Code: 071
     *  * <p>
     *  * 
     */
    @JsonProperty("249")
    @XmlEnumValue("249")
    Mitglied_einer_Glaeubigergemeinschaft("249"),

    /**
     * <b>Erwerber(in) / Erwerber(in)</b>
     *  * <p>
     *  *  Code: 072
     *  * <p>
     *  * 
     */
    @JsonProperty("250")
    @XmlEnumValue("250")
    Mitreeder("250"),

    /**
     * <b>Erwerber(in) / Erwerber(in)</b>
     *  * <p>
     *  *  Code: 072
     *  * <p>
     *  * 
     */
    @JsonProperty("251")
    @XmlEnumValue("251")
    Partner("251"),

    /**
     * <b>Erwerber(in) / Erwerber(in)</b>
     *  * <p>
     *  *  Code: 072
     *  * <p>
     *  * 
     */
    @JsonProperty("252")
    @XmlEnumValue("252")
    Persoenlich_haftende_Gesellschafter("252"),

    /**
     * <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("253")
    @XmlEnumValue("253")
    Prozesspfleger("253"),

    /**
     * <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("254")
    @XmlEnumValue("254")
    Sachwalter("254"),

    /**
     * <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("255")
    @XmlEnumValue("255")
    Treuhaender_Wohlverhaltensperiode("255"),

    /**
     * <b>Erziehungsberechtigte(r) / Erziehungsberechtigte(r)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("256")
    @XmlEnumValue("256")
    Vermoegenstraeger("256"),

    /**
     * <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b>
     *  * <p>
     *  *  Code: 074
     *  * <p>
     *  * 
     */
    @JsonProperty("257")
    @XmlEnumValue("257")
    Vorlaeufige_Insolvenzverwalter("257"),

    /**
     * <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b>
     *  * <p>
     *  *  Code: 074
     *  * <p>
     *  * 
     */
    @JsonProperty("258")
    @XmlEnumValue("258")
    Vorlaeufige_Treuhaender("258"),

    /**
     * <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b>
     *  * <p>
     *  *  Code: 074
     *  * <p>
     *  * 
     */
    @JsonProperty("259")
    @XmlEnumValue("259")
    Sondersachwalter("259"),

    /**
     * <b>Fr&#252;here(r) Ehegatte (Ehegattin) / Fr&#252;here(r) Ehegatte (Ehegattin)</b>
     *  * <p>
     *  *  Code: 074
     *  * <p>
     *  * 
     */
    @JsonProperty("260")
    @XmlEnumValue("260")
    Sonderinsolvenzverwalter("260"),

    /**
     * <b>Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)</b>
     *  * <p>
     *  *  Code: 075
     *  * <p>
     *  * 
     */
    @JsonProperty("261")
    @XmlEnumValue("261")
    Vorlaeufige_Sachwalter("261"),

    /**
     * <b>Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)</b>
     *  * <p>
     *  *  Code: 075
     *  * <p>
     *  * 
     */
    @JsonProperty("262")
    @XmlEnumValue("262")
    Abwickler("262"),

    /**
     * <b>Fr&#252;here(r) Beklagte(r) / Fr&#252;here(r) Beklagte(r)</b>
     *  * <p>
     *  *  Code: 075
     *  * <p>
     *  * 
     */
    @JsonProperty("263")
    @XmlEnumValue("263")
    Uebernehmender_Rechtstraeger("263"),

    /**
     * <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("264")
    @XmlEnumValue("264")
    Aufsichtsrat_raetin("264"),

    /**
     * <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("265")
    @XmlEnumValue("265")
    Besondere_Vertreter_nach_30_BGB("265"),

    /**
     * <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("266")
    @XmlEnumValue("266")
    Betriebsleiter("266"),

    /**
     * <b>Fr&#252;here(r) Beteiligte(r) / Fr&#252;here(r) Beteiligte(r)</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("267")
    @XmlEnumValue("267")
    Empfangsberechtigte("267"),

    /**
     * <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 077
     *  * <p>
     *  * 
     */
    @JsonProperty("268")
    @XmlEnumValue("268")
    Geschaeftsfuehrende_Direktor("268"),

    /**
     * <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 077
     *  * <p>
     *  * 
     */
    @JsonProperty("269")
    @XmlEnumValue("269")
    Geschaeftsleiter("269"),

    /**
     * <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 077
     *  * <p>
     *  * 
     */
    @JsonProperty("271")
    @XmlEnumValue("271")
    Gruender("271"),

    /**
     * <b>Fr&#252;here(r) Gl&#228;ubiger(in) / Fr&#252;here(r) Gl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 077
     *  * <p>
     *  * 
     */
    @JsonProperty("272")
    @XmlEnumValue("272")
    Gruendungspruefer("272"),

    /**
     * <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 078
     *  * <p>
     *  * 
     */
    @JsonProperty("273")
    @XmlEnumValue("273")
    Hauptniederlassung("273"),

    /**
     * <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 078
     *  * <p>
     *  * 
     */
    @JsonProperty("274")
    @XmlEnumValue("274")
    Inhaber("274"),

    /**
     * <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 078
     *  * <p>
     *  * 
     */
    @JsonProperty("275")
    @XmlEnumValue("275")
    Kommanditist("275"),

    /**
     * <b>Fr&#252;here(r) Kl&#228;ger(in) / Fr&#252;here(r) Kl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 078
     *  * <p>
     *  * 
     */
    @JsonProperty("276")
    @XmlEnumValue("276")
    Konkursverwalter("276"),

    /**
     * <b>Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)</b>
     *  * <p>
     *  *  Code: 079
     *  * <p>
     *  * 
     */
    @JsonProperty("277")
    @XmlEnumValue("277")
    Mitglied_des_Leitungsorgans("277"),

    /**
     * <b>Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)</b>
     *  * <p>
     *  *  Code: 079
     *  * <p>
     *  * 
     */
    @JsonProperty("278")
    @XmlEnumValue("278")
    Mitglied_EWIV("278"),

    /**
     * <b>Fr&#252;here(r) Soldat(in) / Fr&#252;here(r) Soldat(in)</b>
     *  * <p>
     *  *  Code: 079
     *  * <p>
     *  * 
     */
    @JsonProperty("279")
    @XmlEnumValue("279")
    Nachgruendungspruefer("279"),

    /**
     * <b>Gegenvormund / Gegenvormund</b>
     *  * <p>
     *  *  Code: 080
     *  * <p>
     *  * 
     */
    @JsonProperty("280")
    @XmlEnumValue("280")
    Nachtragsabwickler("280"),

    /**
     * <b>Gegenvormund / Gegenvormund</b>
     *  * <p>
     *  *  Code: 080
     *  * <p>
     *  * 
     */
    @JsonProperty("281")
    @XmlEnumValue("281")
    Nachtragsliquidator("281"),

    /**
     * <b>Gegenvormund / Gegenvormund</b>
     *  * <p>
     *  *  Code: 080
     *  * <p>
     *  * 
     */
    @JsonProperty("282")
    @XmlEnumValue("282")
    Notgeschaeftsfuehrer("282"),

    /**
     * <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("283")
    @XmlEnumValue("283")
    Notliquidator("283"),

    /**
     * <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("284")
    @XmlEnumValue("284")
    Notvorstand("284"),

    /**
     * <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("285")
    @XmlEnumValue("285")
    Prokurist("285"),

    /**
     * <b>Generalbundesanwalt (-anw&#228;ltin) / Generalbundesanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("287")
    @XmlEnumValue("287")
    Rechtstraeger("287"),

    /**
     * <b>Gericht / Gericht</b>
     *  * <p>
     *  *  Code: 082
     *  * <p>
     *  * 
     */
    @JsonProperty("288")
    @XmlEnumValue("288")
    Registergericht("288"),

    /**
     * <b>Gericht / Gericht</b>
     *  * <p>
     *  *  Code: 082
     *  * <p>
     *  * 
     */
    @JsonProperty("289")
    @XmlEnumValue("289")
    Sacheinlagenpruefer("289"),

    /**
     * <b>Gericht / Gericht</b>
     *  * <p>
     *  *  Code: 082
     *  * <p>
     *  * 
     */
    @JsonProperty("290")
    @XmlEnumValue("290")
    Staendige_Vertreter_fuer_die_Zweigniederlassung("290"),

    /**
     * <b>Gerichtsvollzieher(in) / Gerichtsvollzieher(in)</b>
     *  * <p>
     *  *  Code: 083
     *  * <p>
     *  * 
     */
    @JsonProperty("291")
    @XmlEnumValue("291")
    Uebertragender_Rechtstraeger("291"),

    /**
     * <b>Gerichtsvollzieher(in) / Gerichtsvollzieher(in)</b>
     *  * <p>
     *  *  Code: 083
     *  * <p>
     *  * 
     */
    @JsonProperty("292")
    @XmlEnumValue("292")
    Vergleichsverwalter("292"),

    /**
     * <b>Gerichtsvollzieher(in) / Gerichtsvollzieher(in)</b>
     *  * <p>
     *  *  Code: 083
     *  * <p>
     *  * 
     */
    @JsonProperty("293")
    @XmlEnumValue("293")
    Verwaltungsrat_raetin("293"),

    /**
     * <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b>
     *  * <p>
     *  *  Code: 084
     *  * <p>
     *  * 
     */
    @JsonProperty("294")
    @XmlEnumValue("294")
    Vorstandsvorsitzende("294"),

    /**
     * <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b>
     *  * <p>
     *  *  Code: 084
     *  * <p>
     *  * 
     */
    @JsonProperty("295")
    @XmlEnumValue("295")
    Zweigniederlassung("295"),

    /**
     * <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b>
     *  * <p>
     *  *  Code: 084
     *  * <p>
     *  * 
     */
    @JsonProperty("296")
    @XmlEnumValue("296")
    Vertreter_des_Klaegers_oder_der_Klaegerin("296"),

    /**
     * <b>Gesch&#228;digte(r) / Gesch&#228;digte(r)</b>
     *  * <p>
     *  *  Code: 084
     *  * <p>
     *  * 
     */
    @JsonProperty("297")
    @XmlEnumValue("297")
    Vertreter_des_oder_der_Beklagten("297"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 085
     *  * <p>
     *  * 
     */
    @JsonProperty("298")
    @XmlEnumValue("298")
    Bewaehrungshilfe("298"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 085
     *  * <p>
     *  * 
     */
    @JsonProperty("299")
    @XmlEnumValue("299")
    Gerichtshilfe("299"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 085
     *  * <p>
     *  * 
     */
    @JsonProperty("300")
    @XmlEnumValue("300")
    Justizvollzug("300"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in) / Gesch&#228;ftsf&#252;hrende(r) Gesellschafter(in)</b>
     *  * <p>
     *  *  Code: 085
     *  * <p>
     *  * 
     */
    @JsonProperty("301")
    @XmlEnumValue("301")
    Pseudoname("301"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrer(in) / Gesch&#228;ftsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 086
     *  * <p>
     *  * 
     */
    @JsonProperty("302")
    @XmlEnumValue("302")
    Gesetzliche_Vertreter_des_Glaeubigers_oder_der_Glaeubigerin("302"),

    /**
     * <b>Gesch&#228;ftsf&#252;hrer(in) / Gesch&#228;ftsf&#252;hrer(in)</b>
     *  * <p>
     *  *  Code: 086
     *  * <p>
     *  * 
     */
    @JsonProperty("303")
    @XmlEnumValue("303")
    Gesetzliche_Vertreter_des_Schuldners_oder_der_Schuldnerin("303"),

    /**
     * <b>Gesetzliche(r) Erbe (Erbin) / Gesetzliche(r) Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 087
     *  * <p>
     *  * 
     */
    @JsonProperty("304")
    @XmlEnumValue("304")
    Bevollmaechtigte_des_Glaeubigers_oder_der_Glaeubigerin("304"),

    /**
     * <b>Gesetzliche(r) Erbe (Erbin) / Gesetzliche(r) Erbe (Erbin)</b>
     *  * <p>
     *  *  Code: 087
     *  * <p>
     *  * 
     */
    @JsonProperty("305")
    @XmlEnumValue("305")
    Bevollmaechtigte_des_Schuldners_oder_der_Schuldnerin("305"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 088
     *  * <p>
     *  * 
     */
    @JsonProperty("306")
    @XmlEnumValue("306")
    Fahrzeughalter("306"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 088
     *  * <p>
     *  * 
     */
    @JsonProperty("307")
    @XmlEnumValue("307")
    Fruehere_Lebenspartner("307"),

    /**
     * <b>Gesetzliche(r) Vertreter(in) / Gesetzliche(r) Vertreter(in)</b>
     *  * <p>
     *  *  Code: 088
     *  * <p>
     *  * 
     */
    @JsonProperty("308")
    @XmlEnumValue("308")
    Sicherungsverwalter("308"),

    /**
     * <b>Gl&#228;ubiger(in) / Creditor</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("309")
    @XmlEnumValue("309")
    Zwangsverwalter("309"),

    /**
     * <b>Gl&#228;ubiger(in) / Creditor</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("310")
    @XmlEnumValue("310")
    Mieter("310"),

    /**
     * <b>Gl&#228;ubiger(in) / Creditor</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("311")
    @XmlEnumValue("311")
    Buerge_Buergin("311"),

    /**
     * <b>Gl&#228;ubiger(in) / Creditor</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("312")
    @XmlEnumValue("312")
    Meistbietende("312"),

    /**
     * <b>Gro&#223;eltern / Gro&#223;eltern</b>
     *  * <p>
     *  *  Code: 090
     *  * <p>
     *  * 
     */
    @JsonProperty("313")
    @XmlEnumValue("313")
    Abschlusspruefer("313"),

    /**
     * <b>Gro&#223;eltern / Gro&#223;eltern</b>
     *  * <p>
     *  *  Code: 090
     *  * <p>
     *  * 
     */
    @JsonProperty("314")
    @XmlEnumValue("314")
    Antragstellervertreter("314"),

    /**
     * <b>Gro&#223;eltern / Gro&#223;eltern</b>
     *  * <p>
     *  *  Code: 090
     *  * <p>
     *  * 
     */
    @JsonProperty("315")
    @XmlEnumValue("315")
    Aufsichtsratsvorsitzende("315"),

    /**
     * <b>Gro&#223;eltern / Gro&#223;eltern</b>
     *  * <p>
     *  *  Code: 090
     *  * <p>
     *  * 
     */
    @JsonProperty("316")
    @XmlEnumValue("316")
    Berufskammer("316"),

    /**
     * <b>Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)</b>
     *  * <p>
     *  *  Code: 092
     *  * <p>
     *  * 
     */
    @JsonProperty("317")
    @XmlEnumValue("317")
    Betroffenenvertreter("317"),

    /**
     * <b>Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)</b>
     *  * <p>
     *  *  Code: 092
     *  * <p>
     *  * 
     */
    @JsonProperty("318")
    @XmlEnumValue("318")
    Buergermeister("318"),

    /**
     * <b>Gro&#223;vater (Gro&#223;mutter) / Gro&#223;vater (Gro&#223;mutter)</b>
     *  * <p>
     *  *  Code: 092
     *  * <p>
     *  * 
     */
    @JsonProperty("319")
    @XmlEnumValue("319")
    Eingliederungsbeteiligte("319"),

    /**
     * <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 093
     *  * <p>
     *  * 
     */
    @JsonProperty("320")
    @XmlEnumValue("320")
    Formwechselnder_Rechtstraeger("320"),

    /**
     * <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 093
     *  * <p>
     *  * 
     */
    @JsonProperty("321")
    @XmlEnumValue("321")
    Gewerbeamt("321"),

    /**
     * <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 093
     *  * <p>
     *  * 
     */
    @JsonProperty("322")
    @XmlEnumValue("322")
    Inhaber_nicht_eingetragen("322"),

    /**
     * <b>Hauptbevollm&#228;chtigte(r) / Hauptbevollm&#228;chtigte(r)</b>
     *  * <p>
     *  *  Code: 093
     *  * <p>
     *  * 
     */
    @JsonProperty("323")
    @XmlEnumValue("323")
    Kostenempfaenger("323"),

    /**
     * <b>Hoferbe (Hoferbin) / Hoferbe (Hoferbin)</b>
     *  * <p>
     *  *  Code: 094
     *  * <p>
     *  * 
     */
    @JsonProperty("324")
    @XmlEnumValue("324")
    Nachlassgericht("324"),

    /**
     * <b>Hoferbe (Hoferbin) / Hoferbe (Hoferbin)</b>
     *  * <p>
     *  *  Code: 094
     *  * <p>
     *  * 
     */
    @JsonProperty("325")
    @XmlEnumValue("325")
    Sonderpruefer("325"),

    /**
     * <b>Hoferbe (Hoferbin) / Hoferbe (Hoferbin)</b>
     *  * <p>
     *  *  Code: 094
     *  * <p>
     *  * 
     */
    @JsonProperty("326")
    @XmlEnumValue("326")
    Sonstige_gerichtlich_bestellte_Vertreter("326"),

    /**
     * <b>Inhaber(in) der Firma / Inhaber(in) der Firma</b>
     *  * <p>
     *  *  Code: 095
     *  * <p>
     *  * 
     */
    @JsonProperty("327")
    @XmlEnumValue("327")
    Sonstige_gesetzliche_Vertreter_BGB("327"),

    /**
     * <b>Inhaber(in) der Firma / Inhaber(in) der Firma</b>
     *  * <p>
     *  *  Code: 095
     *  * <p>
     *  * 
     */
    @JsonProperty("328")
    @XmlEnumValue("328")
    Sonstige_organschaftliche_Vertreter_HRB("328"),

    /**
     * <b>Insolvenzverwalter(in) / Insolvency Administrator</b>
     *  * <p>
     *  *  Code: 096
     *  * <p>
     *  * 
     */
    @JsonProperty("329")
    @XmlEnumValue("329")
    Standardkostenschuldner("329"),

    /**
     * <b>Insolvenzverwalter(in) / Insolvency Administrator</b>
     *  * <p>
     *  *  Code: 096
     *  * <p>
     *  * 
     */
    @JsonProperty("330")
    @XmlEnumValue("330")
    Uebernahmeschuldner("330"),

    /**
     * <b>Insolvenzverwalter(in) / Insolvency Administrator</b>
     *  * <p>
     *  *  Code: 096
     *  * <p>
     *  * 
     */
    @JsonProperty("331")
    @XmlEnumValue("331")
    Unternehmensvertragsbeteiligte("331"),

    /**
     * <b>Jugendamt / Jugendamt</b>
     *  * <p>
     *  *  Code: 097
     *  * <p>
     *  * 
     */
    @JsonProperty("332")
    @XmlEnumValue("332")
    Vertreter_des_persoenlich_haftenden_Gesellschafters("332"),

    /**
     * <b>Jugendamt / Jugendamt</b>
     *  * <p>
     *  *  Code: 097
     *  * <p>
     *  * 
     */
    @JsonProperty("333")
    @XmlEnumValue("333")
    Werkleiter("333"),

    /**
     * <b>Kammer / Kammer</b>
     *  * <p>
     *  *  Code: 098
     *  * <p>
     *  * 
     */
    @JsonProperty("334")
    @XmlEnumValue("334")
    Mehrfachsitz("334"),

    /**
     * <b>Kammer / Kammer</b>
     *  * <p>
     *  *  Code: 098
     *  * <p>
     *  * 
     */
    @JsonProperty("335")
    @XmlEnumValue("335")
    Mitglied_VR("335"),

    /**
     * <b>Kammer / Kammer</b>
     *  * <p>
     *  *  Code: 098
     *  * <p>
     *  * 
     */
    @JsonProperty("336")
    @XmlEnumValue("336")
    Mitglied_e_BGB_Gesellschaft_als_Abwicklerin("336"),

    /**
     * <b>Kammermitglied / Kammermitglied</b>
     *  * <p>
     *  *  Code: 099
     *  * <p>
     *  * 
     */
    @JsonProperty("337")
    @XmlEnumValue("337")
    Mitglied_e_BGB_Gesellschaft_als_ges_Vertreterin("337"),

    /**
     * <b>Kammermitglied / Kammermitglied</b>
     *  * <p>
     *  *  Code: 099
     *  * <p>
     *  * 
     */
    @JsonProperty("338")
    @XmlEnumValue("338")
    Mitglied_e_BGB_Gesellschaft_als_Kommanditistin("338"),

    /**
     * <b>Kind / Kind</b>
     *  * <p>
     *  *  Code: 100
     *  * <p>
     *  * 
     */
    @JsonProperty("339")
    @XmlEnumValue("339")
    Mitglied_e_BGB_Gesellschaft_als_Liquidatorin("339"),

    /**
     * <b>Kind / Kind</b>
     *  * <p>
     *  *  Code: 100
     *  * <p>
     *  * 
     */
    @JsonProperty("340")
    @XmlEnumValue("340")
    Mitglied_e_BGB_Gesellschaft_als_Mitglied_e_EWIV("340"),

    /**
     * <b>Kl&#228;ger(in) / Plaintiff</b>
     *  * <p>
     *  *  Code: 101
     *  * <p>
     *  * 
     */
    @JsonProperty("341")
    @XmlEnumValue("341")
    Mitglied_e_BGB_Gesellschaft_als_phG("341"),

    /**
     * <b>Kl&#228;ger(in) / Plaintiff</b>
     *  * <p>
     *  *  Code: 101
     *  * <p>
     *  * 
     */
    @JsonProperty("342")
    @XmlEnumValue("342")
    Mitglied_e_Erbengemeinschaft_als_ges_Vertreterin("342"),

    /**
     * <b>Kontrollbetreuer(in) / Kontrollbetreuer(in)</b>
     *  * <p>
     *  *  Code: 102
     *  * <p>
     *  * 
     */
    @JsonProperty("343")
    @XmlEnumValue("343")
    Mitglied_e_Erbengemeinschaft_als_Inhaberin("343"),

    /**
     * <b>Kontrollbetreuer(in) / Kontrollbetreuer(in)</b>
     *  * <p>
     *  *  Code: 102
     *  * <p>
     *  * 
     */
    @JsonProperty("344")
    @XmlEnumValue("344")
    Mitglied_e_Erbengemeinschaft_als_Kommanditistin("344"),

    /**
     * <b>Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 103
     *  * <p>
     *  * 
     */
    @JsonProperty("345")
    @XmlEnumValue("345")
    Mitglied_e_Erbengemeinschaft_als_Mitglied_e_EWIV("345"),

    /**
     * <b>Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 103
     *  * <p>
     *  * 
     */
    @JsonProperty("346")
    @XmlEnumValue("346")
    Nebensitz("346"),

    /**
     * <b>Korrespondenzanwalt (-anw&#228;ltin) / Korrespondenzanwalt (-anw&#228;ltin)</b>
     *  * <p>
     *  *  Code: 103
     *  * <p>
     *  * 
     */
    @JsonProperty("347")
    @XmlEnumValue("347")
    Gesamthandsgemeinschaft("347"),

    /**
     * <b>Kostenschuldner(in) / Kostenschuldner(in)</b>
     *  * <p>
     *  *  Code: 104
     *  * <p>
     *  * 
     */
    @JsonProperty("348")
    @XmlEnumValue("348")
    Mitglied_einer_Gesamthandsgemeinschaft("348"),

    /**
     * <b>Kostenschuldner(in) / Kostenschuldner(in)</b>
     *  * <p>
     *  *  Code: 104
     *  * <p>
     *  * 
     */
    @JsonProperty("349")
    @XmlEnumValue("349")
    Leitungsperson_iSv_30_Abs_1_Nr_1_bis_5_OWiG("349"),

    /**
     * <b>Kostenschuldner(in) / Kostenschuldner(in)</b>
     *  * <p>
     *  *  Code: 104
     *  * <p>
     *  * 
     */
    @JsonProperty("350")
    @XmlEnumValue("350")
    Einziehungsbeteiligter("350"),

    /**
     * <b>Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)</b>
     *  * <p>
     *  *  Code: 105
     *  * <p>
     *  * 
     */
    @JsonProperty("351")
    @XmlEnumValue("351")
    Antragsgegnervertreter("351"),

    /**
     * <b>Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)</b>
     *  * <p>
     *  *  Code: 105
     *  * <p>
     *  * 
     */
    @JsonProperty("352")
    @XmlEnumValue("352")
    Verbraucher("352"),

    /**
     * <b>Landwirtschaftsrichter(in) / Landwirtschaftsrichter(in)</b>
     *  * <p>
     *  *  Code: 105
     *  * <p>
     *  * 
     */
    @JsonProperty("353")
    @XmlEnumValue("353")
    Vielmelder("353"),

    /**
     * <b>Lebenspartner(in) / Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 106
     *  * <p>
     *  * 
     */
    @JsonProperty("354")
    @XmlEnumValue("354")
    Vollmachtgeber("354"),

    /**
     * <b>Lebenspartner(in) / Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 106
     *  * <p>
     *  * 
     */
    @JsonProperty("355")
    @XmlEnumValue("355")
    Nebenbeteiligte_444_StPO("355"),

    /**
     * <b>Lebenspartner(in) / Lebenspartner(in)</b>
     *  * <p>
     *  *  Code: 106
     *  * <p>
     *  * 
     */
    @JsonProperty("356")
    @XmlEnumValue("356")
    Verfallsbeteiligte_442_StPO_aF("356"),

    /**
     * <b>Liquidator(in) / Liquidator(in)</b>
     *  * <p>
     *  *  Code: 107
     *  * <p>
     *  * 
     */
    @JsonProperty("357")
    @XmlEnumValue("357")
    Verfolgte_34_IRG("357"),

    /**
     * <b>Liquidator(in) / Liquidator(in)</b>
     *  * <p>
     *  *  Code: 107
     *  * <p>
     *  * 
     */
    @JsonProperty("358")
    @XmlEnumValue("358")
    Rechtsnachfolger("358"),

    /**
     * <b>Liquidator(in) / Liquidator(in)</b>
     *  * <p>
     *  *  Code: 107
     *  * <p>
     *  * 
     */
    @JsonProperty("359")
    @XmlEnumValue("359")
    Statuswechselnde_Rechtstraeger("359"),

    /**
     * <b>Minderj&#228;hrige(r) / Minderj&#228;hrige(r)</b>
     *  * <p>
     *  *  Code: 108
     *  * <p>
     *  * 
     */
    @JsonProperty("360")
    @XmlEnumValue("360")
    Haftangehoerige("360"),

    /**
     * <b>Minderj&#228;hrige(r) / Minderj&#228;hrige(r)</b>
     *  * <p>
     *  *  Code: 108
     *  * <p>
     *  * 
     */
    @JsonProperty("361")
    @XmlEnumValue("361")
    Restrukturierungsbeauftragte("361"),

    /**
     * <b>Minderj&#228;hrige(r) / Minderj&#228;hrige(r)</b>
     *  * <p>
     *  *  Code: 108
     *  * <p>
     *  * 
     */
    @JsonProperty("362")
    @XmlEnumValue("362")
    Sanierungsmoderator("362"),

    /**
     * <b>Mitvormund / Mitvormund</b>
     *  * <p>
     *  *  Code: 109
     *  * <p>
     *  * 
     */
    @JsonProperty("363")
    @XmlEnumValue("363")
    Abschriftenempfaenger("363"),

    /**
     * <b>Mitvormund / Mitvormund</b>
     *  * <p>
     *  *  Code: 109
     *  * <p>
     *  * 
     */
    @JsonProperty("364")
    @XmlEnumValue("364")
    Kostenbeamte("364"),

    /**
     * <b>Mitvormund / Mitvormund</b>
     *  * <p>
     *  *  Code: 109
     *  * <p>
     *  * 
     */
    @JsonProperty("365")
    @XmlEnumValue("365")
    Urkundsbeamte_der_Geschaeftsstelle("365"),

    /**
     * <b>M&#252;ndel / M&#252;ndel</b>
     *  * <p>
     *  *  Code: 110
     *  * <p>
     *  * 
     */
    @JsonProperty("366")
    @XmlEnumValue("366")
    Anordnungsbefugte("366"),

    /**
     * <b>M&#252;ndel / M&#252;ndel</b>
     *  * <p>
     *  *  Code: 110
     *  * <p>
     *  * 
     */
    @JsonProperty("367")
    @XmlEnumValue("367")
    Erstschuldner("367"),

    /**
     * <b>M&#252;ndel / M&#252;ndel</b>
     *  * <p>
     *  *  Code: 110
     *  * <p>
     *  * 
     */
    @JsonProperty("368")
    @XmlEnumValue("368")
    Kasse("368"),

    /**
     * <b>M&#252;ndel / M&#252;ndel</b>
     *  * <p>
     *  *  Code: 110
     *  * <p>
     *  * 
     */
    @JsonProperty("369")
    @XmlEnumValue("369")
    Arrestbeklagte("369"),

    /**
     * <b>Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 112
     *  * <p>
     *  * 
     */
    @JsonProperty("370")
    @XmlEnumValue("370")
    Arrestklaeger("370"),

    /**
     * <b>Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 112
     *  * <p>
     *  * 
     */
    @JsonProperty("371")
    @XmlEnumValue("371")
    Bezirksrevisor("371"),

    /**
     * <b>Nachbesserungsgl&#228;ubiger(in) / Nachbesserungsgl&#228;ubiger(in)</b>
     *  * <p>
     *  *  Code: 112
     *  * <p>
     *  * 
     */
    @JsonProperty("372")
    @XmlEnumValue("372")
    Nebenintervenient("372"),

    /**
     * <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b>
     *  * <p>
     *  *  Code: 113
     *  * <p>
     *  * 
     */
    @JsonProperty("373")
    @XmlEnumValue("373")
    Restitutionsbeklagte("373"),

    /**
     * <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b>
     *  * <p>
     *  *  Code: 113
     *  * <p>
     *  * 
     */
    @JsonProperty("374")
    @XmlEnumValue("374")
    Restitutionsklaeger("374"),

    /**
     * <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b>
     *  * <p>
     *  *  Code: 113
     *  * <p>
     *  * 
     */
    @JsonProperty("375")
    @XmlEnumValue("375")
    Streithelfer("375"),

    /**
     * <b>Nachlasspfleger(in) / Nachlasspfleger(in)</b>
     *  * <p>
     *  *  Code: 113
     *  * <p>
     *  * 
     */
    @JsonProperty("376")
    @XmlEnumValue("376")
    Streitverkuendete("376"),

    /**
     * <b>Nachlassverwalter(in) / Nachlassverwalter(in)</b>
     *  * <p>
     *  *  Code: 114
     *  * <p>
     *  * 
     */
    @JsonProperty("377")
    @XmlEnumValue("377")
    Uebersetzer("377"),

    /**
     * <b>Nachlassverwalter(in) / Nachlassverwalter(in)</b>
     *  * <p>
     *  *  Code: 114
     *  * <p>
     *  * 
     */
    @JsonProperty("378")
    @XmlEnumValue("378")
    Unternehmen_378("378"),

    /**
     * <b>Nachlassverwalter(in) / Nachlassverwalter(in)</b>
     *  * <p>
     *  *  Code: 114
     *  * <p>
     *  * 
     */
    @JsonProperty("379")
    @XmlEnumValue("379")
    Kontaktperson_des_Unternehmens("379"),

    /**
     * <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 115
     *  * <p>
     *  * 
     */
    @JsonProperty("380")
    @XmlEnumValue("380")
    Beigetretene("380"),

    /**
     * <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 115
     *  * <p>
     *  * 
     */
    @JsonProperty("381")
    @XmlEnumValue("381")
    Erklaerende("381"),

    /**
     * <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 115
     *  * <p>
     *  * 
     */
    @JsonProperty("382")
    @XmlEnumValue("382")
    Heim("382"),

    /**
     * <b>Nebenkl&#228;ger(in) / Nebenkl&#228;ger(in)</b>
     *  * <p>
     *  *  Code: 115
     *  * <p>
     *  * 
     */
    @JsonProperty("383")
    @XmlEnumValue("383")
    Inhaftierte_Person("383"),

    /**
     * <b>Neffe (Nichte) / Neffe (Nichte)</b>
     *  * <p>
     *  *  Code: 116
     *  * <p>
     *  * 
     */
    @JsonProperty("384")
    @XmlEnumValue("384")
    Jugendgerichtshilfe("384"),

    /**
     * <b>Neffe (Nichte) / Neffe (Nichte)</b>
     *  * <p>
     *  *  Code: 116
     *  * <p>
     *  * 
     */
    @JsonProperty("385")
    @XmlEnumValue("385")
    Krankenhaus("385"),

    /**
     * <b>Neffe (Nichte) / Neffe (Nichte)</b>
     *  * <p>
     *  *  Code: 116
     *  * <p>
     *  * 
     */
    @JsonProperty("386")
    @XmlEnumValue("386")
    Nebenbetroffene("386"),

    /**
     * <b>Nicht verwandt / Nicht verwandt</b>
     *  * <p>
     *  *  Code: 117
     *  * <p>
     *  * 
     */
    @JsonProperty("387")
    @XmlEnumValue("387")
    Nebenklaegervertreter("387"),

    /**
     * <b>Nicht verwandt / Nicht verwandt</b>
     *  * <p>
     *  *  Code: 117
     *  * <p>
     *  * 
     */
    @JsonProperty("388")
    @XmlEnumValue("388")
    Psychosoziale_Prozessbegleiter("388"),

    /**
     * <b>Nicht verwandt / Nicht verwandt</b>
     *  * <p>
     *  *  Code: 117
     *  * <p>
     *  * 
     */
    @JsonProperty("389")
    @XmlEnumValue("389")
    Rentenberater("389"),

    /**
     * <b>Onkel (Tante) / Onkel (Tante)</b>
     *  * <p>
     *  *  Code: 118
     *  * <p>
     *  * 
     */
    @JsonProperty("390")
    @XmlEnumValue("390")
    Sachverstaendigen_Zeuge_Zeugin("390"),

    /**
     * <b>Onkel (Tante) / Onkel (Tante)</b>
     *  * <p>
     *  *  Code: 118
     *  * <p>
     *  * 
     */
    @JsonProperty("391")
    @XmlEnumValue("391")
    Steuerberater("391"),

    /**
     * <b>Opfer / Opfer</b>
     *  * <p>
     *  *  Code: 119
     *  * <p>
     *  * 
     */
    @JsonProperty("392")
    @XmlEnumValue("392")
    Unternehmen_392("392"),

    /**
     * <b>Opfer / Opfer</b>
     *  * <p>
     *  *  Code: 119
     *  * <p>
     *  * 
     */
    @JsonProperty("393")
    @XmlEnumValue("393")
    Verfahrensbeistand("393"),

    /**
     * <b>Opfer / Opfer</b>
     *  * <p>
     *  *  Code: 119
     *  * <p>
     *  * 
     */
    @JsonProperty("394")
    @XmlEnumValue("394")
    Verfahrensbeteiligte("394"),

    /**
     * <b>P&#228;chter(in) / P&#228;chter(in)</b>
     *  * <p>
     *  *  Code: 120
     *  * <p>
     *  * 
     */
    @JsonProperty("395")
    @XmlEnumValue("395")
    Verhinderungsbetreuer("395"),

    /**
     * <b>P&#228;chter(in) / P&#228;chter(in)</b>
     *  * <p>
     *  *  Code: 120
     *  * <p>
     *  * 
     */
    @JsonProperty("396")
    @XmlEnumValue("396")
    Verletztenbeistand("396"),

    /**
     * <b>P&#228;chter(in) / P&#228;chter(in)</b>
     *  * <p>
     *  *  Code: 120
     *  * <p>
     *  * 
     */
    @JsonProperty("397")
    @XmlEnumValue("397")
    Wirtschaftspruefer("397"),

    /**
     * <b>Pflegeeltern / Pflegeeltern</b>
     *  * <p>
     *  *  Code: 121
     *  * <p>
     *  * 
     */
    @JsonProperty("398")
    @XmlEnumValue("398")
    Zedent("398"),

    /**
     * <b>Pflegeeltern / Pflegeeltern</b>
     *  * <p>
     *  *  Code: 121
     *  * <p>
     *  * 
     */
    @JsonProperty("399")
    @XmlEnumValue("399")
    Registerfuehrende_Behoerde_oder_Stelle("399");

    private final String value;
    RollenCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @Override
    public String toString() { return value; }
}
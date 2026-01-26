package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * VersicherungsTyp Codes aus <a href="https://github.com/l-pagel/X.Justiz.Core/tree/main/docs">IHK Liste</a>.
 *  * <p>
 *  *  <u><b>Insurance type codes:</b></u> from <a href="https://github.com/l-pagel/X.Justiz.Core/tree/main/docs">IHK list</a>.
 */
@XmlType
@XmlEnum
public enum VersicherungsTypCode {

    /**
     * <b>Alle Sparten</b>
     *  * <p>
     *  *  Code: 000
     *  * <p>
     *  * 
     */
    @JsonProperty("000")
    @XmlEnumValue("000")
    Alle_Sparten("000"),

    /**
     * <b>Lebensversicherung</b>
     *  * <p>
     *  *  Code: 01
     *  * <p>
     *  * 
     */
    @JsonProperty("01")
    @XmlEnumValue("01")
    Lebensversicherung("01"),

    /**
     * <b>Einzelversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Einzelversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird("011"),

    /**
     * <b>Kapitalbildende Lebensversicherung (einschließlich vermögensbildender Lebensversicherung) mit überwiegendem Todesfallcharakter</b>
     *  * <p>
     *  *  Code: 0111
     *  * <p>
     *  * 
     */
    @JsonProperty("0111")
    @XmlEnumValue("0111")
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Todesfallcharakter("0111"),

    /**
     * <b>Risikoversicherung</b>
     *  * <p>
     *  *  Code: 0112
     *  * <p>
     *  * 
     */
    @JsonProperty("0112")
    @XmlEnumValue("0112")
    Risikoversicherung("0112"),

    /**
     * <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter</b>
     *  * <p>
     *  *  Code: 0113
     *  * <p>
     *  * 
     */
    @JsonProperty("0113")
    @XmlEnumValue("0113")
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter("0113"),

    /**
     * <b>Berufsunfähigkeitsversicherung</b>
     *  * <p>
     *  *  Code: 0114
     *  * <p>
     *  * 
     */
    @JsonProperty("0114")
    @XmlEnumValue("0114")
    Berufsunfaehigkeitsversicherung("0114"),

    /**
     * <b>Pflegerentenversicherung</b>
     *  * <p>
     *  *  Code: 0115
     *  * <p>
     *  * 
     */
    @JsonProperty("0115")
    @XmlEnumValue("0115")
    Pflegerentenversicherung("0115"),

    /**
     * <b>übrige und nicht aufgegliederte Einzelversicherung (einschließlich der Heirats- und Geburtenversicherung, aber ohne sonstige Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0116
     *  * <p>
     *  * 
     */
    @JsonProperty("0116")
    @XmlEnumValue("0116")
    uebrige_und_nicht_aufgegliederte_Einzelversicherung_einschliesslich_der_Heirats_und_Geburtenversicherung_aber_ohne_sonstige_Lebensversicherung("0116"),

    /**
     * <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG</b>
     *  * <p>
     *  *  Code: 0117
     *  * <p>
     *  * 
     */
    @JsonProperty("0117")
    @XmlEnumValue("0117")
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG("0117"),

    /**
     * <b>Kollektivversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Kollektivversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird("012"),

    /**
     * <b>Kapitalversicherung mit überwiegendem Todesfallcharakter (ohne Kennzahlen 01.2.2 und 01.2.3)</b>
     *  * <p>
     *  *  Code: 0121
     *  * <p>
     *  * 
     */
    @JsonProperty("0121")
    @XmlEnumValue("0121")
    Kapitalversicherung_mit_ueberwiegendem_Todesfallcharakter("0121"),

    /**
     * <b>Bausparrisikoversicherung</b>
     *  * <p>
     *  *  Code: 0122
     *  * <p>
     *  * 
     */
    @JsonProperty("0122")
    @XmlEnumValue("0122")
    Bausparrisikoversicherung("0122"),

    /**
     * <b>Restschuldversicherung</b>
     *  * <p>
     *  *  Code: 0123
     *  * <p>
     *  * 
     */
    @JsonProperty("0123")
    @XmlEnumValue("0123")
    Restschuldversicherung("0123"),

    /**
     * <b>übrige und nicht aufgegliederte Kollektivversicherung (einschließlich der Heirats- und Geburtenversicherung), aber ohne sonstige Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0124
     *  * <p>
     *  * 
     */
    @JsonProperty("0124")
    @XmlEnumValue("0124")
    uebrige_und_nicht_aufgegliederte_Kollektivversicherung_aber_ohne_sonstige_Lebensversicherung("0124"),

    /**
     * <b>Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG</b>
     *  * <p>
     *  *  Code: 0125
     *  * <p>
     *  * 
     */
    @JsonProperty("0125")
    @XmlEnumValue("0125")
    Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG_0125("0125"),

    /**
     * <b>Zusatzversicherung (einschließlich der, für Kollektivversicherungen)</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Zusatzversicherung("013"),

    /**
     * <b>Unfall- Zusatzversicherung</b>
     *  * <p>
     *  *  Code: 0131
     *  * <p>
     *  * 
     */
    @JsonProperty("0131")
    @XmlEnumValue("0131")
    Unfall_Zusatzversicherung("0131"),

    /**
     * <b>Berufsunfähigkeits(Invaliditäts)-Zusatzversicherung</b>
     *  * <p>
     *  *  Code: 0132
     *  * <p>
     *  * 
     */
    @JsonProperty("0132")
    @XmlEnumValue("0132")
    Berufsunfaehigkeits_Zusatzversicherung("0132"),

    /**
     * <b>Risiko- und Zeitrenten- Zusatzversicherung</b>
     *  * <p>
     *  *  Code: 0133
     *  * <p>
     *  * 
     */
    @JsonProperty("0133")
    @XmlEnumValue("0133")
    Risiko_und_Zeitrenten_Zusatzversicherung("0133"),

    /**
     * <b>Pflegerenten- Zusatzversicherung</b>
     *  * <p>
     *  *  Code: 0134
     *  * <p>
     *  * 
     */
    @JsonProperty("0134")
    @XmlEnumValue("0134")
    Pflegerenten_Zusatzversicherung("0134"),

    /**
     * <b>Sonstige Zusatzversicherung</b>
     *  * <p>
     *  *  Code: 0135
     *  * <p>
     *  * 
     */
    @JsonProperty("0135")
    @XmlEnumValue("0135")
    Sonstige_Zusatzversicherung("0135"),

    /**
     * <b>Sonstige Lebensversicherung</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Sonstige_Lebensversicherung("014"),

    /**
     * <b>Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird</b>
     *  * <p>
     *  *  Code: 0141
     *  * <p>
     *  * 
     */
    @JsonProperty("0141")
    @XmlEnumValue("0141")
    Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird("0141"),

    /**
     * <b>Lebensversicherung ohne Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird</b>
     *  * <p>
     *  *  Code: 0142
     *  * <p>
     *  * 
     */
    @JsonProperty("0142")
    @XmlEnumValue("0142")
    Lebensversicherung_ohne_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird("0142"),

    /**
     * <b>Tontinengeschäfte</b>
     *  * <p>
     *  *  Code: 0143
     *  * <p>
     *  * 
     */
    @JsonProperty("0143")
    @XmlEnumValue("0143")
    Tontinengeschaefte("0143"),

    /**
     * <b>Kapitalisierungsgeschäfte</b>
     *  * <p>
     *  *  Code: 0144
     *  * <p>
     *  * 
     */
    @JsonProperty("0144")
    @XmlEnumValue("0144")
    Kapitalisierungsgeschaefte("0144"),

    /**
     * <b>Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird, nach dem AltZertG</b>
     *  * <p>
     *  *  Code: 0145
     *  * <p>
     *  * 
     */
    @JsonProperty("0145")
    @XmlEnumValue("0145")
    Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird_nach_dem_AltZertG("0145"),

    /**
     * <b>Geschäfte der Verwaltung von Versorgungseinrichtungen</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Geschaefte_der_Verwaltung_von_Versorgungseinrichtungen("015"),

    /**
     * <b>Krankenversicherung</b>
     *  * <p>
     *  *  Code: 02
     *  * <p>
     *  * 
     */
    @JsonProperty("02")
    @XmlEnumValue("02")
    Krankenversicherung("02"),

    /**
     * <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär)</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Einzel_Krankheitskostenvollversicherung("021"),

    /**
     * <b>Einzel- Krankheitskostenvollversicherung</b>
     *  * <p>
     *  *  Code: 0211
     *  * <p>
     *  * 
     */
    @JsonProperty("0211")
    @XmlEnumValue("0211")
    Einzel_Krankheitskostenvollversicherung_0211("0211"),

    /**
     * <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär), nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0212
     *  * <p>
     *  * 
     */
    @JsonProperty("0212")
    @XmlEnumValue("0212")
    Einzel_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0212"),

    /**
     * <b>Einzel- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadensversicherung</b>
     *  * <p>
     *  *  Code: 0213
     *  * <p>
     *  * 
     */
    @JsonProperty("0213")
    @XmlEnumValue("0213")
    Einzel_Krankheitskostenvollversicherung_nach_Art_der_Schadensversicherung("0213"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant)</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("022")
    @XmlEnumValue("022")
    Selbststaendige_Einzel_Krankheitskostenversicherung("022"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) substitutiv</b>
     *  * <p>
     *  *  Code: 0221
     *  * <p>
     *  * 
     */
    @JsonProperty("0221")
    @XmlEnumValue("0221")
    Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv("0221"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0222
     *  * <p>
     *  * 
     */
    @JsonProperty("0222")
    @XmlEnumValue("0222")
    Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0222"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0223
     *  * <p>
     *  * 
     */
    @JsonProperty("0223")
    @XmlEnumValue("0223")
    Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung("0223"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär)</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("023")
    @XmlEnumValue("023")
    Selbststaendige_Einzel_Krankheitskostenversicherung_023("023"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) substitutiv</b>
     *  * <p>
     *  *  Code: 0231
     *  * <p>
     *  * 
     */
    @JsonProperty("0231")
    @XmlEnumValue("0231")
    Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv_0231("0231"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0232
     *  * <p>
     *  * 
     */
    @JsonProperty("0232")
    @XmlEnumValue("0232")
    Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0232("0232"),

    /**
     * <b>Selbstständige Einzel- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0233
     *  * <p>
     *  * 
     */
    @JsonProperty("0233")
    @XmlEnumValue("0233")
    Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0233("0233"),

    /**
     * <b>Einzel- Krankentagegeldversicherung</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("024")
    @XmlEnumValue("024")
    Einzel_Krankentagegeldversicherung("024"),

    /**
     * <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) substitutiv</b>
     *  * <p>
     *  *  Code: 0241
     *  * <p>
     *  * 
     */
    @JsonProperty("0241")
    @XmlEnumValue("0241")
    Krankentagegeldversicherung_substitutiv("0241"),

    /**
     * <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0242
     *  * <p>
     *  * 
     */
    @JsonProperty("0242")
    @XmlEnumValue("0242")
    Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0242"),

    /**
     * <b>Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0243
     *  * <p>
     *  * 
     */
    @JsonProperty("0243")
    @XmlEnumValue("0243")
    Krankentagegeldversicherung_nach_Art_der_Schadenversicherung("0243"),

    /**
     * <b>Lohnfortzahlungsversicherung</b>
     *  * <p>
     *  *  Code: 0244
     *  * <p>
     *  * 
     */
    @JsonProperty("0244")
    @XmlEnumValue("0244")
    Lohnfortzahlungsversicherung("0244"),

    /**
     * <b>Restschuldversicherung</b>
     *  * <p>
     *  *  Code: 0245
     *  * <p>
     *  * 
     */
    @JsonProperty("0245")
    @XmlEnumValue("0245")
    Restschuldversicherung_0245("0245"),

    /**
     * <b>Selbstständige Einzel- Krankenhaustagegeldversicherung</b>
     *  * <p>
     *  *  Code: 025
     *  * <p>
     *  * 
     */
    @JsonProperty("025")
    @XmlEnumValue("025")
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung("025"),

    /**
     * <b>Selbstständige Einzel- Krankenhaustagegeldversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 0251
     *  * <p>
     *  * 
     */
    @JsonProperty("0251")
    @XmlEnumValue("0251")
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_substitutiv("0251"),

    /**
     * <b>Selbstständige Einzel- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0252
     *  * <p>
     *  * 
     */
    @JsonProperty("0252")
    @XmlEnumValue("0252")
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0252"),

    /**
     * <b>Selbstständige Einzel- Krankenhaustagegeldversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0253
     *  * <p>
     *  * 
     */
    @JsonProperty("0253")
    @XmlEnumValue("0253")
    Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung("0253"),

    /**
     * <b>Sonstige selbstständige Einzel- Teilversicherung</b>
     *  * <p>
     *  *  Code: 026
     *  * <p>
     *  * 
     */
    @JsonProperty("026")
    @XmlEnumValue("026")
    Sonstige_selbststaendige_Einzel_Teilversicherung("026"),

    /**
     * <b>Selbstständige Zahnbehandlungsversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 0261
     *  * <p>
     *  * 
     */
    @JsonProperty("0261")
    @XmlEnumValue("0261")
    Selbststaendige_Zahnbehandlungsversicherung_substitutiv("0261"),

    /**
     * <b>Selbstständige Zahnbehandlungsversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0262
     *  * <p>
     *  * 
     */
    @JsonProperty("0262")
    @XmlEnumValue("0262")
    Selbststaendige_Zahnbehandlungsversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0262"),

    /**
     * <b>Selbstständige Zahnbehandlungsversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0263
     *  * <p>
     *  * 
     */
    @JsonProperty("0263")
    @XmlEnumValue("0263")
    Selbststaendige_Zahnbehandlungsversicherung_nach_Art_der_Schadenversicherung("0263"),

    /**
     * <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) substitutiv</b>
     *  * <p>
     *  *  Code: 0264
     *  * <p>
     *  * 
     */
    @JsonProperty("0264")
    @XmlEnumValue("0264")
    Kurkostenversicherung_substitutiv("0264"),

    /**
     * <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0265
     *  * <p>
     *  * 
     */
    @JsonProperty("0265")
    @XmlEnumValue("0265")
    Kurkostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0265"),

    /**
     * <b>Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0266
     *  * <p>
     *  * 
     */
    @JsonProperty("0266")
    @XmlEnumValue("0266")
    Kurkostenversicherung_nach_Art_der_Schadenversicherung("0266"),

    /**
     * <b>Reisekrankenversicherung (gegen festes Entgelt)</b>
     *  * <p>
     *  *  Code: 0267
     *  * <p>
     *  * 
     */
    @JsonProperty("0267")
    @XmlEnumValue("0267")
    Reisekrankenversicherung("0267"),

    /**
     * <b>Sonstige Teilversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 0268
     *  * <p>
     *  * 
     */
    @JsonProperty("0268")
    @XmlEnumValue("0268")
    Sonstige_Teilversicherung_substitutiv("0268"),

    /**
     * <b>Sonstige Teilversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0269
     *  * <p>
     *  * 
     */
    @JsonProperty("0269")
    @XmlEnumValue("0269")
    Sonstige_Teilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0269"),

    /**
     * <b>Sonstige Teilversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02610
     *  * <p>
     *  * 
     */
    @JsonProperty("02610")
    @XmlEnumValue("02610")
    Sonstige_Teilversicherung_nach_Art_der_Schadenversicherung("02610"),

    /**
     * <b>Gruppen- Krankenversicherung (nach Einzel- und Sondertarifen)</b>
     *  * <p>
     *  *  Code: 027
     *  * <p>
     *  * 
     */
    @JsonProperty("027")
    @XmlEnumValue("027")
    Gruppen_Krankenversicherung("027"),

    /**
     * <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) substitutiv</b>
     *  * <p>
     *  *  Code: 0271
     *  * <p>
     *  * 
     */
    @JsonProperty("0271")
    @XmlEnumValue("0271")
    Gruppen_Krankheitskostenvollversicherung_substitutiv("0271"),

    /**
     * <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0272
     *  * <p>
     *  * 
     */
    @JsonProperty("0272")
    @XmlEnumValue("0272")
    Gruppen_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0272"),

    /**
     * <b>Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0273
     *  * <p>
     *  * 
     */
    @JsonProperty("0273")
    @XmlEnumValue("0273")
    Gruppen_Krankheitskostenvollversicherung_nach_Art_der_Schadenversicherung("0273"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) substitutiv</b>
     *  * <p>
     *  *  Code: 0274
     *  * <p>
     *  * 
     */
    @JsonProperty("0274")
    @XmlEnumValue("0274")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv("0274"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0275
     *  * <p>
     *  * 
     */
    @JsonProperty("0275")
    @XmlEnumValue("0275")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0275"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0276
     *  * <p>
     *  * 
     */
    @JsonProperty("0276")
    @XmlEnumValue("0276")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung("0276"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) substitutiv</b>
     *  * <p>
     *  *  Code: 0277
     *  * <p>
     *  * 
     */
    @JsonProperty("0277")
    @XmlEnumValue("0277")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv_0277("0277"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0278
     *  * <p>
     *  * 
     */
    @JsonProperty("0278")
    @XmlEnumValue("0278")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0278("0278"),

    /**
     * <b>Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0279
     *  * <p>
     *  * 
     */
    @JsonProperty("0279")
    @XmlEnumValue("0279")
    Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0279("0279"),

    /**
     * <b>Gruppen- Krankentagegeldversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 02710
     *  * <p>
     *  * 
     */
    @JsonProperty("02710")
    @XmlEnumValue("02710")
    Gruppen_Krankentagegeldversicherung_substitutiv("02710"),

    /**
     * <b>Gruppen- Krankentagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 02711
     *  * <p>
     *  * 
     */
    @JsonProperty("02711")
    @XmlEnumValue("02711")
    Gruppen_Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("02711"),

    /**
     * <b>Gruppen- Krankentagegeldversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02712
     *  * <p>
     *  * 
     */
    @JsonProperty("02712")
    @XmlEnumValue("02712")
    Gruppen_Krankentagegeldversicherung_nach_Art_der_Schadenversicherung("02712"),

    /**
     * <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 02713
     *  * <p>
     *  * 
     */
    @JsonProperty("02713")
    @XmlEnumValue("02713")
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_substitutiv("02713"),

    /**
     * <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 02714
     *  * <p>
     *  * 
     */
    @JsonProperty("02714")
    @XmlEnumValue("02714")
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("02714"),

    /**
     * <b>Selbstständige Gruppen- Krankenhaustagegeldversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02715
     *  * <p>
     *  * 
     */
    @JsonProperty("02715")
    @XmlEnumValue("02715")
    Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung("02715"),

    /**
     * <b>Sonstige selbstständige Gruppenteilversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 02716
     *  * <p>
     *  * 
     */
    @JsonProperty("02716")
    @XmlEnumValue("02716")
    Sonstige_selbststaendige_Gruppenteilversicherung_substitutiv("02716"),

    /**
     * <b>Sonstige selbstständige Gruppenteilversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 02717
     *  * <p>
     *  * 
     */
    @JsonProperty("02717")
    @XmlEnumValue("02717")
    Sonstige_selbststaendige_Gruppenteilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("02717"),

    /**
     * <b>Sonstige selbstständige Gruppenteilversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02718
     *  * <p>
     *  * 
     */
    @JsonProperty("02718")
    @XmlEnumValue("02718")
    Sonstige_selbststaendige_Gruppenteilversicherung_nach_Art_der_Schadenversicherung("02718"),

    /**
     * <b>Gruppen- Pflegepflichtversicherung</b>
     *  * <p>
     *  *  Code: 02719
     *  * <p>
     *  * 
     */
    @JsonProperty("02719")
    @XmlEnumValue("02719")
    Gruppen_Pflegepflichtversicherung("02719"),

    /**
     * <b>Freiwillige Gruppen- Pflegekostenversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 02720
     *  * <p>
     *  * 
     */
    @JsonProperty("02720")
    @XmlEnumValue("02720")
    Freiwillige_Gruppen_Pflegekostenversicherung_substitutiv("02720"),

    /**
     * <b>Freiwillige Gruppen- Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 02721
     *  * <p>
     *  * 
     */
    @JsonProperty("02721")
    @XmlEnumValue("02721")
    Freiwillige_Gruppen_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("02721"),

    /**
     * <b>Freiwillige Gruppen- Pflegekostenversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02722
     *  * <p>
     *  * 
     */
    @JsonProperty("02722")
    @XmlEnumValue("02722")
    Freiwillige_Gruppen_Pflegekostenversicherung_nach_Art_der_Schadenversicherung("02722"),

    /**
     * <b>Freiwillige Gruppen- Pflegetagegeldversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 02723
     *  * <p>
     *  * 
     */
    @JsonProperty("02723")
    @XmlEnumValue("02723")
    Freiwillige_Gruppen_Pflegetagegeldversicherung_substitutiv("02723"),

    /**
     * <b>Freiwillige Gruppen- Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 02724
     *  * <p>
     *  * 
     */
    @JsonProperty("02724")
    @XmlEnumValue("02724")
    Freiwillige_Gruppen_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("02724"),

    /**
     * <b>Freiwillige Gruppen- Pflegetagegeldversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 02725
     *  * <p>
     *  * 
     */
    @JsonProperty("02725")
    @XmlEnumValue("02725")
    Freiwillige_Gruppen_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung("02725"),

    /**
     * <b>Pflegekrankenversicherung</b>
     *  * <p>
     *  *  Code: 028
     *  * <p>
     *  * 
     */
    @JsonProperty("028")
    @XmlEnumValue("028")
    Pflegekrankenversicherung("028"),

    /**
     * <b>Pflegepflichtversicherung</b>
     *  * <p>
     *  *  Code: 0281
     *  * <p>
     *  * 
     */
    @JsonProperty("0281")
    @XmlEnumValue("0281")
    Pflegepflichtversicherung("0281"),

    /**
     * <b>Freiwillige Pflegekostenversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 0282
     *  * <p>
     *  * 
     */
    @JsonProperty("0282")
    @XmlEnumValue("0282")
    Freiwillige_Pflegekostenversicherung_substitutiv("0282"),

    /**
     * <b>Freiwillige Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0283
     *  * <p>
     *  * 
     */
    @JsonProperty("0283")
    @XmlEnumValue("0283")
    Freiwillige_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0283"),

    /**
     * <b>Freiwillige Pflegekostenversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0284
     *  * <p>
     *  * 
     */
    @JsonProperty("0284")
    @XmlEnumValue("0284")
    Freiwillige_Pflegekostenversicherung_nach_Art_der_Schadenversicherung("0284"),

    /**
     * <b>Freiwillige Pflegetagegeldversicherung substitutiv</b>
     *  * <p>
     *  *  Code: 0285
     *  * <p>
     *  * 
     */
    @JsonProperty("0285")
    @XmlEnumValue("0285")
    Freiwillige_Pflegetagegeldversicherung_substitutiv("0285"),

    /**
     * <b>Freiwillige Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung</b>
     *  * <p>
     *  *  Code: 0286
     *  * <p>
     *  * 
     */
    @JsonProperty("0286")
    @XmlEnumValue("0286")
    Freiwillige_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung("0286"),

    /**
     * <b>Freiwillige Pflegetagegeldversicherung nach Art der Schadenversicherung</b>
     *  * <p>
     *  *  Code: 0287
     *  * <p>
     *  * 
     */
    @JsonProperty("0287")
    @XmlEnumValue("0287")
    Freiwillige_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung("0287"),

    /**
     * <b>Übrige und nicht aufgegliederte Krankenversicherung (einschließlich der Beihilfeablöseversicherung)</b>
     *  * <p>
     *  *  Code: 029
     *  * <p>
     *  * 
     */
    @JsonProperty("029")
    @XmlEnumValue("029")
    Uebrige_und_nicht_aufgegliederte_Krankenversicherung("029"),

    /**
     * <b>Allgemeine Unfallversicherung</b>
     *  * <p>
     *  *  Code: 03
     *  * <p>
     *  * 
     */
    @JsonProperty("03")
    @XmlEnumValue("03")
    Allgemeine_Unfallversicherung("03"),

    /**
     * <b>Einzelunfallversicherung ohne Beitragsrückgewähr</b>
     *  * <p>
     *  *  Code: 031
     *  * <p>
     *  * 
     */
    @JsonProperty("031")
    @XmlEnumValue("031")
    Einzelunfallversicherung_ohne_Beitragsrueckgewaehr("031"),

    /**
     * <b>Unfallvollversicherung (ohne Kennzahlen 03.1.02 und 03.1.03)</b>
     *  * <p>
     *  *  Code: 03101
     *  * <p>
     *  * 
     */
    @JsonProperty("03101")
    @XmlEnumValue("03101")
    Unfallvollversicherung("03101"),

    /**
     * <b>Volks- Unfallvollversicherung</b>
     *  * <p>
     *  *  Code: 03102
     *  * <p>
     *  * 
     */
    @JsonProperty("03102")
    @XmlEnumValue("03102")
    Volks_Unfallvollversicherung("03102"),

    /**
     * <b>Unfallvollversicherung aus der FUSt- Versicherung</b>
     *  * <p>
     *  *  Code: 03103
     *  * <p>
     *  * 
     */
    @JsonProperty("03103")
    @XmlEnumValue("03103")
    Unfallvollversicherung_aus_der_FUSt_Versicherung("03103"),

    /**
     * <b>Versicherung gegen außerberufliche Unfälle</b>
     *  * <p>
     *  *  Code: 03104
     *  * <p>
     *  * 
     */
    @JsonProperty("03104")
    @XmlEnumValue("03104")
    Versicherung_gegen_ausserberufliche_Unfaelle("03104"),

    /**
     * <b>Reiseunfallversicherung</b>
     *  * <p>
     *  *  Code: 03105
     *  * <p>
     *  * 
     */
    @JsonProperty("03105")
    @XmlEnumValue("03105")
    Reiseunfallversicherung("03105"),

    /**
     * <b>Sofortunfallversicherung</b>
     *  * <p>
     *  *  Code: 03106
     *  * <p>
     *  * 
     */
    @JsonProperty("03106")
    @XmlEnumValue("03106")
    Sofortunfallversicherung("03106"),

    /**
     * <b>Luftfahrtunfallversicherung</b>
     *  * <p>
     *  *  Code: 03107
     *  * <p>
     *  * 
     */
    @JsonProperty("03107")
    @XmlEnumValue("03107")
    Luftfahrtunfallversicherung("03107"),

    /**
     * <b>Lebenslängliche Verkehrsmittelunfallversicherung</b>
     *  * <p>
     *  *  Code: 03108
     *  * <p>
     *  * 
     */
    @JsonProperty("03108")
    @XmlEnumValue("03108")
    Lebenslaengliche_Verkehrsmittelunfallversicherung("03108"),

    /**
     * <b>Sportbootinsassenunfallversicherung</b>
     *  * <p>
     *  *  Code: 03109
     *  * <p>
     *  * 
     */
    @JsonProperty("03109")
    @XmlEnumValue("03109")
    Sportbootinsassenunfallversicherung("03109"),

    /**
     * <b>Übrige und nicht aufgegliederte Einzelunfallversicherung</b>
     *  * <p>
     *  *  Code: 03199
     *  * <p>
     *  * 
     */
    @JsonProperty("03199")
    @XmlEnumValue("03199")
    Uebrige_und_nicht_aufgegliederte_Einzelunfallversicherung("03199"),

    /**
     * <b>Gruppen- Unfallversicherung ohne Beitragsrückgewähr</b>
     *  * <p>
     *  *  Code: 033
     *  * <p>
     *  * 
     */
    @JsonProperty("033")
    @XmlEnumValue("033")
    Gruppen_Unfallversicherung_ohne_Beitragsrueckgewaehr("033"),

    /**
     * <b>Gruppen- Unfallvollversicherung</b>
     *  * <p>
     *  *  Code: 0331
     *  * <p>
     *  * 
     */
    @JsonProperty("0331")
    @XmlEnumValue("0331")
    Gruppen_Unfallvollversicherung("0331"),

    /**
     * <b>Gruppen- Unfallteilversicherung</b>
     *  * <p>
     *  *  Code: 0333
     *  * <p>
     *  * 
     */
    @JsonProperty("0333")
    @XmlEnumValue("0333")
    Gruppen_Unfallteilversicherung("0333"),

    /**
     * <b>Probandenversicherung</b>
     *  * <p>
     *  *  Code: 034
     *  * <p>
     *  * 
     */
    @JsonProperty("034")
    @XmlEnumValue("034")
    Probandenversicherung("034"),

    /**
     * <b>Kraftfahrtunfallversicherung (einschließlich der namentlichen Kraftfahrtunfallversicherung)</b>
     *  * <p>
     *  *  Code: 035
     *  * <p>
     *  * 
     */
    @JsonProperty("035")
    @XmlEnumValue("035")
    Kraftfahrtunfallversicherung("035"),

    /**
     * <b>Unfallversicherung mit Beitragsrückgewähr</b>
     *  * <p>
     *  *  Code: 038
     *  * <p>
     *  * 
     */
    @JsonProperty("038")
    @XmlEnumValue("038")
    Unfallversicherung_mit_Beitragsrueckgewaehr("038"),

    /**
     * <b>Einzel- Unfallversicherung</b>
     *  * <p>
     *  *  Code: 0381
     *  * <p>
     *  * 
     */
    @JsonProperty("0381")
    @XmlEnumValue("0381")
    Einzel_Unfallversicherung("0381"),

    /**
     * <b>Gruppen- Unfallversicherung</b>
     *  * <p>
     *  *  Code: 0382
     *  * <p>
     *  * 
     */
    @JsonProperty("0382")
    @XmlEnumValue("0382")
    Gruppen_Unfallversicherung("0382"),

    /**
     * <b>Übrige und nicht aufgegliederte allgemeine Unfallversicherung</b>
     *  * <p>
     *  *  Code: 039
     *  * <p>
     *  * 
     */
    @JsonProperty("039")
    @XmlEnumValue("039")
    Uebrige_und_nicht_aufgegliederte_allgemeine_Unfallversicherung("039"),

    /**
     * <b>Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 04
     *  * <p>
     *  * 
     */
    @JsonProperty("04")
    @XmlEnumValue("04")
    Haftpflichtversicherung("04"),

    /**
     * <b>Privathaftpflichtversicherung (einschließlich Sportboot- und Hundehalterhaftpflichtversicherung)</b>
     *  * <p>
     *  *  Code: 041
     *  * <p>
     *  * 
     */
    @JsonProperty("041")
    @XmlEnumValue("041")
    Privathaftpflichtversicherung("041"),

    /**
     * <b>Betriebs- und Berufshaftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 042
     *  * <p>
     *  * 
     */
    @JsonProperty("042")
    @XmlEnumValue("042")
    Betriebs_und_Berufshaftpflichtversicherung("042"),

    /**
     * <b>Industrie- und Handelsbetriebe</b>
     *  * <p>
     *  *  Code: 0421
     *  * <p>
     *  * 
     */
    @JsonProperty("0421")
    @XmlEnumValue("0421")
    Industrie_und_Handelsbetriebe("0421"),

    /**
     * <b>Baugewerbe (einschließlich Architekten und Bauingeneure)</b>
     *  * <p>
     *  *  Code: 0422
     *  * <p>
     *  * 
     */
    @JsonProperty("0422")
    @XmlEnumValue("0422")
    Baugewerbe("0422"),

    /**
     * <b>Sonstige Betriebs- und Berufshaftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 0423
     *  * <p>
     *  * 
     */
    @JsonProperty("0423")
    @XmlEnumValue("0423")
    Sonstige_Betriebs_und_Berufshaftpflichtversicherung("0423"),

    /**
     * <b>Umwelt- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 043
     *  * <p>
     *  * 
     */
    @JsonProperty("043")
    @XmlEnumValue("043")
    Umwelt_Haftpflichtversicherung("043"),

    /**
     * <b>Gewässerschaden- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 0431
     *  * <p>
     *  * 
     */
    @JsonProperty("0431")
    @XmlEnumValue("0431")
    Gewaesserschaden_Haftpflichtversicherung("0431"),

    /**
     * <b>Umwelthaftpflicht- Modell</b>
     *  * <p>
     *  *  Code: 0432
     *  * <p>
     *  * 
     */
    @JsonProperty("0432")
    @XmlEnumValue("0432")
    Umwelthaftpflicht_Modell("0432"),

    /**
     * <b>Vermögensschaden- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 044
     *  * <p>
     *  * 
     */
    @JsonProperty("044")
    @XmlEnumValue("044")
    Vermoegensschaden_Haftpflichtversicherung("044"),

    /**
     * <b>Verkehrshaftungsversicherung (einschließlich der Speditions- und Rollfuhrversicherung)</b>
     *  * <p>
     *  *  Code: 045
     *  * <p>
     *  * 
     */
    @JsonProperty("045")
    @XmlEnumValue("045")
    Verkehrshaftungsversicherung("045"),

    /**
     * <b>Strahlen- und Atomanlagen- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 046
     *  * <p>
     *  * 
     */
    @JsonProperty("046")
    @XmlEnumValue("046")
    Strahlen_und_Atomanlagen_Haftpflichtversicherung("046"),

    /**
     * <b>Strahlen- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 0461
     *  * <p>
     *  * 
     */
    @JsonProperty("0461")
    @XmlEnumValue("0461")
    Strahlen_Haftpflichtversicherung("0461"),

    /**
     * <b>Atomanlagen- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 0462
     *  * <p>
     *  * 
     */
    @JsonProperty("0462")
    @XmlEnumValue("0462")
    Atomanlagen_Haftpflichtversicherung("0462"),

    /**
     * <b>Feuerhaftungsversicherung</b>
     *  * <p>
     *  *  Code: 047
     *  * <p>
     *  * 
     */
    @JsonProperty("047")
    @XmlEnumValue("047")
    Feuerhaftungsversicherung("047"),

    /**
     * <b>See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko) sowie Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge</b>
     *  * <p>
     *  *  Code: 048
     *  * <p>
     *  * 
     */
    @JsonProperty("048")
    @XmlEnumValue("048")
    See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung_sowie_Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge("048"),

    /**
     * <b>Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge mit eigenem Antrieb</b>
     *  * <p>
     *  *  Code: 0481
     *  * <p>
     *  * 
     */
    @JsonProperty("0481")
    @XmlEnumValue("0481")
    Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_mit_eigenem_Antrieb("0481"),

    /**
     * <b>Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge ohne eigenen Antrieb</b>
     *  * <p>
     *  *  Code: 0482
     *  * <p>
     *  * 
     */
    @JsonProperty("0482")
    @XmlEnumValue("0482")
    Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_ohne_eigenen_Antrieb("0482"),

    /**
     * <b>See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko)</b>
     *  * <p>
     *  *  Code: 0483
     *  * <p>
     *  * 
     */
    @JsonProperty("0483")
    @XmlEnumValue("0483")
    See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung("0483"),

    /**
     * <b>Übrige und nicht aufgegliederte Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 049
     *  * <p>
     *  * 
     */
    @JsonProperty("049")
    @XmlEnumValue("049")
    Uebrige_und_nicht_aufgegliederte_Haftpflichtversicherung("049"),

    /**
     * <b>Haus- und Grundbesitzerhaftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 04901
     *  * <p>
     *  * 
     */
    @JsonProperty("04901")
    @XmlEnumValue("04901")
    Haus_und_Grundbesitzerhaftpflichtversicherung("04901"),

    /**
     * <b>Kraftfahrzeug- Parkplatzversicherung</b>
     *  * <p>
     *  *  Code: 04902
     *  * <p>
     *  * 
     */
    @JsonProperty("04902")
    @XmlEnumValue("04902")
    Kraftfahrzeug_Parkplatzversicherung("04902"),

    /**
     * <b>Kühlgüterhaftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 04903
     *  * <p>
     *  * 
     */
    @JsonProperty("04903")
    @XmlEnumValue("04903")
    Kuehlgueterhaftpflichtversicherung("04903"),

    /**
     * <b>Sonstige Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 04999
     *  * <p>
     *  * 
     */
    @JsonProperty("04999")
    @XmlEnumValue("04999")
    Sonstige_Haftpflichtversicherung("04999"),

    /**
     * <b>Kraftfahrtversicherung</b>
     *  * <p>
     *  *  Code: 05
     *  * <p>
     *  * 
     */
    @JsonProperty("05")
    @XmlEnumValue("05")
    Kraftfahrtversicherung("05"),

    /**
     * <b>Kraftfahrzeug- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 051
     *  * <p>
     *  * 
     */
    @JsonProperty("051")
    @XmlEnumValue("051")
    Kraftfahrzeug_Haftpflichtversicherung("051"),

    /**
     * <b>Fahrzeugvollversicherung</b>
     *  * <p>
     *  *  Code: 052
     *  * <p>
     *  * 
     */
    @JsonProperty("052")
    @XmlEnumValue("052")
    Fahrzeugvollversicherung("052"),

    /**
     * <b>Fahrzeugteilversicherung</b>
     *  * <p>
     *  *  Code: 053
     *  * <p>
     *  * 
     */
    @JsonProperty("053")
    @XmlEnumValue("053")
    Fahrzeugteilversicherung("053"),

    /**
     * <b>Sonstige Kraftfahrtversicherung (05.2 und 05.3 insgesamt)</b>
     *  * <p>
     *  *  Code: 055
     *  * <p>
     *  * 
     */
    @JsonProperty("055")
    @XmlEnumValue("055")
    Sonstige_Kraftfahrtversicherung("055"),

    /**
     * <b>Übrige und nicht aufgegliederte Kraftfahrtversicherung</b>
     *  * <p>
     *  *  Code: 059
     *  * <p>
     *  * 
     */
    @JsonProperty("059")
    @XmlEnumValue("059")
    Uebrige_und_nicht_aufgegliederte_Kraftfahrtversicherung("059"),

    /**
     * <b>Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)</b>
     *  * <p>
     *  *  Code: 06
     *  * <p>
     *  * 
     */
    @JsonProperty("06")
    @XmlEnumValue("06")
    Luftfahrtversicherung("06"),

    /**
     * <b>Luftfahrzeug- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 063
     *  * <p>
     *  * 
     */
    @JsonProperty("063")
    @XmlEnumValue("063")
    Luftfahrzeug_Kaskoversicherung("063"),

    /**
     * <b>Raumfahrzeug- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 065
     *  * <p>
     *  * 
     */
    @JsonProperty("065")
    @XmlEnumValue("065")
    Raumfahrzeug_Kaskoversicherung("065"),

    /**
     * <b>Pre- Launch- Versicherung</b>
     *  * <p>
     *  *  Code: 0651
     *  * <p>
     *  * 
     */
    @JsonProperty("0651")
    @XmlEnumValue("0651")
    Pre_Launch_Versicherung("0651"),

    /**
     * <b>Launch- Versicherung</b>
     *  * <p>
     *  *  Code: 0652
     *  * <p>
     *  * 
     */
    @JsonProperty("0652")
    @XmlEnumValue("0652")
    Launch_Versicherung("0652"),

    /**
     * <b>In- Orbit- Versicherung</b>
     *  * <p>
     *  *  Code: 0653
     *  * <p>
     *  * 
     */
    @JsonProperty("0653")
    @XmlEnumValue("0653")
    In_Orbit_Versicherung("0653"),

    /**
     * <b>Übrige und nicht aufgegliederte Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)</b>
     *  * <p>
     *  *  Code: 069
     *  * <p>
     *  * 
     */
    @JsonProperty("069")
    @XmlEnumValue("069")
    Uebrige_und_nicht_aufgegliederte_Luftfahrtversicherung("069"),

    /**
     * <b>Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 07
     *  * <p>
     *  * 
     */
    @JsonProperty("07")
    @XmlEnumValue("07")
    Rechtsschutzversicherung("07"),

    /**
     * <b>Rechtsschutzversicherung nach ARB</b>
     *  * <p>
     *  *  Code: 071
     *  * <p>
     *  * 
     */
    @JsonProperty("071")
    @XmlEnumValue("071")
    Rechtsschutzversicherung_nach_ARB("071"),

    /**
     * <b>Verkehrs- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0711
     *  * <p>
     *  * 
     */
    @JsonProperty("0711")
    @XmlEnumValue("0711")
    Verkehrs_Rechtsschutzversicherung("0711"),

    /**
     * <b>Fahrzeug- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0712
     *  * <p>
     *  * 
     */
    @JsonProperty("0712")
    @XmlEnumValue("0712")
    Fahrzeug_Rechtsschutzversicherung("0712"),

    /**
     * <b>Fahrer- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0713
     *  * <p>
     *  * 
     */
    @JsonProperty("0713")
    @XmlEnumValue("0713")
    Fahrer_Rechtsschutzversicherung("0713"),

    /**
     * <b>Rechtsschutzversicherung für Gewerbetreibende und freiberuflich Tätige</b>
     *  * <p>
     *  *  Code: 0714
     *  * <p>
     *  * 
     */
    @JsonProperty("0714")
    @XmlEnumValue("0714")
    Rechtsschutzversicherung_fuer_Gewerbetreibende_und_freiberuflich_Taetige("0714"),

    /**
     * <b>Familien- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0715
     *  * <p>
     *  * 
     */
    @JsonProperty("0715")
    @XmlEnumValue("0715")
    Familien_Rechtsschutzversicherung("0715"),

    /**
     * <b>Familien- und Verkehrs- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0716
     *  * <p>
     *  * 
     */
    @JsonProperty("0716")
    @XmlEnumValue("0716")
    Familien_und_Verkehrs_Rechtsschutzversicherung("0716"),

    /**
     * <b>Landwirtschafts- und Verkehrs- Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 0717
     *  * <p>
     *  * 
     */
    @JsonProperty("0717")
    @XmlEnumValue("0717")
    Landwirtschafts_und_Verkehrs_Rechtsschutzversicherung("0717"),

    /**
     * <b>Rechtsschutzversicherung für Vereine</b>
     *  * <p>
     *  *  Code: 0718
     *  * <p>
     *  * 
     */
    @JsonProperty("0718")
    @XmlEnumValue("0718")
    Rechtsschutzversicherung_fuer_Vereine("0718"),

    /**
     * <b>Rechtsschutzversicherung für Grundstückseigentum und Miete</b>
     *  * <p>
     *  *  Code: 0719
     *  * <p>
     *  * 
     */
    @JsonProperty("0719")
    @XmlEnumValue("0719")
    Rechtsschutzversicherung_fuer_Grundstueckseigentum_und_Miete("0719"),

    /**
     * <b>Vermögensschaden-Rechtsschutzversicherungen für Aufsichtsräte, Beiräte, Vorstände (VRB)</b>
     *  * <p>
     *  *  Code: 072
     *  * <p>
     *  * 
     */
    @JsonProperty("072")
    @XmlEnumValue("072")
    Vermoegensschaden_Rechtsschutzversicherungen_fuer_Aufsichtsraete_Beiraete_Vorstaende("072"),

    /**
     * <b>Rechtsschutzversicherung für Träger öffentlicher Aufgaben (ÖRB)</b>
     *  * <p>
     *  *  Code: 073
     *  * <p>
     *  * 
     */
    @JsonProperty("073")
    @XmlEnumValue("073")
    Rechtsschutzversicherung_fuer_Traeger_oeffentlicher_Aufgaben("073"),

    /**
     * <b>Kraftfahrt- Strafrechtsschutzversicherung mit Auslands- Zivilrechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 075
     *  * <p>
     *  * 
     */
    @JsonProperty("075")
    @XmlEnumValue("075")
    Kraftfahrt_Strafrechtsschutzversicherung_mit_Auslands_Zivilrechtsschutzversicherung("075"),

    /**
     * <b>Spezial- Strafrechtsschutzversicherung der Unternehmen</b>
     *  * <p>
     *  *  Code: 076
     *  * <p>
     *  * 
     */
    @JsonProperty("076")
    @XmlEnumValue("076")
    Spezial_Strafrechtsschutzversicherung_der_Unternehmen("076"),

    /**
     * <b>Übrige und nicht aufgegliederte Rechtsschutzversicherung</b>
     *  * <p>
     *  *  Code: 079
     *  * <p>
     *  * 
     */
    @JsonProperty("079")
    @XmlEnumValue("079")
    Uebrige_und_nicht_aufgegliederte_Rechtsschutzversicherung("079"),

    /**
     * <b>Feuerversicherung</b>
     *  * <p>
     *  *  Code: 08
     *  * <p>
     *  * 
     */
    @JsonProperty("08")
    @XmlEnumValue("08")
    Feuerversicherung("08"),

    /**
     * <b>Feuer- Industrie- Versicherung</b>
     *  * <p>
     *  *  Code: 081
     *  * <p>
     *  * 
     */
    @JsonProperty("081")
    @XmlEnumValue("081")
    Feuer_Industrie_Versicherung("081"),

    /**
     * <b>Landwirtschaftliche Feuerversicherung</b>
     *  * <p>
     *  *  Code: 082
     *  * <p>
     *  * 
     */
    @JsonProperty("082")
    @XmlEnumValue("082")
    Landwirtschaftliche_Feuerversicherung("082"),

    /**
     * <b>Sonstige Feuerversicherung (einschließlich der Waldbrandversicherung)</b>
     *  * <p>
     *  *  Code: 083
     *  * <p>
     *  * 
     */
    @JsonProperty("083")
    @XmlEnumValue("083")
    Sonstige_Feuerversicherung("083"),

    /**
     * <b>Übrige und nicht aufgegliederte Feuerversicherung</b>
     *  * <p>
     *  *  Code: 089
     *  * <p>
     *  * 
     */
    @JsonProperty("089")
    @XmlEnumValue("089")
    Uebrige_und_nicht_aufgegliederte_Feuerversicherung("089"),

    /**
     * <b>Einbruchdiebstahl und Raub (ED)- Versicherung</b>
     *  * <p>
     *  *  Code: 09
     *  * <p>
     *  * 
     */
    @JsonProperty("09")
    @XmlEnumValue("09")
    Einbruchdiebstahl_und_Raub_Versicherung("09"),

    /**
     * <b>übrige und nicht aufgegliederte ED-Versicherung</b>
     *  * <p>
     *  *  Code: 099
     *  * <p>
     *  * 
     */
    @JsonProperty("099")
    @XmlEnumValue("099")
    uebrige_und_nicht_aufgegliederte_ED_Versicherung("099"),

    /**
     * <b>Leitungswasser (Lw)- Versicherung</b>
     *  * <p>
     *  *  Code: 10
     *  * <p>
     *  * 
     */
    @JsonProperty("10")
    @XmlEnumValue("10")
    Leitungswasser_Versicherung("10"),

    /**
     * <b>Übrige und nicht aufgegliederte Lw- Versicherung</b>
     *  * <p>
     *  *  Code: 109
     *  * <p>
     *  * 
     */
    @JsonProperty("109")
    @XmlEnumValue("109")
    Uebrige_und_nicht_aufgegliederte_Lw_Versicherung("109"),

    /**
     * <b>Glasversicherung</b>
     *  * <p>
     *  *  Code: 11
     *  * <p>
     *  * 
     */
    @JsonProperty("11")
    @XmlEnumValue("11")
    Glasversicherung("11"),

    /**
     * <b>Sturmversicherung</b>
     *  * <p>
     *  *  Code: 12
     *  * <p>
     *  * 
     */
    @JsonProperty("12")
    @XmlEnumValue("12")
    Sturmversicherung("12"),

    /**
     * <b>Sturmversicherung</b>
     *  * <p>
     *  *  Code: 121
     *  * <p>
     *  * 
     */
    @JsonProperty("121")
    @XmlEnumValue("121")
    Sturmversicherung_121("121"),

    /**
     * <b>Gärtnerei- Sturmversicherung</b>
     *  * <p>
     *  *  Code: 123
     *  * <p>
     *  * 
     */
    @JsonProperty("123")
    @XmlEnumValue("123")
    Gaertnerei_Sturmversicherung("123"),

    /**
     * <b>Versicherung weiterer Elementarschäden bei gewerblichen Risiken</b>
     *  * <p>
     *  *  Code: 124
     *  * <p>
     *  * 
     */
    @JsonProperty("124")
    @XmlEnumValue("124")
    Versicherung_weiterer_Elementarschaeden_bei_gewerblichen_Risiken("124"),

    /**
     * <b>Verbundene Hausratversicherung</b>
     *  * <p>
     *  *  Code: 13
     *  * <p>
     *  * 
     */
    @JsonProperty("13")
    @XmlEnumValue("13")
    Verbundene_Hausratversicherung("13"),

    /**
     * <b>Verbundene Hausratversicherung ohne Einschluss weiterer Elementarschäden</b>
     *  * <p>
     *  *  Code: 131
     *  * <p>
     *  * 
     */
    @JsonProperty("131")
    @XmlEnumValue("131")
    Verbundene_Hausratversicherung_ohne_Einschluss_weiterer_Elementarschaeden("131"),

    /**
     * <b>Verbundene Hausratversicherung unter Einschluss weiterer Elementarschäden</b>
     *  * <p>
     *  *  Code: 132
     *  * <p>
     *  * 
     */
    @JsonProperty("132")
    @XmlEnumValue("132")
    Verbundene_Hausratversicherung_unter_Einschluss_weiterer_Elementarschaeden("132"),

    /**
     * <b>Verbundene Wohngebäudeversicherung</b>
     *  * <p>
     *  *  Code: 14
     *  * <p>
     *  * 
     */
    @JsonProperty("14")
    @XmlEnumValue("14")
    Verbundene_Wohngebaeudeversicherung("14"),

    /**
     * <b>Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden</b>
     *  * <p>
     *  *  Code: 141
     *  * <p>
     *  * 
     */
    @JsonProperty("141")
    @XmlEnumValue("141")
    Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden("141"),

    /**
     * <b>Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden</b>
     *  * <p>
     *  *  Code: 142
     *  * <p>
     *  * 
     */
    @JsonProperty("142")
    @XmlEnumValue("142")
    Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden_142("142"),

    /**
     * <b>Hagelversicherung</b>
     *  * <p>
     *  *  Code: 15
     *  * <p>
     *  * 
     */
    @JsonProperty("15")
    @XmlEnumValue("15")
    Hagelversicherung("15"),

    /**
     * <b>Tierversicherung</b>
     *  * <p>
     *  *  Code: 16
     *  * <p>
     *  * 
     */
    @JsonProperty("16")
    @XmlEnumValue("16")
    Tierversicherung("16"),

    /**
     * <b>Langfristige Tierlebensversicherung</b>
     *  * <p>
     *  *  Code: 161
     *  * <p>
     *  * 
     */
    @JsonProperty("161")
    @XmlEnumValue("161")
    Langfristige_Tierlebensversicherung("161"),

    /**
     * <b>Pferdelebensversicherung</b>
     *  * <p>
     *  *  Code: 1611
     *  * <p>
     *  * 
     */
    @JsonProperty("1611")
    @XmlEnumValue("1611")
    Pferdelebensversicherung("1611"),

    /**
     * <b>Rindviehlebensversicherung</b>
     *  * <p>
     *  *  Code: 1612
     *  * <p>
     *  * 
     */
    @JsonProperty("1612")
    @XmlEnumValue("1612")
    Rindviehlebensversicherung("1612"),

    /**
     * <b>Schweinelebensversicherung</b>
     *  * <p>
     *  *  Code: 1613
     *  * <p>
     *  * 
     */
    @JsonProperty("1613")
    @XmlEnumValue("1613")
    Schweinelebensversicherung("1613"),

    /**
     * <b>Geflügellebensversicherung</b>
     *  * <p>
     *  *  Code: 1614
     *  * <p>
     *  * 
     */
    @JsonProperty("1614")
    @XmlEnumValue("1614")
    Gefluegellebensversicherung("1614"),

    /**
     * <b>Hundelebensversicherung</b>
     *  * <p>
     *  *  Code: 1616
     *  * <p>
     *  * 
     */
    @JsonProperty("1616")
    @XmlEnumValue("1616")
    Hundelebensversicherung("1616"),

    /**
     * <b>Übrige langfristige Tierlebensversicherung</b>
     *  * <p>
     *  *  Code: 1619
     *  * <p>
     *  * 
     */
    @JsonProperty("1619")
    @XmlEnumValue("1619")
    Uebrige_langfristige_Tierlebensversicherung("1619"),

    /**
     * <b>Kurzfristige Tierversicherung</b>
     *  * <p>
     *  *  Code: 162
     *  * <p>
     *  * 
     */
    @JsonProperty("162")
    @XmlEnumValue("162")
    Kurzfristige_Tierversicherung("162"),

    /**
     * <b>Trächtigkeits-, Leibesfrucht- und Fohlenversicherung</b>
     *  * <p>
     *  *  Code: 1621
     *  * <p>
     *  * 
     */
    @JsonProperty("1621")
    @XmlEnumValue("1621")
    Traechtigkeits_Leibesfrucht_und_Fohlenversicherung("1621"),

    /**
     * <b>Weidetierversicherung</b>
     *  * <p>
     *  *  Code: 1622
     *  * <p>
     *  * 
     */
    @JsonProperty("1622")
    @XmlEnumValue("1622")
    Weidetierversicherung("1622"),

    /**
     * <b>Mastviehversicherung</b>
     *  * <p>
     *  *  Code: 1623
     *  * <p>
     *  * 
     */
    @JsonProperty("1623")
    @XmlEnumValue("1623")
    Mastviehversicherung("1623"),

    /**
     * <b>Schlachttierversicherung (einschließlich Schlachtwertversicherung)</b>
     *  * <p>
     *  *  Code: 1624
     *  * <p>
     *  * 
     */
    @JsonProperty("1624")
    @XmlEnumValue("1624")
    Schlachttierversicherung("1624"),

    /**
     * <b>Operations-(Kastrations)-Versicherung</b>
     *  * <p>
     *  *  Code: 1625
     *  * <p>
     *  * 
     */
    @JsonProperty("1625")
    @XmlEnumValue("1625")
    Operations_Versicherung("1625"),

    /**
     * <b>Übrige kurzfristige Tierversicherung</b>
     *  * <p>
     *  *  Code: 1629
     *  * <p>
     *  * 
     */
    @JsonProperty("1629")
    @XmlEnumValue("1629")
    Uebrige_kurzfristige_Tierversicherung("1629"),

    /**
     * <b>Übrige und nicht aufgegliederte Tierversicherung</b>
     *  * <p>
     *  *  Code: 169
     *  * <p>
     *  * 
     */
    @JsonProperty("169")
    @XmlEnumValue("169")
    Uebrige_und_nicht_aufgegliederte_Tierversicherung("169"),

    /**
     * <b>Technische Versicherung</b>
     *  * <p>
     *  *  Code: 17
     *  * <p>
     *  * 
     */
    @JsonProperty("17")
    @XmlEnumValue("17")
    Technische_Versicherung("17"),

    /**
     * <b>Maschinenversicherung (einschließlich der Baugeräteversicherung)</b>
     *  * <p>
     *  *  Code: 171
     *  * <p>
     *  * 
     */
    @JsonProperty("171")
    @XmlEnumValue("171")
    Maschinenversicherung("171"),

    /**
     * <b>Elektronikversicherung</b>
     *  * <p>
     *  *  Code: 172
     *  * <p>
     *  * 
     */
    @JsonProperty("172")
    @XmlEnumValue("172")
    Elektronikversicherung("172"),

    /**
     * <b>Montageversicherung</b>
     *  * <p>
     *  *  Code: 174
     *  * <p>
     *  * 
     */
    @JsonProperty("174")
    @XmlEnumValue("174")
    Montageversicherung("174"),

    /**
     * <b>Haushaltsgeräteversicherung</b>
     *  * <p>
     *  *  Code: 175
     *  * <p>
     *  * 
     */
    @JsonProperty("175")
    @XmlEnumValue("175")
    Haushaltsgeraeteversicherung("175"),

    /**
     * <b>Bauleistungsversicherung</b>
     *  * <p>
     *  *  Code: 176
     *  * <p>
     *  * 
     */
    @JsonProperty("176")
    @XmlEnumValue("176")
    Bauleistungsversicherung("176"),

    /**
     * <b>Übrige technische Versicherungen</b>
     *  * <p>
     *  *  Code: 179
     *  * <p>
     *  * 
     */
    @JsonProperty("179")
    @XmlEnumValue("179")
    Uebrige_technische_Versicherungen("179"),

    /**
     * <b>Übrige technische Sachschadenversicherungen</b>
     *  * <p>
     *  *  Code: 1791
     *  * <p>
     *  * 
     */
    @JsonProperty("1791")
    @XmlEnumValue("1791")
    Uebrige_technische_Sachschadenversicherungen("1791"),

    /**
     * <b>Reparaturkostenversicherung von Kraftwagen</b>
     *  * <p>
     *  *  Code: 17911
     *  * <p>
     *  * 
     */
    @JsonProperty("17911")
    @XmlEnumValue("17911")
    Reparaturkostenversicherung_von_Kraftwagen("17911"),

    /**
     * <b>Reparaturkostenversicherung von Fernseh- und Videogeräten</b>
     *  * <p>
     *  *  Code: 17912
     *  * <p>
     *  * 
     */
    @JsonProperty("17912")
    @XmlEnumValue("17912")
    Reparaturkostenversicherung_von_Fernseh_und_Videogeraeten("17912"),

    /**
     * <b>Reparaturkostenversicherung von Haushaltsgeräten</b>
     *  * <p>
     *  *  Code: 17913
     *  * <p>
     *  * 
     */
    @JsonProperty("17913")
    @XmlEnumValue("17913")
    Reparaturkostenversicherung_von_Haushaltsgeraeten("17913"),

    /**
     * <b>Garantieverlängerungsversicherung von technischen Geräten</b>
     *  * <p>
     *  *  Code: 17914
     *  * <p>
     *  * 
     */
    @JsonProperty("17914")
    @XmlEnumValue("17914")
    Garantieverlaengerungsversicherung_von_technischen_Geraeten("17914"),

    /**
     * <b>Sonstige technische Versicherungen</b>
     *  * <p>
     *  *  Code: 1799
     *  * <p>
     *  * 
     */
    @JsonProperty("1799")
    @XmlEnumValue("1799")
    Sonstige_technische_Versicherungen("1799"),

    /**
     * <b>Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 18
     *  * <p>
     *  * 
     */
    @JsonProperty("18")
    @XmlEnumValue("18")
    Einheitsversicherung("18"),

    /**
     * <b>Allgemeine Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 181
     *  * <p>
     *  * 
     */
    @JsonProperty("181")
    @XmlEnumValue("181")
    Allgemeine_Einheitsversicherung("181"),

    /**
     * <b>Juwelierwaren- Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 182
     *  * <p>
     *  * 
     */
    @JsonProperty("182")
    @XmlEnumValue("182")
    Juwelierwaren_Einheitsversicherung("182"),

    /**
     * <b>Rauchwaren- Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 183
     *  * <p>
     *  * 
     */
    @JsonProperty("183")
    @XmlEnumValue("183")
    Rauchwaren_Einheitsversicherung("183"),

    /**
     * <b>Textilveredlung- Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 184
     *  * <p>
     *  * 
     */
    @JsonProperty("184")
    @XmlEnumValue("184")
    Textilveredlung_Einheitsversicherung("184"),

    /**
     * <b>Wäscheschutz- Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 185
     *  * <p>
     *  * 
     */
    @JsonProperty("185")
    @XmlEnumValue("185")
    Waescheschutz_Einheitsversicherung("185"),

    /**
     * <b>Übrige und nicht aufgegliederte Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 189
     *  * <p>
     *  * 
     */
    @JsonProperty("189")
    @XmlEnumValue("189")
    Uebrige_und_nicht_aufgegliederte_Einheitsversicherung("189"),

    /**
     * <b>Transportversicherung</b>
     *  * <p>
     *  *  Code: 19
     *  * <p>
     *  * 
     */
    @JsonProperty("19")
    @XmlEnumValue("19")
    Transportversicherung("19"),

    /**
     * <b>Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 191
     *  * <p>
     *  * 
     */
    @JsonProperty("191")
    @XmlEnumValue("191")
    Kaskoversicherung("191"),

    /**
     * <b>Seeschifffahrts- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1911
     *  * <p>
     *  * 
     */
    @JsonProperty("1911")
    @XmlEnumValue("1911")
    Seeschifffahrts_Kaskoversicherung("1911"),

    /**
     * <b>Binnensee- und Flussschifffahrts- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1912
     *  * <p>
     *  * 
     */
    @JsonProperty("1912")
    @XmlEnumValue("1912")
    Binnensee_und_Flussschifffahrts_Kaskoversicherung("1912"),

    /**
     * <b>Schienenfahrzeug- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1915
     *  * <p>
     *  * 
     */
    @JsonProperty("1915")
    @XmlEnumValue("1915")
    Schienenfahrzeug_Kaskoversicherung("1915"),

    /**
     * <b>Sportboot- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1916
     *  * <p>
     *  * 
     */
    @JsonProperty("1916")
    @XmlEnumValue("1916")
    Sportboot_Kaskoversicherung("1916"),

    /**
     * <b>Baurisikoversicherung</b>
     *  * <p>
     *  *  Code: 1917
     *  * <p>
     *  * 
     */
    @JsonProperty("1917")
    @XmlEnumValue("1917")
    Baurisikoversicherung("1917"),

    /**
     * <b>Übrige Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1919
     *  * <p>
     *  * 
     */
    @JsonProperty("1919")
    @XmlEnumValue("1919")
    Uebrige_Kaskoversicherung("1919"),

    /**
     * <b>Transportgüterversicherung</b>
     *  * <p>
     *  *  Code: 192
     *  * <p>
     *  * 
     */
    @JsonProperty("192")
    @XmlEnumValue("192")
    Transportgueterversicherung("192"),

    /**
     * <b>Transportgüterversicherung (ohne die Kennzahlen 19.2.3 bis 19.2.6)</b>
     *  * <p>
     *  *  Code: 1922
     *  * <p>
     *  * 
     */
    @JsonProperty("1922")
    @XmlEnumValue("1922")
    Transportgueterversicherung_1922("1922"),

    /**
     * <b>Reiselagerversicherung</b>
     *  * <p>
     *  *  Code: 1923
     *  * <p>
     *  * 
     */
    @JsonProperty("1923")
    @XmlEnumValue("1923")
    Reiselagerversicherung("1923"),

    /**
     * <b>Container- Kaskoversicherung</b>
     *  * <p>
     *  *  Code: 1925
     *  * <p>
     *  * 
     */
    @JsonProperty("1925")
    @XmlEnumValue("1925")
    Container_Kaskoversicherung("1925"),

    /**
     * <b>Tiertransportversicherung</b>
     *  * <p>
     *  *  Code: 1926
     *  * <p>
     *  * 
     */
    @JsonProperty("1926")
    @XmlEnumValue("1926")
    Tiertransportversicherung("1926"),

    /**
     * <b>Übrige Warenversicherung</b>
     *  * <p>
     *  *  Code: 1929
     *  * <p>
     *  * 
     */
    @JsonProperty("1929")
    @XmlEnumValue("1929")
    Uebrige_Warenversicherung("1929"),

    /**
     * <b>Valorenversicherung (gewerblich)</b>
     *  * <p>
     *  *  Code: 193
     *  * <p>
     *  * 
     */
    @JsonProperty("193")
    @XmlEnumValue("193")
    Valorenversicherung("193"),

    /**
     * <b>Filmversicherung (ohne die Kennzahl 29.2.01)</b>
     *  * <p>
     *  *  Code: 194
     *  * <p>
     *  * 
     */
    @JsonProperty("194")
    @XmlEnumValue("194")
    Filmversicherung("194"),

    /**
     * <b>Kriegsrisikoversicherung</b>
     *  * <p>
     *  *  Code: 197
     *  * <p>
     *  * 
     */
    @JsonProperty("197")
    @XmlEnumValue("197")
    Kriegsrisikoversicherung("197"),

    /**
     * <b>Übrige und nicht aufgegliederte Transportversicherung (einschließlich Versicherung von Offshore- Risiken)</b>
     *  * <p>
     *  *  Code: 199
     *  * <p>
     *  * 
     */
    @JsonProperty("199")
    @XmlEnumValue("199")
    Uebrige_und_nicht_aufgegliederte_Transportversicherung("199"),

    /**
     * <b>Kredit- und Kautionsversicherung</b>
     *  * <p>
     *  *  Code: 20
     *  * <p>
     *  * 
     */
    @JsonProperty("20")
    @XmlEnumValue("20")
    Kredit_und_Kautionsversicherung("20"),

    /**
     * <b>Kautionsversicherung (einschließlich Baugarantieversicherung)</b>
     *  * <p>
     *  *  Code: 201
     *  * <p>
     *  * 
     */
    @JsonProperty("201")
    @XmlEnumValue("201")
    Kautionsversicherung("201"),

    /**
     * <b>Delkrederversicherung</b>
     *  * <p>
     *  *  Code: 202
     *  * <p>
     *  * 
     */
    @JsonProperty("202")
    @XmlEnumValue("202")
    Delkrederversicherung("202"),

    /**
     * <b>Ausfuhrkreditversicherung</b>
     *  * <p>
     *  *  Code: 2021
     *  * <p>
     *  * 
     */
    @JsonProperty("2021")
    @XmlEnumValue("2021")
    Ausfuhrkreditversicherung("2021"),

    /**
     * <b>Warenkreditversicherung</b>
     *  * <p>
     *  *  Code: 2022
     *  * <p>
     *  * 
     */
    @JsonProperty("2022")
    @XmlEnumValue("2022")
    Warenkreditversicherung("2022"),

    /**
     * <b>Investitionsgüterkreditversicherung</b>
     *  * <p>
     *  *  Code: 2023
     *  * <p>
     *  * 
     */
    @JsonProperty("2023")
    @XmlEnumValue("2023")
    Investitionsgueterkreditversicherung("2023"),

    /**
     * <b>Konsumentenkreditversicherung</b>
     *  * <p>
     *  *  Code: 2024
     *  * <p>
     *  * 
     */
    @JsonProperty("2024")
    @XmlEnumValue("2024")
    Konsumentenkreditversicherung("2024"),

    /**
     * <b>Übrige und nicht aufgegliederte Delkrederversicherung</b>
     *  * <p>
     *  *  Code: 2029
     *  * <p>
     *  * 
     */
    @JsonProperty("2029")
    @XmlEnumValue("2029")
    Uebrige_und_nicht_aufgegliederte_Delkrederversicherung("2029"),

    /**
     * <b>Übrige und nicht aufgegliederte Kredit- und Kautionsversicherung</b>
     *  * <p>
     *  *  Code: 209
     *  * <p>
     *  * 
     */
    @JsonProperty("209")
    @XmlEnumValue("209")
    Uebrige_und_nicht_aufgegliederte_Kredit_und_Kautionsversicherung("209"),

    /**
     * <b>Versicherung zusätzlicher Gefahren zur Feuer- bzw. Feuer- Betriebsunterbrechungs- Versicherung (Extend Coverage (EC)- Versicherung)</b>
     *  * <p>
     *  *  Code: 21
     *  * <p>
     *  * 
     */
    @JsonProperty("21")
    @XmlEnumValue("21")
    Versicherung_zusaetzlicher_Gefahren_zur_Feuer_bzw_Feuer_Betriebsunterbrechungs_Versicherung_Versicherung("21"),

    /**
     * <b>Betriebsunterbrechungs- Versicherung</b>
     *  * <p>
     *  *  Code: 23
     *  * <p>
     *  * 
     */
    @JsonProperty("23")
    @XmlEnumValue("23")
    Betriebsunterbrechungs_Versicherung("23"),

    /**
     * <b>Feuer-(Groß) Betriebsunterbrechungs- Versicherung</b>
     *  * <p>
     *  *  Code: 231
     *  * <p>
     *  * 
     */
    @JsonProperty("231")
    @XmlEnumValue("231")
    Feuer_Betriebsunterbrechungs_Versicherung("231"),

    /**
     * <b>Technische- Betriebsunterbrechungs- Versicherung/ MBU Elektronik</b>
     *  * <p>
     *  *  Code: 232
     *  * <p>
     *  * 
     */
    @JsonProperty("232")
    @XmlEnumValue("232")
    Technische_Betriebsunterbrechungs_Versicherung_MBU_Elektronik("232"),

    /**
     * <b>Sonstige Betriebsunterbrechungsversicherungen</b>
     *  * <p>
     *  *  Code: 233
     *  * <p>
     *  * 
     */
    @JsonProperty("233")
    @XmlEnumValue("233")
    Sonstige_Betriebsunterbrechungsversicherungen("233"),

    /**
     * <b>Beistandsleistungsversicherung</b>
     *  * <p>
     *  *  Code: 24
     *  * <p>
     *  * 
     */
    @JsonProperty("24")
    @XmlEnumValue("24")
    Beistandsleistungsversicherung("24"),

    /**
     * <b>Schutzbriefversicherung</b>
     *  * <p>
     *  *  Code: 241
     *  * <p>
     *  * 
     */
    @JsonProperty("241")
    @XmlEnumValue("241")
    Schutzbriefversicherung("241"),

    /**
     * <b>Sportboot- Serviceversicherung</b>
     *  * <p>
     *  *  Code: 242
     *  * <p>
     *  * 
     */
    @JsonProperty("242")
    @XmlEnumValue("242")
    Sportboot_Serviceversicherung("242"),

    /**
     * <b>Flugrückholkostenversicherung</b>
     *  * <p>
     *  *  Code: 243
     *  * <p>
     *  * 
     */
    @JsonProperty("243")
    @XmlEnumValue("243")
    Flugrueckholkostenversicherung("243"),

    /**
     * <b>Schutzbriefversicherung unter Einschluss der sog. Mallorca- Police</b>
     *  * <p>
     *  *  Code: 244
     *  * <p>
     *  * 
     */
    @JsonProperty("244")
    @XmlEnumValue("244")
    Schutzbriefversicherung_unter_Einschluss_der_sog_Mallorca_Police("244"),

    /**
     * <b>Übrige und nicht aufgegliederte Beistandsleistungsversicherung</b>
     *  * <p>
     *  *  Code: 249
     *  * <p>
     *  * 
     */
    @JsonProperty("249")
    @XmlEnumValue("249")
    Uebrige_und_nicht_aufgegliederte_Beistandsleistungsversicherung("249"),

    /**
     * <b>Luft- und Raumfahrzeug- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 25
     *  * <p>
     *  * 
     */
    @JsonProperty("25")
    @XmlEnumValue("25")
    Luft_und_Raumfahrzeug_Haftpflichtversicherung("25"),

    /**
     * <b>Luftfahrt- Haftpflichtversicherung (einschließlich der Luftfrachtführer- Haftpflichtversicherung)</b>
     *  * <p>
     *  *  Code: 251
     *  * <p>
     *  * 
     */
    @JsonProperty("251")
    @XmlEnumValue("251")
    Luftfahrt_Haftpflichtversicherung("251"),

    /**
     * <b>Raumfahrzeug- Haftpflichtversicherung</b>
     *  * <p>
     *  *  Code: 252
     *  * <p>
     *  * 
     */
    @JsonProperty("252")
    @XmlEnumValue("252")
    Raumfahrzeug_Haftpflichtversicherung("252"),

    /**
     * <b>Sonstige Schadenversicherung, z.B. Maschinen- Garantie- Versicherung</b>
     *  * <p>
     *  *  Code: 29
     *  * <p>
     *  * 
     */
    @JsonProperty("29")
    @XmlEnumValue("29")
    Sonstige_Schadenversicherung_z_B_Maschinen_Garantie_Versicherung("29"),

    /**
     * <b>Sonstige Sachschadenversicherung</b>
     *  * <p>
     *  *  Code: 291
     *  * <p>
     *  * 
     */
    @JsonProperty("291")
    @XmlEnumValue("291")
    Sonstige_Sachschadenversicherung("291"),

    /**
     * <b>Schwamm- und Hausbockkäferversicherung</b>
     *  * <p>
     *  *  Code: 29101
     *  * <p>
     *  * 
     */
    @JsonProperty("29101")
    @XmlEnumValue("29101")
    Schwamm_und_Hausbockkaeferversicherung("29101"),

    /**
     * <b>Ausstellungsversicherung</b>
     *  * <p>
     *  *  Code: 29102
     *  * <p>
     *  * 
     */
    @JsonProperty("29102")
    @XmlEnumValue("29102")
    Ausstellungsversicherung("29102"),

    /**
     * <b>Fahrradversicherung</b>
     *  * <p>
     *  *  Code: 29103
     *  * <p>
     *  * 
     */
    @JsonProperty("29103")
    @XmlEnumValue("29103")
    Fahrradversicherung("29103"),

    /**
     * <b>Garderobenversicherung</b>
     *  * <p>
     *  *  Code: 29104
     *  * <p>
     *  * 
     */
    @JsonProperty("29104")
    @XmlEnumValue("29104")
    Garderobenversicherung("29104"),

    /**
     * <b>Jagd- und Sportwaffenversicherung</b>
     *  * <p>
     *  *  Code: 29105
     *  * <p>
     *  * 
     */
    @JsonProperty("29105")
    @XmlEnumValue("29105")
    Jagd_und_Sportwaffenversicherung("29105"),

    /**
     * <b>Musikinstrumenteversicherung</b>
     *  * <p>
     *  *  Code: 29106
     *  * <p>
     *  * 
     */
    @JsonProperty("29106")
    @XmlEnumValue("29106")
    Musikinstrumenteversicherung("29106"),

    /**
     * <b>Fotoapparateversicherung</b>
     *  * <p>
     *  *  Code: 29107
     *  * <p>
     *  * 
     */
    @JsonProperty("29107")
    @XmlEnumValue("29107")
    Fotoapparateversicherung("29107"),

    /**
     * <b>Kühlgüterversicherung</b>
     *  * <p>
     *  *  Code: 29108
     *  * <p>
     *  * 
     */
    @JsonProperty("29108")
    @XmlEnumValue("29108")
    Kuehlgueterversicherung("29108"),

    /**
     * <b>Warenversicherung in Tiefkühlanlagen</b>
     *  * <p>
     *  *  Code: 29109
     *  * <p>
     *  * 
     */
    @JsonProperty("29109")
    @XmlEnumValue("29109")
    Warenversicherung_in_Tiefkuehlanlagen("29109"),

    /**
     * <b>Atomanlagen- Sachversicherung</b>
     *  * <p>
     *  *  Code: 29110
     *  * <p>
     *  * 
     */
    @JsonProperty("29110")
    @XmlEnumValue("29110")
    Atomanlagen_Sachversicherung("29110"),

    /**
     * <b>Automatenversicherung</b>
     *  * <p>
     *  *  Code: 29111
     *  * <p>
     *  * 
     */
    @JsonProperty("29111")
    @XmlEnumValue("29111")
    Automatenversicherung("29111"),

    /**
     * <b>Reisegepäckversicherung</b>
     *  * <p>
     *  *  Code: 29112
     *  * <p>
     *  * 
     */
    @JsonProperty("29112")
    @XmlEnumValue("29112")
    Reisegepaeckversicherung("29112"),

    /**
     * <b>Kraftfahrtgepäckversicherung</b>
     *  * <p>
     *  *  Code: 29113
     *  * <p>
     *  * 
     */
    @JsonProperty("29113")
    @XmlEnumValue("29113")
    Kraftfahrtgepaeckversicherung("29113"),

    /**
     * <b>Valorenversicherung (privat)</b>
     *  * <p>
     *  *  Code: 29114
     *  * <p>
     *  * 
     */
    @JsonProperty("29114")
    @XmlEnumValue("29114")
    Valorenversicherung_29114("29114"),

    /**
     * <b>Freizeitsportgeräteversicherung (einschließlich der Skibruchversicherung)</b>
     *  * <p>
     *  *  Code: 29115
     *  * <p>
     *  * 
     */
    @JsonProperty("29115")
    @XmlEnumValue("29115")
    Freizeitsportgeraeteversicherung("29115"),

    /**
     * <b>Verderbschadenversicherung</b>
     *  * <p>
     *  *  Code: 29116
     *  * <p>
     *  * 
     */
    @JsonProperty("29116")
    @XmlEnumValue("29116")
    Verderbschadenversicherung("29116"),

    /**
     * <b>Gärtnereri- Verderbschadenversicherung</b>
     *  * <p>
     *  *  Code: 29117
     *  * <p>
     *  * 
     */
    @JsonProperty("29117")
    @XmlEnumValue("29117")
    Gaertnereri_Verderbschadenversicherung("29117"),

    /**
     * <b>Campingversicherung</b>
     *  * <p>
     *  *  Code: 29119
     *  * <p>
     *  * 
     */
    @JsonProperty("29119")
    @XmlEnumValue("29119")
    Campingversicherung("29119"),

    /**
     * <b>Versicherung von Kunstgegenständen</b>
     *  * <p>
     *  *  Code: 29120
     *  * <p>
     *  * 
     */
    @JsonProperty("29120")
    @XmlEnumValue("29120")
    Versicherung_von_Kunstgegenstaenden("29120"),

    /**
     * <b>Versicherung von Auktionen</b>
     *  * <p>
     *  *  Code: 29121
     *  * <p>
     *  * 
     */
    @JsonProperty("29121")
    @XmlEnumValue("29121")
    Versicherung_von_Auktionen("29121"),

    /**
     * <b>Brillenversicherung</b>
     *  * <p>
     *  *  Code: 29122
     *  * <p>
     *  * 
     */
    @JsonProperty("29122")
    @XmlEnumValue("29122")
    Brillenversicherung("29122"),

    /**
     * <b>Übrige und nicht aufgegliederte Sachschadenversicherung</b>
     *  * <p>
     *  *  Code: 29199
     *  * <p>
     *  * 
     */
    @JsonProperty("29199")
    @XmlEnumValue("29199")
    Uebrige_und_nicht_aufgegliederte_Sachschadenversicherung("29199"),

    /**
     * <b>Sonstige Vermögensschadenversicherung</b>
     *  * <p>
     *  *  Code: 293
     *  * <p>
     *  * 
     */
    @JsonProperty("293")
    @XmlEnumValue("293")
    Sonstige_Vermoegensschadenversicherung("293"),

    /**
     * <b>Boykott- und Streikversicherung</b>
     *  * <p>
     *  *  Code: 29301
     *  * <p>
     *  * 
     */
    @JsonProperty("29301")
    @XmlEnumValue("29301")
    Boykott_und_Streikversicherung("29301"),

    /**
     * <b>Reise-Rücktrittskostenversicherung</b>
     *  * <p>
     *  *  Code: 29302
     *  * <p>
     *  * 
     */
    @JsonProperty("29302")
    @XmlEnumValue("29302")
    Reise_Ruecktrittskostenversicherung("29302"),

    /**
     * <b>Lizenzverlustversicherung</b>
     *  * <p>
     *  *  Code: 29304
     *  * <p>
     *  * 
     */
    @JsonProperty("29304")
    @XmlEnumValue("29304")
    Lizenzverlustversicherung("29304"),

    /**
     * <b>Tierkrankenversicherung</b>
     *  * <p>
     *  *  Code: 29305
     *  * <p>
     *  * 
     */
    @JsonProperty("29305")
    @XmlEnumValue("29305")
    Tierkrankenversicherung("29305"),

    /**
     * <b>Maschinengarantieversicherung</b>
     *  * <p>
     *  *  Code: 29306
     *  * <p>
     *  * 
     */
    @JsonProperty("29306")
    @XmlEnumValue("29306")
    Maschinengarantieversicherung("29306"),

    /**
     * <b>Datenmissbrauchsversicherung</b>
     *  * <p>
     *  *  Code: 29307
     *  * <p>
     *  * 
     */
    @JsonProperty("29307")
    @XmlEnumValue("29307")
    Datenmissbrauchsversicherung("29307"),

    /**
     * <b>Scheckkartenversicherung von Scheckkarteninhabern</b>
     *  * <p>
     *  *  Code: 29308
     *  * <p>
     *  * 
     */
    @JsonProperty("29308")
    @XmlEnumValue("29308")
    Scheckkartenversicherung_von_Scheckkarteninhabern("29308"),

    /**
     * <b>Insolvenzversicherung</b>
     *  * <p>
     *  *  Code: 29310
     *  * <p>
     *  * 
     */
    @JsonProperty("29310")
    @XmlEnumValue("29310")
    Insolvenzversicherung("29310"),

    /**
     * <b>Schlüsselverlustsicherung</b>
     *  * <p>
     *  *  Code: 29311
     *  * <p>
     *  * 
     */
    @JsonProperty("29311")
    @XmlEnumValue("29311")
    Schluesselverlustsicherung("29311"),

    /**
     * <b>Garantieversicherung von Kraftfahrzeugen</b>
     *  * <p>
     *  *  Code: 29312
     *  * <p>
     *  * 
     */
    @JsonProperty("29312")
    @XmlEnumValue("29312")
    Garantieversicherung_von_Kraftfahrzeugen("29312"),

    /**
     * <b>Mietverlustversicherung</b>
     *  * <p>
     *  *  Code: 29313
     *  * <p>
     *  * 
     */
    @JsonProperty("29313")
    @XmlEnumValue("29313")
    Mietverlustversicherung("29313"),

    /**
     * <b>Raumfahrzeug-Vermögensschadenversicherung</b>
     *  * <p>
     *  *  Code: 29314
     *  * <p>
     *  * 
     */
    @JsonProperty("29314")
    @XmlEnumValue("29314")
    Raumfahrzeug_Vermoegensschadenversicherung("29314"),

    /**
     * <b>Milchgeldausfallversicherung</b>
     *  * <p>
     *  *  Code: 29315
     *  * <p>
     *  * 
     */
    @JsonProperty("29315")
    @XmlEnumValue("29315")
    Milchgeldausfallversicherung("29315"),

    /**
     * <b>Produktschutzversicherung</b>
     *  * <p>
     *  *  Code: 29316
     *  * <p>
     *  * 
     */
    @JsonProperty("29316")
    @XmlEnumValue("29316")
    Produktschutzversicherung("29316"),

    /**
     * <b>Übrige und nicht aufgegliederte Vermögensschadenversicherung</b>
     *  * <p>
     *  *  Code: 29399
     *  * <p>
     *  * 
     */
    @JsonProperty("29399")
    @XmlEnumValue("29399")
    Uebrige_und_nicht_aufgegliederte_Vermoegensschadenversicherung("29399"),

    /**
     * <b>Sonstige gemischte Versicherung</b>
     *  * <p>
     *  *  Code: 294
     *  * <p>
     *  * 
     */
    @JsonProperty("294")
    @XmlEnumValue("294")
    Sonstige_gemischte_Versicherung("294"),

    /**
     * <b>Tank- und Fassleckageversicherung</b>
     *  * <p>
     *  *  Code: 29402
     *  * <p>
     *  * 
     */
    @JsonProperty("29402")
    @XmlEnumValue("29402")
    Tank_und_Fassleckageversicherung("29402"),

    /**
     * <b>Filmtheater- Einheitsversicherung</b>
     *  * <p>
     *  *  Code: 29403
     *  * <p>
     *  * 
     */
    @JsonProperty("29403")
    @XmlEnumValue("29403")
    Filmtheater_Einheitsversicherung("29403"),

    /**
     * <b>Versicherung von Winzerbetrieben gegen Frostschäden</b>
     *  * <p>
     *  *  Code: 29404
     *  * <p>
     *  * 
     */
    @JsonProperty("29404")
    @XmlEnumValue("29404")
    Versicherung_von_Winzerbetrieben_gegen_Frostschaeden("29404"),

    /**
     * <b>Allgefahrenversicherung</b>
     *  * <p>
     *  *  Code: 29405
     *  * <p>
     *  * 
     */
    @JsonProperty("29405")
    @XmlEnumValue("29405")
    Allgefahrenversicherung("29405"),

    /**
     * <b>Inhaltsversicherung für Geschäfte und Betriebe</b>
     *  * <p>
     *  *  Code: 29406
     *  * <p>
     *  * 
     */
    @JsonProperty("29406")
    @XmlEnumValue("29406")
    Inhaltsversicherung_fuer_Geschaefte_und_Betriebe("29406"),

    /**
     * <b>Erweiterte Haushaltsversicherung</b>
     *  * <p>
     *  *  Code: 29407
     *  * <p>
     *  * 
     */
    @JsonProperty("29407")
    @XmlEnumValue("29407")
    Erweiterte_Haushaltsversicherung("29407"),

    /**
     * <b>Dynamische Sachversicherung</b>
     *  * <p>
     *  *  Code: 29408
     *  * <p>
     *  * 
     */
    @JsonProperty("29408")
    @XmlEnumValue("29408")
    Dynamische_Sachversicherung("29408"),

    /**
     * <b>Übrige und nicht aufgegliederte gemischte Versicherung</b>
     *  * <p>
     *  *  Code: 29499
     *  * <p>
     *  * 
     */
    @JsonProperty("29499")
    @XmlEnumValue("29499")
    Uebrige_und_nicht_aufgegliederte_gemischte_Versicherung("29499"),

    /**
     * <b>Vertrauensschadenversicherung</b>
     *  * <p>
     *  *  Code: 296
     *  * <p>
     *  * 
     */
    @JsonProperty("296")
    @XmlEnumValue("296")
    Vertrauensschadenversicherung("296"),

    /**
     * <b>Vertrauensschadenversicherung (ohne Kennzahlen 26.6.02 und 29.6.04)</b>
     *  * <p>
     *  *  Code: 29601
     *  * <p>
     *  * 
     */
    @JsonProperty("29601")
    @XmlEnumValue("29601")
    Vertrauensschadenversicherung_29601("29601"),

    /**
     * <b>Computermissbrauchsversicherung</b>
     *  * <p>
     *  *  Code: 29602
     *  * <p>
     *  * 
     */
    @JsonProperty("29602")
    @XmlEnumValue("29602")
    Computermissbrauchsversicherung("29602"),

    /**
     * <b>Versicherung gegen Veruntreuung von Selbstfahrervermieterfahrzeugen</b>
     *  * <p>
     *  *  Code: 29603
     *  * <p>
     *  * 
     */
    @JsonProperty("29603")
    @XmlEnumValue("29603")
    Versicherung_gegen_Veruntreuung_von_Selbstfahrervermieterfahrzeugen("29603"),

    /**
     * <b>Eigenschadenversicherung von Körperschaften und Anstalten des öffentlichen Rechts</b>
     *  * <p>
     *  *  Code: 29604
     *  * <p>
     *  * 
     */
    @JsonProperty("29604")
    @XmlEnumValue("29604")
    Eigenschadenversicherung_von_Koerperschaften_und_Anstalten_des_oeffentlichen_Rechts("29604"),

    /**
     * <b>Übrige und nicht aufgegliederte Vertrauensschadenversicherung</b>
     *  * <p>
     *  *  Code: 29699
     *  * <p>
     *  * 
     */
    @JsonProperty("29699")
    @XmlEnumValue("29699")
    Uebrige_und_nicht_aufgegliederte_Vertrauensschadenversicherung("29699"),

    /**
     * <b>Übrige und nicht aufgegliederte sonstige Schadenversicherungen</b>
     *  * <p>
     *  *  Code: 299
     *  * <p>
     *  * 
     */
    @JsonProperty("299")
    @XmlEnumValue("299")
    Uebrige_und_nicht_aufgegliederte_sonstige_Schadenversicherungen("299"),

    /**
     * <b>Schaden- und Unfallversicherungen insgesamt</b>
     *  * <p>
     *  *  Code: 300
     *  * <p>
     *  * 
     */
    @JsonProperty("300")
    @XmlEnumValue("300")
    Schaden_und_Unfallversicherungen_insgesamt("300");

    private final String value;
    VersicherungsTypCode(String value) { this.value = value; }
    private static final java.util.Map<String, VersicherungsTypCode> ALIASES = new java.util.HashMap<>();
    static {
        initAliases0();
        initAliases1();
    }

    private static void initAliases0() {
        ALIASES.put("Alle Sparten".toLowerCase(), Alle_Sparten);
        ALIASES.put("Lebensversicherung".toLowerCase(), Lebensversicherung);
        ALIASES.put("Einzelversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.".toLowerCase(), Einzelversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird);
        ALIASES.put("Kapitalbildende Lebensversicherung (einschließlich vermögensbildender Lebensversicherung) mit überwiegendem Todesfallcharakter".toLowerCase(), Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Todesfallcharakter);
        ALIASES.put("Risikoversicherung".toLowerCase(), Risikoversicherung);
        ALIASES.put("Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter".toLowerCase(), Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter);
        ALIASES.put("Berufsunfähigkeitsversicherung".toLowerCase(), Berufsunfaehigkeitsversicherung);
        ALIASES.put("Pflegerentenversicherung".toLowerCase(), Pflegerentenversicherung);
        ALIASES.put("übrige und nicht aufgegliederte Einzelversicherung (einschließlich der Heirats- und Geburtenversicherung, aber ohne sonstige Lebensversicherung".toLowerCase(), uebrige_und_nicht_aufgegliederte_Einzelversicherung_einschliesslich_der_Heirats_und_Geburtenversicherung_aber_ohne_sonstige_Lebensversicherung);
        ALIASES.put("Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG".toLowerCase(), Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG);
        ALIASES.put("Kollektivversicherung (ohne Zusatzversicherung) mit Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird.".toLowerCase(), Kollektivversicherung_mit_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird);
        ALIASES.put("Kapitalversicherung mit überwiegendem Todesfallcharakter (ohne Kennzahlen 01.2.2 und 01.2.3)".toLowerCase(), Kapitalversicherung_mit_ueberwiegendem_Todesfallcharakter);
        ALIASES.put("Bausparrisikoversicherung".toLowerCase(), Bausparrisikoversicherung);
        ALIASES.put("Restschuldversicherung".toLowerCase(), Restschuldversicherung);
        ALIASES.put("übrige und nicht aufgegliederte Kollektivversicherung (einschließlich der Heirats- und Geburtenversicherung), aber ohne sonstige Lebensversicherung".toLowerCase(), uebrige_und_nicht_aufgegliederte_Kollektivversicherung_aber_ohne_sonstige_Lebensversicherung);
        ALIASES.put("Kapitalbildende Lebensversicherung mit überwiegendem Erlebensfallcharakter nach dem AltZertG".toLowerCase(), Kapitalbildende_Lebensversicherung_mit_ueberwiegendem_Erlebensfallcharakter_nach_dem_AltZertG_0125);
        ALIASES.put("Zusatzversicherung (einschließlich der, für Kollektivversicherungen)".toLowerCase(), Zusatzversicherung);
        ALIASES.put("Unfall- Zusatzversicherung".toLowerCase(), Unfall_Zusatzversicherung);
        ALIASES.put("Berufsunfähigkeits(Invaliditäts)-Zusatzversicherung".toLowerCase(), Berufsunfaehigkeits_Zusatzversicherung);
        ALIASES.put("Risiko- und Zeitrenten- Zusatzversicherung".toLowerCase(), Risiko_und_Zeitrenten_Zusatzversicherung);
        ALIASES.put("Pflegerenten- Zusatzversicherung".toLowerCase(), Pflegerenten_Zusatzversicherung);
        ALIASES.put("Sonstige Zusatzversicherung".toLowerCase(), Sonstige_Zusatzversicherung);
        ALIASES.put("Sonstige Lebensversicherung".toLowerCase(), Sonstige_Lebensversicherung);
        ALIASES.put("Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird".toLowerCase(), Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird);
        ALIASES.put("Lebensversicherung ohne Überschussbeteiligung, bei der das Anlagerisiko vom Versicherungsunternehmen getragen wird".toLowerCase(), Lebensversicherung_ohne_Ueberschussbeteiligung_bei_der_das_Anlagerisiko_vom_Versicherungsunternehmen_getragen_wird);
        ALIASES.put("Tontinengeschäfte".toLowerCase(), Tontinengeschaefte);
        ALIASES.put("Kapitalisierungsgeschäfte".toLowerCase(), Kapitalisierungsgeschaefte);
        ALIASES.put("Lebensversicherung, bei der das Anlagerisiko vom Versicherungsnehmer getragen wird, nach dem AltZertG".toLowerCase(), Lebensversicherung_bei_der_das_Anlagerisiko_vom_Versicherungsnehmer_getragen_wird_nach_dem_AltZertG);
        ALIASES.put("Geschäfte der Verwaltung von Versorgungseinrichtungen".toLowerCase(), Geschaefte_der_Verwaltung_von_Versorgungseinrichtungen);
        ALIASES.put("Krankenversicherung".toLowerCase(), Krankenversicherung);
        ALIASES.put("Einzel- Krankheitskostenvollversicherung (ambulant und stationär)".toLowerCase(), Einzel_Krankheitskostenvollversicherung);
        ALIASES.put("Einzel- Krankheitskostenvollversicherung".toLowerCase(), Einzel_Krankheitskostenvollversicherung_0211);
        ALIASES.put("Einzel- Krankheitskostenvollversicherung (ambulant und stationär), nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Einzel_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Einzel- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadensversicherung".toLowerCase(), Einzel_Krankheitskostenvollversicherung_nach_Art_der_Schadensversicherung);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (ambulant)".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (ambulant) substitutiv".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (stationär)".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_023);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (stationär) substitutiv".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_substitutiv_0231);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0232);
        ALIASES.put("Selbstständige Einzel- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Einzel_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0233);
        ALIASES.put("Einzel- Krankentagegeldversicherung".toLowerCase(), Einzel_Krankentagegeldversicherung);
        ALIASES.put("Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) substitutiv".toLowerCase(), Krankentagegeldversicherung_substitutiv);
        ALIASES.put("Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Krankentagegeldversicherung (ohne Kennzahlen 02.4.4 und 02.4.5) nach Art der Schadenversicherung".toLowerCase(), Krankentagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Lohnfortzahlungsversicherung".toLowerCase(), Lohnfortzahlungsversicherung);
        ALIASES.put("Restschuldversicherung".toLowerCase(), Restschuldversicherung_0245);
        ALIASES.put("Selbstständige Einzel- Krankenhaustagegeldversicherung".toLowerCase(), Selbststaendige_Einzel_Krankenhaustagegeldversicherung);
        ALIASES.put("Selbstständige Einzel- Krankenhaustagegeldversicherung substitutiv".toLowerCase(), Selbststaendige_Einzel_Krankenhaustagegeldversicherung_substitutiv);
        ALIASES.put("Selbstständige Einzel- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Selbstständige Einzel- Krankenhaustagegeldversicherung nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Einzel_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Sonstige selbstständige Einzel- Teilversicherung".toLowerCase(), Sonstige_selbststaendige_Einzel_Teilversicherung);
        ALIASES.put("Selbstständige Zahnbehandlungsversicherung substitutiv".toLowerCase(), Selbststaendige_Zahnbehandlungsversicherung_substitutiv);
        ALIASES.put("Selbstständige Zahnbehandlungsversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Zahnbehandlungsversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Selbstständige Zahnbehandlungsversicherung nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Zahnbehandlungsversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) substitutiv".toLowerCase(), Kurkostenversicherung_substitutiv);
        ALIASES.put("Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Kurkostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Kurkostenversicherung (einschließlich der Kurtagegeldversicherung) nach Art der Schadenversicherung".toLowerCase(), Kurkostenversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Reisekrankenversicherung (gegen festes Entgelt)".toLowerCase(), Reisekrankenversicherung);
        ALIASES.put("Sonstige Teilversicherung substitutiv".toLowerCase(), Sonstige_Teilversicherung_substitutiv);
        ALIASES.put("Sonstige Teilversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Sonstige_Teilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Sonstige Teilversicherung nach Art der Schadenversicherung".toLowerCase(), Sonstige_Teilversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Gruppen- Krankenversicherung (nach Einzel- und Sondertarifen)".toLowerCase(), Gruppen_Krankenversicherung);
        ALIASES.put("Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) substitutiv".toLowerCase(), Gruppen_Krankheitskostenvollversicherung_substitutiv);
        ALIASES.put("Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Gruppen_Krankheitskostenvollversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Gruppen- Krankheitskostenvollversicherung (ambulant und stationär) nach Art der Schadenversicherung".toLowerCase(), Gruppen_Krankheitskostenvollversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) substitutiv".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (ambulant) nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (stationär) substitutiv".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_substitutiv_0277);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung_0278);
        ALIASES.put("Selbstständige Gruppen- Krankheitskostenversicherung (stationär) nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankheitskostenversicherung_nach_Art_der_Schadenversicherung_0279);
        ALIASES.put("Gruppen- Krankentagegeldversicherung substitutiv".toLowerCase(), Gruppen_Krankentagegeldversicherung_substitutiv);
        ALIASES.put("Gruppen- Krankentagegeldversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Gruppen_Krankentagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Gruppen- Krankentagegeldversicherung nach Art der Schadenversicherung".toLowerCase(), Gruppen_Krankentagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Selbstständige Gruppen- Krankenhaustagegeldversicherung substitutiv".toLowerCase(), Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_substitutiv);
        ALIASES.put("Selbstständige Gruppen- Krankenhaustagegeldversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Selbstständige Gruppen- Krankenhaustagegeldversicherung nach Art der Schadenversicherung".toLowerCase(), Selbststaendige_Gruppen_Krankenhaustagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Sonstige selbstständige Gruppenteilversicherung substitutiv".toLowerCase(), Sonstige_selbststaendige_Gruppenteilversicherung_substitutiv);
        ALIASES.put("Sonstige selbstständige Gruppenteilversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Sonstige_selbststaendige_Gruppenteilversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Sonstige selbstständige Gruppenteilversicherung nach Art der Schadenversicherung".toLowerCase(), Sonstige_selbststaendige_Gruppenteilversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Gruppen- Pflegepflichtversicherung".toLowerCase(), Gruppen_Pflegepflichtversicherung);
        ALIASES.put("Freiwillige Gruppen- Pflegekostenversicherung substitutiv".toLowerCase(), Freiwillige_Gruppen_Pflegekostenversicherung_substitutiv);
        ALIASES.put("Freiwillige Gruppen- Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Freiwillige_Gruppen_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Freiwillige Gruppen- Pflegekostenversicherung nach Art der Schadenversicherung".toLowerCase(), Freiwillige_Gruppen_Pflegekostenversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Freiwillige Gruppen- Pflegetagegeldversicherung substitutiv".toLowerCase(), Freiwillige_Gruppen_Pflegetagegeldversicherung_substitutiv);
        ALIASES.put("Freiwillige Gruppen- Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Freiwillige_Gruppen_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Freiwillige Gruppen- Pflegetagegeldversicherung nach Art der Schadenversicherung".toLowerCase(), Freiwillige_Gruppen_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Pflegekrankenversicherung".toLowerCase(), Pflegekrankenversicherung);
        ALIASES.put("Pflegepflichtversicherung".toLowerCase(), Pflegepflichtversicherung);
        ALIASES.put("Freiwillige Pflegekostenversicherung substitutiv".toLowerCase(), Freiwillige_Pflegekostenversicherung_substitutiv);
        ALIASES.put("Freiwillige Pflegekostenversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Freiwillige_Pflegekostenversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Freiwillige Pflegekostenversicherung nach Art der Schadenversicherung".toLowerCase(), Freiwillige_Pflegekostenversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Freiwillige Pflegetagegeldversicherung substitutiv".toLowerCase(), Freiwillige_Pflegetagegeldversicherung_substitutiv);
        ALIASES.put("Freiwillige Pflegetagegeldversicherung nicht substitutiv nach Art der Lebensversicherung".toLowerCase(), Freiwillige_Pflegetagegeldversicherung_nicht_substitutiv_nach_Art_der_Lebensversicherung);
        ALIASES.put("Freiwillige Pflegetagegeldversicherung nach Art der Schadenversicherung".toLowerCase(), Freiwillige_Pflegetagegeldversicherung_nach_Art_der_Schadenversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Krankenversicherung (einschließlich der Beihilfeablöseversicherung)".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Krankenversicherung);
        ALIASES.put("Allgemeine Unfallversicherung".toLowerCase(), Allgemeine_Unfallversicherung);
        ALIASES.put("Einzelunfallversicherung ohne Beitragsrückgewähr".toLowerCase(), Einzelunfallversicherung_ohne_Beitragsrueckgewaehr);
        ALIASES.put("Unfallvollversicherung (ohne Kennzahlen 03.1.02 und 03.1.03)".toLowerCase(), Unfallvollversicherung);
        ALIASES.put("Volks- Unfallvollversicherung".toLowerCase(), Volks_Unfallvollversicherung);
        ALIASES.put("Unfallvollversicherung aus der FUSt- Versicherung".toLowerCase(), Unfallvollversicherung_aus_der_FUSt_Versicherung);
        ALIASES.put("Versicherung gegen außerberufliche Unfälle".toLowerCase(), Versicherung_gegen_ausserberufliche_Unfaelle);
        ALIASES.put("Reiseunfallversicherung".toLowerCase(), Reiseunfallversicherung);
        ALIASES.put("Sofortunfallversicherung".toLowerCase(), Sofortunfallversicherung);
        ALIASES.put("Luftfahrtunfallversicherung".toLowerCase(), Luftfahrtunfallversicherung);
        ALIASES.put("Lebenslängliche Verkehrsmittelunfallversicherung".toLowerCase(), Lebenslaengliche_Verkehrsmittelunfallversicherung);
        ALIASES.put("Sportbootinsassenunfallversicherung".toLowerCase(), Sportbootinsassenunfallversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Einzelunfallversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Einzelunfallversicherung);
        ALIASES.put("Gruppen- Unfallversicherung ohne Beitragsrückgewähr".toLowerCase(), Gruppen_Unfallversicherung_ohne_Beitragsrueckgewaehr);
        ALIASES.put("Gruppen- Unfallvollversicherung".toLowerCase(), Gruppen_Unfallvollversicherung);
        ALIASES.put("Gruppen- Unfallteilversicherung".toLowerCase(), Gruppen_Unfallteilversicherung);
        ALIASES.put("Probandenversicherung".toLowerCase(), Probandenversicherung);
        ALIASES.put("Kraftfahrtunfallversicherung (einschließlich der namentlichen Kraftfahrtunfallversicherung)".toLowerCase(), Kraftfahrtunfallversicherung);
        ALIASES.put("Unfallversicherung mit Beitragsrückgewähr".toLowerCase(), Unfallversicherung_mit_Beitragsrueckgewaehr);
        ALIASES.put("Einzel- Unfallversicherung".toLowerCase(), Einzel_Unfallversicherung);
        ALIASES.put("Gruppen- Unfallversicherung".toLowerCase(), Gruppen_Unfallversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte allgemeine Unfallversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_allgemeine_Unfallversicherung);
        ALIASES.put("Haftpflichtversicherung".toLowerCase(), Haftpflichtversicherung);
        ALIASES.put("Privathaftpflichtversicherung (einschließlich Sportboot- und Hundehalterhaftpflichtversicherung)".toLowerCase(), Privathaftpflichtversicherung);
        ALIASES.put("Betriebs- und Berufshaftpflichtversicherung".toLowerCase(), Betriebs_und_Berufshaftpflichtversicherung);
        ALIASES.put("Industrie- und Handelsbetriebe".toLowerCase(), Industrie_und_Handelsbetriebe);
        ALIASES.put("Baugewerbe (einschließlich Architekten und Bauingeneure)".toLowerCase(), Baugewerbe);
        ALIASES.put("Sonstige Betriebs- und Berufshaftpflichtversicherung".toLowerCase(), Sonstige_Betriebs_und_Berufshaftpflichtversicherung);
        ALIASES.put("Umwelt- Haftpflichtversicherung".toLowerCase(), Umwelt_Haftpflichtversicherung);
        ALIASES.put("Gewässerschaden- Haftpflichtversicherung".toLowerCase(), Gewaesserschaden_Haftpflichtversicherung);
        ALIASES.put("Umwelthaftpflicht- Modell".toLowerCase(), Umwelthaftpflicht_Modell);
        ALIASES.put("Vermögensschaden- Haftpflichtversicherung".toLowerCase(), Vermoegensschaden_Haftpflichtversicherung);
        ALIASES.put("Verkehrshaftungsversicherung (einschließlich der Speditions- und Rollfuhrversicherung)".toLowerCase(), Verkehrshaftungsversicherung);
        ALIASES.put("Strahlen- und Atomanlagen- Haftpflichtversicherung".toLowerCase(), Strahlen_und_Atomanlagen_Haftpflichtversicherung);
        ALIASES.put("Strahlen- Haftpflichtversicherung".toLowerCase(), Strahlen_Haftpflichtversicherung);
        ALIASES.put("Atomanlagen- Haftpflichtversicherung".toLowerCase(), Atomanlagen_Haftpflichtversicherung);
        ALIASES.put("Feuerhaftungsversicherung".toLowerCase(), Feuerhaftungsversicherung);
        ALIASES.put("See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko) sowie Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge".toLowerCase(), See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung_sowie_Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge);
        ALIASES.put("Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge mit eigenem Antrieb".toLowerCase(), Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_mit_eigenem_Antrieb);
        ALIASES.put("Haftpflichtversicherung für nichtversicherungspflichtige Landfahrzeuge ohne eigenen Antrieb".toLowerCase(), Haftpflichtversicherung_fuer_nichtversicherungspflichtige_Landfahrzeuge_ohne_eigenen_Antrieb);
        ALIASES.put("See-, Binnensee- und Flussschifffahrtshaftpflichtversicherung (ohne Kollisionshaftpflichtrisiko)".toLowerCase(), See_Binnensee_und_Flussschifffahrtshaftpflichtversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Haftpflichtversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Haftpflichtversicherung);
        ALIASES.put("Haus- und Grundbesitzerhaftpflichtversicherung".toLowerCase(), Haus_und_Grundbesitzerhaftpflichtversicherung);
        ALIASES.put("Kraftfahrzeug- Parkplatzversicherung".toLowerCase(), Kraftfahrzeug_Parkplatzversicherung);
        ALIASES.put("Kühlgüterhaftpflichtversicherung".toLowerCase(), Kuehlgueterhaftpflichtversicherung);
        ALIASES.put("Sonstige Haftpflichtversicherung".toLowerCase(), Sonstige_Haftpflichtversicherung);
        ALIASES.put("Kraftfahrtversicherung".toLowerCase(), Kraftfahrtversicherung);
        ALIASES.put("Kraftfahrzeug- Haftpflichtversicherung".toLowerCase(), Kraftfahrzeug_Haftpflichtversicherung);
        ALIASES.put("Fahrzeugvollversicherung".toLowerCase(), Fahrzeugvollversicherung);
        ALIASES.put("Fahrzeugteilversicherung".toLowerCase(), Fahrzeugteilversicherung);
        ALIASES.put("Sonstige Kraftfahrtversicherung (05.2 und 05.3 insgesamt)".toLowerCase(), Sonstige_Kraftfahrtversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Kraftfahrtversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Kraftfahrtversicherung);
        ALIASES.put("Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)".toLowerCase(), Luftfahrtversicherung);
        ALIASES.put("Luftfahrzeug- Kaskoversicherung".toLowerCase(), Luftfahrzeug_Kaskoversicherung);
        ALIASES.put("Raumfahrzeug- Kaskoversicherung".toLowerCase(), Raumfahrzeug_Kaskoversicherung);
        ALIASES.put("Pre- Launch- Versicherung".toLowerCase(), Pre_Launch_Versicherung);
        ALIASES.put("Launch- Versicherung".toLowerCase(), Launch_Versicherung);
        ALIASES.put("In- Orbit- Versicherung".toLowerCase(), In_Orbit_Versicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Luftfahrtversicherung (einschließlich der Raumfahrtversicherung)".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Luftfahrtversicherung);
        ALIASES.put("Rechtsschutzversicherung".toLowerCase(), Rechtsschutzversicherung);
        ALIASES.put("Rechtsschutzversicherung nach ARB".toLowerCase(), Rechtsschutzversicherung_nach_ARB);
        ALIASES.put("Verkehrs- Rechtsschutzversicherung".toLowerCase(), Verkehrs_Rechtsschutzversicherung);
        ALIASES.put("Fahrzeug- Rechtsschutzversicherung".toLowerCase(), Fahrzeug_Rechtsschutzversicherung);
        ALIASES.put("Fahrer- Rechtsschutzversicherung".toLowerCase(), Fahrer_Rechtsschutzversicherung);
        ALIASES.put("Rechtsschutzversicherung für Gewerbetreibende und freiberuflich Tätige".toLowerCase(), Rechtsschutzversicherung_fuer_Gewerbetreibende_und_freiberuflich_Taetige);
        ALIASES.put("Familien- Rechtsschutzversicherung".toLowerCase(), Familien_Rechtsschutzversicherung);
        ALIASES.put("Familien- und Verkehrs- Rechtsschutzversicherung".toLowerCase(), Familien_und_Verkehrs_Rechtsschutzversicherung);
        ALIASES.put("Landwirtschafts- und Verkehrs- Rechtsschutzversicherung".toLowerCase(), Landwirtschafts_und_Verkehrs_Rechtsschutzversicherung);
        ALIASES.put("Rechtsschutzversicherung für Vereine".toLowerCase(), Rechtsschutzversicherung_fuer_Vereine);
        ALIASES.put("Rechtsschutzversicherung für Grundstückseigentum und Miete".toLowerCase(), Rechtsschutzversicherung_fuer_Grundstueckseigentum_und_Miete);
        ALIASES.put("Vermögensschaden-Rechtsschutzversicherungen für Aufsichtsräte, Beiräte, Vorstände (VRB)".toLowerCase(), Vermoegensschaden_Rechtsschutzversicherungen_fuer_Aufsichtsraete_Beiraete_Vorstaende);
        ALIASES.put("Rechtsschutzversicherung für Träger öffentlicher Aufgaben (ÖRB)".toLowerCase(), Rechtsschutzversicherung_fuer_Traeger_oeffentlicher_Aufgaben);
        ALIASES.put("Kraftfahrt- Strafrechtsschutzversicherung mit Auslands- Zivilrechtsschutzversicherung".toLowerCase(), Kraftfahrt_Strafrechtsschutzversicherung_mit_Auslands_Zivilrechtsschutzversicherung);
        ALIASES.put("Spezial- Strafrechtsschutzversicherung der Unternehmen".toLowerCase(), Spezial_Strafrechtsschutzversicherung_der_Unternehmen);
        ALIASES.put("Übrige und nicht aufgegliederte Rechtsschutzversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Rechtsschutzversicherung);
        ALIASES.put("Feuerversicherung".toLowerCase(), Feuerversicherung);
        ALIASES.put("Feuer- Industrie- Versicherung".toLowerCase(), Feuer_Industrie_Versicherung);
        ALIASES.put("Landwirtschaftliche Feuerversicherung".toLowerCase(), Landwirtschaftliche_Feuerversicherung);
        ALIASES.put("Sonstige Feuerversicherung (einschließlich der Waldbrandversicherung)".toLowerCase(), Sonstige_Feuerversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Feuerversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Feuerversicherung);
        ALIASES.put("Einbruchdiebstahl und Raub (ED)- Versicherung".toLowerCase(), Einbruchdiebstahl_und_Raub_Versicherung);
        ALIASES.put("übrige und nicht aufgegliederte ED-Versicherung".toLowerCase(), uebrige_und_nicht_aufgegliederte_ED_Versicherung);
        ALIASES.put("Leitungswasser (Lw)- Versicherung".toLowerCase(), Leitungswasser_Versicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Lw- Versicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Lw_Versicherung);
        ALIASES.put("Glasversicherung".toLowerCase(), Glasversicherung);
        ALIASES.put("Sturmversicherung".toLowerCase(), Sturmversicherung);
        ALIASES.put("Sturmversicherung".toLowerCase(), Sturmversicherung_121);
        ALIASES.put("Gärtnerei- Sturmversicherung".toLowerCase(), Gaertnerei_Sturmversicherung);
        ALIASES.put("Versicherung weiterer Elementarschäden bei gewerblichen Risiken".toLowerCase(), Versicherung_weiterer_Elementarschaeden_bei_gewerblichen_Risiken);
        ALIASES.put("Verbundene Hausratversicherung".toLowerCase(), Verbundene_Hausratversicherung);
        ALIASES.put("Verbundene Hausratversicherung ohne Einschluss weiterer Elementarschäden".toLowerCase(), Verbundene_Hausratversicherung_ohne_Einschluss_weiterer_Elementarschaeden);
        ALIASES.put("Verbundene Hausratversicherung unter Einschluss weiterer Elementarschäden".toLowerCase(), Verbundene_Hausratversicherung_unter_Einschluss_weiterer_Elementarschaeden);
        ALIASES.put("Verbundene Wohngebäudeversicherung".toLowerCase(), Verbundene_Wohngebaeudeversicherung);
        ALIASES.put("Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden".toLowerCase(), Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden);
        ALIASES.put("Verbundene Wohngebäudeversicherung ohne Einfluss weiterer Elementarschäden".toLowerCase(), Verbundene_Wohngebaeudeversicherung_ohne_Einfluss_weiterer_Elementarschaeden_142);
        ALIASES.put("Hagelversicherung".toLowerCase(), Hagelversicherung);
        ALIASES.put("Tierversicherung".toLowerCase(), Tierversicherung);
        ALIASES.put("Langfristige Tierlebensversicherung".toLowerCase(), Langfristige_Tierlebensversicherung);
        ALIASES.put("Pferdelebensversicherung".toLowerCase(), Pferdelebensversicherung);
        ALIASES.put("Rindviehlebensversicherung".toLowerCase(), Rindviehlebensversicherung);
        ALIASES.put("Schweinelebensversicherung".toLowerCase(), Schweinelebensversicherung);
        ALIASES.put("Geflügellebensversicherung".toLowerCase(), Gefluegellebensversicherung);
        ALIASES.put("Hundelebensversicherung".toLowerCase(), Hundelebensversicherung);
        ALIASES.put("Übrige langfristige Tierlebensversicherung".toLowerCase(), Uebrige_langfristige_Tierlebensversicherung);
        ALIASES.put("Kurzfristige Tierversicherung".toLowerCase(), Kurzfristige_Tierversicherung);
        ALIASES.put("Trächtigkeits-, Leibesfrucht- und Fohlenversicherung".toLowerCase(), Traechtigkeits_Leibesfrucht_und_Fohlenversicherung);
        ALIASES.put("Weidetierversicherung".toLowerCase(), Weidetierversicherung);
        ALIASES.put("Mastviehversicherung".toLowerCase(), Mastviehversicherung);
        ALIASES.put("Schlachttierversicherung (einschließlich Schlachtwertversicherung)".toLowerCase(), Schlachttierversicherung);
        ALIASES.put("Operations-(Kastrations)-Versicherung".toLowerCase(), Operations_Versicherung);
        ALIASES.put("Übrige kurzfristige Tierversicherung".toLowerCase(), Uebrige_kurzfristige_Tierversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Tierversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Tierversicherung);
        ALIASES.put("Technische Versicherung".toLowerCase(), Technische_Versicherung);
        ALIASES.put("Maschinenversicherung (einschließlich der Baugeräteversicherung)".toLowerCase(), Maschinenversicherung);
        ALIASES.put("Elektronikversicherung".toLowerCase(), Elektronikversicherung);
        ALIASES.put("Montageversicherung".toLowerCase(), Montageversicherung);
        ALIASES.put("Haushaltsgeräteversicherung".toLowerCase(), Haushaltsgeraeteversicherung);
        ALIASES.put("Bauleistungsversicherung".toLowerCase(), Bauleistungsversicherung);
        ALIASES.put("Übrige technische Versicherungen".toLowerCase(), Uebrige_technische_Versicherungen);
        ALIASES.put("Übrige technische Sachschadenversicherungen".toLowerCase(), Uebrige_technische_Sachschadenversicherungen);
        ALIASES.put("Reparaturkostenversicherung von Kraftwagen".toLowerCase(), Reparaturkostenversicherung_von_Kraftwagen);
        ALIASES.put("Reparaturkostenversicherung von Fernseh- und Videogeräten".toLowerCase(), Reparaturkostenversicherung_von_Fernseh_und_Videogeraeten);
        ALIASES.put("Reparaturkostenversicherung von Haushaltsgeräten".toLowerCase(), Reparaturkostenversicherung_von_Haushaltsgeraeten);
        ALIASES.put("Garantieverlängerungsversicherung von technischen Geräten".toLowerCase(), Garantieverlaengerungsversicherung_von_technischen_Geraeten);
        ALIASES.put("Sonstige technische Versicherungen".toLowerCase(), Sonstige_technische_Versicherungen);
        ALIASES.put("Einheitsversicherung".toLowerCase(), Einheitsversicherung);
        ALIASES.put("Allgemeine Einheitsversicherung".toLowerCase(), Allgemeine_Einheitsversicherung);
        ALIASES.put("Juwelierwaren- Einheitsversicherung".toLowerCase(), Juwelierwaren_Einheitsversicherung);
        ALIASES.put("Rauchwaren- Einheitsversicherung".toLowerCase(), Rauchwaren_Einheitsversicherung);
        ALIASES.put("Textilveredlung- Einheitsversicherung".toLowerCase(), Textilveredlung_Einheitsversicherung);
        ALIASES.put("Wäscheschutz- Einheitsversicherung".toLowerCase(), Waescheschutz_Einheitsversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Einheitsversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Einheitsversicherung);
        ALIASES.put("Transportversicherung".toLowerCase(), Transportversicherung);
        ALIASES.put("Kaskoversicherung".toLowerCase(), Kaskoversicherung);
        ALIASES.put("Seeschifffahrts- Kaskoversicherung".toLowerCase(), Seeschifffahrts_Kaskoversicherung);
        ALIASES.put("Binnensee- und Flussschifffahrts- Kaskoversicherung".toLowerCase(), Binnensee_und_Flussschifffahrts_Kaskoversicherung);
        ALIASES.put("Schienenfahrzeug- Kaskoversicherung".toLowerCase(), Schienenfahrzeug_Kaskoversicherung);
        ALIASES.put("Sportboot- Kaskoversicherung".toLowerCase(), Sportboot_Kaskoversicherung);
        ALIASES.put("Baurisikoversicherung".toLowerCase(), Baurisikoversicherung);
        ALIASES.put("Übrige Kaskoversicherung".toLowerCase(), Uebrige_Kaskoversicherung);
        ALIASES.put("Transportgüterversicherung".toLowerCase(), Transportgueterversicherung);
        ALIASES.put("Transportgüterversicherung (ohne die Kennzahlen 19.2.3 bis 19.2.6)".toLowerCase(), Transportgueterversicherung_1922);
        ALIASES.put("Reiselagerversicherung".toLowerCase(), Reiselagerversicherung);
        ALIASES.put("Container- Kaskoversicherung".toLowerCase(), Container_Kaskoversicherung);
        ALIASES.put("Tiertransportversicherung".toLowerCase(), Tiertransportversicherung);
        ALIASES.put("Übrige Warenversicherung".toLowerCase(), Uebrige_Warenversicherung);
        ALIASES.put("Valorenversicherung (gewerblich)".toLowerCase(), Valorenversicherung);
        ALIASES.put("Filmversicherung (ohne die Kennzahl 29.2.01)".toLowerCase(), Filmversicherung);
        ALIASES.put("Kriegsrisikoversicherung".toLowerCase(), Kriegsrisikoversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Transportversicherung (einschließlich Versicherung von Offshore- Risiken)".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Transportversicherung);
        ALIASES.put("Kredit- und Kautionsversicherung".toLowerCase(), Kredit_und_Kautionsversicherung);
        ALIASES.put("Kautionsversicherung (einschließlich Baugarantieversicherung)".toLowerCase(), Kautionsversicherung);
        ALIASES.put("Delkrederversicherung".toLowerCase(), Delkrederversicherung);
        ALIASES.put("Ausfuhrkreditversicherung".toLowerCase(), Ausfuhrkreditversicherung);
        ALIASES.put("Warenkreditversicherung".toLowerCase(), Warenkreditversicherung);
        ALIASES.put("Investitionsgüterkreditversicherung".toLowerCase(), Investitionsgueterkreditversicherung);
        ALIASES.put("Konsumentenkreditversicherung".toLowerCase(), Konsumentenkreditversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Delkrederversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Delkrederversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Kredit- und Kautionsversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Kredit_und_Kautionsversicherung);
        ALIASES.put("Versicherung zusätzlicher Gefahren zur Feuer- bzw. Feuer- Betriebsunterbrechungs- Versicherung (Extend Coverage (EC)- Versicherung)".toLowerCase(), Versicherung_zusaetzlicher_Gefahren_zur_Feuer_bzw_Feuer_Betriebsunterbrechungs_Versicherung_Versicherung);
        ALIASES.put("Betriebsunterbrechungs- Versicherung".toLowerCase(), Betriebsunterbrechungs_Versicherung);
        ALIASES.put("Feuer-(Groß) Betriebsunterbrechungs- Versicherung".toLowerCase(), Feuer_Betriebsunterbrechungs_Versicherung);
        ALIASES.put("Technische- Betriebsunterbrechungs- Versicherung/ MBU Elektronik".toLowerCase(), Technische_Betriebsunterbrechungs_Versicherung_MBU_Elektronik);
        ALIASES.put("Sonstige Betriebsunterbrechungsversicherungen".toLowerCase(), Sonstige_Betriebsunterbrechungsversicherungen);
        ALIASES.put("Beistandsleistungsversicherung".toLowerCase(), Beistandsleistungsversicherung);
        ALIASES.put("Schutzbriefversicherung".toLowerCase(), Schutzbriefversicherung);
        ALIASES.put("Sportboot- Serviceversicherung".toLowerCase(), Sportboot_Serviceversicherung);
        ALIASES.put("Flugrückholkostenversicherung".toLowerCase(), Flugrueckholkostenversicherung);
        ALIASES.put("Schutzbriefversicherung unter Einschluss der sog. Mallorca- Police".toLowerCase(), Schutzbriefversicherung_unter_Einschluss_der_sog_Mallorca_Police);
        ALIASES.put("Übrige und nicht aufgegliederte Beistandsleistungsversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Beistandsleistungsversicherung);
        ALIASES.put("Luft- und Raumfahrzeug- Haftpflichtversicherung".toLowerCase(), Luft_und_Raumfahrzeug_Haftpflichtversicherung);
        ALIASES.put("Luftfahrt- Haftpflichtversicherung (einschließlich der Luftfrachtführer- Haftpflichtversicherung)".toLowerCase(), Luftfahrt_Haftpflichtversicherung);
        ALIASES.put("Raumfahrzeug- Haftpflichtversicherung".toLowerCase(), Raumfahrzeug_Haftpflichtversicherung);
        ALIASES.put("Sonstige Schadenversicherung, z.B. Maschinen- Garantie- Versicherung".toLowerCase(), Sonstige_Schadenversicherung_z_B_Maschinen_Garantie_Versicherung);
        ALIASES.put("Sonstige Sachschadenversicherung".toLowerCase(), Sonstige_Sachschadenversicherung);
        ALIASES.put("Schwamm- und Hausbockkäferversicherung".toLowerCase(), Schwamm_und_Hausbockkaeferversicherung);
        ALIASES.put("Ausstellungsversicherung".toLowerCase(), Ausstellungsversicherung);
        ALIASES.put("Fahrradversicherung".toLowerCase(), Fahrradversicherung);
        ALIASES.put("Garderobenversicherung".toLowerCase(), Garderobenversicherung);
        ALIASES.put("Jagd- und Sportwaffenversicherung".toLowerCase(), Jagd_und_Sportwaffenversicherung);
        ALIASES.put("Musikinstrumenteversicherung".toLowerCase(), Musikinstrumenteversicherung);
        ALIASES.put("Fotoapparateversicherung".toLowerCase(), Fotoapparateversicherung);
        ALIASES.put("Kühlgüterversicherung".toLowerCase(), Kuehlgueterversicherung);
        ALIASES.put("Warenversicherung in Tiefkühlanlagen".toLowerCase(), Warenversicherung_in_Tiefkuehlanlagen);
        ALIASES.put("Atomanlagen- Sachversicherung".toLowerCase(), Atomanlagen_Sachversicherung);
        ALIASES.put("Automatenversicherung".toLowerCase(), Automatenversicherung);
        ALIASES.put("Reisegepäckversicherung".toLowerCase(), Reisegepaeckversicherung);
        ALIASES.put("Kraftfahrtgepäckversicherung".toLowerCase(), Kraftfahrtgepaeckversicherung);
        ALIASES.put("Valorenversicherung (privat)".toLowerCase(), Valorenversicherung_29114);
        ALIASES.put("Freizeitsportgeräteversicherung (einschließlich der Skibruchversicherung)".toLowerCase(), Freizeitsportgeraeteversicherung);
        ALIASES.put("Verderbschadenversicherung".toLowerCase(), Verderbschadenversicherung);
        ALIASES.put("Gärtnereri- Verderbschadenversicherung".toLowerCase(), Gaertnereri_Verderbschadenversicherung);
        ALIASES.put("Campingversicherung".toLowerCase(), Campingversicherung);
        ALIASES.put("Versicherung von Kunstgegenständen".toLowerCase(), Versicherung_von_Kunstgegenstaenden);
        ALIASES.put("Versicherung von Auktionen".toLowerCase(), Versicherung_von_Auktionen);
        ALIASES.put("Brillenversicherung".toLowerCase(), Brillenversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Sachschadenversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Sachschadenversicherung);
        ALIASES.put("Sonstige Vermögensschadenversicherung".toLowerCase(), Sonstige_Vermoegensschadenversicherung);
        ALIASES.put("Boykott- und Streikversicherung".toLowerCase(), Boykott_und_Streikversicherung);
        ALIASES.put("Reise-Rücktrittskostenversicherung".toLowerCase(), Reise_Ruecktrittskostenversicherung);
        ALIASES.put("Lizenzverlustversicherung".toLowerCase(), Lizenzverlustversicherung);
        ALIASES.put("Tierkrankenversicherung".toLowerCase(), Tierkrankenversicherung);
        ALIASES.put("Maschinengarantieversicherung".toLowerCase(), Maschinengarantieversicherung);
    }

    private static void initAliases1() {
        ALIASES.put("Datenmissbrauchsversicherung".toLowerCase(), Datenmissbrauchsversicherung);
        ALIASES.put("Scheckkartenversicherung von Scheckkarteninhabern".toLowerCase(), Scheckkartenversicherung_von_Scheckkarteninhabern);
        ALIASES.put("Insolvenzversicherung".toLowerCase(), Insolvenzversicherung);
        ALIASES.put("Schlüsselverlustsicherung".toLowerCase(), Schluesselverlustsicherung);
        ALIASES.put("Garantieversicherung von Kraftfahrzeugen".toLowerCase(), Garantieversicherung_von_Kraftfahrzeugen);
        ALIASES.put("Mietverlustversicherung".toLowerCase(), Mietverlustversicherung);
        ALIASES.put("Raumfahrzeug-Vermögensschadenversicherung".toLowerCase(), Raumfahrzeug_Vermoegensschadenversicherung);
        ALIASES.put("Milchgeldausfallversicherung".toLowerCase(), Milchgeldausfallversicherung);
        ALIASES.put("Produktschutzversicherung".toLowerCase(), Produktschutzversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte Vermögensschadenversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Vermoegensschadenversicherung);
        ALIASES.put("Sonstige gemischte Versicherung".toLowerCase(), Sonstige_gemischte_Versicherung);
        ALIASES.put("Tank- und Fassleckageversicherung".toLowerCase(), Tank_und_Fassleckageversicherung);
        ALIASES.put("Filmtheater- Einheitsversicherung".toLowerCase(), Filmtheater_Einheitsversicherung);
        ALIASES.put("Versicherung von Winzerbetrieben gegen Frostschäden".toLowerCase(), Versicherung_von_Winzerbetrieben_gegen_Frostschaeden);
        ALIASES.put("Allgefahrenversicherung".toLowerCase(), Allgefahrenversicherung);
        ALIASES.put("Inhaltsversicherung für Geschäfte und Betriebe".toLowerCase(), Inhaltsversicherung_fuer_Geschaefte_und_Betriebe);
        ALIASES.put("Erweiterte Haushaltsversicherung".toLowerCase(), Erweiterte_Haushaltsversicherung);
        ALIASES.put("Dynamische Sachversicherung".toLowerCase(), Dynamische_Sachversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte gemischte Versicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_gemischte_Versicherung);
        ALIASES.put("Vertrauensschadenversicherung".toLowerCase(), Vertrauensschadenversicherung);
        ALIASES.put("Vertrauensschadenversicherung (ohne Kennzahlen 26.6.02 und 29.6.04)".toLowerCase(), Vertrauensschadenversicherung_29601);
        ALIASES.put("Computermissbrauchsversicherung".toLowerCase(), Computermissbrauchsversicherung);
        ALIASES.put("Versicherung gegen Veruntreuung von Selbstfahrervermieterfahrzeugen".toLowerCase(), Versicherung_gegen_Veruntreuung_von_Selbstfahrervermieterfahrzeugen);
        ALIASES.put("Eigenschadenversicherung von Körperschaften und Anstalten des öffentlichen Rechts".toLowerCase(), Eigenschadenversicherung_von_Koerperschaften_und_Anstalten_des_oeffentlichen_Rechts);
        ALIASES.put("Übrige und nicht aufgegliederte Vertrauensschadenversicherung".toLowerCase(), Uebrige_und_nicht_aufgegliederte_Vertrauensschadenversicherung);
        ALIASES.put("Übrige und nicht aufgegliederte sonstige Schadenversicherungen".toLowerCase(), Uebrige_und_nicht_aufgegliederte_sonstige_Schadenversicherungen);
        ALIASES.put("Schaden- und Unfallversicherungen insgesamt".toLowerCase(), Schaden_und_Unfallversicherungen_insgesamt);
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
    public static VersicherungsTypCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (VersicherungsTypCode e : VersicherungsTypCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        VersicherungsTypCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
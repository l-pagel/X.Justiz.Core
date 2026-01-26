package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Dokumentklasse Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Codeliste GDS.Dokumentklasse</a>.
 *  * <p>
 *  *  <u><b>Document class codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse">XRepository: Code list GDS.DocumentClass</a>.
 */
@XmlType
@XmlEnum
public enum DokumentklasseCode {

    /**
     * <b>Andere / Sonstige / Other / Miscellaneous</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Andere_Sonstige("001"),

    /**
     * <b>Klage / Antrag / Complaint / Application</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Klage_Antrag("003"),

    /**
     * <b>Anlage</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Anlage("005"),

    /**
     * <b>Urteil / Judgment</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Urteil("006"),

    /**
     * <b>Beschluss / Resolution / Order</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Beschluss("007"),

    /**
     * <b>Verf&#252;gung / Decree / Disposition</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    Verfuegung("008"),

    /**
     * <b>Vermerk / Note / Memo</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("009")
    @XmlEnumValue("009")
    Vermerk("009"),

    /**
     * <b>Protokoll / Protocol / Minutes</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Protokoll("010"),

    /**
     * <b>Fehlblatt / Missing Sheet</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Fehlblatt("011"),

    /**
     * <b>Zustellungsdokument / Service Document</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Zustellungsdokument("012"),

    /**
     * <b>Gutachten / Expert Opinion</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Gutachten("013"),

    /**
     * <b>Technische Information / Technical Information</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Technische_Information("014"),

    /**
     * <b>Schreiben / Letter</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Schreiben("015"),

    /**
     * <b>Antrag (Beh&#246;rde) / Application (Authority)</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("016")
    @XmlEnumValue("016")
    Antrag_Behoerde("016"),

    /**
     * <b>Bescheid / Decision / Notice</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("017")
    @XmlEnumValue("017")
    Bescheid("017"),

    /**
     * <b>Einspruch / Widerspruch (Beh&#246;rde) / Objection / Opposition (Authority)</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("018")
    @XmlEnumValue("018")
    Einspruch_Widerspruch_Behoerde("018"),

    /**
     * <b>Einspruchs- / Widerspruchsbescheid / Decision on Objection / Opposition</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("019")
    @XmlEnumValue("019")
    Einspruchs_Widerspruchsbescheid("019"),

    /**
     * <b>Kostendokument / Cost Document</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("020")
    @XmlEnumValue("020")
    Kostendokument("020"),

    /**
     * <b>Gerichtsbescheid / Court Order</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Gerichtsbescheid("021");

    private final String value;
    DokumentklasseCode(String value) { this.value = value; }
    private static final java.util.Map<String, DokumentklasseCode> ALIASES = new java.util.HashMap<>();
    static {
        initAliases0();
    }

    private static void initAliases0() {
        ALIASES.put("Andere / Sonstige / Other / Miscellaneous".toLowerCase(), Andere_Sonstige);
        ALIASES.put("Klage / Antrag / Complaint / Application".toLowerCase(), Klage_Antrag);
        ALIASES.put("Anlage".toLowerCase(), Anlage);
        ALIASES.put("Urteil / Judgment".toLowerCase(), Urteil);
        ALIASES.put("Beschluss / Resolution / Order".toLowerCase(), Beschluss);
        ALIASES.put("Verf&#252;gung / Decree / Disposition".toLowerCase(), Verfuegung);
        ALIASES.put("Vermerk / Note / Memo".toLowerCase(), Vermerk);
        ALIASES.put("Protokoll / Protocol / Minutes".toLowerCase(), Protokoll);
        ALIASES.put("Fehlblatt / Missing Sheet".toLowerCase(), Fehlblatt);
        ALIASES.put("Zustellungsdokument / Service Document".toLowerCase(), Zustellungsdokument);
        ALIASES.put("Gutachten / Expert Opinion".toLowerCase(), Gutachten);
        ALIASES.put("Technische Information / Technical Information".toLowerCase(), Technische_Information);
        ALIASES.put("Schreiben / Letter".toLowerCase(), Schreiben);
        ALIASES.put("Antrag (Beh&#246;rde) / Application (Authority)".toLowerCase(), Antrag_Behoerde);
        ALIASES.put("Bescheid / Decision / Notice".toLowerCase(), Bescheid);
        ALIASES.put("Einspruch / Widerspruch (Beh&#246;rde) / Objection / Opposition (Authority)".toLowerCase(), Einspruch_Widerspruch_Behoerde);
        ALIASES.put("Einspruchs- / Widerspruchsbescheid / Decision on Objection / Opposition".toLowerCase(), Einspruchs_Widerspruchsbescheid);
        ALIASES.put("Kostendokument / Cost Document".toLowerCase(), Kostendokument);
        ALIASES.put("Gerichtsbescheid / Court Order".toLowerCase(), Gerichtsbescheid);
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
    public static DokumentklasseCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (DokumentklasseCode e : DokumentklasseCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        DokumentklasseCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Aktentyp Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp">XRepository: Codeliste GDS.Aktentyp</a>.
 *  * <p>
 *  *  <u><b>Case type codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp">XRepository: Code list GDS.CaseFileType</a>.
 */
@XmlType
@XmlEnum
public enum AktentypCode {

    /**
     * <b>Zivilakte / Civil Case File</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Zivilakte("001"),

    /**
     * <b>Betreuungsakte / Guardianship Case File</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Betreuungsakte("002"),

    /**
     * <b>Familienakte / Family Case File</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Familienakte("003"),

    /**
     * <b>Nachlassakte / Probate Case File</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    Nachlassakte("004"),

    /**
     * <b>Insolvenzakte / Insolvency Case File</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Insolvenzakte("005"),

    /**
     * <b>Grundakte / Land Registry File</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Grundakte("006"),

    /**
     * <b>Registerakte / Register File</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Registerakte("007"),

    /**
     * <b>Zwangsvollstreckungsakte / Enforcement Case File</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    Zwangsvollstreckungsakte("008"),

    /**
     * <b>Justizverwaltungsakte / Judicial Administration File</b>
     *  * <p>
     *  *  Code: 009
     *  * <p>
     *  * 
     */
    @JsonProperty("009")
    @XmlEnumValue("009")
    Justizverwaltungsakte("009"),

    /**
     * <b>Bu&#223;geldakte / Fine Proceedings File</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Bussgeldakte("010"),

    /**
     * <b>Bew&#228;hrungshilfeakte / Probation Service File</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    Bewaehrungshilfeakte("011"),

    /**
     * <b>Strafakte / Criminal Case File</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    Strafakte("012"),

    /**
     * <b>Arbeitsgerichtsakte / Labor Court File</b>
     *  * <p>
     *  *  Code: 013
     *  * <p>
     *  * 
     */
    @JsonProperty("013")
    @XmlEnumValue("013")
    Arbeitsgerichtsakte("013"),

    /**
     * <b>Finanzgerichtsakte / Fiscal Court File</b>
     *  * <p>
     *  *  Code: 014
     *  * <p>
     *  * 
     */
    @JsonProperty("014")
    @XmlEnumValue("014")
    Finanzgerichtsakte("014"),

    /**
     * <b>Sozialgerichtsakte / Social Court File</b>
     *  * <p>
     *  *  Code: 015
     *  * <p>
     *  * 
     */
    @JsonProperty("015")
    @XmlEnumValue("015")
    Sozialgerichtsakte("015"),

    /**
     * <b>Verwaltungsgerichtsakte / Administrative Court File</b>
     *  * <p>
     *  *  Code: 016
     *  * <p>
     *  * 
     */
    @JsonProperty("016")
    @XmlEnumValue("016")
    Verwaltungsgerichtsakte("016"),

    /**
     * <b>Andere / Sonstige / Other/Miscellaneous</b>
     *  * <p>
     *  *  Code: 017
     *  * <p>
     *  * 
     */
    @JsonProperty("017")
    @XmlEnumValue("017")
    Andere_oder_Sonstige("017"),

    /**
     * <b>Beh&#246;rdenakte / Authority File</b>
     *  * <p>
     *  *  Code: 018
     *  * <p>
     *  * 
     */
    @JsonProperty("018")
    @XmlEnumValue("018")
    Behoerdenakte("018"),

    /**
     * <b>Hinterlegungsakte / Deposit File</b>
     *  * <p>
     *  *  Code: 019
     *  * <p>
     *  * 
     */
    @JsonProperty("019")
    @XmlEnumValue("019")
    Hinterlegungsakte("019"),

    /**
     * <b>Gerichtsvollzieherverfahrensakte / Bailiff Proceedings File</b>
     *  * <p>
     *  *  Code: 020
     *  * <p>
     *  * 
     */
    @JsonProperty("020")
    @XmlEnumValue("020")
    Gerichtsvollzieherverfahrensakte("020"),

    /**
     * <b>Gerichtsvollziehergesch&#228;ftsbuch DR I / Bailiff&#39;s Register DR I</b>
     *  * <p>
     *  *  Code: 021
     *  * <p>
     *  * 
     */
    @JsonProperty("021")
    @XmlEnumValue("021")
    Gerichtsvollziehergeschaeftsbuch_DR_I("021"),

    /**
     * <b>Gerichtsvollziehergesch&#228;ftsbuch DR II / Bailiff&#39;s Register DR II</b>
     *  * <p>
     *  *  Code: 022
     *  * <p>
     *  * 
     */
    @JsonProperty("022")
    @XmlEnumValue("022")
    Gerichtsvollziehergeschaeftsbuch_DR_II("022"),

    /**
     * <b>Gerichtsvollziehergesch&#228;ftsbuch KB I / Bailiff&#39;s Register KB I</b>
     *  * <p>
     *  *  Code: 023
     *  * <p>
     *  * 
     */
    @JsonProperty("023")
    @XmlEnumValue("023")
    Gerichtsvollziehergeschaeftsbuch_KB_I("023"),

    /**
     * <b>Gerichtsvollziehergesch&#228;ftsbuch KB II / Bailiff&#39;s Register KB II</b>
     *  * <p>
     *  *  Code: 024
     *  * <p>
     *  * 
     */
    @JsonProperty("024")
    @XmlEnumValue("024")
    Gerichtsvollziehergeschaeftsbuch_KB_II("024");

    private final String value;
    AktentypCode(String value) { this.value = value; }
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
    public static AktentypCode fromValue(String value) {
        for (AktentypCode e : AktentypCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
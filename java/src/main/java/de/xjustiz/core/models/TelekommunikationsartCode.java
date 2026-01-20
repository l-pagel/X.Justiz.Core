package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Telekommunikationsart Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Codeliste GDS.Telekommunikationsart</a>.
 *  * <p>
 *  *  <u><b>Telecommunication type codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.telekommunikationsart">XRepository: Code list GDS.TelecommunicationType</a>.
 */
@XmlType
@XmlEnum
public enum TelekommunikationsartCode {

    /**
     * <b>E-Mail</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Email("001"),

    /**
     * <b>Fax</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Fax("002"),

    /**
     * <b>Internet</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Internet("003"),

    /**
     * <b>Mobiltelefon</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    Mobiltelefon("004"),

    /**
     * <b>Pager</b>
     *  * <p>
     *  *  Code: 005
     *  * <p>
     *  * 
     */
    @JsonProperty("005")
    @XmlEnumValue("005")
    Pager("005"),

    /**
     * <b>Sonstige</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Sonstige("006"),

    /**
     * <b>Telefon</b>
     *  * <p>
     *  *  Code: 007
     *  * <p>
     *  * 
     */
    @JsonProperty("007")
    @XmlEnumValue("007")
    Telefon("007"),

    /**
     * <b>Rechtsverbindlicher elektronischer Kommunikationsweg</b>
     *  * <p>
     *  *  Code: 008
     *  * <p>
     *  * 
     */
    @JsonProperty("008")
    @XmlEnumValue("008")
    RechtsverbindlicherElektronischerKommunikationsweg("008");

    private final String value;
    TelekommunikationsartCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static TelekommunikationsartCode fromValue(String value) {
        for (TelekommunikationsartCode e : TelekommunikationsartCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
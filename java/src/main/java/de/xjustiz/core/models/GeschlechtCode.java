package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Geschlecht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codeliste GDS.Geschlecht</a>.
 *  * <p>
 *  *  <u><b>Gender codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code list GDS.Gender</a>.
 */
@XmlType
@XmlEnum
public enum GeschlechtCode {

    /**
     * <b>Unbekannt / Unknown</b>
     *  * <p>
     *  *  Code: 0
     *  * <p>
     *  * 
     */
    @JsonProperty("0")
    @XmlEnumValue("0")
    Unbekannt("0"),

    /**
     * <b>M&#228;nnlich / Male</b>
     *  * <p>
     *  *  Code: 1
     *  * <p>
     *  * 
     */
    @JsonProperty("1")
    @XmlEnumValue("1")
    Maennlich("1"),

    /**
     * <b>Weiblich / Female</b>
     *  * <p>
     *  *  Code: 2
     *  * <p>
     *  * 
     */
    @JsonProperty("2")
    @XmlEnumValue("2")
    Weiblich("2"),

    /**
     * <b>Divers / Diverse</b>
     *  * <p>
     *  *  Code: 3
     *  * <p>
     *  * 
     */
    @JsonProperty("3")
    @XmlEnumValue("3")
    Divers("3"),

    /**
     * <b>S&#228;chlich / Neuter</b>
     *  * <p>
     *  *  Code: 4
     *  * <p>
     *  * 
     */
    @JsonProperty("4")
    @XmlEnumValue("4")
    Saechlich("4");

    private final String value;
    GeschlechtCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static GeschlechtCode fromValue(String value) {
        for (GeschlechtCode e : GeschlechtCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
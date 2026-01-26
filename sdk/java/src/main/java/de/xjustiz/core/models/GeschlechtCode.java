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
    private static final java.util.Map<String, GeschlechtCode> ALIASES = new java.util.HashMap<>();
    static {
        initAliases0();
    }

    private static void initAliases0() {
        ALIASES.put("Unbekannt / Unknown".toLowerCase(), Unbekannt);
        ALIASES.put("M&#228;nnlich / Male".toLowerCase(), Maennlich);
        ALIASES.put("Weiblich / Female".toLowerCase(), Weiblich);
        ALIASES.put("Divers / Diverse".toLowerCase(), Divers);
        ALIASES.put("S&#228;chlich / Neuter".toLowerCase(), Saechlich);
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
    public static GeschlechtCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (GeschlechtCode e : GeschlechtCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        GeschlechtCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
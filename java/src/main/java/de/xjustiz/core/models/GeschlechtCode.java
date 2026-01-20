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
     * Geschlecht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codeliste GDS.Geschlecht</a>.
     *  * <p>
     *  *  <u><b>Gender codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code list GDS.Gender</a>.
     */
    @JsonProperty("0")
    @XmlEnumValue("0")
    Unbekannt("0"),

    /**
     * Geschlecht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codeliste GDS.Geschlecht</a>.
     *  * <p>
     *  *  <u><b>Gender codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code list GDS.Gender</a>.
     */
    @JsonProperty("1")
    @XmlEnumValue("1")
    Maennlich("1"),

    /**
     * Geschlecht Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Codeliste GDS.Geschlecht</a>.
     *  * <p>
     *  *  <u><b>Gender codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.geschlecht">XRepository: Code list GDS.Gender</a>.
     */
    @JsonProperty("2")
    @XmlEnumValue("2")
    Weiblich("2"),

    /**
     * <b>Unbekannt / Unknown</b>
     *  * <p>
     *  *  Code: 0
     *  * <p>
     *  * 
     */
    @JsonProperty("3")
    @XmlEnumValue("3")
    Divers("3"),

    /**
     * <b>Unbekannt / Unknown</b>
     *  * <p>
     *  *  Code: 0
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

    @Override
    public String toString() { return value; }
}
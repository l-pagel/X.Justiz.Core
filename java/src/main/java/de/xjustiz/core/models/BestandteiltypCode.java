package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Bestandteil Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codeliste GDS.Bestandteiltyp</a>.
 *  * <p>
 *  *  <u><b>Component codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code list GDS.Components</a>.
 */
@XmlType
@XmlEnum
public enum BestandteiltypCode {

    /**
     * Bestandteil Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codeliste GDS.Bestandteiltyp</a>.
     *  * <p>
     *  *  <u><b>Component codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code list GDS.Components</a>.
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Original("001"),

    /**
     * Bestandteil Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codeliste GDS.Bestandteiltyp</a>.
     *  * <p>
     *  *  <u><b>Component codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code list GDS.Components</a>.
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Repraesentat("002"),

    /**
     * Bestandteil Codes aus <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Codeliste GDS.Bestandteiltyp</a>.
     *  * <p>
     *  *  <u><b>Component codes:</b></u> from <a href="https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp">XRepository: Code list GDS.Components</a>.
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Signaturdatei("003"),

    /**
     * <b>Original / Original</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    signierte_Vorversion("004"),

    /**
     * <b>Original / Original</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Transfervermerk("006"),

    /**
     * <b>Original / Original</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Pruefvermerk("010"),

    /**
     * <b>Repr&#228;sentat / Representation Copy</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    VHN("011"),

    /**
     * <b>Repr&#228;sentat / Representation Copy</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    hinlaufendes_eEB("012");

    private final String value;
    BestandteiltypCode(String value) { this.value = value; }
    @JsonValue
    public String getValue() { return value; }

    @Override
    public String toString() { return value; }
}
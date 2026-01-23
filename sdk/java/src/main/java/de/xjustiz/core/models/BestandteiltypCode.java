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
     * <b>Original / Original</b>
     *  * <p>
     *  *  Code: 001
     *  * <p>
     *  * 
     */
    @JsonProperty("001")
    @XmlEnumValue("001")
    Original("001"),

    /**
     * <b>Repr&#228;sentat / Representation Copy</b>
     *  * <p>
     *  *  Code: 002
     *  * <p>
     *  * 
     */
    @JsonProperty("002")
    @XmlEnumValue("002")
    Repraesentat("002"),

    /**
     * <b>Signaturdatei / Signature File</b>
     *  * <p>
     *  *  Code: 003
     *  * <p>
     *  * 
     */
    @JsonProperty("003")
    @XmlEnumValue("003")
    Signaturdatei("003"),

    /**
     * <b>signierte Vorversion / Signed Previous Version</b>
     *  * <p>
     *  *  Code: 004
     *  * <p>
     *  * 
     */
    @JsonProperty("004")
    @XmlEnumValue("004")
    signierte_Vorversion("004"),

    /**
     * <b>Transfervermerk / Transfer Record</b>
     *  * <p>
     *  *  Code: 006
     *  * <p>
     *  * 
     */
    @JsonProperty("006")
    @XmlEnumValue("006")
    Transfervermerk("006"),

    /**
     * <b>Pr&#252;fvermerk / Verification Record</b>
     *  * <p>
     *  *  Code: 010
     *  * <p>
     *  * 
     */
    @JsonProperty("010")
    @XmlEnumValue("010")
    Pruefvermerk("010"),

    /**
     * <b>VHN / Trusted Origin Evidence (VHN)</b>
     *  * <p>
     *  *  Code: 011
     *  * <p>
     *  * 
     */
    @JsonProperty("011")
    @XmlEnumValue("011")
    VHN("011"),

    /**
     * <b>hinlaufendes eEB / Incoming eEB</b>
     *  * <p>
     *  *  Code: 012
     *  * <p>
     *  * 
     */
    @JsonProperty("012")
    @XmlEnumValue("012")
    hinlaufendes_eEB("012");

    private final String value;
    BestandteiltypCode(String value) { this.value = value; }
    private static final java.util.Map<String, BestandteiltypCode> ALIASES = new java.util.HashMap<>();
    static {
        initAliases0();
    }

    private static void initAliases0() {
        ALIASES.put("Original / Original".toLowerCase(), Original);
        ALIASES.put("Repr&#228;sentat / Representation Copy".toLowerCase(), Repraesentat);
        ALIASES.put("Signaturdatei / Signature File".toLowerCase(), Signaturdatei);
        ALIASES.put("signierte Vorversion / Signed Previous Version".toLowerCase(), signierte_Vorversion);
        ALIASES.put("Transfervermerk / Transfer Record".toLowerCase(), Transfervermerk);
        ALIASES.put("Pr&#252;fvermerk / Verification Record".toLowerCase(), Pruefvermerk);
        ALIASES.put("VHN / Trusted Origin Evidence (VHN)".toLowerCase(), VHN);
        ALIASES.put("hinlaufendes eEB / Incoming eEB".toLowerCase(), hinlaufendes_eEB);
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
    public static BestandteiltypCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (BestandteiltypCode e : BestandteiltypCode.values()) {
            if (e.value.equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        BestandteiltypCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }
}
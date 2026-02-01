package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Repräsentiert Integritätsinformationen einer Datei.
 * <p>
 * <u><b>Hash info:</b></u> Represents file integrity information.
 */
@XmlType(name = "HashInfoCore", propOrder = { "algorithm", "value" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HashInfoCore {

    /**
     * Der verwendete Hash-Algorithmus (z.B. SHA-256).
     * <p>
     * <u><b>Algorithm:</b></u> The hash algorithm used (e.g., SHA-256).
     */
    @XmlElement(name = "algorithmus", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "algorithmus", namespace = "http://www.xjustizcore.de")
    @JsonProperty("algorithm")
    @JsonAlias({ "Algorithm", "algorithm" })
    private String algorithm;

    /**
     * Der Hashwert.
     * <p>
     * <u><b>Value:</b></u> The hash value.
     */
    @XmlElement(name = "wert", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustizcore.de")
    @JsonProperty("value")
    @JsonAlias({ "Value", "value" })
    private String value;

    /**
     * Default constructor.
     */
    public HashInfoCore() {}

    /**
     * Gets the value of the Algorithm property.
     * @return the value of the Algorithm property
     */
    public String getAlgorithm() { return algorithm; }
    /**
     * Sets the value of the Algorithm property.
     * @param algorithm the value to set
     */
    public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }

    /**
     * Gets the value of the Value property.
     * @return the value of the Value property
     */
    public String getValue() { return value; }
    /**
     * Sets the value of the Value property.
     * @param value the value to set
     */
    public void setValue(String value) { this.value = value; }

}
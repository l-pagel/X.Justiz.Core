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
 * Repräsentiert einen HTTP-Header.
 * <p>
 * <u><b>HTTP header:</b></u> Represents an HTTP header.
 */
@XmlType(name = "HttpHeaderCore", propOrder = { "name", "value" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HttpHeaderCore {

    /**
     * Der Name des Headers.
     * <p>
     * <u><b>Name:</b></u> The name of the header.
     */
    @XmlElement(name = "name", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "name", namespace = "http://www.xjustizcore.de")
    @JsonProperty("name")
    @JsonAlias({ "Name", "name" })
    private String name;

    /**
     * Der Wert des Headers.
     * <p>
     * <u><b>Value:</b></u> The value of the header.
     */
    @XmlElement(name = "wert", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustizcore.de")
    @JsonProperty("value")
    @JsonAlias({ "Value", "value" })
    private String value;

    /**
     * Default constructor.
     */
    public HttpHeaderCore() {}

    /**
     * Gets the value of the Name property.
     * @return the value of the Name property
     */
    public String getName() { return name; }
    /**
     * Sets the value of the Name property.
     * @param name the value to set
     */
    public void setName(String name) { this.name = name; }

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
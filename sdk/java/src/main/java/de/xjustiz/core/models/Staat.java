package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert einen Staat als Code.
 * <p>
 * <u><b>State:</b></u> Represents a state as a code.
 */
@XmlType(name = "Staat", propOrder = { "listVersionId", "listUri", "code" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Staat {

    /**
     * Repräsentiert einen Staat als Code.
     * <p>
     * <u><b>State:</b></u> Represents a state as a code.
     */
    @XmlAttribute(name = "listVersionID")
    @JacksonXmlProperty(isAttribute = true, localName = "listVersionID")
    @JsonProperty("ListVersionId")
    @JsonAlias({ "listVersionId" })
    private String listVersionId;

    /**
     * Repräsentiert einen Staat als Code.
     * <p>
     * <u><b>State:</b></u> Represents a state as a code.
     */
    @XmlAttribute(name = "listURI")
    @JacksonXmlProperty(isAttribute = true, localName = "listURI")
    @JsonProperty("ListUri")
    @JsonAlias({ "listUri" })
    @Nullable
    private String listUri;

    /**
     * Ruft den Staat-Code ab oder legt diesen fest.
     * <p>
     * <u><b>Code:</b></u> Gets or sets the state code.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonProperty("code")
    @JsonAlias({ "Code", "code" })
    private StaatCode code;

    /**
     * Default constructor.
     */
    public Staat() {}

    /**
     * Gets the value of the ListVersionId property.
     * @return the value of the ListVersionId property
     */
    public String getListVersionId() { return listVersionId; }
    /**
     * Sets the value of the ListVersionId property.
     * @param listVersionId the value to set
     */
    public void setListVersionId(String listVersionId) { this.listVersionId = listVersionId; }

    /**
     * Gets the value of the ListUri property.
     * @return the value of the ListUri property
     */
    public String getListUri() { return listUri; }
    /**
     * Sets the value of the ListUri property.
     * @param listUri the value to set
     */
    public void setListUri(String listUri) { this.listUri = listUri; }

    /**
     * Gets the value of the Code property.
     * @return the value of the Code property
     */
    public StaatCode getCode() { return code; }
    /**
     * Sets the value of the Code property.
     * @param code the value to set
     */
    public void setCode(StaatCode code) { this.code = code; }

}
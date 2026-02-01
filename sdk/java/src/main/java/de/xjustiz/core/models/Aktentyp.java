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
 * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
 * <p>
 * <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
 */
@XmlType(name = "Aktentyp", propOrder = { "listVersionId", "listUri", "code" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Aktentyp {

    /**
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
     * <p>
     * <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
     */
    @XmlAttribute(name = "listVersionID")
    @JacksonXmlProperty(isAttribute = true, localName = "listVersionID")
    @JsonProperty("ListVersionId")
    @JsonAlias({ "listVersionId" })
    private String listVersionId;

    /**
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
     * <p>
     * <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
     */
    @XmlAttribute(name = "listURI")
    @JacksonXmlProperty(isAttribute = true, localName = "listURI")
    @JsonProperty("ListUri")
    @JsonAlias({ "listUri" })
    @Nullable
    private String listUri;

    /**
     * Ruft den Aktentyp-Code ab oder legt diesen fest.
     * <p>
     * <u><b>Code:</b></u> Gets or sets the case type code.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonProperty("code")
    @JsonAlias({ "Code", "code" })
    private AktentypCode code;

    /**
     * Default constructor.
     */
    public Aktentyp() {}

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
    public AktentypCode getCode() { return code; }
    /**
     * Sets the value of the Code property.
     * @param code the value to set
     */
    public void setCode(AktentypCode code) { this.code = code; }

}
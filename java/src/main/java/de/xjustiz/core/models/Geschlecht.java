package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlTransient;
import org.jetbrains.annotations.Nullable;

/**
 * Das Geschlecht einer Person.
 * <p>
 * <u><b>Gender:</b></u> The gender of a person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Geschlecht {

    /**
     * Das Geschlecht einer Person.
     * <p>
     * <u><b>Gender:</b></u> The gender of a person.
     */
    @XmlAttribute(name = "listVersionID")
    @JacksonXmlProperty(isAttribute = true, localName = "listVersionID")
    @JsonProperty("ListVersionId")
    private String listVersionId;

    /**
     * Das Geschlecht einer Person.
     * <p>
     * <u><b>Gender:</b></u> The gender of a person.
     */
    @XmlAttribute(name = "listURI")
    @JacksonXmlProperty(isAttribute = true, localName = "listURI")
    @JsonProperty("ListUri")
    @Nullable
    private String listUri;

    /**
     * Ruft den Geschlecht-Code ab oder legt diesen fest.
     * <p>
     * <u><b>Code:</b></u> Gets or sets the gender code.
     */
    @XmlTransient
    @JsonProperty("code")
    @JsonAlias({ "Code", "code" })
    private GeschlechtCode code;

    /**
     * Hilfseigenschaft für die XML-Serialisierung.
     * <p>
     * <u><b>Code for XML:</b></u> Helper property for XML serialization.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonIgnore
    private String codeForXml;

    public Geschlecht() {}

    public String getListVersionId() { return listVersionId; }
    public void setListVersionId(String listVersionId) { this.listVersionId = listVersionId; }

    public String getListUri() { return listUri; }
    public void setListUri(String listUri) { this.listUri = listUri; }

    public GeschlechtCode getCode() { return code; }
    public void setCode(GeschlechtCode code) { this.code = code; }

    public String getCodeForXml() { return codeForXml; }
    public void setCodeForXml(String codeForXml) { this.codeForXml = codeForXml; }

}
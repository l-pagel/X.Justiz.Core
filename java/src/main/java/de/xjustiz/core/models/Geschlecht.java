package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Das Geschlecht einer Person.
 * <p>
 * <u><b>Gender:</b></u> The gender of a person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
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
     * Hilfseigenschaft für die XML-Serialisierung.
     * <p>
     * <u><b>Code for XML:</b></u> Helper property for XML serialization.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonProperty("code")
    @JsonAlias("Code")
    @Nullable
    private String codeForXml;

    /**
     * Default constructor.
     */
    public Geschlecht() {
    }

    /**
     * Das Geschlecht einer Person.
     *
     * @return the listVersionId
     */
    public String getListVersionId() {
        return listVersionId;
    }

    /**
     * Sets the listVersionId.
     *
     * @param listVersionId the listVersionId to set
     */
    public void setListVersionId(String listVersionId) {
        this.listVersionId = listVersionId;
    }

    /**
     * Das Geschlecht einer Person.
     *
     * @return the listUri
     */
    @Nullable
    public String getListUri() {
        return listUri;
    }

    /**
     * Sets the listUri.
     *
     * @param listUri the listUri to set
     */
    public void setListUri(@Nullable String listUri) {
        this.listUri = listUri;
    }

    /**
     * Hilfseigenschaft für die XML-Serialisierung.
     *
     * @return the codeForXml
     */
    @Nullable
    public String getCodeForXml() {
        return codeForXml;
    }

    /**
     * Sets the codeForXml.
     *
     * @param codeForXml the codeForXml to set
     */
    public void setCodeForXml(@Nullable String codeForXml) {
        this.codeForXml = codeForXml;
    }

}

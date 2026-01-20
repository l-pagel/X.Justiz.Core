package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
 * <p>
 *  <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Aktentyp {

    /**
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
     * <p>
     *  <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
     */
    @XmlAttribute(name = "listVersionID")
    @JacksonXmlProperty(isAttribute = true, localName = "listVersionID")
    @JsonProperty("ListVersionId")
    private String listVersionId;

    /**
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
     * <p>
     *  <u><b>Case type code:</b></u> The code for a case type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>code list "Aktentyp"</a>.
     */
    @XmlAttribute(name = "listURI")
    @JacksonXmlProperty(isAttribute = true, localName = "listURI")
    @JsonProperty("ListUri")
    @Nullable
    private String listUri;

    /**
     * Hilfseigenschaft für die XML-Serialisierung.
     * <p>
     *  <u><b>Code for XML:</b></u> Helper property for XML serialization.
     */
    @XmlElement(name = "code", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustiz.de")
    @JsonProperty("CodeForXml")
    @Nullable
    private String codeForXml;

    /**
     * Default constructor.
     */
    public Aktentyp() {
    }

    /**
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
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
     * Der Code für einen Aktentyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.aktentyp'>Codeliste "Aktentyp"</a>.
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

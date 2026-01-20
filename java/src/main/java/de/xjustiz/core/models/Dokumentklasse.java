package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Die Dokumentklasse definiert den Typ eines Dokuments (z. B. Klageschrift, Urteil).<br/>
/// <u><b>Document class:</b></u> The document class defines the type of a document (e.g., statement of claim, judgment).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Dokumentklasse {

    @XmlElement(name = "listVersionID", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "listVersionID", namespace = "http://www.xjustiz.de")
    @JsonProperty("ListVersionId")
    private String listVersionId;

    @XmlElement(name = "listURI", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "listURI", namespace = "http://www.xjustiz.de")
    @JsonProperty("ListUri")
    @Nullable
    private String listUri;

    @XmlElement(name = "code", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustiz.de")
    @JsonProperty("CodeForXml")
    private String codeForXml;

    public Dokumentklasse() {
    }

    public String getListVersionId() {
        return listVersionId;
    }

    public void setListVersionId(String listVersionId) {
        this.listVersionId = listVersionId;
    }

    @Nullable
    public String getListUri() {
        return listUri;
    }

    public void setListUri(@Nullable String listUri) {
        this.listUri = listUri;
    }

    public String getCodeForXml() {
        return codeForXml;
    }

    public void setCodeForXml(String codeForXml) {
        this.codeForXml = codeForXml;
    }

}

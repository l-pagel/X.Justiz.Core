package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert ein Gericht als Code.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Gericht {

    @XmlElement(name = "listVersionId", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "listVersionId", namespace = "http://www.xjustiz.de")
    @JsonProperty("ListVersionId")
    @Nullable
    private String listVersionId;

    @XmlElement(name = "listUri", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "listUri", namespace = "http://www.xjustiz.de")
    @JsonProperty("ListUri")
    @Nullable
    private String listUri;

    @XmlElement(name = "code", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustiz.de")
    @JsonProperty("code")
    @Nullable
    private Integer code;

    public Gericht() {
    }

    @Nullable
    public String getListVersionId() {
        return listVersionId;
    }

    public void setListVersionId(@Nullable String listVersionId) {
        this.listVersionId = listVersionId;
    }

    @Nullable
    public String getListUri() {
        return listUri;
    }

    public void setListUri(@Nullable String listUri) {
        this.listUri = listUri;
    }

    @Nullable
    public Integer getCode() {
        return code;
    }

    public void setCode(@Nullable Integer code) {
        this.code = code;
    }
}

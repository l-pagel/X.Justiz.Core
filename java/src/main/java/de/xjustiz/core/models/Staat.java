package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert einen Staat als Code.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Staat {

    @XmlElement(name = "listVersionId", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "listVersionId", namespace = "http://www.xjustiz.de")
    @JsonProperty("ListVersionId")
    private String listVersionId;

    @XmlElement(name = "code", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "code", namespace = "http://www.xjustizcore.de")
    @JsonProperty("code")
    @Nullable
    private String code;

    public Staat() {
    }

    public String getListVersionId() {
        return listVersionId;
    }

    public void setListVersionId(String listVersionId) {
        this.listVersionId = listVersionId;
    }

    @Nullable
    public String getCode() {
        return code;
    }

    public void setCode(@Nullable String code) {
        this.code = code;
    }
}

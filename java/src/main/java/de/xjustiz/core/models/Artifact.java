package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import java.util.List;
import org.jetbrains.annotations.Nullable;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Artifact {

    @XmlElement(name = "type", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "type", namespace = "http://www.xjustizcore.de")
    @JsonProperty("type")
    private String type;

    @XmlElement(name = "url", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "url", namespace = "http://www.xjustizcore.de")
    @JsonProperty("url")
    @Nullable
    private String url;

    @XmlElement(name = "ablaufdatum", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "ablaufdatum", namespace = "http://www.xjustizcore.de")
    @JsonProperty("expiresAtUtc")
    @Nullable
    private String expiresAtUtc;

    @XmlElement(name = "pfad", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "pfad", namespace = "http://www.xjustizcore.de")
    @JsonProperty("path")
    @Nullable
    private String path;

    @XmlElement(name = "header", namespace = "http://www.xjustizcore.de")
    @JacksonXmlElementWrapper(localName = "headerListe", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "header", namespace = "http://www.xjustizcore.de")
    @JsonProperty("headers")
    @Nullable
    private List<HttpHeader> headers;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Nullable
    public String getUrl() {
        return url;
    }

    public void setUrl(@Nullable String url) {
        this.url = url;
    }

    @Nullable
    public String getExpiresAtUtc() {
        return expiresAtUtc;
    }

    public void setExpiresAtUtc(@Nullable String expiresAtUtc) {
        this.expiresAtUtc = expiresAtUtc;
    }

    @Nullable
    public String getPath() {
        return path;
    }

    public void setPath(@Nullable String path) {
        this.path = path;
    }

    @Nullable
    public List<HttpHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(@Nullable List<HttpHeader> headers) {
        this.headers = headers;
    }
}

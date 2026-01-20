package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import java.time.OffsetDateTime;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine URL zum Abruf einer Datei via HTTPS.
 * <p>
 * <u><b>HTTPS artifact:</b></u> Represents a URL for retrieving a file via HTTPS.
 */
@XmlType(name = "HttpsArtifactCore", propOrder = { "url", "expiresAtUtc", "headers" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HttpsArtifactCore extends ArtifactCore {

    /**
     * Die URL zur Datei.
     * <p>
     * <u><b>URL:</b></u> The URL to the file.
     */
    @XmlElement(name = "url", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "url", namespace = "http://www.xjustizcore.de")
    @JsonProperty("url")
    @JsonAlias({ "Url", "url" })
    private String url;

    /**
     * Der Zeitpunkt an dem die URL abläuft.
     * <p>
     * <u><b>Expires at UTC:</b></u> The time when the URL expires.
     */
    @XmlElement(name = "ablaufdatum", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "ablaufdatum", namespace = "http://www.xjustizcore.de")
    @JsonProperty("expiresAtUtc")
    @JsonAlias({ "ExpiresAtUtc", "expiresAtUtc" })
    @Nullable
    private OffsetDateTime expiresAtUtc;

    /**
     * Optionale HTTP-Header für den Abruf.
     * <p>
     * <u><b>Headers:</b></u> Optional HTTP headers for retrieval.
     */
    @XmlElementWrapper(name = "headerListe", namespace = "http://www.xjustizcore.de")
    @JacksonXmlElementWrapper(localName = "headerListe", namespace = "http://www.xjustizcore.de")
    @XmlElement(name = "header", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "header", namespace = "http://www.xjustizcore.de")
    @JsonProperty("headers")
    @JsonAlias({ "Headers", "headers" })
    @Nullable
    private List<HttpHeaderCore> headers;

    public HttpsArtifactCore() {}

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public OffsetDateTime getExpiresAtUtc() { return expiresAtUtc; }
    public void setExpiresAtUtc(OffsetDateTime expiresAtUtc) { this.expiresAtUtc = expiresAtUtc; }

    public List<HttpHeaderCore> getHeaders() { return headers; }
    public void setHeaders(List<HttpHeaderCore> headers) { this.headers = headers; }

}
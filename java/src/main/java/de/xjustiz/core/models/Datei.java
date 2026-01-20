package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;
import java.util.List;

/**
 * Repräsentiert eine Datei.
 * <p>
 * <u><b>File:</b></u> Represents a file.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Datei {

    /**
     * Der Dateiname soll nach der Syntax "Dokumentname_UUID.Dateiformat" gebildet
     * werden. Die Länge von Dateinamen darf nur 90 Zeichen inkl. der Dateiendungen
     * betragen. In Dateinamen dürfen nur noch alle Buchstaben des deutschen
     * Alphabetes einschließlich der Umlaute Ä, ä, Ö, ö, Ü, ü and ß genutzt werden.
     */
    @XmlElement(name = "dateiname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dateiname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Dateiname")
    @Nullable
    private String dateiname;

    /**
     * Bestandteil des Dokuments.
     */
    @XmlElement(name = "bestandteil", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bestandteil", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bestandteil")
    private Bestandteiltyp bestandteil;

    /**
     * Dateiendung.
     */
    @XmlElement(name = "dateiendung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "dateiendung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("fileExtension")
    @JsonAlias({ "dateiendung", "Dateiendung" })
    @Nullable
    private String dateiendung;

    /**
     * Content Type / Mime Type.
     */
    @XmlElement(name = "contentType", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "contentType", namespace = "http://www.xjustizcore.de")
    @JsonProperty("contentType")
    @JsonAlias("ContentType")
    @Nullable
    private String contentType;

    /**
     * Dateigroesse in Bytes.
     */
    @XmlElement(name = "groesse", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "groesse", namespace = "http://www.xjustizcore.de")
    @JsonProperty("size")
    @JsonAlias({ "groesse", "Groesse", "Size" })
    @Nullable
    private Long groesse;

    /**
     * Hash info.
     */
    @XmlElement(name = "hash", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "hash", namespace = "http://www.xjustizcore.de")
    @JsonProperty("hash")
    @JsonAlias("Hash")
    @Nullable
    private HashInfo hash;

    /**
     * Artifacts.
     */
    @XmlElement(name = "https", type = Artifact.class, namespace = "http://www.xjustizcore.de")
    @JacksonXmlElementWrapper(localName = "artefaktListe", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "https", namespace = "http://www.xjustizcore.de")
    @JsonProperty("artifacts")
    @JsonAlias({ "Artifacts", "artefakte" })
    @Nullable
    private List<Artifact> artifacts;

    /**
     * Default constructor.
     */
    public Datei() {
    }

    @Nullable
    public String getDateiname() {
        return dateiname;
    }

    public void setDateiname(@Nullable String dateiname) {
        this.dateiname = dateiname;
    }

    public Bestandteiltyp getBestandteil() {
        return bestandteil;
    }

    public void setBestandteil(Bestandteiltyp bestandteil) {
        this.bestandteil = bestandteil;
    }

    @Nullable
    public String getDateiendung() {
        return dateiendung;
    }

    public void setDateiendung(@Nullable String dateiendung) {
        this.dateiendung = dateiendung;
    }

    @Nullable
    public String getContentType() {
        return contentType;
    }

    public void setContentType(@Nullable String contentType) {
        this.contentType = contentType;
    }

    @Nullable
    public Long getGroesse() {
        return groesse;
    }

    public void setGroesse(@Nullable Long groesse) {
        this.groesse = groesse;
    }

    @Nullable
    public HashInfo getHash() {
        return hash;
    }

    public void setHash(@Nullable HashInfo hash) {
        this.hash = hash;
    }

    @Nullable
    public List<Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(@Nullable List<Artifact> artifacts) {
        this.artifacts = artifacts;
    }
}

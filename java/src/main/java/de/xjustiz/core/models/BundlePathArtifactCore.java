package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Repräsentiert einen Dateipfad innerhalb eines Bundles.
 * <p>
 * <u><b>Bundle path artifact:</b></u> Represents a file path within a bundle.
 */
@XmlType(name = "BundlePathArtifactCore", propOrder = { "path" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BundlePathArtifactCore extends ArtifactCore {

    /**
     * Der relative Pfad zur Datei im Bundle.
     * <p>
     * <u><b>Path:</b></u> The relative path to the file in the bundle.
     */
    @XmlElement(name = "pfad", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "pfad", namespace = "http://www.xjustizcore.de")
    @JsonProperty("path")
    @JsonAlias({ "Path", "path" })
    private String path;

    public BundlePathArtifactCore() {}

    public String getPath() { return path; }
    public void setPath(String path) { this.path = path; }

}
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
import java.util.List;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Datei im Sinne eines Dateimanifests.
 * <p>
 * <u><b>File core:</b></u> Represents a file as a file manifest.
 */
@XmlType(name = "DateiCore", propOrder = { "dateiendung", "contentType", "groesse", "hash", "artefakte" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DateiCore extends Datei {

    /**
     * Die Dateiendung (z.B. .pdf).
     * <p>
     * <u><b>File extension:</b></u> The file extension (e.g. .pdf).
     */
    @XmlElement(name = "dateiendung", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "dateiendung", namespace = "http://www.xjustizcore.de")
    @JsonProperty("fileExtension")
    @JsonAlias({ "Dateiendung", "dateiendung" })
    @Nullable
    private String dateiendung;

    /**
     * Der Content-Type der Datei (z.B. application/pdf).
     * <p>
     * <u><b>Content type:</b></u> The content type of the file (e.g. application/pdf).
     */
    @XmlElement(name = "contentType", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "contentType", namespace = "http://www.xjustizcore.de")
    @JsonProperty("contentType")
    @JsonAlias({ "ContentType", "contentType" })
    @Nullable
    private String contentType;

    /**
     * Die Größe der Datei in Bytes.
     * <p>
     * <u><b>Size:</b></u> The size of the file in bytes.
     */
    @XmlElement(name = "groesse", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "groesse", namespace = "http://www.xjustizcore.de")
    @JsonProperty("size")
    @JsonAlias({ "Groesse", "groesse" })
    @Nullable
    private Long groesse;

    /**
     * Integritätsinformationen der Datei.
     * <p>
     * <u><b>Hash:</b></u> Integrity information of the file.
     */
    @XmlElement(name = "hash", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "hash", namespace = "http://www.xjustizcore.de")
    @JsonProperty("hash")
    @JsonAlias({ "Hash", "hash" })
    @Nullable
    private HashInfoCore hash;

    /**
     * Eine Liste von Abrufmöglichkeiten für die Datei.
     * <p>
     * <u><b>Artifacts:</b></u> A list of retrieval options for the file.
     */
    @XmlElementWrapper(name = "artefaktListe", namespace = "http://www.xjustizcore.de")
    @JacksonXmlElementWrapper(localName = "artefaktListe", namespace = "http://www.xjustizcore.de")
    @XmlElements({
        @XmlElement(name = "bundlePfad", namespace = "http://www.xjustizcore.de", type = BundlePathArtifactCore.class),
        @XmlElement(name = "https", namespace = "http://www.xjustizcore.de", type = HttpsArtifactCore.class)
    })
    @JsonProperty("artifacts")
    @JsonAlias({ "Artefakte", "artefakte" })
    @Nullable
    private List<ArtifactCore> artefakte;

    /**
     * Default constructor.
     */
    public DateiCore() {}

    /**
     * Gets the value of the Dateiendung property.
     * @return the value of the Dateiendung property
     */
    public String getDateiendung() { return dateiendung; }
    /**
     * Sets the value of the Dateiendung property.
     * @param dateiendung the value to set
     */
    public void setDateiendung(String dateiendung) { this.dateiendung = dateiendung; }

    /**
     * Gets the value of the ContentType property.
     * @return the value of the ContentType property
     */
    public String getContentType() { return contentType; }
    /**
     * Sets the value of the ContentType property.
     * @param contentType the value to set
     */
    public void setContentType(String contentType) { this.contentType = contentType; }

    /**
     * Gets the value of the Groesse property.
     * @return the value of the Groesse property
     */
    public Long getGroesse() { return groesse; }
    /**
     * Sets the value of the Groesse property.
     * @param groesse the value to set
     */
    public void setGroesse(Long groesse) { this.groesse = groesse; }

    /**
     * Gets the value of the Hash property.
     * @return the value of the Hash property
     */
    public HashInfoCore getHash() { return hash; }
    /**
     * Sets the value of the Hash property.
     * @param hash the value to set
     */
    public void setHash(HashInfoCore hash) { this.hash = hash; }

    /**
     * Gets the value of the Artefakte property.
     * @return the value of the Artefakte property
     */
    public List<ArtifactCore> getArtefakte() { return artefakte; }
    /**
     * Sets the value of the Artefakte property.
     * @param artefakte the value to set
     */
    public void setArtefakte(List<ArtifactCore> artefakte) { this.artefakte = artefakte; }

}
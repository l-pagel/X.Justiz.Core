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
 * Identifiziert ein Objekt eindeutig.
 * <p>
 * <u><b>Identification:</b></u> Uniquely identifies an object.
 */
@XmlType(name = "Identifikation", propOrder = { "id", "nummerImUebergeordnetenContainer" })
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Identifikation {

    /**
     * Der Datentyp zur Angabe einer UUID.
     * <p>
     * <u><b>ID:</b></u> The data type for specifying a UUID.
     */
    @XmlElement(name = "id", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "id", namespace = "http://www.xjustiz.de")
    @JsonProperty("Id")
    @JsonAlias({ "id" })
    private String id;

    /**
     * Über die Nummer im übergeordneten Container wird den Schriftgutobjekten eine Reihenfolge mitgegeben. Unter "Container" ist dabei jeweils das Akten-, Teilakten- oder Dokumentensegment, in dem die Schriftgutobjekte aufgeführt sind, zu verstehen. Umsetzungshinweise: Die Nummern dürfen innerhalb eines Containers nicht doppelt vergeben werden. Dies gilt auch für unterschiedliche Arten von Schriftgutobjekten innerhalb eines Containers (z.B. Teilakten und Dokumente innerhalb einer Akte). Die Nummerierung muss in dem Container mit 1 beginnen. Auslassungen sind nicht zulässig, da die Bedeutung einer fehlenden Zahl keine Rückschlüsse, z.B. auf die Vollständigkeit einer Akte, erlaubt.
     * <p>
     * <u><b>Number in superordinate container:</b></u> A sequence is given to the document objects via the number in the superordinate container. 'Container' refers to the file, sub-file or document segment in which the document objects are listed. Implementation notes: The numbers may not be assigned twice within a container. This also applies to different types of document objects within a container (e.g., sub-files and documents within a file). The numbering must start with 1 in the container. Omissions are not permitted, as the meaning of a missing number allows no conclusions, e.g., on the completeness of a file.
     */
    @XmlElement(name = "nummerImUebergeordnetenContainer", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nummerImUebergeordnetenContainer", namespace = "http://www.xjustiz.de")
    @JsonProperty("NummerImUebergeordnetenContainer")
    @JsonAlias({ "nummerImUebergeordnetenContainer" })
    private String nummerImUebergeordnetenContainer;

    public Identifikation() {}

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNummerImUebergeordnetenContainer() { return nummerImUebergeordnetenContainer; }
    public void setNummerImUebergeordnetenContainer(String nummerImUebergeordnetenContainer) { this.nummerImUebergeordnetenContainer = nummerImUebergeordnetenContainer; }

}
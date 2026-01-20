package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Der volle Name einer natürlichen Person.
 * <p>
 * <u><b>Full name:</b></u> The full name of a natural person.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VollerName {

    /**
     * Bei ggfls. mehreren Vornamen werden diese alle in diesem Element in ihrer Reihenfolge eingetragen.
     * <p>
     * <u><b>First name:</b></u> If there are multiple first names, they are all entered in this element in their order.
     */
    @XmlElement(name = "vorname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "vorname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Vorname")
    @Nullable
    private String vorname;

    /**
     * Der Rufname gibt bei mehreren Vornamen an, welcher Vorname der Rufname ist. Der Rufname wird häufig als eindeutiges Element benötigt.
     * <p>
     * <u><b>Call name:</b></u> The call name indicates which first name is the call name if there are multiple first names. The call name is often required as a unique element.
     */
    @XmlElement(name = "rufname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "rufname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Rufname")
    @Nullable
    private String rufname;

    /**
     * Hier werden akademische und nichtakademische Titel aufgeführt, die vor dem Vornamen stehen, z.B. "Professor", "Dr.", "Prof. Dr." usw.
     * <p>
     * <u><b>Title:</b></u> Academic and non-academic titles that appear before the first name are listed here, e.g., 'Professor', 'Dr.', 'Prof. Dr.', etc.
     */
    @XmlElement(name = "titel", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "titel", namespace = "http://www.xjustiz.de")
    @JsonProperty("Titel")
    @Nullable
    private String titel;

    /**
     * Hier werden Adelstitel aufgeführt, die vor dem Nachnamen stehen, z.B. "Graf von".
     * <p>
     * <u><b>Name prefix:</b></u> Titles of nobility that appear before the last name are listed here, e.g., 'Graf von'.
     */
    @XmlElement(name = "namensvorsatz", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "namensvorsatz", namespace = "http://www.xjustiz.de")
    @JsonProperty("Namensvorsatz")
    @Nullable
    private String namensvorsatz;

    /**
     * Falls der Nachname nicht bekannt ist, ist "nicht bekannt" anzugegeben.
     * <p>
     * <u><b>Last name:</b></u> If the last name is not known, 'nicht bekannt' (unknown) must be specified.
     */
    @XmlElement(name = "nachname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "nachname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Nachname")
    @Nullable
    private String nachname;

    public VollerName() {}

    public String getVorname() { return vorname; }
    public void setVorname(String vorname) { this.vorname = vorname; }

    public String getRufname() { return rufname; }
    public void setRufname(String rufname) { this.rufname = rufname; }

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    public String getNamensvorsatz() { return namensvorsatz; }
    public void setNamensvorsatz(String namensvorsatz) { this.namensvorsatz = namensvorsatz; }

    public String getNachname() { return nachname; }
    public void setNachname(String nachname) { this.nachname = nachname; }

}
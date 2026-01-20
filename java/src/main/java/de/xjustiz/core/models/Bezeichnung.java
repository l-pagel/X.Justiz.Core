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
 * Bezeichnung einer Organisation.
 * <p>
 * <u><b>Designation:</b></u> Designation of an organization.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Bezeichnung {

    /**
     * Aktueller offizieller Name der RA-Kanzlei.
     * <p>
     * <u><b>Current designation:</b></u> Current official name of the law firm.
     */
    @XmlElement(name = "bezeichnung.aktuell", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bezeichnung.aktuell", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktuell")
    @Nullable
    private String aktuell;

    public Bezeichnung() {}

    public String getAktuell() { return aktuell; }
    public void setAktuell(String aktuell) { this.aktuell = aktuell; }

}
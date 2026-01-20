package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Bezeichnung einer Organisation.<br/>
/// <u><b>Designation:</b></u> Designation of an organization.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bezeichnung {

    @XmlElement(name = "bezeichnung.aktuell", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bezeichnung.aktuell", namespace = "http://www.xjustiz.de")
    @JsonProperty("Aktuell")
    @Nullable
    private String aktuell;

    public Bezeichnung() {
    }

    @Nullable
    public String getAktuell() {
        return aktuell;
    }

    public void setAktuell(@Nullable String aktuell) {
        this.aktuell = aktuell;
    }

}

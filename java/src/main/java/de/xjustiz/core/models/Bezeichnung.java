package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Bezeichnung einer Organisation.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Bezeichnung {

    @XmlElement(name = "kurzname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "kurzname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Kurzname")
    @Nullable
    private String kurzname;

    public Bezeichnung() {
    }

    @Nullable
    public String getKurzname() {
        return kurzname;
    }

    public void setKurzname(@Nullable String kurzname) {
        this.kurzname = kurzname;
    }
}

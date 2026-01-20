package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Repräsentiert eine Datei.<br/>
/// <u><b>File:</b></u> Represents a file.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Datei {

    @XmlElement(name = "dateiname", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "dateiname", namespace = "http://www.xjustiz.de")
    @JsonProperty("Dateiname")
    @Nullable
    private String dateiname;

    @XmlElement(name = "bestandteil", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "bestandteil", namespace = "http://www.xjustiz.de")
    @JsonProperty("Bestandteil")
    private Bestandteiltyp bestandteil;

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

}

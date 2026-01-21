package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Basiselement zur Übermittlung von Daten im X.Justiz Core Format.
 * <p>
 * <u><b>Document Object Transmission Message:</b></u> Root element for the transmission of data in the X.Justiz Core format.
 */
@XmlRootElement(name = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@JacksonXmlRootElement(localName = "nachricht.gds.uebermittlungSchriftgutobjekte.0005005", namespace = "http://www.xjustiz.de")
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UebermittlungSchriftgutobjekteNachrichtCore extends UebermittlungSchriftgutobjekteNachricht {

    /**
     * Default constructor.
     */
    public UebermittlungSchriftgutobjekteNachrichtCore() {}

}
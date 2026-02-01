package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Fachspezifische Daten eines Dokuments.
 * <p>
 * <u><b>Subject-specific data:</b></u> Specialized data of a document.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class XjustizFachspezifischeDatenCore extends XjustizFachspezifischeDaten {

    /**
     * Default constructor.
     */
    public XjustizFachspezifischeDatenCore() {}

}
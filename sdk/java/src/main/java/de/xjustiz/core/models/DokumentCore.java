package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Repräsentiert ein Dokument.
 * <p>
 * <u><b>Document:</b></u> Represents a document.
 */
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DokumentCore extends Dokument {

    /**
     * Default constructor.
     */
    public DokumentCore() {}

}
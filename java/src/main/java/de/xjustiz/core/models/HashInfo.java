package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class HashInfo {

    @XmlElement(name = "algorithmus", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "algorithmus", namespace = "http://www.xjustizcore.de")
    @JsonProperty("algorithm")
    private String algorithm = "SHA-256";

    @XmlElement(name = "wert", namespace = "http://www.xjustizcore.de")
    @JacksonXmlProperty(localName = "wert", namespace = "http://www.xjustizcore.de")
    @JsonProperty("value")
    private String value;

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

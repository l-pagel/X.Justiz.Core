package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für Adressen (Absender oder Empfänger).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlAdresse {

    @XmlElement(name = "absender.sonstige", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "absender.sonstige", namespace = "http://www.xjustiz.de")
    @JsonProperty("AbsenderSonstige")
    @Nullable
    private String absenderSonstige;

    @XmlElement(name = "empfaenger.sonstige", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.sonstige", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerSonstige")
    @Nullable
    private String empfaengerSonstige;

    @XmlElement(name = "empfaenger.gericht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.gericht", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerGericht")
    @Nullable
    private String empfaengerGericht;

    @XmlElement(name = "empfaenger.rvTraeger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.rvTraeger", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerRvTraeger")
    @Nullable
    private String empfaengerRvTraeger;

    @XmlElement(name = "empfaenger.polizei", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.polizei", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerPolizei")
    @Nullable
    private String empfaengerPolizei;

    public AuswahlAdresse() {
    }

    @Nullable
    public String getAbsenderSonstige() {
        return absenderSonstige;
    }

    public void setAbsenderSonstige(@Nullable String absenderSonstige) {
        this.absenderSonstige = absenderSonstige;
    }

    @Nullable
    public String getEmpfaengerSonstige() {
        return empfaengerSonstige;
    }

    public void setEmpfaengerSonstige(@Nullable String empfaengerSonstige) {
        this.empfaengerSonstige = empfaengerSonstige;
    }

    @Nullable
    public String getEmpfaengerGericht() {
        return empfaengerGericht;
    }

    public void setEmpfaengerGericht(@Nullable String empfaengerGericht) {
        this.empfaengerGericht = empfaengerGericht;
    }

    @Nullable
    public String getEmpfaengerRvTraeger() {
        return empfaengerRvTraeger;
    }

    public void setEmpfaengerRvTraeger(@Nullable String empfaengerRvTraeger) {
        this.empfaengerRvTraeger = empfaengerRvTraeger;
    }

    @Nullable
    public String getEmpfaengerPolizei() {
        return empfaengerPolizei;
    }

    public void setEmpfaengerPolizei(@Nullable String empfaengerPolizei) {
        this.empfaengerPolizei = empfaengerPolizei;
    }
}

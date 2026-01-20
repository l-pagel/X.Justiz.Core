package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import org.jetbrains.annotations.Nullable;

/**
 * Auswahlstruktur für Adressen (Absender oder Empfänger).
 * <p>
 *  <u><b>Address selection:</b></u> Selection structure for addresses (sender or receiver).
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AuswahlAdresse {

    /**
     * Anschrift oder Beschreibung des Absenders.
     * <p>
     *  <u><b>Sender other:</b></u> Address or description of the sender.
     */
    @XmlElement(name = "absender.sonstige", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "absender.sonstige", namespace = "http://www.xjustiz.de")
    @JsonProperty("AbsenderSonstige")
    @Nullable
    private String absenderSonstige;

    /**
     * Anschrift oder Beschreibung des Empfängers.
     * <p>
     *  <u><b>Recipient other:</b></u> Address or description of the recipient.
     */
    @XmlElement(name = "empfaenger.sonstige", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.sonstige", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerSonstige")
    @Nullable
    private String empfaengerSonstige;

    /**
     * Anschrift oder CodeValue des empfangenden Gerichts. Die Verwendung des Codes sollte der Anschrift bevorzugt werden. Der CodeValue des Gerichts. Diese Codeliste enthält Name und Anschrift des Gerichts.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     * <p>
     *  <u><b>Recipient court:</b></u> Address or code of the receiving court. The use of the code should be preferred over the address. The code of the court. This code list contains the name and address of the court. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'CodeValue lists of code type 3'.
     */
    @XmlElement(name = "empfaenger.gericht", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.gericht", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerGericht")
    @Nullable
    private String empfaengerGericht;

    /**
     * Anschrift oder CodeValue des empfangenden Rentenversicherungsträgers. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der CodeValue des Rentenversicherungsträgers. Diese Codeliste enthält Name und Anschrift des Rentenversicherungsträgers.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     * <p>
     *  <u><b>Recipient pension insurance carrier:</b></u> Address or code of the receiving pension insurance carrier. The use of the code should be preferred over the address. The code of the pension insurance carrier. This code list contains the name and address of the pension insurance carrier. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'CodeValue lists of code type 3'.
     */
    @XmlElement(name = "empfaenger.rvTraeger", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.rvTraeger", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerRvTraeger")
    @Nullable
    private String empfaengerRvTraeger;

    /**
     * Anschrift oder CodeValue der empfangenden Polizeibehörde. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der CodeValue der Polizeibehörde. Diese Codeliste enthält Name und Anschrift der Polizeibehörden.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     * <p>
     *  <u><b>Recipient police authority:</b></u> Address or code of the receiving police authority. The use of the code should be preferred over the address. The code of the police authority. This code list contains the name and address of the police authorities. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'CodeValue lists of code type 3'.
     */
    @XmlElement(name = "empfaenger.polizeibehoerde", namespace = "http://www.xjustiz.de")
    @JacksonXmlProperty(localName = "empfaenger.polizeibehoerde", namespace = "http://www.xjustiz.de")
    @JsonProperty("EmpfaengerPolizei")
    @Nullable
    private String empfaengerPolizei;

    /**
     * Default constructor.
     */
    public AuswahlAdresse() {
    }

    /**
     * Anschrift oder Beschreibung des Absenders.
     *
     * @return the absenderSonstige
     */
    @Nullable
    public String getAbsenderSonstige() {
        return absenderSonstige;
    }

    /**
     * Sets the absenderSonstige.
     *
     * @param absenderSonstige the absenderSonstige to set
     */
    public void setAbsenderSonstige(@Nullable String absenderSonstige) {
        this.absenderSonstige = absenderSonstige;
    }

    /**
     * Anschrift oder Beschreibung des Empfängers.
     *
     * @return the empfaengerSonstige
     */
    @Nullable
    public String getEmpfaengerSonstige() {
        return empfaengerSonstige;
    }

    /**
     * Sets the empfaengerSonstige.
     *
     * @param empfaengerSonstige the empfaengerSonstige to set
     */
    public void setEmpfaengerSonstige(@Nullable String empfaengerSonstige) {
        this.empfaengerSonstige = empfaengerSonstige;
    }

    /**
     * Anschrift oder CodeValue des empfangenden Gerichts. Die Verwendung des Codes sollte der Anschrift bevorzugt werden. Der CodeValue des Gerichts. Diese Codeliste enthält Name und Anschrift des Gerichts.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     *
     * @return the empfaengerGericht
     */
    @Nullable
    public String getEmpfaengerGericht() {
        return empfaengerGericht;
    }

    /**
     * Sets the empfaengerGericht.
     *
     * @param empfaengerGericht the empfaengerGericht to set
     */
    public void setEmpfaengerGericht(@Nullable String empfaengerGericht) {
        this.empfaengerGericht = empfaengerGericht;
    }

    /**
     * Anschrift oder CodeValue des empfangenden Rentenversicherungsträgers. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der CodeValue des Rentenversicherungsträgers. Diese Codeliste enthält Name und Anschrift des Rentenversicherungsträgers.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     *
     * @return the empfaengerRvTraeger
     */
    @Nullable
    public String getEmpfaengerRvTraeger() {
        return empfaengerRvTraeger;
    }

    /**
     * Sets the empfaengerRvTraeger.
     *
     * @param empfaengerRvTraeger the empfaengerRvTraeger to set
     */
    public void setEmpfaengerRvTraeger(@Nullable String empfaengerRvTraeger) {
        this.empfaengerRvTraeger = empfaengerRvTraeger;
    }

    /**
     * Anschrift oder CodeValue der empfangenden Polizeibehörde. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der CodeValue der Polizeibehörde. Diese Codeliste enthält Name und Anschrift der Polizeibehörden.Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.
     *
     * @return the empfaengerPolizei
     */
    @Nullable
    public String getEmpfaengerPolizei() {
        return empfaengerPolizei;
    }

    /**
     * Sets the empfaengerPolizei.
     *
     * @param empfaengerPolizei the empfaengerPolizei to set
     */
    public void setEmpfaengerPolizei(@Nullable String empfaengerPolizei) {
        this.empfaengerPolizei = empfaengerPolizei;
    }

}

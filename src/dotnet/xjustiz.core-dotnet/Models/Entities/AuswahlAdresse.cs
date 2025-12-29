namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Adressen (Absender oder Empfänger).
/// Selection structure for addresses (sender or receiver).
/// </summary>
public class AuswahlAdresse
{
    /// <summary>
    /// Anschrift oder Beschreibung des Absenders.
    /// Address or description of the sender.
    /// </summary>
    [XmlElement("absender.sonstige", Namespace = XJustizExport.Tns)]
    public string? AbsenderSonstige { get; set; }

    /// <summary>
    /// Anschrift oder Beschreibung des Empfängers.
    /// Address or description of the recipient.
    /// </summary>
    [XmlElement("empfaenger.sonstige", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerSonstige { get; set; }

    /// <summary>
    /// Anschrift oder Code des empfangenden Gerichts. Die Verwendung des Codes sollte der Anschrift bevorzugt werden. Der Code des Gerichts. Diese Codeliste enthält Name und Anschrift des Gerichts.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// Address or code of the receiving court. The use of the code should be preferred over the address. The code of the court. This code list contains the name and address of the court. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'Code lists of code type 3'.
    /// </summary>
    [XmlElement("empfaenger.gericht", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerGericht { get; set; }

    /// <summary>
    /// Anschrift oder Code des empfangenden Rentenversicherungsträgers. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der Code des Rentenversicherungsträgers. Diese Codeliste enthält Name und Anschrift des Rentenversicherungsträgers.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// Address or code of the receiving pension insurance carrier. The use of the code should be preferred over the address. The code of the pension insurance carrier. This code list contains the name and address of the pension insurance carrier. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'Code lists of code type 3'.
    /// </summary>
    [XmlElement("empfaenger.rvTraeger", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerRvTraeger { get; set; }

    /// <summary>
    /// Anschrift oder Code der empfangenden Polizeibehörde. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der Code der Polizeibehörde. Diese Codeliste enthält Name und Anschrift der Polizeibehörden.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// Address or code of the receiving police authority. The use of the code should be preferred over the address. The code of the police authority. This code list contains the name and address of the police authorities. The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'Code lists of code type 3'.
    /// </summary>
    [XmlElement("empfaenger.polizeibehoerde", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerPolizei { get; set; }
}

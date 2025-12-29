namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Auswahlstruktur für Adressen (Absender oder Empfänger).
/// </summary>
public class AuswahlAdresse
{
    /// <summary>
    /// Anschrift oder Beschreibung des Absenders.
    /// </summary>
    [XmlElement("absender.sonstige", Namespace = XJustizExport.Tns)]
    public string? AbsenderSonstige { get; set; }

    /// <summary>
    /// Anschrift oder Beschreibung des Empfängers.
    /// </summary>
    [XmlElement("empfaenger.sonstige", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerSonstige { get; set; }

    /// <summary>
    /// Anschrift oder Code des empfangenden Gerichts. Die Verwendung des Codes sollte der Anschrift bevorzugt werden. Der Code des Gerichts. Diese Codeliste enthält Name und Anschrift des Gerichts.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("empfaenger.gericht", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerGericht { get; set; }

    /// <summary>
    /// Anschrift oder Code des empfangenden Rentenversicherungsträgers. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der Code des Rentenversicherungsträgers. Diese Codeliste enthält Name und Anschrift des Rentenversicherungsträgers.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("empfaenger.rvTraeger", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerRvTraeger { get; set; }

    /// <summary>
    /// Anschrift oder Code der empfangenden Polizeibehörde. Die Verwendung des Codes sollte der Anschrift bevorzugt werden.Der Code der Polizeibehörde. Diese Codeliste enthält Name und Anschrift der Polizeibehörden.Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("empfaenger.polizeibehoerde", Namespace = XJustizExport.Tns)]
    public string? EmpfaengerPolizei { get; set; }
}

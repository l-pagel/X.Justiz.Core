namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;

/// <summary>
/// Der Kopf der Nachricht.
/// </summary>
public class Nachrichtenkopf
{
    /// <summary>
    /// Verwendete X.Justiz-Version für diese Nachricht.
    /// </summary>
    [XmlAttribute("xjustizVersion")]
    public string Version { get; set; } = "3.5.1";

    /// <summary>
    /// Aktenzeichen des Absenders.
    /// </summary>
    [XmlElement("aktenzeichen.absender", Namespace = XJustizExport.Tns, Order = 1)]
    public string[]? AktenzeichenAbsender { get; set; }

    /// <summary>
    /// Aktenzeichen des Empfängers.
    /// </summary>
    [XmlElement("aktenzeichen.empfaenger", Namespace = XJustizExport.Tns, Order = 2)]
    public string[]? AktenzeichenEmpfaenger { get; set; }

    /// <summary>
    /// Hier ist der Erstellungszeitpunkt der XJustiz-Nachricht einzutragen.
    /// </summary>
    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, Order = 3)]
    public DateTime Erstellungszeitpunkt { get; set; }

    /// <summary>
    /// Auswahlstruktur für Adressen (Absender oder Empfänger).
    /// </summary>
    [XmlElement("auswahl_absender", Namespace = XJustizExport.Tns, Order = 4)]
    public AuswahlAdresse Absender { get; set; } = new();

    /// <summary>
    /// Auswahlstruktur für Adressen (Absender oder Empfänger).
    /// </summary>
    [XmlElement("auswahl_empfaenger", Namespace = XJustizExport.Tns, Order = 5)]
    public AuswahlAdresse Empfaenger { get; set; } = new();

    /// <summary>
    /// Hier ist eine eindeutige Identifikation der bei diesem Übermittlungsvorgang erstellten Nachricht anzugeben, um spätere Referenzen zu ermöglichen.
    /// </summary>
    [XmlElement("eigeneNachrichtenID", Namespace = XJustizExport.Tns, Order = 6)]
    public string? EigeneNachrichtenId { get; set; }
}

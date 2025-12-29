namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;

/// <summary>
/// Der Kopf der Nachricht.
/// The header of the message.
/// </summary>
public class Nachrichtenkopf
{
    /// <summary>
    /// Die XJustiz-Version.
    /// The XJustiz version.
    /// </summary>
    [XmlAttribute("xjustizVersion")]
    public string Version { get; set; } = "3.5.1";

    /// <summary>
    /// Aktenzeichen des Absenders.
    /// File reference of the sender.
    /// </summary>
    [XmlElement("aktenzeichen.absender", Namespace = XJustizExport.Tns, Order = 1)]
    public string[]? AktenzeichenAbsender { get; set; }

    /// <summary>
    /// Aktenzeichen des Empfängers.
    /// File reference of the receiver.
    /// </summary>
    [XmlElement("aktenzeichen.empfaenger", Namespace = XJustizExport.Tns, Order = 2)]
    public string[]? AktenzeichenEmpfaenger { get; set; }

    /// <summary>
    /// Zeitpunkt der Erstellung.
    /// Time of creation.
    /// </summary>
    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, Order = 3)]
    public DateTime Erstellungszeitpunkt { get; set; }

    /// <summary>
    /// Auswahl des Absenders.
    /// Selection of the sender.
    /// </summary>
    [XmlElement("auswahl_absender", Namespace = XJustizExport.Tns, Order = 4)]
    public AuswahlAdresse Absender { get; set; } = new();

    /// <summary>
    /// Auswahl des Empfängers.
    /// Selection of the receiver.
    /// </summary>
    [XmlElement("auswahl_empfaenger", Namespace = XJustizExport.Tns, Order = 5)]
    public AuswahlAdresse Empfaenger { get; set; } = new();

    /// <summary>
    /// Eine eigene Nachrichten-ID.
    /// An own message ID.
    /// </summary>
    [XmlElement("eigeneNachrichtenID", Namespace = XJustizExport.Tns, Order = 6)]
    public string? EigeneNachrichtenId { get; set; }
}

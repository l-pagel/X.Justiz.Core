namespace xjustiz.core_dotnet.Models.Entities;

using System;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Kopf der Nachricht.<br/>
/// <u><b>Message header:</b></u> The header of the message.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Nachrichtenkopf
{
    /// <summary>
    /// Verwendete X.Justiz-Version für diese Nachricht.<br/>
    /// <u><b>XJustiz version:</b></u> Used X.Justiz version for this message.
    /// </summary>
    [XmlAttribute("xjustizVersion")]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string Version { get; set; } = "3.5.1";

    /// <summary>
    /// Aktenzeichen des Absenders.<br/>
    /// <u><b>Sender file reference:</b></u> File reference of the sender.
    /// </summary>
    [XmlElement("aktenzeichen.absender", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string[]? AktenzeichenAbsender { get; set; }

    /// <summary>
    /// Aktenzeichen des Empfängers.<br/>
    /// <u><b>Recipient file reference:</b></u> File reference of the recipient.
    /// </summary>
    [XmlElement("aktenzeichen.empfaenger", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string[]? AktenzeichenEmpfaenger { get; set; }

    /// <summary>
    /// Hier ist der Erstellungszeitpunkt der XJustiz-Nachricht einzutragen.<br/>
    /// <u><b>Creation time:</b></u> The creation time of the XJustiz message must be entered here.
    /// </summary>
    [XmlElement("erstellungszeitpunkt", Namespace = XJustizConstants.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public DateTime Erstellungszeitpunkt { get; set; }

    /// <summary>
    /// Auswahlstruktur für Adressen (Absender oder Empfänger).<br/>
    /// <u><b>Sender:</b></u> Selection structure for addresses (sender or receiver).
    /// </summary>
    [XmlElement("auswahl_absender", Namespace = XJustizConstants.Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public AuswahlAdresse Absender { get; set; } = new();

    /// <summary>
    /// Auswahlstruktur für Adressen (Absender oder Empfänger).<br/>
    /// <u><b>Recipient:</b></u> Selection structure for addresses (sender or receiver).
    /// </summary>
    [XmlElement("auswahl_empfaenger", Namespace = XJustizConstants.Tns, Order = 5)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public AuswahlAdresse Empfaenger { get; set; } = new();

    /// <summary>
    /// Hier ist eine eindeutige Identifikation der bei diesem Übermittlungsvorgang erstellten Nachricht anzugeben, um spätere Referenzen zu ermöglichen.<br/>
    /// <u><b>Own message ID:</b></u> A unique identification of the message created during this transmission process must be specified here to enable later references.
    /// </summary>
    [XmlElement("eigeneNachrichtenID", Namespace = XJustizConstants.Tns, Order = 6)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? EigeneNachrichtenId { get; set; }
}

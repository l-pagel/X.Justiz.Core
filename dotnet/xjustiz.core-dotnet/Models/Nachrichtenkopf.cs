namespace xjustiz.core_dotnet.Models;

using System;
using System.Xml.Serialization;

public class Nachrichtenkopf
{
    [XmlAttribute("xjustizVersion")]
    public string Version { get; set; } = "3.5.1";

    [XmlElement("aktenzeichen.absender", Namespace = XJustizExport.Tns, Order = 1)]
    public string[]? AktenzeichenAbsender { get; set; }

    [XmlElement("aktenzeichen.empfaenger", Namespace = XJustizExport.Tns, Order = 2)]
    public string[]? AktenzeichenEmpfaenger { get; set; }

    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, Order = 3)]
    public DateTime Erstellungszeitpunkt { get; set; }

    [XmlElement("auswahl_absender", Namespace = XJustizExport.Tns, Order = 4)]
    public AuswahlAdresse Absender { get; set; } = new();

    [XmlElement("auswahl_empfaenger", Namespace = XJustizExport.Tns, Order = 5)]
    public AuswahlAdresse Empfaenger { get; set; } = new();

    [XmlElement("eigeneNachrichtenID", Namespace = XJustizExport.Tns, Order = 6)]
    public string? EigeneNachrichtenId { get; set; }
}

namespace xjustiz.core_dotnet.Models;

using System;
using System.Xml.Serialization;

/// <summary>
/// Repräsentiert ein Dokument.
/// Represents a document.
/// </summary>
public class Dokument
{
    /// <summary>
    /// Die Identifikation des Dokuments.
    /// The identification of the document.
    /// </summary>
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    public Identifikation Identifikation { get; set; } = new();

    /// <summary>
    /// Fachspezifische Daten des Dokuments.
    /// Specialized data of the document.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 2)]
    public XjustizFachspezifischeDaten FachspezifischeDaten { get; set; } = new();

    /// <summary>
    /// Der Erstellungszeitpunkt des Dokuments.
    /// The creation time of the document.
    /// </summary>
    [XmlElement("erstellungszeitpunkt", Namespace = XJustizExport.Tns, DataType = "dateTime", Order = 3)]
    public DateTime? Erstellungszeitpunkt { get; set; }
}

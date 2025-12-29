namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Enthält Listen von Schriftgutobjekten (Akten und Dokumente).
/// </summary>
public class Schriftgutobjekte
{
    /// <summary>
    /// Repräsentiert eine Akte.
    /// </summary>
    [XmlElement("akte", Namespace = XJustizExport.Tns)]
    public List<Akte>? Akte { get; set; }
    /// <summary>
    /// In diesem Element sollen alle Dokumente aufgeführt werden, die im Rahmen des konkreten Kommunikationsanlasses übermittelt werden. Die XJustiz-Nachricht selbst soll nicht aufgeführt werden, da sie lediglich der Beschreibung des Inhalts der Übermittlung dient.
    /// </summary>
    [XmlElement("dokument", Namespace = XJustizExport.Tns)]
    public List<Dokument>? Dokumente { get; set; }
}

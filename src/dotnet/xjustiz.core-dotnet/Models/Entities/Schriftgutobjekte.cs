namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Enthält Listen von Schriftgutobjekten (Akten und Dokumente).
/// Contains lists of document objects (files/cases and documents).
/// </summary>
public class Schriftgutobjekte
{
    /// <summary>
    /// Liste von Akten.
    /// List of files/cases.
    /// </summary>
    [XmlElement("akte", Namespace = XJustizExport.Tns)]
    public List<Akte>? Akte { get; set; }

    /// <summary>
    /// Liste von Dokumenten.
    /// List of documents.
    /// </summary>
    [XmlElement("dokument", Namespace = XJustizExport.Tns)]
    public List<Dokument>? Dokumente { get; set; }
}

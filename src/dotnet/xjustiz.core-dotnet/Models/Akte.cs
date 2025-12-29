namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Akte.
/// Represents a file / case.
/// </summary>
public class Akte
{
    /// <summary>
    /// Die Identifikation der Akte.
    /// The identification of the file.
    /// </summary>
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    public Identifikation Identifikation { get; set; } = new();

    /// <summary>
    /// Anwendungsspezifische Erweiterungen.
    /// Application-specific extensions.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = XJustizExport.Tns, Order = 2)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }

    /// <summary>
    /// Fachspezifische Daten der Akte.
    /// Specialized data of the file.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 3)]
    public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();
}

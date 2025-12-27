namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Fachspezifische Daten eines Dokuments.
/// Specialized data of a document.
/// </summary>
public class XjustizFachspezifischeDaten
{
    /// <summary>
    /// Die Dokumentklasse.
    /// The document class.
    /// </summary>
    [XmlElement("dokumentklasse", Namespace = XJustizExport.Tns, Order = 1)]
    public DokumentklasseCode? Dokumentklasse { get; set; }

    /// <summary>
    /// Die eigentliche Datei-Referenz.
    /// The actual file reference.
    /// </summary>
    [XmlElement("datei", Namespace = XJustizExport.Tns, Order = 2)]
    public Datei Datei { get; set; } = new();
}

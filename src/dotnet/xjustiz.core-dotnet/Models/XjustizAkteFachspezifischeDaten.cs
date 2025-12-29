namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities;

/// <summary>
/// Fachspezifische Daten einer Akte.
/// Specialized data of a file/case.
/// </summary>
public class XjustizAkteFachspezifischeDaten
{
    /// <summary>
    /// Der Typ der Akte.
    /// The type of the file.
    /// </summary>
    [XmlElement("aktentyp", Namespace = XJustizExport.Tns, Order = 1)]
    public Aktentyp Aktentyp { get; set; } = new();

    /// <summary>
    /// Der Anzeigename der Akte.
    /// The display name of the file.
    /// </summary>
    [XmlElement("anzeigename", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Anzeigename { get; set; }

    /// <summary>
    /// Das Aktenzeichen der Akte.
    /// The file reference of the file.
    /// </summary>
    [XmlElement("aktenzeichen", Namespace = XJustizExport.Tns, Order = 3)]
    public Aktenzeichen Aktenzeichen { get; set; } = new();
}

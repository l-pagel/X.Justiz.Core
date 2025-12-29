namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Entities;

/// <summary>
/// Fachspezifische Daten einer Akte.
/// </summary>
public class XjustizAkteFachspezifischeDaten
{
    /// <summary>
    /// Bezeichnet den Aktentyp anhand der vorgegebenen Werteliste. Diese ist für einen reibungslosen Austausch bewusst knappgehalten. Für eine spezifischere Bezeichnung kann das Feld "anzeigename" verwendet werden.
    /// </summary>
    [XmlElement("aktentyp", Namespace = XJustizExport.Tns, Order = 1)]
    public Aktentyp Aktentyp { get; set; } = new();

    /// <summary>
    /// Der Anzeigename ermöglicht als Freitext die Übermittlung der Bezeichnung der Akte, wie sie im versendenden System angezeigt wird. Hier können spezifischere Informationen zum Aktennamen übermittelt werden, als dies im Rahmen der Werteliste zum Aktentyp möglich ist, z.B. "Asylakte" als nähere Spezifizierung des Aktentyps "Behördenakte".
    /// </summary>
    [XmlElement("anzeigename", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Anzeigename { get; set; }
    /// <summary>
    /// Hier steht das Aktenzeichen, unter dem die Station (siehe oben) das Verfahren führt.
    /// </summary>
    [XmlElement("aktenzeichen", Namespace = XJustizExport.Tns, Order = 3)]
    public Aktenzeichen Aktenzeichen { get; set; } = new();
}

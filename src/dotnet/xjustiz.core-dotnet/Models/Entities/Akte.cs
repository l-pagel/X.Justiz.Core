namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Akte.
/// </summary>
public class Akte
{
    /// <summary>
    /// Der Typ dient der eindeutigen Kennzeichnung von Schriftgutobjekten und entspricht dem xdomea-Typ 'IdentifikationObjektType'.
    /// </summary>
    [XmlElement("identifikation", Namespace = XJustizExport.Tns, Order = 1)]
    public Identifikation Identifikation { get; set; } = new();
    /// <summary>
    /// In dieser Elementgruppe können Felder und/oder Feldgruppen, in denen mehrere Felder zusammengefasst sind, übermittelt werden. Da es hierfür keine festen Schema-Vorgaben gibt, darf diese Elementgruppe nur verwendet werden, wenn mit dem jeweiligen Kommunikationspartner Name und Inhalt der Felder und/oder Feldgruppen abgestimmt wurden. Es kann nicht davon ausgegangen werden, dass die hier hinterlegten Metadaten von Kommunikationspartnern, mit denen keine Absprachen erfolgten, ausgelesen werden können.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = XJustizExport.Tns, Order = 2)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }

    /// <summary>
    /// Fachspezifische Daten einer Akte.
    /// </summary>
    [XmlElement("xjustiz.fachspezifischeDaten", Namespace = XJustizExport.Tns, Order = 3)]
    public XjustizAkteFachspezifischeDaten FachspezifischeDaten { get; set; } = new();
}

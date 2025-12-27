namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Daten zur Instanz.
/// Data regarding the instance.
/// </summary>
public class Instanzdaten
{
    /// <summary>
    /// Die Instanznummer (z.B. "1").
    /// The instance number (e.g., "1").
    /// </summary>
    [XmlElement("instanznummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Instanznummer { get; set; }

    /// <summary>
    /// Ein Zusatz zum Sachgebiet.
    /// A supplement to the subject area.
    /// </summary>
    [XmlElement("sachgebietszusatz", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Sachgebietszusatz { get; set; }

    /// <summary>
    /// Die Instanzbehörde (Gericht).
    /// The instance authority (court).
    /// </summary>
    [XmlElement("auswahl_instanzbehoerde", Namespace = XJustizExport.Tns, Order = 3)]
    public AuswahlInstanzbehoerde? AuswahlInstanzbehoerde { get; set; }
}

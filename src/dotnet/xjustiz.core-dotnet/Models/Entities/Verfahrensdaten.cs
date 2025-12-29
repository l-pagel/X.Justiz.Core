namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Daten zum Verfahren.
/// Data regarding the proceeding.
/// </summary>
public class Verfahrensdaten
{
    /// <summary>
    /// Die Verfahrensnummer.
    /// The proceeding number.
    /// </summary>
    [XmlElement("verfahrensnummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Verfahrensnummer { get; set; }

    /// <summary>
    /// Daten zur aktuellen Instanz.
    /// Data regarding the current instance.
    /// </summary>
    [XmlElement("instanzdaten", Namespace = XJustizExport.Tns, Order = 2)]
    public Instanzdaten? Instanzdaten { get; set; }

    /// <summary>
    /// Liste der Beteiligten.
    /// List of participants.
    /// </summary>
    [XmlElement("beteiligung", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Beteiligung>? Beteiligungen { get; set; }
}

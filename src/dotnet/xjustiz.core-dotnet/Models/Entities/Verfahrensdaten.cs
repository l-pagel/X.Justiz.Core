namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Daten zum Verfahren.
/// </summary>
public class Verfahrensdaten
{
    /// <summary>
    /// Die Verfahrensnummer ist eine eindeutige Kennzeichnung, die für das Verfahren über alle Stationen hinweg gelten soll und neben dem Aktenzeichen übermittelt werden kann. Sie kann beispielsweise in einem Fachverfahren zur eindeutigen Identifikation des Verfahrens verwendet werden.
    /// </summary>
    [XmlElement("verfahrensnummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Verfahrensnummer { get; set; }

    /// <summary>
    /// Die Instanzdaten enthalten Informationen zu den Stationen, die ein Vorgang durchlaufen hat. Dies kann ein Gericht, eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein.
    /// </summary>
    [XmlElement("instanzdaten", Namespace = XJustizExport.Tns, Order = 2)]
    public Instanzdaten? Instanzdaten { get; set; }

    /// <summary>
    /// Für jede Beteiligung gibt es genau einen Beteiligten. Dieser kann mehrere Rollen haben.
    /// </summary>
    [XmlElement("beteiligung", Namespace = XJustizExport.Tns, Order = 3)]
    public List<Beteiligung>? Beteiligungen { get; set; }
}

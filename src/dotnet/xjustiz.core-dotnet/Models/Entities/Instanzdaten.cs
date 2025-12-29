namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Daten zur Instanz.
/// </summary>
public class Instanzdaten
{
    /// <summary>
    /// Das Element dient als Schlüsselfeld für interne Referenzierungen. Die Instanznummer muss für das aktuelle XML-Instanzdokument eindeutig sein und identifiziert die jeweiligen Instanzdaten.
    /// </summary>
    [XmlElement("instanznummer", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Instanznummer { get; set; }
    /// <summary>
    /// Möglichkeit für zusätzliche Angaben bezüglich des Sachgebiets.
    /// </summary>
    [XmlElement("sachgebietszusatz", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Sachgebietszusatz { get; set; }
    /// <summary>
    /// Die auszuwählende Instanzbehörde ist eine Station, die der Vorgang durchlaufen hat. Dies kann ein Gericht oder eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein. Meist entspricht es dem Gericht (der Staatsanwaltschaft), an das (die) die Nachricht adressiert wird. Darüber hinaus können weitere Behörden (z.B. Gericht der Vorinstanz, Polizei in Strafverfahren), die den Vorgang/das Verfahren bereits bearbeitet haben, angegeben werden.
    /// </summary>
    [XmlElement("auswahl_instanzbehoerde", Namespace = XJustizExport.Tns, Order = 3)]
    public AuswahlInstanzbehoerde? AuswahlInstanzbehoerde { get; set; }
}

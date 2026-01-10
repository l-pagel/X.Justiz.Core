namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Daten zur Instanz.<br/>
/// <u><b>Instance data:</b></u> Data regarding the instance.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_1_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Instanzdaten
{
    /// <summary>
    /// Das Element dient als Schlüsselfeld für interne Referenzierungen. Die Instanznummer muss für das aktuelle XML-Instanzdokument eindeutig sein und identifiziert die jeweiligen Instanzdaten.<br/>
    /// <u><b>Instance number:</b></u> The element serves as a key field for internal referencing. The instance number must be unique for the current XML instance document and identifies the respective instance data.
    /// </summary>
    [XmlElement("instanznummer", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Instanznummer { get; set; }

    /// <summary>
    /// Möglichkeit für zusätzliche Angaben bezüglich des Sachgebiets.<br/>
    /// <u><b>Subject area addition:</b></u> Opportunity for additional information regarding the subject area.
    /// </summary>
    [XmlElement("sachgebietszusatz", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Sachgebietszusatz { get; set; }

    /// <summary>
    /// Die auszuwählende Instanzbehörde ist eine Station, die der Vorgang durchlaufen hat. Dies kann ein Gericht oder eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein. Meist entspricht es dem Gericht (der Staatsanwaltschaft), an das (die) die Nachricht adressiert wird. Darüber hinaus können weitere Behörden (z.B. Gericht der Vorinstanz, Polizei in Strafverfahren), die den Vorgang/das Verfahren bereits bearbeitet haben, angegeben werden.<br/>
    /// <u><b>Instance authority selection:</b></u> The instance authority to be selected is a station that the process has passed through. This can be a court or a public prosecutor's office, a judicial authority, but also another authority. Usually, it corresponds to the court (public prosecutor's office) to which the message is addressed. Furthermore, other authorities (e.g., court of the previous instance, police in criminal proceedings) that have already processed the process/proceeding can be specified.
    /// </summary>
    [XmlElement("auswahl_instanzbehoerde", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V3_1_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public AuswahlInstanzbehoerde? AuswahlInstanzbehoerde { get; set; }
}

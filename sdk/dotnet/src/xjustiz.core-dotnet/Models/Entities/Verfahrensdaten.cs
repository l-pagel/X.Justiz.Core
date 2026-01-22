namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Daten zum Verfahren.<br/>
/// <u><b>Procedural data:</b></u> Data regarding the proceeding.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Verfahrensdaten
{
    /// <summary>
    /// Die Verfahrensnummer ist eine eindeutige Kennzeichnung, die für das Verfahren über alle Stationen hinweg gelten soll und neben dem Aktenzeichen übermittelt werden kann. Sie kann beispielsweise in einem Fachverfahren zur eindeutigen Identifikation des Verfahrens verwendet werden.<br/>
    /// <u><b>Proceeding number:</b></u> The proceeding number is a unique identifier that is intended to apply to the proceeding across all stations and can be transmitted alongside the file reference. It can be used, for example, in a specialized procedure for the unique identification of the proceeding.
    /// </summary>
    [XmlElement("verfahrensnummer", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Verfahrensnummer { get; set; }

    /// <summary>
    /// Die Instanzdaten enthalten Informationen zu den Stationen, die ein Vorgang durchlaufen hat. Dies kann ein Gericht, eine Staatsanwaltschaft, eine Justizbehörde, aber auch eine andere Behörde sein.<br/>
    /// <u><b>Instance data:</b></u> The instance data contains information about the stations that a process has passed through. This can be a court, a public prosecutor's office, a judicial authority, but also another authority.
    /// </summary>
    [XmlElement("instanzdaten", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Instanzdaten? Instanzdaten { get; set; }

    /// <summary>
    /// Für jede Beteiligung gibt es genau einen Beteiligten. Dieser kann mehrere Rollen haben.<br/>
    /// <u><b>Participations:</b></u> For each participation, there is exactly one participant. This participant can have multiple roles.
    /// </summary>
    [XmlElement("beteiligung", Namespace = SchemeConstants.XJustiz_Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public List<Beteiligung>? Beteiligungen { get; set; }
}

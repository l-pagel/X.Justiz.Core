namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Verknüpft eine Rolle mit einem Beteiligten.
/// Associates a role with a participant.
/// </summary>
public class Beteiligung
{
    /// <summary>
    /// Die Rolle des Beteiligten.
    /// The role of the participant.
    /// </summary>
    [XmlElement("rolle", Namespace = XJustizExport.Tns, Order = 1)]
    public Rolle Rolle { get; set; } = new();

    /// <summary>
    /// Der Beteiligte selbst.
    /// The participant itself.
    /// </summary>
    [XmlElement("beteiligter", Namespace = XJustizExport.Tns, Order = 2)]
    public Beteiligter Beteiligter { get; set; } = new();
}

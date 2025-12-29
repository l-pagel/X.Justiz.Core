namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Rolle in einem Verfahren.
/// </summary>
public class Rolle
{
    /// <summary>
    /// Hier kann die fachliche Bezeichnung der Rolle des Beteiligten beschrieben werden.
    /// </summary>
    [XmlElement("rollenbezeichnung", Namespace = XJustizExport.Tns)]
    public Rollenbezeichnung Rollenbezeichnung { get; set; } = new();
}

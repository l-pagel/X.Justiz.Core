namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Rolle in einem Verfahren.
/// Represents a role in a proceeding.
/// </summary>
public class Rolle
{
    /// <summary>
    /// Die Bezeichnung der Rolle.
    /// The designation of the role.
    /// </summary>
    [XmlElement("rollenbezeichnung", Namespace = XJustizExport.Tns)]
    public Rollenbezeichnung Rollenbezeichnung { get; set; } = new();
}

namespace xjustiz.core_dotnet.Models;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Eine Organisation (juristische Person).
/// An organization (legal entity).
/// </summary>
public class Organisation
{
    /// <summary>
    /// Die Bezeichnung der Organisation.
    /// The designation of the organization.
    /// </summary>
    [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
    public Bezeichnung? Bezeichnung { get; set; }

    /// <summary>
    /// Die Anschrift der Organisation.
    /// The address of the organization.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Telekommunikationsverbindungen der Organisation.
    /// Telecommunication connections of the organization.
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Bankverbindung der Organisation.
    /// Bank account of the organization.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

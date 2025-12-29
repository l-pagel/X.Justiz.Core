namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Eine natürliche Person.
/// A natural person.
/// </summary>
public class NatuerlichePerson
{
    /// <summary>
    /// Der volle Name der Person.
    /// The full name of the person.
    /// </summary>
    [XmlElement("vollerName", Namespace = XJustizExport.Tns)]
    public VollerName VollerName { get; set; } = new();

    /// <summary>
    /// Das Geschlecht der Person.
    /// The gender of the person.
    /// </summary>
    [XmlElement("geschlecht", Namespace = XJustizExport.Tns)]
    public Geschlecht Geschlecht { get; set; } = new();

    /// <summary>
    /// Die Anschrift der Person.
    /// The address of the person.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    [XJustizCore]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Telekommunikationsverbindungen der Person.
    /// Telecommunication connections of the person.
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Bankverbindung der Person.
    /// Bank account of the person.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

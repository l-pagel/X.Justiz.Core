namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Eine natürliche Person.
/// </summary>
public class NatuerlichePerson
{
    /// <summary>
    /// Der volle Name einer natürlichen Person.
    /// </summary>
    [XmlElement("vollerName", Namespace = XJustizExport.Tns)]
    public VollerName VollerName { get; set; } = new();

    /// <summary>
    /// Hier kann ein biologisches oder grammatikalisches Geschlecht angegeben werden. So wird den Fachsystemen ermöglicht eine Anrede zu generieren.
    /// </summary>
    [XmlElement("geschlecht", Namespace = XJustizExport.Tns)]
    public Geschlecht Geschlecht { get; set; } = new();
    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    [XJustizCore]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.). Information on telecommunication (phone, email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }
    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

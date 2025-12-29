namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Eine Organisation (juristische Person).
/// </summary>
public class Organisation
{
    /// <summary>
    /// Kanzleiname
    /// </summary>
    [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
    public Bezeichnung? Bezeichnung { get; set; }
    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }
    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

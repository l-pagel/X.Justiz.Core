namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;

/// <summary>
/// Eine Organisation (juristische Person).
/// An organization (legal entity).
/// </summary>
public class Organisation
{
    /// <summary>
    /// Kanzleiname
    /// Law firm name
    /// </summary>
    [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
    public Bezeichnung? Bezeichnung { get; set; }

    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.
    /// Post office box addresses also fall under this.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.).
    /// Information on telecommunication (phone, email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.
    /// Here is the general bank connection.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    public Bankverbindung? Bankverbindung { get; set; }
}

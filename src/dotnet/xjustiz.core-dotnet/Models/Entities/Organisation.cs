namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Eine Organisation (juristische Person).
/// An organization (legal entity).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Organisation
{
    /// <summary>
    /// Kanzleiname
    /// Law firm name
    /// </summary>
    [XmlElement("bezeichnung", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Bezeichnung? Bezeichnung { get; set; }

    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.
    /// Post office box addresses also fall under this.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.).
    /// Information on telecommunication (phone, email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.
    /// Here is the general bank connection.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Bankverbindung? Bankverbindung { get; set; }
}

namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Eine natürliche Person.<br/>
/// <u><b>Natural person:</b></u> A natural person.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class NatuerlichePerson
{
    /// <summary>
    /// Der volle Name einer natürlichen Person.<br/>
    /// <u><b>Full name:</b></u> The full name of a natural person.
    /// </summary>
    [XmlElement("vollerName", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public VollerName VollerName { get; set; } = new();

    /// <summary>
    /// Hier kann ein biologisches oder grammatikalisches Geschlecht angegeben werden. So wird den Fachsystemen ermöglicht eine Anrede zu generieren.<br/>
    /// <u><b>Gender:</b></u> A biological or grammatical gender can be specified here. This allows specialized systems to generate a salutation.
    /// </summary>
    [XmlElement("geschlecht", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Geschlecht Geschlecht { get; set; } = new();

    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.<br/>
    /// <u><b>Address:</b></u> Post office box addresses also fall under this.
    /// </summary>
    [XmlElement("anschrift", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.).<br/>
    /// <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.<br/>
    /// <u><b>Bank details:</b></u> Here is the general bank connection.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Bankverbindung? Bankverbindung { get; set; }
}

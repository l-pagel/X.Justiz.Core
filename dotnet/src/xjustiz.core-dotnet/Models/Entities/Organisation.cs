namespace xjustiz.core_dotnet.Models.Entities;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Eine Organisation (juristische Person).<br/>
/// <u><b>Organization:</b></u> An organization (legal entity).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Organisation
{
    /// <summary>
    /// Bezeichnung / Name der Organisation.<br/>
    /// <u><b>Designation:</b></u> Name of the organization.
    /// </summary>
    [XmlElement("bezeichnung", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Bezeichnung? Bezeichnung { get; set; }

    /// <summary>
    /// Auch Postfach-Anschriften fallen hierunter.<br/>
    /// <u><b>Address:</b></u> Post office box addresses also fall under this.
    /// </summary>
    [XmlElement("anschrift", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Informationen zur Telekommunikation (Telefon, Email, etc.).<br/>
    /// <u><b>Telecommunication:</b></u> Information on telecommunication (phone, email, etc.).
    /// </summary>
    [XmlElement("telekommunikation", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public List<Telekommunikation>? Telekommunikation { get; set; }

    /// <summary>
    /// Hier steht die allgemeine Bankverbindung.<br/>
    /// <u><b>Bank details:</b></u> Here is the general bank connection.
    /// </summary>
    [XmlElement("bankverbindung", Namespace = SchemaConstants.XJustiz_Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public Bankverbindung? Bankverbindung { get; set; }
}

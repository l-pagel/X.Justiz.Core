namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Verknüpft eine Rolle mit einem Beteiligten.<br/>
/// <u><b>Participation:</b></u> Associates a role with a participant.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Beteiligung
{
    /// <summary>
    /// Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter, Zeuge, Dolmetscher, Rechtsanwalt.<br/>
    /// <u><b>Role:</b></u> Each participant can have one or more roles, e.g., plaintiff, defendant, witness, interpreter, lawyer.
    /// </summary>
    [XmlElement("rolle", Namespace = SchemeConstants.XJustiz_Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Rolle Rolle { get; set; } = new();

    /// <summary>
    /// Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder eine Organisation sein.<br/>
    /// <u><b>Participant:</b></u> A participant can be a natural person, a law firm, or an organization.
    /// </summary>
    [XmlElement("beteiligter", Namespace = SchemeConstants.XJustiz_Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Beteiligter Beteiligter { get; set; } = new();
}
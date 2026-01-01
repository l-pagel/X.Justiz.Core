namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Verknüpft eine Rolle mit einem Beteiligten.
/// Associates a role with a participant.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class Beteiligung
{
    /// <summary>
    /// Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter, Zeuge, Dolmetscher, Rechtsanwalt.
    /// Each participant can have one or more roles, e.g., plaintiff, defendant, witness, interpreter, lawyer.
    /// </summary>
    [XmlElement("rolle", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Rolle Rolle { get; set; } = new();

    /// <summary>
    /// Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder eine Organisation sein.
    /// A participant can be a natural person, a law firm, or an organization.
    /// </summary>
    [XmlElement("beteiligter", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public Beteiligter Beteiligter { get; set; } = new();
}

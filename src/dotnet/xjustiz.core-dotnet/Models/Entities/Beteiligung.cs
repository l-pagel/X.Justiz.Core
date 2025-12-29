namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Verknüpft eine Rolle mit einem Beteiligten.
/// </summary>
public class Beteiligung
{
    /// <summary>
    /// Jeder Beteiligte kann eine oder mehrere Rollen haben, z.B. Kläger, Beklagter, Zeuge, Dolmetscher, Rechtsanwalt.
    /// </summary>
    [XmlElement("rolle", Namespace = XJustizExport.Tns, Order = 1)]
    public Rolle Rolle { get; set; } = new();
    /// <summary>
    /// Ein Beteiligter kann eine natürliche Person, eine Rechtsanwaltskanzlei oder eine Organisation sein.
    /// </summary>
    [XmlElement("beteiligter", Namespace = XJustizExport.Tns, Order = 2)]
    public Beteiligter Beteiligter { get; set; } = new();
}

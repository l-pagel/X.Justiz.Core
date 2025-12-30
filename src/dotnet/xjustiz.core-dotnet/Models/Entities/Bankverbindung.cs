namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Bankverbindung.
/// Represents a bank account connection.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Bankverbindung
{
    /// <summary>
    /// Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
    /// The name only needs to be specified if the account holder is not identical to the participant.
    /// </summary>
    [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public string? Kontoinhaber { get; set; }

    /// <summary>
    /// IBAN der Bankverbindung
    /// IBAN of the bank details.
    /// </summary>
    [XmlElement("iban", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public string? Iban { get; set; }

    /// <summary>
    /// BIC der Bankverbindung
    /// BIC of the bank details.
    /// </summary>
    [XmlElement("bic", Namespace = XJustizExport.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    public string? Bic { get; set; }
}

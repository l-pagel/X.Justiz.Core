namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Bankverbindung.
/// Represents a bank account connection.
/// </summary>
public class Bankverbindung
{
    /// <summary>
    /// Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
    /// The name only needs to be specified if the account holder is not identical to the participant.
    /// </summary>
    [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
    public string? Kontoinhaber { get; set; }

    /// <summary>
    /// IBAN der Bankverbindung
    /// IBAN of the bank details.
    /// </summary>
    [XmlElement("iban", Namespace = XJustizExport.Tns)]
    public string? Iban { get; set; }

    /// <summary>
    /// BIC der Bankverbindung
    /// BIC of the bank details.
    /// </summary>
    [XmlElement("bic", Namespace = XJustizExport.Tns)]
    public string? Bic { get; set; }
}

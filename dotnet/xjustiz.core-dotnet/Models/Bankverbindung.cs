namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Bankverbindung.
/// Represents a bank account connection.
/// </summary>
public class Bankverbindung
{
    /// <summary>
    /// Der Kontoinhaber.
    /// The account holder.
    /// </summary>
    [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
    public string? Kontoinhaber { get; set; }

    /// <summary>
    /// Die IBAN (International Bank Account Number).
    /// The IBAN (International Bank Account Number).
    /// </summary>
    [XmlElement("iban", Namespace = XJustizExport.Tns)]
    public string? Iban { get; set; }

    /// <summary>
    /// Der BIC (Bank Identifier Code).
    /// The BIC (Bank Identifier Code).
    /// </summary>
    [XmlElement("bic", Namespace = XJustizExport.Tns)]
    public string? Bic { get; set; }
}

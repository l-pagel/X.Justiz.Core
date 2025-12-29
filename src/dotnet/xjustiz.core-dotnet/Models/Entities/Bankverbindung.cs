namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Bankverbindung.
/// </summary>
public class Bankverbindung
{
    /// <summary>
    /// Der Name braucht nur angegeben zu werden, sofern der Kontoinhaber nicht mit dem Beteiligten identisch ist.
    /// </summary>
    [XmlElement("kontoinhaber", Namespace = XJustizExport.Tns)]
    public string? Kontoinhaber { get; set; }
    /// <summary>
    /// IBAN der Bankverbindung
    /// </summary>
    [XmlElement("iban", Namespace = XJustizExport.Tns)]
    public string? Iban { get; set; }
    /// <summary>
    /// BIC der Bankverbindung
    /// </summary>
    [XmlElement("bic", Namespace = XJustizExport.Tns)]
    public string? Bic { get; set; }
}

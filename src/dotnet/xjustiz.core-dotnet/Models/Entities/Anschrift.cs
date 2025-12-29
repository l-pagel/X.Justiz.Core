namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Anschrift.
/// Represents an address.
/// </summary>
public class Anschrift
{
    /// <summary>
    /// Die Straße.
    /// The street.
    /// </summary>
    [XmlElement("strasse", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Strasse { get; set; }

    /// <summary>
    /// Die Hausnummer.
    /// The house number.
    /// </summary>
    [XmlElement("hausnummer", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Hausnummer { get; set; }

    /// <summary>
    /// Die Postleitzahl.
    /// The zip code / postal code.
    /// </summary>
    [XmlElement("postleitzahl", Namespace = XJustizExport.Tns, Order = 3)]
    public string? Postleitzahl { get; set; }

    /// <summary>
    /// Der Ort.
    /// The city / location.
    /// </summary>
    [XmlElement("ort", Namespace = XJustizExport.Tns, Order = 4)]
    public string? Ort { get; set; }

    /// <summary>
    /// Der Staat.
    /// The country / state.
    /// </summary>
    [XmlElement("staat", Namespace = XJustizExport.Tns, Order = 5)]
    public Staat? Staat { get; set; }
}

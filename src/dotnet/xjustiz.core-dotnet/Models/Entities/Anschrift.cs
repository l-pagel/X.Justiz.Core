namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Anschrift.
/// Represents an address.
/// </summary>
public class Anschrift
{
    /// <summary>
    /// Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.
    /// Data type B was designed primarily for other names, such as place names and street names with house numbers.
    /// </summary>
    [XmlElement("strasse", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Strasse { get; set; }

    /// <summary>
    /// Die Hausnummer ist ggf. einschliesslich Buchstaben oder dergleichen anzugeben.
    /// The house number must be specified, including letters or similar if applicable.
    /// </summary>
    [XmlElement("hausnummer", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Hausnummer { get; set; }

    /// <summary>
    /// Bei einer ausländischen PLZ ist das Element "staat" zwingend anzugeben.
    /// For a foreign postal code, the element 'staat' (country) must be specified.
    /// </summary>
    [XmlElement("postleitzahl", Namespace = XJustizExport.Tns, Order = 3)]
    public string? Postleitzahl { get; set; }

    /// <summary>
    /// Bei postalischen Anschriften kann der hier angegebene Ort von der politischen Gemeinde abweichen. In diesem Fall sollten die postalische und die Lieferadresse separat mitgeteilt werden. Bei ausländischen Adressen empfiehlt die Deutsche Post AG, den Ort möglichst in der Landessprache zu schreiben. Dies erscheint auch im vorliegenden Zusammenhang sinnvoll.
    /// For postal addresses, the city specified here may differ from the political municipality. In this case, the postal and delivery addresses should be communicated separately. For foreign addresses, Deutsche Post AG recommends writing the city in the local language if possible. This also seems appropriate in the present context.
    /// </summary>
    [XmlElement("ort", Namespace = XJustizExport.Tns, Order = 4)]
    public string? Ort { get; set; }

    /// <summary>
    /// Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'Code lists of code type 3'.
    /// </summary>
    [XmlElement("staat", Namespace = XJustizExport.Tns, Order = 5)]
    public Staat? Staat { get; set; }
}

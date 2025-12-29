namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert eine Anschrift.
/// </summary>
public class Anschrift
{
    /// <summary>
    /// Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.
    /// </summary>
    [XmlElement("strasse", Namespace = XJustizExport.Tns, Order = 1)]
    public string? Strasse { get; set; }
    /// <summary>
    /// Die Hausnummer ist ggf. einschliesslich Buchstaben oder dergleichen anzugeben.
    /// </summary>
    [XmlElement("hausnummer", Namespace = XJustizExport.Tns, Order = 2)]
    public string? Hausnummer { get; set; }
    /// <summary>
    /// Bei einer ausländischen PLZ ist das Element "staat" zwingend anzugeben.
    /// </summary>
    [XmlElement("postleitzahl", Namespace = XJustizExport.Tns, Order = 3)]
    public string? Postleitzahl { get; set; }
    /// <summary>
    /// Bei postalischen Anschriften kann der hier angegebene Ort von der politischen Gemeinde abweichen. In diesem Fall sollten die postalische und die Lieferadresse separat mitgeteilt werden. Bei ausländischen Adressen empfiehlt die Deutsche Post AG, den Ort möglichst in der Landessprache zu schreiben. Dies erscheint auch im vorliegenden Zusammenhang sinnvoll.
    /// </summary>
    [XmlElement("ort", Namespace = XJustizExport.Tns, Order = 4)]
    public string? Ort { get; set; }
    /// <summary>
    /// Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("staat", Namespace = XJustizExport.Tns, Order = 5)]
    public Staat? Staat { get; set; }
}

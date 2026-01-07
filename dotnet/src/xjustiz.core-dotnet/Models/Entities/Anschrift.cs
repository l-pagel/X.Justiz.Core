namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine Anschrift.<br/>
/// <u><b>Address:</b></u> Represents an address.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Anschrift
{
    /// <summary>
    /// Der Datentyp B wurde vor allem für sonstige Namen, wie z. B. Ortsnamen und Straßennamen mit Hausnummer, entworfen.<br/>
    /// <u><b>Street:</b></u> Data type B was designed primarily for other names, such as place names and street names with house numbers.
    /// </summary>
    [XmlElement("strasse", Namespace = XJustizConstants.Tns, Order = 1)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Strasse { get; set; }

    /// <summary>
    /// Die Hausnummer ist ggf. einschliesslich Buchstaben oder dergleichen anzugeben.<br/>
    /// <u><b>House number:</b></u> The house number must be specified, including letters or similar if applicable.
    /// </summary>
    [XmlElement("hausnummer", Namespace = XJustizConstants.Tns, Order = 2)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Hausnummer { get; set; }

    /// <summary>
    /// Bei einer ausländischen PLZ ist das Element "staat" zwingend anzugeben.<br/>
    /// <u><b>Postal code:</b></u> For a foreign postal code, the element 'staat' (country) must be specified.
    /// </summary>
    [XmlElement("postleitzahl", Namespace = XJustizConstants.Tns, Order = 3)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Postleitzahl { get; set; }

    /// <summary>
    /// Bei postalischen Anschriften kann der hier angegebene Ort von der politischen Gemeinde abweichen. In diesem Fall sollten die postalische und die Lieferadresse separat mitgeteilt werden. Bei ausländischen Adressen empfiehlt die Deutsche Post AG, den Ort möglichst in der Landessprache zu schreiben. Dies erscheint auch im vorliegenden Zusammenhang sinnvoll.<br/>
    /// <u><b>City:</b></u> For postal addresses, the city specified here may differ from the political municipality. In this case, the postal and delivery addresses should be communicated separately. For foreign addresses, Deutsche Post AG recommends writing the city in the local language if possible. This also seems appropriate in the present context.
    /// </summary>
    [XmlElement("ort", Namespace = XJustizConstants.Tns, Order = 4)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string? Ort { get; set; }

    /// <summary>
    /// Die Werte einer Codeliste vom CodeValue-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom CodeValue-Typ 3" beschrieben.<br/>
    /// <u><b>Country:</b></u> The values of a code list of code type 3 can be viewed in the XRepository. Further details are described in the chapter 'CodeValue lists of code type 3'.
    /// </summary>
    [XmlElement("staat", Namespace = XJustizConstants.Tns, Order = 5)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public Code? Staat { get; set; }
}

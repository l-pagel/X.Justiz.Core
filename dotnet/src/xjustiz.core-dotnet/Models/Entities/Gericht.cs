namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes.Gericht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert ein Gericht als Code.<br/>
/// <u><b>Court:</b></u> Represents a court as a code.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Gericht
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).<br/>
    /// <u><b>List version ID:</b></u> The version of the code list. Documentation from XOEV library: The specific version of the code list to be used is transmitted with this XML attribute. Analogous to listURI, determining the version of a code list is mandatory when transmitting a code. However, the version can also already be defined in the XÖV standard (in this case, it is a code type 1 or 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public string ListVersionId { get; set; } = "3.6";

    /// <summary>
    /// Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden: <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte'>Codeliste "Gerichte"</a><br/>
    /// <u><b>Code:</b></u> The values of a code list of code type 3 can be viewed in the XRepository: <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.gerichte'>code list "Gerichte"</a>
    /// </summary>
    [XmlElement("code")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
    public GerichtCode Code { get; set; }
}

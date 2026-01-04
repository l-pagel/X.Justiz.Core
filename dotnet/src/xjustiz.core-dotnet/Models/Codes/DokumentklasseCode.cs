namespace xjustiz.core_dotnet.Models.Codes;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für eine Dokumentklasse der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>Codeliste "Dokumentklasse"</a>.<br/>
/// <u><b>Document class code:</b></u> The code for a document class of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>code list "Dokumentklasse"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class DokumentklasseCode
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).<br/>
    /// <u><b>List version ID:</b></u> The version of the code list. Documentation from XOEV library: The specific version of the code list to be used is transmitted with this XML attribute. Analogous to listURI, determining the version of a code list is mandatory when transmitting a code. However, the version can also already be defined in the XÖV standard (in this case, it is a code type 1 or 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// In diesem XML-Element wird der Code einer Codeliste übermittelt.<br/>
    /// <u><b>Code:</b></u> The code of a code list is transmitted in this XML element.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [XJustizAvailability(XJustizVersion.V2_2_1)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string Code { get; set; } = string.Empty;
}

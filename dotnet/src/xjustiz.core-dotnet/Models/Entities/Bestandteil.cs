namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Ein Bestandteil einer Datei (z.B. Format, Version).
/// A component of a file (e.g., format, version).
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
public class Bestandteil
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).
    /// The version of the code list. Documentation from XOEV library: The specific version of the code list to be used is transmitted with this XML attribute. Analogous to listURI, determining the version of a code list is mandatory when transmitting a code. However, the version can also already be defined in the XÖV standard (in this case, it is a code type 1 or 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string ListVersionId { get; set; } = "2.4";

    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// Possible codes can be taken from the code list Code.INSO.IRI.Fehlercode.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    [XJustizAvailability(XJustizVersion.Unknown)]
    public string Code { get; set; } = "001";
}

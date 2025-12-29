namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Ein Bestandteil einer Datei (z.B. Format, Version).
/// </summary>
public class Bestandteil
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "2.4";

    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// </summary>
    [XmlElement("code", Namespace = "", Order = 1)]
    public string Code { get; set; } = "001";
}

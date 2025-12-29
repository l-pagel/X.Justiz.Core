namespace xjustiz.core_dotnet.Models.Codes;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert den Code eines Gerichts.
/// Represents the code of a court.
/// </summary>
public class GerichtCode
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// In diesem XML-Element wird der Code einer Codeliste übermittelt.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

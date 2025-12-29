namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert die Bezeichnung einer Rolle als Code.
/// </summary>
public class Rollenbezeichnung
{
    /// <summary>
    /// Die Version der Codeliste. Dokumentation aus XOEV-Bibliothek: Die konkrete Version der zu nutzenden Codeliste wird mit diesem XML-Attribut übertragen. Analog zum listURI ist die Bestimmung der Version einer Codeliste bei der Übertragung eines Codes zwingend. Die Version kann jedoch ebenfalls bereits im XÖV-Standard festgelegt werden (es handelt sich in diesem Fall um einen Code-Typ 1 oder 2).
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

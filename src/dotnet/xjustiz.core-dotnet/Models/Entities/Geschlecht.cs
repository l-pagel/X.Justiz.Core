namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert das Geschlecht einer Person als Code.
/// </summary>
public class Geschlecht
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string? Code { get; set; }
}

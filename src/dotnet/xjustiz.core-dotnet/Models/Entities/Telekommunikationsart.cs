namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Art der Telekommunikation als Code.
/// </summary>
public class Telekommunikationsart
{
    /// <summary>
    /// Mögliche Codes können der Codeliste Code.INSO.IRI.Fehlercode entnommen werden.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string? code { get; set; }
}

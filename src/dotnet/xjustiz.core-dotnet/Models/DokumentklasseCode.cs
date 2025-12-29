namespace xjustiz.core_dotnet.Models;

using System.Xml.Serialization;

/// <summary>
/// Der Code für eine Dokumentklasse.
/// The code for a document class.
/// </summary>
public class DokumentklasseCode
{
    /// <summary>
    /// Die Version der Codeliste.
    /// The version of the code list.
    /// </summary>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// Der Code der Dokumentklasse.
    /// The code of the document class.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

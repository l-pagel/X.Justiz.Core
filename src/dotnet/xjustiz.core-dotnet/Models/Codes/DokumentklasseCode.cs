namespace xjustiz.core_dotnet.Models.Codes;

using System.Xml.Serialization;

/// <summary>
/// Der Code für eine Dokumentklasse.
/// The code for a document class.
/// </summary>
public class DokumentklasseCode
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";

    /// <summary>
    /// In diesem XML-Element wird der Code einer Codeliste übermittelt.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

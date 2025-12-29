namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Repräsentiert einen Staat als Code.
/// </summary>
public class Staat
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = "3.5.1";
    /// <summary>
    /// Die Werte einer Codeliste vom Code-Typ 3 können im XRepository eingesehen werden. Nähere Details sind im Kapitel "Codelisten vom Code-Typ 3" beschrieben.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    public string Code { get; set; } = string.Empty;
}

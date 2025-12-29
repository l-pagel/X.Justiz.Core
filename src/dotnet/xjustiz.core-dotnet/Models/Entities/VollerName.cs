namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Der volle Name einer natürlichen Person.
/// </summary>
public class VollerName
{
    /// <summary>
    /// Bei ggfls. mehreren Vornamen werden diese alle in diesem Element in ihrer Reihenfolge eingetragen.
    /// </summary>
    [XmlElement("vorname", Namespace = XJustizExport.Tns)]
    public string? Vorname { get; set; }
    /// <summary>
    /// Der Rufname gibt bei mehreren Vornamen an, welcher Vorname der Rufname ist. Der Rufname wird häufig als eindeutiges Element benötigt.
    /// </summary>
    [XmlElement("rufname", Namespace = XJustizExport.Tns)]
    public string? Rufname { get; set; }
    /// <summary>
    /// Hier werden akademische und nichtakademische Titel aufgeführt, die vor dem Vornamen stehen, z.B. "Professor", "Dr.", "Prof. Dr." usw.
    /// </summary>
    [XmlElement("titel", Namespace = XJustizExport.Tns)]
    public string? Titel { get; set; }
    /// <summary>
    /// Hier werden Adelstitel aufgeführt, die vor dem Nachnamen stehen, z.B. "Graf von"
    /// </summary>
    [XmlElement("namensvorsatz", Namespace = XJustizExport.Tns)]
    public string? Namensvorsatz { get; set; }
    /// <summary>
    /// Falls der Nachname nicht bekannt ist, ist "nicht bekannt" anzugegeben.
    /// </summary>
    [XmlElement("nachname", Namespace = XJustizExport.Tns)]
    public string? Nachname { get; set; }
}

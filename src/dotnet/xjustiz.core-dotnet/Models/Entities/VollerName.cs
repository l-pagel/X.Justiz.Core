namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;

/// <summary>
/// Der volle Name einer natürlichen Person.
/// The full name of a natural person.
/// </summary>
public class VollerName
{
    /// <summary>
    /// Bei ggfls. mehreren Vornamen werden diese alle in diesem Element in ihrer Reihenfolge eingetragen.
    /// If there are multiple first names, they are all entered in this element in their order.
    /// </summary>
    [XmlElement("vorname", Namespace = XJustizExport.Tns)]
    public string? Vorname { get; set; }

    /// <summary>
    /// Der Rufname gibt bei mehreren Vornamen an, welcher Vorname der Rufname ist. Der Rufname wird häufig als eindeutiges Element benötigt.
    /// The call name indicates which first name is the call name if there are multiple first names. The call name is often required as a unique element.
    /// </summary>
    [XmlElement("rufname", Namespace = XJustizExport.Tns)]
    public string? Rufname { get; set; }

    /// <summary>
    /// Hier werden akademische und nichtakademische Titel aufgeführt, die vor dem Vornamen stehen, z.B. "Professor", "Dr.", "Prof. Dr." usw.
    /// Academic and non-academic titles that appear before the first name are listed here, e.g., 'Professor', 'Dr.', 'Prof. Dr.', etc.
    /// </summary>
    [XmlElement("titel", Namespace = XJustizExport.Tns)]
    public string? Titel { get; set; }

    /// <summary>
    /// Hier werden Adelstitel aufgeführt, die vor dem Nachnamen stehen, z.B. "Graf von"
    /// Titles of nobility that appear before the last name are listed here, e.g., 'Graf von'.
    /// </summary>
    [XmlElement("namensvorsatz", Namespace = XJustizExport.Tns)]
    public string? Namensvorsatz { get; set; }

    /// <summary>
    /// Falls der Nachname nicht bekannt ist, ist "nicht bekannt" anzugegeben.
    /// If the last name is not known, 'nicht bekannt' (unknown) must be specified.
    /// </summary>
    [XmlElement("nachname", Namespace = XJustizExport.Tns)]
    public string? Nachname { get; set; }
}

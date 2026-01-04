namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der volle Name einer natürlichen Person.<br/>
/// <u><b>Full name:</b></u> The full name of a natural person.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_1_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
public class VollerName
{
    /// <summary>
    /// Bei ggfls. mehreren Vornamen werden diese alle in diesem Element in ihrer Reihenfolge eingetragen.<br/>
    /// <u><b>First name:</b></u> If there are multiple first names, they are all entered in this element in their order.
    /// </summary>
    [XmlElement("vorname", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Vorname { get; set; }

    /// <summary>
    /// Der Rufname gibt bei mehreren Vornamen an, welcher Vorname der Rufname ist. Der Rufname wird häufig als eindeutiges Element benötigt.<br/>
    /// <u><b>Call name:</b></u> The call name indicates which first name is the call name if there are multiple first names. The call name is often required as a unique element.
    /// </summary>
    [XmlElement("rufname", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Rufname { get; set; }

    /// <summary>
    /// Hier werden akademische und nichtakademische Titel aufgeführt, die vor dem Vornamen stehen, z.B. "Professor", "Dr.", "Prof. Dr." usw.<br/>
    /// <u><b>Title:</b></u> Academic and non-academic titles that appear before the first name are listed here, e.g., 'Professor', 'Dr.', 'Prof. Dr.', etc.
    /// </summary>
    [XmlElement("titel", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Titel { get; set; }

    /// <summary>
    /// Hier werden Adelstitel aufgeführt, die vor dem Nachnamen stehen, z.B. "Graf von".<br/>
    /// <u><b>Name prefix:</b></u> Titles of nobility that appear before the last name are listed here, e.g., 'Graf von'.
    /// </summary>
    [XmlElement("namensvorsatz", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Namensvorsatz { get; set; }

    /// <summary>
    /// Falls der Nachname nicht bekannt ist, ist "nicht bekannt" anzugegeben.<br/>
    /// <u><b>Last name:</b></u> If the last name is not known, 'nicht bekannt' (unknown) must be specified.
    /// </summary>
    [XmlElement("nachname", Namespace = XJustizConstants.Tns)]
    [XJustizAvailability(XJustizVersion.V2_1_0)]
    [XJustizCoreAvailability(XJustizCoreVersion.V1_0_0)]
    public string? Nachname { get; set; }
}

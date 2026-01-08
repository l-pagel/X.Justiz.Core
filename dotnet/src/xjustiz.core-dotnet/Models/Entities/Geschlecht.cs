namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Geschlecht;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für das Geschlecht der <a href='https://www.xrepository.de/details/urn:de:xauslaender:codelist:geschlecht'>Codeliste "Geschlecht"</a>.<br/>
/// <u><b>Gender code:</b></u> The code for the gender of the <a href='https://www.xrepository.de/details/urn:de:xauslaender:codelist:geschlecht'>code list "Geschlecht"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_4_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Geschlecht : ICode<GeschlechtCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = GeschlechtCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = GeschlechtCodeLists.Uri;

    /// <summary>
    /// Interne Eigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Internal property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = GeschlechtCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    /// <summary>
    /// Ruft den Geschlecht-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the gender code.
    /// </summary>
    [XmlIgnore]
    public GeschlechtCode Code { get; set; }
}

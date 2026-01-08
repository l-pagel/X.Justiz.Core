namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Bestandteil;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für einen Bestandteiltyp der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp'>Codeliste "Bestandteiltyp"</a>.<br/>
/// <u><b>Part type code:</b></u> The code for a part type of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.bestandteiltyp'>code list "Bestandteiltyp"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_4_0)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]
public class Bestandteiltyp : ICode<BestandteiltypCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = BestandteiltypCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = BestandteiltypCodeLists.Uri;

    /// <summary>
    /// Interne Eigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Internal property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = BestandteiltypCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    /// <summary>
    /// Ruft den Bestandteiltyp-Code ab oder legt diesen fest.<br/>
    /// <u><b>Code:</b></u> Gets or sets the component type code.
    /// </summary>
    [XmlIgnore]
    public BestandteiltypCode Code { get; set; }
}

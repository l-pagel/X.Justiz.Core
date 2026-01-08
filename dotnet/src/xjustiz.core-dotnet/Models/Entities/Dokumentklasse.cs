namespace xjustiz.core_dotnet.Models.Entities;

using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Dokumentklasse;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Der Code für eine Dokumentklasse der <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>Codeliste "Dokumentklasse"</a>.<br/>
/// <u><b>Document class code:</b></u> The code for a document class of the <a href='https://www.xrepository.de/details/urn:xoev-de:xjustiz:codeliste:gds.dokumentklasse'>code list "Dokumentklasse"</a>.
/// </summary>
[XJustizAvailability(XJustizVersion.V2_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_2_0)]

public class Dokumentklasse : ICode<DokumentklasseCode>
{
    [XmlAttribute("listVersionID")]
    public string ListVersionId { get; set; } = DokumentklasseCodeLists.LatestList.Version; 

    [XmlAttribute("listURI")]
    public string? ListUri { get; set; } = DokumentklasseCodeLists.Uri;

    [XmlElement("code", Namespace = "")]
    [System.ComponentModel.EditorBrowsable(System.ComponentModel.EditorBrowsableState.Never)]
    public string? CodeForXml
    {
        get => Code.ToCode();
        set => Code = DokumentklasseCodeMapper.TryParse(value ?? string.Empty, out var result) ? result : default;
    }

    [XmlIgnore]
    public DokumentklasseCode Code { get; set; }
}

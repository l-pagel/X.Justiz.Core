namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Codes;
using xjustiz.core_dotnet.Models.Codes.Versicherung;
using xjustiz.core_dotnet.Models.Helpers;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Repräsentiert eine VersicherungCore.<br/>
/// <u><b>Insurance:</b></u> Represents an insurance.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
public class VersicherungCore
{
    /// <summary>
    /// Die Versicherungsnummer.<br/>
    /// <u><b>Insurance number:</b></u> The insurance number.
    /// </summary>
    [XmlElement("versicherungsnummer", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? Versicherungsnummer { get; set; }

    /// <summary>
    /// Liste der Versicherungsunternehmen.<br/>
    /// <u><b>Insurance companies:</b></u> List of insurance companies.
    /// </summary>
    [XmlElement("versicherungsunternehmen", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public List<Organisation>? Versicherungsunternehmen { get; set; }

    /// <summary>
    /// Die Anschrift der VersicherungCore.<br/>
    /// <u><b>Address:</b></u> The address of the insurance.
    /// </summary>
    [XmlElement("anschrift", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Die Referenz-ID.<br/>
    /// <u><b>Reference ID:</b></u> The reference ID.
    /// </summary>
    [XmlElement("referenzid", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public Guid? ReferenzId { get; set; }

    /// <summary>
    /// Der Versicherte.<br/>
    /// <u><b>Insured person:</b></u> The insured person.
    /// </summary>
    [XmlElement("versicherter", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public AuswahlBeteiligter? Versicherter { get; set; }

    /// <summary>
    /// Die Schadensnummer.<br/>
    /// <u><b>Claim number:</b></u> The claim number.
    /// </summary>
    [XmlElement("schadensnummer", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? Schadensnummer { get; set; }

    /// <summary>
    /// Der Typ der VersicherungCore.<br/>
    /// <u><b>Insurance type:</b></u> The type of insurance.
    /// </summary>
    [XmlElement("versicherungstyp", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public VersicherungsTyp? Versicherungstyp { get; set; }

    /// <summary>
    /// Informationen zur Selbstbeteiligung.<br/>
    /// <u><b>Deductible:</b></u> Information about the deductible.
    /// </summary>
    [XmlElement("selbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public Selbstbeteiligung? Selbstbeteiligung { get; set; }

    /// <summary>
    /// Anwendungsspezifische Erweiterungen.<br/>
    /// <u><b>Application-specific extensions:</b></u> Application-specific extensions.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = SchemeConstants.XJustiz_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}

/// <summary>
/// Typ der VersicherungCore.<br/>
/// <u><b>Insurance type:</b></u> Insurance type.
/// </summary>
public class VersicherungsTyp : ICode<VersicherungsCode>
{
    /// <inheritdoc/>
    [XmlAttribute("listVersionID")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string ListVersionId { get; set; } = xjustiz.core_dotnet.Models.Codes.Versicherung.VersicherungsCodeLists.LatestList.Version;

    /// <inheritdoc/>
    [XmlAttribute("listURI")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? ListUri { get; set; } = xjustiz.core_dotnet.Models.Codes.Versicherung.VersicherungsCodeLists.Uri;

    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlIgnore]
    [System.Text.Json.Serialization.JsonPropertyName("code")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public VersicherungsCode Code { get; set; }

    /// <summary>
    /// Hilfseigenschaft für die XML-Serialisierung.<br/>
    /// <u><b>Code for XML:</b></u> Helper property for XML serialization.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    [System.Text.Json.Serialization.JsonIgnore]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string CodeForXml
    {
        get => Code.ToCode();
        set => Code = VersicherungsCodeMapper.TryParse(value, out var result) ? result : default;
    }
}

/// <summary>
/// Selbstbeteiligung.<br/>
/// <u><b>Deductible:</b></u> Deductible.
/// </summary>
[XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
public class Selbstbeteiligung
{
    /// <summary>
    /// Selbstbehalt.<br/>
    /// <u><b>Deductible amount:</b></u> Deductible amount.
    /// </summary>
    [XmlElement("selbstbehaltbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? SelbstbehaltBeteiligung { get; set; }

    /// <summary>
    /// Teilweise umfassende Selbstbeteiligung.<br/>
    /// <u><b>Partially comprehensive deductible:</b></u> Partially comprehensive deductible.
    /// </summary>
    [XmlElement("teilweiseumfassendeSelbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? TeilweiseUmfassendeSelbstbeteiligung { get; set; }

    /// <summary>
    /// Umfassende Selbstbeteiligung.<br/>
    /// <u><b>Comprehensive deductible:</b></u> Comprehensive deductible.
    /// </summary>
    [XmlElement("eumfassendeSelbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    public string? UmfassendeSelbstbeteiligung { get; set; }
}
namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Collections.Generic;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Models.Helpers;

/// <summary>
/// Repräsentiert eine VersicherungCore.<br/>
/// <u><b>Insurance:</b></u> Represents an insurance.
/// </summary>
public class VersicherungCore
{
    /// <summary>
    /// Die Versicherungsnummer.<br/>
    /// <u><b>Insurance number:</b></u> The insurance number.
    /// </summary>
    [XmlElement("versicherungsnummer", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Versicherungsnummer { get; set; }

    /// <summary>
    /// Liste der Versicherungsunternehmen.<br/>
    /// <u><b>Insurance companies:</b></u> List of insurance companies.
    /// </summary>
    [XmlElement("versicherungsunternehmen", Namespace = SchemeConstants.XJustizCore_Tns)]
    public List<Organisation>? Versicherungsunternehmen { get; set; }

    /// <summary>
    /// Die Anschrift der VersicherungCore.<br/>
    /// <u><b>Address:</b></u> The address of the insurance.
    /// </summary>
    [XmlElement("anschrift", Namespace = SchemeConstants.XJustizCore_Tns)]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Die Referenz-ID.<br/>
    /// <u><b>Reference ID:</b></u> The reference ID.
    /// </summary>
    [XmlElement("referenzid", Namespace = SchemeConstants.XJustizCore_Tns)]
    public Guid? ReferenzId { get; set; }

    /// <summary>
    /// Der Versicherte.<br/>
    /// <u><b>Insured person:</b></u> The insured person.
    /// </summary>
    [XmlElement("versicherter", Namespace = SchemeConstants.XJustizCore_Tns)]
    public AuswahlBeteiligter? Versicherter { get; set; }

    /// <summary>
    /// Die Schadensnummer.<br/>
    /// <u><b>Claim number:</b></u> The claim number.
    /// </summary>
    [XmlElement("schadensnummer", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Schadensnummer { get; set; }

    /// <summary>
    /// Der Typ der VersicherungCore.<br/>
    /// <u><b>Insurance type:</b></u> The type of insurance.
    /// </summary>
    [XmlElement("versicherungstyp", Namespace = SchemeConstants.XJustizCore_Tns)]
    public VersicherungsTyp? Versicherungstyp { get; set; }

    /// <summary>
    /// Der Typ der Rechtsschutzversicherung.<br/>
    /// <u><b>Legal protection type:</b></u> The type of legal protection insurance.
    /// </summary>
    [XmlElement("rechtsschutsversicherungstyp", Namespace = SchemeConstants.XJustizCore_Tns)]
    public RechtschutzVersicherungsTyp? RechtsschutzTyp { get; set; }

    /// <summary>
    /// Das versicherte Fahrzeug.<br/>
    /// <u><b>Vehicle:</b></u> The insured vehicle.
    /// </summary>
    [XmlElement("fahrzeug", Namespace = SchemeConstants.XJustizCore_Tns)]
    public Fahrzeug? Fahrzeug { get; set; }

    /// <summary>
    /// Informationen zur Selbstbeteiligung.<br/>
    /// <u><b>Deductible:</b></u> Information about the deductible.
    /// </summary>
    [XmlElement("selbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    public Selbstbeteiligung? Selbstbeteiligung { get; set; }

    /// <summary>
    /// Anwendungsspezifische Erweiterungen.<br/>
    /// <u><b>Application-specific extensions:</b></u> Application-specific extensions.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = SchemeConstants.XJustiz_Tns)]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}

/// <summary>
/// Typ der VersicherungCore.<br/>
/// <u><b>Insurance type:</b></u> Insurance type.
/// </summary>
public class VersicherungsTyp
{
    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Code { get; set; }
}

/// <summary>
/// Typ der Rechtsschutzversicherung.<br/>
/// <u><b>Legal protection insurance type:</b></u> Legal protection insurance type.
/// </summary>
public class RechtschutzVersicherungsTyp
{
    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Code { get; set; }
}

/// <summary>
/// Fahrzeugdaten.<br/>
/// <u><b>Vehicle:</b></u> Vehicle data.
/// </summary>
public class Fahrzeug
{
    /// <summary>
    /// Das Fahrzeugkennzeichen.<br/>
    /// <u><b>License plate:</b></u> The license plate.
    /// </summary>
    [XmlElement("fahrzeugkennzeichen", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Fahrzeugkennzeichen { get; set; }

    /// <summary>
    /// Der Typ der Fahrzeugversicherung.<br/>
    /// <u><b>Vehicle insurance type:</b></u> The vehicle insurance type.
    /// </summary>
    [XmlElement("fahrzeugversicherungstyp", Namespace = SchemeConstants.XJustizCore_Tns)]
    public FahrzeugversicherungsTyp? Fahrzeugversicherungstyp { get; set; }
}

/// <summary>
/// Typ der Fahrzeugversicherung.<br/>
/// <u><b>Vehicle insurance type:</b></u> Vehicle insurance type.
/// </summary>
public class FahrzeugversicherungsTyp
{
    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlElement("code", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? Code { get; set; }
}

/// <summary>
/// Selbstbeteiligung.<br/>
/// <u><b>Deductible:</b></u> Deductible.
/// </summary>
public class Selbstbeteiligung
{
    /// <summary>
    /// Selbstbehalt.<br/>
    /// <u><b>Deductible amount:</b></u> Deductible amount.
    /// </summary>
    [XmlElement("selbstbehaltbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? SelbstbehaltBeteiligung { get; set; }

    /// <summary>
    /// Teilweise umfassende Selbstbeteiligung.<br/>
    /// <u><b>Partially comprehensive deductible:</b></u> Partially comprehensive deductible.
    /// </summary>
    [XmlElement("teilweiseumfassendeSelbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? TeilweiseUmfassendeSelbstbeteiligung { get; set; }

    /// <summary>
    /// Umfassende Selbstbeteiligung.<br/>
    /// <u><b>Comprehensive deductible:</b></u> Comprehensive deductible.
    /// </summary>
    [XmlElement("eumfassendeSelbstbeteiligung", Namespace = SchemeConstants.XJustizCore_Tns)]
    public string? UmfassendeSelbstbeteiligung { get; set; }
}

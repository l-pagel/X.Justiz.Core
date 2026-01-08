namespace xjustiz.core_dotnet.Models.Entities.Core;

using System.Collections.Generic;
using System.Xml.Serialization;

//TODO: What namespace to use for completely new fields and types

/// <summary>
/// Repräsentiert eine Versicherung.<br/>
/// <u><b>Insurance:</b></u> Represents an insurance.
/// </summary>
public class Versicherung
{
    /// <summary>
    /// Die Versicherungsnummer.<br/>
    /// <u><b>Insurance number:</b></u> The insurance number.
    /// </summary>
    [XmlElement("versicherungsnummer", Namespace = "")]
    public string? Versicherungsnummer { get; set; }

    /// <summary>
    /// Liste der Versicherungsunternehmen.<br/>
    /// <u><b>Insurance companies:</b></u> List of insurance companies.
    /// </summary>
    [XmlElement("versicherungsunternehmen", Namespace = "")]
    public List<Organisation>? Versicherungsunternehmen { get; set; }

    /// <summary>
    /// Die Anschrift der Versicherung.<br/>
    /// <u><b>Address:</b></u> The address of the insurance.
    /// </summary>
    [XmlElement("anschrift", Namespace = "")]
    public Anschrift? Anschrift { get; set; }

    /// <summary>
    /// Die Referenz-ID.<br/>
    /// <u><b>Reference ID:</b></u> The reference ID.
    /// </summary>
    [XmlElement("referenzid", Namespace = "")]
    public Guid? ReferenzId { get; set; }

    /// <summary>
    /// Der Versicherte.<br/>
    /// <u><b>Insured person:</b></u> The insured person.
    /// </summary>
    [XmlElement("versicherter", Namespace = "")]
    public AuswahlBeteiligter? Versicherter { get; set; }

    /// <summary>
    /// Die Schadensnummer.<br/>
    /// <u><b>Claim number:</b></u> The claim number.
    /// </summary>
    [XmlElement("schadensnummer", Namespace = "")]
    public string? Schadensnummer { get; set; }

    /// <summary>
    /// Der Typ der Versicherung.<br/>
    /// <u><b>Insurance type:</b></u> The type of insurance.
    /// </summary>
    [XmlElement("versicherungstyp", Namespace = "")]
    public VersicherungsTyp? Versicherungstyp { get; set; }

    /// <summary>
    /// Der Typ der Rechtsschutzversicherung.<br/>
    /// <u><b>Legal protection type:</b></u> The type of legal protection insurance.
    /// </summary>
    [XmlElement("rechtsschutsversicherungstyp", Namespace = "")]
    public RechtschutzVersicherungsTyp? RechtsschutzTyp { get; set; }

    /// <summary>
    /// Das versicherte Fahrzeug.<br/>
    /// <u><b>Vehicle:</b></u> The insured vehicle.
    /// </summary>
    [XmlElement("fahrzeug", Namespace = "")]
    public Fahrzeug? Fahrzeug { get; set; }

    /// <summary>
    /// Informationen zur Selbstbeteiligung.<br/>
    /// <u><b>Deductible:</b></u> Information about the deductible.
    /// </summary>
    [XmlElement("selbstbeteiligung", Namespace = "")]
    public Selbstbeteiligung? Selbstbeteiligung { get; set; }

    /// <summary>
    /// Anwendungsspezifische Erweiterungen.<br/>
    /// <u><b>Application-specific extensions:</b></u> Application-specific extensions.
    /// </summary>
    [XmlElement("anwendungsspezifischeErweiterung", Namespace = "")]
    public AnwendungsspezifischeErweiterung? AnwendungsspezifischeErweiterung { get; set; }
}

/// <summary>
/// Typ der Versicherung.<br/>
/// <u><b>Insurance type:</b></u> Insurance type.
/// </summary>
public class VersicherungsTyp
{
    /// <summary>
    /// Der Code.<br/>
    /// <u><b>Code:</b></u> The code.
    /// </summary>
    [XmlElement("code", Namespace = "")]
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
    [XmlElement("code", Namespace = "")]
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
    [XmlElement("fahrzeugkennzeichen", Namespace = "")]
    public string? Fahrzeugkennzeichen { get; set; }

    /// <summary>
    /// Der Typ der Fahrzeugversicherung.<br/>
    /// <u><b>Vehicle insurance type:</b></u> The vehicle insurance type.
    /// </summary>
    [XmlElement("fahrzeugversicherungstyp", Namespace = "")]
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
    [XmlElement("code", Namespace = "")]
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
    [XmlElement("selbstbehaltbeteiligung", Namespace = "")]
    public string? SelbstbehaltBeteiligung { get; set; }

    /// <summary>
    /// Teilweise umfassende Selbstbeteiligung.<br/>
    /// <u><b>Partially comprehensive deductible:</b></u> Partially comprehensive deductible.
    /// </summary>
    [XmlElement("teilweiseumfassendeSelbstbeteiligung", Namespace = "")]
    public string? TeilweiseUmfassendeSelbstbeteiligung { get; set; }

    /// <summary>
    /// Umfassende Selbstbeteiligung.<br/>
    /// <u><b>Comprehensive deductible:</b></u> Comprehensive deductible.
    /// </summary>
    [XmlElement("eumfassendeSelbstbeteiligung", Namespace = "")]
    public string? UmfassendeSelbstbeteiligung { get; set; }
}

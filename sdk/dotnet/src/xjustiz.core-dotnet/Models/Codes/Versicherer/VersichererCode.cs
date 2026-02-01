namespace xjustiz.core_dotnet.Models.Codes.Versicherer;

using System.Text.Json.Serialization;
using System.Xml.Serialization;
using xjustiz.core_dotnet.Util.Versioning;

/// <summary>
/// Versicherer Codes (BaFin ID) aus <see href="https://portal.mvp.bafin.de/database/InstInfo/">Unternehmensdatenbank BaFin</see>.<br/>
/// <u><b>Insurer codes (BaFin ID):</b></u> from <see href="https://portal.mvp.bafin.de/database/InstInfo/">Unternehmensdatenbank BaFin</see>.
/// </summary>
[XJustizAvailability(XJustizVersion.V3_2_1)]
[XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
[JsonConverter(typeof(VersichererCodeJsonConverter))]
public enum VersichererCode
{
    /// <summary>
    /// Alte Leipziger Lebensversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10001007")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alte_Leipziger_Lebensversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// BY die Bayerische Vorsorge Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001013")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BY_die_Bayerische_Vorsorge_Lebensversicherung_a_G,

    /// <summary>
    /// Bayern-Versicherung Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001015")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayern_Versicherung_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// AXA Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001020")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Condor Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001021")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Condor_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Cosmos Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001022")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cosmos_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Debeka Lebensversicherungsverein auf Gegenseitigkeit Sitz Koblenz am Rhein
    /// </summary>
    [XmlEnum("10001023")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Debeka_Lebensversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein,

    /// <summary>
    /// DEVK Deutsche Eisenbahn Versicherung Lebensversicherungsverein a.G. Betriebliche Sozialeinrichtung der Deutschen Bahn
    /// </summary>
    [XmlEnum("10001025")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Deutsche_Eisenbahn_Versicherung_Lebensversicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn,

    /// <summary>
    /// Baloise Lebensversicherung Aktiengesellschaft Deutschland
    /// </summary>
    [XmlEnum("10001028")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Lebensversicherung_Aktiengesellschaft_Deutschland,

    /// <summary>
    /// HDI Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001033")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Lebensversicherung_AG,

    /// <summary>
    /// Frankfurt Münchener Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001035")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Frankfurt_M_nchener_Lebensversicherung_AG,

    /// <summary>
    /// IDEAL Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001047")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IDEAL_Lebensversicherung_a_G,

    /// <summary>
    /// HUK-COBURG-Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001055")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Lebensversicherung_AG,

    /// <summary>
    /// Lebensversicherung von 1871 auf Gegenseitigkeit München
    /// </summary>
    [XmlEnum("10001062")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lebensversicherung_von_1871_auf_Gegenseitigkeit_M_nchen,

    /// <summary>
    /// Provinzial Lebensversicherung Hannover
    /// </summary>
    [XmlEnum("10001081")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Lebensversicherung_Hannover,

    /// <summary>
    /// Provinzial Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001083")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// R + V Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001085")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_Lebensversicherung_a_G,

    /// <summary>
    /// SV SparkassenVersicherung Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001091")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SV_SparkassenVersicherung_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// uniVersa Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001092")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uniVersa_Lebensversicherung_a_G,

    /// <summary>
    /// VEREINIGTE POSTVERSICHERUNG VVaG
    /// </summary>
    [XmlEnum("10001093")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VEREINIGTE_POSTVERSICHERUNG_VVaG,

    /// <summary>
    /// Volkswohl-Bund Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Volkswohl_Bund_Lebensversicherung_a_G,

    /// <summary>
    /// WWK Lebensversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10001103")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WWK_Lebensversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// Stuttgarter Lebensversicherung a.G.
    /// </summary>
    [XmlEnum("10001104")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Stuttgarter_Lebensversicherung_a_G,

    /// <summary>
    /// EUROPA Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001107")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROPA_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Gothaer Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001108")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gothaer_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Mecklenburgische Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mecklenburgische_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// LVM Lebensversicherungs-AG
    /// </summary>
    [XmlEnum("10001112")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LVM_Lebensversicherungs_AG,

    /// <summary>
    /// Dialog Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001113")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dialog_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// HanseMerkur Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Lebensversicherung_AG,

    /// <summary>
    /// Credit Life AG
    /// </summary>
    [XmlEnum("10001115")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Credit_Life_AG,

    /// <summary>
    /// DIREKTE LEBEN Versicherung AG
    /// </summary>
    [XmlEnum("10001123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DIREKTE_LEBEN_Versicherung_AG,

    /// <summary>
    /// Itzehoer Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001128")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Itzehoer_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// HDI Vorsorge Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001132")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Vorsorge_Lebensversicherung_AG,

    /// <summary>
    /// BL die Bayerische Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001134")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BL_die_Bayerische_Lebensversicherung_AG,

    /// <summary>
    /// DEVK Allgemeine Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001136")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Allgemeine_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// HELVETIA schweizerische Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001137")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HELVETIA_schweizerische_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Zurich Deutscher Herold Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001138")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zurich_Deutscher_Herold_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// R + V LEBENSVERSICHERUNG AKTIENGESELLSCHAFT
    /// </summary>
    [XmlEnum("10001141")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_LEBENSVERSICHERUNG_AKTIENGESELLSCHAFT,

    /// <summary>
    /// Deutsche Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001148")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// WGV-Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001149")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WGV_Lebensversicherung_AG,

    /// <summary>
    /// ERGO Vorsorge Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001151")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Vorsorge_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Frankfurter Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001152")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Frankfurter_Lebensversicherung_AG,

    /// <summary>
    /// Sparkassen-Versicherung Sachsen Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001153")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sparkassen_Versicherung_Sachsen_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Skandia Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001157")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Skandia_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Heidelberger Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001158")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Heidelberger_Lebensversicherung_AG,

    /// <summary>
    /// VPV Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001160")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VPV_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// myLife Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001162")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    myLife_Lebensversicherung_AG,

    /// <summary>
    /// neue leben Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001164")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    neue_leben_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Delta Direkt Lebensversicherung Aktiengesellschaft München
    /// </summary>
    [XmlEnum("10001167")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Delta_Direkt_Lebensversicherung_Aktiengesellschaft_M_nchen,

    /// <summary>
    /// Concordia oeco Lebensversicherungs-AG
    /// </summary>
    [XmlEnum("10001177")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Concordia_oeco_Lebensversicherungs_AG,

    /// <summary>
    /// Cardif Lebensversicherung Zweigniederlassung für Deutschland der Cardif Assurance Vie
    /// </summary>
    [XmlEnum("10001182")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cardif_Lebensversicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurance_Vie,

    /// <summary>
    /// CIGNA Life Insurance Company of Europe S.A.-N.V. Direktion Für Deutschland
    /// </summary>
    [XmlEnum("10001189")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V_Direktion_F_r_Deutschland,

    /// <summary>
    /// LPV Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001194")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LPV_Lebensversicherung_AG,

    /// <summary>
    /// Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
    /// </summary>
    [XmlEnum("10001205")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh,

    /// <summary>
    /// Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
    /// </summary>
    [XmlEnum("10001206")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_2,

    /// <summary>
    /// Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
    /// </summary>
    [XmlEnum("10001207")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_3,

    /// <summary>
    /// Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
    /// </summary>
    [XmlEnum("10001208")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_4,

    /// <summary>
    /// Ulf Peters Sonderb. f.d. öff.-r.LV.Anst. der Sudetenländer i.L.
    /// </summary>
    [XmlEnum("10001209")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ulf_Peters_Sonderb_f_d_ff_r_LV_Anst_der_Sudetenl_nder_i_L,

    /// <summary>
    /// Canada Life Assurance Europe plc Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10001300")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Canada_Life_Assurance_Europe_plc_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// &quot;Mediolanum International Life Designated Activity Company&quot; Niederlassung München
    /// </summary>
    [XmlEnum("10001308")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mediolanum_International_Life_Designated_Activity_Company_Niederlassung_M_nchen,

    /// <summary>
    /// Protektor Lebensversicherungs-AG
    /// </summary>
    [XmlEnum("10001309")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Protektor_Lebensversicherungs_AG,

    /// <summary>
    /// Versicherer im Raum der Kirchen Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001310")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherer_im_Raum_der_Kirchen_Lebensversicherung_AG,

    /// <summary>
    /// Hannoversche Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001312")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hannoversche_Lebensversicherung_AG,

    /// <summary>
    /// Aioi Nissay Dowa Life Insurance of Europe Aktiengesellschaft
    /// </summary>
    [XmlEnum("10001318")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Aioi_Nissay_Dowa_Life_Insurance_of_Europe_Aktiengesellschaft,

    /// <summary>
    /// Swiss Life Products (Luxembourg) S.A., Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10001328")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Products_Luxembourg_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Monument Assurance Luxembourg S.A. - Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10001329")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Monument_Assurance_Luxembourg_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// INTER Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001330")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    INTER_Lebensversicherung_AG,

    /// <summary>
    /// Allianz Global Life Designated Activity Company Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10001331")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Global_Life_Designated_Activity_Company_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Continentale Lebensversicherung AG
    /// </summary>
    [XmlEnum("10001335")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Continentale_Lebensversicherung_AG,

    /// <summary>
    /// HAMBURGER PENSIONSKASSE VON 1905 Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002001")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HAMBURGER_PENSIONSKASSE_VON_1905_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Phoenix Pensionskasse von 1925 Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002007")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Phoenix_Pensionskasse_von_1925_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Pensionskasse für Angestellte der Continental Aktiengesellschaft VVaG
    /// </summary>
    [XmlEnum("10002008")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_f_r_Angestellte_der_Continental_Aktiengesellschaft_VVaG,

    /// <summary>
    /// VERKA VK Kirchliche Vorsorge VVaG
    /// </summary>
    [XmlEnum("10002009")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VERKA_VK_Kirchliche_Vorsorge_VVaG,

    /// <summary>
    /// Ruhegeld-, Witwen- und Waisenkasse d. Bergischen Elektrizitäts-Versorgungs-GmbH (VVaG) i.L.
    /// </summary>
    [XmlEnum("10002012")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ruhegeld_Witwen_und_Waisenkasse_d_Bergischen_Elektrizit_ts_Versorgungs_GmbH_VVaG_i_L,

    /// <summary>
    /// Bayer-Pensionskasse
    /// </summary>
    [XmlEnum("10002017")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayer_Pensionskasse,

    /// <summary>
    /// Allianz Versorgungskasse Versicherungsverein a.G.
    /// </summary>
    [XmlEnum("10002018")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Versorgungskasse_Versicherungsverein_a_G,

    /// <summary>
    /// Versorgungskasse der Volksfürsorge VVaG
    /// </summary>
    [XmlEnum("10002020")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Volksf_rsorge_VVaG,

    /// <summary>
    /// Pensionskasse der BOGESTRA
    /// </summary>
    [XmlEnum("10002027")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_BOGESTRA,

    /// <summary>
    /// Ruhegeldkasse der Bremer Straßenbahn (VVaG)
    /// </summary>
    [XmlEnum("10002028")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ruhegeldkasse_der_Bremer_Stra_enbahn_VVaG,

    /// <summary>
    /// Versorgungskasse f. d. Angest. d. AachenMünchener Versicherung AG u.d. Generali Deutschland AG
    /// </summary>
    [XmlEnum("10002029")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_f_d_Angest_d_AachenM_nchener_Versicherung_AG_u_d_Generali_Deutschland_AG,

    /// <summary>
    /// Versorgungskasse Deutscher Unternehmen, Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002031")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_Deutscher_Unternehmen_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Versorgungskasse der Firma M. DuMont Schauberg Expedition der Kölnischen Zeitung
    /// </summary>
    [XmlEnum("10002032")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Firma_M_DuMont_Schauberg_Expedition_der_K_lnischen_Zeitung,

    /// <summary>
    /// Pensionskasse HT Troplast Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002034")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_HT_Troplast_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Pensionskasse für die Angestellten der BARMER Ersatzkasse VVaG
    /// </summary>
    [XmlEnum("10002035")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_f_r_die_Angestellten_der_BARMER_Ersatzkasse_VVaG,

    /// <summary>
    /// MER-Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002037")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MER_Pensionskasse_VVaG,

    /// <summary>
    /// Debeka Zusatzversorgungskasse VaG
    /// </summary>
    [XmlEnum("10002038")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Debeka_Zusatzversorgungskasse_VaG,

    /// <summary>
    /// Müllerei-Pensionskasse Versicherungsverein a.G. (MPK)
    /// </summary>
    [XmlEnum("10002043")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_llerei_Pensionskasse_Versicherungsverein_a_G_MPK,

    /// <summary>
    /// Gerling Versorgungskasse
    /// </summary>
    [XmlEnum("10002044")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gerling_Versorgungskasse,

    /// <summary>
    /// R+V PENSIONSVERSICHERUNG a.G.
    /// </summary>
    [XmlEnum("10002045")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_PENSIONSVERSICHERUNG_a_G,

    /// <summary>
    /// Pensionskasse Berolina VVaG
    /// </summary>
    [XmlEnum("10002046")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Berolina_VVaG,

    /// <summary>
    /// Versorgungskasse der Deutscher Herold Versicherungsgesellschaften,Versicherungsverein a.G., Köln
    /// </summary>
    [XmlEnum("10002047")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Deutscher_Herold_Versicherungsgesellschaften_Versicherungsverein_a_G_K_ln,

    /// <summary>
    /// BVV Versicherungsverein des Bankgewerbes a.G.
    /// </summary>
    [XmlEnum("10002048")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BVV_Versicherungsverein_des_Bankgewerbes_a_G,

    /// <summary>
    /// Pensionskasse für die Deutsche Wirtschaft vormals Pensionskasse der chemischen Industrie Deutschlands
    /// </summary>
    [XmlEnum("10002052")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_f_r_die_Deutsche_Wirtschaft_vormals_Pensionskasse_der_chemischen_Industrie_Deutschlands,

    /// <summary>
    /// Pensionskasse der BERLIN-KÖLNISCHE Versicherungen
    /// </summary>
    [XmlEnum("10002055")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_BERLIN_K_LNISCHE_Versicherungen,

    /// <summary>
    /// Pensionskasse der Gewerkschaft Eisenhütte Westfalia i.L. , c/o Caterpillar Global Mining Europe GmbH
    /// </summary>
    [XmlEnum("10002063")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Gewerkschaft_Eisenh_tte_Westfalia_i_L_c_o_Caterpillar_Global_Mining_Europe_GmbH,

    /// <summary>
    /// PENSIONSKASSE der Hamburger Hochbahn Aktiengesellschaft - VVaG -
    /// </summary>
    [XmlEnum("10002067")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PENSIONSKASSE_der_Hamburger_Hochbahn_Aktiengesellschaft_VVaG,

    /// <summary>
    /// Versorgungskasse der Angestellten der Norddeutschen Affinerie
    /// </summary>
    [XmlEnum("10002073")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Angestellten_der_Norddeutschen_Affinerie,

    /// <summary>
    /// Pensionskasse der Lotsenbrüderschaft Elbe
    /// </summary>
    [XmlEnum("10002076")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Lotsenbr_derschaft_Elbe,

    /// <summary>
    /// Pensionskasse vom Deutschen Roten Kreuz VVaG
    /// </summary>
    [XmlEnum("10002083")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_vom_Deutschen_Roten_Kreuz_VVaG,

    /// <summary>
    /// Alters- und Hinterbliebenen- Versicherung der Technischen Überwachungs-Vereine-VVaG-
    /// </summary>
    [XmlEnum("10002088")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alters_und_Hinterbliebenen_Versicherung_der_Technischen_berwachungs_Vereine_VVaG,

    /// <summary>
    /// Pensionskasse Schenker VVaG
    /// </summary>
    [XmlEnum("10002089")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Schenker_VVaG,

    /// <summary>
    /// PENSIONSKASSE Deutscher Genossenschaften VVaG
    /// </summary>
    [XmlEnum("10002092")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PENSIONSKASSE_Deutscher_Genossenschaften_VVaG,

    /// <summary>
    /// Pensionskasse SIGNAL Versicherungen VVaG
    /// </summary>
    [XmlEnum("10002095")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_SIGNAL_Versicherungen_VVaG,

    /// <summary>
    /// Philips Pensionskasse (Versicherungsverein auf Gegenseitigkeit)
    /// </summary>
    [XmlEnum("10002096")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Philips_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Versorgungskasse Gothaer Versicherungsbank VVaG
    /// </summary>
    [XmlEnum("10002099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_Gothaer_Versicherungsbank_VVaG,

    /// <summary>
    /// Pensionskasse der EDEKA Organisation V.V.a.G.
    /// </summary>
    [XmlEnum("10002101")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_EDEKA_Organisation_V_V_a_G,

    /// <summary>
    /// Angest.-Pensionskasse der dt. Geschäftsbetriebe der Georg Fischer Aktiengesellschaft Schaffhausen (Schweiz)
    /// </summary>
    [XmlEnum("10002105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Angest_Pensionskasse_der_dt_Gesch_ftsbetriebe_der_Georg_Fischer_Aktiengesellschaft_Schaffhausen_Schweiz,

    /// <summary>
    /// Münchener Rück Versorgungskasse
    /// </summary>
    [XmlEnum("10002106")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_nchener_R_ck_Versorgungskasse,

    /// <summary>
    /// Pensionskasse der Württembergischen
    /// </summary>
    [XmlEnum("10002109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_W_rttembergischen,

    /// <summary>
    /// Grün + Bilfinger Wohlfahrts-und Pensionskasse a.G., c/o LDIS GmbH
    /// </summary>
    [XmlEnum("10002111")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gr_n_Bilfinger_Wohlfahrts_und_Pensionskasse_a_G_c_o_LDIS_GmbH,

    /// <summary>
    /// BASF Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BASF_Pensionskasse_VVaG,

    /// <summary>
    /// Pensionskasse der Vereinigten Hagelversicherung VVaG
    /// </summary>
    [XmlEnum("10002116")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Vereinigten_Hagelversicherung_VVaG,

    /// <summary>
    /// Pensionskasse der Bewag
    /// </summary>
    [XmlEnum("10002119")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Bewag,

    /// <summary>
    /// Dresdener Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dresdener_Pensionskasse_VVaG,

    /// <summary>
    /// Pensionskasse Degussa Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Degussa_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Versorgungskasse der Arbeiter und Angestellten der ehemaligen Großkraftwerk Franken AG i.L.
    /// </summary>
    [XmlEnum("10002129")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Arbeiter_und_Angestellten_der_ehemaligen_Gro_kraftwerk_Franken_AG_i_L,

    /// <summary>
    /// Geno Pensionskasse VVaG, Karlsruhe
    /// </summary>
    [XmlEnum("10002135")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Geno_Pensionskasse_VVaG_Karlsruhe,

    /// <summary>
    /// Glatfelter Gernsbach Pensionskasse  VVaG
    /// </summary>
    [XmlEnum("10002138")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Glatfelter_Gernsbach_Pensionskasse_VVaG,

    /// <summary>
    /// Pensionskasse Konzern Versicherungskammer Bayern VVaG
    /// </summary>
    [XmlEnum("10002142")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Konzern_Versicherungskammer_Bayern_VVaG,

    /// <summary>
    /// Pensionskasse der Wacker Chemie Versicherungsverein a.G.
    /// </summary>
    [XmlEnum("10002143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Wacker_Chemie_Versicherungsverein_a_G,

    /// <summary>
    /// Pensionskasse der HypoVereinsbank
    /// </summary>
    [XmlEnum("10002144")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_HypoVereinsbank,

    /// <summary>
    /// Pensionskasse Maxhütte VVaG
    /// </summary>
    [XmlEnum("10002145")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Maxh_tte_VVaG,

    /// <summary>
    /// Rentenzuschusskasse der N-ERGIE Aktiengesellschaft Nürnberg
    /// </summary>
    [XmlEnum("10002148")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rentenzuschusskasse_der_N_ERGIE_Aktiengesellschaft_N_rnberg,

    /// <summary>
    /// Betriebspensionskasse der Firma Carl Schenck AG VVaG Darmstadt
    /// </summary>
    [XmlEnum("10002151")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Betriebspensionskasse_der_Firma_Carl_Schenck_AG_VVaG_Darmstadt,

    /// <summary>
    /// Pensionskasse der Frankfurter Sparkasse
    /// </summary>
    [XmlEnum("10002155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Frankfurter_Sparkasse,

    /// <summary>
    /// HEAG Pensionszuschusskasse Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002157")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HEAG_Pensionszuschusskasse_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Versorgungskasse der Angestellten der GEA Group Aktiengesellschaft VVaG
    /// </summary>
    [XmlEnum("10002159")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_Angestellten_der_GEA_Group_Aktiengesellschaft_VVaG,

    /// <summary>
    /// Pensionskasse der Caritas VVaG
    /// </summary>
    [XmlEnum("10002164")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Caritas_VVaG,

    /// <summary>
    /// Pensionskasse der Novartis Pharma GmbH in Nürnberg Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002169")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Novartis_Pharma_GmbH_in_N_rnberg_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Versorgungskasse Radio Bremen
    /// </summary>
    [XmlEnum("10002175")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_Radio_Bremen,

    /// <summary>
    /// Pensionskasse der Wasserwirtschaftlichen Verbände Essen VVaG
    /// </summary>
    [XmlEnum("10002177")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Wasserwirtschaftlichen_Verb_nde_Essen_VVaG,

    /// <summary>
    /// Pensionskasse der BHW Bausparkasse
    /// </summary>
    [XmlEnum("10002179")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_BHW_Bausparkasse,

    /// <summary>
    /// Versorgungskasse der ehemaligen Bayernwerk AG, Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002183")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungskasse_der_ehemaligen_Bayernwerk_AG_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Babcock Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002186")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Babcock_Pensionskasse_VVaG,

    /// <summary>
    /// Audi Pensionskasse-Altersversorgung der AUTO UNION GmbH, Versicherungsverein auf Gegenseitigk. (VVaG) Ingolst./Donau i.L.
    /// </summary>
    [XmlEnum("10002188")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Audi_Pensionskasse_Altersversorgung_der_AUTO_UNION_GmbH_Versicherungsverein_auf_Gegenseitigk_VVaG_Ingolst_Donau_i_L,

    /// <summary>
    /// Zusatzversorgungskasse des Baugewerbes AG
    /// </summary>
    [XmlEnum("10002189")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_des_Baugewerbes_AG,

    /// <summary>
    /// VLAK VVaG Hannover
    /// </summary>
    [XmlEnum("10002194")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VLAK_VVaG_Hannover,

    /// <summary>
    /// NESTLÉ PENSIONSKASSE
    /// </summary>
    [XmlEnum("10002196")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NESTL_PENSIONSKASSE,

    /// <summary>
    /// Pensionskasse der Mitarbeiter der ehemaligen Frankona Rückversicherungs-AG V.V.a.G.
    /// </summary>
    [XmlEnum("10002204")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Mitarbeiter_der_ehemaligen_Frankona_R_ckversicherungs_AG_V_V_a_G,

    /// <summary>
    /// Zusatzversorgungskasse des Dachdeckerhandwerks VVaG
    /// </summary>
    [XmlEnum("10002209")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_des_Dachdeckerhandwerks_VVaG,

    /// <summary>
    /// Deutsche Steuerberater-Versicherung - Pensionskasse des steuerberatenden Berufs VVaG
    /// </summary>
    [XmlEnum("10002211")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_Steuerberater_Versicherung_Pensionskasse_des_steuerberatenden_Berufs_VVaG,

    /// <summary>
    /// PENSIONSKASSE DER CREOS UND ENOVOS DEUTSCHLAND VVAG
    /// </summary>
    [XmlEnum("10002214")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PENSIONSKASSE_DER_CREOS_UND_ENOVOS_DEUTSCHLAND_VVAG,

    /// <summary>
    /// Pensionskasse der Schülke &amp; Mayr GmbH V.V.a.G. c/o Aon Solutions Germany GmbH
    /// </summary>
    [XmlEnum("10002217")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Sch_lke_Mayr_GmbH_V_V_a_G_c_o_Aon_Solutions_Germany_GmbH,

    /// <summary>
    /// Zusatzversorgungskasse des Steinmetz- und Steinbildhauerhandwerks VVaG
    /// </summary>
    [XmlEnum("10002218")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_des_Steinmetz_und_Steinbildhauerhandwerks_VVaG,

    /// <summary>
    /// Pensionskasse der Genossenschaftsorganisation Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002219")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Genossenschaftsorganisation_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Zusatzversorgungskasse für die Beschäftigten der Deutschen Brot- und Backwarenindustrie VVaG
    /// </summary>
    [XmlEnum("10002220")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_f_r_die_Besch_ftigten_der_Deutschen_Brot_und_Backwarenindustrie_VVaG,

    /// <summary>
    /// Zusatzversorgungskasse für die Beschäftigten des Deutschen Bäckerhandwerks VVaG
    /// </summary>
    [XmlEnum("10002221")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_f_r_die_Besch_ftigten_des_Deutschen_B_ckerhandwerks_VVaG,

    /// <summary>
    /// Zusatzversorgungskasse der Steine- und Erden-Industrie u. des Betonsteinhandwerks VVaG Die Bayerische Pensionskasse
    /// </summary>
    [XmlEnum("10002222")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_der_Steine_und_Erden_Industrie_u_des_Betonsteinhandwerks_VVaG_Die_Bayerische_Pensionskasse,

    /// <summary>
    /// Pensionskasse der HELVETIA Schweizerische Versicherungsgesellschaft, Direktion für Deutschland
    /// </summary>
    [XmlEnum("10002223")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_HELVETIA_Schweizerische_Versicherungsgesellschaft_Direktion_f_r_Deutschland,

    /// <summary>
    /// Pensionskasse Rundfunk
    /// </summary>
    [XmlEnum("10002225")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Rundfunk,

    /// <summary>
    /// PENSIONSKASSE PEUGEOT DEUTSCHLAND VVaG
    /// </summary>
    [XmlEnum("10002226")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PENSIONSKASSE_PEUGEOT_DEUTSCHLAND_VVaG,

    /// <summary>
    /// Pensionskasse für die Arbeitnehmerinnen und Arbeitnehmer des ZDF Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002227")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_f_r_die_Arbeitnehmerinnen_und_Arbeitnehmer_des_ZDF_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Pensionskasse des BDH Bundesverband Rehabilitation, VVaG
    /// </summary>
    [XmlEnum("10002228")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_des_BDH_Bundesverband_Rehabilitation_VVaG,

    /// <summary>
    /// Pensionskasse der Rechtsanwälte und Notare VVaG
    /// </summary>
    [XmlEnum("10002232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Rechtsanw_lte_und_Notare_VVaG,

    /// <summary>
    /// Pensionskasse der VHV-Versicherungen
    /// </summary>
    [XmlEnum("10002235")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_VHV_Versicherungen,

    /// <summary>
    /// Zusatzversorgungskasse des Maler- und Lackiererhandwerks VVaG
    /// </summary>
    [XmlEnum("10002236")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_des_Maler_und_Lackiererhandwerks_VVaG,

    /// <summary>
    /// IBM Deutschland Pensionskasse Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002241")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IBM_Deutschland_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Zusatzversorgungskasse des Gerüstbaugewerbes VVaG
    /// </summary>
    [XmlEnum("10002242")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungskasse_des_Ger_stbaugewerbes_VVaG,

    /// <summary>
    /// Pensionskasse Dynamit Nobel Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002244")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Dynamit_Nobel_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// NESTLÉ RÜCKDECKUNGSKASSE
    /// </summary>
    [XmlEnum("10002245")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NESTL_R_CKDECKUNGSKASSE,

    /// <summary>
    /// Hannoversche Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002246")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hannoversche_Pensionskasse_VVaG,

    /// <summary>
    /// HAMBURGER PENSIONSRÜCKDECKUNGSKASSE  Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10002247")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HAMBURGER_PENSIONSR_CKDECKUNGSKASSE_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Hannoversche Alterskasse VVaG
    /// </summary>
    [XmlEnum("10002249")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hannoversche_Alterskasse_VVaG,

    /// <summary>
    /// Höchster Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002250")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    H_chster_Pensionskasse_VVaG,

    /// <summary>
    /// Baden-Badener Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002251")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baden_Badener_Pensionskasse_VVaG,

    /// <summary>
    /// SIGNAL IDUNA Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002252")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// Zusatzversorgungswerk für Arbeitnehmer in der Land- und Forstwirtschaft - ZLF VVaG
    /// </summary>
    [XmlEnum("10002253")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zusatzversorgungswerk_f_r_Arbeitnehmer_in_der_Land_und_Forstwirtschaft_ZLF_VVaG,

    /// <summary>
    /// Kölner Pensionskasse Versicherungsverein auf Gegenseitigkeit i.L.
    /// </summary>
    [XmlEnum("10002254")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    K_lner_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit_i_L,

    /// <summary>
    /// Gothaer Pensionskasse AG
    /// </summary>
    [XmlEnum("10002255")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gothaer_Pensionskasse_AG,

    /// <summary>
    /// Debeka Pensionskasse AG
    /// </summary>
    [XmlEnum("10002256")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Debeka_Pensionskasse_AG,

    /// <summary>
    /// Pro bAV Pensionskasse AG
    /// </summary>
    [XmlEnum("10002258")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pro_bAV_Pensionskasse_AG,

    /// <summary>
    /// ERGO Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002259")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// neue leben Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002261")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    neue_leben_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// Sparkassen Pensionskasse AG
    /// </summary>
    [XmlEnum("10002265")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sparkassen_Pensionskasse_AG,

    /// <summary>
    /// DPK Deutsche Pensionskasse AG
    /// </summary>
    [XmlEnum("10002266")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DPK_Deutsche_Pensionskasse_AG,

    /// <summary>
    /// Allgemeine Rentenanstalt Pensionskasse AG
    /// </summary>
    [XmlEnum("10002268")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allgemeine_Rentenanstalt_Pensionskasse_AG,

    /// <summary>
    /// Provinzial Pensionskasse Hannover AG
    /// </summary>
    [XmlEnum("10002269")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Pensionskasse_Hannover_AG,

    /// <summary>
    /// Swiss Life Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002270")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// HDI Pensionskasse AG
    /// </summary>
    [XmlEnum("10002275")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Pensionskasse_AG,

    /// <summary>
    /// ALTE LEIPZIGER Pensionskasse AG
    /// </summary>
    [XmlEnum("10002276")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ALTE_LEIPZIGER_Pensionskasse_AG,

    /// <summary>
    /// Versicherungskammer Bayern Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002277")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherungskammer_Bayern_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// NÜRNBERGER Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002278")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_RNBERGER_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// Athora Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10002279")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Athora_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// Zentrales Versorgungswerk für das Dachdeckerhandwerk VVaG
    /// </summary>
    [XmlEnum("10002281")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zentrales_Versorgungswerk_f_r_das_Dachdeckerhandwerk_VVaG,

    /// <summary>
    /// Rheinische Pensionskasse
    /// </summary>
    [XmlEnum("10002282")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rheinische_Pensionskasse,

    /// <summary>
    /// Versorgungsanstalt des Bundes und der Länder
    /// </summary>
    [XmlEnum("10002283")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungsanstalt_des_Bundes_und_der_L_nder,

    /// <summary>
    /// R+V PENSIONSKASSE AKTIENGESELLSCHAFT
    /// </summary>
    [XmlEnum("10002285")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_PENSIONSKASSE_AKTIENGESELLSCHAFT,

    /// <summary>
    /// Wuppertaler Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002288")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wuppertaler_Pensionskasse_VVaG,

    /// <summary>
    /// Versorgungsausgleichskasse Pensionskasse VVaG
    /// </summary>
    [XmlEnum("10002289")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versorgungsausgleichskasse_Pensionskasse_VVaG,

    /// <summary>
    /// KölnVorsorge-Sterbeversicherung VVaG
    /// </summary>
    [XmlEnum("10003008")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    K_lnVorsorge_Sterbeversicherung_VVaG,

    /// <summary>
    /// Sterbekasse Evangelischer Freikirchen VVaG
    /// </summary>
    [XmlEnum("10003009")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_Evangelischer_Freikirchen_VVaG,

    /// <summary>
    /// Sterbekasse für die Angestellten der Deutsche Bank Gruppe
    /// </summary>
    [XmlEnum("10003017")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_f_r_die_Angestellten_der_Deutsche_Bank_Gruppe,

    /// <summary>
    /// Bayer Beistandskasse
    /// </summary>
    [XmlEnum("10003019")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayer_Beistandskasse,

    /// <summary>
    /// Höchster Sterbekasse VVaG
    /// </summary>
    [XmlEnum("10003028")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    H_chster_Sterbekasse_VVaG,

    /// <summary>
    /// Vorsorgekasse der Commerzbank Versicherungsverein a.G.
    /// </summary>
    [XmlEnum("10003029")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vorsorgekasse_der_Commerzbank_Versicherungsverein_a_G,

    /// <summary>
    /// Hilfskasse BVG
    /// </summary>
    [XmlEnum("10003031")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hilfskasse_BVG,

    /// <summary>
    /// BASF Sterbekasse VVaG
    /// </summary>
    [XmlEnum("10003034")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BASF_Sterbekasse_VVaG,

    /// <summary>
    /// GE.BE.IN Versicherungen Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10003063")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GE_BE_IN_Versicherungen_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Sterbe-Unterstützungs-Vereinigung der Beschäftigten der Stadt München
    /// </summary>
    [XmlEnum("10003067")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbe_Unterst_tzungs_Vereinigung_der_Besch_ftigten_der_Stadt_M_nchen,

    /// <summary>
    /// Erste Kieler Beerdigungskasse
    /// </summary>
    [XmlEnum("10003068")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Erste_Kieler_Beerdigungskasse,

    /// <summary>
    /// Versicherungsverein Rasselstein
    /// </summary>
    [XmlEnum("10003072")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherungsverein_Rasselstein,

    /// <summary>
    /// SOLIDAR Versicherungsgemeinschaft Sterbegeldversicherung VVaG
    /// </summary>
    [XmlEnum("10003079")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SOLIDAR_Versicherungsgemeinschaft_Sterbegeldversicherung_VVaG,

    /// <summary>
    /// Sterbekasse der Bediensteten der Stadtverwaltung Dortmund
    /// </summary>
    [XmlEnum("10003084")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_der_Bediensteten_der_Stadtverwaltung_Dortmund,

    /// <summary>
    /// Feuerbestattungsverein VVaG
    /// </summary>
    [XmlEnum("10003091")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuerbestattungsverein_VVaG,

    /// <summary>
    /// Hinterbliebenenkasse der Heilberufe HDH Versicherungsverein a.G. in München
    /// </summary>
    [XmlEnum("10003092")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hinterbliebenenkasse_der_Heilberufe_HDH_Versicherungsverein_a_G_in_M_nchen,

    /// <summary>
    /// SONO Sterbegeld VVaG
    /// </summary>
    [XmlEnum("10003105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SONO_Sterbegeld_VVaG,

    /// <summary>
    /// Vorsorgekasse Hoesch Dortmund Sterbegeldversicherung VVaG
    /// </summary>
    [XmlEnum("10003107")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vorsorgekasse_Hoesch_Dortmund_Sterbegeldversicherung_VVaG,

    /// <summary>
    /// Sterbekasse der Belegschaft der Saarstahl AG Völklingen, Werk Völklingen und Werk Burbach
    /// </summary>
    [XmlEnum("10003138")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_der_Belegschaft_der_Saarstahl_AG_V_lklingen_Werk_V_lklingen_und_Werk_Burbach,

    /// <summary>
    /// Sterbekasse der Saarbergleute VVaG
    /// </summary>
    [XmlEnum("10003139")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_der_Saarbergleute_VVaG,

    /// <summary>
    /// Bochumer Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10003140")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bochumer_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Fürsorgekasse von 1908 vormals Sterbekasse der Neuapostolischen Kirche des Landes Nordrhein-Westfalen
    /// </summary>
    [XmlEnum("10003151")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    F_rsorgekasse_von_1908_vormals_Sterbekasse_der_Neuapostolischen_Kirche_des_Landes_Nordrhein_Westfalen,

    /// <summary>
    /// Sterbekasse Sozialversicherung- gegr. in der LVA Rheinprovinz - Düsseldorf
    /// </summary>
    [XmlEnum("10003152")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_Sozialversicherung_gegr_in_der_LVA_Rheinprovinz_D_sseldorf,

    /// <summary>
    /// IDEAL Sterbekasse Lebensversicherung AG
    /// </summary>
    [XmlEnum("10003154")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IDEAL_Sterbekasse_Lebensversicherung_AG,

    /// <summary>
    /// Sterbekasse der Feuerwehren, Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10003155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sterbekasse_der_Feuerwehren_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Generali Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003300")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Pensionsfonds_AG,

    /// <summary>
    /// CHEMIE Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003301")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CHEMIE_Pensionsfonds_AG,

    /// <summary>
    /// Telekom-Pensionsfonds a.G.
    /// </summary>
    [XmlEnum("10003302")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Telekom_Pensionsfonds_a_G,

    /// <summary>
    /// Deutscher Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003303")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutscher_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// Allianz Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003304")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// VIFA Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003309")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VIFA_Pensionsfonds_AG,

    /// <summary>
    /// R+V Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003311")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// LVM Pensionsfonds-AG
    /// </summary>
    [XmlEnum("10003312")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LVM_Pensionsfonds_AG,

    /// <summary>
    /// Bosch Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003313")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bosch_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// Swiss Life Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003315")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// WWK Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003318")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WWK_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// VdW Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003319")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VdW_Pensionsfonds_AG,

    /// <summary>
    /// ALTE LEIPZIGER Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003320")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ALTE_LEIPZIGER_Pensionsfonds_AG,

    /// <summary>
    /// Lippische Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003321")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lippische_Pensionsfonds_AG,

    /// <summary>
    /// ERGO Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("10003322")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// Metzler Mittelstands Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003323")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Metzler_Mittelstands_Pensionsfonds_AG,

    /// <summary>
    /// Siemens Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003324")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Siemens_Pensionsfonds_AG,

    /// <summary>
    /// RWE Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003325")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RWE_Pensionsfonds_AG,

    /// <summary>
    /// BVV Pensionsfonds des Bankgewerbes AG
    /// </summary>
    [XmlEnum("10003327")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BVV_Pensionsfonds_des_Bankgewerbes_AG,

    /// <summary>
    /// Nestlé Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003328")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nestl_Pensionsfonds_AG,

    /// <summary>
    /// HVB Trust Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003329")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HVB_Trust_Pensionsfonds_AG,

    /// <summary>
    /// Deutsche Post Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003330")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_Post_Pensionsfonds_AG,

    /// <summary>
    /// IBM Deutschland Pensionsfonds AG
    /// </summary>
    [XmlEnum("10003331")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IBM_Deutschland_Pensionsfonds_AG,

    /// <summary>
    /// SIGNAL IDUNA Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("10004002")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Krankenversicherung_a_G,

    /// <summary>
    /// ALTE OLDENBURGER Krankenversicherung von 1927 Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10004010")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ALTE_OLDENBURGER_Krankenversicherung_von_1927_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Landeskrankenhilfe V.V.a.G.
    /// </summary>
    [XmlEnum("10004011")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Landeskrankenhilfe_V_V_a_G,

    /// <summary>
    /// HanseMerkur Krankenversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10004018")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Krankenversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// MÜNCHENER VEREIN Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("10004037")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_NCHENER_VEREIN_Krankenversicherung_a_G,

    /// <summary>
    /// Süddeutsche Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("10004039")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    S_ddeutsche_Krankenversicherung_a_G,

    /// <summary>
    /// Hallesche Krankenversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10004043")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hallesche_Krankenversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// uniVersa Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("10004045")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uniVersa_Krankenversicherung_a_G,

    /// <summary>
    /// LIGA Krankenversicherung katholischer Priester Versicherungsverein auf Gegenseitigkeit Regensburg
    /// </summary>
    [XmlEnum("10004051")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LIGA_Krankenversicherung_katholischer_Priester_Versicherungsverein_auf_Gegenseitigkeit_Regensburg,

    /// <summary>
    /// praenatura Versicherungsverein auf Gegenseitigkeit (VVaG)
    /// </summary>
    [XmlEnum("10004080")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    praenatura_Versicherungsverein_auf_Gegenseitigkeit_VVaG,

    /// <summary>
    /// SONO Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("10004082")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SONO_Krankenversicherung_a_G,

    /// <summary>
    /// AXA Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004095")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// Lohnfortzahlungskasse Leer VVaG
    /// </summary>
    [XmlEnum("10004102")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lohnfortzahlungskasse_Leer_VVaG,

    /// <summary>
    /// Lohnfortzahlungskasse Aurich VVaG i.L.
    /// </summary>
    [XmlEnum("10004103")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lohnfortzahlungskasse_Aurich_VVaG_i_L,

    /// <summary>
    /// Krankenunterstützungskasse Hannover i.L.
    /// </summary>
    [XmlEnum("10004104")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Krankenunterst_tzungskasse_Hannover_i_L,

    /// <summary>
    /// St. Martinus Priesterverein der Diözese Rottenburg-Stuttgart- Kranken- und Sterbekasse (KSK) - Versicherungsverein auf Gegenseitigkeit (VVaG) i.L.
    /// </summary>
    [XmlEnum("10004106")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    St_Martinus_Priesterverein_der_Di_zese_Rottenburg_Stuttgart_Kranken_und_Sterbekasse_KSK_Versicherungsverein_auf_Gegenseitigkeit_VVaG_i_L,

    /// <summary>
    /// UNION KRANKENVERSICHERUNG AKTIENGESELLSCHAFT
    /// </summary>
    [XmlEnum("10004108")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNION_KRANKENVERSICHERUNG_AKTIENGESELLSCHAFT,

    /// <summary>
    /// LVM Krankenversicherungs-AG
    /// </summary>
    [XmlEnum("10004109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LVM_Krankenversicherungs_AG,

    /// <summary>
    /// ARAG Krankenversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004112")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ARAG_Krankenversicherungs_Aktiengesellschaft,

    /// <summary>
    /// vigo Krankenversicherung VVaG
    /// </summary>
    [XmlEnum("10004115")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    vigo_Krankenversicherung_VVaG,

    /// <summary>
    /// R+V Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004116")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// HUK-COBURG-Krankenversicherung AG
    /// </summary>
    [XmlEnum("10004117")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Krankenversicherung_AG,

    /// <summary>
    /// Concordia Krankenversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004118")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Concordia_Krankenversicherungs_Aktiengesellschaft,

    /// <summary>
    /// ENVIVAS Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ENVIVAS_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// HanseMerkur Speziale Krankenversicherung AG
    /// </summary>
    [XmlEnum("10004122")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Speziale_Krankenversicherung_AG,

    /// <summary>
    /// NÜRNBERGER Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004125")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_RNBERGER_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// ERGO Krankenversicherung AG
    /// </summary>
    [XmlEnum("10004126")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Krankenversicherung_AG,

    /// <summary>
    /// Augenoptiker Ausgleichskasse VVaG (AKA)
    /// </summary>
    [XmlEnum("10004129")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Augenoptiker_Ausgleichskasse_VVaG_AKA,

    /// <summary>
    /// DEVK Krankenversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004131")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Krankenversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Bayerische Beamtenkrankenkasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004134")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayerische_Beamtenkrankenkasse_Aktiengesellschaft,

    /// <summary>
    /// Provinzial Krankenversicherung Hannover AG
    /// </summary>
    [XmlEnum("10004135")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Krankenversicherung_Hannover_AG,

    /// <summary>
    /// Württembergische Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004139")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_rttembergische_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// Mecklenburgische Krankenversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10004141")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mecklenburgische_Krankenversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Versicherer im Raum der Kirchen Krankenversicherung AG
    /// </summary>
    [XmlEnum("10004143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherer_im_Raum_der_Kirchen_Krankenversicherung_AG,

    /// <summary>
    /// HanseMerkur Krankenversicherung AG
    /// </summary>
    [XmlEnum("10004144")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Krankenversicherung_AG,

    /// <summary>
    /// CONSTANTIA Versicherungen a.G.
    /// </summary>
    [XmlEnum("10005004")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CONSTANTIA_Versicherungen_a_G,

    /// <summary>
    /// SHB Allgemeine Versicherung VVaG
    /// </summary>
    [XmlEnum("10005008")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SHB_Allgemeine_Versicherung_VVaG,

    /// <summary>
    /// Hamburger Beamten-Feuer-und Einbruchskasse
    /// </summary>
    [XmlEnum("10005011")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hamburger_Beamten_Feuer_und_Einbruchskasse,

    /// <summary>
    /// Hamburger Lehrer-Feuerkasse
    /// </summary>
    [XmlEnum("10005012")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hamburger_Lehrer_Feuerkasse,

    /// <summary>
    /// Lehrer-Feuerversicherungsverein a.G. für Schleswig-Holstein, Hamburg und Mecklenburg-Vorpommern
    /// </summary>
    [XmlEnum("10005013")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lehrer_Feuerversicherungsverein_a_G_f_r_Schleswig_Holstein_Hamburg_und_Mecklenburg_Vorpommern,

    /// <summary>
    /// Neuendorfer Brand-Bau-Gilde
    /// </summary>
    [XmlEnum("10005014")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Neuendorfer_Brand_Bau_Gilde,

    /// <summary>
    /// NV-Versicherungen VVaG
    /// </summary>
    [XmlEnum("10005015")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NV_Versicherungen_VVaG,

    /// <summary>
    /// Nordhemmer Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005016")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nordhemmer_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Ostangler Brandgilde, Versicherungsverein auf Gegenseitigkeit (VVaG)
    /// </summary>
    [XmlEnum("10005017")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ostangler_Brandgilde_Versicherungsverein_auf_Gegenseitigkeit_VVaG,

    /// <summary>
    /// Schutzverein Deutscher Rheder V.a.G.
    /// </summary>
    [XmlEnum("10005018")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schutzverein_Deutscher_Rheder_V_a_G,

    /// <summary>
    /// Feuersozietät Berlin Brandenburg Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005024")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuersoziet_t_Berlin_Brandenburg_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Liberty Mutual Insurance Europe SE Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005028")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Liberty_Mutual_Insurance_Europe_SE_Direktion_f_r_Deutschland,

    /// <summary>
    /// Aioi Nissay Dowa Insurance Company of Europe SE, Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10005029")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Aioi_Nissay_Dowa_Insurance_Company_of_Europe_SE_Niederlassung_Deutschland,

    /// <summary>
    /// Freeyou Insurance AG
    /// </summary>
    [XmlEnum("10005033")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freeyou_Insurance_AG,

    /// <summary>
    /// AGILA Haustierversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005035")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AGILA_Haustierversicherung_Aktiengesellschaft,

    /// <summary>
    /// SV SparkassenVersicherung Gebäudeversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005036")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SV_SparkassenVersicherung_Geb_udeversicherung_Aktiengesellschaft,

    /// <summary>
    /// Euro-Aviation Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005038")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Euro_Aviation_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Bayerische Landesbrandversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005043")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayerische_Landesbrandversicherung_Aktiengesellschaft,

    /// <summary>
    /// Haftpflichtgemeinschaft Deutscher Nahverkehrs- und Versorgungsunternehmen Allgemein (HDNA) VVaG
    /// </summary>
    [XmlEnum("10005044")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Haftpflichtgemeinschaft_Deutscher_Nahverkehrs_und_Versorgungsunternehmen_Allgemein_HDNA_VVaG,

    /// <summary>
    /// Verti Versicherung AG
    /// </summary>
    [XmlEnum("10005055")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Verti_Versicherung_AG,

    /// <summary>
    /// Cardif Allgemeine Versicherung Zweigniederlassung für Deutschland der Cardif-Assurances Risques Divers
    /// </summary>
    [XmlEnum("10005056")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cardif_Allgemeine_Versicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurances_Risques_Divers,

    /// <summary>
    /// Interlloyd Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005057")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Interlloyd_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// KRAVAG-ALLGEMEINE Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005058")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KRAVAG_ALLGEMEINE_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Mannheimer Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005061")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mannheimer_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// AMMERLÄNDER VERSICHERUNG Versicherungsverein a.G. (VVaG)
    /// </summary>
    [XmlEnum("10005068")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AMMERL_NDER_VERSICHERUNG_Versicherungsverein_a_G_VVaG,

    /// <summary>
    /// nexible Versicherung AG
    /// </summary>
    [XmlEnum("10005070")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    nexible_Versicherung_AG,

    /// <summary>
    /// If Schadenversicherung AG Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005072")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    If_Schadenversicherung_AG_Direktion_f_r_Deutschland,

    /// <summary>
    /// Janitos Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005078")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Janitos_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// KRAVAG-LOGISTIC Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005080")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KRAVAG_LOGISTIC_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Waldenburger Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005082")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Waldenburger_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// BVAG Berliner Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005083")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BVAG_Berliner_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// HDI Versicherung AG
    /// </summary>
    [XmlEnum("10005085")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Versicherung_AG,

    /// <summary>
    /// HUK24 AG
    /// </summary>
    [XmlEnum("10005086")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK24_AG,

    /// <summary>
    /// XL Insurance Company SE Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005088")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    XL_Insurance_Company_SE_Direktion_f_r_Deutschland,

    /// <summary>
    /// Union Reiseversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005094")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Union_Reiseversicherung_Aktiengesellschaft,

    /// <summary>
    /// Provinzial Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005095")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// HDI Global SE
    /// </summary>
    [XmlEnum("10005096")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Global_SE,

    /// <summary>
    /// Versicherer im Raum der Kirchen Sachversicherung AG
    /// </summary>
    [XmlEnum("10005098")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherer_im_Raum_der_Kirchen_Sachversicherung_AG,

    /// <summary>
    /// VRK Versicherungsverein auf Gegenseitigkeit im Raum der Kirchen
    /// </summary>
    [XmlEnum("10005099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VRK_Versicherungsverein_auf_Gegenseitigkeit_im_Raum_der_Kirchen,

    /// <summary>
    /// EUROMAF Assurance des Ingénieurs et Architectes Européens Zweigniederlassung Düsseldorf
    /// </summary>
    [XmlEnum("10005115")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROMAF_Assurance_des_Ing_nieurs_et_Architectes_Europ_ens_Zweigniederlassung_D_sseldorf,

    /// <summary>
    /// Rhion Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Rhion_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// SIGNAL IDUNA Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005125")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Hübener Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005126")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    H_bener_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// SOGECAP S.A. Deutsche Niederlassung
    /// </summary>
    [XmlEnum("10005128")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SOGECAP_S_A_Deutsche_Niederlassung,

    /// <summary>
    /// DFV Deutsche Familienversicherung AG
    /// </summary>
    [XmlEnum("10005129")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DFV_Deutsche_Familienversicherung_AG,

    /// <summary>
    /// CREDENDO - Guarantees &amp; Speciality Risks SA/NV, Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("10005134")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CREDENDO_Guarantees_Speciality_Risks_SA_NV_Zweigniederlassung_Deutschland,

    /// <summary>
    /// ADAC Autoversicherung AG
    /// </summary>
    [XmlEnum("10005135")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADAC_Autoversicherung_AG,

    /// <summary>
    /// Swiss Re International SE Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10005138")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Re_International_SE_Niederlassung_Deutschland,

    /// <summary>
    /// CHUBB Life Europe SE, Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005139")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CHUBB_Life_Europe_SE_Direktion_f_r_Deutschland,

    /// <summary>
    /// Oberösterreichische Versicherung AG
    /// </summary>
    [XmlEnum("10005140")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ober_sterreichische_Versicherung_AG,

    /// <summary>
    /// East-West Assekuranz AG
    /// </summary>
    [XmlEnum("10005141")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    East_West_Assekuranz_AG,

    /// <summary>
    /// MELES Insurance A/S Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10005143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MELES_Insurance_A_S_Niederlassung_Deutschland,

    /// <summary>
    /// Credendo - Trade Credit Insurance SA/NV Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("10005144")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Credendo_Trade_Credit_Insurance_SA_NV_Zweigniederlassung_Deutschland,

    /// <summary>
    /// Balcia Insurance SE Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10005145")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Balcia_Insurance_SE_Niederlassung_Deutschland,

    /// <summary>
    /// BGV-Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005146")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BGV_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// ProTect Versicherung AG
    /// </summary>
    [XmlEnum("10005147")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ProTect_Versicherung_AG,

    /// <summary>
    /// Zurich Insurance Europe AG
    /// </summary>
    [XmlEnum("10005151")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zurich_Insurance_Europe_AG,

    /// <summary>
    /// Volkswagen Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005154")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Volkswagen_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// AXA easy Versicherung AG
    /// </summary>
    [XmlEnum("10005155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_easy_Versicherung_AG,

    /// <summary>
    /// Deutsche Assistance Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005156")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_Assistance_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// TELEFONICA SEGUROS Y REASEGUROS COMPAÑÍA ASEGURADORA SAU, Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10005157")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TELEFONICA_SEGUROS_Y_REASEGUROS_COMPA_A_ASEGURADORA_SAU_Niederlassung_Deutschland,

    /// <summary>
    /// Allcura Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005159")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allcura_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// BA die Bayerische Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005310")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BA_die_Bayerische_Allgemeine_Versicherung_AG,

    /// <summary>
    /// Badischer Gemeinde-Versicherungs-Verband
    /// </summary>
    [XmlEnum("10005316")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Badischer_Gemeinde_Versicherungs_Verband,

    /// <summary>
    /// Barmenia Allgemeine Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005317")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Barmenia_Allgemeine_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Bayerischer Versicherungsverband Versicherungsaktiengesellschaft
    /// </summary>
    [XmlEnum("10005324")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayerischer_Versicherungsverband_Versicherungsaktiengesellschaft,

    /// <summary>
    /// Bergische Brandversicherung Allgemeine Feuerversicherung V.a.G.
    /// </summary>
    [XmlEnum("10005326")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bergische_Brandversicherung_Allgemeine_Feuerversicherung_V_a_G,

    /// <summary>
    /// DOCURA VVaG
    /// </summary>
    [XmlEnum("10005328")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DOCURA_VVaG,

    /// <summary>
    /// MVK Versicherung VVaG
    /// </summary>
    [XmlEnum("10005334")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MVK_Versicherung_VVaG,

    /// <summary>
    /// Concordia Versicherungs-Gesellschaft auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005338")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Concordia_Versicherungs_Gesellschaft_auf_Gegenseitigkeit,

    /// <summary>
    /// Continentale Sachversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005340")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Continentale_Sachversicherung_Aktiengesellschaft,

    /// <summary>
    /// DA Deutsche Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005343")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DA_Deutsche_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// DEVK Deutsche Eisenbahn Versicherung Sach- und HUK-Versicherungsverein a.G. Betriebliche Sozialeinrichtung der Deutschen Bahn
    /// </summary>
    [XmlEnum("10005344")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Deutsche_Eisenbahn_Versicherung_Sach_und_HUK_Versicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn,

    /// <summary>
    /// Gartenbau-Versicherung VVaG
    /// </summary>
    [XmlEnum("10005346")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gartenbau_Versicherung_VVaG,

    /// <summary>
    /// Vereinigte Tierversicherung, Gesellschaft auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005348")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vereinigte_Tierversicherung_Gesellschaft_auf_Gegenseitigkeit,

    /// <summary>
    /// ERGO Reiseversicherung AG
    /// </summary>
    [XmlEnum("10005356")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Reiseversicherung_AG,

    /// <summary>
    /// Feuer- und Einbruchschadenkasse der BBBank in Karlsruhe, Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005357")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Feuer_und_Einbruchschadenkasse_der_BBBank_in_Karlsruhe_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// GVO Gegenseitigkeit Versicherung Oldenburg VVaG
    /// </summary>
    [XmlEnum("10005365")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GVO_Gegenseitigkeit_Versicherung_Oldenburg_VVaG,

    /// <summary>
    /// Gemeinnützige Haftpflichtversicherungsanstalt Kassel
    /// </summary>
    [XmlEnum("10005366")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gemeinn_tzige_Haftpflichtversicherungsanstalt_Kassel,

    /// <summary>
    /// Allianz Global Corporate &amp; Specialty SE
    /// </summary>
    [XmlEnum("10005370")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Global_Corporate_Specialty_SE,

    /// <summary>
    /// Gothaer Versicherungsbank VVaG
    /// </summary>
    [XmlEnum("10005372")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gothaer_Versicherungsbank_VVaG,

    /// <summary>
    /// Die Haftpflichtkasse VVaG
    /// </summary>
    [XmlEnum("10005374")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Die_Haftpflichtkasse_VVaG,

    /// <summary>
    /// HDI Haftpflichtverband der Deutschen Industrie Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005377")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Haftpflichtverband_der_Deutschen_Industrie_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Helvetia Schweizerische Versicherungsgesellschaft AG Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005384")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Schweizerische_Versicherungsgesellschaft_AG_Direktion_f_r_Deutschland,

    /// <summary>
    /// ISSELHORSTER Versicherung V.a.G.
    /// </summary>
    [XmlEnum("10005393")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ISSELHORSTER_Versicherung_V_a_G,

    /// <summary>
    /// KRAVAG-SACH Versicherung des Deutschen Kraftverkehrs Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005399")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KRAVAG_SACH_Versicherung_des_Deutschen_Kraftverkehrs_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Landschaftliche Brandkasse Hannover
    /// </summary>
    [XmlEnum("10005400")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Landschaftliche_Brandkasse_Hannover,

    /// <summary>
    /// Itzehoer Versicherung/Brandgilde von 1691 Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005401")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Itzehoer_Versicherung_Brandgilde_von_1691_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// LVM Landwirtschaftlicher Versicherungsverein Münster a.G.
    /// </summary>
    [XmlEnum("10005402")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LVM_Landwirtschaftlicher_Versicherungsverein_M_nster_a_G,

    /// <summary>
    /// LBN Versicherungsverein a.G. (VVaG)
    /// </summary>
    [XmlEnum("10005404")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LBN_Versicherungsverein_a_G_VVaG,

    /// <summary>
    /// Alte Leipziger Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005405")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alte_Leipziger_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// MÜNCHENER VEREIN Allgemeine Versicherungs-AG
    /// </summary>
    [XmlEnum("10005414")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_NCHENER_VEREIN_Allgemeine_Versicherungs_AG,

    /// <summary>
    /// Vereinigte Hagelversicherung VVaG
    /// </summary>
    [XmlEnum("10005419")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vereinigte_Hagelversicherung_VVaG,

    /// <summary>
    /// NÜRNBERGER Allgemeine Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005426")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_RNBERGER_Allgemeine_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// R+V Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005438")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Allianz Direct Versicherungs-AG
    /// </summary>
    [XmlEnum("10005441")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Direct_Versicherungs_AG,

    /// <summary>
    /// Hagelgilde Versicherungsverein a.G., gegründet 1811
    /// </summary>
    [XmlEnum("10005445")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hagelgilde_Versicherungsverein_a_G_gegr_ndet_1811,

    /// <summary>
    /// Provinzial Nord Brandkasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005446")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Nord_Brandkasse_Aktiengesellschaft,

    /// <summary>
    /// Helvetia Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005448")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// ARAG Allgemeine Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005455")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ARAG_Allgemeine_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Uelzener Allgemeine Versicherungs-Gesellschaft a.G.
    /// </summary>
    [XmlEnum("10005459")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Uelzener_Allgemeine_Versicherungs_Gesellschaft_a_G,

    /// <summary>
    /// VPV Allgemeine Versicherungs-AG
    /// </summary>
    [XmlEnum("10005461")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VPV_Allgemeine_Versicherungs_AG,

    /// <summary>
    /// uniVersa Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005463")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    uniVersa_Allgemeine_Versicherung_AG,

    /// <summary>
    /// VHV Vereinigte Hannoversche Versicherung a.G.
    /// </summary>
    [XmlEnum("10005464")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VHV_Vereinigte_Hannoversche_Versicherung_a_G,

    /// <summary>
    /// Versicherungsverband Deutscher Eisenbahnen-Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005468")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherungsverband_Deutscher_Eisenbahnen_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// GVV-Kommunalversicherung, Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005469")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GVV_Kommunalversicherung_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Fahrlehrerversicherung Verein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005470")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fahrlehrerversicherung_Verein_auf_Gegenseitigkeit,

    /// <summary>
    /// WWK Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005476")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WWK_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Württembergische Gemeinde-Versicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005479")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_rttembergische_Gemeinde_Versicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// VOLKSWOHL-BUND SACHVERSICHERUNG AKTIENGESELLSCHAFT
    /// </summary>
    [XmlEnum("10005484")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VOLKSWOHL_BUND_SACHVERSICHERUNG_AKTIENGESELLSCHAFT,

    /// <summary>
    /// GRUNDEIGENTÜMER-VERSICHERUNG Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005485")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GRUNDEIGENT_MER_VERSICHERUNG_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Schleswiger Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005491")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Schleswiger_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// HanseMerkur Reiseversicherung AG
    /// </summary>
    [XmlEnum("10005496")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Reiseversicherung_AG,

    /// <summary>
    /// ADAC Versicherung AG
    /// </summary>
    [XmlEnum("10005498")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADAC_Versicherung_AG,

    /// <summary>
    /// Pallas Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005499")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pallas_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// HanseMerkur Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005501")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_Allgemeine_Versicherung_AG,

    /// <summary>
    /// GARANTA Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005505")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GARANTA_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// EUROPA Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005508")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROPA_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// DEVK Allgemeine Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005513")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Allgemeine_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// AXA Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005515")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// HUK-COBURG-Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005521")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Allgemeine_Versicherung_AG,

    /// <summary>
    /// Dolleruper Freie Brandgilde
    /// </summary>
    [XmlEnum("10005522")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dolleruper_Freie_Brandgilde,

    /// <summary>
    /// WGV-Versicherung AG
    /// </summary>
    [XmlEnum("10005525")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WGV_Versicherung_AG,

    /// <summary>
    /// ROLAND Schutzbrief-Versicherung AG
    /// </summary>
    [XmlEnum("10005528")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ROLAND_Schutzbrief_Versicherung_AG,

    /// <summary>
    /// Vereinigte Schiffs-Versicherung V. a. G.
    /// </summary>
    [XmlEnum("10005530")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vereinigte_Schiffs_Versicherung_V_a_G,

    /// <summary>
    /// KS Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005534")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KS_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Gebäudeversicherungsgilde für Föhr,Amrum und Halligen
    /// </summary>
    [XmlEnum("10005539")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Geb_udeversicherungsgilde_f_r_F_hr_Amrum_und_Halligen,

    /// <summary>
    /// Harsewinkeler Versicherung VaG
    /// </summary>
    [XmlEnum("10005544")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Harsewinkeler_Versicherung_VaG,

    /// <summary>
    /// INTER Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005546")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    INTER_Allgemeine_Versicherung_AG,

    /// <summary>
    /// CG Car-Garantie Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005547")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CG_Car_Garantie_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Debeka Allgemeine Versicherung Aktiengesellschaft Sitz Koblenz am Rhein
    /// </summary>
    [XmlEnum("10005549")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Debeka_Allgemeine_Versicherung_Aktiengesellschaft_Sitz_Koblenz_am_Rhein,

    /// <summary>
    /// Cosmos Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005552")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cosmos_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// OSTBEVERNER Versicherungsverein auf Gegenseitigkeit (VVaG)
    /// </summary>
    [XmlEnum("10005556")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OSTBEVERNER_Versicherungsverein_auf_Gegenseitigkeit_VVaG,

    /// <summary>
    /// Häger Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005557")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    H_ger_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// SCHNEVERDINGER Versicherungsverein a.G.
    /// </summary>
    [XmlEnum("10005559")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SCHNEVERDINGER_Versicherungsverein_a_G,

    /// <summary>
    /// ERGO Direkt Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005562")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Direkt_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// TRIAS Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005567")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TRIAS_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// IDEAL Versicherung AG
    /// </summary>
    [XmlEnum("10005573")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IDEAL_Versicherung_AG,

    /// <summary>
    /// ADLER Versicherung AG
    /// </summary>
    [XmlEnum("10005581")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADLER_Versicherung_AG,

    /// <summary>
    /// PVAG Polizeiversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005583")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PVAG_Polizeiversicherungs_Aktiengesellschaft,

    /// <summary>
    /// GVV Direktversicherung AG
    /// </summary>
    [XmlEnum("10005585")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GVV_Direktversicherung_AG,

    /// <summary>
    /// Stuttgarter Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005586")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Stuttgarter_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// GGG Kraftfahrzeug-Reparaturkosten-Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005589")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GGG_Kraftfahrzeug_Reparaturkosten_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Würzburger Versicherungs-AG
    /// </summary>
    [XmlEnum("10005590")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_rzburger_Versicherungs_AG,

    /// <summary>
    /// neue leben Unfallversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005591")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    neue_leben_Unfallversicherung_Aktiengesellschaft,

    /// <summary>
    /// Deutsche Rhederei Versicherungs-Aktiengesellschaft i.L.
    /// </summary>
    [XmlEnum("10005631")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_Rhederei_Versicherungs_Aktiengesellschaft_i_L,

    /// <summary>
    /// Delvag Versicherungs-AG
    /// </summary>
    [XmlEnum("10005632")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Delvag_Versicherungs_AG,

    /// <summary>
    /// Baloise Sachversicherung Aktiengesellschaft Deutschland
    /// </summary>
    [XmlEnum("10005633")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Sachversicherung_Aktiengesellschaft_Deutschland,

    /// <summary>
    /// AWP P&amp;C S.A. Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10005636")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AWP_P_C_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// F. Laeisz Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005656")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    F_Laeisz_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Minerva Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005671")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Minerva_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// NÜRNBERGER BEAMTEN ALLGEMEINE VERSICHERUNG AKTIENGESELLSCHAFT
    /// </summary>
    [XmlEnum("10005686")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_RNBERGER_BEAMTEN_ALLGEMEINE_VERSICHERUNG_AKTIENGESELLSCHAFT,

    /// <summary>
    /// Hanse-Marine-Versicherung AG
    /// </summary>
    [XmlEnum("10005754")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hanse_Marine_Versicherung_AG,

    /// <summary>
    /// Thüga Schadenausgleichskasse München VVaG i.L.
    /// </summary>
    [XmlEnum("10005767")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Th_ga_Schadenausgleichskasse_M_nchen_VVaG_i_L,

    /// <summary>
    /// DARAG Deutschland AG
    /// </summary>
    [XmlEnum("10005771")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DARAG_Deutschland_AG,

    /// <summary>
    /// SAARLAND Feuerversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005773")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SAARLAND_Feuerversicherung_Aktiengesellschaft,

    /// <summary>
    /// InterRisk Versicherungs-AG Vienna Insurance Group.
    /// </summary>
    [XmlEnum("10005780")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    InterRisk_Versicherungs_AG_Vienna_Insurance_Group,

    /// <summary>
    /// Sparkassen-Versicherung Sachsen Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005781")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sparkassen_Versicherung_Sachsen_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// OKV - Ostdeutsche Kommunalversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005786")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OKV_Ostdeutsche_Kommunalversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// BavariaDirekt Versicherung AG
    /// </summary>
    [XmlEnum("10005787")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BavariaDirekt_Versicherung_AG,

    /// <summary>
    /// Inter Partner Assistance SA Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005788")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Inter_Partner_Assistance_SA_Direktion_f_r_Deutschland,

    /// <summary>
    /// NEH Neue Hildener Versicherung AG
    /// </summary>
    [XmlEnum("10005790")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NEH_Neue_Hildener_Versicherung_AG,

    /// <summary>
    /// ARAG SE
    /// </summary>
    [XmlEnum("10005800")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ARAG_SE,

    /// <summary>
    /// AUXILIA Rechtsschutz-Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005801")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AUXILIA_Rechtsschutz_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// DEURAG Deutsche Rechtsschutz-Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005803")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEURAG_Deutsche_Rechtsschutz_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Neue Rechtsschutz-Versicherungsgesellschaft Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005805")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Neue_Rechtsschutz_Versicherungsgesellschaft_Aktiengesellschaft,

    /// <summary>
    /// ROLAND Rechtsschutz-Versicherungs-AG
    /// </summary>
    [XmlEnum("10005807")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ROLAND_Rechtsschutz_Versicherungs_AG,

    /// <summary>
    /// ADVOCARD Rechtsschutzversicherung AG
    /// </summary>
    [XmlEnum("10005809")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADVOCARD_Rechtsschutzversicherung_AG,

    /// <summary>
    /// ÖRAG Rechtsschutzversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005813")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RAG_Rechtsschutzversicherungs_Aktiengesellschaft,

    /// <summary>
    /// HUK-COBURG-Rechtsschutzversicherung AG
    /// </summary>
    [XmlEnum("10005818")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Rechtsschutzversicherung_AG,

    /// <summary>
    /// DEVK Rechtsschutz-Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005829")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Rechtsschutz_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// DMB Rechtsschutz-Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005834")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DMB_Rechtsschutz_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Badische Rechtsschutzversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005838")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Badische_Rechtsschutzversicherung_Aktiengesellschaft,

    /// <summary>
    /// Pensions-Sicherungs-Verein Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10005856")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensions_Sicherungs_Verein_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Gothaer Allgemeine Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10005858")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gothaer_Allgemeine_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// VHV Allgemeine Versicherung AG
    /// </summary>
    [XmlEnum("10005862")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VHV_Allgemeine_Versicherung_AG,

    /// <summary>
    /// CHUBB European Group SE, Direktion für Deutschland
    /// </summary>
    [XmlEnum("10005902")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CHUBB_European_Group_SE_Direktion_f_r_Deutschland,

    /// <summary>
    /// RGA International Reinsurance Company Designated Activity Company, Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("10006800")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RGA_International_Reinsurance_Company_Designated_Activity_Company_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Mapfre Re, Compania de Reaseguros, S.A. Munich Branch
    /// </summary>
    [XmlEnum("10006801")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mapfre_Re_Compania_de_Reaseguros_S_A_Munich_Branch,

    /// <summary>
    /// Swiss Re Europe S.A., Niederlassung Deutschland
    /// </summary>
    [XmlEnum("10006802")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Re_Europe_S_A_Niederlassung_Deutschland,

    /// <summary>
    /// SCOR Rückversicherung Deutschland, Niederlassung der SCOR SE
    /// </summary>
    [XmlEnum("10006803")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SCOR_R_ckversicherung_Deutschland_Niederlassung_der_SCOR_SE,

    /// <summary>
    /// Deutsche Rückversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006907")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_R_ckversicherung_Aktiengesellschaft,

    /// <summary>
    /// E+S Rückversicherung AG
    /// </summary>
    [XmlEnum("10006908")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    E_S_R_ckversicherung_AG,

    /// <summary>
    /// General Reinsurance AG
    /// </summary>
    [XmlEnum("10006918")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    General_Reinsurance_AG,

    /// <summary>
    /// Kieler Rückversicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10006925")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kieler_R_ckversicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// RISICOM Rückversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006946")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RISICOM_R_ckversicherung_Aktiengesellschaft,

    /// <summary>
    /// Allianz SE
    /// </summary>
    [XmlEnum("10006949")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_SE,

    /// <summary>
    /// PRORÜCK Rückversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006951")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PROR_CK_R_ckversicherungs_Aktiengesellschaft,

    /// <summary>
    /// R+V VERSICHERUNG AG
    /// </summary>
    [XmlEnum("10006960")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    R_V_VERSICHERUNG_AG,

    /// <summary>
    /// SV SparkassenVersicherung Holding Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006964")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SV_SparkassenVersicherung_Holding_Aktiengesellschaft,

    /// <summary>
    /// Versicherungskammer Bayern Konzern-Rückversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006970")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherungskammer_Bayern_Konzern_R_ckversicherung_Aktiengesellschaft,

    /// <summary>
    /// DEVK Rückversicherungs- und Beteiligungs-Aktiengesellschaft - DEVK RE
    /// </summary>
    [XmlEnum("10006973")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_R_ckversicherungs_und_Beteiligungs_Aktiengesellschaft_DEVK_RE,

    /// <summary>
    /// Diehl Assekuranz Rückversicherungs- und Vermittlungs-AG
    /// </summary>
    [XmlEnum("10006978")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Diehl_Assekuranz_R_ckversicherungs_und_Vermittlungs_AG,

    /// <summary>
    /// Freudenberg Rückversicherung AG
    /// </summary>
    [XmlEnum("10006984")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Freudenberg_R_ckversicherung_AG,

    /// <summary>
    /// HDI Global Network AG
    /// </summary>
    [XmlEnum("10006988")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Global_Network_AG,

    /// <summary>
    /// Hochrhein Internationale Rückversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10006992")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hochrhein_Internationale_R_ckversicherung_Aktiengesellschaft,

    /// <summary>
    /// Incura AG
    /// </summary>
    [XmlEnum("10006993")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Incura_AG,

    /// <summary>
    /// BarmeniaGothaer AG
    /// </summary>
    [XmlEnum("10006994")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BarmeniaGothaer_AG,

    /// <summary>
    /// REVIUM Rückversicherung AG
    /// </summary>
    [XmlEnum("10006998")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    REVIUM_R_ckversicherung_AG,

    /// <summary>
    /// Euler Hermes SA/NV
    /// </summary>
    [XmlEnum("10007011")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Euler_Hermes_SA_NV,

    /// <summary>
    /// Liberty Mutual Insurance Europe SE
    /// </summary>
    [XmlEnum("10007013")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Liberty_Mutual_Insurance_Europe_SE,

    /// <summary>
    /// GAN Assurances
    /// </summary>
    [XmlEnum("10007027")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GAN_Assurances,

    /// <summary>
    /// Athora Belgium NV
    /// </summary>
    [XmlEnum("10007032")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Athora_Belgium_NV,

    /// <summary>
    /// GENERALI IARD
    /// </summary>
    [XmlEnum("10007067")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GENERALI_IARD,

    /// <summary>
    /// Allianz S.p.A.
    /// </summary>
    [XmlEnum("10007076")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_S_p_A,

    /// <summary>
    /// Unilever Insurances N.V.
    /// </summary>
    [XmlEnum("10007093")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unilever_Insurances_N_V,

    /// <summary>
    /// Swiss Re International SE
    /// </summary>
    [XmlEnum("10007105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Re_International_SE,

    /// <summary>
    /// Compagnie Francaise d&apos;Assurance pour le Commerce Extérieur (COFACE)
    /// </summary>
    [XmlEnum("10007119")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_COFACE,

    /// <summary>
    /// AXA Assicurazioni s.p.a.
    /// </summary>
    [XmlEnum("10007135")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Assicurazioni_s_p_a,

    /// <summary>
    /// Unipol Assicurazioni S.p.A.
    /// </summary>
    [XmlEnum("10007155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unipol_Assicurazioni_S_p_A,

    /// <summary>
    /// Miripro Insurance Company dac
    /// </summary>
    [XmlEnum("10007185")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Miripro_Insurance_Company_dac,

    /// <summary>
    /// Merkur Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007191")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Merkur_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Axa Assurances Vie Luxembourg
    /// </summary>
    [XmlEnum("10007194")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Axa_Assurances_Vie_Luxembourg,

    /// <summary>
    /// Cardif Lux Vie S.A.
    /// </summary>
    [XmlEnum("10007195")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cardif_Lux_Vie_S_A,

    /// <summary>
    /// Utmost Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007199")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Utmost_Luxembourg_S_A,

    /// <summary>
    /// The OneLife Company S.A.
    /// </summary>
    [XmlEnum("10007202")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    The_OneLife_Company_S_A,

    /// <summary>
    /// Swiss Life (Luxembourg) S.A.
    /// </summary>
    [XmlEnum("10007204")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Luxembourg_S_A,

    /// <summary>
    /// Foyer Vie S.A.
    /// </summary>
    [XmlEnum("10007206")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Foyer_Vie_S_A,

    /// <summary>
    /// Shipowners&apos; Mutual Protection &amp; Indemnity Association
    /// </summary>
    [XmlEnum("10007209")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Shipowners_Mutual_Protection_Indemnity_Association,

    /// <summary>
    /// Helvetia Versicherungen AG
    /// </summary>
    [XmlEnum("10007214")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Versicherungen_AG,

    /// <summary>
    /// MMA VIE Assurances Mutuelles
    /// </summary>
    [XmlEnum("10007217")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MMA_VIE_Assurances_Mutuelles,

    /// <summary>
    /// N.V. Schadeverzekering-Maatschappij Bovemij
    /// </summary>
    [XmlEnum("10007220")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_V_Schadeverzekering_Maatschappij_Bovemij,

    /// <summary>
    /// Oberösterreichische Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007225")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ober_sterreichische_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// CIGNA Life Insurance Company of Europe S.A./N.V.
    /// </summary>
    [XmlEnum("10007226")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V,

    /// <summary>
    /// EUROPÆISKE REJSEFORSIKRING A/S
    /// </summary>
    [XmlEnum("10007229")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROP_ISKE_REJSEFORSIKRING_A_S,

    /// <summary>
    /// EUROP ASSISTANCE SA
    /// </summary>
    [XmlEnum("10007231")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROP_ASSISTANCE_SA,

    /// <summary>
    /// APK Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    APK_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Mutuelle des Architectes Francais Assurances
    /// </summary>
    [XmlEnum("10007237")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mutuelle_des_Architectes_Francais_Assurances,

    /// <summary>
    /// Allianz Elementar Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007239")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Elementar_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Foyer Assurances S.A.
    /// </summary>
    [XmlEnum("10007246")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Foyer_Assurances_S_A,

    /// <summary>
    /// Wiener Städtische Versicherung AG Vienna Insurance Group
    /// </summary>
    [XmlEnum("10007251")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wiener_St_dtische_Versicherung_AG_Vienna_Insurance_Group,

    /// <summary>
    /// Assicurazioni Generali S.p.A.
    /// </summary>
    [XmlEnum("10007253")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assicurazioni_Generali_S_p_A,

    /// <summary>
    /// Allianz Plc
    /// </summary>
    [XmlEnum("10007257")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Plc,

    /// <summary>
    /// VAV Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007258")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VAV_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Allianz Elementar Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007261")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Elementar_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Allianz Life Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007265")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Life_Luxembourg_S_A,

    /// <summary>
    /// Società Reale Mutua di Assicurazioni
    /// </summary>
    [XmlEnum("10007267")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Societ_Reale_Mutua_di_Assicurazioni,

    /// <summary>
    /// Generali Versicherung AG
    /// </summary>
    [XmlEnum("10007268")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Versicherung_AG,

    /// <summary>
    /// Acredia Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007269")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Acredia_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Hansard Europe Designated Activity Company
    /// </summary>
    [XmlEnum("10007270")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hansard_Europe_Designated_Activity_Company,

    /// <summary>
    /// Kärntner Landesversicherung auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10007274")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    K_rntner_Landesversicherung_auf_Gegenseitigkeit,

    /// <summary>
    /// HYPO Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007278")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HYPO_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// OOM Global Care N.V.
    /// </summary>
    [XmlEnum("10007279")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OOM_Global_Care_N_V,

    /// <summary>
    /// DKV Belgium SA
    /// </summary>
    [XmlEnum("10007281")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DKV_Belgium_SA,

    /// <summary>
    /// MMA IARD Assurances Mutuelles
    /// </summary>
    [XmlEnum("10007287")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MMA_IARD_Assurances_Mutuelles,

    /// <summary>
    /// AG Insurance SA
    /// </summary>
    [XmlEnum("10007293")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AG_Insurance_SA,

    /// <summary>
    /// La Luxembourgeoise-Vie S.A.
    /// </summary>
    [XmlEnum("10007299")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    La_Luxembourgeoise_Vie_S_A,

    /// <summary>
    /// AXA BELGIUM SA
    /// </summary>
    [XmlEnum("10007300")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_BELGIUM_SA,

    /// <summary>
    /// UNIQA Österreich Versicherungen AG
    /// </summary>
    [XmlEnum("10007308")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_sterreich_Versicherungen_AG,

    /// <summary>
    /// DONAU Versicherung AG Vienna Insurance Group
    /// </summary>
    [XmlEnum("10007309")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DONAU_Versicherung_AG_Vienna_Insurance_Group,

    /// <summary>
    /// D.K.V. Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007310")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    D_K_V_Luxembourg_S_A,

    /// <summary>
    /// Grazer Wechselseitige Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007328")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Grazer_Wechselseitige_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Offaly Insurance Company DAC
    /// </summary>
    [XmlEnum("10007330")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Offaly_Insurance_Company_DAC,

    /// <summary>
    /// SIAT Società Italiana Assicurazioni e Riassicurazioni S.p.A.
    /// </summary>
    [XmlEnum("10007334")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIAT_Societ_Italiana_Assicurazioni_e_Riassicurazioni_S_p_A,

    /// <summary>
    /// Industria Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("10007350")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Industria_F_rs_kringsaktiebolag,

    /// <summary>
    /// COMPAGNIE EUROPEENNE DE GARANTIES ET CAUTIONS
    /// </summary>
    [XmlEnum("10007362")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    COMPAGNIE_EUROPEENNE_DE_GARANTIES_ET_CAUTIONS,

    /// <summary>
    /// SiriusPoint International Försäkringsaktiebolag (publ)
    /// </summary>
    [XmlEnum("10007365")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SiriusPoint_International_F_rs_kringsaktiebolag_publ,

    /// <summary>
    /// EOC Onderlinge Schepenverzekering U.A.
    /// </summary>
    [XmlEnum("10007371")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EOC_Onderlinge_Schepenverzekering_U_A,

    /// <summary>
    /// GD Insurance Company dac
    /// </summary>
    [XmlEnum("10007372")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GD_Insurance_Company_dac,

    /// <summary>
    /// AXA Assistance France Assurances
    /// </summary>
    [XmlEnum("10007374")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Assistance_France_Assurances,

    /// <summary>
    /// TCS Insurance Company of Ireland dac
    /// </summary>
    [XmlEnum("10007379")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TCS_Insurance_Company_of_Ireland_dac,

    /// <summary>
    /// Philip Morris International Insurance (Ireland) dac
    /// </summary>
    [XmlEnum("10007380")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Philip_Morris_International_Insurance_Ireland_dac,

    /// <summary>
    /// LocalTapiola General Mutual Insurance Company
    /// </summary>
    [XmlEnum("10007384")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LocalTapiola_General_Mutual_Insurance_Company,

    /// <summary>
    /// HDI Versicherung AG - Wien
    /// </summary>
    [XmlEnum("10007393")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Versicherung_AG_Wien,

    /// <summary>
    /// Assuranceforeningen GARD - Gjensidig -
    /// </summary>
    [XmlEnum("10007403")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assuranceforeningen_GARD_Gjensidig,

    /// <summary>
    /// Gjensidige Forsikring ASA
    /// </summary>
    [XmlEnum("10007404")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gjensidige_Forsikring_ASA,

    /// <summary>
    /// TIROLER VERSICHERUNG V.a.G.
    /// </summary>
    [XmlEnum("10007406")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TIROLER_VERSICHERUNG_V_a_G,

    /// <summary>
    /// Wealins S.A.
    /// </summary>
    [XmlEnum("10007410")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wealins_S_A,

    /// <summary>
    /// Vida Caixa S.A., de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("10007417")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vida_Caixa_S_A_de_Seguros_y_Reaseguros,

    /// <summary>
    /// Acadia International Insurance dac c/o Aon Insurance Managers (Dublin) Ltd
    /// </summary>
    [XmlEnum("10007418")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Acadia_International_Insurance_dac_c_o_Aon_Insurance_Managers_Dublin_Ltd,

    /// <summary>
    /// COMPANIA ESPANOLA DE SEGUROS DE CREDITO A LA EXPORTACION, S.A. COMPANIA DE SEGUROS Y REASEGUROS (CESCE)
    /// </summary>
    [XmlEnum("10007420")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    COMPANIA_ESPANOLA_DE_SEGUROS_DE_CREDITO_A_LA_EXPORTACION_S_A_COMPANIA_DE_SEGUROS_Y_REASEGUROS_CESCE,

    /// <summary>
    /// AKZO Nobel Assurantie N.V.
    /// </summary>
    [XmlEnum("10007423")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AKZO_Nobel_Assurantie_N_V,

    /// <summary>
    /// Norwegian Hull Club -Gjensidig Assuranseforening
    /// </summary>
    [XmlEnum("10007426")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Norwegian_Hull_Club_Gjensidig_Assuranseforening,

    /// <summary>
    /// XL Insurance Company SE
    /// </summary>
    [XmlEnum("10007427")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    XL_Insurance_Company_SE,

    /// <summary>
    /// Vitis Life S.A.
    /// </summary>
    [XmlEnum("10007438")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vitis_Life_S_A,

    /// <summary>
    /// ZURICH EUROLIFE S.A.
    /// </summary>
    [XmlEnum("10007439")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ZURICH_EUROLIFE_S_A,

    /// <summary>
    /// Protector Forsikring ASA
    /// </summary>
    [XmlEnum("10007444")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Protector_Forsikring_ASA,

    /// <summary>
    /// Probus Insurance Company Europe DAC
    /// </summary>
    [XmlEnum("10007455")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Probus_Insurance_Company_Europe_DAC,

    /// <summary>
    /// SOGELIFE S.A.
    /// </summary>
    [XmlEnum("10007458")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SOGELIFE_S_A,

    /// <summary>
    /// COSEC-Companhia de Seguro de Créditos, SA
    /// </summary>
    [XmlEnum("10007463")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    COSEC_Companhia_de_Seguro_de_Cr_ditos_SA,

    /// <summary>
    /// Nationale-Nederlanden Levensverzekering Maatschappij N.V.
    /// </summary>
    [XmlEnum("10007464")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nationale_Nederlanden_Levensverzekering_Maatschappij_N_V,

    /// <summary>
    /// Groupama Assicurazioni S.p.A.
    /// </summary>
    [XmlEnum("10007475")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Assicurazioni_S_p_A,

    /// <summary>
    /// Köbstaedernses almindelige Brandforsikring, gensidig
    /// </summary>
    [XmlEnum("10007476")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    K_bstaedernses_almindelige_Brandforsikring_gensidig,

    /// <summary>
    /// Fortuna Lebens-Versicherungs Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007481")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fortuna_Lebens_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// ERGO Life S.A.
    /// </summary>
    [XmlEnum("10007483")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Life_S_A,

    /// <summary>
    /// European Mutual Association for Nuclear Insurance (E.M.A.N.I.)
    /// </summary>
    [XmlEnum("10007497")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    European_Mutual_Association_for_Nuclear_Insurance_E_M_A_N_I,

    /// <summary>
    /// AmTrust International Underwriters dac
    /// </summary>
    [XmlEnum("10007509")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AmTrust_International_Underwriters_dac,

    /// <summary>
    /// CNP Assurances S.A.
    /// </summary>
    [XmlEnum("10007510")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_Assurances_S_A,

    /// <summary>
    /// Onderlinge Hagelverzekering Maatschappij Agriver B.A.
    /// </summary>
    [XmlEnum("10007512")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Onderlinge_Hagelverzekering_Maatschappij_Agriver_B_A,

    /// <summary>
    /// Borealis Insurance A/S
    /// </summary>
    [XmlEnum("10007514")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Borealis_Insurance_A_S,

    /// <summary>
    /// PI Indemnity Company, Designated Activity Company
    /// </summary>
    [XmlEnum("10007515")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PI_Indemnity_Company_Designated_Activity_Company,

    /// <summary>
    /// BPCE Life
    /// </summary>
    [XmlEnum("10007519")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BPCE_Life,

    /// <summary>
    /// NS Insurance N.V.
    /// </summary>
    [XmlEnum("10007522")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NS_Insurance_N_V,

    /// <summary>
    /// Industriforsikring AS
    /// </summary>
    [XmlEnum("10007526")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Industriforsikring_AS,

    /// <summary>
    /// UNIQA Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007531")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// austrion Life Insurance AG
    /// </summary>
    [XmlEnum("10007544")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    austrion_Life_Insurance_AG,

    /// <summary>
    /// Vabis Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("10007563")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vabis_F_rs_kringsaktiebolag,

    /// <summary>
    /// Pohjola Insurance Ltd
    /// </summary>
    [XmlEnum("10007564")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pohjola_Insurance_Ltd,

    /// <summary>
    /// Essity Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("10007568")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Essity_F_rs_kringsaktiebolag,

    /// <summary>
    /// Lifeguard Insurance (Dublin) dac
    /// </summary>
    [XmlEnum("10007574")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lifeguard_Insurance_Dublin_dac,

    /// <summary>
    /// Tryg Forsikring A/S
    /// </summary>
    [XmlEnum("10007590")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tryg_Forsikring_A_S,

    /// <summary>
    /// AXA FRANCE IARD
    /// </summary>
    [XmlEnum("10007595")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_FRANCE_IARD,

    /// <summary>
    /// Helvetia Assurances S.A.
    /// </summary>
    [XmlEnum("10007603")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Assurances_S_A,

    /// <summary>
    /// NEIL Overseas dac
    /// </summary>
    [XmlEnum("10007605")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NEIL_Overseas_dac,

    /// <summary>
    /// Försäkringsaktiebolaget Vattenfall Insurance
    /// </summary>
    [XmlEnum("10007607")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    F_rs_kringsaktiebolaget_Vattenfall_Insurance,

    /// <summary>
    /// Assurances du Crédit Mutuel IARD S.A.
    /// </summary>
    [XmlEnum("10007608")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assurances_du_Cr_dit_Mutuel_IARD_S_A,

    /// <summary>
    /// Assurances du Crédit Mutuel Vie S.A.
    /// </summary>
    [XmlEnum("10007610")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assurances_du_Cr_dit_Mutuel_Vie_S_A,

    /// <summary>
    /// DB VITA SA
    /// </summary>
    [XmlEnum("10007614")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DB_VITA_SA,

    /// <summary>
    /// Baloise Vie Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007617")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Vie_Luxembourg_S_A,

    /// <summary>
    /// International Credit Mutuel Life S.A.
    /// </summary>
    [XmlEnum("10007621")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    International_Credit_Mutuel_Life_S_A,

    /// <summary>
    /// Solid Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("10007622")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Solid_F_rs_kringsaktiebolag,

    /// <summary>
    /// ERGO Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007637")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Euro Insurances dac
    /// </summary>
    [XmlEnum("10007641")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Euro_Insurances_dac,

    /// <summary>
    /// Vienna-Life Lebensversicherung AG Vienna Insurance Group
    /// </summary>
    [XmlEnum("10007643")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vienna_Life_Lebensversicherung_AG_Vienna_Insurance_Group,

    /// <summary>
    /// If Skadeförsäkring AB (publ.)
    /// </summary>
    [XmlEnum("10007645")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    If_Skadef_rs_kring_AB_publ,

    /// <summary>
    /// Noble Insurance Company dac
    /// </summary>
    [XmlEnum("10007655")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Noble_Insurance_Company_dac,

    /// <summary>
    /// ALLIANZ COMPANIA DE SEGUROS Y REASEGUROS S.A.
    /// </summary>
    [XmlEnum("10007657")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ALLIANZ_COMPANIA_DE_SEGUROS_Y_REASEGUROS_S_A,

    /// <summary>
    /// Zurich Life Assurance Public Limited Company
    /// </summary>
    [XmlEnum("10007659")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zurich_Life_Assurance_Public_Limited_Company,

    /// <summary>
    /// Cali Europe
    /// </summary>
    [XmlEnum("10007660")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cali_Europe,

    /// <summary>
    /// Accept Försäkringsaktiebolag (publ)
    /// </summary>
    [XmlEnum("10007662")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Accept_F_rs_kringsaktiebolag_publ,

    /// <summary>
    /// CNP Unicredit Vita S.p.A.
    /// </summary>
    [XmlEnum("10007669")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_Unicredit_Vita_S_p_A,

    /// <summary>
    /// Monument Assurance Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007671")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Monument_Assurance_Luxembourg_S_A,

    /// <summary>
    /// Europäische Reiseversicherung AG
    /// </summary>
    [XmlEnum("10007674")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Europ_ische_Reiseversicherung_AG,

    /// <summary>
    /// Vorarlberger Landes-Versicherung V.a.G.
    /// </summary>
    [XmlEnum("10007677")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vorarlberger_Landes_Versicherung_V_a_G,

    /// <summary>
    /// YOUPLUS Assurance AG
    /// </summary>
    [XmlEnum("10007689")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    YOUPLUS_Assurance_AG,

    /// <summary>
    /// CIGNA Europe Insurance Company S.A.
    /// </summary>
    [XmlEnum("10007693")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CIGNA_Europe_Insurance_Company_S_A,

    /// <summary>
    /// Zürich Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007695")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Z_rich_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// Electrolux Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("10007704")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Electrolux_F_rs_kringsaktiebolag,

    /// <summary>
    /// BBPM Life dac
    /// </summary>
    [XmlEnum("10007717")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BBPM_Life_dac,

    /// <summary>
    /// InChiaro Life Designated Activity Company
    /// </summary>
    [XmlEnum("10007721")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    InChiaro_Life_Designated_Activity_Company,

    /// <summary>
    /// Carraig Insurance dac
    /// </summary>
    [XmlEnum("10007722")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Carraig_Insurance_dac,

    /// <summary>
    /// PrismaLife AG
    /// </summary>
    [XmlEnum("10007723")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PrismaLife_AG,

    /// <summary>
    /// Aterförsäkringsaktiebolaget SKF
    /// </summary>
    [XmlEnum("10007732")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Aterf_rs_kringsaktiebolaget_SKF,

    /// <summary>
    /// Mediolanum International Life dac
    /// </summary>
    [XmlEnum("10007736")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mediolanum_International_Life_dac,

    /// <summary>
    /// Sasol International Insurance dac
    /// </summary>
    [XmlEnum("10007739")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sasol_International_Insurance_dac,

    /// <summary>
    /// AXIS Specialty Europe SE
    /// </summary>
    [XmlEnum("10007740")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXIS_Specialty_Europe_SE,

    /// <summary>
    /// Utmost PanEurope dac
    /// </summary>
    [XmlEnum("10007744")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Utmost_PanEurope_dac,

    /// <summary>
    /// swisspartners Versicherung AG
    /// </summary>
    [XmlEnum("10007745")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    swisspartners_Versicherung_AG,

    /// <summary>
    /// Allied World Assurance Company (Europe) DAC
    /// </summary>
    [XmlEnum("10007749")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allied_World_Assurance_Company_Europe_DAC,

    /// <summary>
    /// UPS International Insurance dac
    /// </summary>
    [XmlEnum("10007754")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UPS_International_Insurance_dac,

    /// <summary>
    /// SBB Insurance AG
    /// </summary>
    [XmlEnum("10007755")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SBB_Insurance_AG,

    /// <summary>
    /// White Horse Insurance Ireland dac
    /// </summary>
    [XmlEnum("10007764")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    White_Horse_Insurance_Ireland_dac,

    /// <summary>
    /// RAIFFEISEN VIE S.A.
    /// </summary>
    [XmlEnum("10007767")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RAIFFEISEN_VIE_S_A,

    /// <summary>
    /// Assuranceforeningen Skuld Gjensidig
    /// </summary>
    [XmlEnum("10007772")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assuranceforeningen_Skuld_Gjensidig,

    /// <summary>
    /// Octium Life dac
    /// </summary>
    [XmlEnum("10007773")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Octium_Life_dac,

    /// <summary>
    /// AXA France Vie S.A.
    /// </summary>
    [XmlEnum("10007775")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_France_Vie_S_A,

    /// <summary>
    /// Canada Life Assurance Europe plc
    /// </summary>
    [XmlEnum("10007786")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Canada_Life_Assurance_Europe_plc,

    /// <summary>
    /// PFA Pension forsikringsaktieselskab
    /// </summary>
    [XmlEnum("10007787")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PFA_Pension_forsikringsaktieselskab,

    /// <summary>
    /// RSIF International dac
    /// </summary>
    [XmlEnum("10007794")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RSIF_International_dac,

    /// <summary>
    /// Pharma International Insurance dac
    /// </summary>
    [XmlEnum("10007801")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pharma_International_Insurance_dac,

    /// <summary>
    /// CACI Non-Life Designated Activity Company
    /// </summary>
    [XmlEnum("10007807")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CACI_Non_Life_Designated_Activity_Company,

    /// <summary>
    /// Merkur Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("10007810")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Merkur_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// CACI Life Designated Activity Company
    /// </summary>
    [XmlEnum("10007811")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CACI_Life_Designated_Activity_Company,

    /// <summary>
    /// Great American International Insurance (EU) DAC
    /// </summary>
    [XmlEnum("10007815")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Great_American_International_Insurance_EU_DAC,

    /// <summary>
    /// Société D&apos;Assurances Générales Appliquées (SAGA) Designated Activity Company
    /// </summary>
    [XmlEnum("10007821")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Soci_t_D_Assurances_G_n_rales_Appliqu_es_SAGA_Designated_Activity_Company,

    /// <summary>
    /// Fidelidade-Companhia de Seguros S.A.
    /// </summary>
    [XmlEnum("10007826")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fidelidade_Companhia_de_Seguros_S_A,

    /// <summary>
    /// La Mondiale Europartner S.A.
    /// </summary>
    [XmlEnum("10007828")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    La_Mondiale_Europartner_S_A,

    /// <summary>
    /// UVM Verzekeringsmaatschappij N.V.
    /// </summary>
    [XmlEnum("10007829")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UVM_Verzekeringsmaatschappij_N_V,

    /// <summary>
    /// Visenta Försäkringsaktiebolag Managing Director Ragnar Andersson
    /// </summary>
    [XmlEnum("10007830")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Visenta_F_rs_kringsaktiebolag_Managing_Director_Ragnar_Andersson,

    /// <summary>
    /// March Vida Sociedad Anonima_de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("10007833")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    March_Vida_Sociedad_Anonima_de_Seguros_y_Reaseguros,

    /// <summary>
    /// ETHIAS S.A.
    /// </summary>
    [XmlEnum("10007836")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ETHIAS_S_A,

    /// <summary>
    /// ELINI A.M.
    /// </summary>
    [XmlEnum("10007840")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ELINI_A_M,

    /// <summary>
    /// Balcia Insurance SE
    /// </summary>
    [XmlEnum("10007842")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Balcia_Insurance_SE,

    /// <summary>
    /// Kooperativa pojišťovna, a.s., Vienna Insurance Group
    /// </summary>
    [XmlEnum("10007845")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Kooperativa_poji_ovna_a_s_Vienna_Insurance_Group,

    /// <summary>
    /// Allianz pojišťovna, a.s.
    /// </summary>
    [XmlEnum("10007848")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_poji_ovna_a_s,

    /// <summary>
    /// Justitia NV
    /// </summary>
    [XmlEnum("10007852")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Justitia_NV,

    /// <summary>
    /// ONVZ Ziegtekostenverzekeraar N.V.
    /// </summary>
    [XmlEnum("10007860")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ONVZ_Ziegtekostenverzekeraar_N_V,

    /// <summary>
    /// Allianz IARD
    /// </summary>
    [XmlEnum("10007863")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_IARD,

    /// <summary>
    /// Compagnia Italiana Di Previdenza Assicurazioni e Riassicurazioni
    /// </summary>
    [XmlEnum("10007867")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Compagnia_Italiana_Di_Previdenza_Assicurazioni_e_Riassicurazioni,

    /// <summary>
    /// Wälder Versicherung Versicherungsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("10007870")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_lder_Versicherung_Versicherungsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Credendo – Trade Credit Insurance
    /// </summary>
    [XmlEnum("10007873")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Credendo_Trade_Credit_Insurance,

    /// <summary>
    /// Fennia Mutual Insurance Company
    /// </summary>
    [XmlEnum("10007874")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fennia_Mutual_Insurance_Company,

    /// <summary>
    /// Swiss Life Liechtenstein AG
    /// </summary>
    [XmlEnum("10007878")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Liechtenstein_AG,

    /// <summary>
    /// SACE BT S.P.A.
    /// </summary>
    [XmlEnum("10007880")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SACE_BT_S_P_A,

    /// <summary>
    /// Yara Insurance dac
    /// </summary>
    [XmlEnum("10007881")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Yara_Insurance_dac,

    /// <summary>
    /// Credendo - Guarantees and Specialty Risks NV
    /// </summary>
    [XmlEnum("10007888")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Credendo_Guarantees_and_Specialty_Risks_NV,

    /// <summary>
    /// MELES Insurance A/S
    /// </summary>
    [XmlEnum("10007889")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MELES_Insurance_A_S,

    /// <summary>
    /// If P&amp;C Insurance AS
    /// </summary>
    [XmlEnum("10007891")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    If_P_C_Insurance_AS,

    /// <summary>
    /// Intesa Sanpaolo Vita S.p.A.
    /// </summary>
    [XmlEnum("10007893")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Intesa_Sanpaolo_Vita_S_p_A,

    /// <summary>
    /// Quantum Leben AG
    /// </summary>
    [XmlEnum("10007894")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Quantum_Leben_AG,

    /// <summary>
    /// Hawthorn Life dac
    /// </summary>
    [XmlEnum("10007896")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hawthorn_Life_dac,

    /// <summary>
    /// Nucleus Life AG
    /// </summary>
    [XmlEnum("10007897")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nucleus_Life_AG,

    /// <summary>
    /// SCILDON N.V.
    /// </summary>
    [XmlEnum("10007903")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SCILDON_N_V,

    /// <summary>
    /// ČSOB Pojišťovna, a. s., člen holdingu ČSOB
    /// </summary>
    [XmlEnum("10007905")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SOB_Poji_ovna_a_s_len_holdingu_SOB,

    /// <summary>
    /// Allianz Hungária Biztosíto Zrt.
    /// </summary>
    [XmlEnum("10007907")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Hung_ria_Biztos_to_Zrt,

    /// <summary>
    /// PartnerRe Ireland Insurance dac
    /// </summary>
    [XmlEnum("10007910")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PartnerRe_Ireland_Insurance_dac,

    /// <summary>
    /// Neuflize Vie
    /// </summary>
    [XmlEnum("10007911")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Neuflize_Vie,

    /// <summary>
    /// ZAVAROVALNICA TRIGLAV, d.d.
    /// </summary>
    [XmlEnum("10007912")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ZAVAROVALNICA_TRIGLAV_d_d,

    /// <summary>
    /// SwissLife Assurance et Patrimoine
    /// </summary>
    [XmlEnum("10007913")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SwissLife_Assurance_et_Patrimoine,

    /// <summary>
    /// Le Sphinx Assurances Luxembourg S.A.
    /// </summary>
    [XmlEnum("10007915")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Le_Sphinx_Assurances_Luxembourg_S_A,

    /// <summary>
    /// Európai Utazási Biztositó Rt.
    /// </summary>
    [XmlEnum("10007922")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Eur_pai_Utaz_si_Biztosit_Rt,

    /// <summary>
    /// Unicorp Vida Compania de Seguros y Reaseguros S.A.
    /// </summary>
    [XmlEnum("10007924")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Unicorp_Vida_Compania_de_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// White Rock Insurance (Europe) PCC Limited
    /// </summary>
    [XmlEnum("10007926")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    White_Rock_Insurance_Europe_PCC_Limited,

    /// <summary>
    /// Powszechny Zakład Ubezpieczeń Spółka Akcyjna
    /// </summary>
    [XmlEnum("10007928")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Powszechny_Zak_ad_Ubezpiecze_Sp_ka_Akcyjna,

    /// <summary>
    /// Ergon Insurance Limited
    /// </summary>
    [XmlEnum("10007930")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ergon_Insurance_Limited,

    /// <summary>
    /// Wagram Insurance Company dac
    /// </summary>
    [XmlEnum("10007932")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wagram_Insurance_Company_dac,

    /// <summary>
    /// Sara Assicurazioni s.p.a.
    /// </summary>
    [XmlEnum("10007934")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sara_Assicurazioni_s_p_a,

    /// <summary>
    /// ASR Schadeverzekering N.V.
    /// </summary>
    [XmlEnum("10007935")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ASR_Schadeverzekering_N_V,

    /// <summary>
    /// Towarzystwo Ubezpieczeń i Reasekuracji WARTA S.A.
    /// </summary>
    [XmlEnum("10007940")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_i_Reasekuracji_WARTA_S_A,

    /// <summary>
    /// BPI Vida e Pensões - Companhia de Seguros, S.A.
    /// </summary>
    [XmlEnum("10007943")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BPI_Vida_e_Pens_es_Companhia_de_Seguros_S_A,

    /// <summary>
    /// Generali Česká Pojišt&apos;ovna a.s.
    /// </summary>
    [XmlEnum("10007946")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_esk_Poji_t_ovna_a_s,

    /// <summary>
    /// Onderlinge Verzekering Maatschappij Noord Nederlandsche P&amp;I Club U.A.
    /// </summary>
    [XmlEnum("10007947")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Onderlinge_Verzekering_Maatschappij_Noord_Nederlandsche_P_I_Club_U_A,

    /// <summary>
    /// Inter Partner Assistance SA
    /// </summary>
    [XmlEnum("10007956")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Inter_Partner_Assistance_SA,

    /// <summary>
    /// Vodafone Insurance Ltd.
    /// </summary>
    [XmlEnum("10007958")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vodafone_Insurance_Ltd,

    /// <summary>
    /// BCC Assicurazioni S.P.A.
    /// </summary>
    [XmlEnum("10007968")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BCC_Assicurazioni_S_P_A,

    /// <summary>
    /// Ornua Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("10007969")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ornua_Insurance_Designated_Activity_Company,

    /// <summary>
    /// Achmea Schadeverzekeringen N.V.
    /// </summary>
    [XmlEnum("10007970")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Achmea_Schadeverzekeringen_N_V,

    /// <summary>
    /// Towarzystwo Ubezpieczeń i Reasekuracji Allianz Polska S.A.
    /// </summary>
    [XmlEnum("10007971")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_i_Reasekuracji_Allianz_Polska_S_A,

    /// <summary>
    /// HSBC ASSURANCES VIE (FRANCE)
    /// </summary>
    [XmlEnum("10007975")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HSBC_ASSURANCES_VIE_FRANCE,

    /// <summary>
    /// Groupama Assurance-Credit et Caution
    /// </summary>
    [XmlEnum("10007982")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Assurance_Credit_et_Caution,

    /// <summary>
    /// ADVIGON VERSICHERUNG AG
    /// </summary>
    [XmlEnum("10007985")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADVIGON_VERSICHERUNG_AG,

    /// <summary>
    /// Sopockie Towarzystwo Ubezpieczen Ergo Hestia S.A.
    /// </summary>
    [XmlEnum("10007988")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sopockie_Towarzystwo_Ubezpieczen_Ergo_Hestia_S_A,

    /// <summary>
    /// Towarzystwo Ubezpieczeń Euler Hermes S.A.
    /// </summary>
    [XmlEnum("10007989")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_Euler_Hermes_S_A,

    /// <summary>
    /// Helvetia Global Solutions AG
    /// </summary>
    [XmlEnum("10007997")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Global_Solutions_AG,

    /// <summary>
    /// Cardif Assurance Vie S.A.
    /// </summary>
    [XmlEnum("10009001")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cardif_Assurance_Vie_S_A,

    /// <summary>
    /// Allianz Lietuva gyvybės draudimas UAB
    /// </summary>
    [XmlEnum("10009003")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Lietuva_gyvyb_s_draudimas_UAB,

    /// <summary>
    /// Generali Italia S.p.A.
    /// </summary>
    [XmlEnum("10009006")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Italia_S_p_A,

    /// <summary>
    /// AXERIA IARD
    /// </summary>
    [XmlEnum("10009010")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXERIA_IARD,

    /// <summary>
    /// Squarelife Insurance AG
    /// </summary>
    [XmlEnum("10009012")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Squarelife_Insurance_AG,

    /// <summary>
    /// KBC Verzekeringen S.A.
    /// </summary>
    [XmlEnum("10009014")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KBC_Verzekeringen_S_A,

    /// <summary>
    /// ASR Levensverzekering N.V.
    /// </summary>
    [XmlEnum("10009015")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ASR_Levensverzekering_N_V,

    /// <summary>
    /// Gable Insurance AG (in Liquidation)
    /// </summary>
    [XmlEnum("10009016")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gable_Insurance_AG_in_Liquidation,

    /// <summary>
    /// CHUBB European Group SE
    /// </summary>
    [XmlEnum("10009019")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CHUBB_European_Group_SE,

    /// <summary>
    /// Generali Biztosító Zrt.
    /// </summary>
    [XmlEnum("10009026")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Biztos_t_Zrt,

    /// <summary>
    /// Maiden Life Försäkrings AB
    /// </summary>
    [XmlEnum("10009035")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Maiden_Life_F_rs_krings_AB,

    /// <summary>
    /// ETU Forsikring A/S
    /// </summary>
    [XmlEnum("10009039")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ETU_Forsikring_A_S,

    /// <summary>
    /// Länsförsäkringar AB (publ)
    /// </summary>
    [XmlEnum("10009042")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    L_nsf_rs_kringar_AB_publ,

    /// <summary>
    /// UNION Vienna Insurance Group Biztosító Zrt.
    /// </summary>
    [XmlEnum("10009045")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNION_Vienna_Insurance_Group_Biztos_t_Zrt,

    /// <summary>
    /// Euroins Insurance JSC
    /// </summary>
    [XmlEnum("10009047")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Euroins_Insurance_JSC,

    /// <summary>
    /// Cardif Assurances Risques Divers
    /// </summary>
    [XmlEnum("10009050")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cardif_Assurances_Risques_Divers,

    /// <summary>
    /// Prudential International Assurance Plc
    /// </summary>
    [XmlEnum("10009052")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Prudential_International_Assurance_Plc,

    /// <summary>
    /// UNIQA pojišťovna, a.s.
    /// </summary>
    [XmlEnum("10009057")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_poji_ovna_a_s,

    /// <summary>
    /// Quatrem
    /// </summary>
    [XmlEnum("10009058")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Quatrem,

    /// <summary>
    /// Waard Leven N.V.
    /// </summary>
    [XmlEnum("10009065")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Waard_Leven_N_V,

    /// <summary>
    /// Den Norske Krigsforsikring for Skib Gjensidig Forening
    /// </summary>
    [XmlEnum("10009067")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Den_Norske_Krigsforsikring_for_Skib_Gjensidig_Forening,

    /// <summary>
    /// Atlas Insurance PCC Limited
    /// </summary>
    [XmlEnum("10009068")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Atlas_Insurance_PCC_Limited,

    /// <summary>
    /// SwissLife Prevoyance et Sante
    /// </summary>
    [XmlEnum("10009069")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SwissLife_Prevoyance_et_Sante,

    /// <summary>
    /// Groupama Grand Est (Caisse Régionale de Réassurances Mutuelles Agricoles du Grant Est)
    /// </summary>
    [XmlEnum("10009070")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Grand_Est_Caisse_R_gionale_de_R_assurances_Mutuelles_Agricoles_du_Grant_Est,

    /// <summary>
    /// ORKLA Insurance Company dac
    /// </summary>
    [XmlEnum("10009071")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ORKLA_Insurance_Company_dac,

    /// <summary>
    /// Lietuvos Draudimas, AB
    /// </summary>
    [XmlEnum("10009074")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lietuvos_Draudimas_AB,

    /// <summary>
    /// CAJAMAR VIDA SOCIEDAD ANONIMA DE SEGUROS Y REASEGUROS
    /// </summary>
    [XmlEnum("10009076")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CAJAMAR_VIDA_SOCIEDAD_ANONIMA_DE_SEGUROS_Y_REASEGUROS,

    /// <summary>
    /// Ericsson Insurance (Försäkring) AB
    /// </summary>
    [XmlEnum("10009077")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ericsson_Insurance_F_rs_kring_AB,

    /// <summary>
    /// IDA Insurance Limited
    /// </summary>
    [XmlEnum("10009079")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IDA_Insurance_Limited,

    /// <summary>
    /// Vishay Insurance Limited
    /// </summary>
    [XmlEnum("10009083")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vishay_Insurance_Limited,

    /// <summary>
    /// Twincap Försäkrings AB
    /// </summary>
    [XmlEnum("10009089")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Twincap_F_rs_krings_AB,

    /// <summary>
    /// Groupama Phoenix Hellenic Insurance Company S.A.
    /// </summary>
    [XmlEnum("10009090")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Phoenix_Hellenic_Insurance_Company_S_A,

    /// <summary>
    /// Standard Life International Designated Activity Company
    /// </summary>
    [XmlEnum("10009093")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Standard_Life_International_Designated_Activity_Company,

    /// <summary>
    /// Baloise Life (Liechtenstein) AG
    /// </summary>
    [XmlEnum("10009094")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Life_Liechtenstein_AG,

    /// <summary>
    /// Anker Insurance Company N.V.
    /// </summary>
    [XmlEnum("10009097")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Anker_Insurance_Company_N_V,

    /// <summary>
    /// Salling Group Captiveforsikringsselskab A/S
    /// </summary>
    [XmlEnum("10009098")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Salling_Group_Captiveforsikringsselskab_A_S,

    /// <summary>
    /// Caisse de Réassurance Mutuelle Agricole du Centre Manche
    /// </summary>
    [XmlEnum("10009102")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_de_R_assurance_Mutuelle_Agricole_du_Centre_Manche,

    /// <summary>
    /// Foyer Global Health S.A.
    /// </summary>
    [XmlEnum("10009104")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Foyer_Global_Health_S_A,

    /// <summary>
    /// Zurich Vida Compania de seguros y reaseguros S.A.
    /// </summary>
    [XmlEnum("10009107")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zurich_Vida_Compania_de_seguros_y_reaseguros_S_A,

    /// <summary>
    /// Lifetri Verzekeringen N.V.
    /// </summary>
    [XmlEnum("10009108")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lifetri_Verzekeringen_N_V,

    /// <summary>
    /// Klaverblad Schadeverzekeringsmaatschappij N.V.
    /// </summary>
    [XmlEnum("10009111")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Klaverblad_Schadeverzekeringsmaatschappij_N_V,

    /// <summary>
    /// Danica Pension, Livsforsikringsselskab
    /// </summary>
    [XmlEnum("10009114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Danica_Pension_Livsforsikringsselskab,

    /// <summary>
    /// Komerční pojišťovna, a.s.
    /// </summary>
    [XmlEnum("10009118")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Komer_n_poji_ovna_a_s,

    /// <summary>
    /// Sappisure Försäkrings AB
    /// </summary>
    [XmlEnum("10009121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sappisure_F_rs_krings_AB,

    /// <summary>
    /// Axa Assurances Luxembourg
    /// </summary>
    [XmlEnum("10009136")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Axa_Assurances_Luxembourg,

    /// <summary>
    /// Allianz Benelux SA/NV
    /// </summary>
    [XmlEnum("10009137")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Benelux_SA_NV,

    /// <summary>
    /// Liechtenstein Life Assurance AG
    /// </summary>
    [XmlEnum("10009139")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Liechtenstein_Life_Assurance_AG,

    /// <summary>
    /// Stellantis Insurance Limited
    /// </summary>
    [XmlEnum("10009142")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Stellantis_Insurance_Limited,

    /// <summary>
    /// Česká podnikatelská pojišťovna, a.s., Vienna Insurance Group
    /// </summary>
    [XmlEnum("10009143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    esk_podnikatelsk_poji_ovna_a_s_Vienna_Insurance_Group,

    /// <summary>
    /// STELLANTIS LIFE INSURANCE LIMITED
    /// </summary>
    [XmlEnum("10009147")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    STELLANTIS_LIFE_INSURANCE_LIMITED,

    /// <summary>
    /// LV 1871 Private Assurance AG
    /// </summary>
    [XmlEnum("10009153")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LV_1871_Private_Assurance_AG,

    /// <summary>
    /// Elips Life AG
    /// </summary>
    [XmlEnum("10009155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Elips_Life_AG,

    /// <summary>
    /// Mapfre Middlesea plc
    /// </summary>
    [XmlEnum("10009156")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mapfre_Middlesea_plc,

    /// <summary>
    /// Caisse Regionale d Assurances Mutuelles Agricoles de Rhone-Alpes Auvergne
    /// </summary>
    [XmlEnum("10009157")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_de_Rhone_Alpes_Auvergne,

    /// <summary>
    /// RCI Insurance Limited
    /// </summary>
    [XmlEnum("10009158")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RCI_Insurance_Limited,

    /// <summary>
    /// RCI Life Limited
    /// </summary>
    [XmlEnum("10009159")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RCI_Life_Limited,

    /// <summary>
    /// RSA Insurance Ireland Designated Activity Company
    /// </summary>
    [XmlEnum("10009161")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RSA_Insurance_Ireland_Designated_Activity_Company,

    /// <summary>
    /// DSV Insurance A/S
    /// </summary>
    [XmlEnum("10009163")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DSV_Insurance_A_S,

    /// <summary>
    /// CRH GROUP INSURANCE SERVICES EUROPE LTD
    /// </summary>
    [XmlEnum("10009167")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CRH_GROUP_INSURANCE_SERVICES_EUROPE_LTD,

    /// <summary>
    /// Generali Towarzystwo Ubezpieczen Spólka Akcyjna
    /// </summary>
    [XmlEnum("10009171")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Towarzystwo_Ubezpieczen_Sp_lka_Akcyjna,

    /// <summary>
    /// Powszechny Zakład Ubezpieczeń na Życie Spółka Akcyjna
    /// </summary>
    [XmlEnum("10009174")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Powszechny_Zak_ad_Ubezpiecze_na_ycie_Sp_ka_Akcyjna,

    /// <summary>
    /// Argoglobal Assicurazioni S.P.A.
    /// </summary>
    [XmlEnum("10009176")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Argoglobal_Assicurazioni_S_P_A,

    /// <summary>
    /// Nissan International Insurance Limited
    /// </summary>
    [XmlEnum("10009177")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nissan_International_Insurance_Limited,

    /// <summary>
    /// SIGNAL IDUNA ASIGURARI S.A.
    /// </summary>
    [XmlEnum("10009188")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_ASIGURARI_S_A,

    /// <summary>
    /// Caisse Regionale d&apos;Assurances Mutuelles Agricoles Paris Val de Loire
    /// </summary>
    [XmlEnum("10009191")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Paris_Val_de_Loire,

    /// <summary>
    /// AGPM Vie
    /// </summary>
    [XmlEnum("10009193")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AGPM_Vie,

    /// <summary>
    /// Génération Vie
    /// </summary>
    [XmlEnum("10009196")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    G_n_ration_Vie,

    /// <summary>
    /// Swiss Life Products (Luxembourg) S.A.
    /// </summary>
    [XmlEnum("10009203")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Products_Luxembourg_S_A,

    /// <summary>
    /// BPCE Vie
    /// </summary>
    [XmlEnum("10009206")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BPCE_Vie,

    /// <summary>
    /// Greenstars BNP Paribas S.A.
    /// </summary>
    [XmlEnum("10009210")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Greenstars_BNP_Paribas_S_A,

    /// <summary>
    /// Associations Mutuelles Le Conservateur
    /// </summary>
    [XmlEnum("10009211")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Associations_Mutuelles_Le_Conservateur,

    /// <summary>
    /// Forsikringsselskabet Privatsikring A/S
    /// </summary>
    [XmlEnum("10009217")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Forsikringsselskabet_Privatsikring_A_S,

    /// <summary>
    /// Lusitania - Companhia de Seguros S.A.
    /// </summary>
    [XmlEnum("10009219")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lusitania_Companhia_de_Seguros_S_A,

    /// <summary>
    /// The West of England Ship Owners Mutual Insurance Association
    /// </summary>
    [XmlEnum("10009220")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    The_West_of_England_Ship_Owners_Mutual_Insurance_Association,

    /// <summary>
    /// Societe Mutuelle d&apos;Assurance du Batiment et des Travaux Publics
    /// </summary>
    [XmlEnum("10009231")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Societe_Mutuelle_d_Assurance_du_Batiment_et_des_Travaux_Publics,

    /// <summary>
    /// Caisse Regionale d&apos;Assurances Mutuelles Agricoles Bretagne Pays de la Loire
    /// </summary>
    [XmlEnum("10009232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Bretagne_Pays_de_la_Loire,

    /// <summary>
    /// Vienna Insurance Group AG Wiener Versicherung Gruppe
    /// </summary>
    [XmlEnum("10009234")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vienna_Insurance_Group_AG_Wiener_Versicherung_Gruppe,

    /// <summary>
    /// AWP P&amp;C S.A.
    /// </summary>
    [XmlEnum("10009239")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AWP_P_C_S_A,

    /// <summary>
    /// Hamilton Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("10009243")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hamilton_Insurance_Designated_Activity_Company,

    /// <summary>
    /// Goudse Schadeverzekeringen N.V.
    /// </summary>
    [XmlEnum("10009253")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Goudse_Schadeverzekeringen_N_V,

    /// <summary>
    /// IMA Assurances
    /// </summary>
    [XmlEnum("10009255")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IMA_Assurances,

    /// <summary>
    /// SN SecureCorp Insurance Malta Ltd.
    /// </summary>
    [XmlEnum("10009257")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SN_SecureCorp_Insurance_Malta_Ltd,

    /// <summary>
    /// Baloise Belgium NV/SA
    /// </summary>
    [XmlEnum("10009259")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Belgium_NV_SA,

    /// <summary>
    /// ZK &quot;LEV INS&quot; AD
    /// </summary>
    [XmlEnum("10009261")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ZK_LEV_INS_AD,

    /// <summary>
    /// Advent Insurance PCC Ltd  - UIB Cell
    /// </summary>
    [XmlEnum("10009272")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Advent_Insurance_PCC_Ltd_UIB_Cell,

    /// <summary>
    /// S.C. ALLIANZ -TIRIAC ASIGURARI S.A.
    /// </summary>
    [XmlEnum("10009273")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    S_C_ALLIANZ_TIRIAC_ASIGURARI_S_A,

    /// <summary>
    /// ABC Insurance S.A.
    /// </summary>
    [XmlEnum("10009274")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ABC_Insurance_S_A,

    /// <summary>
    /// Caisse Régionale d`Assurances Mutuelles Agricoles d`Oc
    /// </summary>
    [XmlEnum("10009275")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_R_gionale_d_Assurances_Mutuelles_Agricoles_d_Oc,

    /// <summary>
    /// Compensa Towarzystwo Ubezpieczen S.A. Vienna Insurance Group
    /// </summary>
    [XmlEnum("10009277")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Compensa_Towarzystwo_Ubezpieczen_S_A_Vienna_Insurance_Group,

    /// <summary>
    /// LV 1871 Pensionsfonds AG
    /// </summary>
    [XmlEnum("10009905")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    LV_1871_Pensionsfonds_AG,

    /// <summary>
    /// APK Pensionskasse AG
    /// </summary>
    [XmlEnum("10009907")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    APK_Pensionskasse_AG,

    /// <summary>
    /// Swiss Life International Pension Fund a.s.b.l.
    /// </summary>
    [XmlEnum("10009917")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_International_Pension_Fund_a_s_b_l,

    /// <summary>
    /// Württembergische Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001359")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_rttembergische_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Württembergische Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001432")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_rttembergische_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Deutsche Ärzteversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001444")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Deutsche_rzteversicherung_Aktiengesellschaft,

    /// <summary>
    /// Generali Deutschland AG
    /// </summary>
    [XmlEnum("40001447")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Deutschland_AG,

    /// <summary>
    /// Hannover Rück SE
    /// </summary>
    [XmlEnum("40001452")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hannover_R_ck_SE,

    /// <summary>
    /// Generali Deutschland Versicherung AG
    /// </summary>
    [XmlEnum("40001454")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Deutschland_Versicherung_AG,

    /// <summary>
    /// Athora Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001460")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Athora_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Münchener Rückversicherungs-Gesellschaft Aktiengesellschaft in München
    /// </summary>
    [XmlEnum("40001467")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_nchener_R_ckversicherungs_Gesellschaft_Aktiengesellschaft_in_M_nchen,

    /// <summary>
    /// ERGO Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001476")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Versicherung_Aktiengesellschaft_2,

    /// <summary>
    /// Allianz Lebensversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001482")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Lebensversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Real Garant Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("40001623")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Real_Garant_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Wüstenrot &amp; Württembergische AG
    /// </summary>
    [XmlEnum("40001864")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_stenrot_W_rttembergische_AG,

    /// <summary>
    /// Generali Deutschland Lebensversicherung AG
    /// </summary>
    [XmlEnum("40001884")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Deutschland_Lebensversicherung_AG,

    /// <summary>
    /// Proxalto Lebensversicherung Aktiengesellschaft c/o Viridium Group GmbH &amp; Co. KG
    /// </summary>
    [XmlEnum("50006559")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Proxalto_Lebensversicherung_Aktiengesellschaft_c_o_Viridium_Group_GmbH_Co_KG,

    /// <summary>
    /// Versicherungskammer Bayern Versicherungsanstalt des öffentlichen Rechts
    /// </summary>
    [XmlEnum("50008653")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Versicherungskammer_Bayern_Versicherungsanstalt_des_ffentlichen_Rechts,

    /// <summary>
    /// Bayerische Hausbesitzer-Versicherungs-Gesellschaft a.G.
    /// </summary>
    [XmlEnum("50010906")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bayerische_Hausbesitzer_Versicherungs_Gesellschaft_a_G,

    /// <summary>
    /// NÜRNBERGER Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016049")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_RNBERGER_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// SIGNAL IDUNA Lebensversicherung a. G.
    /// </summary>
    [XmlEnum("50016072")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Lebensversicherung_a_G,

    /// <summary>
    /// InterRisk Lebensversicherungs-AG Vienna Insurance Group.
    /// </summary>
    [XmlEnum("50016098")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    InterRisk_Lebensversicherungs_AG_Vienna_Insurance_Group,

    /// <summary>
    /// VöV Rückversicherung KöR
    /// </summary>
    [XmlEnum("50016133")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    V_V_R_ckversicherung_K_R,

    /// <summary>
    /// Pensionskasse der Mitarbeiter der Hoechst-Gruppe VVaG
    /// </summary>
    [XmlEnum("50016183")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_der_Mitarbeiter_der_Hoechst_Gruppe_VVaG,

    /// <summary>
    /// Pensionskasse Deutscher Eisenbahnen und Straßenbahnen VVaG
    /// </summary>
    [XmlEnum("50016248")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pensionskasse_Deutscher_Eisenbahnen_und_Stra_enbahnen_VVaG,

    /// <summary>
    /// Allianz Private Krankenversicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016274")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Private_Krankenversicherungs_Aktiengesellschaft,

    /// <summary>
    /// Generali Deutschland Krankenversicherung AG
    /// </summary>
    [XmlEnum("50016298")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Deutschland_Krankenversicherung_AG,

    /// <summary>
    /// DKV Deutsche Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016299")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DKV_Deutsche_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// Gothaer Krankenversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016303")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gothaer_Krankenversicherung_Aktiengesellschaft,

    /// <summary>
    /// Debeka Krankenversicherungsverein auf Gegenseitigkeit Sitz Koblenz am Rhein
    /// </summary>
    [XmlEnum("50016310")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Debeka_Krankenversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein,

    /// <summary>
    /// Allianz Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016337")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// HUK-COBURG Haftpflicht-Unterstützungs-Kasse kraftfahrender Beamter Deutschlands a.G. in Coburg
    /// </summary>
    [XmlEnum("50016348")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Haftpflicht_Unterst_tzungs_Kasse_kraftfahrender_Beamter_Deutschlands_a_G_in_Coburg,

    /// <summary>
    /// Hamburger Feuerkasse Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016375")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hamburger_Feuerkasse_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// ERGO Lebensversicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016397")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Lebensversicherung_Aktiengesellschaft,

    /// <summary>
    /// Mecklenburgische Versicherungs-Gesellschaft auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("50016447")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mecklenburgische_Versicherungs_Gesellschaft_auf_Gegenseitigkeit,

    /// <summary>
    /// RheinLand Versicherungs Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016460")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RheinLand_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// SIGNAL IDUNA Unfallversicherung a. G.
    /// </summary>
    [XmlEnum("50016469")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Unfallversicherung_a_G,

    /// <summary>
    /// Provinzial Holding Aktiengesellschaft
    /// </summary>
    [XmlEnum("50016471")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Provinzial_Holding_Aktiengesellschaft,

    /// <summary>
    /// S DirektVersicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50017211")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    S_DirektVersicherung_Aktiengesellschaft,

    /// <summary>
    /// HDI Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("50019583")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// Allianz Pensionskasse Aktiengesellschaft
    /// </summary>
    [XmlEnum("50020998")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Pensionskasse_Aktiengesellschaft,

    /// <summary>
    /// Frankfurter Pensionskasse AG
    /// </summary>
    [XmlEnum("50021001")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Frankfurter_Pensionskasse_AG,

    /// <summary>
    /// Sparkassen Pensionsfonds AG
    /// </summary>
    [XmlEnum("50021043")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sparkassen_Pensionsfonds_AG,

    /// <summary>
    /// Continentale Krankenversicherung a.G.
    /// </summary>
    [XmlEnum("50023240")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Continentale_Krankenversicherung_a_G,

    /// <summary>
    /// HUK-COBURG-Holding AG
    /// </summary>
    [XmlEnum("50025114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HUK_COBURG_Holding_AG,

    /// <summary>
    /// EXTREMUS Versicherungs-Aktiengesellschaft
    /// </summary>
    [XmlEnum("50026342")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EXTREMUS_Versicherungs_Aktiengesellschaft,

    /// <summary>
    /// DEVK Pensionsfonds Aktiengesellschaft
    /// </summary>
    [XmlEnum("50026368")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DEVK_Pensionsfonds_Aktiengesellschaft,

    /// <summary>
    /// ALTE OLDENBURGER Krankenversicherung AG
    /// </summary>
    [XmlEnum("50069877")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ALTE_OLDENBURGER_Krankenversicherung_AG,

    /// <summary>
    /// KUKE S.A.
    /// </summary>
    [XmlEnum("50077148")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KUKE_S_A,

    /// <summary>
    /// TVM verzekeringen N.V.
    /// </summary>
    [XmlEnum("50077153")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TVM_verzekeringen_N_V,

    /// <summary>
    /// ERGO Insurance NV
    /// </summary>
    [XmlEnum("50077155")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERGO_Insurance_NV,

    /// <summary>
    /// Lifestyle Protection Lebensversicherung AG
    /// </summary>
    [XmlEnum("50077201")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lifestyle_Protection_Lebensversicherung_AG,

    /// <summary>
    /// Lifestyle Protection AG
    /// </summary>
    [XmlEnum("50077208")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lifestyle_Protection_AG,

    /// <summary>
    /// N.V. EUROMEX
    /// </summary>
    [XmlEnum("50077243")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_V_EUROMEX,

    /// <summary>
    /// Alm. Brand Forsikring A/S
    /// </summary>
    [XmlEnum("50077263")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alm_Brand_Forsikring_A_S,

    /// <summary>
    /// Solunion Seguros de Credito Compania Internacional de Seguros y Reaseguros S.A.
    /// </summary>
    [XmlEnum("50077279")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Solunion_Seguros_de_Credito_Compania_Internacional_de_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// RIVERSTONE INSURANCE (MALTA) SE
    /// </summary>
    [XmlEnum("50077281")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RIVERSTONE_INSURANCE_MALTA_SE,

    /// <summary>
    /// Pan Insurance dac
    /// </summary>
    [XmlEnum("50077299")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Pan_Insurance_dac,

    /// <summary>
    /// Arch Insurance (EU) Designated Activity Company
    /// </summary>
    [XmlEnum("50077301")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Arch_Insurance_EU_Designated_Activity_Company,

    /// <summary>
    /// DAS Nederlandse Rechtsbijstand Verzekeringmaatschappij NV
    /// </summary>
    [XmlEnum("50077320")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DAS_Nederlandse_Rechtsbijstand_Verzekeringmaatschappij_NV,

    /// <summary>
    /// OOM Schadeverzekering N.V.
    /// </summary>
    [XmlEnum("50077321")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OOM_Schadeverzekering_N_V,

    /// <summary>
    /// Notarversicherungsverein a.G.
    /// </summary>
    [XmlEnum("50077378")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Notarversicherungsverein_a_G,

    /// <summary>
    /// Generali España de Seguros y Reaseguros, S.A.
    /// </summary>
    [XmlEnum("50077402")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Espa_a_de_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// Axa Seguros Generales S.A. de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("50077410")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Axa_Seguros_Generales_S_A_de_Seguros_y_Reaseguros,

    /// <summary>
    /// Steadfast Insurance Partners Limited
    /// </summary>
    [XmlEnum("50077447")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Steadfast_Insurance_Partners_Limited,

    /// <summary>
    /// CNP Santander Insurance Europe Designated Activity Company
    /// </summary>
    [XmlEnum("50077448")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_Santander_Insurance_Europe_Designated_Activity_Company,

    /// <summary>
    /// CNP Santander Insurance Life Designated Activity Company
    /// </summary>
    [XmlEnum("50077540")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_Santander_Insurance_Life_Designated_Activity_Company,

    /// <summary>
    /// Compagnie Francaise d Assurance pour le Commerce Extérieur S.A. (COFACE), Niederlassung in Deutschland
    /// </summary>
    [XmlEnum("50077572")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_S_A_COFACE_Niederlassung_in_Deutschland,

    /// <summary>
    /// WERTGARANTIE SE
    /// </summary>
    [XmlEnum("50077586")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WERTGARANTIE_SE,

    /// <summary>
    /// MetLife Europe dac
    /// </summary>
    [XmlEnum("50077605")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MetLife_Europe_dac,

    /// <summary>
    /// Generali Zycie Towarzystwo Ubezpieczen S.A.
    /// </summary>
    [XmlEnum("50077612")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Zycie_Towarzystwo_Ubezpieczen_S_A,

    /// <summary>
    /// ONIX Asigurari S.A.
    /// </summary>
    [XmlEnum("50077631")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ONIX_Asigurari_S_A,

    /// <summary>
    /// AEGIDIUS SE
    /// </summary>
    [XmlEnum("50077680")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AEGIDIUS_SE,

    /// <summary>
    /// Volkswagen Insurance Company dac
    /// </summary>
    [XmlEnum("50077851")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Volkswagen_Insurance_Company_dac,

    /// <summary>
    /// Lucura Versicherungs AG
    /// </summary>
    [XmlEnum("50077867")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lucura_Versicherungs_AG,

    /// <summary>
    /// Groupama Biztosító Zártkörüen Müködö Részvénytársaság
    /// </summary>
    [XmlEnum("50077877")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g,

    /// <summary>
    /// WTW Pensionsfonds AG
    /// </summary>
    [XmlEnum("50077922")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WTW_Pensionsfonds_AG,

    /// <summary>
    /// Allianz Global Life Designated Activity Company
    /// </summary>
    [XmlEnum("50077946")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Global_Life_Designated_Activity_Company,

    /// <summary>
    /// Sociedad de Seguros Mutuos Marítimos De Vigo, Mutualidad de Seguros Y Reaseguros A Prima Fija
    /// </summary>
    [XmlEnum("50077958")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sociedad_de_Seguros_Mutuos_Mar_timos_De_Vigo_Mutualidad_de_Seguros_Y_Reaseguros_A_Prima_Fija,

    /// <summary>
    /// UNIQA Österreich Versicherungen AG, Wien
    /// </summary>
    [XmlEnum("50077959")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_sterreich_Versicherungen_AG_Wien,

    /// <summary>
    /// Volkswagen Autoversicherung AG
    /// </summary>
    [XmlEnum("50077981")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Volkswagen_Autoversicherung_AG,

    /// <summary>
    /// Nordisk Marinförsäkring AB
    /// </summary>
    [XmlEnum("50078113")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nordisk_Marinf_rs_kring_AB,

    /// <summary>
    /// DELA Natura- en levensverzekeringen N.V.
    /// </summary>
    [XmlEnum("50078244")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DELA_Natura_en_levensverzekeringen_N_V,

    /// <summary>
    /// CROATIA osiguranje d.d.
    /// </summary>
    [XmlEnum("50078306")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CROATIA_osiguranje_d_d,

    /// <summary>
    /// Generali Osiguranje d.d.
    /// </summary>
    [XmlEnum("50078307")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Osiguranje_d_d,

    /// <summary>
    /// Allianz Vie S.A.
    /// </summary>
    [XmlEnum("50078314")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Vie_S_A,

    /// <summary>
    /// MetLife Europe Insurance dac
    /// </summary>
    [XmlEnum("50078360")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MetLife_Europe_Insurance_dac,

    /// <summary>
    /// Accredited Insurance (Europe) Limited
    /// </summary>
    [XmlEnum("50078368")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Accredited_Insurance_Europe_Limited,

    /// <summary>
    /// BD24 Berlin Direkt Versicherung AG
    /// </summary>
    [XmlEnum("50078370")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BD24_Berlin_Direkt_Versicherung_AG,

    /// <summary>
    /// Inser AG
    /// </summary>
    [XmlEnum("50078386")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Inser_AG,

    /// <summary>
    /// VERKA PK Kirchliche Pensionskasse AG
    /// </summary>
    [XmlEnum("50078428")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VERKA_PK_Kirchliche_Pensionskasse_AG,

    /// <summary>
    /// Stonefort Insurance S.A.
    /// </summary>
    [XmlEnum("50078456")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Stonefort_Insurance_S_A,

    /// <summary>
    /// iptiQ Life S.A., Niederlassung Deutschland
    /// </summary>
    [XmlEnum("50078648")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    iptiQ_Life_S_A_Niederlassung_Deutschland,

    /// <summary>
    /// Euler Hermes Deutschland Niederlassung der Euler Hermes SA
    /// </summary>
    [XmlEnum("50078667")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Euler_Hermes_Deutschland_Niederlassung_der_Euler_Hermes_SA,

    /// <summary>
    /// AFI ESCA Luxembourg S.A.
    /// </summary>
    [XmlEnum("50078684")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AFI_ESCA_Luxembourg_S_A,

    /// <summary>
    /// AWP Health &amp; Life SA
    /// </summary>
    [XmlEnum("50078729")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AWP_Health_Life_SA,

    /// <summary>
    /// Metzler Pensionsfonds AG
    /// </summary>
    [XmlEnum("50078778")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Metzler_Pensionsfonds_AG,

    /// <summary>
    /// Bulstrad Life Vienna Insurance Group JSC
    /// </summary>
    [XmlEnum("50078869")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bulstrad_Life_Vienna_Insurance_Group_JSC,

    /// <summary>
    /// Arkema Insurance dac
    /// </summary>
    [XmlEnum("50078898")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Arkema_Insurance_dac,

    /// <summary>
    /// Greenval Insurance dac
    /// </summary>
    [XmlEnum("50078954")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Greenval_Insurance_dac,

    /// <summary>
    /// CHUBB Life Europe SE
    /// </summary>
    [XmlEnum("50078956")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CHUBB_Life_Europe_SE,

    /// <summary>
    /// SOGESSUR S.A. Deutsche Niederlassung
    /// </summary>
    [XmlEnum("50078968")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SOGESSUR_S_A_Deutsche_Niederlassung,

    /// <summary>
    /// HSBC Life Assurance (Malta) Limited
    /// </summary>
    [XmlEnum("50079040")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HSBC_Life_Assurance_Malta_Limited,

    /// <summary>
    /// QIC Europe Ltd
    /// </summary>
    [XmlEnum("50079048")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    QIC_Europe_Ltd,

    /// <summary>
    /// HDI Global Specialty SE
    /// </summary>
    [XmlEnum("50079066")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HDI_Global_Specialty_SE,

    /// <summary>
    /// AXA Life Europe Designated Activity Company
    /// </summary>
    [XmlEnum("50079120")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Life_Europe_Designated_Activity_Company,

    /// <summary>
    /// Gard Marine &amp; Energy Insurance (Europe) AS
    /// </summary>
    [XmlEnum("50079123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gard_Marine_Energy_Insurance_Europe_AS,

    /// <summary>
    /// Wiener osiguranje Vienna Insurance Group d.d.
    /// </summary>
    [XmlEnum("50079156")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wiener_osiguranje_Vienna_Insurance_Group_d_d,

    /// <summary>
    /// Achmea Pensioen- en Levensverzekeringen N.V.
    /// </summary>
    [XmlEnum("50079210")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Achmea_Pensioen_en_Levensverzekeringen_N_V,

    /// <summary>
    /// Holmia Livförsäkring AB
    /// </summary>
    [XmlEnum("50079211")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Holmia_Livf_rs_kring_AB,

    /// <summary>
    /// RiverStone International Ireland DAC
    /// </summary>
    [XmlEnum("50079311")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    RiverStone_International_Ireland_DAC,

    /// <summary>
    /// Triglav Osiguranje d.d.
    /// </summary>
    [XmlEnum("50079357")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Triglav_Osiguranje_d_d,

    /// <summary>
    /// Nautilus Indemnity (Europe) dac
    /// </summary>
    [XmlEnum("50079358")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nautilus_Indemnity_Europe_dac,

    /// <summary>
    /// MMA IARD SA
    /// </summary>
    [XmlEnum("50079383")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MMA_IARD_SA,

    /// <summary>
    /// MSIG Europe SE
    /// </summary>
    [XmlEnum("50079556")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MSIG_Europe_SE,

    /// <summary>
    /// enovetic pension fund (assep)
    /// </summary>
    [XmlEnum("50079573")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    enovetic_pension_fund_assep,

    /// <summary>
    /// Groupama Gan Vie S.A.
    /// </summary>
    [XmlEnum("50079584")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Groupama_Gan_Vie_S_A,

    /// <summary>
    /// Vital Blue Insurance dac
    /// </summary>
    [XmlEnum("50079585")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vital_Blue_Insurance_dac,

    /// <summary>
    /// Fonds de Garantie Voyages AAM
    /// </summary>
    [XmlEnum("50079586")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fonds_de_Garantie_Voyages_AAM,

    /// <summary>
    /// ITAS- Instituto Trentino Alto Adige per Assicurazioni Società Mutua di Assicurazioni
    /// </summary>
    [XmlEnum("50079763")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ITAS_Instituto_Trentino_Alto_Adige_per_Assicurazioni_Societ_Mutua_di_Assicurazioni,

    /// <summary>
    /// W. R. Berkley Europe AG Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50079769")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_R_Berkley_Europe_AG_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Generali Zavarovalnica d.d.
    /// </summary>
    [XmlEnum("50079787")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Zavarovalnica_d_d,

    /// <summary>
    /// Mercedes-Benz Versicherung AG
    /// </summary>
    [XmlEnum("50079798")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mercedes_Benz_Versicherung_AG,

    /// <summary>
    /// STELLANTIS INSURANCE EUROPE LIMITED
    /// </summary>
    [XmlEnum("50079841")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    STELLANTIS_INSURANCE_EUROPE_LIMITED,

    /// <summary>
    /// STELLANTIS LIFE INSURANCE EUROPE LIMITED
    /// </summary>
    [XmlEnum("50079842")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    STELLANTIS_LIFE_INSURANCE_EUROPE_LIMITED,

    /// <summary>
    /// OWM Zorgverzekeraar Zorg en Zekerheid U.A.
    /// </summary>
    [XmlEnum("50079862")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OWM_Zorgverzekeraar_Zorg_en_Zekerheid_U_A,

    /// <summary>
    /// N.V. Univé Zorg
    /// </summary>
    [XmlEnum("50079875")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_V_Univ_Zorg,

    /// <summary>
    /// VGZ Zorgverzekeraar N.V.
    /// </summary>
    [XmlEnum("50079876")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VGZ_Zorgverzekeraar_N_V,

    /// <summary>
    /// IZA Zorgverzekeraar N.V.
    /// </summary>
    [XmlEnum("50079877")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IZA_Zorgverzekeraar_N_V,

    /// <summary>
    /// N.V. Zorgverzekeraar UMC
    /// </summary>
    [XmlEnum("50079880")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_V_Zorgverzekeraar_UMC,

    /// <summary>
    /// Interpolis Zorgverzekeringen N.V.
    /// </summary>
    [XmlEnum("50079921")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Interpolis_Zorgverzekeringen_N_V,

    /// <summary>
    /// Achmea Zorgverzekeringen N.V.
    /// </summary>
    [XmlEnum("50079922")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Achmea_Zorgverzekeringen_N_V,

    /// <summary>
    /// Zilveren Kruis Zorgverzekeringen N.V.
    /// </summary>
    [XmlEnum("50079926")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zilveren_Kruis_Zorgverzekeringen_N_V,

    /// <summary>
    /// PRUDENTIA Pensionskasse AG
    /// </summary>
    [XmlEnum("50079971")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PRUDENTIA_Pensionskasse_AG,

    /// <summary>
    /// CNP Luxembourg S.A.
    /// </summary>
    [XmlEnum("50079972")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_Luxembourg_S_A,

    /// <summary>
    /// De Friesland Zorgverzekeraar N.V.
    /// </summary>
    [XmlEnum("50079985")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    De_Friesland_Zorgverzekeraar_N_V,

    /// <summary>
    /// FBTO Zorgverzekeringen N.V.
    /// </summary>
    [XmlEnum("50079987")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    FBTO_Zorgverzekeringen_N_V,

    /// <summary>
    /// Anderzorg N.V.
    /// </summary>
    [XmlEnum("50079995")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Anderzorg_N_V,

    /// <summary>
    /// Centrale Zorgverzekeringen NZV N.V.
    /// </summary>
    [XmlEnum("50079997")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Centrale_Zorgverzekeringen_NZV_N_V,

    /// <summary>
    /// Onderlinge Waarborgmaatschappij DSW Zorgverzekeraar U.A.
    /// </summary>
    [XmlEnum("50080000")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Onderlinge_Waarborgmaatschappij_DSW_Zorgverzekeraar_U_A,

    /// <summary>
    /// DSW Ziektekostenverzekeringen N.V.
    /// </summary>
    [XmlEnum("50080001")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DSW_Ziektekostenverzekeringen_N_V,

    /// <summary>
    /// Menzis N.V.
    /// </summary>
    [XmlEnum("50080002")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Menzis_N_V,

    /// <summary>
    /// Menzis Zorgverzekeraar N.V.
    /// </summary>
    [XmlEnum("50080003")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Menzis_Zorgverzekeraar_N_V,

    /// <summary>
    /// OHRA Zorgverzekeringen N.V.
    /// </summary>
    [XmlEnum("50080004")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OHRA_Zorgverzekeringen_N_V,

    /// <summary>
    /// Onderlinge Waarborgmaatschappij CZ groep U.A.
    /// </summary>
    [XmlEnum("50080005")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Onderlinge_Waarborgmaatschappij_CZ_groep_U_A,

    /// <summary>
    /// Stad Holland Zorgverzekeraar Onderlinge Waarborgmaatschappij U.A.
    /// </summary>
    [XmlEnum("50080006")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Stad_Holland_Zorgverzekeraar_Onderlinge_Waarborgmaatschappij_U_A,

    /// <summary>
    /// Colonnade Insurance S.A.
    /// </summary>
    [XmlEnum("50080041")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Colonnade_Insurance_S_A,

    /// <summary>
    /// ASR Aanvullende Ziektekostenverzekeringen N.V.
    /// </summary>
    [XmlEnum("50080218")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ASR_Aanvullende_Ziektekostenverzekeringen_N_V,

    /// <summary>
    /// ASR Basis Ziektekostenverzekeringen N.V.
    /// </summary>
    [XmlEnum("50080219")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ASR_Basis_Ziektekostenverzekeringen_N_V,

    /// <summary>
    /// ADB &quot;Compensa Vienna Insurance Group&quot;
    /// </summary>
    [XmlEnum("50080280")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADB_Compensa_Vienna_Insurance_Group,

    /// <summary>
    /// Salland Zorgverzekeraar N.V.
    /// </summary>
    [XmlEnum("50080281")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Salland_Zorgverzekeraar_N_V,

    /// <summary>
    /// Salland Aanvullende Verzekeringen N.V.
    /// </summary>
    [XmlEnum("50080282")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Salland_Aanvullende_Verzekeringen_N_V,

    /// <summary>
    /// MAPFRE España, Compañia de Seguros y Reaseguros S.A.
    /// </summary>
    [XmlEnum("50080283")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MAPFRE_Espa_a_Compa_ia_de_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// KLPP Insurance &amp; Reinsurance Company Limited
    /// </summary>
    [XmlEnum("50080318")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KLPP_Insurance_Reinsurance_Company_Limited,

    /// <summary>
    /// CDA 40 ZAVAROVALNICA D.D. - v likvidaciji
    /// </summary>
    [XmlEnum("50080440")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CDA_40_ZAVAROVALNICA_D_D_v_likvidaciji,

    /// <summary>
    /// Wakam
    /// </summary>
    [XmlEnum("50080497")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Wakam,

    /// <summary>
    /// Hillwood Limited
    /// </summary>
    [XmlEnum("50080520")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hillwood_Limited,

    /// <summary>
    /// CNP CAUTION
    /// </summary>
    [XmlEnum("50080527")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNP_CAUTION,

    /// <summary>
    /// Insurance JSC &quot;DallBogg: Life and Health&quot; AD
    /// </summary>
    [XmlEnum("50080619")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Insurance_JSC_DallBogg_Life_and_Health_AD,

    /// <summary>
    /// MBDA Insurance dac
    /// </summary>
    [XmlEnum("50080650")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MBDA_Insurance_dac,

    /// <summary>
    /// INTER Krankenversicherung AG
    /// </summary>
    [XmlEnum("50080780")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    INTER_Krankenversicherung_AG,

    /// <summary>
    /// MÜNCHENER VEREIN Lebensversicherung AG
    /// </summary>
    [XmlEnum("50080784")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    M_NCHENER_VEREIN_Lebensversicherung_AG,

    /// <summary>
    /// Atradius Kreditversicherung, Niederlassung der Atradius Crédito y Caución S.A. de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("50080787")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Atradius_Kreditversicherung_Niederlassung_der_Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros,

    /// <summary>
    /// AXA Wealth Europe S.A.
    /// </summary>
    [XmlEnum("50080795")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Wealth_Europe_S_A,

    /// <summary>
    /// W. R. Berkley Europe AG
    /// </summary>
    [XmlEnum("50080823")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    W_R_Berkley_Europe_AG,

    /// <summary>
    /// Entis Lebensversicherung AG
    /// </summary>
    [XmlEnum("50080838")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Entis_Lebensversicherung_AG,

    /// <summary>
    /// METRO Re AG
    /// </summary>
    [XmlEnum("50080857")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    METRO_Re_AG,

    /// <summary>
    /// Atradius Crédito y Caución S.A. de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("50080908")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros,

    /// <summary>
    /// Astra Versicherung AG
    /// </summary>
    [XmlEnum("50080928")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Astra_Versicherung_AG,

    /// <summary>
    /// INTER Versicherungsverein aG
    /// </summary>
    [XmlEnum("50080956")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    INTER_Versicherungsverein_aG,

    /// <summary>
    /// ICARE Assurance
    /// </summary>
    [XmlEnum("50081003")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ICARE_Assurance,

    /// <summary>
    /// Sofinsod Insurance dac
    /// </summary>
    [XmlEnum("50081127")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sofinsod_Insurance_dac,

    /// <summary>
    /// Zavarovalnica Sava, zavarovalna družba d.d.
    /// </summary>
    [XmlEnum("50081143")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zavarovalnica_Sava_zavarovalna_dru_ba_d_d,

    /// <summary>
    /// Vakuutusosakeyhtiö Bothnia international Zweigniederlassung Deutschland c/o Compre Services (Germany) GmbH
    /// </summary>
    [XmlEnum("50081197")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Vakuutusosakeyhti_Bothnia_international_Zweigniederlassung_Deutschland_c_o_Compre_Services_Germany_GmbH,

    /// <summary>
    /// Alandia Försäkring Abp
    /// </summary>
    [XmlEnum("50081306")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Alandia_F_rs_kring_Abp,

    /// <summary>
    /// Great Lakes Insurance SE
    /// </summary>
    [XmlEnum("50081354")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Great_Lakes_Insurance_SE,

    /// <summary>
    /// Maiden General Försäkrings AB
    /// </summary>
    [XmlEnum("50081368")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Maiden_General_F_rs_krings_AB,

    /// <summary>
    /// Race Seguros y Reaseguros, S.A.
    /// </summary>
    [XmlEnum("50081475")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Race_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// StarStone Insurance SE
    /// </summary>
    [XmlEnum("50081495")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    StarStone_Insurance_SE,

    /// <summary>
    /// Oney Life (PCC) Limited
    /// </summary>
    [XmlEnum("50081608")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Oney_Life_PCC_Limited,

    /// <summary>
    /// Oney Insurance (PCC) Limited
    /// </summary>
    [XmlEnum("50081609")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Oney_Insurance_PCC_Limited,

    /// <summary>
    /// ACTA Assurance SA
    /// </summary>
    [XmlEnum("50081651")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ACTA_Assurance_SA,

    /// <summary>
    /// HAMBURGER PENSIONSFONDS Pensionsfondsverein auf Gegenseitigkeit
    /// </summary>
    [XmlEnum("50081652")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HAMBURGER_PENSIONSFONDS_Pensionsfondsverein_auf_Gegenseitigkeit,

    /// <summary>
    /// Dortmunder Lebensversicherung AG
    /// </summary>
    [XmlEnum("50081693")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dortmunder_Lebensversicherung_AG,

    /// <summary>
    /// FM Insurance Europe S.A., Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50081791")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    FM_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Insurance Company &quot;Asset Insurance&quot; AD
    /// </summary>
    [XmlEnum("50081801")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Insurance_Company_Asset_Insurance_AD,

    /// <summary>
    /// ottonova Krankenversicherung AG
    /// </summary>
    [XmlEnum("50081819")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ottonova_Krankenversicherung_AG,

    /// <summary>
    /// Munich Re PCC Limited
    /// </summary>
    [XmlEnum("50081825")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Munich_Re_PCC_Limited,

    /// <summary>
    /// Relyens Mutual Insurance Niederlassung Deutschland
    /// </summary>
    [XmlEnum("50081848")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Relyens_Mutual_Insurance_Niederlassung_Deutschland,

    /// <summary>
    /// Baloise Assurances Luxembourg S.A.
    /// </summary>
    [XmlEnum("50081849")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Baloise_Assurances_Luxembourg_S_A,

    /// <summary>
    /// ELEMENT Insurance AG
    /// </summary>
    [XmlEnum("50081856")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ELEMENT_Insurance_AG,

    /// <summary>
    /// Chaucer Insurance Company Designated Activity Company
    /// </summary>
    [XmlEnum("50081865")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Chaucer_Insurance_Company_Designated_Activity_Company,

    /// <summary>
    /// GF Forsikring A/S
    /// </summary>
    [XmlEnum("50081883")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    GF_Forsikring_A_S,

    /// <summary>
    /// Tryg Deutschland, Niederlassung der Tryg Forsikring A/S
    /// </summary>
    [XmlEnum("50081910")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tryg_Deutschland_Niederlassung_der_Tryg_Forsikring_A_S,

    /// <summary>
    /// Beazley Insurance dac
    /// </summary>
    [XmlEnum("50081911")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Beazley_Insurance_dac,

    /// <summary>
    /// Beazley Insurance dac
    /// </summary>
    [XmlEnum("50082105")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Beazley_Insurance_dac_2,

    /// <summary>
    /// Generali România Asigurare Reasigurare S.A.
    /// </summary>
    [XmlEnum("50082109")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Rom_nia_Asigurare_Reasigurare_S_A,

    /// <summary>
    /// UNIQA Towarzystwo Ubezpieczen S.A.
    /// </summary>
    [XmlEnum("50082192")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_Towarzystwo_Ubezpieczen_S_A,

    /// <summary>
    /// CGPA Europe S.A.
    /// </summary>
    [XmlEnum("50082249")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CGPA_Europe_S_A,

    /// <summary>
    /// Mercer Pensionsfonds AG
    /// </summary>
    [XmlEnum("50082251")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mercer_Pensionsfonds_AG,

    /// <summary>
    /// DELA Lebensversicherungen Zweigniederlassung der DELA Natura-en levensverzekeringen N.V. Eindhoven
    /// </summary>
    [XmlEnum("50082266")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DELA_Lebensversicherungen_Zweigniederlassung_der_DELA_Natura_en_levensverzekeringen_N_V_Eindhoven,

    /// <summary>
    /// NN Insurance Belgium SA
    /// </summary>
    [XmlEnum("50082309")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NN_Insurance_Belgium_SA,

    /// <summary>
    /// Öffentliche Lebensversicherung Sachsen-Anhalt
    /// </summary>
    [XmlEnum("50082337")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ffentliche_Lebensversicherung_Sachsen_Anhalt,

    /// <summary>
    /// Öffentliche Feuerversicherung Sachsen-Anhalt
    /// </summary>
    [XmlEnum("50082338")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ffentliche_Feuerversicherung_Sachsen_Anhalt,

    /// <summary>
    /// Everest Insurance (Ireland) dac
    /// </summary>
    [XmlEnum("50082440")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Everest_Insurance_Ireland_dac,

    /// <summary>
    /// DCC Group Insurances Designated Activity Company
    /// </summary>
    [XmlEnum("50082554")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DCC_Group_Insurances_Designated_Activity_Company,

    /// <summary>
    /// FM Insurance Europe S.A.
    /// </summary>
    [XmlEnum("50082556")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    FM_Insurance_Europe_S_A,

    /// <summary>
    /// Bankia Mapfre Vida, Sociedad Anónima de Seguros y Reaseguros
    /// </summary>
    [XmlEnum("50082607")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bankia_Mapfre_Vida_Sociedad_An_nima_de_Seguros_y_Reaseguros,

    /// <summary>
    /// VIA Versicherung AG
    /// </summary>
    [XmlEnum("50082650")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VIA_Versicherung_AG,

    /// <summary>
    /// AIG Europe S.A., Direktion für Deutschland
    /// </summary>
    [XmlEnum("50082651")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AIG_Europe_S_A_Direktion_f_r_Deutschland,

    /// <summary>
    /// Ambra Versicherung AG
    /// </summary>
    [XmlEnum("50082676")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ambra_Versicherung_AG,

    /// <summary>
    /// VIG RE zajišťovna, a.s., Niederlassung Deutschland
    /// </summary>
    [XmlEnum("50082726")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    VIG_RE_zaji_ovna_a_s_Niederlassung_Deutschland,

    /// <summary>
    /// Neodigital Versicherung AG
    /// </summary>
    [XmlEnum("50082727")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Neodigital_Versicherung_AG,

    /// <summary>
    /// UnitedHealthcare Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("50082766")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UnitedHealthcare_Insurance_Designated_Activity_Company,

    /// <summary>
    /// QBE Europe SA/NV Direktion für Deutschland
    /// </summary>
    [XmlEnum("50082871")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    QBE_Europe_SA_NV_Direktion_f_r_Deutschland,

    /// <summary>
    /// Fortegra Europe Insurance Company SE
    /// </summary>
    [XmlEnum("50082945")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fortegra_Europe_Insurance_Company_SE,

    /// <summary>
    /// UNOFI Assurances S.A.
    /// </summary>
    [XmlEnum("50082963")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNOFI_Assurances_S_A,

    /// <summary>
    /// Mercedes-Benz Pensionsfonds AG c/o Mercer Deutschland GmbH
    /// </summary>
    [XmlEnum("50082964")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mercedes_Benz_Pensionsfonds_AG_c_o_Mercer_Deutschland_GmbH,

    /// <summary>
    /// Mangrove Insurance Europe PCC Ltd
    /// </summary>
    [XmlEnum("50083073")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mangrove_Insurance_Europe_PCC_Ltd,

    /// <summary>
    /// Markel Insurance SE
    /// </summary>
    [XmlEnum("50083095")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Markel_Insurance_SE,

    /// <summary>
    /// SI Insurance (Europe), SA Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50083099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SI_Insurance_Europe_SA_Zweigniederlassung_Deutschland,

    /// <summary>
    /// HISCOX SA, Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50083100")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HISCOX_SA_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Albingia S.A.
    /// </summary>
    [XmlEnum("50083111")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Albingia_S_A,

    /// <summary>
    /// QBE Europe SA/NV
    /// </summary>
    [XmlEnum("50083113")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    QBE_Europe_SA_NV,

    /// <summary>
    /// Mutuelle des Étudiants de Provence
    /// </summary>
    [XmlEnum("50083118")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mutuelle_des_tudiants_de_Provence,

    /// <summary>
    /// Lloyd&apos;s Insurance Company S.A., Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50083121")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lloyd_s_Insurance_Company_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Lloyd&apos;s Insurance Company S.A.
    /// </summary>
    [XmlEnum("50083123")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lloyd_s_Insurance_Company_S_A,

    /// <summary>
    /// Intact Insurance (Europe) S.A. &quot;Niederlassung für Deutschland&quot;
    /// </summary>
    [XmlEnum("50083224")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Intact_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Nationale-Nederlanden Schadeverzekering Maatschappij N.V.
    /// </summary>
    [XmlEnum("50083253")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V,

    /// <summary>
    /// Tokio Marine Europe S.A. - Zweigniederlassung für Deutschland
    /// </summary>
    [XmlEnum("50083270")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tokio_Marine_Europe_S_A_Zweigniederlassung_f_r_Deutschland,

    /// <summary>
    /// Premia Insurance Europe SA
    /// </summary>
    [XmlEnum("50083370")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Premia_Insurance_Europe_SA,

    /// <summary>
    /// AXA France IARD S.A., Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50083407")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_France_IARD_S_A_Zweigniederlassung_Deutschland,

    /// <summary>
    /// AXA France Vie S.A., Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50083408")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_France_Vie_S_A_Zweigniederlassung_Deutschland,

    /// <summary>
    /// SI Insurance (Europe), SA
    /// </summary>
    [XmlEnum("50083457")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SI_Insurance_Europe_SA,

    /// <summary>
    /// CNA Insurance Company (Europe) S.A.
    /// </summary>
    [XmlEnum("50083505")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNA_Insurance_Company_Europe_S_A,

    /// <summary>
    /// Aviva Insurance Ireland dac
    /// </summary>
    [XmlEnum("50083515")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Aviva_Insurance_Ireland_dac,

    /// <summary>
    /// Tokio Marine Europe S.A.
    /// </summary>
    [XmlEnum("50083529")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tokio_Marine_Europe_S_A,

    /// <summary>
    /// AIG Europe S.A.
    /// </summary>
    [XmlEnum("50083530")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AIG_Europe_S_A,

    /// <summary>
    /// Ansvar Verzekeringsmaatschappij N.V.
    /// </summary>
    [XmlEnum("50083558")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Ansvar_Verzekeringsmaatschappij_N_V,

    /// <summary>
    /// andsafe Aktiengesellschaft
    /// </summary>
    [XmlEnum("50083585")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    andsafe_Aktiengesellschaft,

    /// <summary>
    /// HISCOX S.A.
    /// </summary>
    [XmlEnum("50083638")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HISCOX_S_A,

    /// <summary>
    /// Mutuaide Assistance S.A.
    /// </summary>
    [XmlEnum("50083649")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mutuaide_Assistance_S_A,

    /// <summary>
    /// Fidelis Insurance Ireland Designated Activity Company
    /// </summary>
    [XmlEnum("50083651")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fidelis_Insurance_Ireland_Designated_Activity_Company,

    /// <summary>
    /// USAA EU Designated Activity Company Frankfurt Claims Branch
    /// </summary>
    [XmlEnum("50083664")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    USAA_EU_Designated_Activity_Company_Frankfurt_Claims_Branch,

    /// <summary>
    /// CNA Insurance Company (Europe) S.A.
    /// </summary>
    [XmlEnum("50083701")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CNA_Insurance_Company_Europe_S_A_2,

    /// <summary>
    /// USAA EU Designated Activity Company
    /// </summary>
    [XmlEnum("50083751")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    USAA_EU_Designated_Activity_Company,

    /// <summary>
    /// Berkshire Hathaway European Insurance DAC, Deutschland
    /// </summary>
    [XmlEnum("50083752")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Berkshire_Hathaway_European_Insurance_DAC_Deutschland,

    /// <summary>
    /// SCOR Europe SE
    /// </summary>
    [XmlEnum("50083815")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SCOR_Europe_SE,

    /// <summary>
    /// Starr Europe Insurance Limited
    /// </summary>
    [XmlEnum("50083844")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Starr_Europe_Insurance_Limited,

    /// <summary>
    /// Bavaria Reinsurance Malta Limited
    /// </summary>
    [XmlEnum("50083845")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bavaria_Reinsurance_Malta_Limited,

    /// <summary>
    /// Mapfre Seguros Gerais, S.A.
    /// </summary>
    [XmlEnum("50083848")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mapfre_Seguros_Gerais_S_A,

    /// <summary>
    /// Aviva Life &amp; Pensions Ireland Designated Activity Company
    /// </summary>
    [XmlEnum("50083904")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Aviva_Life_Pensions_Ireland_Designated_Activity_Company,

    /// <summary>
    /// Royal London Insurance dac
    /// </summary>
    [XmlEnum("50083905")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Royal_London_Insurance_dac,

    /// <summary>
    /// Bupa Global DAC
    /// </summary>
    [XmlEnum("50083909")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bupa_Global_DAC,

    /// <summary>
    /// UNIQA Biztosító Zártkörűen Működő Részvénytársaság
    /// </summary>
    [XmlEnum("50083931")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g,

    /// <summary>
    /// TK Pensionsfonds AG
    /// </summary>
    [XmlEnum("50083933")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TK_Pensionsfonds_AG,

    /// <summary>
    /// Generali Luxembourg S.A.
    /// </summary>
    [XmlEnum("50083986")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Luxembourg_S_A,

    /// <summary>
    /// NorthStandard EU DAC
    /// </summary>
    [XmlEnum("50083989")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    NorthStandard_EU_DAC,

    /// <summary>
    /// Talanx Aktiengesellschaft
    /// </summary>
    [XmlEnum("50083992")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Talanx_Aktiengesellschaft,

    /// <summary>
    /// Barmenia Versicherungen a.G.
    /// </summary>
    [XmlEnum("50084007")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Barmenia_Versicherungen_a_G,

    /// <summary>
    /// The Britannia Steam Ship Insurance Association Europe M.A.
    /// </summary>
    [XmlEnum("50084018")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    The_Britannia_Steam_Ship_Insurance_Association_Europe_M_A,

    /// <summary>
    /// Travelers Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("50084040")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Travelers_Insurance_Designated_Activity_Company,

    /// <summary>
    /// Starr Europe Insurance Limited, Germany
    /// </summary>
    [XmlEnum("50084050")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Starr_Europe_Insurance_Limited_Germany,

    /// <summary>
    /// La Mondiale Partenaire S.A
    /// </summary>
    [XmlEnum("50084059")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    La_Mondiale_Partenaire_S_A,

    /// <summary>
    /// La Mondiale S.A.
    /// </summary>
    [XmlEnum("50084060")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    La_Mondiale_S_A,

    /// <summary>
    /// Standard Life Versicherung, Zweigniederlassung Deutschland der Standard Life International Designated Activity Company
    /// </summary>
    [XmlEnum("50084069")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Standard_Life_Versicherung_Zweigniederlassung_Deutschland_der_Standard_Life_International_Designated_Activity_Company,

    /// <summary>
    /// Monument Life Insurance DAC
    /// </summary>
    [XmlEnum("50084073")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Monument_Life_Insurance_DAC,

    /// <summary>
    /// Berkshire Hathaway European Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("50084074")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Berkshire_Hathaway_European_Insurance_Designated_Activity_Company,

    /// <summary>
    /// AXA Insurance dac
    /// </summary>
    [XmlEnum("50084084")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Insurance_dac,

    /// <summary>
    /// Satrex SA
    /// </summary>
    [XmlEnum("50084085")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Satrex_SA,

    /// <summary>
    /// Domestic &amp; General Insurance Europe AG
    /// </summary>
    [XmlEnum("50084086")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Domestic_General_Insurance_Europe_AG,

    /// <summary>
    /// Newline Europe Versicherung AG
    /// </summary>
    [XmlEnum("50084095")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Newline_Europe_Versicherung_AG,

    /// <summary>
    /// Dialog Versicherung Aktiengesellschaft
    /// </summary>
    [XmlEnum("50084103")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dialog_Versicherung_Aktiengesellschaft,

    /// <summary>
    /// Collinson Insurance Europe Limited
    /// </summary>
    [XmlEnum("50084114")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Collinson_Insurance_Europe_Limited,

    /// <summary>
    /// Actua Schadeverzekering N.V.
    /// </summary>
    [XmlEnum("50084169")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Actua_Schadeverzekering_N_V,

    /// <summary>
    /// UK P&amp;I Club N.V.
    /// </summary>
    [XmlEnum("50084190")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UK_P_I_Club_N_V,

    /// <summary>
    /// Nordic Guarantee Försäkringsaktiebolag
    /// </summary>
    [XmlEnum("50084191")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nordic_Guarantee_F_rs_kringsaktiebolag,

    /// <summary>
    /// Viridium Rückversicherung AG
    /// </summary>
    [XmlEnum("50084271")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Viridium_R_ckversicherung_AG,

    /// <summary>
    /// Opteven Assurances S.A.
    /// </summary>
    [XmlEnum("50084325")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Opteven_Assurances_S_A,

    /// <summary>
    /// Bastion Insurance Company Limited
    /// </summary>
    [XmlEnum("50084348")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bastion_Insurance_Company_Limited,

    /// <summary>
    /// Lemonade Insurance N.V.
    /// </summary>
    [XmlEnum("50084418")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lemonade_Insurance_N_V,

    /// <summary>
    /// Barmenia Krankenversicherung AG
    /// </summary>
    [XmlEnum("50084541")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Barmenia_Krankenversicherung_AG,

    /// <summary>
    /// First European Title Insurance Company Limited
    /// </summary>
    [XmlEnum("50084563")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    First_European_Title_Insurance_Company_Limited,

    /// <summary>
    /// TransRe Europe S.A., Munich Branch
    /// </summary>
    [XmlEnum("50084571")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TransRe_Europe_S_A_Munich_Branch,

    /// <summary>
    /// Towarzystwo Ubezpieczeń Wzajemnych Polski Zakład Ubezpieczeń Wzajemnych
    /// </summary>
    [XmlEnum("50084587")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_Wzajemnych_Polski_Zak_ad_Ubezpiecze_Wzajemnych,

    /// <summary>
    /// Europ Assistance SA, Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50084683")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Europ_Assistance_SA_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// POUEY RENSEIGNEMENT COMMERCIAL GARANTI SA
    /// </summary>
    [XmlEnum("50085024")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    POUEY_RENSEIGNEMENT_COMMERCIAL_GARANTI_SA,

    /// <summary>
    /// BANKINTER SEGUROS GENERALES, S.A. DE SEGUROS Y REASEGUROS
    /// </summary>
    [XmlEnum("50085088")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BANKINTER_SEGUROS_GENERALES_S_A_DE_SEGUROS_Y_REASEGUROS,

    /// <summary>
    /// Assured Guaranty (Europe) S.A.
    /// </summary>
    [XmlEnum("50085149")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assured_Guaranty_Europe_S_A,

    /// <summary>
    /// SIGNAL IDUNA Sterbekasse VVaG
    /// </summary>
    [XmlEnum("50085276")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Sterbekasse_VVaG,

    /// <summary>
    /// EUROHERC osiguranje d.d.
    /// </summary>
    [XmlEnum("50085283")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUROHERC_osiguranje_d_d,

    /// <summary>
    /// MGEN FILIA
    /// </summary>
    [XmlEnum("50085284")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MGEN_FILIA,

    /// <summary>
    /// Mutuelle Generale de l&apos;Education Nationale (MGEN)
    /// </summary>
    [XmlEnum("50085285")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mutuelle_Generale_de_l_Education_Nationale_MGEN,

    /// <summary>
    /// Steamship Mutual Underwriting Association (Europe) Limited
    /// </summary>
    [XmlEnum("50085290")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Steamship_Mutual_Underwriting_Association_Europe_Limited,

    /// <summary>
    /// Intesa Sanpaolo Assicura S.p.A
    /// </summary>
    [XmlEnum("50085312")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Intesa_Sanpaolo_Assicura_S_p_A,

    /// <summary>
    /// Lippische Landesbrandversicherung AG
    /// </summary>
    [XmlEnum("50085313")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lippische_Landesbrandversicherung_AG,

    /// <summary>
    /// HanseMerkur International AG
    /// </summary>
    [XmlEnum("50085361")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HanseMerkur_International_AG,

    /// <summary>
    /// SV SparkassenVersicherung Pensionsfonds AG
    /// </summary>
    [XmlEnum("50085526")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SV_SparkassenVersicherung_Pensionsfonds_AG,

    /// <summary>
    /// Companhia de Seguros Allianz Portugal, S.A.
    /// </summary>
    [XmlEnum("50085621")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Companhia_de_Seguros_Allianz_Portugal_S_A,

    /// <summary>
    /// MUTUA DE RIESGO MARITIMO, SOCIEDAD DE SEGUROS A PRIMA FIJA (MURIMAR)
    /// </summary>
    [XmlEnum("50085705")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MUTUA_DE_RIESGO_MARITIMO_SOCIEDAD_DE_SEGUROS_A_PRIMA_FIJA_MURIMAR,

    /// <summary>
    /// Irish Life Assurance plc
    /// </summary>
    [XmlEnum("50085706")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Irish_Life_Assurance_plc,

    /// <summary>
    /// Eir Försäkring AB
    /// </summary>
    [XmlEnum("50085746")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Eir_F_rs_kring_AB,

    /// <summary>
    /// Trust International Insurance Company (Cyprus) Limited
    /// </summary>
    [XmlEnum("50085783")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Trust_International_Insurance_Company_Cyprus_Limited,

    /// <summary>
    /// Assurant Europe Insurance N.V.
    /// </summary>
    [XmlEnum("50085846")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assurant_Europe_Insurance_N_V,

    /// <summary>
    /// Assurant Europe Life Insurance N.V.
    /// </summary>
    [XmlEnum("50085847")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Assurant_Europe_Life_Insurance_N_V,

    /// <summary>
    /// American Steamship Owners Marine Insurance Company (Europe) Limited
    /// </summary>
    [XmlEnum("50085885")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    American_Steamship_Owners_Marine_Insurance_Company_Europe_Limited,

    /// <summary>
    /// Försäkringsaktiebolaget Agria (publ.), Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50085898")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    F_rs_kringsaktiebolaget_Agria_publ_Zweigniederlassung_Deutschland,

    /// <summary>
    /// SMA SA
    /// </summary>
    [XmlEnum("50085931")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SMA_SA,

    /// <summary>
    /// Sanofi European Pension Fund OFP
    /// </summary>
    [XmlEnum("50085937")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sanofi_European_Pension_Fund_OFP,

    /// <summary>
    /// PACIFICA
    /// </summary>
    [XmlEnum("50085995")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    PACIFICA,

    /// <summary>
    /// The United Kingdom Freight Demurrage and Defence Insurance (Europe) Limited
    /// </summary>
    [XmlEnum("50086004")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    The_United_Kingdom_Freight_Demurrage_and_Defence_Insurance_Europe_Limited,

    /// <summary>
    /// Caisse Regionale d Assurances Mutuelles Agricoles du Nord-Est
    /// </summary>
    [XmlEnum("50086239")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_du_Nord_Est,

    /// <summary>
    /// Monument Assurance Belgium SA/NV
    /// </summary>
    [XmlEnum("50086307")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Monument_Assurance_Belgium_SA_NV,

    /// <summary>
    /// Metzler Sozialpartner Pensionsfonds AG
    /// </summary>
    [XmlEnum("50086313")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Metzler_Sozialpartner_Pensionsfonds_AG,

    /// <summary>
    /// Accelerant Insurance Europe SA/NV
    /// </summary>
    [XmlEnum("50086401")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Accelerant_Insurance_Europe_SA_NV,

    /// <summary>
    /// OCCIDENT GCO, SOCIEDAD ANÓNIMA DE SEGUROS Y REASEGUROS
    /// </summary>
    [XmlEnum("50086460")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    OCCIDENT_GCO_SOCIEDAD_AN_NIMA_DE_SEGUROS_Y_REASEGUROS,

    /// <summary>
    /// KOMUNÁLNA poist´ovna, a.s. Vienna Insurance Group
    /// </summary>
    [XmlEnum("50086474")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KOMUN_LNA_poist_ovna_a_s_Vienna_Insurance_Group,

    /// <summary>
    /// TM tryginggar hf.
    /// </summary>
    [XmlEnum("50086502")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TM_tryginggar_hf,

    /// <summary>
    /// The London P&amp;I Insurance Company (Europe) Limited
    /// </summary>
    [XmlEnum("50086574")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    The_London_P_I_Insurance_Company_Europe_Limited,

    /// <summary>
    /// MIC Insurance Company S.A.
    /// </summary>
    [XmlEnum("50086724")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MIC_Insurance_Company_S_A,

    /// <summary>
    /// SIGNAL IDUNA Lebensversicherung AG
    /// </summary>
    [XmlEnum("50086785")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SIGNAL_IDUNA_Lebensversicherung_AG,

    /// <summary>
    /// Companjon Insurance DAC
    /// </summary>
    [XmlEnum("50086851")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Companjon_Insurance_DAC,

    /// <summary>
    /// EUCARE Insurance PCC Limited
    /// </summary>
    [XmlEnum("50086928")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EUCARE_Insurance_PCC_Limited,

    /// <summary>
    /// Tulip Assist Insurance Limited
    /// </summary>
    [XmlEnum("50086965")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Tulip_Assist_Insurance_Limited,

    /// <summary>
    /// Bothnia International Insurance Company Ltd
    /// </summary>
    [XmlEnum("50086967")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bothnia_International_Insurance_Company_Ltd,

    /// <summary>
    /// ONVZ Aanvullende Verzekering N.V.
    /// </summary>
    [XmlEnum("50087097")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ONVZ_Aanvullende_Verzekering_N_V,

    /// <summary>
    /// Allianz Hrvatska d.d.
    /// </summary>
    [XmlEnum("50087098")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Hrvatska_d_d,

    /// <summary>
    /// Veterfina Verzekeringsmaatschappij N.V.
    /// </summary>
    [XmlEnum("50087099")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Veterfina_Verzekeringsmaatschappij_N_V,

    /// <summary>
    /// J&amp;J Pension Fund OFP
    /// </summary>
    [XmlEnum("50087112")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    J_J_Pension_Fund_OFP,

    /// <summary>
    /// International General Insurance Company (Europe) Ltd
    /// </summary>
    [XmlEnum("50087232")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    International_General_Insurance_Company_Europe_Ltd,

    /// <summary>
    /// Hrvatsko kreditno osiguranje d.d.
    /// </summary>
    [XmlEnum("50087261")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hrvatsko_kreditno_osiguranje_d_d,

    /// <summary>
    /// UNIQA Towarzystwo Ubezpieczeń na Życie S.A.
    /// </summary>
    [XmlEnum("50087360")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UNIQA_Towarzystwo_Ubezpiecze_na_ycie_S_A,

    /// <summary>
    /// Seyna S.A.
    /// </summary>
    [XmlEnum("50087425")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Seyna_S_A,

    /// <summary>
    /// Generali Hellas Insurance Company S.A.
    /// </summary>
    [XmlEnum("50087428")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Generali_Hellas_Insurance_Company_S_A,

    /// <summary>
    /// Convex Europe S.A.
    /// </summary>
    [XmlEnum("50087478")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Convex_Europe_S_A,

    /// <summary>
    /// SV pojišťovna, a.s.
    /// </summary>
    [XmlEnum("50087521")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SV_poji_ovna_a_s,

    /// <summary>
    /// Caisse Nationale de Réassurance mutuelle agricole Groupama
    /// </summary>
    [XmlEnum("50087825")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_Nationale_de_R_assurance_mutuelle_agricole_Groupama,

    /// <summary>
    /// Zurich Life Legacy Versicherung AG (Deutschland)
    /// </summary>
    [XmlEnum("50088222")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Zurich_Life_Legacy_Versicherung_AG_Deutschland,

    /// <summary>
    /// Gasrule Insurance DAC
    /// </summary>
    [XmlEnum("50088245")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gasrule_Insurance_DAC,

    /// <summary>
    /// CGPA Europe Underwriting GmbH
    /// </summary>
    [XmlEnum("50088286")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CGPA_Europe_Underwriting_GmbH,

    /// <summary>
    /// D.A.S. Belgische Rechtsbijstandsverzekeringsmaatschappij NV
    /// </summary>
    [XmlEnum("50088326")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    D_A_S_Belgische_Rechtsbijstandsverzekeringsmaatschappij_NV,

    /// <summary>
    /// Lime Street Insurance PCC Limited - Sugar Bridge Cell
    /// </summary>
    [XmlEnum("50088364")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Lime_Street_Insurance_PCC_Limited_Sugar_Bridge_Cell,

    /// <summary>
    /// AGER Lebensversicherung AG
    /// </summary>
    [XmlEnum("50088396")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AGER_Lebensversicherung_AG,

    /// <summary>
    /// HOK-osiguranje d.d.
    /// </summary>
    [XmlEnum("50088593")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    HOK_osiguranje_d_d,

    /// <summary>
    /// REVO Insurance S.p.A.
    /// </summary>
    [XmlEnum("50088642")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    REVO_Insurance_S_p_A,

    /// <summary>
    /// SCOR Europe Deutschland, Niederlassung der SCOR Europe SE
    /// </summary>
    [XmlEnum("50088717")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SCOR_Europe_Deutschland_Niederlassung_der_SCOR_Europe_SE,

    /// <summary>
    /// Everest Insurance (Ireland) DAC, Niederlassung für Deutschland
    /// </summary>
    [XmlEnum("50088790")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Everest_Insurance_Ireland_DAC_Niederlassung_f_r_Deutschland,

    /// <summary>
    /// Axiom Insurance Company Jsc
    /// </summary>
    [XmlEnum("50088901")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Axiom_Insurance_Company_Jsc,

    /// <summary>
    /// Towarzystwo Ubezpieczeń Europa S.A.
    /// </summary>
    [XmlEnum("50088942")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_Europa_S_A,

    /// <summary>
    /// Towarzystwo Ubezpieczeń na Życie Europa S.A
    /// </summary>
    [XmlEnum("50088943")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Towarzystwo_Ubezpiecze_na_ycie_Europa_S_A,

    /// <summary>
    /// Premium Insurance Company Limited
    /// </summary>
    [XmlEnum("50088946")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Premium_Insurance_Company_Limited,

    /// <summary>
    /// Société Générale Luxembourg Credit Insurance SA
    /// </summary>
    [XmlEnum("50089089")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Soci_t_G_n_rale_Luxembourg_Credit_Insurance_SA,

    /// <summary>
    /// Dina Försäkring AB
    /// </summary>
    [XmlEnum("50089165")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Dina_F_rs_kring_AB,

    /// <summary>
    /// Gartnernes Forsikring GS. Dansk Jordbrug
    /// </summary>
    [XmlEnum("50089166")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Gartnernes_Forsikring_GS_Dansk_Jordbrug,

    /// <summary>
    /// Mutual Insurance and Reinsurance for Information Systems (MIRIS)
    /// </summary>
    [XmlEnum("50089193")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Mutual_Insurance_and_Reinsurance_for_Information_Systems_MIRIS,

    /// <summary>
    /// BULGARIAN EXPORT INSURANCE AGENCY \BAEZ\ EAD
    /// </summary>
    [XmlEnum("50089277")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    BULGARIAN_EXPORT_INSURANCE_AGENCY_BAEZ_EAD,

    /// <summary>
    /// ERB Cyprialife Limited
    /// </summary>
    [XmlEnum("50089319")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ERB_Cyprialife_Limited,

    /// <summary>
    /// UniSalute S.p.A.
    /// </summary>
    [XmlEnum("50089327")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UniSalute_S_p_A,

    /// <summary>
    /// Descartes Insurance S.A.
    /// </summary>
    [XmlEnum("50089343")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Descartes_Insurance_S_A,

    /// <summary>
    /// Neodigital Autoversicherung AG
    /// </summary>
    [XmlEnum("50089351")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Neodigital_Autoversicherung_AG,

    /// <summary>
    /// YOUPLUS Assurance AG, Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50089358")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    YOUPLUS_Assurance_AG_Zweigniederlassung_Deutschland,

    /// <summary>
    /// Apdrošināšanas akciju sabiedrība &quot;BALTA&quot;
    /// </summary>
    [XmlEnum("50089557")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Apdro_in_anas_akciju_sabiedr_ba_BALTA,

    /// <summary>
    /// UAB PZU Lietuva gyvybės draudimas
    /// </summary>
    [XmlEnum("50089667")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    UAB_PZU_Lietuva_gyvyb_s_draudimas,

    /// <summary>
    /// Goudse Levensverzekeringen N.V.
    /// </summary>
    [XmlEnum("50089675")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Goudse_Levensverzekeringen_N_V,

    /// <summary>
    /// White Rock Insurance (Netherlands) PCC Limited
    /// </summary>
    [XmlEnum("50089790")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    White_Rock_Insurance_Netherlands_PCC_Limited,

    /// <summary>
    /// Swiss Life Lebensversicherung SE
    /// </summary>
    [XmlEnum("50089844")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Swiss_Life_Lebensversicherung_SE,

    /// <summary>
    /// Allianz Risk Transfer AG
    /// </summary>
    [XmlEnum("50089926")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Allianz_Risk_Transfer_AG,

    /// <summary>
    /// Hesse Digital AG
    /// </summary>
    [XmlEnum("50089953")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Hesse_Digital_AG,

    /// <summary>
    /// ACM Lebensversicherung AG
    /// </summary>
    [XmlEnum("50089959")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ACM_Lebensversicherung_AG,

    /// <summary>
    /// Abeille IARD et Sante
    /// </summary>
    [XmlEnum("50089971")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Abeille_IARD_et_Sante,

    /// <summary>
    /// Abanca Vida y Pensiones de Seguros y Reaseguros, S.A.
    /// </summary>
    [XmlEnum("50089986")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Abanca_Vida_y_Pensiones_de_Seguros_y_Reaseguros_S_A,

    /// <summary>
    /// IF Livförsäkring AB
    /// </summary>
    [XmlEnum("50090036")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    IF_Livf_rs_kring_AB,

    /// <summary>
    /// ACM Versicherung AG
    /// </summary>
    [XmlEnum("50090071")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ACM_Versicherung_AG,

    /// <summary>
    /// Scottish Widows Europe S.A.
    /// </summary>
    [XmlEnum("50090074")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Scottish_Widows_Europe_S_A,

    /// <summary>
    /// TG Versicherungs AG
    /// </summary>
    [XmlEnum("50090165")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TG_Versicherungs_AG,

    /// <summary>
    /// International Transport Intermediaries Insurance Company (Europe) Limited
    /// </summary>
    [XmlEnum("50090167")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    International_Transport_Intermediaries_Insurance_Company_Europe_Limited,

    /// <summary>
    /// Bos Fruit Aardappelen Onderlinge verzekeringen BFAO U.A.
    /// </summary>
    [XmlEnum("50090219")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Bos_Fruit_Aardappelen_Onderlinge_verzekeringen_BFAO_U_A,

    /// <summary>
    /// TT Club Mutual Insurance N.V.
    /// </summary>
    [XmlEnum("50090332")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    TT_Club_Mutual_Insurance_N_V,

    /// <summary>
    /// ADAC Zuhause Versicherung AG
    /// </summary>
    [XmlEnum("50090334")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ADAC_Zuhause_Versicherung_AG,

    /// <summary>
    /// Insurance Company Instinct AD
    /// </summary>
    [XmlEnum("50090351")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Insurance_Company_Instinct_AD,

    /// <summary>
    /// Monarch Assurance SE
    /// </summary>
    [XmlEnum("50090411")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Monarch_Assurance_SE,

    /// <summary>
    /// WERLA INSURANCE COMPANY LIMITED
    /// </summary>
    [XmlEnum("50090452")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    WERLA_INSURANCE_COMPANY_LIMITED,

    /// <summary>
    /// Fortegra Belgium Insurance Company NV
    /// </summary>
    [XmlEnum("50090453")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Fortegra_Belgium_Insurance_Company_NV,

    /// <summary>
    /// KOOPERATIVA poisťovňa, a.s. Vienna Insurance Group
    /// </summary>
    [XmlEnum("50090488")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    KOOPERATIVA_pois_ov_a_a_s_Vienna_Insurance_Group,

    /// <summary>
    /// China Taiping Insurance (LU) S.A.
    /// </summary>
    [XmlEnum("50090616")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    China_Taiping_Insurance_LU_S_A,

    /// <summary>
    /// ZAD European Insurance Company AD
    /// </summary>
    [XmlEnum("50090637")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    ZAD_European_Insurance_Company_AD,

    /// <summary>
    /// Direct pojišťovna, a.s.
    /// </summary>
    [XmlEnum("50090698")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Direct_poji_ovna_a_s,

    /// <summary>
    /// Cosmos Insurance Public Company Limited
    /// </summary>
    [XmlEnum("50090841")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Cosmos_Insurance_Public_Company_Limited,

    /// <summary>
    /// CACI Non-Life DAC (Deutschland)
    /// </summary>
    [XmlEnum("50090945")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CACI_Non_Life_DAC_Deutschland,

    /// <summary>
    /// CACI Life DAC (Deutschland)
    /// </summary>
    [XmlEnum("50090947")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    CACI_Life_DAC_Deutschland,

    /// <summary>
    /// Eni Insurance S.p.A.
    /// </summary>
    [XmlEnum("50090980")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Eni_Insurance_S_p_A,

    /// <summary>
    /// American Atlantic Assurance Co Ltd.
    /// </summary>
    [XmlEnum("50090987")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    American_Atlantic_Assurance_Co_Ltd,

    /// <summary>
    /// Steel Plow Insurance Limited
    /// </summary>
    [XmlEnum("50090992")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Steel_Plow_Insurance_Limited,

    /// <summary>
    /// VÍS tryggingar hf.
    /// </summary>
    [XmlEnum("50091045")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    V_S_tryggingar_hf,

    /// <summary>
    /// Renaissance Reinsurance of Europe Designated Activity Company
    /// </summary>
    [XmlEnum("50091079")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Renaissance_Reinsurance_of_Europe_Designated_Activity_Company,

    /// <summary>
    /// MILA S.A.
    /// </summary>
    [XmlEnum("50091128")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MILA_S_A,

    /// <summary>
    /// AS &quot;Sincera Insurance&quot;
    /// </summary>
    [XmlEnum("50091278")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AS_Sincera_Insurance,

    /// <summary>
    /// MSIG Europe SE, Niederlassung Deutschland
    /// </summary>
    [XmlEnum("50091305")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MSIG_Europe_SE_Niederlassung_Deutschland,

    /// <summary>
    /// Caisse d’Assurances Mutuelles du Crédit Agricole
    /// </summary>
    [XmlEnum("50091361")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Caisse_d_Assurances_Mutuelles_du_Cr_dit_Agricole,

    /// <summary>
    /// Nationale-Nederlanden Schadeverzekering Maatschappij N.V., Zweigniederlassung Deutschland
    /// </summary>
    [XmlEnum("50091382")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V_Zweigniederlassung_Deutschland,

    /// <summary>
    /// Omocom Försäkring AB
    /// </summary>
    [XmlEnum("50091424")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Omocom_F_rs_kring_AB,

    /// <summary>
    /// Sveriges Angfartygs Assurans Förening
    /// </summary>
    [XmlEnum("50091553")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Sveriges_Angfartygs_Assurans_F_rening,

    /// <summary>
    /// Helvetia Italia Assicurazioni S.p.A.
    /// </summary>
    [XmlEnum("50091651")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    Helvetia_Italia_Assicurazioni_S_p_A,

    /// <summary>
    /// EP Insurance Designated Activity Company
    /// </summary>
    [XmlEnum("50091725")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    EP_Insurance_Designated_Activity_Company,

    /// <summary>
    /// N.V. Hagelunie
    /// </summary>
    [XmlEnum("50091726")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    N_V_Hagelunie,

    /// <summary>
    /// AXA Health Insurance
    /// </summary>
    [XmlEnum("50091751")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    AXA_Health_Insurance,

    /// <summary>
    /// DSV Insurance DAC
    /// </summary>
    [XmlEnum("50091755")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    DSV_Insurance_DAC,

    /// <summary>
    /// SquareTrade Europe Insurance SA
    /// </summary>
    [XmlEnum("50091756")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    SquareTrade_Europe_Insurance_SA,

    /// <summary>
    /// MGEN Portugal - Companhia de Seguros, S.A.
    /// </summary>
    [XmlEnum("50091799")]
    [XJustizCoreAvailability(XJustizCoreVersion.V0_3_0)]
    MGEN_Portugal_Companhia_de_Seguros_S_A,
}
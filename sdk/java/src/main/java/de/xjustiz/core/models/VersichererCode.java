package de.xjustiz.core.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Versicherer Codes (BaFin ID) aus <a href="https://portal.mvp.bafin.de/database/InstInfo/">Unternehmensdatenbank BaFin</a>.
 *  * <p>
 *  *  <u><b>Insurer codes (BaFin ID):</b></u> from <a href="https://portal.mvp.bafin.de/database/InstInfo/">Unternehmensdatenbank BaFin</a>.
 */
@XmlJavaTypeAdapter(VersichererCode.Adapter.class)
public class VersichererCode {

    /**
     * Alte Leipziger Lebensversicherung auf Gegenseitigkeit
     */
    public static VersichererCode Alte_Leipziger_Lebensversicherung_auf_Gegenseitigkeit;
    /**
     * BY die Bayerische Vorsorge Lebensversicherung a.G.
     */
    public static VersichererCode BY_die_Bayerische_Vorsorge_Lebensversicherung_a_G;
    /**
     * Bayern-Versicherung Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Bayern_Versicherung_Lebensversicherung_Aktiengesellschaft;
    /**
     * AXA Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode AXA_Lebensversicherung_Aktiengesellschaft;
    /**
     * Condor Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Condor_Lebensversicherungs_Aktiengesellschaft;
    /**
     * Cosmos Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Cosmos_Lebensversicherungs_Aktiengesellschaft;
    /**
     * Debeka Lebensversicherungsverein auf Gegenseitigkeit Sitz Koblenz am Rhein
     */
    public static VersichererCode Debeka_Lebensversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein;
    /**
     * DEVK Deutsche Eisenbahn Versicherung Lebensversicherungsverein a.G. Betriebliche Sozialeinrichtung der Deutschen Bahn
     */
    public static VersichererCode DEVK_Deutsche_Eisenbahn_Versicherung_Lebensversicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn;
    /**
     * Baloise Lebensversicherung Aktiengesellschaft Deutschland
     */
    public static VersichererCode Baloise_Lebensversicherung_Aktiengesellschaft_Deutschland;
    /**
     * HDI Lebensversicherung AG
     */
    public static VersichererCode HDI_Lebensversicherung_AG;
    /**
     * Frankfurt Münchener Lebensversicherung AG
     */
    public static VersichererCode Frankfurt_M_nchener_Lebensversicherung_AG;
    /**
     * IDEAL Lebensversicherung a.G.
     */
    public static VersichererCode IDEAL_Lebensversicherung_a_G;
    /**
     * HUK-COBURG-Lebensversicherung AG
     */
    public static VersichererCode HUK_COBURG_Lebensversicherung_AG;
    /**
     * Lebensversicherung von 1871 auf Gegenseitigkeit München
     */
    public static VersichererCode Lebensversicherung_von_1871_auf_Gegenseitigkeit_M_nchen;
    /**
     * Provinzial Lebensversicherung Hannover
     */
    public static VersichererCode Provinzial_Lebensversicherung_Hannover;
    /**
     * Provinzial Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Provinzial_Lebensversicherung_Aktiengesellschaft;
    /**
     * R + V Lebensversicherung a.G.
     */
    public static VersichererCode R_V_Lebensversicherung_a_G;
    /**
     * SV SparkassenVersicherung Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode SV_SparkassenVersicherung_Lebensversicherung_Aktiengesellschaft;
    /**
     * uniVersa Lebensversicherung a.G.
     */
    public static VersichererCode uniVersa_Lebensversicherung_a_G;
    /**
     * VEREINIGTE POSTVERSICHERUNG VVaG
     */
    public static VersichererCode VEREINIGTE_POSTVERSICHERUNG_VVaG;
    /**
     * Volkswohl-Bund Lebensversicherung a.G.
     */
    public static VersichererCode Volkswohl_Bund_Lebensversicherung_a_G;
    /**
     * WWK Lebensversicherung auf Gegenseitigkeit
     */
    public static VersichererCode WWK_Lebensversicherung_auf_Gegenseitigkeit;
    /**
     * Stuttgarter Lebensversicherung a.G.
     */
    public static VersichererCode Stuttgarter_Lebensversicherung_a_G;
    /**
     * EUROPA Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode EUROPA_Lebensversicherung_Aktiengesellschaft;
    /**
     * Gothaer Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Gothaer_Lebensversicherung_Aktiengesellschaft;
    /**
     * Mecklenburgische Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Mecklenburgische_Lebensversicherungs_Aktiengesellschaft;
    /**
     * LVM Lebensversicherungs-AG
     */
    public static VersichererCode LVM_Lebensversicherungs_AG;
    /**
     * Dialog Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Dialog_Lebensversicherungs_Aktiengesellschaft;
    /**
     * HanseMerkur Lebensversicherung AG
     */
    public static VersichererCode HanseMerkur_Lebensversicherung_AG;
    /**
     * Credit Life AG
     */
    public static VersichererCode Credit_Life_AG;
    /**
     * DIREKTE LEBEN Versicherung AG
     */
    public static VersichererCode DIREKTE_LEBEN_Versicherung_AG;
    /**
     * Itzehoer Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Itzehoer_Lebensversicherungs_Aktiengesellschaft;
    /**
     * HDI Vorsorge Lebensversicherung AG
     */
    public static VersichererCode HDI_Vorsorge_Lebensversicherung_AG;
    /**
     * BL die Bayerische Lebensversicherung AG
     */
    public static VersichererCode BL_die_Bayerische_Lebensversicherung_AG;
    /**
     * DEVK Allgemeine Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode DEVK_Allgemeine_Lebensversicherungs_Aktiengesellschaft;
    /**
     * HELVETIA schweizerische Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode HELVETIA_schweizerische_Lebensversicherungs_Aktiengesellschaft;
    /**
     * Zurich Deutscher Herold Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Zurich_Deutscher_Herold_Lebensversicherung_Aktiengesellschaft;
    /**
     * R + V LEBENSVERSICHERUNG AKTIENGESELLSCHAFT
     */
    public static VersichererCode R_V_LEBENSVERSICHERUNG_AKTIENGESELLSCHAFT;
    /**
     * Deutsche Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Deutsche_Lebensversicherungs_Aktiengesellschaft;
    /**
     * WGV-Lebensversicherung AG
     */
    public static VersichererCode WGV_Lebensversicherung_AG;
    /**
     * ERGO Vorsorge Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode ERGO_Vorsorge_Lebensversicherung_Aktiengesellschaft;
    /**
     * Frankfurter Lebensversicherung AG
     */
    public static VersichererCode Frankfurter_Lebensversicherung_AG;
    /**
     * Sparkassen-Versicherung Sachsen Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Sparkassen_Versicherung_Sachsen_Lebensversicherung_Aktiengesellschaft;
    /**
     * Skandia Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Skandia_Lebensversicherung_Aktiengesellschaft;
    /**
     * Heidelberger Lebensversicherung AG
     */
    public static VersichererCode Heidelberger_Lebensversicherung_AG;
    /**
     * VPV Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode VPV_Lebensversicherungs_Aktiengesellschaft;
    /**
     * myLife Lebensversicherung AG
     */
    public static VersichererCode myLife_Lebensversicherung_AG;
    /**
     * neue leben Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode neue_leben_Lebensversicherung_Aktiengesellschaft;
    /**
     * Delta Direkt Lebensversicherung Aktiengesellschaft München
     */
    public static VersichererCode Delta_Direkt_Lebensversicherung_Aktiengesellschaft_M_nchen;
    /**
     * Concordia oeco Lebensversicherungs-AG
     */
    public static VersichererCode Concordia_oeco_Lebensversicherungs_AG;
    /**
     * Cardif Lebensversicherung Zweigniederlassung für Deutschland der Cardif Assurance Vie
     */
    public static VersichererCode Cardif_Lebensversicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurance_Vie;
    /**
     * CIGNA Life Insurance Company of Europe S.A.-N.V. Direktion Für Deutschland
     */
    public static VersichererCode CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V_Direktion_F_r_Deutschland;
    /**
     * LPV Lebensversicherung AG
     */
    public static VersichererCode LPV_Lebensversicherung_AG;
    /**
     * Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
     */
    public static VersichererCode Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh;
    /**
     * Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
     */
    public static VersichererCode Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_2;
    /**
     * Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
     */
    public static VersichererCode Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_3;
    /**
     * Sonderb. f.d. öff.-r. LV.Anst. Brandenburg, Pommern, OEVA-Dresden,Sachs.-Thür.-Anh.
     */
    public static VersichererCode Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_4;
    /**
     * Ulf Peters Sonderb. f.d. öff.-r.LV.Anst. der Sudetenländer i.L.
     */
    public static VersichererCode Ulf_Peters_Sonderb_f_d_ff_r_LV_Anst_der_Sudetenl_nder_i_L;
    /**
     * Canada Life Assurance Europe plc Niederlassung für Deutschland
     */
    public static VersichererCode Canada_Life_Assurance_Europe_plc_Niederlassung_f_r_Deutschland;
    /**
     * &quot;Mediolanum International Life Designated Activity Company&quot; Niederlassung München
     */
    public static VersichererCode Mediolanum_International_Life_Designated_Activity_Company_Niederlassung_M_nchen;
    /**
     * Protektor Lebensversicherungs-AG
     */
    public static VersichererCode Protektor_Lebensversicherungs_AG;
    /**
     * Versicherer im Raum der Kirchen Lebensversicherung AG
     */
    public static VersichererCode Versicherer_im_Raum_der_Kirchen_Lebensversicherung_AG;
    /**
     * Hannoversche Lebensversicherung AG
     */
    public static VersichererCode Hannoversche_Lebensversicherung_AG;
    /**
     * Aioi Nissay Dowa Life Insurance of Europe Aktiengesellschaft
     */
    public static VersichererCode Aioi_Nissay_Dowa_Life_Insurance_of_Europe_Aktiengesellschaft;
    /**
     * Swiss Life Products (Luxembourg) S.A., Niederlassung für Deutschland
     */
    public static VersichererCode Swiss_Life_Products_Luxembourg_S_A_Niederlassung_f_r_Deutschland;
    /**
     * Monument Assurance Luxembourg S.A. - Niederlassung für Deutschland
     */
    public static VersichererCode Monument_Assurance_Luxembourg_S_A_Niederlassung_f_r_Deutschland;
    /**
     * INTER Lebensversicherung AG
     */
    public static VersichererCode INTER_Lebensversicherung_AG;
    /**
     * Allianz Global Life Designated Activity Company Niederlassung für Deutschland
     */
    public static VersichererCode Allianz_Global_Life_Designated_Activity_Company_Niederlassung_f_r_Deutschland;
    /**
     * Continentale Lebensversicherung AG
     */
    public static VersichererCode Continentale_Lebensversicherung_AG;
    /**
     * HAMBURGER PENSIONSKASSE VON 1905 Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode HAMBURGER_PENSIONSKASSE_VON_1905_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Phoenix Pensionskasse von 1925 Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Phoenix_Pensionskasse_von_1925_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Pensionskasse für Angestellte der Continental Aktiengesellschaft VVaG
     */
    public static VersichererCode Pensionskasse_f_r_Angestellte_der_Continental_Aktiengesellschaft_VVaG;
    /**
     * VERKA VK Kirchliche Vorsorge VVaG
     */
    public static VersichererCode VERKA_VK_Kirchliche_Vorsorge_VVaG;
    /**
     * Ruhegeld-, Witwen- und Waisenkasse d. Bergischen Elektrizitäts-Versorgungs-GmbH (VVaG) i.L.
     */
    public static VersichererCode Ruhegeld_Witwen_und_Waisenkasse_d_Bergischen_Elektrizit_ts_Versorgungs_GmbH_VVaG_i_L;
    /**
     * Bayer-Pensionskasse
     */
    public static VersichererCode Bayer_Pensionskasse;
    /**
     * Allianz Versorgungskasse Versicherungsverein a.G.
     */
    public static VersichererCode Allianz_Versorgungskasse_Versicherungsverein_a_G;
    /**
     * Versorgungskasse der Volksfürsorge VVaG
     */
    public static VersichererCode Versorgungskasse_der_Volksf_rsorge_VVaG;
    /**
     * Pensionskasse der BOGESTRA
     */
    public static VersichererCode Pensionskasse_der_BOGESTRA;
    /**
     * Ruhegeldkasse der Bremer Straßenbahn (VVaG)
     */
    public static VersichererCode Ruhegeldkasse_der_Bremer_Stra_enbahn_VVaG;
    /**
     * Versorgungskasse f. d. Angest. d. AachenMünchener Versicherung AG u.d. Generali Deutschland AG
     */
    public static VersichererCode Versorgungskasse_f_d_Angest_d_AachenM_nchener_Versicherung_AG_u_d_Generali_Deutschland_AG;
    /**
     * Versorgungskasse Deutscher Unternehmen, Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Versorgungskasse_Deutscher_Unternehmen_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Versorgungskasse der Firma M. DuMont Schauberg Expedition der Kölnischen Zeitung
     */
    public static VersichererCode Versorgungskasse_der_Firma_M_DuMont_Schauberg_Expedition_der_K_lnischen_Zeitung;
    /**
     * Pensionskasse HT Troplast Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_HT_Troplast_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Pensionskasse für die Angestellten der BARMER Ersatzkasse VVaG
     */
    public static VersichererCode Pensionskasse_f_r_die_Angestellten_der_BARMER_Ersatzkasse_VVaG;
    /**
     * MER-Pensionskasse VVaG
     */
    public static VersichererCode MER_Pensionskasse_VVaG;
    /**
     * Debeka Zusatzversorgungskasse VaG
     */
    public static VersichererCode Debeka_Zusatzversorgungskasse_VaG;
    /**
     * Müllerei-Pensionskasse Versicherungsverein a.G. (MPK)
     */
    public static VersichererCode M_llerei_Pensionskasse_Versicherungsverein_a_G_MPK;
    /**
     * Gerling Versorgungskasse
     */
    public static VersichererCode Gerling_Versorgungskasse;
    /**
     * R+V PENSIONSVERSICHERUNG a.G.
     */
    public static VersichererCode R_V_PENSIONSVERSICHERUNG_a_G;
    /**
     * Pensionskasse Berolina VVaG
     */
    public static VersichererCode Pensionskasse_Berolina_VVaG;
    /**
     * Versorgungskasse der Deutscher Herold Versicherungsgesellschaften,Versicherungsverein a.G., Köln
     */
    public static VersichererCode Versorgungskasse_der_Deutscher_Herold_Versicherungsgesellschaften_Versicherungsverein_a_G_K_ln;
    /**
     * BVV Versicherungsverein des Bankgewerbes a.G.
     */
    public static VersichererCode BVV_Versicherungsverein_des_Bankgewerbes_a_G;
    /**
     * Pensionskasse für die Deutsche Wirtschaft vormals Pensionskasse der chemischen Industrie Deutschlands
     */
    public static VersichererCode Pensionskasse_f_r_die_Deutsche_Wirtschaft_vormals_Pensionskasse_der_chemischen_Industrie_Deutschlands;
    /**
     * Pensionskasse der BERLIN-KÖLNISCHE Versicherungen
     */
    public static VersichererCode Pensionskasse_der_BERLIN_K_LNISCHE_Versicherungen;
    /**
     * Pensionskasse der Gewerkschaft Eisenhütte Westfalia i.L. , c/o Caterpillar Global Mining Europe GmbH
     */
    public static VersichererCode Pensionskasse_der_Gewerkschaft_Eisenh_tte_Westfalia_i_L_c_o_Caterpillar_Global_Mining_Europe_GmbH;
    /**
     * PENSIONSKASSE der Hamburger Hochbahn Aktiengesellschaft - VVaG -
     */
    public static VersichererCode PENSIONSKASSE_der_Hamburger_Hochbahn_Aktiengesellschaft_VVaG;
    /**
     * Versorgungskasse der Angestellten der Norddeutschen Affinerie
     */
    public static VersichererCode Versorgungskasse_der_Angestellten_der_Norddeutschen_Affinerie;
    /**
     * Pensionskasse der Lotsenbrüderschaft Elbe
     */
    public static VersichererCode Pensionskasse_der_Lotsenbr_derschaft_Elbe;
    /**
     * Pensionskasse vom Deutschen Roten Kreuz VVaG
     */
    public static VersichererCode Pensionskasse_vom_Deutschen_Roten_Kreuz_VVaG;
    /**
     * Alters- und Hinterbliebenen- Versicherung der Technischen Überwachungs-Vereine-VVaG-
     */
    public static VersichererCode Alters_und_Hinterbliebenen_Versicherung_der_Technischen_berwachungs_Vereine_VVaG;
    /**
     * Pensionskasse Schenker VVaG
     */
    public static VersichererCode Pensionskasse_Schenker_VVaG;
    /**
     * PENSIONSKASSE Deutscher Genossenschaften VVaG
     */
    public static VersichererCode PENSIONSKASSE_Deutscher_Genossenschaften_VVaG;
    /**
     * Pensionskasse SIGNAL Versicherungen VVaG
     */
    public static VersichererCode Pensionskasse_SIGNAL_Versicherungen_VVaG;
    /**
     * Philips Pensionskasse (Versicherungsverein auf Gegenseitigkeit)
     */
    public static VersichererCode Philips_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Versorgungskasse Gothaer Versicherungsbank VVaG
     */
    public static VersichererCode Versorgungskasse_Gothaer_Versicherungsbank_VVaG;
    /**
     * Pensionskasse der EDEKA Organisation V.V.a.G.
     */
    public static VersichererCode Pensionskasse_der_EDEKA_Organisation_V_V_a_G;
    /**
     * Angest.-Pensionskasse der dt. Geschäftsbetriebe der Georg Fischer Aktiengesellschaft Schaffhausen (Schweiz)
     */
    public static VersichererCode Angest_Pensionskasse_der_dt_Gesch_ftsbetriebe_der_Georg_Fischer_Aktiengesellschaft_Schaffhausen_Schweiz;
    /**
     * Münchener Rück Versorgungskasse
     */
    public static VersichererCode M_nchener_R_ck_Versorgungskasse;
    /**
     * Pensionskasse der Württembergischen
     */
    public static VersichererCode Pensionskasse_der_W_rttembergischen;
    /**
     * Grün + Bilfinger Wohlfahrts-und Pensionskasse a.G., c/o LDIS GmbH
     */
    public static VersichererCode Gr_n_Bilfinger_Wohlfahrts_und_Pensionskasse_a_G_c_o_LDIS_GmbH;
    /**
     * BASF Pensionskasse VVaG
     */
    public static VersichererCode BASF_Pensionskasse_VVaG;
    /**
     * Pensionskasse der Vereinigten Hagelversicherung VVaG
     */
    public static VersichererCode Pensionskasse_der_Vereinigten_Hagelversicherung_VVaG;
    /**
     * Pensionskasse der Bewag
     */
    public static VersichererCode Pensionskasse_der_Bewag;
    /**
     * Dresdener Pensionskasse VVaG
     */
    public static VersichererCode Dresdener_Pensionskasse_VVaG;
    /**
     * Pensionskasse Degussa Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_Degussa_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Versorgungskasse der Arbeiter und Angestellten der ehemaligen Großkraftwerk Franken AG i.L.
     */
    public static VersichererCode Versorgungskasse_der_Arbeiter_und_Angestellten_der_ehemaligen_Gro_kraftwerk_Franken_AG_i_L;
    /**
     * Geno Pensionskasse VVaG, Karlsruhe
     */
    public static VersichererCode Geno_Pensionskasse_VVaG_Karlsruhe;
    /**
     * Glatfelter Gernsbach Pensionskasse  VVaG
     */
    public static VersichererCode Glatfelter_Gernsbach_Pensionskasse_VVaG;
    /**
     * Pensionskasse Konzern Versicherungskammer Bayern VVaG
     */
    public static VersichererCode Pensionskasse_Konzern_Versicherungskammer_Bayern_VVaG;
    /**
     * Pensionskasse der Wacker Chemie Versicherungsverein a.G.
     */
    public static VersichererCode Pensionskasse_der_Wacker_Chemie_Versicherungsverein_a_G;
    /**
     * Pensionskasse der HypoVereinsbank
     */
    public static VersichererCode Pensionskasse_der_HypoVereinsbank;
    /**
     * Pensionskasse Maxhütte VVaG
     */
    public static VersichererCode Pensionskasse_Maxh_tte_VVaG;
    /**
     * Rentenzuschusskasse der N-ERGIE Aktiengesellschaft Nürnberg
     */
    public static VersichererCode Rentenzuschusskasse_der_N_ERGIE_Aktiengesellschaft_N_rnberg;
    /**
     * Betriebspensionskasse der Firma Carl Schenck AG VVaG Darmstadt
     */
    public static VersichererCode Betriebspensionskasse_der_Firma_Carl_Schenck_AG_VVaG_Darmstadt;
    /**
     * Pensionskasse der Frankfurter Sparkasse
     */
    public static VersichererCode Pensionskasse_der_Frankfurter_Sparkasse;
    /**
     * HEAG Pensionszuschusskasse Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode HEAG_Pensionszuschusskasse_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Versorgungskasse der Angestellten der GEA Group Aktiengesellschaft VVaG
     */
    public static VersichererCode Versorgungskasse_der_Angestellten_der_GEA_Group_Aktiengesellschaft_VVaG;
    /**
     * Pensionskasse der Caritas VVaG
     */
    public static VersichererCode Pensionskasse_der_Caritas_VVaG;
    /**
     * Pensionskasse der Novartis Pharma GmbH in Nürnberg Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_der_Novartis_Pharma_GmbH_in_N_rnberg_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Versorgungskasse Radio Bremen
     */
    public static VersichererCode Versorgungskasse_Radio_Bremen;
    /**
     * Pensionskasse der Wasserwirtschaftlichen Verbände Essen VVaG
     */
    public static VersichererCode Pensionskasse_der_Wasserwirtschaftlichen_Verb_nde_Essen_VVaG;
    /**
     * Pensionskasse der BHW Bausparkasse
     */
    public static VersichererCode Pensionskasse_der_BHW_Bausparkasse;
    /**
     * Versorgungskasse der ehemaligen Bayernwerk AG, Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Versorgungskasse_der_ehemaligen_Bayernwerk_AG_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Babcock Pensionskasse VVaG
     */
    public static VersichererCode Babcock_Pensionskasse_VVaG;
    /**
     * Audi Pensionskasse-Altersversorgung der AUTO UNION GmbH, Versicherungsverein auf Gegenseitigk. (VVaG) Ingolst./Donau i.L.
     */
    public static VersichererCode Audi_Pensionskasse_Altersversorgung_der_AUTO_UNION_GmbH_Versicherungsverein_auf_Gegenseitigk_VVaG_Ingolst_Donau_i_L;
    /**
     * Zusatzversorgungskasse des Baugewerbes AG
     */
    public static VersichererCode Zusatzversorgungskasse_des_Baugewerbes_AG;
    /**
     * VLAK VVaG Hannover
     */
    public static VersichererCode VLAK_VVaG_Hannover;
    /**
     * NESTLÉ PENSIONSKASSE
     */
    public static VersichererCode NESTL_PENSIONSKASSE;
    /**
     * Pensionskasse der Mitarbeiter der ehemaligen Frankona Rückversicherungs-AG V.V.a.G.
     */
    public static VersichererCode Pensionskasse_der_Mitarbeiter_der_ehemaligen_Frankona_R_ckversicherungs_AG_V_V_a_G;
    /**
     * Zusatzversorgungskasse des Dachdeckerhandwerks VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_des_Dachdeckerhandwerks_VVaG;
    /**
     * Deutsche Steuerberater-Versicherung - Pensionskasse des steuerberatenden Berufs VVaG
     */
    public static VersichererCode Deutsche_Steuerberater_Versicherung_Pensionskasse_des_steuerberatenden_Berufs_VVaG;
    /**
     * PENSIONSKASSE DER CREOS UND ENOVOS DEUTSCHLAND VVAG
     */
    public static VersichererCode PENSIONSKASSE_DER_CREOS_UND_ENOVOS_DEUTSCHLAND_VVAG;
    /**
     * Pensionskasse der Schülke &amp; Mayr GmbH V.V.a.G. c/o Aon Solutions Germany GmbH
     */
    public static VersichererCode Pensionskasse_der_Sch_lke_Mayr_GmbH_V_V_a_G_c_o_Aon_Solutions_Germany_GmbH;
    /**
     * Zusatzversorgungskasse des Steinmetz- und Steinbildhauerhandwerks VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_des_Steinmetz_und_Steinbildhauerhandwerks_VVaG;
    /**
     * Pensionskasse der Genossenschaftsorganisation Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_der_Genossenschaftsorganisation_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Zusatzversorgungskasse für die Beschäftigten der Deutschen Brot- und Backwarenindustrie VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_f_r_die_Besch_ftigten_der_Deutschen_Brot_und_Backwarenindustrie_VVaG;
    /**
     * Zusatzversorgungskasse für die Beschäftigten des Deutschen Bäckerhandwerks VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_f_r_die_Besch_ftigten_des_Deutschen_B_ckerhandwerks_VVaG;
    /**
     * Zusatzversorgungskasse der Steine- und Erden-Industrie u. des Betonsteinhandwerks VVaG Die Bayerische Pensionskasse
     */
    public static VersichererCode Zusatzversorgungskasse_der_Steine_und_Erden_Industrie_u_des_Betonsteinhandwerks_VVaG_Die_Bayerische_Pensionskasse;
    /**
     * Pensionskasse der HELVETIA Schweizerische Versicherungsgesellschaft, Direktion für Deutschland
     */
    public static VersichererCode Pensionskasse_der_HELVETIA_Schweizerische_Versicherungsgesellschaft_Direktion_f_r_Deutschland;
    /**
     * Pensionskasse Rundfunk
     */
    public static VersichererCode Pensionskasse_Rundfunk;
    /**
     * PENSIONSKASSE PEUGEOT DEUTSCHLAND VVaG
     */
    public static VersichererCode PENSIONSKASSE_PEUGEOT_DEUTSCHLAND_VVaG;
    /**
     * Pensionskasse für die Arbeitnehmerinnen und Arbeitnehmer des ZDF Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_f_r_die_Arbeitnehmerinnen_und_Arbeitnehmer_des_ZDF_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Pensionskasse des BDH Bundesverband Rehabilitation, VVaG
     */
    public static VersichererCode Pensionskasse_des_BDH_Bundesverband_Rehabilitation_VVaG;
    /**
     * Pensionskasse der Rechtsanwälte und Notare VVaG
     */
    public static VersichererCode Pensionskasse_der_Rechtsanw_lte_und_Notare_VVaG;
    /**
     * Pensionskasse der VHV-Versicherungen
     */
    public static VersichererCode Pensionskasse_der_VHV_Versicherungen;
    /**
     * Zusatzversorgungskasse des Maler- und Lackiererhandwerks VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_des_Maler_und_Lackiererhandwerks_VVaG;
    /**
     * IBM Deutschland Pensionskasse Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode IBM_Deutschland_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Zusatzversorgungskasse des Gerüstbaugewerbes VVaG
     */
    public static VersichererCode Zusatzversorgungskasse_des_Ger_stbaugewerbes_VVaG;
    /**
     * Pensionskasse Dynamit Nobel Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensionskasse_Dynamit_Nobel_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * NESTLÉ RÜCKDECKUNGSKASSE
     */
    public static VersichererCode NESTL_R_CKDECKUNGSKASSE;
    /**
     * Hannoversche Pensionskasse VVaG
     */
    public static VersichererCode Hannoversche_Pensionskasse_VVaG;
    /**
     * HAMBURGER PENSIONSRÜCKDECKUNGSKASSE  Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode HAMBURGER_PENSIONSR_CKDECKUNGSKASSE_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Hannoversche Alterskasse VVaG
     */
    public static VersichererCode Hannoversche_Alterskasse_VVaG;
    /**
     * Höchster Pensionskasse VVaG
     */
    public static VersichererCode H_chster_Pensionskasse_VVaG;
    /**
     * Baden-Badener Pensionskasse VVaG
     */
    public static VersichererCode Baden_Badener_Pensionskasse_VVaG;
    /**
     * SIGNAL IDUNA Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode SIGNAL_IDUNA_Pensionskasse_Aktiengesellschaft;
    /**
     * Zusatzversorgungswerk für Arbeitnehmer in der Land- und Forstwirtschaft - ZLF VVaG
     */
    public static VersichererCode Zusatzversorgungswerk_f_r_Arbeitnehmer_in_der_Land_und_Forstwirtschaft_ZLF_VVaG;
    /**
     * Kölner Pensionskasse Versicherungsverein auf Gegenseitigkeit i.L.
     */
    public static VersichererCode K_lner_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit_i_L;
    /**
     * Gothaer Pensionskasse AG
     */
    public static VersichererCode Gothaer_Pensionskasse_AG;
    /**
     * Debeka Pensionskasse AG
     */
    public static VersichererCode Debeka_Pensionskasse_AG;
    /**
     * Pro bAV Pensionskasse AG
     */
    public static VersichererCode Pro_bAV_Pensionskasse_AG;
    /**
     * ERGO Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode ERGO_Pensionskasse_Aktiengesellschaft;
    /**
     * neue leben Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode neue_leben_Pensionskasse_Aktiengesellschaft;
    /**
     * Sparkassen Pensionskasse AG
     */
    public static VersichererCode Sparkassen_Pensionskasse_AG;
    /**
     * DPK Deutsche Pensionskasse AG
     */
    public static VersichererCode DPK_Deutsche_Pensionskasse_AG;
    /**
     * Allgemeine Rentenanstalt Pensionskasse AG
     */
    public static VersichererCode Allgemeine_Rentenanstalt_Pensionskasse_AG;
    /**
     * Provinzial Pensionskasse Hannover AG
     */
    public static VersichererCode Provinzial_Pensionskasse_Hannover_AG;
    /**
     * Swiss Life Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode Swiss_Life_Pensionskasse_Aktiengesellschaft;
    /**
     * HDI Pensionskasse AG
     */
    public static VersichererCode HDI_Pensionskasse_AG;
    /**
     * ALTE LEIPZIGER Pensionskasse AG
     */
    public static VersichererCode ALTE_LEIPZIGER_Pensionskasse_AG;
    /**
     * Versicherungskammer Bayern Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode Versicherungskammer_Bayern_Pensionskasse_Aktiengesellschaft;
    /**
     * NÜRNBERGER Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode N_RNBERGER_Pensionskasse_Aktiengesellschaft;
    /**
     * Athora Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode Athora_Pensionskasse_Aktiengesellschaft;
    /**
     * Zentrales Versorgungswerk für das Dachdeckerhandwerk VVaG
     */
    public static VersichererCode Zentrales_Versorgungswerk_f_r_das_Dachdeckerhandwerk_VVaG;
    /**
     * Rheinische Pensionskasse
     */
    public static VersichererCode Rheinische_Pensionskasse;
    /**
     * Versorgungsanstalt des Bundes und der Länder
     */
    public static VersichererCode Versorgungsanstalt_des_Bundes_und_der_L_nder;
    /**
     * R+V PENSIONSKASSE AKTIENGESELLSCHAFT
     */
    public static VersichererCode R_V_PENSIONSKASSE_AKTIENGESELLSCHAFT;
    /**
     * Wuppertaler Pensionskasse VVaG
     */
    public static VersichererCode Wuppertaler_Pensionskasse_VVaG;
    /**
     * Versorgungsausgleichskasse Pensionskasse VVaG
     */
    public static VersichererCode Versorgungsausgleichskasse_Pensionskasse_VVaG;
    /**
     * KölnVorsorge-Sterbeversicherung VVaG
     */
    public static VersichererCode K_lnVorsorge_Sterbeversicherung_VVaG;
    /**
     * Sterbekasse Evangelischer Freikirchen VVaG
     */
    public static VersichererCode Sterbekasse_Evangelischer_Freikirchen_VVaG;
    /**
     * Sterbekasse für die Angestellten der Deutsche Bank Gruppe
     */
    public static VersichererCode Sterbekasse_f_r_die_Angestellten_der_Deutsche_Bank_Gruppe;
    /**
     * Bayer Beistandskasse
     */
    public static VersichererCode Bayer_Beistandskasse;
    /**
     * Höchster Sterbekasse VVaG
     */
    public static VersichererCode H_chster_Sterbekasse_VVaG;
    /**
     * Vorsorgekasse der Commerzbank Versicherungsverein a.G.
     */
    public static VersichererCode Vorsorgekasse_der_Commerzbank_Versicherungsverein_a_G;
    /**
     * Hilfskasse BVG
     */
    public static VersichererCode Hilfskasse_BVG;
    /**
     * BASF Sterbekasse VVaG
     */
    public static VersichererCode BASF_Sterbekasse_VVaG;
    /**
     * GE.BE.IN Versicherungen Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode GE_BE_IN_Versicherungen_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Sterbe-Unterstützungs-Vereinigung der Beschäftigten der Stadt München
     */
    public static VersichererCode Sterbe_Unterst_tzungs_Vereinigung_der_Besch_ftigten_der_Stadt_M_nchen;
    /**
     * Erste Kieler Beerdigungskasse
     */
    public static VersichererCode Erste_Kieler_Beerdigungskasse;
    /**
     * Versicherungsverein Rasselstein
     */
    public static VersichererCode Versicherungsverein_Rasselstein;
    /**
     * SOLIDAR Versicherungsgemeinschaft Sterbegeldversicherung VVaG
     */
    public static VersichererCode SOLIDAR_Versicherungsgemeinschaft_Sterbegeldversicherung_VVaG;
    /**
     * Sterbekasse der Bediensteten der Stadtverwaltung Dortmund
     */
    public static VersichererCode Sterbekasse_der_Bediensteten_der_Stadtverwaltung_Dortmund;
    /**
     * Feuerbestattungsverein VVaG
     */
    public static VersichererCode Feuerbestattungsverein_VVaG;
    /**
     * Hinterbliebenenkasse der Heilberufe HDH Versicherungsverein a.G. in München
     */
    public static VersichererCode Hinterbliebenenkasse_der_Heilberufe_HDH_Versicherungsverein_a_G_in_M_nchen;
    /**
     * SONO Sterbegeld VVaG
     */
    public static VersichererCode SONO_Sterbegeld_VVaG;
    /**
     * Vorsorgekasse Hoesch Dortmund Sterbegeldversicherung VVaG
     */
    public static VersichererCode Vorsorgekasse_Hoesch_Dortmund_Sterbegeldversicherung_VVaG;
    /**
     * Sterbekasse der Belegschaft der Saarstahl AG Völklingen, Werk Völklingen und Werk Burbach
     */
    public static VersichererCode Sterbekasse_der_Belegschaft_der_Saarstahl_AG_V_lklingen_Werk_V_lklingen_und_Werk_Burbach;
    /**
     * Sterbekasse der Saarbergleute VVaG
     */
    public static VersichererCode Sterbekasse_der_Saarbergleute_VVaG;
    /**
     * Bochumer Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Bochumer_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Fürsorgekasse von 1908 vormals Sterbekasse der Neuapostolischen Kirche des Landes Nordrhein-Westfalen
     */
    public static VersichererCode F_rsorgekasse_von_1908_vormals_Sterbekasse_der_Neuapostolischen_Kirche_des_Landes_Nordrhein_Westfalen;
    /**
     * Sterbekasse Sozialversicherung- gegr. in der LVA Rheinprovinz - Düsseldorf
     */
    public static VersichererCode Sterbekasse_Sozialversicherung_gegr_in_der_LVA_Rheinprovinz_D_sseldorf;
    /**
     * IDEAL Sterbekasse Lebensversicherung AG
     */
    public static VersichererCode IDEAL_Sterbekasse_Lebensversicherung_AG;
    /**
     * Sterbekasse der Feuerwehren, Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Sterbekasse_der_Feuerwehren_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Generali Pensionsfonds AG
     */
    public static VersichererCode Generali_Pensionsfonds_AG;
    /**
     * CHEMIE Pensionsfonds AG
     */
    public static VersichererCode CHEMIE_Pensionsfonds_AG;
    /**
     * Telekom-Pensionsfonds a.G.
     */
    public static VersichererCode Telekom_Pensionsfonds_a_G;
    /**
     * Deutscher Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode Deutscher_Pensionsfonds_Aktiengesellschaft;
    /**
     * Allianz Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode Allianz_Pensionsfonds_Aktiengesellschaft;
    /**
     * VIFA Pensionsfonds AG
     */
    public static VersichererCode VIFA_Pensionsfonds_AG;
    /**
     * R+V Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode R_V_Pensionsfonds_Aktiengesellschaft;
    /**
     * LVM Pensionsfonds-AG
     */
    public static VersichererCode LVM_Pensionsfonds_AG;
    /**
     * Bosch Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode Bosch_Pensionsfonds_Aktiengesellschaft;
    /**
     * Swiss Life Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode Swiss_Life_Pensionsfonds_Aktiengesellschaft;
    /**
     * WWK Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode WWK_Pensionsfonds_Aktiengesellschaft;
    /**
     * VdW Pensionsfonds AG
     */
    public static VersichererCode VdW_Pensionsfonds_AG;
    /**
     * ALTE LEIPZIGER Pensionsfonds AG
     */
    public static VersichererCode ALTE_LEIPZIGER_Pensionsfonds_AG;
    /**
     * Lippische Pensionsfonds AG
     */
    public static VersichererCode Lippische_Pensionsfonds_AG;
    /**
     * ERGO Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode ERGO_Pensionsfonds_Aktiengesellschaft;
    /**
     * Metzler Mittelstands Pensionsfonds AG
     */
    public static VersichererCode Metzler_Mittelstands_Pensionsfonds_AG;
    /**
     * Siemens Pensionsfonds AG
     */
    public static VersichererCode Siemens_Pensionsfonds_AG;
    /**
     * RWE Pensionsfonds AG
     */
    public static VersichererCode RWE_Pensionsfonds_AG;
    /**
     * BVV Pensionsfonds des Bankgewerbes AG
     */
    public static VersichererCode BVV_Pensionsfonds_des_Bankgewerbes_AG;
    /**
     * Nestlé Pensionsfonds AG
     */
    public static VersichererCode Nestl_Pensionsfonds_AG;
    /**
     * HVB Trust Pensionsfonds AG
     */
    public static VersichererCode HVB_Trust_Pensionsfonds_AG;
    /**
     * Deutsche Post Pensionsfonds AG
     */
    public static VersichererCode Deutsche_Post_Pensionsfonds_AG;
    /**
     * IBM Deutschland Pensionsfonds AG
     */
    public static VersichererCode IBM_Deutschland_Pensionsfonds_AG;
    /**
     * SIGNAL IDUNA Krankenversicherung a.G.
     */
    public static VersichererCode SIGNAL_IDUNA_Krankenversicherung_a_G;
    /**
     * ALTE OLDENBURGER Krankenversicherung von 1927 Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode ALTE_OLDENBURGER_Krankenversicherung_von_1927_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Landeskrankenhilfe V.V.a.G.
     */
    public static VersichererCode Landeskrankenhilfe_V_V_a_G;
    /**
     * HanseMerkur Krankenversicherung auf Gegenseitigkeit
     */
    public static VersichererCode HanseMerkur_Krankenversicherung_auf_Gegenseitigkeit;
    /**
     * MÜNCHENER VEREIN Krankenversicherung a.G.
     */
    public static VersichererCode M_NCHENER_VEREIN_Krankenversicherung_a_G;
    /**
     * Süddeutsche Krankenversicherung a.G.
     */
    public static VersichererCode S_ddeutsche_Krankenversicherung_a_G;
    /**
     * Hallesche Krankenversicherung auf Gegenseitigkeit
     */
    public static VersichererCode Hallesche_Krankenversicherung_auf_Gegenseitigkeit;
    /**
     * uniVersa Krankenversicherung a.G.
     */
    public static VersichererCode uniVersa_Krankenversicherung_a_G;
    /**
     * LIGA Krankenversicherung katholischer Priester Versicherungsverein auf Gegenseitigkeit Regensburg
     */
    public static VersichererCode LIGA_Krankenversicherung_katholischer_Priester_Versicherungsverein_auf_Gegenseitigkeit_Regensburg;
    /**
     * praenatura Versicherungsverein auf Gegenseitigkeit (VVaG)
     */
    public static VersichererCode praenatura_Versicherungsverein_auf_Gegenseitigkeit_VVaG;
    /**
     * SONO Krankenversicherung a.G.
     */
    public static VersichererCode SONO_Krankenversicherung_a_G;
    /**
     * AXA Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode AXA_Krankenversicherung_Aktiengesellschaft;
    /**
     * Lohnfortzahlungskasse Leer VVaG
     */
    public static VersichererCode Lohnfortzahlungskasse_Leer_VVaG;
    /**
     * Lohnfortzahlungskasse Aurich VVaG i.L.
     */
    public static VersichererCode Lohnfortzahlungskasse_Aurich_VVaG_i_L;
    /**
     * Krankenunterstützungskasse Hannover i.L.
     */
    public static VersichererCode Krankenunterst_tzungskasse_Hannover_i_L;
    /**
     * St. Martinus Priesterverein der Diözese Rottenburg-Stuttgart- Kranken- und Sterbekasse (KSK) - Versicherungsverein auf Gegenseitigkeit (VVaG) i.L.
     */
    public static VersichererCode St_Martinus_Priesterverein_der_Di_zese_Rottenburg_Stuttgart_Kranken_und_Sterbekasse_KSK_Versicherungsverein_auf_Gegenseitigkeit_VVaG_i_L;
    /**
     * UNION KRANKENVERSICHERUNG AKTIENGESELLSCHAFT
     */
    public static VersichererCode UNION_KRANKENVERSICHERUNG_AKTIENGESELLSCHAFT;
    /**
     * LVM Krankenversicherungs-AG
     */
    public static VersichererCode LVM_Krankenversicherungs_AG;
    /**
     * ARAG Krankenversicherungs-Aktiengesellschaft
     */
    public static VersichererCode ARAG_Krankenversicherungs_Aktiengesellschaft;
    /**
     * vigo Krankenversicherung VVaG
     */
    public static VersichererCode vigo_Krankenversicherung_VVaG;
    /**
     * R+V Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode R_V_Krankenversicherung_Aktiengesellschaft;
    /**
     * HUK-COBURG-Krankenversicherung AG
     */
    public static VersichererCode HUK_COBURG_Krankenversicherung_AG;
    /**
     * Concordia Krankenversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Concordia_Krankenversicherungs_Aktiengesellschaft;
    /**
     * ENVIVAS Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode ENVIVAS_Krankenversicherung_Aktiengesellschaft;
    /**
     * HanseMerkur Speziale Krankenversicherung AG
     */
    public static VersichererCode HanseMerkur_Speziale_Krankenversicherung_AG;
    /**
     * NÜRNBERGER Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode N_RNBERGER_Krankenversicherung_Aktiengesellschaft;
    /**
     * ERGO Krankenversicherung AG
     */
    public static VersichererCode ERGO_Krankenversicherung_AG;
    /**
     * Augenoptiker Ausgleichskasse VVaG (AKA)
     */
    public static VersichererCode Augenoptiker_Ausgleichskasse_VVaG_AKA;
    /**
     * DEVK Krankenversicherungs-Aktiengesellschaft
     */
    public static VersichererCode DEVK_Krankenversicherungs_Aktiengesellschaft;
    /**
     * Bayerische Beamtenkrankenkasse Aktiengesellschaft
     */
    public static VersichererCode Bayerische_Beamtenkrankenkasse_Aktiengesellschaft;
    /**
     * Provinzial Krankenversicherung Hannover AG
     */
    public static VersichererCode Provinzial_Krankenversicherung_Hannover_AG;
    /**
     * Württembergische Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode W_rttembergische_Krankenversicherung_Aktiengesellschaft;
    /**
     * Mecklenburgische Krankenversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Mecklenburgische_Krankenversicherungs_Aktiengesellschaft;
    /**
     * Versicherer im Raum der Kirchen Krankenversicherung AG
     */
    public static VersichererCode Versicherer_im_Raum_der_Kirchen_Krankenversicherung_AG;
    /**
     * HanseMerkur Krankenversicherung AG
     */
    public static VersichererCode HanseMerkur_Krankenversicherung_AG;
    /**
     * CONSTANTIA Versicherungen a.G.
     */
    public static VersichererCode CONSTANTIA_Versicherungen_a_G;
    /**
     * SHB Allgemeine Versicherung VVaG
     */
    public static VersichererCode SHB_Allgemeine_Versicherung_VVaG;
    /**
     * Hamburger Beamten-Feuer-und Einbruchskasse
     */
    public static VersichererCode Hamburger_Beamten_Feuer_und_Einbruchskasse;
    /**
     * Hamburger Lehrer-Feuerkasse
     */
    public static VersichererCode Hamburger_Lehrer_Feuerkasse;
    /**
     * Lehrer-Feuerversicherungsverein a.G. für Schleswig-Holstein, Hamburg und Mecklenburg-Vorpommern
     */
    public static VersichererCode Lehrer_Feuerversicherungsverein_a_G_f_r_Schleswig_Holstein_Hamburg_und_Mecklenburg_Vorpommern;
    /**
     * Neuendorfer Brand-Bau-Gilde
     */
    public static VersichererCode Neuendorfer_Brand_Bau_Gilde;
    /**
     * NV-Versicherungen VVaG
     */
    public static VersichererCode NV_Versicherungen_VVaG;
    /**
     * Nordhemmer Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Nordhemmer_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Ostangler Brandgilde, Versicherungsverein auf Gegenseitigkeit (VVaG)
     */
    public static VersichererCode Ostangler_Brandgilde_Versicherungsverein_auf_Gegenseitigkeit_VVaG;
    /**
     * Schutzverein Deutscher Rheder V.a.G.
     */
    public static VersichererCode Schutzverein_Deutscher_Rheder_V_a_G;
    /**
     * Feuersozietät Berlin Brandenburg Versicherung Aktiengesellschaft
     */
    public static VersichererCode Feuersoziet_t_Berlin_Brandenburg_Versicherung_Aktiengesellschaft;
    /**
     * Liberty Mutual Insurance Europe SE Direktion für Deutschland
     */
    public static VersichererCode Liberty_Mutual_Insurance_Europe_SE_Direktion_f_r_Deutschland;
    /**
     * Aioi Nissay Dowa Insurance Company of Europe SE, Niederlassung Deutschland
     */
    public static VersichererCode Aioi_Nissay_Dowa_Insurance_Company_of_Europe_SE_Niederlassung_Deutschland;
    /**
     * Freeyou Insurance AG
     */
    public static VersichererCode Freeyou_Insurance_AG;
    /**
     * AGILA Haustierversicherung Aktiengesellschaft
     */
    public static VersichererCode AGILA_Haustierversicherung_Aktiengesellschaft;
    /**
     * SV SparkassenVersicherung Gebäudeversicherung Aktiengesellschaft
     */
    public static VersichererCode SV_SparkassenVersicherung_Geb_udeversicherung_Aktiengesellschaft;
    /**
     * Euro-Aviation Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Euro_Aviation_Versicherungs_Aktiengesellschaft;
    /**
     * Bayerische Landesbrandversicherung Aktiengesellschaft
     */
    public static VersichererCode Bayerische_Landesbrandversicherung_Aktiengesellschaft;
    /**
     * Haftpflichtgemeinschaft Deutscher Nahverkehrs- und Versorgungsunternehmen Allgemein (HDNA) VVaG
     */
    public static VersichererCode Haftpflichtgemeinschaft_Deutscher_Nahverkehrs_und_Versorgungsunternehmen_Allgemein_HDNA_VVaG;
    /**
     * Verti Versicherung AG
     */
    public static VersichererCode Verti_Versicherung_AG;
    /**
     * Cardif Allgemeine Versicherung Zweigniederlassung für Deutschland der Cardif-Assurances Risques Divers
     */
    public static VersichererCode Cardif_Allgemeine_Versicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurances_Risques_Divers;
    /**
     * Interlloyd Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Interlloyd_Versicherungs_Aktiengesellschaft;
    /**
     * KRAVAG-ALLGEMEINE Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode KRAVAG_ALLGEMEINE_Versicherungs_Aktiengesellschaft;
    /**
     * Mannheimer Versicherung Aktiengesellschaft
     */
    public static VersichererCode Mannheimer_Versicherung_Aktiengesellschaft;
    /**
     * AMMERLÄNDER VERSICHERUNG Versicherungsverein a.G. (VVaG)
     */
    public static VersichererCode AMMERL_NDER_VERSICHERUNG_Versicherungsverein_a_G_VVaG;
    /**
     * nexible Versicherung AG
     */
    public static VersichererCode nexible_Versicherung_AG;
    /**
     * If Schadenversicherung AG Direktion für Deutschland
     */
    public static VersichererCode If_Schadenversicherung_AG_Direktion_f_r_Deutschland;
    /**
     * Janitos Versicherung Aktiengesellschaft
     */
    public static VersichererCode Janitos_Versicherung_Aktiengesellschaft;
    /**
     * KRAVAG-LOGISTIC Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode KRAVAG_LOGISTIC_Versicherungs_Aktiengesellschaft;
    /**
     * Waldenburger Versicherung Aktiengesellschaft
     */
    public static VersichererCode Waldenburger_Versicherung_Aktiengesellschaft;
    /**
     * BVAG Berliner Versicherung Aktiengesellschaft
     */
    public static VersichererCode BVAG_Berliner_Versicherung_Aktiengesellschaft;
    /**
     * HDI Versicherung AG
     */
    public static VersichererCode HDI_Versicherung_AG;
    /**
     * HUK24 AG
     */
    public static VersichererCode HUK24_AG;
    /**
     * XL Insurance Company SE Direktion für Deutschland
     */
    public static VersichererCode XL_Insurance_Company_SE_Direktion_f_r_Deutschland;
    /**
     * Union Reiseversicherung Aktiengesellschaft
     */
    public static VersichererCode Union_Reiseversicherung_Aktiengesellschaft;
    /**
     * Provinzial Versicherung Aktiengesellschaft
     */
    public static VersichererCode Provinzial_Versicherung_Aktiengesellschaft;
    /**
     * HDI Global SE
     */
    public static VersichererCode HDI_Global_SE;
    /**
     * Versicherer im Raum der Kirchen Sachversicherung AG
     */
    public static VersichererCode Versicherer_im_Raum_der_Kirchen_Sachversicherung_AG;
    /**
     * VRK Versicherungsverein auf Gegenseitigkeit im Raum der Kirchen
     */
    public static VersichererCode VRK_Versicherungsverein_auf_Gegenseitigkeit_im_Raum_der_Kirchen;
    /**
     * EUROMAF Assurance des Ingénieurs et Architectes Européens Zweigniederlassung Düsseldorf
     */
    public static VersichererCode EUROMAF_Assurance_des_Ing_nieurs_et_Architectes_Europ_ens_Zweigniederlassung_D_sseldorf;
    /**
     * Rhion Versicherung Aktiengesellschaft
     */
    public static VersichererCode Rhion_Versicherung_Aktiengesellschaft;
    /**
     * SIGNAL IDUNA Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode SIGNAL_IDUNA_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * Hübener Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode H_bener_Versicherungs_Aktiengesellschaft;
    /**
     * SOGECAP S.A. Deutsche Niederlassung
     */
    public static VersichererCode SOGECAP_S_A_Deutsche_Niederlassung;
    /**
     * DFV Deutsche Familienversicherung AG
     */
    public static VersichererCode DFV_Deutsche_Familienversicherung_AG;
    /**
     * CREDENDO - Guarantees &amp; Speciality Risks SA/NV, Zweigniederlassung Deutschland
     */
    public static VersichererCode CREDENDO_Guarantees_Speciality_Risks_SA_NV_Zweigniederlassung_Deutschland;
    /**
     * ADAC Autoversicherung AG
     */
    public static VersichererCode ADAC_Autoversicherung_AG;
    /**
     * Swiss Re International SE Niederlassung Deutschland
     */
    public static VersichererCode Swiss_Re_International_SE_Niederlassung_Deutschland;
    /**
     * CHUBB Life Europe SE, Direktion für Deutschland
     */
    public static VersichererCode CHUBB_Life_Europe_SE_Direktion_f_r_Deutschland;
    /**
     * Oberösterreichische Versicherung AG
     */
    public static VersichererCode Ober_sterreichische_Versicherung_AG;
    /**
     * East-West Assekuranz AG
     */
    public static VersichererCode East_West_Assekuranz_AG;
    /**
     * MELES Insurance A/S Niederlassung Deutschland
     */
    public static VersichererCode MELES_Insurance_A_S_Niederlassung_Deutschland;
    /**
     * Credendo - Trade Credit Insurance SA/NV Zweigniederlassung Deutschland
     */
    public static VersichererCode Credendo_Trade_Credit_Insurance_SA_NV_Zweigniederlassung_Deutschland;
    /**
     * Balcia Insurance SE Niederlassung Deutschland
     */
    public static VersichererCode Balcia_Insurance_SE_Niederlassung_Deutschland;
    /**
     * BGV-Versicherung Aktiengesellschaft
     */
    public static VersichererCode BGV_Versicherung_Aktiengesellschaft;
    /**
     * ProTect Versicherung AG
     */
    public static VersichererCode ProTect_Versicherung_AG;
    /**
     * Zurich Insurance Europe AG
     */
    public static VersichererCode Zurich_Insurance_Europe_AG;
    /**
     * Volkswagen Versicherung Aktiengesellschaft
     */
    public static VersichererCode Volkswagen_Versicherung_Aktiengesellschaft;
    /**
     * AXA easy Versicherung AG
     */
    public static VersichererCode AXA_easy_Versicherung_AG;
    /**
     * Deutsche Assistance Versicherung Aktiengesellschaft
     */
    public static VersichererCode Deutsche_Assistance_Versicherung_Aktiengesellschaft;
    /**
     * TELEFONICA SEGUROS Y REASEGUROS COMPAÑÍA ASEGURADORA SAU, Niederlassung Deutschland
     */
    public static VersichererCode TELEFONICA_SEGUROS_Y_REASEGUROS_COMPA_A_ASEGURADORA_SAU_Niederlassung_Deutschland;
    /**
     * Allcura Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allcura_Versicherungs_Aktiengesellschaft;
    /**
     * BA die Bayerische Allgemeine Versicherung AG
     */
    public static VersichererCode BA_die_Bayerische_Allgemeine_Versicherung_AG;
    /**
     * Badischer Gemeinde-Versicherungs-Verband
     */
    public static VersichererCode Badischer_Gemeinde_Versicherungs_Verband;
    /**
     * Barmenia Allgemeine Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Barmenia_Allgemeine_Versicherungs_Aktiengesellschaft;
    /**
     * Bayerischer Versicherungsverband Versicherungsaktiengesellschaft
     */
    public static VersichererCode Bayerischer_Versicherungsverband_Versicherungsaktiengesellschaft;
    /**
     * Bergische Brandversicherung Allgemeine Feuerversicherung V.a.G.
     */
    public static VersichererCode Bergische_Brandversicherung_Allgemeine_Feuerversicherung_V_a_G;
    /**
     * DOCURA VVaG
     */
    public static VersichererCode DOCURA_VVaG;
    /**
     * MVK Versicherung VVaG
     */
    public static VersichererCode MVK_Versicherung_VVaG;
    /**
     * Concordia Versicherungs-Gesellschaft auf Gegenseitigkeit
     */
    public static VersichererCode Concordia_Versicherungs_Gesellschaft_auf_Gegenseitigkeit;
    /**
     * Continentale Sachversicherung Aktiengesellschaft
     */
    public static VersichererCode Continentale_Sachversicherung_Aktiengesellschaft;
    /**
     * DA Deutsche Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode DA_Deutsche_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * DEVK Deutsche Eisenbahn Versicherung Sach- und HUK-Versicherungsverein a.G. Betriebliche Sozialeinrichtung der Deutschen Bahn
     */
    public static VersichererCode DEVK_Deutsche_Eisenbahn_Versicherung_Sach_und_HUK_Versicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn;
    /**
     * Gartenbau-Versicherung VVaG
     */
    public static VersichererCode Gartenbau_Versicherung_VVaG;
    /**
     * Vereinigte Tierversicherung, Gesellschaft auf Gegenseitigkeit
     */
    public static VersichererCode Vereinigte_Tierversicherung_Gesellschaft_auf_Gegenseitigkeit;
    /**
     * ERGO Reiseversicherung AG
     */
    public static VersichererCode ERGO_Reiseversicherung_AG;
    /**
     * Feuer- und Einbruchschadenkasse der BBBank in Karlsruhe, Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Feuer_und_Einbruchschadenkasse_der_BBBank_in_Karlsruhe_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * GVO Gegenseitigkeit Versicherung Oldenburg VVaG
     */
    public static VersichererCode GVO_Gegenseitigkeit_Versicherung_Oldenburg_VVaG;
    /**
     * Gemeinnützige Haftpflichtversicherungsanstalt Kassel
     */
    public static VersichererCode Gemeinn_tzige_Haftpflichtversicherungsanstalt_Kassel;
    /**
     * Allianz Global Corporate &amp; Specialty SE
     */
    public static VersichererCode Allianz_Global_Corporate_Specialty_SE;
    /**
     * Gothaer Versicherungsbank VVaG
     */
    public static VersichererCode Gothaer_Versicherungsbank_VVaG;
    /**
     * Die Haftpflichtkasse VVaG
     */
    public static VersichererCode Die_Haftpflichtkasse_VVaG;
    /**
     * HDI Haftpflichtverband der Deutschen Industrie Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode HDI_Haftpflichtverband_der_Deutschen_Industrie_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Helvetia Schweizerische Versicherungsgesellschaft AG Direktion für Deutschland
     */
    public static VersichererCode Helvetia_Schweizerische_Versicherungsgesellschaft_AG_Direktion_f_r_Deutschland;
    /**
     * ISSELHORSTER Versicherung V.a.G.
     */
    public static VersichererCode ISSELHORSTER_Versicherung_V_a_G;
    /**
     * KRAVAG-SACH Versicherung des Deutschen Kraftverkehrs Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode KRAVAG_SACH_Versicherung_des_Deutschen_Kraftverkehrs_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Landschaftliche Brandkasse Hannover
     */
    public static VersichererCode Landschaftliche_Brandkasse_Hannover;
    /**
     * Itzehoer Versicherung/Brandgilde von 1691 Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Itzehoer_Versicherung_Brandgilde_von_1691_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * LVM Landwirtschaftlicher Versicherungsverein Münster a.G.
     */
    public static VersichererCode LVM_Landwirtschaftlicher_Versicherungsverein_M_nster_a_G;
    /**
     * LBN Versicherungsverein a.G. (VVaG)
     */
    public static VersichererCode LBN_Versicherungsverein_a_G_VVaG;
    /**
     * Alte Leipziger Versicherung Aktiengesellschaft
     */
    public static VersichererCode Alte_Leipziger_Versicherung_Aktiengesellschaft;
    /**
     * MÜNCHENER VEREIN Allgemeine Versicherungs-AG
     */
    public static VersichererCode M_NCHENER_VEREIN_Allgemeine_Versicherungs_AG;
    /**
     * Vereinigte Hagelversicherung VVaG
     */
    public static VersichererCode Vereinigte_Hagelversicherung_VVaG;
    /**
     * NÜRNBERGER Allgemeine Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode N_RNBERGER_Allgemeine_Versicherungs_Aktiengesellschaft;
    /**
     * R+V Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode R_V_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * Allianz Direct Versicherungs-AG
     */
    public static VersichererCode Allianz_Direct_Versicherungs_AG;
    /**
     * Hagelgilde Versicherungsverein a.G., gegründet 1811
     */
    public static VersichererCode Hagelgilde_Versicherungsverein_a_G_gegr_ndet_1811;
    /**
     * Provinzial Nord Brandkasse Aktiengesellschaft
     */
    public static VersichererCode Provinzial_Nord_Brandkasse_Aktiengesellschaft;
    /**
     * Helvetia Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Helvetia_Versicherungs_Aktiengesellschaft;
    /**
     * ARAG Allgemeine Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode ARAG_Allgemeine_Versicherungs_Aktiengesellschaft;
    /**
     * Uelzener Allgemeine Versicherungs-Gesellschaft a.G.
     */
    public static VersichererCode Uelzener_Allgemeine_Versicherungs_Gesellschaft_a_G;
    /**
     * VPV Allgemeine Versicherungs-AG
     */
    public static VersichererCode VPV_Allgemeine_Versicherungs_AG;
    /**
     * uniVersa Allgemeine Versicherung AG
     */
    public static VersichererCode uniVersa_Allgemeine_Versicherung_AG;
    /**
     * VHV Vereinigte Hannoversche Versicherung a.G.
     */
    public static VersichererCode VHV_Vereinigte_Hannoversche_Versicherung_a_G;
    /**
     * Versicherungsverband Deutscher Eisenbahnen-Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Versicherungsverband_Deutscher_Eisenbahnen_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * GVV-Kommunalversicherung, Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode GVV_Kommunalversicherung_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Fahrlehrerversicherung Verein auf Gegenseitigkeit
     */
    public static VersichererCode Fahrlehrerversicherung_Verein_auf_Gegenseitigkeit;
    /**
     * WWK Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode WWK_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * Württembergische Gemeinde-Versicherung auf Gegenseitigkeit
     */
    public static VersichererCode W_rttembergische_Gemeinde_Versicherung_auf_Gegenseitigkeit;
    /**
     * VOLKSWOHL-BUND SACHVERSICHERUNG AKTIENGESELLSCHAFT
     */
    public static VersichererCode VOLKSWOHL_BUND_SACHVERSICHERUNG_AKTIENGESELLSCHAFT;
    /**
     * GRUNDEIGENTÜMER-VERSICHERUNG Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode GRUNDEIGENT_MER_VERSICHERUNG_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Schleswiger Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Schleswiger_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * HanseMerkur Reiseversicherung AG
     */
    public static VersichererCode HanseMerkur_Reiseversicherung_AG;
    /**
     * ADAC Versicherung AG
     */
    public static VersichererCode ADAC_Versicherung_AG;
    /**
     * Pallas Versicherung Aktiengesellschaft
     */
    public static VersichererCode Pallas_Versicherung_Aktiengesellschaft;
    /**
     * HanseMerkur Allgemeine Versicherung AG
     */
    public static VersichererCode HanseMerkur_Allgemeine_Versicherung_AG;
    /**
     * GARANTA Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode GARANTA_Versicherungs_Aktiengesellschaft;
    /**
     * EUROPA Versicherung Aktiengesellschaft
     */
    public static VersichererCode EUROPA_Versicherung_Aktiengesellschaft;
    /**
     * DEVK Allgemeine Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode DEVK_Allgemeine_Versicherungs_Aktiengesellschaft;
    /**
     * AXA Versicherung Aktiengesellschaft
     */
    public static VersichererCode AXA_Versicherung_Aktiengesellschaft;
    /**
     * HUK-COBURG-Allgemeine Versicherung AG
     */
    public static VersichererCode HUK_COBURG_Allgemeine_Versicherung_AG;
    /**
     * Dolleruper Freie Brandgilde
     */
    public static VersichererCode Dolleruper_Freie_Brandgilde;
    /**
     * WGV-Versicherung AG
     */
    public static VersichererCode WGV_Versicherung_AG;
    /**
     * ROLAND Schutzbrief-Versicherung AG
     */
    public static VersichererCode ROLAND_Schutzbrief_Versicherung_AG;
    /**
     * Vereinigte Schiffs-Versicherung V. a. G.
     */
    public static VersichererCode Vereinigte_Schiffs_Versicherung_V_a_G;
    /**
     * KS Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode KS_Versicherungs_Aktiengesellschaft;
    /**
     * Gebäudeversicherungsgilde für Föhr,Amrum und Halligen
     */
    public static VersichererCode Geb_udeversicherungsgilde_f_r_F_hr_Amrum_und_Halligen;
    /**
     * Harsewinkeler Versicherung VaG
     */
    public static VersichererCode Harsewinkeler_Versicherung_VaG;
    /**
     * INTER Allgemeine Versicherung AG
     */
    public static VersichererCode INTER_Allgemeine_Versicherung_AG;
    /**
     * CG Car-Garantie Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode CG_Car_Garantie_Versicherungs_Aktiengesellschaft;
    /**
     * Debeka Allgemeine Versicherung Aktiengesellschaft Sitz Koblenz am Rhein
     */
    public static VersichererCode Debeka_Allgemeine_Versicherung_Aktiengesellschaft_Sitz_Koblenz_am_Rhein;
    /**
     * Cosmos Versicherung Aktiengesellschaft
     */
    public static VersichererCode Cosmos_Versicherung_Aktiengesellschaft;
    /**
     * OSTBEVERNER Versicherungsverein auf Gegenseitigkeit (VVaG)
     */
    public static VersichererCode OSTBEVERNER_Versicherungsverein_auf_Gegenseitigkeit_VVaG;
    /**
     * Häger Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode H_ger_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * SCHNEVERDINGER Versicherungsverein a.G.
     */
    public static VersichererCode SCHNEVERDINGER_Versicherungsverein_a_G;
    /**
     * ERGO Direkt Versicherung Aktiengesellschaft
     */
    public static VersichererCode ERGO_Direkt_Versicherung_Aktiengesellschaft;
    /**
     * TRIAS Versicherung Aktiengesellschaft
     */
    public static VersichererCode TRIAS_Versicherung_Aktiengesellschaft;
    /**
     * IDEAL Versicherung AG
     */
    public static VersichererCode IDEAL_Versicherung_AG;
    /**
     * ADLER Versicherung AG
     */
    public static VersichererCode ADLER_Versicherung_AG;
    /**
     * PVAG Polizeiversicherungs-Aktiengesellschaft
     */
    public static VersichererCode PVAG_Polizeiversicherungs_Aktiengesellschaft;
    /**
     * GVV Direktversicherung AG
     */
    public static VersichererCode GVV_Direktversicherung_AG;
    /**
     * Stuttgarter Versicherung Aktiengesellschaft
     */
    public static VersichererCode Stuttgarter_Versicherung_Aktiengesellschaft;
    /**
     * GGG Kraftfahrzeug-Reparaturkosten-Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode GGG_Kraftfahrzeug_Reparaturkosten_Versicherungs_Aktiengesellschaft;
    /**
     * Würzburger Versicherungs-AG
     */
    public static VersichererCode W_rzburger_Versicherungs_AG;
    /**
     * neue leben Unfallversicherung Aktiengesellschaft
     */
    public static VersichererCode neue_leben_Unfallversicherung_Aktiengesellschaft;
    /**
     * Deutsche Rhederei Versicherungs-Aktiengesellschaft i.L.
     */
    public static VersichererCode Deutsche_Rhederei_Versicherungs_Aktiengesellschaft_i_L;
    /**
     * Delvag Versicherungs-AG
     */
    public static VersichererCode Delvag_Versicherungs_AG;
    /**
     * Baloise Sachversicherung Aktiengesellschaft Deutschland
     */
    public static VersichererCode Baloise_Sachversicherung_Aktiengesellschaft_Deutschland;
    /**
     * AWP P&amp;C S.A. Niederlassung für Deutschland
     */
    public static VersichererCode AWP_P_C_S_A_Niederlassung_f_r_Deutschland;
    /**
     * F. Laeisz Versicherung Aktiengesellschaft
     */
    public static VersichererCode F_Laeisz_Versicherung_Aktiengesellschaft;
    /**
     * Minerva Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Minerva_Versicherungs_Aktiengesellschaft;
    /**
     * NÜRNBERGER BEAMTEN ALLGEMEINE VERSICHERUNG AKTIENGESELLSCHAFT
     */
    public static VersichererCode N_RNBERGER_BEAMTEN_ALLGEMEINE_VERSICHERUNG_AKTIENGESELLSCHAFT;
    /**
     * Hanse-Marine-Versicherung AG
     */
    public static VersichererCode Hanse_Marine_Versicherung_AG;
    /**
     * Thüga Schadenausgleichskasse München VVaG i.L.
     */
    public static VersichererCode Th_ga_Schadenausgleichskasse_M_nchen_VVaG_i_L;
    /**
     * DARAG Deutschland AG
     */
    public static VersichererCode DARAG_Deutschland_AG;
    /**
     * SAARLAND Feuerversicherung Aktiengesellschaft
     */
    public static VersichererCode SAARLAND_Feuerversicherung_Aktiengesellschaft;
    /**
     * InterRisk Versicherungs-AG Vienna Insurance Group.
     */
    public static VersichererCode InterRisk_Versicherungs_AG_Vienna_Insurance_Group;
    /**
     * Sparkassen-Versicherung Sachsen Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode Sparkassen_Versicherung_Sachsen_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * OKV - Ostdeutsche Kommunalversicherung auf Gegenseitigkeit
     */
    public static VersichererCode OKV_Ostdeutsche_Kommunalversicherung_auf_Gegenseitigkeit;
    /**
     * BavariaDirekt Versicherung AG
     */
    public static VersichererCode BavariaDirekt_Versicherung_AG;
    /**
     * Inter Partner Assistance SA Direktion für Deutschland
     */
    public static VersichererCode Inter_Partner_Assistance_SA_Direktion_f_r_Deutschland;
    /**
     * NEH Neue Hildener Versicherung AG
     */
    public static VersichererCode NEH_Neue_Hildener_Versicherung_AG;
    /**
     * ARAG SE
     */
    public static VersichererCode ARAG_SE;
    /**
     * AUXILIA Rechtsschutz-Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode AUXILIA_Rechtsschutz_Versicherungs_Aktiengesellschaft;
    /**
     * DEURAG Deutsche Rechtsschutz-Versicherung Aktiengesellschaft
     */
    public static VersichererCode DEURAG_Deutsche_Rechtsschutz_Versicherung_Aktiengesellschaft;
    /**
     * Neue Rechtsschutz-Versicherungsgesellschaft Aktiengesellschaft
     */
    public static VersichererCode Neue_Rechtsschutz_Versicherungsgesellschaft_Aktiengesellschaft;
    /**
     * ROLAND Rechtsschutz-Versicherungs-AG
     */
    public static VersichererCode ROLAND_Rechtsschutz_Versicherungs_AG;
    /**
     * ADVOCARD Rechtsschutzversicherung AG
     */
    public static VersichererCode ADVOCARD_Rechtsschutzversicherung_AG;
    /**
     * ÖRAG Rechtsschutzversicherungs-Aktiengesellschaft
     */
    public static VersichererCode RAG_Rechtsschutzversicherungs_Aktiengesellschaft;
    /**
     * HUK-COBURG-Rechtsschutzversicherung AG
     */
    public static VersichererCode HUK_COBURG_Rechtsschutzversicherung_AG;
    /**
     * DEVK Rechtsschutz-Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode DEVK_Rechtsschutz_Versicherungs_Aktiengesellschaft;
    /**
     * DMB Rechtsschutz-Versicherung Aktiengesellschaft
     */
    public static VersichererCode DMB_Rechtsschutz_Versicherung_Aktiengesellschaft;
    /**
     * Badische Rechtsschutzversicherung Aktiengesellschaft
     */
    public static VersichererCode Badische_Rechtsschutzversicherung_Aktiengesellschaft;
    /**
     * Pensions-Sicherungs-Verein Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Pensions_Sicherungs_Verein_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Gothaer Allgemeine Versicherung Aktiengesellschaft
     */
    public static VersichererCode Gothaer_Allgemeine_Versicherung_Aktiengesellschaft;
    /**
     * VHV Allgemeine Versicherung AG
     */
    public static VersichererCode VHV_Allgemeine_Versicherung_AG;
    /**
     * CHUBB European Group SE, Direktion für Deutschland
     */
    public static VersichererCode CHUBB_European_Group_SE_Direktion_f_r_Deutschland;
    /**
     * RGA International Reinsurance Company Designated Activity Company, Niederlassung für Deutschland
     */
    public static VersichererCode RGA_International_Reinsurance_Company_Designated_Activity_Company_Niederlassung_f_r_Deutschland;
    /**
     * Mapfre Re, Compania de Reaseguros, S.A. Munich Branch
     */
    public static VersichererCode Mapfre_Re_Compania_de_Reaseguros_S_A_Munich_Branch;
    /**
     * Swiss Re Europe S.A., Niederlassung Deutschland
     */
    public static VersichererCode Swiss_Re_Europe_S_A_Niederlassung_Deutschland;
    /**
     * SCOR Rückversicherung Deutschland, Niederlassung der SCOR SE
     */
    public static VersichererCode SCOR_R_ckversicherung_Deutschland_Niederlassung_der_SCOR_SE;
    /**
     * Deutsche Rückversicherung Aktiengesellschaft
     */
    public static VersichererCode Deutsche_R_ckversicherung_Aktiengesellschaft;
    /**
     * E+S Rückversicherung AG
     */
    public static VersichererCode E_S_R_ckversicherung_AG;
    /**
     * General Reinsurance AG
     */
    public static VersichererCode General_Reinsurance_AG;
    /**
     * Kieler Rückversicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode Kieler_R_ckversicherungsverein_auf_Gegenseitigkeit;
    /**
     * RISICOM Rückversicherung Aktiengesellschaft
     */
    public static VersichererCode RISICOM_R_ckversicherung_Aktiengesellschaft;
    /**
     * Allianz SE
     */
    public static VersichererCode Allianz_SE;
    /**
     * PRORÜCK Rückversicherungs-Aktiengesellschaft
     */
    public static VersichererCode PROR_CK_R_ckversicherungs_Aktiengesellschaft;
    /**
     * R+V VERSICHERUNG AG
     */
    public static VersichererCode R_V_VERSICHERUNG_AG;
    /**
     * SV SparkassenVersicherung Holding Aktiengesellschaft
     */
    public static VersichererCode SV_SparkassenVersicherung_Holding_Aktiengesellschaft;
    /**
     * Versicherungskammer Bayern Konzern-Rückversicherung Aktiengesellschaft
     */
    public static VersichererCode Versicherungskammer_Bayern_Konzern_R_ckversicherung_Aktiengesellschaft;
    /**
     * DEVK Rückversicherungs- und Beteiligungs-Aktiengesellschaft - DEVK RE
     */
    public static VersichererCode DEVK_R_ckversicherungs_und_Beteiligungs_Aktiengesellschaft_DEVK_RE;
    /**
     * Diehl Assekuranz Rückversicherungs- und Vermittlungs-AG
     */
    public static VersichererCode Diehl_Assekuranz_R_ckversicherungs_und_Vermittlungs_AG;
    /**
     * Freudenberg Rückversicherung AG
     */
    public static VersichererCode Freudenberg_R_ckversicherung_AG;
    /**
     * HDI Global Network AG
     */
    public static VersichererCode HDI_Global_Network_AG;
    /**
     * Hochrhein Internationale Rückversicherung Aktiengesellschaft
     */
    public static VersichererCode Hochrhein_Internationale_R_ckversicherung_Aktiengesellschaft;
    /**
     * Incura AG
     */
    public static VersichererCode Incura_AG;
    /**
     * BarmeniaGothaer AG
     */
    public static VersichererCode BarmeniaGothaer_AG;
    /**
     * REVIUM Rückversicherung AG
     */
    public static VersichererCode REVIUM_R_ckversicherung_AG;
    /**
     * Euler Hermes SA/NV
     */
    public static VersichererCode Euler_Hermes_SA_NV;
    /**
     * Liberty Mutual Insurance Europe SE
     */
    public static VersichererCode Liberty_Mutual_Insurance_Europe_SE;
    /**
     * GAN Assurances
     */
    public static VersichererCode GAN_Assurances;
    /**
     * Athora Belgium NV
     */
    public static VersichererCode Athora_Belgium_NV;
    /**
     * GENERALI IARD
     */
    public static VersichererCode GENERALI_IARD;
    /**
     * Allianz S.p.A.
     */
    public static VersichererCode Allianz_S_p_A;
    /**
     * Unilever Insurances N.V.
     */
    public static VersichererCode Unilever_Insurances_N_V;
    /**
     * Swiss Re International SE
     */
    public static VersichererCode Swiss_Re_International_SE;
    /**
     * Compagnie Francaise d&apos;Assurance pour le Commerce Extérieur (COFACE)
     */
    public static VersichererCode Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_COFACE;
    /**
     * AXA Assicurazioni s.p.a.
     */
    public static VersichererCode AXA_Assicurazioni_s_p_a;
    /**
     * Unipol Assicurazioni S.p.A.
     */
    public static VersichererCode Unipol_Assicurazioni_S_p_A;
    /**
     * Miripro Insurance Company dac
     */
    public static VersichererCode Miripro_Insurance_Company_dac;
    /**
     * Merkur Versicherung Aktiengesellschaft
     */
    public static VersichererCode Merkur_Versicherung_Aktiengesellschaft;
    /**
     * Axa Assurances Vie Luxembourg
     */
    public static VersichererCode Axa_Assurances_Vie_Luxembourg;
    /**
     * Cardif Lux Vie S.A.
     */
    public static VersichererCode Cardif_Lux_Vie_S_A;
    /**
     * Utmost Luxembourg S.A.
     */
    public static VersichererCode Utmost_Luxembourg_S_A;
    /**
     * The OneLife Company S.A.
     */
    public static VersichererCode The_OneLife_Company_S_A;
    /**
     * Swiss Life (Luxembourg) S.A.
     */
    public static VersichererCode Swiss_Life_Luxembourg_S_A;
    /**
     * Foyer Vie S.A.
     */
    public static VersichererCode Foyer_Vie_S_A;
    /**
     * Shipowners&apos; Mutual Protection &amp; Indemnity Association
     */
    public static VersichererCode Shipowners_Mutual_Protection_Indemnity_Association;
    /**
     * Helvetia Versicherungen AG
     */
    public static VersichererCode Helvetia_Versicherungen_AG;
    /**
     * MMA VIE Assurances Mutuelles
     */
    public static VersichererCode MMA_VIE_Assurances_Mutuelles;
    /**
     * N.V. Schadeverzekering-Maatschappij Bovemij
     */
    public static VersichererCode N_V_Schadeverzekering_Maatschappij_Bovemij;
    /**
     * Oberösterreichische Versicherung Aktiengesellschaft
     */
    public static VersichererCode Ober_sterreichische_Versicherung_Aktiengesellschaft;
    /**
     * CIGNA Life Insurance Company of Europe S.A./N.V.
     */
    public static VersichererCode CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V;
    /**
     * EUROPÆISKE REJSEFORSIKRING A/S
     */
    public static VersichererCode EUROP_ISKE_REJSEFORSIKRING_A_S;
    /**
     * EUROP ASSISTANCE SA
     */
    public static VersichererCode EUROP_ASSISTANCE_SA;
    /**
     * APK Versicherung Aktiengesellschaft
     */
    public static VersichererCode APK_Versicherung_Aktiengesellschaft;
    /**
     * Mutuelle des Architectes Francais Assurances
     */
    public static VersichererCode Mutuelle_des_Architectes_Francais_Assurances;
    /**
     * Allianz Elementar Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allianz_Elementar_Lebensversicherungs_Aktiengesellschaft;
    /**
     * Foyer Assurances S.A.
     */
    public static VersichererCode Foyer_Assurances_S_A;
    /**
     * Wiener Städtische Versicherung AG Vienna Insurance Group
     */
    public static VersichererCode Wiener_St_dtische_Versicherung_AG_Vienna_Insurance_Group;
    /**
     * Assicurazioni Generali S.p.A.
     */
    public static VersichererCode Assicurazioni_Generali_S_p_A;
    /**
     * Allianz Plc
     */
    public static VersichererCode Allianz_Plc;
    /**
     * VAV Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode VAV_Versicherungs_Aktiengesellschaft;
    /**
     * Allianz Elementar Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allianz_Elementar_Versicherungs_Aktiengesellschaft;
    /**
     * Allianz Life Luxembourg S.A.
     */
    public static VersichererCode Allianz_Life_Luxembourg_S_A;
    /**
     * Società Reale Mutua di Assicurazioni
     */
    public static VersichererCode Societ_Reale_Mutua_di_Assicurazioni;
    /**
     * Generali Versicherung AG
     */
    public static VersichererCode Generali_Versicherung_AG;
    /**
     * Acredia Versicherung Aktiengesellschaft
     */
    public static VersichererCode Acredia_Versicherung_Aktiengesellschaft;
    /**
     * Hansard Europe Designated Activity Company
     */
    public static VersichererCode Hansard_Europe_Designated_Activity_Company;
    /**
     * Kärntner Landesversicherung auf Gegenseitigkeit
     */
    public static VersichererCode K_rntner_Landesversicherung_auf_Gegenseitigkeit;
    /**
     * HYPO Versicherung Aktiengesellschaft
     */
    public static VersichererCode HYPO_Versicherung_Aktiengesellschaft;
    /**
     * OOM Global Care N.V.
     */
    public static VersichererCode OOM_Global_Care_N_V;
    /**
     * DKV Belgium SA
     */
    public static VersichererCode DKV_Belgium_SA;
    /**
     * MMA IARD Assurances Mutuelles
     */
    public static VersichererCode MMA_IARD_Assurances_Mutuelles;
    /**
     * AG Insurance SA
     */
    public static VersichererCode AG_Insurance_SA;
    /**
     * La Luxembourgeoise-Vie S.A.
     */
    public static VersichererCode La_Luxembourgeoise_Vie_S_A;
    /**
     * AXA BELGIUM SA
     */
    public static VersichererCode AXA_BELGIUM_SA;
    /**
     * UNIQA Österreich Versicherungen AG
     */
    public static VersichererCode UNIQA_sterreich_Versicherungen_AG;
    /**
     * DONAU Versicherung AG Vienna Insurance Group
     */
    public static VersichererCode DONAU_Versicherung_AG_Vienna_Insurance_Group;
    /**
     * D.K.V. Luxembourg S.A.
     */
    public static VersichererCode D_K_V_Luxembourg_S_A;
    /**
     * Grazer Wechselseitige Versicherung Aktiengesellschaft
     */
    public static VersichererCode Grazer_Wechselseitige_Versicherung_Aktiengesellschaft;
    /**
     * Offaly Insurance Company DAC
     */
    public static VersichererCode Offaly_Insurance_Company_DAC;
    /**
     * SIAT Società Italiana Assicurazioni e Riassicurazioni S.p.A.
     */
    public static VersichererCode SIAT_Societ_Italiana_Assicurazioni_e_Riassicurazioni_S_p_A;
    /**
     * Industria Försäkringsaktiebolag
     */
    public static VersichererCode Industria_F_rs_kringsaktiebolag;
    /**
     * COMPAGNIE EUROPEENNE DE GARANTIES ET CAUTIONS
     */
    public static VersichererCode COMPAGNIE_EUROPEENNE_DE_GARANTIES_ET_CAUTIONS;
    /**
     * SiriusPoint International Försäkringsaktiebolag (publ)
     */
    public static VersichererCode SiriusPoint_International_F_rs_kringsaktiebolag_publ;
    /**
     * EOC Onderlinge Schepenverzekering U.A.
     */
    public static VersichererCode EOC_Onderlinge_Schepenverzekering_U_A;
    /**
     * GD Insurance Company dac
     */
    public static VersichererCode GD_Insurance_Company_dac;
    /**
     * AXA Assistance France Assurances
     */
    public static VersichererCode AXA_Assistance_France_Assurances;
    /**
     * TCS Insurance Company of Ireland dac
     */
    public static VersichererCode TCS_Insurance_Company_of_Ireland_dac;
    /**
     * Philip Morris International Insurance (Ireland) dac
     */
    public static VersichererCode Philip_Morris_International_Insurance_Ireland_dac;
    /**
     * LocalTapiola General Mutual Insurance Company
     */
    public static VersichererCode LocalTapiola_General_Mutual_Insurance_Company;
    /**
     * HDI Versicherung AG - Wien
     */
    public static VersichererCode HDI_Versicherung_AG_Wien;
    /**
     * Assuranceforeningen GARD - Gjensidig -
     */
    public static VersichererCode Assuranceforeningen_GARD_Gjensidig;
    /**
     * Gjensidige Forsikring ASA
     */
    public static VersichererCode Gjensidige_Forsikring_ASA;
    /**
     * TIROLER VERSICHERUNG V.a.G.
     */
    public static VersichererCode TIROLER_VERSICHERUNG_V_a_G;
    /**
     * Wealins S.A.
     */
    public static VersichererCode Wealins_S_A;
    /**
     * Vida Caixa S.A., de Seguros y Reaseguros
     */
    public static VersichererCode Vida_Caixa_S_A_de_Seguros_y_Reaseguros;
    /**
     * Acadia International Insurance dac c/o Aon Insurance Managers (Dublin) Ltd
     */
    public static VersichererCode Acadia_International_Insurance_dac_c_o_Aon_Insurance_Managers_Dublin_Ltd;
    /**
     * COMPANIA ESPANOLA DE SEGUROS DE CREDITO A LA EXPORTACION, S.A. COMPANIA DE SEGUROS Y REASEGUROS (CESCE)
     */
    public static VersichererCode COMPANIA_ESPANOLA_DE_SEGUROS_DE_CREDITO_A_LA_EXPORTACION_S_A_COMPANIA_DE_SEGUROS_Y_REASEGUROS_CESCE;
    /**
     * AKZO Nobel Assurantie N.V.
     */
    public static VersichererCode AKZO_Nobel_Assurantie_N_V;
    /**
     * Norwegian Hull Club -Gjensidig Assuranseforening
     */
    public static VersichererCode Norwegian_Hull_Club_Gjensidig_Assuranseforening;
    /**
     * XL Insurance Company SE
     */
    public static VersichererCode XL_Insurance_Company_SE;
    /**
     * Vitis Life S.A.
     */
    public static VersichererCode Vitis_Life_S_A;
    /**
     * ZURICH EUROLIFE S.A.
     */
    public static VersichererCode ZURICH_EUROLIFE_S_A;
    /**
     * Protector Forsikring ASA
     */
    public static VersichererCode Protector_Forsikring_ASA;
    /**
     * Probus Insurance Company Europe DAC
     */
    public static VersichererCode Probus_Insurance_Company_Europe_DAC;
    /**
     * SOGELIFE S.A.
     */
    public static VersichererCode SOGELIFE_S_A;
    /**
     * COSEC-Companhia de Seguro de Créditos, SA
     */
    public static VersichererCode COSEC_Companhia_de_Seguro_de_Cr_ditos_SA;
    /**
     * Nationale-Nederlanden Levensverzekering Maatschappij N.V.
     */
    public static VersichererCode Nationale_Nederlanden_Levensverzekering_Maatschappij_N_V;
    /**
     * Groupama Assicurazioni S.p.A.
     */
    public static VersichererCode Groupama_Assicurazioni_S_p_A;
    /**
     * Köbstaedernses almindelige Brandforsikring, gensidig
     */
    public static VersichererCode K_bstaedernses_almindelige_Brandforsikring_gensidig;
    /**
     * Fortuna Lebens-Versicherungs Aktiengesellschaft
     */
    public static VersichererCode Fortuna_Lebens_Versicherungs_Aktiengesellschaft;
    /**
     * ERGO Life S.A.
     */
    public static VersichererCode ERGO_Life_S_A;
    /**
     * European Mutual Association for Nuclear Insurance (E.M.A.N.I.)
     */
    public static VersichererCode European_Mutual_Association_for_Nuclear_Insurance_E_M_A_N_I;
    /**
     * AmTrust International Underwriters dac
     */
    public static VersichererCode AmTrust_International_Underwriters_dac;
    /**
     * CNP Assurances S.A.
     */
    public static VersichererCode CNP_Assurances_S_A;
    /**
     * Onderlinge Hagelverzekering Maatschappij Agriver B.A.
     */
    public static VersichererCode Onderlinge_Hagelverzekering_Maatschappij_Agriver_B_A;
    /**
     * Borealis Insurance A/S
     */
    public static VersichererCode Borealis_Insurance_A_S;
    /**
     * PI Indemnity Company, Designated Activity Company
     */
    public static VersichererCode PI_Indemnity_Company_Designated_Activity_Company;
    /**
     * BPCE Life
     */
    public static VersichererCode BPCE_Life;
    /**
     * NS Insurance N.V.
     */
    public static VersichererCode NS_Insurance_N_V;
    /**
     * Industriforsikring AS
     */
    public static VersichererCode Industriforsikring_AS;
    /**
     * UNIQA Versicherung Aktiengesellschaft
     */
    public static VersichererCode UNIQA_Versicherung_Aktiengesellschaft;
    /**
     * austrion Life Insurance AG
     */
    public static VersichererCode austrion_Life_Insurance_AG;
    /**
     * Vabis Försäkringsaktiebolag
     */
    public static VersichererCode Vabis_F_rs_kringsaktiebolag;
    /**
     * Pohjola Insurance Ltd
     */
    public static VersichererCode Pohjola_Insurance_Ltd;
    /**
     * Essity Försäkringsaktiebolag
     */
    public static VersichererCode Essity_F_rs_kringsaktiebolag;
    /**
     * Lifeguard Insurance (Dublin) dac
     */
    public static VersichererCode Lifeguard_Insurance_Dublin_dac;
    /**
     * Tryg Forsikring A/S
     */
    public static VersichererCode Tryg_Forsikring_A_S;
    /**
     * AXA FRANCE IARD
     */
    public static VersichererCode AXA_FRANCE_IARD;
    /**
     * Helvetia Assurances S.A.
     */
    public static VersichererCode Helvetia_Assurances_S_A;
    /**
     * NEIL Overseas dac
     */
    public static VersichererCode NEIL_Overseas_dac;
    /**
     * Försäkringsaktiebolaget Vattenfall Insurance
     */
    public static VersichererCode F_rs_kringsaktiebolaget_Vattenfall_Insurance;
    /**
     * Assurances du Crédit Mutuel IARD S.A.
     */
    public static VersichererCode Assurances_du_Cr_dit_Mutuel_IARD_S_A;
    /**
     * Assurances du Crédit Mutuel Vie S.A.
     */
    public static VersichererCode Assurances_du_Cr_dit_Mutuel_Vie_S_A;
    /**
     * DB VITA SA
     */
    public static VersichererCode DB_VITA_SA;
    /**
     * Baloise Vie Luxembourg S.A.
     */
    public static VersichererCode Baloise_Vie_Luxembourg_S_A;
    /**
     * International Credit Mutuel Life S.A.
     */
    public static VersichererCode International_Credit_Mutuel_Life_S_A;
    /**
     * Solid Försäkringsaktiebolag
     */
    public static VersichererCode Solid_F_rs_kringsaktiebolag;
    /**
     * ERGO Versicherung Aktiengesellschaft
     */
    public static VersichererCode ERGO_Versicherung_Aktiengesellschaft;
    /**
     * Euro Insurances dac
     */
    public static VersichererCode Euro_Insurances_dac;
    /**
     * Vienna-Life Lebensversicherung AG Vienna Insurance Group
     */
    public static VersichererCode Vienna_Life_Lebensversicherung_AG_Vienna_Insurance_Group;
    /**
     * If Skadeförsäkring AB (publ.)
     */
    public static VersichererCode If_Skadef_rs_kring_AB_publ;
    /**
     * Noble Insurance Company dac
     */
    public static VersichererCode Noble_Insurance_Company_dac;
    /**
     * ALLIANZ COMPANIA DE SEGUROS Y REASEGUROS S.A.
     */
    public static VersichererCode ALLIANZ_COMPANIA_DE_SEGUROS_Y_REASEGUROS_S_A;
    /**
     * Zurich Life Assurance Public Limited Company
     */
    public static VersichererCode Zurich_Life_Assurance_Public_Limited_Company;
    /**
     * Cali Europe
     */
    public static VersichererCode Cali_Europe;
    /**
     * Accept Försäkringsaktiebolag (publ)
     */
    public static VersichererCode Accept_F_rs_kringsaktiebolag_publ;
    /**
     * CNP Unicredit Vita S.p.A.
     */
    public static VersichererCode CNP_Unicredit_Vita_S_p_A;
    /**
     * Monument Assurance Luxembourg S.A.
     */
    public static VersichererCode Monument_Assurance_Luxembourg_S_A;
    /**
     * Europäische Reiseversicherung AG
     */
    public static VersichererCode Europ_ische_Reiseversicherung_AG;
    /**
     * Vorarlberger Landes-Versicherung V.a.G.
     */
    public static VersichererCode Vorarlberger_Landes_Versicherung_V_a_G;
    /**
     * YOUPLUS Assurance AG
     */
    public static VersichererCode YOUPLUS_Assurance_AG;
    /**
     * CIGNA Europe Insurance Company S.A.
     */
    public static VersichererCode CIGNA_Europe_Insurance_Company_S_A;
    /**
     * Zürich Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Z_rich_Versicherungs_Aktiengesellschaft;
    /**
     * Electrolux Försäkringsaktiebolag
     */
    public static VersichererCode Electrolux_F_rs_kringsaktiebolag;
    /**
     * BBPM Life dac
     */
    public static VersichererCode BBPM_Life_dac;
    /**
     * InChiaro Life Designated Activity Company
     */
    public static VersichererCode InChiaro_Life_Designated_Activity_Company;
    /**
     * Carraig Insurance dac
     */
    public static VersichererCode Carraig_Insurance_dac;
    /**
     * PrismaLife AG
     */
    public static VersichererCode PrismaLife_AG;
    /**
     * Aterförsäkringsaktiebolaget SKF
     */
    public static VersichererCode Aterf_rs_kringsaktiebolaget_SKF;
    /**
     * Mediolanum International Life dac
     */
    public static VersichererCode Mediolanum_International_Life_dac;
    /**
     * Sasol International Insurance dac
     */
    public static VersichererCode Sasol_International_Insurance_dac;
    /**
     * AXIS Specialty Europe SE
     */
    public static VersichererCode AXIS_Specialty_Europe_SE;
    /**
     * Utmost PanEurope dac
     */
    public static VersichererCode Utmost_PanEurope_dac;
    /**
     * swisspartners Versicherung AG
     */
    public static VersichererCode swisspartners_Versicherung_AG;
    /**
     * Allied World Assurance Company (Europe) DAC
     */
    public static VersichererCode Allied_World_Assurance_Company_Europe_DAC;
    /**
     * UPS International Insurance dac
     */
    public static VersichererCode UPS_International_Insurance_dac;
    /**
     * SBB Insurance AG
     */
    public static VersichererCode SBB_Insurance_AG;
    /**
     * White Horse Insurance Ireland dac
     */
    public static VersichererCode White_Horse_Insurance_Ireland_dac;
    /**
     * RAIFFEISEN VIE S.A.
     */
    public static VersichererCode RAIFFEISEN_VIE_S_A;
    /**
     * Assuranceforeningen Skuld Gjensidig
     */
    public static VersichererCode Assuranceforeningen_Skuld_Gjensidig;
    /**
     * Octium Life dac
     */
    public static VersichererCode Octium_Life_dac;
    /**
     * AXA France Vie S.A.
     */
    public static VersichererCode AXA_France_Vie_S_A;
    /**
     * Canada Life Assurance Europe plc
     */
    public static VersichererCode Canada_Life_Assurance_Europe_plc;
    /**
     * PFA Pension forsikringsaktieselskab
     */
    public static VersichererCode PFA_Pension_forsikringsaktieselskab;
    /**
     * RSIF International dac
     */
    public static VersichererCode RSIF_International_dac;
    /**
     * Pharma International Insurance dac
     */
    public static VersichererCode Pharma_International_Insurance_dac;
    /**
     * CACI Non-Life Designated Activity Company
     */
    public static VersichererCode CACI_Non_Life_Designated_Activity_Company;
    /**
     * Merkur Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Merkur_Lebensversicherung_Aktiengesellschaft;
    /**
     * CACI Life Designated Activity Company
     */
    public static VersichererCode CACI_Life_Designated_Activity_Company;
    /**
     * Great American International Insurance (EU) DAC
     */
    public static VersichererCode Great_American_International_Insurance_EU_DAC;
    /**
     * Société D&apos;Assurances Générales Appliquées (SAGA) Designated Activity Company
     */
    public static VersichererCode Soci_t_D_Assurances_G_n_rales_Appliqu_es_SAGA_Designated_Activity_Company;
    /**
     * Fidelidade-Companhia de Seguros S.A.
     */
    public static VersichererCode Fidelidade_Companhia_de_Seguros_S_A;
    /**
     * La Mondiale Europartner S.A.
     */
    public static VersichererCode La_Mondiale_Europartner_S_A;
    /**
     * UVM Verzekeringsmaatschappij N.V.
     */
    public static VersichererCode UVM_Verzekeringsmaatschappij_N_V;
    /**
     * Visenta Försäkringsaktiebolag Managing Director Ragnar Andersson
     */
    public static VersichererCode Visenta_F_rs_kringsaktiebolag_Managing_Director_Ragnar_Andersson;
    /**
     * March Vida Sociedad Anonima_de Seguros y Reaseguros
     */
    public static VersichererCode March_Vida_Sociedad_Anonima_de_Seguros_y_Reaseguros;
    /**
     * ETHIAS S.A.
     */
    public static VersichererCode ETHIAS_S_A;
    /**
     * ELINI A.M.
     */
    public static VersichererCode ELINI_A_M;
    /**
     * Balcia Insurance SE
     */
    public static VersichererCode Balcia_Insurance_SE;
    /**
     * Kooperativa pojišťovna, a.s., Vienna Insurance Group
     */
    public static VersichererCode Kooperativa_poji_ovna_a_s_Vienna_Insurance_Group;
    /**
     * Allianz pojišťovna, a.s.
     */
    public static VersichererCode Allianz_poji_ovna_a_s;
    /**
     * Justitia NV
     */
    public static VersichererCode Justitia_NV;
    /**
     * ONVZ Ziegtekostenverzekeraar N.V.
     */
    public static VersichererCode ONVZ_Ziegtekostenverzekeraar_N_V;
    /**
     * Allianz IARD
     */
    public static VersichererCode Allianz_IARD;
    /**
     * Compagnia Italiana Di Previdenza Assicurazioni e Riassicurazioni
     */
    public static VersichererCode Compagnia_Italiana_Di_Previdenza_Assicurazioni_e_Riassicurazioni;
    /**
     * Wälder Versicherung Versicherungsverein auf Gegenseitigkeit
     */
    public static VersichererCode W_lder_Versicherung_Versicherungsverein_auf_Gegenseitigkeit;
    /**
     * Credendo - Trade Credit Insurance
     */
    public static VersichererCode Credendo_Trade_Credit_Insurance;
    /**
     * Fennia Mutual Insurance Company
     */
    public static VersichererCode Fennia_Mutual_Insurance_Company;
    /**
     * Swiss Life Liechtenstein AG
     */
    public static VersichererCode Swiss_Life_Liechtenstein_AG;
    /**
     * SACE BT S.P.A.
     */
    public static VersichererCode SACE_BT_S_P_A;
    /**
     * Yara Insurance dac
     */
    public static VersichererCode Yara_Insurance_dac;
    /**
     * Credendo - Guarantees and Specialty Risks NV
     */
    public static VersichererCode Credendo_Guarantees_and_Specialty_Risks_NV;
    /**
     * MELES Insurance A/S
     */
    public static VersichererCode MELES_Insurance_A_S;
    /**
     * If P&amp;C Insurance AS
     */
    public static VersichererCode If_P_C_Insurance_AS;
    /**
     * Intesa Sanpaolo Vita S.p.A.
     */
    public static VersichererCode Intesa_Sanpaolo_Vita_S_p_A;
    /**
     * Quantum Leben AG
     */
    public static VersichererCode Quantum_Leben_AG;
    /**
     * Hawthorn Life dac
     */
    public static VersichererCode Hawthorn_Life_dac;
    /**
     * Nucleus Life AG
     */
    public static VersichererCode Nucleus_Life_AG;
    /**
     * SCILDON N.V.
     */
    public static VersichererCode SCILDON_N_V;
    /**
     * ČSOB Pojišťovna, a. s., člen holdingu ČSOB
     */
    public static VersichererCode SOB_Poji_ovna_a_s_len_holdingu_SOB;
    /**
     * Allianz Hungária Biztosíto Zrt.
     */
    public static VersichererCode Allianz_Hung_ria_Biztos_to_Zrt;
    /**
     * PartnerRe Ireland Insurance dac
     */
    public static VersichererCode PartnerRe_Ireland_Insurance_dac;
    /**
     * Neuflize Vie
     */
    public static VersichererCode Neuflize_Vie;
    /**
     * ZAVAROVALNICA TRIGLAV, d.d.
     */
    public static VersichererCode ZAVAROVALNICA_TRIGLAV_d_d;
    /**
     * SwissLife Assurance et Patrimoine
     */
    public static VersichererCode SwissLife_Assurance_et_Patrimoine;
    /**
     * Le Sphinx Assurances Luxembourg S.A.
     */
    public static VersichererCode Le_Sphinx_Assurances_Luxembourg_S_A;
    /**
     * Európai Utazási Biztositó Rt.
     */
    public static VersichererCode Eur_pai_Utaz_si_Biztosit_Rt;
    /**
     * Unicorp Vida Compania de Seguros y Reaseguros S.A.
     */
    public static VersichererCode Unicorp_Vida_Compania_de_Seguros_y_Reaseguros_S_A;
    /**
     * White Rock Insurance (Europe) PCC Limited
     */
    public static VersichererCode White_Rock_Insurance_Europe_PCC_Limited;
    /**
     * Powszechny Zakład Ubezpieczeń Spółka Akcyjna
     */
    public static VersichererCode Powszechny_Zak_ad_Ubezpiecze_Sp_ka_Akcyjna;
    /**
     * Ergon Insurance Limited
     */
    public static VersichererCode Ergon_Insurance_Limited;
    /**
     * Wagram Insurance Company dac
     */
    public static VersichererCode Wagram_Insurance_Company_dac;
    /**
     * Sara Assicurazioni s.p.a.
     */
    public static VersichererCode Sara_Assicurazioni_s_p_a;
    /**
     * ASR Schadeverzekering N.V.
     */
    public static VersichererCode ASR_Schadeverzekering_N_V;
    /**
     * Towarzystwo Ubezpieczeń i Reasekuracji WARTA S.A.
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_i_Reasekuracji_WARTA_S_A;
    /**
     * BPI Vida e Pensões - Companhia de Seguros, S.A.
     */
    public static VersichererCode BPI_Vida_e_Pens_es_Companhia_de_Seguros_S_A;
    /**
     * Generali Česká Pojišt&apos;ovna a.s.
     */
    public static VersichererCode Generali_esk_Poji_t_ovna_a_s;
    /**
     * Onderlinge Verzekering Maatschappij Noord Nederlandsche P&amp;I Club U.A.
     */
    public static VersichererCode Onderlinge_Verzekering_Maatschappij_Noord_Nederlandsche_P_I_Club_U_A;
    /**
     * Inter Partner Assistance SA
     */
    public static VersichererCode Inter_Partner_Assistance_SA;
    /**
     * Vodafone Insurance Ltd.
     */
    public static VersichererCode Vodafone_Insurance_Ltd;
    /**
     * BCC Assicurazioni S.P.A.
     */
    public static VersichererCode BCC_Assicurazioni_S_P_A;
    /**
     * Ornua Insurance Designated Activity Company
     */
    public static VersichererCode Ornua_Insurance_Designated_Activity_Company;
    /**
     * Achmea Schadeverzekeringen N.V.
     */
    public static VersichererCode Achmea_Schadeverzekeringen_N_V;
    /**
     * Towarzystwo Ubezpieczeń i Reasekuracji Allianz Polska S.A.
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_i_Reasekuracji_Allianz_Polska_S_A;
    /**
     * HSBC ASSURANCES VIE (FRANCE)
     */
    public static VersichererCode HSBC_ASSURANCES_VIE_FRANCE;
    /**
     * Groupama Assurance-Credit et Caution
     */
    public static VersichererCode Groupama_Assurance_Credit_et_Caution;
    /**
     * ADVIGON VERSICHERUNG AG
     */
    public static VersichererCode ADVIGON_VERSICHERUNG_AG;
    /**
     * Sopockie Towarzystwo Ubezpieczen Ergo Hestia S.A.
     */
    public static VersichererCode Sopockie_Towarzystwo_Ubezpieczen_Ergo_Hestia_S_A;
    /**
     * Towarzystwo Ubezpieczeń Euler Hermes S.A.
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_Euler_Hermes_S_A;
    /**
     * Helvetia Global Solutions AG
     */
    public static VersichererCode Helvetia_Global_Solutions_AG;
    /**
     * Cardif Assurance Vie S.A.
     */
    public static VersichererCode Cardif_Assurance_Vie_S_A;
    /**
     * Allianz Lietuva gyvybės draudimas UAB
     */
    public static VersichererCode Allianz_Lietuva_gyvyb_s_draudimas_UAB;
    /**
     * Generali Italia S.p.A.
     */
    public static VersichererCode Generali_Italia_S_p_A;
    /**
     * AXERIA IARD
     */
    public static VersichererCode AXERIA_IARD;
    /**
     * Squarelife Insurance AG
     */
    public static VersichererCode Squarelife_Insurance_AG;
    /**
     * KBC Verzekeringen S.A.
     */
    public static VersichererCode KBC_Verzekeringen_S_A;
    /**
     * ASR Levensverzekering N.V.
     */
    public static VersichererCode ASR_Levensverzekering_N_V;
    /**
     * Gable Insurance AG (in Liquidation)
     */
    public static VersichererCode Gable_Insurance_AG_in_Liquidation;
    /**
     * CHUBB European Group SE
     */
    public static VersichererCode CHUBB_European_Group_SE;
    /**
     * Generali Biztosító Zrt.
     */
    public static VersichererCode Generali_Biztos_t_Zrt;
    /**
     * Maiden Life Försäkrings AB
     */
    public static VersichererCode Maiden_Life_F_rs_krings_AB;
    /**
     * ETU Forsikring A/S
     */
    public static VersichererCode ETU_Forsikring_A_S;
    /**
     * Länsförsäkringar AB (publ)
     */
    public static VersichererCode L_nsf_rs_kringar_AB_publ;
    /**
     * UNION Vienna Insurance Group Biztosító Zrt.
     */
    public static VersichererCode UNION_Vienna_Insurance_Group_Biztos_t_Zrt;
    /**
     * Euroins Insurance JSC
     */
    public static VersichererCode Euroins_Insurance_JSC;
    /**
     * Cardif Assurances Risques Divers
     */
    public static VersichererCode Cardif_Assurances_Risques_Divers;
    /**
     * Prudential International Assurance Plc
     */
    public static VersichererCode Prudential_International_Assurance_Plc;
    /**
     * UNIQA pojišťovna, a.s.
     */
    public static VersichererCode UNIQA_poji_ovna_a_s;
    /**
     * Quatrem
     */
    public static VersichererCode Quatrem;
    /**
     * Waard Leven N.V.
     */
    public static VersichererCode Waard_Leven_N_V;
    /**
     * Den Norske Krigsforsikring for Skib Gjensidig Forening
     */
    public static VersichererCode Den_Norske_Krigsforsikring_for_Skib_Gjensidig_Forening;
    /**
     * Atlas Insurance PCC Limited
     */
    public static VersichererCode Atlas_Insurance_PCC_Limited;
    /**
     * SwissLife Prevoyance et Sante
     */
    public static VersichererCode SwissLife_Prevoyance_et_Sante;
    /**
     * Groupama Grand Est (Caisse Régionale de Réassurances Mutuelles Agricoles du Grant Est)
     */
    public static VersichererCode Groupama_Grand_Est_Caisse_R_gionale_de_R_assurances_Mutuelles_Agricoles_du_Grant_Est;
    /**
     * ORKLA Insurance Company dac
     */
    public static VersichererCode ORKLA_Insurance_Company_dac;
    /**
     * Lietuvos Draudimas, AB
     */
    public static VersichererCode Lietuvos_Draudimas_AB;
    /**
     * CAJAMAR VIDA SOCIEDAD ANONIMA DE SEGUROS Y REASEGUROS
     */
    public static VersichererCode CAJAMAR_VIDA_SOCIEDAD_ANONIMA_DE_SEGUROS_Y_REASEGUROS;
    /**
     * Ericsson Insurance (Försäkring) AB
     */
    public static VersichererCode Ericsson_Insurance_F_rs_kring_AB;
    /**
     * IDA Insurance Limited
     */
    public static VersichererCode IDA_Insurance_Limited;
    /**
     * Vishay Insurance Limited
     */
    public static VersichererCode Vishay_Insurance_Limited;
    /**
     * Twincap Försäkrings AB
     */
    public static VersichererCode Twincap_F_rs_krings_AB;
    /**
     * Groupama Phoenix Hellenic Insurance Company S.A.
     */
    public static VersichererCode Groupama_Phoenix_Hellenic_Insurance_Company_S_A;
    /**
     * Standard Life International Designated Activity Company
     */
    public static VersichererCode Standard_Life_International_Designated_Activity_Company;
    /**
     * Baloise Life (Liechtenstein) AG
     */
    public static VersichererCode Baloise_Life_Liechtenstein_AG;
    /**
     * Anker Insurance Company N.V.
     */
    public static VersichererCode Anker_Insurance_Company_N_V;
    /**
     * Salling Group Captiveforsikringsselskab A/S
     */
    public static VersichererCode Salling_Group_Captiveforsikringsselskab_A_S;
    /**
     * Caisse de Réassurance Mutuelle Agricole du Centre Manche
     */
    public static VersichererCode Caisse_de_R_assurance_Mutuelle_Agricole_du_Centre_Manche;
    /**
     * Foyer Global Health S.A.
     */
    public static VersichererCode Foyer_Global_Health_S_A;
    /**
     * Zurich Vida Compania de seguros y reaseguros S.A.
     */
    public static VersichererCode Zurich_Vida_Compania_de_seguros_y_reaseguros_S_A;
    /**
     * Lifetri Verzekeringen N.V.
     */
    public static VersichererCode Lifetri_Verzekeringen_N_V;
    /**
     * Klaverblad Schadeverzekeringsmaatschappij N.V.
     */
    public static VersichererCode Klaverblad_Schadeverzekeringsmaatschappij_N_V;
    /**
     * Danica Pension, Livsforsikringsselskab
     */
    public static VersichererCode Danica_Pension_Livsforsikringsselskab;
    /**
     * Komerční pojišťovna, a.s.
     */
    public static VersichererCode Komer_n_poji_ovna_a_s;
    /**
     * Sappisure Försäkrings AB
     */
    public static VersichererCode Sappisure_F_rs_krings_AB;
    /**
     * Axa Assurances Luxembourg
     */
    public static VersichererCode Axa_Assurances_Luxembourg;
    /**
     * Allianz Benelux SA/NV
     */
    public static VersichererCode Allianz_Benelux_SA_NV;
    /**
     * Liechtenstein Life Assurance AG
     */
    public static VersichererCode Liechtenstein_Life_Assurance_AG;
    /**
     * Stellantis Insurance Limited
     */
    public static VersichererCode Stellantis_Insurance_Limited;
    /**
     * Česká podnikatelská pojišťovna, a.s., Vienna Insurance Group
     */
    public static VersichererCode esk_podnikatelsk_poji_ovna_a_s_Vienna_Insurance_Group;
    /**
     * STELLANTIS LIFE INSURANCE LIMITED
     */
    public static VersichererCode STELLANTIS_LIFE_INSURANCE_LIMITED;
    /**
     * LV 1871 Private Assurance AG
     */
    public static VersichererCode LV_1871_Private_Assurance_AG;
    /**
     * Elips Life AG
     */
    public static VersichererCode Elips_Life_AG;
    /**
     * Mapfre Middlesea plc
     */
    public static VersichererCode Mapfre_Middlesea_plc;
    /**
     * Caisse Regionale d Assurances Mutuelles Agricoles de Rhone-Alpes Auvergne
     */
    public static VersichererCode Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_de_Rhone_Alpes_Auvergne;
    /**
     * RCI Insurance Limited
     */
    public static VersichererCode RCI_Insurance_Limited;
    /**
     * RCI Life Limited
     */
    public static VersichererCode RCI_Life_Limited;
    /**
     * RSA Insurance Ireland Designated Activity Company
     */
    public static VersichererCode RSA_Insurance_Ireland_Designated_Activity_Company;
    /**
     * DSV Insurance A/S
     */
    public static VersichererCode DSV_Insurance_A_S;
    /**
     * CRH GROUP INSURANCE SERVICES EUROPE LTD
     */
    public static VersichererCode CRH_GROUP_INSURANCE_SERVICES_EUROPE_LTD;
    /**
     * Generali Towarzystwo Ubezpieczen Spólka Akcyjna
     */
    public static VersichererCode Generali_Towarzystwo_Ubezpieczen_Sp_lka_Akcyjna;
    /**
     * Powszechny Zakład Ubezpieczeń na Życie Spółka Akcyjna
     */
    public static VersichererCode Powszechny_Zak_ad_Ubezpiecze_na_ycie_Sp_ka_Akcyjna;
    /**
     * Argoglobal Assicurazioni S.P.A.
     */
    public static VersichererCode Argoglobal_Assicurazioni_S_P_A;
    /**
     * Nissan International Insurance Limited
     */
    public static VersichererCode Nissan_International_Insurance_Limited;
    /**
     * SIGNAL IDUNA ASIGURARI S.A.
     */
    public static VersichererCode SIGNAL_IDUNA_ASIGURARI_S_A;
    /**
     * Caisse Regionale d&apos;Assurances Mutuelles Agricoles Paris Val de Loire
     */
    public static VersichererCode Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Paris_Val_de_Loire;
    /**
     * AGPM Vie
     */
    public static VersichererCode AGPM_Vie;
    /**
     * Génération Vie
     */
    public static VersichererCode G_n_ration_Vie;
    /**
     * Swiss Life Products (Luxembourg) S.A.
     */
    public static VersichererCode Swiss_Life_Products_Luxembourg_S_A;
    /**
     * BPCE Vie
     */
    public static VersichererCode BPCE_Vie;
    /**
     * Greenstars BNP Paribas S.A.
     */
    public static VersichererCode Greenstars_BNP_Paribas_S_A;
    /**
     * Associations Mutuelles Le Conservateur
     */
    public static VersichererCode Associations_Mutuelles_Le_Conservateur;
    /**
     * Forsikringsselskabet Privatsikring A/S
     */
    public static VersichererCode Forsikringsselskabet_Privatsikring_A_S;
    /**
     * Lusitania - Companhia de Seguros S.A.
     */
    public static VersichererCode Lusitania_Companhia_de_Seguros_S_A;
    /**
     * The West of England Ship Owners Mutual Insurance Association
     */
    public static VersichererCode The_West_of_England_Ship_Owners_Mutual_Insurance_Association;
    /**
     * Societe Mutuelle d&apos;Assurance du Batiment et des Travaux Publics
     */
    public static VersichererCode Societe_Mutuelle_d_Assurance_du_Batiment_et_des_Travaux_Publics;
    /**
     * Caisse Regionale d&apos;Assurances Mutuelles Agricoles Bretagne Pays de la Loire
     */
    public static VersichererCode Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Bretagne_Pays_de_la_Loire;
    /**
     * Vienna Insurance Group AG Wiener Versicherung Gruppe
     */
    public static VersichererCode Vienna_Insurance_Group_AG_Wiener_Versicherung_Gruppe;
    /**
     * AWP P&amp;C S.A.
     */
    public static VersichererCode AWP_P_C_S_A;
    /**
     * Hamilton Insurance Designated Activity Company
     */
    public static VersichererCode Hamilton_Insurance_Designated_Activity_Company;
    /**
     * Goudse Schadeverzekeringen N.V.
     */
    public static VersichererCode Goudse_Schadeverzekeringen_N_V;
    /**
     * IMA Assurances
     */
    public static VersichererCode IMA_Assurances;
    /**
     * SN SecureCorp Insurance Malta Ltd.
     */
    public static VersichererCode SN_SecureCorp_Insurance_Malta_Ltd;
    /**
     * Baloise Belgium NV/SA
     */
    public static VersichererCode Baloise_Belgium_NV_SA;
    /**
     * ZK &quot;LEV INS&quot; AD
     */
    public static VersichererCode ZK_LEV_INS_AD;
    /**
     * Advent Insurance PCC Ltd  - UIB Cell
     */
    public static VersichererCode Advent_Insurance_PCC_Ltd_UIB_Cell;
    /**
     * S.C. ALLIANZ -TIRIAC ASIGURARI S.A.
     */
    public static VersichererCode S_C_ALLIANZ_TIRIAC_ASIGURARI_S_A;
    /**
     * ABC Insurance S.A.
     */
    public static VersichererCode ABC_Insurance_S_A;
    /**
     * Caisse Régionale d`Assurances Mutuelles Agricoles d`Oc
     */
    public static VersichererCode Caisse_R_gionale_d_Assurances_Mutuelles_Agricoles_d_Oc;
    /**
     * Compensa Towarzystwo Ubezpieczen S.A. Vienna Insurance Group
     */
    public static VersichererCode Compensa_Towarzystwo_Ubezpieczen_S_A_Vienna_Insurance_Group;
    /**
     * LV 1871 Pensionsfonds AG
     */
    public static VersichererCode LV_1871_Pensionsfonds_AG;
    /**
     * APK Pensionskasse AG
     */
    public static VersichererCode APK_Pensionskasse_AG;
    /**
     * Swiss Life International Pension Fund a.s.b.l.
     */
    public static VersichererCode Swiss_Life_International_Pension_Fund_a_s_b_l;
    /**
     * Württembergische Versicherung Aktiengesellschaft
     */
    public static VersichererCode W_rttembergische_Versicherung_Aktiengesellschaft;
    /**
     * Württembergische Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode W_rttembergische_Lebensversicherung_Aktiengesellschaft;
    /**
     * Deutsche Ärzteversicherung Aktiengesellschaft
     */
    public static VersichererCode Deutsche_rzteversicherung_Aktiengesellschaft;
    /**
     * Generali Deutschland AG
     */
    public static VersichererCode Generali_Deutschland_AG;
    /**
     * Hannover Rück SE
     */
    public static VersichererCode Hannover_R_ck_SE;
    /**
     * Generali Deutschland Versicherung AG
     */
    public static VersichererCode Generali_Deutschland_Versicherung_AG;
    /**
     * Athora Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode Athora_Lebensversicherung_Aktiengesellschaft;
    /**
     * Münchener Rückversicherungs-Gesellschaft Aktiengesellschaft in München
     */
    public static VersichererCode M_nchener_R_ckversicherungs_Gesellschaft_Aktiengesellschaft_in_M_nchen;
    /**
     * ERGO Versicherung Aktiengesellschaft
     */
    public static VersichererCode ERGO_Versicherung_Aktiengesellschaft_2;
    /**
     * Allianz Lebensversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allianz_Lebensversicherungs_Aktiengesellschaft;
    /**
     * Real Garant Versicherung Aktiengesellschaft
     */
    public static VersichererCode Real_Garant_Versicherung_Aktiengesellschaft;
    /**
     * Wüstenrot &amp; Württembergische AG
     */
    public static VersichererCode W_stenrot_W_rttembergische_AG;
    /**
     * Generali Deutschland Lebensversicherung AG
     */
    public static VersichererCode Generali_Deutschland_Lebensversicherung_AG;
    /**
     * Proxalto Lebensversicherung Aktiengesellschaft c/o Viridium Group GmbH &amp; Co. KG
     */
    public static VersichererCode Proxalto_Lebensversicherung_Aktiengesellschaft_c_o_Viridium_Group_GmbH_Co_KG;
    /**
     * Versicherungskammer Bayern Versicherungsanstalt des öffentlichen Rechts
     */
    public static VersichererCode Versicherungskammer_Bayern_Versicherungsanstalt_des_ffentlichen_Rechts;
    /**
     * Bayerische Hausbesitzer-Versicherungs-Gesellschaft a.G.
     */
    public static VersichererCode Bayerische_Hausbesitzer_Versicherungs_Gesellschaft_a_G;
    /**
     * NÜRNBERGER Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode N_RNBERGER_Lebensversicherung_Aktiengesellschaft;
    /**
     * SIGNAL IDUNA Lebensversicherung a. G.
     */
    public static VersichererCode SIGNAL_IDUNA_Lebensversicherung_a_G;
    /**
     * InterRisk Lebensversicherungs-AG Vienna Insurance Group.
     */
    public static VersichererCode InterRisk_Lebensversicherungs_AG_Vienna_Insurance_Group;
    /**
     * VöV Rückversicherung KöR
     */
    public static VersichererCode V_V_R_ckversicherung_K_R;
    /**
     * Pensionskasse der Mitarbeiter der Hoechst-Gruppe VVaG
     */
    public static VersichererCode Pensionskasse_der_Mitarbeiter_der_Hoechst_Gruppe_VVaG;
    /**
     * Pensionskasse Deutscher Eisenbahnen und Straßenbahnen VVaG
     */
    public static VersichererCode Pensionskasse_Deutscher_Eisenbahnen_und_Stra_enbahnen_VVaG;
    /**
     * Allianz Private Krankenversicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allianz_Private_Krankenversicherungs_Aktiengesellschaft;
    /**
     * Generali Deutschland Krankenversicherung AG
     */
    public static VersichererCode Generali_Deutschland_Krankenversicherung_AG;
    /**
     * DKV Deutsche Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode DKV_Deutsche_Krankenversicherung_Aktiengesellschaft;
    /**
     * Gothaer Krankenversicherung Aktiengesellschaft
     */
    public static VersichererCode Gothaer_Krankenversicherung_Aktiengesellschaft;
    /**
     * Debeka Krankenversicherungsverein auf Gegenseitigkeit Sitz Koblenz am Rhein
     */
    public static VersichererCode Debeka_Krankenversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein;
    /**
     * Allianz Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Allianz_Versicherungs_Aktiengesellschaft;
    /**
     * HUK-COBURG Haftpflicht-Unterstützungs-Kasse kraftfahrender Beamter Deutschlands a.G. in Coburg
     */
    public static VersichererCode HUK_COBURG_Haftpflicht_Unterst_tzungs_Kasse_kraftfahrender_Beamter_Deutschlands_a_G_in_Coburg;
    /**
     * Hamburger Feuerkasse Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode Hamburger_Feuerkasse_Versicherungs_Aktiengesellschaft;
    /**
     * ERGO Lebensversicherung Aktiengesellschaft
     */
    public static VersichererCode ERGO_Lebensversicherung_Aktiengesellschaft;
    /**
     * Mecklenburgische Versicherungs-Gesellschaft auf Gegenseitigkeit
     */
    public static VersichererCode Mecklenburgische_Versicherungs_Gesellschaft_auf_Gegenseitigkeit;
    /**
     * RheinLand Versicherungs Aktiengesellschaft
     */
    public static VersichererCode RheinLand_Versicherungs_Aktiengesellschaft;
    /**
     * SIGNAL IDUNA Unfallversicherung a. G.
     */
    public static VersichererCode SIGNAL_IDUNA_Unfallversicherung_a_G;
    /**
     * Provinzial Holding Aktiengesellschaft
     */
    public static VersichererCode Provinzial_Holding_Aktiengesellschaft;
    /**
     * S DirektVersicherung Aktiengesellschaft
     */
    public static VersichererCode S_DirektVersicherung_Aktiengesellschaft;
    /**
     * HDI Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode HDI_Pensionsfonds_Aktiengesellschaft;
    /**
     * Allianz Pensionskasse Aktiengesellschaft
     */
    public static VersichererCode Allianz_Pensionskasse_Aktiengesellschaft;
    /**
     * Frankfurter Pensionskasse AG
     */
    public static VersichererCode Frankfurter_Pensionskasse_AG;
    /**
     * Sparkassen Pensionsfonds AG
     */
    public static VersichererCode Sparkassen_Pensionsfonds_AG;
    /**
     * Continentale Krankenversicherung a.G.
     */
    public static VersichererCode Continentale_Krankenversicherung_a_G;
    /**
     * HUK-COBURG-Holding AG
     */
    public static VersichererCode HUK_COBURG_Holding_AG;
    /**
     * EXTREMUS Versicherungs-Aktiengesellschaft
     */
    public static VersichererCode EXTREMUS_Versicherungs_Aktiengesellschaft;
    /**
     * DEVK Pensionsfonds Aktiengesellschaft
     */
    public static VersichererCode DEVK_Pensionsfonds_Aktiengesellschaft;
    /**
     * ALTE OLDENBURGER Krankenversicherung AG
     */
    public static VersichererCode ALTE_OLDENBURGER_Krankenversicherung_AG;
    /**
     * KUKE S.A.
     */
    public static VersichererCode KUKE_S_A;
    /**
     * TVM verzekeringen N.V.
     */
    public static VersichererCode TVM_verzekeringen_N_V;
    /**
     * ERGO Insurance NV
     */
    public static VersichererCode ERGO_Insurance_NV;
    /**
     * Lifestyle Protection Lebensversicherung AG
     */
    public static VersichererCode Lifestyle_Protection_Lebensversicherung_AG;
    /**
     * Lifestyle Protection AG
     */
    public static VersichererCode Lifestyle_Protection_AG;
    /**
     * N.V. EUROMEX
     */
    public static VersichererCode N_V_EUROMEX;
    /**
     * Alm. Brand Forsikring A/S
     */
    public static VersichererCode Alm_Brand_Forsikring_A_S;
    /**
     * Solunion Seguros de Credito Compania Internacional de Seguros y Reaseguros S.A.
     */
    public static VersichererCode Solunion_Seguros_de_Credito_Compania_Internacional_de_Seguros_y_Reaseguros_S_A;
    /**
     * RIVERSTONE INSURANCE (MALTA) SE
     */
    public static VersichererCode RIVERSTONE_INSURANCE_MALTA_SE;
    /**
     * Pan Insurance dac
     */
    public static VersichererCode Pan_Insurance_dac;
    /**
     * Arch Insurance (EU) Designated Activity Company
     */
    public static VersichererCode Arch_Insurance_EU_Designated_Activity_Company;
    /**
     * DAS Nederlandse Rechtsbijstand Verzekeringmaatschappij NV
     */
    public static VersichererCode DAS_Nederlandse_Rechtsbijstand_Verzekeringmaatschappij_NV;
    /**
     * OOM Schadeverzekering N.V.
     */
    public static VersichererCode OOM_Schadeverzekering_N_V;
    /**
     * Notarversicherungsverein a.G.
     */
    public static VersichererCode Notarversicherungsverein_a_G;
    /**
     * Generali España de Seguros y Reaseguros, S.A.
     */
    public static VersichererCode Generali_Espa_a_de_Seguros_y_Reaseguros_S_A;
    /**
     * Axa Seguros Generales S.A. de Seguros y Reaseguros
     */
    public static VersichererCode Axa_Seguros_Generales_S_A_de_Seguros_y_Reaseguros;
    /**
     * Steadfast Insurance Partners Limited
     */
    public static VersichererCode Steadfast_Insurance_Partners_Limited;
    /**
     * CNP Santander Insurance Europe Designated Activity Company
     */
    public static VersichererCode CNP_Santander_Insurance_Europe_Designated_Activity_Company;
    /**
     * CNP Santander Insurance Life Designated Activity Company
     */
    public static VersichererCode CNP_Santander_Insurance_Life_Designated_Activity_Company;
    /**
     * Compagnie Francaise d Assurance pour le Commerce Extérieur S.A. (COFACE), Niederlassung in Deutschland
     */
    public static VersichererCode Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_S_A_COFACE_Niederlassung_in_Deutschland;
    /**
     * WERTGARANTIE SE
     */
    public static VersichererCode WERTGARANTIE_SE;
    /**
     * MetLife Europe dac
     */
    public static VersichererCode MetLife_Europe_dac;
    /**
     * Generali Zycie Towarzystwo Ubezpieczen S.A.
     */
    public static VersichererCode Generali_Zycie_Towarzystwo_Ubezpieczen_S_A;
    /**
     * ONIX Asigurari S.A.
     */
    public static VersichererCode ONIX_Asigurari_S_A;
    /**
     * AEGIDIUS SE
     */
    public static VersichererCode AEGIDIUS_SE;
    /**
     * Volkswagen Insurance Company dac
     */
    public static VersichererCode Volkswagen_Insurance_Company_dac;
    /**
     * Lucura Versicherungs AG
     */
    public static VersichererCode Lucura_Versicherungs_AG;
    /**
     * Groupama Biztosító Zártkörüen Müködö Részvénytársaság
     */
    public static VersichererCode Groupama_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g;
    /**
     * WTW Pensionsfonds AG
     */
    public static VersichererCode WTW_Pensionsfonds_AG;
    /**
     * Allianz Global Life Designated Activity Company
     */
    public static VersichererCode Allianz_Global_Life_Designated_Activity_Company;
    /**
     * Sociedad de Seguros Mutuos Marítimos De Vigo, Mutualidad de Seguros Y Reaseguros A Prima Fija
     */
    public static VersichererCode Sociedad_de_Seguros_Mutuos_Mar_timos_De_Vigo_Mutualidad_de_Seguros_Y_Reaseguros_A_Prima_Fija;
    /**
     * UNIQA Österreich Versicherungen AG, Wien
     */
    public static VersichererCode UNIQA_sterreich_Versicherungen_AG_Wien;
    /**
     * Volkswagen Autoversicherung AG
     */
    public static VersichererCode Volkswagen_Autoversicherung_AG;
    /**
     * Nordisk Marinförsäkring AB
     */
    public static VersichererCode Nordisk_Marinf_rs_kring_AB;
    /**
     * DELA Natura- en levensverzekeringen N.V.
     */
    public static VersichererCode DELA_Natura_en_levensverzekeringen_N_V;
    /**
     * CROATIA osiguranje d.d.
     */
    public static VersichererCode CROATIA_osiguranje_d_d;
    /**
     * Generali Osiguranje d.d.
     */
    public static VersichererCode Generali_Osiguranje_d_d;
    /**
     * Allianz Vie S.A.
     */
    public static VersichererCode Allianz_Vie_S_A;
    /**
     * MetLife Europe Insurance dac
     */
    public static VersichererCode MetLife_Europe_Insurance_dac;
    /**
     * Accredited Insurance (Europe) Limited
     */
    public static VersichererCode Accredited_Insurance_Europe_Limited;
    /**
     * BD24 Berlin Direkt Versicherung AG
     */
    public static VersichererCode BD24_Berlin_Direkt_Versicherung_AG;
    /**
     * Inser AG
     */
    public static VersichererCode Inser_AG;
    /**
     * VERKA PK Kirchliche Pensionskasse AG
     */
    public static VersichererCode VERKA_PK_Kirchliche_Pensionskasse_AG;
    /**
     * Stonefort Insurance S.A.
     */
    public static VersichererCode Stonefort_Insurance_S_A;
    /**
     * iptiQ Life S.A., Niederlassung Deutschland
     */
    public static VersichererCode iptiQ_Life_S_A_Niederlassung_Deutschland;
    /**
     * Euler Hermes Deutschland Niederlassung der Euler Hermes SA
     */
    public static VersichererCode Euler_Hermes_Deutschland_Niederlassung_der_Euler_Hermes_SA;
    /**
     * AFI ESCA Luxembourg S.A.
     */
    public static VersichererCode AFI_ESCA_Luxembourg_S_A;
    /**
     * AWP Health &amp; Life SA
     */
    public static VersichererCode AWP_Health_Life_SA;
    /**
     * Metzler Pensionsfonds AG
     */
    public static VersichererCode Metzler_Pensionsfonds_AG;
    /**
     * Bulstrad Life Vienna Insurance Group JSC
     */
    public static VersichererCode Bulstrad_Life_Vienna_Insurance_Group_JSC;
    /**
     * Arkema Insurance dac
     */
    public static VersichererCode Arkema_Insurance_dac;
    /**
     * Greenval Insurance dac
     */
    public static VersichererCode Greenval_Insurance_dac;
    /**
     * CHUBB Life Europe SE
     */
    public static VersichererCode CHUBB_Life_Europe_SE;
    /**
     * SOGESSUR S.A. Deutsche Niederlassung
     */
    public static VersichererCode SOGESSUR_S_A_Deutsche_Niederlassung;
    /**
     * HSBC Life Assurance (Malta) Limited
     */
    public static VersichererCode HSBC_Life_Assurance_Malta_Limited;
    /**
     * QIC Europe Ltd
     */
    public static VersichererCode QIC_Europe_Ltd;
    /**
     * HDI Global Specialty SE
     */
    public static VersichererCode HDI_Global_Specialty_SE;
    /**
     * AXA Life Europe Designated Activity Company
     */
    public static VersichererCode AXA_Life_Europe_Designated_Activity_Company;
    /**
     * Gard Marine &amp; Energy Insurance (Europe) AS
     */
    public static VersichererCode Gard_Marine_Energy_Insurance_Europe_AS;
    /**
     * Wiener osiguranje Vienna Insurance Group d.d.
     */
    public static VersichererCode Wiener_osiguranje_Vienna_Insurance_Group_d_d;
    /**
     * Achmea Pensioen- en Levensverzekeringen N.V.
     */
    public static VersichererCode Achmea_Pensioen_en_Levensverzekeringen_N_V;
    /**
     * Holmia Livförsäkring AB
     */
    public static VersichererCode Holmia_Livf_rs_kring_AB;
    /**
     * RiverStone International Ireland DAC
     */
    public static VersichererCode RiverStone_International_Ireland_DAC;
    /**
     * Triglav Osiguranje d.d.
     */
    public static VersichererCode Triglav_Osiguranje_d_d;
    /**
     * Nautilus Indemnity (Europe) dac
     */
    public static VersichererCode Nautilus_Indemnity_Europe_dac;
    /**
     * MMA IARD SA
     */
    public static VersichererCode MMA_IARD_SA;
    /**
     * MSIG Europe SE
     */
    public static VersichererCode MSIG_Europe_SE;
    /**
     * enovetic pension fund (assep)
     */
    public static VersichererCode enovetic_pension_fund_assep;
    /**
     * Groupama Gan Vie S.A.
     */
    public static VersichererCode Groupama_Gan_Vie_S_A;
    /**
     * Vital Blue Insurance dac
     */
    public static VersichererCode Vital_Blue_Insurance_dac;
    /**
     * Fonds de Garantie Voyages AAM
     */
    public static VersichererCode Fonds_de_Garantie_Voyages_AAM;
    /**
     * ITAS- Instituto Trentino Alto Adige per Assicurazioni Società Mutua di Assicurazioni
     */
    public static VersichererCode ITAS_Instituto_Trentino_Alto_Adige_per_Assicurazioni_Societ_Mutua_di_Assicurazioni;
    /**
     * W. R. Berkley Europe AG Niederlassung für Deutschland
     */
    public static VersichererCode W_R_Berkley_Europe_AG_Niederlassung_f_r_Deutschland;
    /**
     * Generali Zavarovalnica d.d.
     */
    public static VersichererCode Generali_Zavarovalnica_d_d;
    /**
     * Mercedes-Benz Versicherung AG
     */
    public static VersichererCode Mercedes_Benz_Versicherung_AG;
    /**
     * STELLANTIS INSURANCE EUROPE LIMITED
     */
    public static VersichererCode STELLANTIS_INSURANCE_EUROPE_LIMITED;
    /**
     * STELLANTIS LIFE INSURANCE EUROPE LIMITED
     */
    public static VersichererCode STELLANTIS_LIFE_INSURANCE_EUROPE_LIMITED;
    /**
     * OWM Zorgverzekeraar Zorg en Zekerheid U.A.
     */
    public static VersichererCode OWM_Zorgverzekeraar_Zorg_en_Zekerheid_U_A;
    /**
     * N.V. Univé Zorg
     */
    public static VersichererCode N_V_Univ_Zorg;
    /**
     * VGZ Zorgverzekeraar N.V.
     */
    public static VersichererCode VGZ_Zorgverzekeraar_N_V;
    /**
     * IZA Zorgverzekeraar N.V.
     */
    public static VersichererCode IZA_Zorgverzekeraar_N_V;
    /**
     * N.V. Zorgverzekeraar UMC
     */
    public static VersichererCode N_V_Zorgverzekeraar_UMC;
    /**
     * Interpolis Zorgverzekeringen N.V.
     */
    public static VersichererCode Interpolis_Zorgverzekeringen_N_V;
    /**
     * Achmea Zorgverzekeringen N.V.
     */
    public static VersichererCode Achmea_Zorgverzekeringen_N_V;
    /**
     * Zilveren Kruis Zorgverzekeringen N.V.
     */
    public static VersichererCode Zilveren_Kruis_Zorgverzekeringen_N_V;
    /**
     * PRUDENTIA Pensionskasse AG
     */
    public static VersichererCode PRUDENTIA_Pensionskasse_AG;
    /**
     * CNP Luxembourg S.A.
     */
    public static VersichererCode CNP_Luxembourg_S_A;
    /**
     * De Friesland Zorgverzekeraar N.V.
     */
    public static VersichererCode De_Friesland_Zorgverzekeraar_N_V;
    /**
     * FBTO Zorgverzekeringen N.V.
     */
    public static VersichererCode FBTO_Zorgverzekeringen_N_V;
    /**
     * Anderzorg N.V.
     */
    public static VersichererCode Anderzorg_N_V;
    /**
     * Centrale Zorgverzekeringen NZV N.V.
     */
    public static VersichererCode Centrale_Zorgverzekeringen_NZV_N_V;
    /**
     * Onderlinge Waarborgmaatschappij DSW Zorgverzekeraar U.A.
     */
    public static VersichererCode Onderlinge_Waarborgmaatschappij_DSW_Zorgverzekeraar_U_A;
    /**
     * DSW Ziektekostenverzekeringen N.V.
     */
    public static VersichererCode DSW_Ziektekostenverzekeringen_N_V;
    /**
     * Menzis N.V.
     */
    public static VersichererCode Menzis_N_V;
    /**
     * Menzis Zorgverzekeraar N.V.
     */
    public static VersichererCode Menzis_Zorgverzekeraar_N_V;
    /**
     * OHRA Zorgverzekeringen N.V.
     */
    public static VersichererCode OHRA_Zorgverzekeringen_N_V;
    /**
     * Onderlinge Waarborgmaatschappij CZ groep U.A.
     */
    public static VersichererCode Onderlinge_Waarborgmaatschappij_CZ_groep_U_A;
    /**
     * Stad Holland Zorgverzekeraar Onderlinge Waarborgmaatschappij U.A.
     */
    public static VersichererCode Stad_Holland_Zorgverzekeraar_Onderlinge_Waarborgmaatschappij_U_A;
    /**
     * Colonnade Insurance S.A.
     */
    public static VersichererCode Colonnade_Insurance_S_A;
    /**
     * ASR Aanvullende Ziektekostenverzekeringen N.V.
     */
    public static VersichererCode ASR_Aanvullende_Ziektekostenverzekeringen_N_V;
    /**
     * ASR Basis Ziektekostenverzekeringen N.V.
     */
    public static VersichererCode ASR_Basis_Ziektekostenverzekeringen_N_V;
    /**
     * ADB &quot;Compensa Vienna Insurance Group&quot;
     */
    public static VersichererCode ADB_Compensa_Vienna_Insurance_Group;
    /**
     * Salland Zorgverzekeraar N.V.
     */
    public static VersichererCode Salland_Zorgverzekeraar_N_V;
    /**
     * Salland Aanvullende Verzekeringen N.V.
     */
    public static VersichererCode Salland_Aanvullende_Verzekeringen_N_V;
    /**
     * MAPFRE España, Compañia de Seguros y Reaseguros S.A.
     */
    public static VersichererCode MAPFRE_Espa_a_Compa_ia_de_Seguros_y_Reaseguros_S_A;
    /**
     * KLPP Insurance &amp; Reinsurance Company Limited
     */
    public static VersichererCode KLPP_Insurance_Reinsurance_Company_Limited;
    /**
     * CDA 40 ZAVAROVALNICA D.D. - v likvidaciji
     */
    public static VersichererCode CDA_40_ZAVAROVALNICA_D_D_v_likvidaciji;
    /**
     * Wakam
     */
    public static VersichererCode Wakam;
    /**
     * Hillwood Limited
     */
    public static VersichererCode Hillwood_Limited;
    /**
     * CNP CAUTION
     */
    public static VersichererCode CNP_CAUTION;
    /**
     * Insurance JSC &quot;DallBogg: Life and Health&quot; AD
     */
    public static VersichererCode Insurance_JSC_DallBogg_Life_and_Health_AD;
    /**
     * MBDA Insurance dac
     */
    public static VersichererCode MBDA_Insurance_dac;
    /**
     * INTER Krankenversicherung AG
     */
    public static VersichererCode INTER_Krankenversicherung_AG;
    /**
     * MÜNCHENER VEREIN Lebensversicherung AG
     */
    public static VersichererCode M_NCHENER_VEREIN_Lebensversicherung_AG;
    /**
     * Atradius Kreditversicherung, Niederlassung der Atradius Crédito y Caución S.A. de Seguros y Reaseguros
     */
    public static VersichererCode Atradius_Kreditversicherung_Niederlassung_der_Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros;
    /**
     * AXA Wealth Europe S.A.
     */
    public static VersichererCode AXA_Wealth_Europe_S_A;
    /**
     * W. R. Berkley Europe AG
     */
    public static VersichererCode W_R_Berkley_Europe_AG;
    /**
     * Entis Lebensversicherung AG
     */
    public static VersichererCode Entis_Lebensversicherung_AG;
    /**
     * METRO Re AG
     */
    public static VersichererCode METRO_Re_AG;
    /**
     * Atradius Crédito y Caución S.A. de Seguros y Reaseguros
     */
    public static VersichererCode Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros;
    /**
     * Astra Versicherung AG
     */
    public static VersichererCode Astra_Versicherung_AG;
    /**
     * INTER Versicherungsverein aG
     */
    public static VersichererCode INTER_Versicherungsverein_aG;
    /**
     * ICARE Assurance
     */
    public static VersichererCode ICARE_Assurance;
    /**
     * Sofinsod Insurance dac
     */
    public static VersichererCode Sofinsod_Insurance_dac;
    /**
     * Zavarovalnica Sava, zavarovalna družba d.d.
     */
    public static VersichererCode Zavarovalnica_Sava_zavarovalna_dru_ba_d_d;
    /**
     * Vakuutusosakeyhtiö Bothnia international Zweigniederlassung Deutschland c/o Compre Services (Germany) GmbH
     */
    public static VersichererCode Vakuutusosakeyhti_Bothnia_international_Zweigniederlassung_Deutschland_c_o_Compre_Services_Germany_GmbH;
    /**
     * Alandia Försäkring Abp
     */
    public static VersichererCode Alandia_F_rs_kring_Abp;
    /**
     * Great Lakes Insurance SE
     */
    public static VersichererCode Great_Lakes_Insurance_SE;
    /**
     * Maiden General Försäkrings AB
     */
    public static VersichererCode Maiden_General_F_rs_krings_AB;
    /**
     * Race Seguros y Reaseguros, S.A.
     */
    public static VersichererCode Race_Seguros_y_Reaseguros_S_A;
    /**
     * StarStone Insurance SE
     */
    public static VersichererCode StarStone_Insurance_SE;
    /**
     * Oney Life (PCC) Limited
     */
    public static VersichererCode Oney_Life_PCC_Limited;
    /**
     * Oney Insurance (PCC) Limited
     */
    public static VersichererCode Oney_Insurance_PCC_Limited;
    /**
     * ACTA Assurance SA
     */
    public static VersichererCode ACTA_Assurance_SA;
    /**
     * HAMBURGER PENSIONSFONDS Pensionsfondsverein auf Gegenseitigkeit
     */
    public static VersichererCode HAMBURGER_PENSIONSFONDS_Pensionsfondsverein_auf_Gegenseitigkeit;
    /**
     * Dortmunder Lebensversicherung AG
     */
    public static VersichererCode Dortmunder_Lebensversicherung_AG;
    /**
     * FM Insurance Europe S.A., Niederlassung für Deutschland
     */
    public static VersichererCode FM_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland;
    /**
     * Insurance Company &quot;Asset Insurance&quot; AD
     */
    public static VersichererCode Insurance_Company_Asset_Insurance_AD;
    /**
     * ottonova Krankenversicherung AG
     */
    public static VersichererCode ottonova_Krankenversicherung_AG;
    /**
     * Munich Re PCC Limited
     */
    public static VersichererCode Munich_Re_PCC_Limited;
    /**
     * Relyens Mutual Insurance Niederlassung Deutschland
     */
    public static VersichererCode Relyens_Mutual_Insurance_Niederlassung_Deutschland;
    /**
     * Baloise Assurances Luxembourg S.A.
     */
    public static VersichererCode Baloise_Assurances_Luxembourg_S_A;
    /**
     * ELEMENT Insurance AG
     */
    public static VersichererCode ELEMENT_Insurance_AG;
    /**
     * Chaucer Insurance Company Designated Activity Company
     */
    public static VersichererCode Chaucer_Insurance_Company_Designated_Activity_Company;
    /**
     * GF Forsikring A/S
     */
    public static VersichererCode GF_Forsikring_A_S;
    /**
     * Tryg Deutschland, Niederlassung der Tryg Forsikring A/S
     */
    public static VersichererCode Tryg_Deutschland_Niederlassung_der_Tryg_Forsikring_A_S;
    /**
     * Beazley Insurance dac
     */
    public static VersichererCode Beazley_Insurance_dac;
    /**
     * Beazley Insurance dac
     */
    public static VersichererCode Beazley_Insurance_dac_2;
    /**
     * Generali România Asigurare Reasigurare S.A.
     */
    public static VersichererCode Generali_Rom_nia_Asigurare_Reasigurare_S_A;
    /**
     * UNIQA Towarzystwo Ubezpieczen S.A.
     */
    public static VersichererCode UNIQA_Towarzystwo_Ubezpieczen_S_A;
    /**
     * CGPA Europe S.A.
     */
    public static VersichererCode CGPA_Europe_S_A;
    /**
     * Mercer Pensionsfonds AG
     */
    public static VersichererCode Mercer_Pensionsfonds_AG;
    /**
     * DELA Lebensversicherungen Zweigniederlassung der DELA Natura-en levensverzekeringen N.V. Eindhoven
     */
    public static VersichererCode DELA_Lebensversicherungen_Zweigniederlassung_der_DELA_Natura_en_levensverzekeringen_N_V_Eindhoven;
    /**
     * NN Insurance Belgium SA
     */
    public static VersichererCode NN_Insurance_Belgium_SA;
    /**
     * Öffentliche Lebensversicherung Sachsen-Anhalt
     */
    public static VersichererCode ffentliche_Lebensversicherung_Sachsen_Anhalt;
    /**
     * Öffentliche Feuerversicherung Sachsen-Anhalt
     */
    public static VersichererCode ffentliche_Feuerversicherung_Sachsen_Anhalt;
    /**
     * Everest Insurance (Ireland) dac
     */
    public static VersichererCode Everest_Insurance_Ireland_dac;
    /**
     * DCC Group Insurances Designated Activity Company
     */
    public static VersichererCode DCC_Group_Insurances_Designated_Activity_Company;
    /**
     * FM Insurance Europe S.A.
     */
    public static VersichererCode FM_Insurance_Europe_S_A;
    /**
     * Bankia Mapfre Vida, Sociedad Anónima de Seguros y Reaseguros
     */
    public static VersichererCode Bankia_Mapfre_Vida_Sociedad_An_nima_de_Seguros_y_Reaseguros;
    /**
     * VIA Versicherung AG
     */
    public static VersichererCode VIA_Versicherung_AG;
    /**
     * AIG Europe S.A., Direktion für Deutschland
     */
    public static VersichererCode AIG_Europe_S_A_Direktion_f_r_Deutschland;
    /**
     * Ambra Versicherung AG
     */
    public static VersichererCode Ambra_Versicherung_AG;
    /**
     * VIG RE zajišťovna, a.s., Niederlassung Deutschland
     */
    public static VersichererCode VIG_RE_zaji_ovna_a_s_Niederlassung_Deutschland;
    /**
     * Neodigital Versicherung AG
     */
    public static VersichererCode Neodigital_Versicherung_AG;
    /**
     * UnitedHealthcare Insurance Designated Activity Company
     */
    public static VersichererCode UnitedHealthcare_Insurance_Designated_Activity_Company;
    /**
     * QBE Europe SA/NV Direktion für Deutschland
     */
    public static VersichererCode QBE_Europe_SA_NV_Direktion_f_r_Deutschland;
    /**
     * Fortegra Europe Insurance Company SE
     */
    public static VersichererCode Fortegra_Europe_Insurance_Company_SE;
    /**
     * UNOFI Assurances S.A.
     */
    public static VersichererCode UNOFI_Assurances_S_A;
    /**
     * Mercedes-Benz Pensionsfonds AG c/o Mercer Deutschland GmbH
     */
    public static VersichererCode Mercedes_Benz_Pensionsfonds_AG_c_o_Mercer_Deutschland_GmbH;
    /**
     * Mangrove Insurance Europe PCC Ltd
     */
    public static VersichererCode Mangrove_Insurance_Europe_PCC_Ltd;
    /**
     * Markel Insurance SE
     */
    public static VersichererCode Markel_Insurance_SE;
    /**
     * SI Insurance (Europe), SA Zweigniederlassung Deutschland
     */
    public static VersichererCode SI_Insurance_Europe_SA_Zweigniederlassung_Deutschland;
    /**
     * HISCOX SA, Niederlassung für Deutschland
     */
    public static VersichererCode HISCOX_SA_Niederlassung_f_r_Deutschland;
    /**
     * Albingia S.A.
     */
    public static VersichererCode Albingia_S_A;
    /**
     * QBE Europe SA/NV
     */
    public static VersichererCode QBE_Europe_SA_NV;
    /**
     * Mutuelle des Étudiants de Provence
     */
    public static VersichererCode Mutuelle_des_tudiants_de_Provence;
    /**
     * Lloyd&apos;s Insurance Company S.A., Niederlassung für Deutschland
     */
    public static VersichererCode Lloyd_s_Insurance_Company_S_A_Niederlassung_f_r_Deutschland;
    /**
     * Lloyd&apos;s Insurance Company S.A.
     */
    public static VersichererCode Lloyd_s_Insurance_Company_S_A;
    /**
     * Intact Insurance (Europe) S.A. &quot;Niederlassung für Deutschland&quot;
     */
    public static VersichererCode Intact_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland;
    /**
     * Nationale-Nederlanden Schadeverzekering Maatschappij N.V.
     */
    public static VersichererCode Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V;
    /**
     * Tokio Marine Europe S.A. - Zweigniederlassung für Deutschland
     */
    public static VersichererCode Tokio_Marine_Europe_S_A_Zweigniederlassung_f_r_Deutschland;
    /**
     * Premia Insurance Europe SA
     */
    public static VersichererCode Premia_Insurance_Europe_SA;
    /**
     * AXA France IARD S.A., Zweigniederlassung Deutschland
     */
    public static VersichererCode AXA_France_IARD_S_A_Zweigniederlassung_Deutschland;
    /**
     * AXA France Vie S.A., Zweigniederlassung Deutschland
     */
    public static VersichererCode AXA_France_Vie_S_A_Zweigniederlassung_Deutschland;
    /**
     * SI Insurance (Europe), SA
     */
    public static VersichererCode SI_Insurance_Europe_SA;
    /**
     * CNA Insurance Company (Europe) S.A.
     */
    public static VersichererCode CNA_Insurance_Company_Europe_S_A;
    /**
     * Aviva Insurance Ireland dac
     */
    public static VersichererCode Aviva_Insurance_Ireland_dac;
    /**
     * Tokio Marine Europe S.A.
     */
    public static VersichererCode Tokio_Marine_Europe_S_A;
    /**
     * AIG Europe S.A.
     */
    public static VersichererCode AIG_Europe_S_A;
    /**
     * Ansvar Verzekeringsmaatschappij N.V.
     */
    public static VersichererCode Ansvar_Verzekeringsmaatschappij_N_V;
    /**
     * andsafe Aktiengesellschaft
     */
    public static VersichererCode andsafe_Aktiengesellschaft;
    /**
     * HISCOX S.A.
     */
    public static VersichererCode HISCOX_S_A;
    /**
     * Mutuaide Assistance S.A.
     */
    public static VersichererCode Mutuaide_Assistance_S_A;
    /**
     * Fidelis Insurance Ireland Designated Activity Company
     */
    public static VersichererCode Fidelis_Insurance_Ireland_Designated_Activity_Company;
    /**
     * USAA EU Designated Activity Company Frankfurt Claims Branch
     */
    public static VersichererCode USAA_EU_Designated_Activity_Company_Frankfurt_Claims_Branch;
    /**
     * CNA Insurance Company (Europe) S.A.
     */
    public static VersichererCode CNA_Insurance_Company_Europe_S_A_2;
    /**
     * USAA EU Designated Activity Company
     */
    public static VersichererCode USAA_EU_Designated_Activity_Company;
    /**
     * Berkshire Hathaway European Insurance DAC, Deutschland
     */
    public static VersichererCode Berkshire_Hathaway_European_Insurance_DAC_Deutschland;
    /**
     * SCOR Europe SE
     */
    public static VersichererCode SCOR_Europe_SE;
    /**
     * Starr Europe Insurance Limited
     */
    public static VersichererCode Starr_Europe_Insurance_Limited;
    /**
     * Bavaria Reinsurance Malta Limited
     */
    public static VersichererCode Bavaria_Reinsurance_Malta_Limited;
    /**
     * Mapfre Seguros Gerais, S.A.
     */
    public static VersichererCode Mapfre_Seguros_Gerais_S_A;
    /**
     * Aviva Life &amp; Pensions Ireland Designated Activity Company
     */
    public static VersichererCode Aviva_Life_Pensions_Ireland_Designated_Activity_Company;
    /**
     * Royal London Insurance dac
     */
    public static VersichererCode Royal_London_Insurance_dac;
    /**
     * Bupa Global DAC
     */
    public static VersichererCode Bupa_Global_DAC;
    /**
     * UNIQA Biztosító Zártkörűen Működő Részvénytársaság
     */
    public static VersichererCode UNIQA_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g;
    /**
     * TK Pensionsfonds AG
     */
    public static VersichererCode TK_Pensionsfonds_AG;
    /**
     * Generali Luxembourg S.A.
     */
    public static VersichererCode Generali_Luxembourg_S_A;
    /**
     * NorthStandard EU DAC
     */
    public static VersichererCode NorthStandard_EU_DAC;
    /**
     * Talanx Aktiengesellschaft
     */
    public static VersichererCode Talanx_Aktiengesellschaft;
    /**
     * Barmenia Versicherungen a.G.
     */
    public static VersichererCode Barmenia_Versicherungen_a_G;
    /**
     * The Britannia Steam Ship Insurance Association Europe M.A.
     */
    public static VersichererCode The_Britannia_Steam_Ship_Insurance_Association_Europe_M_A;
    /**
     * Travelers Insurance Designated Activity Company
     */
    public static VersichererCode Travelers_Insurance_Designated_Activity_Company;
    /**
     * Starr Europe Insurance Limited, Germany
     */
    public static VersichererCode Starr_Europe_Insurance_Limited_Germany;
    /**
     * La Mondiale Partenaire S.A
     */
    public static VersichererCode La_Mondiale_Partenaire_S_A;
    /**
     * La Mondiale S.A.
     */
    public static VersichererCode La_Mondiale_S_A;
    /**
     * Standard Life Versicherung, Zweigniederlassung Deutschland der Standard Life International Designated Activity Company
     */
    public static VersichererCode Standard_Life_Versicherung_Zweigniederlassung_Deutschland_der_Standard_Life_International_Designated_Activity_Company;
    /**
     * Monument Life Insurance DAC
     */
    public static VersichererCode Monument_Life_Insurance_DAC;
    /**
     * Berkshire Hathaway European Insurance Designated Activity Company
     */
    public static VersichererCode Berkshire_Hathaway_European_Insurance_Designated_Activity_Company;
    /**
     * AXA Insurance dac
     */
    public static VersichererCode AXA_Insurance_dac;
    /**
     * Satrex SA
     */
    public static VersichererCode Satrex_SA;
    /**
     * Domestic &amp; General Insurance Europe AG
     */
    public static VersichererCode Domestic_General_Insurance_Europe_AG;
    /**
     * Newline Europe Versicherung AG
     */
    public static VersichererCode Newline_Europe_Versicherung_AG;
    /**
     * Dialog Versicherung Aktiengesellschaft
     */
    public static VersichererCode Dialog_Versicherung_Aktiengesellschaft;
    /**
     * Collinson Insurance Europe Limited
     */
    public static VersichererCode Collinson_Insurance_Europe_Limited;
    /**
     * Actua Schadeverzekering N.V.
     */
    public static VersichererCode Actua_Schadeverzekering_N_V;
    /**
     * UK P&amp;I Club N.V.
     */
    public static VersichererCode UK_P_I_Club_N_V;
    /**
     * Nordic Guarantee Försäkringsaktiebolag
     */
    public static VersichererCode Nordic_Guarantee_F_rs_kringsaktiebolag;
    /**
     * Viridium Rückversicherung AG
     */
    public static VersichererCode Viridium_R_ckversicherung_AG;
    /**
     * Opteven Assurances S.A.
     */
    public static VersichererCode Opteven_Assurances_S_A;
    /**
     * Bastion Insurance Company Limited
     */
    public static VersichererCode Bastion_Insurance_Company_Limited;
    /**
     * Lemonade Insurance N.V.
     */
    public static VersichererCode Lemonade_Insurance_N_V;
    /**
     * Barmenia Krankenversicherung AG
     */
    public static VersichererCode Barmenia_Krankenversicherung_AG;
    /**
     * First European Title Insurance Company Limited
     */
    public static VersichererCode First_European_Title_Insurance_Company_Limited;
    /**
     * TransRe Europe S.A., Munich Branch
     */
    public static VersichererCode TransRe_Europe_S_A_Munich_Branch;
    /**
     * Towarzystwo Ubezpieczeń Wzajemnych Polski Zakład Ubezpieczeń Wzajemnych
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_Wzajemnych_Polski_Zak_ad_Ubezpiecze_Wzajemnych;
    /**
     * Europ Assistance SA, Niederlassung für Deutschland
     */
    public static VersichererCode Europ_Assistance_SA_Niederlassung_f_r_Deutschland;
    /**
     * POUEY RENSEIGNEMENT COMMERCIAL GARANTI SA
     */
    public static VersichererCode POUEY_RENSEIGNEMENT_COMMERCIAL_GARANTI_SA;
    /**
     * BANKINTER SEGUROS GENERALES, S.A. DE SEGUROS Y REASEGUROS
     */
    public static VersichererCode BANKINTER_SEGUROS_GENERALES_S_A_DE_SEGUROS_Y_REASEGUROS;
    /**
     * Assured Guaranty (Europe) S.A.
     */
    public static VersichererCode Assured_Guaranty_Europe_S_A;
    /**
     * SIGNAL IDUNA Sterbekasse VVaG
     */
    public static VersichererCode SIGNAL_IDUNA_Sterbekasse_VVaG;
    /**
     * EUROHERC osiguranje d.d.
     */
    public static VersichererCode EUROHERC_osiguranje_d_d;
    /**
     * MGEN FILIA
     */
    public static VersichererCode MGEN_FILIA;
    /**
     * Mutuelle Generale de l&apos;Education Nationale (MGEN)
     */
    public static VersichererCode Mutuelle_Generale_de_l_Education_Nationale_MGEN;
    /**
     * Steamship Mutual Underwriting Association (Europe) Limited
     */
    public static VersichererCode Steamship_Mutual_Underwriting_Association_Europe_Limited;
    /**
     * Intesa Sanpaolo Assicura S.p.A
     */
    public static VersichererCode Intesa_Sanpaolo_Assicura_S_p_A;
    /**
     * Lippische Landesbrandversicherung AG
     */
    public static VersichererCode Lippische_Landesbrandversicherung_AG;
    /**
     * HanseMerkur International AG
     */
    public static VersichererCode HanseMerkur_International_AG;
    /**
     * SV SparkassenVersicherung Pensionsfonds AG
     */
    public static VersichererCode SV_SparkassenVersicherung_Pensionsfonds_AG;
    /**
     * Companhia de Seguros Allianz Portugal, S.A.
     */
    public static VersichererCode Companhia_de_Seguros_Allianz_Portugal_S_A;
    /**
     * MUTUA DE RIESGO MARITIMO, SOCIEDAD DE SEGUROS A PRIMA FIJA (MURIMAR)
     */
    public static VersichererCode MUTUA_DE_RIESGO_MARITIMO_SOCIEDAD_DE_SEGUROS_A_PRIMA_FIJA_MURIMAR;
    /**
     * Irish Life Assurance plc
     */
    public static VersichererCode Irish_Life_Assurance_plc;
    /**
     * Eir Försäkring AB
     */
    public static VersichererCode Eir_F_rs_kring_AB;
    /**
     * Trust International Insurance Company (Cyprus) Limited
     */
    public static VersichererCode Trust_International_Insurance_Company_Cyprus_Limited;
    /**
     * Assurant Europe Insurance N.V.
     */
    public static VersichererCode Assurant_Europe_Insurance_N_V;
    /**
     * Assurant Europe Life Insurance N.V.
     */
    public static VersichererCode Assurant_Europe_Life_Insurance_N_V;
    /**
     * American Steamship Owners Marine Insurance Company (Europe) Limited
     */
    public static VersichererCode American_Steamship_Owners_Marine_Insurance_Company_Europe_Limited;
    /**
     * Försäkringsaktiebolaget Agria (publ.), Zweigniederlassung Deutschland
     */
    public static VersichererCode F_rs_kringsaktiebolaget_Agria_publ_Zweigniederlassung_Deutschland;
    /**
     * SMA SA
     */
    public static VersichererCode SMA_SA;
    /**
     * Sanofi European Pension Fund OFP
     */
    public static VersichererCode Sanofi_European_Pension_Fund_OFP;
    /**
     * PACIFICA
     */
    public static VersichererCode PACIFICA;
    /**
     * The United Kingdom Freight Demurrage and Defence Insurance (Europe) Limited
     */
    public static VersichererCode The_United_Kingdom_Freight_Demurrage_and_Defence_Insurance_Europe_Limited;
    /**
     * Caisse Regionale d Assurances Mutuelles Agricoles du Nord-Est
     */
    public static VersichererCode Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_du_Nord_Est;
    /**
     * Monument Assurance Belgium SA/NV
     */
    public static VersichererCode Monument_Assurance_Belgium_SA_NV;
    /**
     * Metzler Sozialpartner Pensionsfonds AG
     */
    public static VersichererCode Metzler_Sozialpartner_Pensionsfonds_AG;
    /**
     * Accelerant Insurance Europe SA/NV
     */
    public static VersichererCode Accelerant_Insurance_Europe_SA_NV;
    /**
     * OCCIDENT GCO, SOCIEDAD ANÓNIMA DE SEGUROS Y REASEGUROS
     */
    public static VersichererCode OCCIDENT_GCO_SOCIEDAD_AN_NIMA_DE_SEGUROS_Y_REASEGUROS;
    /**
     * KOMUNÁLNA poist´ovna, a.s. Vienna Insurance Group
     */
    public static VersichererCode KOMUN_LNA_poist_ovna_a_s_Vienna_Insurance_Group;
    /**
     * TM tryginggar hf.
     */
    public static VersichererCode TM_tryginggar_hf;
    /**
     * The London P&amp;I Insurance Company (Europe) Limited
     */
    public static VersichererCode The_London_P_I_Insurance_Company_Europe_Limited;
    /**
     * MIC Insurance Company S.A.
     */
    public static VersichererCode MIC_Insurance_Company_S_A;
    /**
     * SIGNAL IDUNA Lebensversicherung AG
     */
    public static VersichererCode SIGNAL_IDUNA_Lebensversicherung_AG;
    /**
     * Companjon Insurance DAC
     */
    public static VersichererCode Companjon_Insurance_DAC;
    /**
     * EUCARE Insurance PCC Limited
     */
    public static VersichererCode EUCARE_Insurance_PCC_Limited;
    /**
     * Tulip Assist Insurance Limited
     */
    public static VersichererCode Tulip_Assist_Insurance_Limited;
    /**
     * Bothnia International Insurance Company Ltd
     */
    public static VersichererCode Bothnia_International_Insurance_Company_Ltd;
    /**
     * ONVZ Aanvullende Verzekering N.V.
     */
    public static VersichererCode ONVZ_Aanvullende_Verzekering_N_V;
    /**
     * Allianz Hrvatska d.d.
     */
    public static VersichererCode Allianz_Hrvatska_d_d;
    /**
     * Veterfina Verzekeringsmaatschappij N.V.
     */
    public static VersichererCode Veterfina_Verzekeringsmaatschappij_N_V;
    /**
     * J&amp;J Pension Fund OFP
     */
    public static VersichererCode J_J_Pension_Fund_OFP;
    /**
     * International General Insurance Company (Europe) Ltd
     */
    public static VersichererCode International_General_Insurance_Company_Europe_Ltd;
    /**
     * Hrvatsko kreditno osiguranje d.d.
     */
    public static VersichererCode Hrvatsko_kreditno_osiguranje_d_d;
    /**
     * UNIQA Towarzystwo Ubezpieczeń na Życie S.A.
     */
    public static VersichererCode UNIQA_Towarzystwo_Ubezpiecze_na_ycie_S_A;
    /**
     * Seyna S.A.
     */
    public static VersichererCode Seyna_S_A;
    /**
     * Generali Hellas Insurance Company S.A.
     */
    public static VersichererCode Generali_Hellas_Insurance_Company_S_A;
    /**
     * Convex Europe S.A.
     */
    public static VersichererCode Convex_Europe_S_A;
    /**
     * SV pojišťovna, a.s.
     */
    public static VersichererCode SV_poji_ovna_a_s;
    /**
     * Caisse Nationale de Réassurance mutuelle agricole Groupama
     */
    public static VersichererCode Caisse_Nationale_de_R_assurance_mutuelle_agricole_Groupama;
    /**
     * Zurich Life Legacy Versicherung AG (Deutschland)
     */
    public static VersichererCode Zurich_Life_Legacy_Versicherung_AG_Deutschland;
    /**
     * Gasrule Insurance DAC
     */
    public static VersichererCode Gasrule_Insurance_DAC;
    /**
     * CGPA Europe Underwriting GmbH
     */
    public static VersichererCode CGPA_Europe_Underwriting_GmbH;
    /**
     * D.A.S. Belgische Rechtsbijstandsverzekeringsmaatschappij NV
     */
    public static VersichererCode D_A_S_Belgische_Rechtsbijstandsverzekeringsmaatschappij_NV;
    /**
     * Lime Street Insurance PCC Limited - Sugar Bridge Cell
     */
    public static VersichererCode Lime_Street_Insurance_PCC_Limited_Sugar_Bridge_Cell;
    /**
     * AGER Lebensversicherung AG
     */
    public static VersichererCode AGER_Lebensversicherung_AG;
    /**
     * HOK-osiguranje d.d.
     */
    public static VersichererCode HOK_osiguranje_d_d;
    /**
     * REVO Insurance S.p.A.
     */
    public static VersichererCode REVO_Insurance_S_p_A;
    /**
     * SCOR Europe Deutschland, Niederlassung der SCOR Europe SE
     */
    public static VersichererCode SCOR_Europe_Deutschland_Niederlassung_der_SCOR_Europe_SE;
    /**
     * Everest Insurance (Ireland) DAC, Niederlassung für Deutschland
     */
    public static VersichererCode Everest_Insurance_Ireland_DAC_Niederlassung_f_r_Deutschland;
    /**
     * Axiom Insurance Company Jsc
     */
    public static VersichererCode Axiom_Insurance_Company_Jsc;
    /**
     * Towarzystwo Ubezpieczeń Europa S.A.
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_Europa_S_A;
    /**
     * Towarzystwo Ubezpieczeń na Życie Europa S.A
     */
    public static VersichererCode Towarzystwo_Ubezpiecze_na_ycie_Europa_S_A;
    /**
     * Premium Insurance Company Limited
     */
    public static VersichererCode Premium_Insurance_Company_Limited;
    /**
     * Société Générale Luxembourg Credit Insurance SA
     */
    public static VersichererCode Soci_t_G_n_rale_Luxembourg_Credit_Insurance_SA;
    /**
     * Dina Försäkring AB
     */
    public static VersichererCode Dina_F_rs_kring_AB;
    /**
     * Gartnernes Forsikring GS. Dansk Jordbrug
     */
    public static VersichererCode Gartnernes_Forsikring_GS_Dansk_Jordbrug;
    /**
     * Mutual Insurance and Reinsurance for Information Systems (MIRIS)
     */
    public static VersichererCode Mutual_Insurance_and_Reinsurance_for_Information_Systems_MIRIS;
    /**
     * BULGARIAN EXPORT INSURANCE AGENCY \BAEZ\ EAD
     */
    public static VersichererCode BULGARIAN_EXPORT_INSURANCE_AGENCY_BAEZ_EAD;
    /**
     * ERB Cyprialife Limited
     */
    public static VersichererCode ERB_Cyprialife_Limited;
    /**
     * UniSalute S.p.A.
     */
    public static VersichererCode UniSalute_S_p_A;
    /**
     * Descartes Insurance S.A.
     */
    public static VersichererCode Descartes_Insurance_S_A;
    /**
     * Neodigital Autoversicherung AG
     */
    public static VersichererCode Neodigital_Autoversicherung_AG;
    /**
     * YOUPLUS Assurance AG, Zweigniederlassung Deutschland
     */
    public static VersichererCode YOUPLUS_Assurance_AG_Zweigniederlassung_Deutschland;
    /**
     * Apdrošināšanas akciju sabiedrība &quot;BALTA&quot;
     */
    public static VersichererCode Apdro_in_anas_akciju_sabiedr_ba_BALTA;
    /**
     * UAB PZU Lietuva gyvybės draudimas
     */
    public static VersichererCode UAB_PZU_Lietuva_gyvyb_s_draudimas;
    /**
     * Goudse Levensverzekeringen N.V.
     */
    public static VersichererCode Goudse_Levensverzekeringen_N_V;
    /**
     * White Rock Insurance (Netherlands) PCC Limited
     */
    public static VersichererCode White_Rock_Insurance_Netherlands_PCC_Limited;
    /**
     * Swiss Life Lebensversicherung SE
     */
    public static VersichererCode Swiss_Life_Lebensversicherung_SE;
    /**
     * Allianz Risk Transfer AG
     */
    public static VersichererCode Allianz_Risk_Transfer_AG;
    /**
     * Hesse Digital AG
     */
    public static VersichererCode Hesse_Digital_AG;
    /**
     * ACM Lebensversicherung AG
     */
    public static VersichererCode ACM_Lebensversicherung_AG;
    /**
     * Abeille IARD et Sante
     */
    public static VersichererCode Abeille_IARD_et_Sante;
    /**
     * Abanca Vida y Pensiones de Seguros y Reaseguros, S.A.
     */
    public static VersichererCode Abanca_Vida_y_Pensiones_de_Seguros_y_Reaseguros_S_A;
    /**
     * IF Livförsäkring AB
     */
    public static VersichererCode IF_Livf_rs_kring_AB;
    /**
     * ACM Versicherung AG
     */
    public static VersichererCode ACM_Versicherung_AG;
    /**
     * Scottish Widows Europe S.A.
     */
    public static VersichererCode Scottish_Widows_Europe_S_A;
    /**
     * TG Versicherungs AG
     */
    public static VersichererCode TG_Versicherungs_AG;
    /**
     * International Transport Intermediaries Insurance Company (Europe) Limited
     */
    public static VersichererCode International_Transport_Intermediaries_Insurance_Company_Europe_Limited;
    /**
     * Bos Fruit Aardappelen Onderlinge verzekeringen BFAO U.A.
     */
    public static VersichererCode Bos_Fruit_Aardappelen_Onderlinge_verzekeringen_BFAO_U_A;
    /**
     * TT Club Mutual Insurance N.V.
     */
    public static VersichererCode TT_Club_Mutual_Insurance_N_V;
    /**
     * ADAC Zuhause Versicherung AG
     */
    public static VersichererCode ADAC_Zuhause_Versicherung_AG;
    /**
     * Insurance Company Instinct AD
     */
    public static VersichererCode Insurance_Company_Instinct_AD;
    /**
     * Monarch Assurance SE
     */
    public static VersichererCode Monarch_Assurance_SE;
    /**
     * WERLA INSURANCE COMPANY LIMITED
     */
    public static VersichererCode WERLA_INSURANCE_COMPANY_LIMITED;
    /**
     * Fortegra Belgium Insurance Company NV
     */
    public static VersichererCode Fortegra_Belgium_Insurance_Company_NV;
    /**
     * KOOPERATIVA poisťovňa, a.s. Vienna Insurance Group
     */
    public static VersichererCode KOOPERATIVA_pois_ov_a_a_s_Vienna_Insurance_Group;
    /**
     * China Taiping Insurance (LU) S.A.
     */
    public static VersichererCode China_Taiping_Insurance_LU_S_A;
    /**
     * ZAD European Insurance Company AD
     */
    public static VersichererCode ZAD_European_Insurance_Company_AD;
    /**
     * Direct pojišťovna, a.s.
     */
    public static VersichererCode Direct_poji_ovna_a_s;
    /**
     * Cosmos Insurance Public Company Limited
     */
    public static VersichererCode Cosmos_Insurance_Public_Company_Limited;
    /**
     * CACI Non-Life DAC (Deutschland)
     */
    public static VersichererCode CACI_Non_Life_DAC_Deutschland;
    /**
     * CACI Life DAC (Deutschland)
     */
    public static VersichererCode CACI_Life_DAC_Deutschland;
    /**
     * Eni Insurance S.p.A.
     */
    public static VersichererCode Eni_Insurance_S_p_A;
    /**
     * American Atlantic Assurance Co Ltd.
     */
    public static VersichererCode American_Atlantic_Assurance_Co_Ltd;
    /**
     * Steel Plow Insurance Limited
     */
    public static VersichererCode Steel_Plow_Insurance_Limited;
    /**
     * VÍS tryggingar hf.
     */
    public static VersichererCode V_S_tryggingar_hf;
    /**
     * Renaissance Reinsurance of Europe Designated Activity Company
     */
    public static VersichererCode Renaissance_Reinsurance_of_Europe_Designated_Activity_Company;
    /**
     * MILA S.A.
     */
    public static VersichererCode MILA_S_A;
    /**
     * AS &quot;Sincera Insurance&quot;
     */
    public static VersichererCode AS_Sincera_Insurance;
    /**
     * MSIG Europe SE, Niederlassung Deutschland
     */
    public static VersichererCode MSIG_Europe_SE_Niederlassung_Deutschland;
    /**
     * Caisse d'Assurances Mutuelles du Crédit Agricole
     */
    public static VersichererCode Caisse_d_Assurances_Mutuelles_du_Cr_dit_Agricole;
    /**
     * Nationale-Nederlanden Schadeverzekering Maatschappij N.V., Zweigniederlassung Deutschland
     */
    public static VersichererCode Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V_Zweigniederlassung_Deutschland;
    /**
     * Omocom Försäkring AB
     */
    public static VersichererCode Omocom_F_rs_kring_AB;
    /**
     * Sveriges Angfartygs Assurans Förening
     */
    public static VersichererCode Sveriges_Angfartygs_Assurans_F_rening;
    /**
     * Helvetia Italia Assicurazioni S.p.A.
     */
    public static VersichererCode Helvetia_Italia_Assicurazioni_S_p_A;
    /**
     * EP Insurance Designated Activity Company
     */
    public static VersichererCode EP_Insurance_Designated_Activity_Company;
    /**
     * N.V. Hagelunie
     */
    public static VersichererCode N_V_Hagelunie;
    /**
     * AXA Health Insurance
     */
    public static VersichererCode AXA_Health_Insurance;
    /**
     * DSV Insurance DAC
     */
    public static VersichererCode DSV_Insurance_DAC;
    /**
     * SquareTrade Europe Insurance SA
     */
    public static VersichererCode SquareTrade_Europe_Insurance_SA;
    /**
     * MGEN Portugal - Companhia de Seguros, S.A.
     */
    public static VersichererCode MGEN_Portugal_Companhia_de_Seguros_S_A;

    private final String value;
    private final String name;
    private static final List<VersichererCode> $VALUES = new ArrayList<>();

    private VersichererCode(String name, String value) { this.name = name; this.value = value; }

    /**
     * Gets the xml value.
     * @return the xml value
     */
    @JsonValue
    public String getValue() { return value; }

    /**
     * Gets the enum name.
     * @return the enum name
     */
    public String name() { return name; }

    /**
     * Returns an unmodifiable list of all enum values.
     * @return the list of enum values
     */
    public static List<VersichererCode> values() { return Collections.unmodifiableList($VALUES); }

    static {
        init0();
        init1();
        init2();
    }

    private static void init0() {
        Alte_Leipziger_Lebensversicherung_auf_Gegenseitigkeit = new VersichererCode("Alte_Leipziger_Lebensversicherung_auf_Gegenseitigkeit", "10001007");
        $VALUES.add(Alte_Leipziger_Lebensversicherung_auf_Gegenseitigkeit);
        BY_die_Bayerische_Vorsorge_Lebensversicherung_a_G = new VersichererCode("BY_die_Bayerische_Vorsorge_Lebensversicherung_a_G", "10001013");
        $VALUES.add(BY_die_Bayerische_Vorsorge_Lebensversicherung_a_G);
        Bayern_Versicherung_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Bayern_Versicherung_Lebensversicherung_Aktiengesellschaft", "10001015");
        $VALUES.add(Bayern_Versicherung_Lebensversicherung_Aktiengesellschaft);
        AXA_Lebensversicherung_Aktiengesellschaft = new VersichererCode("AXA_Lebensversicherung_Aktiengesellschaft", "10001020");
        $VALUES.add(AXA_Lebensversicherung_Aktiengesellschaft);
        Condor_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Condor_Lebensversicherungs_Aktiengesellschaft", "10001021");
        $VALUES.add(Condor_Lebensversicherungs_Aktiengesellschaft);
        Cosmos_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Cosmos_Lebensversicherungs_Aktiengesellschaft", "10001022");
        $VALUES.add(Cosmos_Lebensversicherungs_Aktiengesellschaft);
        Debeka_Lebensversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein = new VersichererCode("Debeka_Lebensversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein", "10001023");
        $VALUES.add(Debeka_Lebensversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein);
        DEVK_Deutsche_Eisenbahn_Versicherung_Lebensversicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn = new VersichererCode("DEVK_Deutsche_Eisenbahn_Versicherung_Lebensversicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn", "10001025");
        $VALUES.add(DEVK_Deutsche_Eisenbahn_Versicherung_Lebensversicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn);
        Baloise_Lebensversicherung_Aktiengesellschaft_Deutschland = new VersichererCode("Baloise_Lebensversicherung_Aktiengesellschaft_Deutschland", "10001028");
        $VALUES.add(Baloise_Lebensversicherung_Aktiengesellschaft_Deutschland);
        HDI_Lebensversicherung_AG = new VersichererCode("HDI_Lebensversicherung_AG", "10001033");
        $VALUES.add(HDI_Lebensversicherung_AG);
        Frankfurt_M_nchener_Lebensversicherung_AG = new VersichererCode("Frankfurt_M_nchener_Lebensversicherung_AG", "10001035");
        $VALUES.add(Frankfurt_M_nchener_Lebensversicherung_AG);
        IDEAL_Lebensversicherung_a_G = new VersichererCode("IDEAL_Lebensversicherung_a_G", "10001047");
        $VALUES.add(IDEAL_Lebensversicherung_a_G);
        HUK_COBURG_Lebensversicherung_AG = new VersichererCode("HUK_COBURG_Lebensversicherung_AG", "10001055");
        $VALUES.add(HUK_COBURG_Lebensversicherung_AG);
        Lebensversicherung_von_1871_auf_Gegenseitigkeit_M_nchen = new VersichererCode("Lebensversicherung_von_1871_auf_Gegenseitigkeit_M_nchen", "10001062");
        $VALUES.add(Lebensversicherung_von_1871_auf_Gegenseitigkeit_M_nchen);
        Provinzial_Lebensversicherung_Hannover = new VersichererCode("Provinzial_Lebensversicherung_Hannover", "10001081");
        $VALUES.add(Provinzial_Lebensversicherung_Hannover);
        Provinzial_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Provinzial_Lebensversicherung_Aktiengesellschaft", "10001083");
        $VALUES.add(Provinzial_Lebensversicherung_Aktiengesellschaft);
        R_V_Lebensversicherung_a_G = new VersichererCode("R_V_Lebensversicherung_a_G", "10001085");
        $VALUES.add(R_V_Lebensversicherung_a_G);
        SV_SparkassenVersicherung_Lebensversicherung_Aktiengesellschaft = new VersichererCode("SV_SparkassenVersicherung_Lebensversicherung_Aktiengesellschaft", "10001091");
        $VALUES.add(SV_SparkassenVersicherung_Lebensversicherung_Aktiengesellschaft);
        uniVersa_Lebensversicherung_a_G = new VersichererCode("uniVersa_Lebensversicherung_a_G", "10001092");
        $VALUES.add(uniVersa_Lebensversicherung_a_G);
        VEREINIGTE_POSTVERSICHERUNG_VVaG = new VersichererCode("VEREINIGTE_POSTVERSICHERUNG_VVaG", "10001093");
        $VALUES.add(VEREINIGTE_POSTVERSICHERUNG_VVaG);
        Volkswohl_Bund_Lebensversicherung_a_G = new VersichererCode("Volkswohl_Bund_Lebensversicherung_a_G", "10001099");
        $VALUES.add(Volkswohl_Bund_Lebensversicherung_a_G);
        WWK_Lebensversicherung_auf_Gegenseitigkeit = new VersichererCode("WWK_Lebensversicherung_auf_Gegenseitigkeit", "10001103");
        $VALUES.add(WWK_Lebensversicherung_auf_Gegenseitigkeit);
        Stuttgarter_Lebensversicherung_a_G = new VersichererCode("Stuttgarter_Lebensversicherung_a_G", "10001104");
        $VALUES.add(Stuttgarter_Lebensversicherung_a_G);
        EUROPA_Lebensversicherung_Aktiengesellschaft = new VersichererCode("EUROPA_Lebensversicherung_Aktiengesellschaft", "10001107");
        $VALUES.add(EUROPA_Lebensversicherung_Aktiengesellschaft);
        Gothaer_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Gothaer_Lebensversicherung_Aktiengesellschaft", "10001108");
        $VALUES.add(Gothaer_Lebensversicherung_Aktiengesellschaft);
        Mecklenburgische_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Mecklenburgische_Lebensversicherungs_Aktiengesellschaft", "10001109");
        $VALUES.add(Mecklenburgische_Lebensversicherungs_Aktiengesellschaft);
        LVM_Lebensversicherungs_AG = new VersichererCode("LVM_Lebensversicherungs_AG", "10001112");
        $VALUES.add(LVM_Lebensversicherungs_AG);
        Dialog_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Dialog_Lebensversicherungs_Aktiengesellschaft", "10001113");
        $VALUES.add(Dialog_Lebensversicherungs_Aktiengesellschaft);
        HanseMerkur_Lebensversicherung_AG = new VersichererCode("HanseMerkur_Lebensversicherung_AG", "10001114");
        $VALUES.add(HanseMerkur_Lebensversicherung_AG);
        Credit_Life_AG = new VersichererCode("Credit_Life_AG", "10001115");
        $VALUES.add(Credit_Life_AG);
        DIREKTE_LEBEN_Versicherung_AG = new VersichererCode("DIREKTE_LEBEN_Versicherung_AG", "10001123");
        $VALUES.add(DIREKTE_LEBEN_Versicherung_AG);
        Itzehoer_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Itzehoer_Lebensversicherungs_Aktiengesellschaft", "10001128");
        $VALUES.add(Itzehoer_Lebensversicherungs_Aktiengesellschaft);
        HDI_Vorsorge_Lebensversicherung_AG = new VersichererCode("HDI_Vorsorge_Lebensversicherung_AG", "10001132");
        $VALUES.add(HDI_Vorsorge_Lebensversicherung_AG);
        BL_die_Bayerische_Lebensversicherung_AG = new VersichererCode("BL_die_Bayerische_Lebensversicherung_AG", "10001134");
        $VALUES.add(BL_die_Bayerische_Lebensversicherung_AG);
        DEVK_Allgemeine_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("DEVK_Allgemeine_Lebensversicherungs_Aktiengesellschaft", "10001136");
        $VALUES.add(DEVK_Allgemeine_Lebensversicherungs_Aktiengesellschaft);
        HELVETIA_schweizerische_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("HELVETIA_schweizerische_Lebensversicherungs_Aktiengesellschaft", "10001137");
        $VALUES.add(HELVETIA_schweizerische_Lebensversicherungs_Aktiengesellschaft);
        Zurich_Deutscher_Herold_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Zurich_Deutscher_Herold_Lebensversicherung_Aktiengesellschaft", "10001138");
        $VALUES.add(Zurich_Deutscher_Herold_Lebensversicherung_Aktiengesellschaft);
        R_V_LEBENSVERSICHERUNG_AKTIENGESELLSCHAFT = new VersichererCode("R_V_LEBENSVERSICHERUNG_AKTIENGESELLSCHAFT", "10001141");
        $VALUES.add(R_V_LEBENSVERSICHERUNG_AKTIENGESELLSCHAFT);
        Deutsche_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Deutsche_Lebensversicherungs_Aktiengesellschaft", "10001148");
        $VALUES.add(Deutsche_Lebensversicherungs_Aktiengesellschaft);
        WGV_Lebensversicherung_AG = new VersichererCode("WGV_Lebensversicherung_AG", "10001149");
        $VALUES.add(WGV_Lebensversicherung_AG);
        ERGO_Vorsorge_Lebensversicherung_Aktiengesellschaft = new VersichererCode("ERGO_Vorsorge_Lebensversicherung_Aktiengesellschaft", "10001151");
        $VALUES.add(ERGO_Vorsorge_Lebensversicherung_Aktiengesellschaft);
        Frankfurter_Lebensversicherung_AG = new VersichererCode("Frankfurter_Lebensversicherung_AG", "10001152");
        $VALUES.add(Frankfurter_Lebensversicherung_AG);
        Sparkassen_Versicherung_Sachsen_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Sparkassen_Versicherung_Sachsen_Lebensversicherung_Aktiengesellschaft", "10001153");
        $VALUES.add(Sparkassen_Versicherung_Sachsen_Lebensversicherung_Aktiengesellschaft);
        Skandia_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Skandia_Lebensversicherung_Aktiengesellschaft", "10001157");
        $VALUES.add(Skandia_Lebensversicherung_Aktiengesellschaft);
        Heidelberger_Lebensversicherung_AG = new VersichererCode("Heidelberger_Lebensversicherung_AG", "10001158");
        $VALUES.add(Heidelberger_Lebensversicherung_AG);
        VPV_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("VPV_Lebensversicherungs_Aktiengesellschaft", "10001160");
        $VALUES.add(VPV_Lebensversicherungs_Aktiengesellschaft);
        myLife_Lebensversicherung_AG = new VersichererCode("myLife_Lebensversicherung_AG", "10001162");
        $VALUES.add(myLife_Lebensversicherung_AG);
        neue_leben_Lebensversicherung_Aktiengesellschaft = new VersichererCode("neue_leben_Lebensversicherung_Aktiengesellschaft", "10001164");
        $VALUES.add(neue_leben_Lebensversicherung_Aktiengesellschaft);
        Delta_Direkt_Lebensversicherung_Aktiengesellschaft_M_nchen = new VersichererCode("Delta_Direkt_Lebensversicherung_Aktiengesellschaft_M_nchen", "10001167");
        $VALUES.add(Delta_Direkt_Lebensversicherung_Aktiengesellschaft_M_nchen);
        Concordia_oeco_Lebensversicherungs_AG = new VersichererCode("Concordia_oeco_Lebensversicherungs_AG", "10001177");
        $VALUES.add(Concordia_oeco_Lebensversicherungs_AG);
        Cardif_Lebensversicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurance_Vie = new VersichererCode("Cardif_Lebensversicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurance_Vie", "10001182");
        $VALUES.add(Cardif_Lebensversicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurance_Vie);
        CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V_Direktion_F_r_Deutschland = new VersichererCode("CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V_Direktion_F_r_Deutschland", "10001189");
        $VALUES.add(CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V_Direktion_F_r_Deutschland);
        LPV_Lebensversicherung_AG = new VersichererCode("LPV_Lebensversicherung_AG", "10001194");
        $VALUES.add(LPV_Lebensversicherung_AG);
        Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh = new VersichererCode("Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh", "10001205");
        $VALUES.add(Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh);
        Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_2 = new VersichererCode("Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_2", "10001206");
        $VALUES.add(Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_2);
        Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_3 = new VersichererCode("Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_3", "10001207");
        $VALUES.add(Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_3);
        Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_4 = new VersichererCode("Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_4", "10001208");
        $VALUES.add(Sonderb_f_d_ff_r_LV_Anst_Brandenburg_Pommern_OEVA_Dresden_Sachs_Th_r_Anh_4);
        Ulf_Peters_Sonderb_f_d_ff_r_LV_Anst_der_Sudetenl_nder_i_L = new VersichererCode("Ulf_Peters_Sonderb_f_d_ff_r_LV_Anst_der_Sudetenl_nder_i_L", "10001209");
        $VALUES.add(Ulf_Peters_Sonderb_f_d_ff_r_LV_Anst_der_Sudetenl_nder_i_L);
        Canada_Life_Assurance_Europe_plc_Niederlassung_f_r_Deutschland = new VersichererCode("Canada_Life_Assurance_Europe_plc_Niederlassung_f_r_Deutschland", "10001300");
        $VALUES.add(Canada_Life_Assurance_Europe_plc_Niederlassung_f_r_Deutschland);
        Mediolanum_International_Life_Designated_Activity_Company_Niederlassung_M_nchen = new VersichererCode("Mediolanum_International_Life_Designated_Activity_Company_Niederlassung_M_nchen", "10001308");
        $VALUES.add(Mediolanum_International_Life_Designated_Activity_Company_Niederlassung_M_nchen);
        Protektor_Lebensversicherungs_AG = new VersichererCode("Protektor_Lebensversicherungs_AG", "10001309");
        $VALUES.add(Protektor_Lebensversicherungs_AG);
        Versicherer_im_Raum_der_Kirchen_Lebensversicherung_AG = new VersichererCode("Versicherer_im_Raum_der_Kirchen_Lebensversicherung_AG", "10001310");
        $VALUES.add(Versicherer_im_Raum_der_Kirchen_Lebensversicherung_AG);
        Hannoversche_Lebensversicherung_AG = new VersichererCode("Hannoversche_Lebensversicherung_AG", "10001312");
        $VALUES.add(Hannoversche_Lebensversicherung_AG);
        Aioi_Nissay_Dowa_Life_Insurance_of_Europe_Aktiengesellschaft = new VersichererCode("Aioi_Nissay_Dowa_Life_Insurance_of_Europe_Aktiengesellschaft", "10001318");
        $VALUES.add(Aioi_Nissay_Dowa_Life_Insurance_of_Europe_Aktiengesellschaft);
        Swiss_Life_Products_Luxembourg_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("Swiss_Life_Products_Luxembourg_S_A_Niederlassung_f_r_Deutschland", "10001328");
        $VALUES.add(Swiss_Life_Products_Luxembourg_S_A_Niederlassung_f_r_Deutschland);
        Monument_Assurance_Luxembourg_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("Monument_Assurance_Luxembourg_S_A_Niederlassung_f_r_Deutschland", "10001329");
        $VALUES.add(Monument_Assurance_Luxembourg_S_A_Niederlassung_f_r_Deutschland);
        INTER_Lebensversicherung_AG = new VersichererCode("INTER_Lebensversicherung_AG", "10001330");
        $VALUES.add(INTER_Lebensversicherung_AG);
        Allianz_Global_Life_Designated_Activity_Company_Niederlassung_f_r_Deutschland = new VersichererCode("Allianz_Global_Life_Designated_Activity_Company_Niederlassung_f_r_Deutschland", "10001331");
        $VALUES.add(Allianz_Global_Life_Designated_Activity_Company_Niederlassung_f_r_Deutschland);
        Continentale_Lebensversicherung_AG = new VersichererCode("Continentale_Lebensversicherung_AG", "10001335");
        $VALUES.add(Continentale_Lebensversicherung_AG);
        HAMBURGER_PENSIONSKASSE_VON_1905_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("HAMBURGER_PENSIONSKASSE_VON_1905_Versicherungsverein_auf_Gegenseitigkeit", "10002001");
        $VALUES.add(HAMBURGER_PENSIONSKASSE_VON_1905_Versicherungsverein_auf_Gegenseitigkeit);
        Phoenix_Pensionskasse_von_1925_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Phoenix_Pensionskasse_von_1925_Versicherungsverein_auf_Gegenseitigkeit", "10002007");
        $VALUES.add(Phoenix_Pensionskasse_von_1925_Versicherungsverein_auf_Gegenseitigkeit);
        Pensionskasse_f_r_Angestellte_der_Continental_Aktiengesellschaft_VVaG = new VersichererCode("Pensionskasse_f_r_Angestellte_der_Continental_Aktiengesellschaft_VVaG", "10002008");
        $VALUES.add(Pensionskasse_f_r_Angestellte_der_Continental_Aktiengesellschaft_VVaG);
        VERKA_VK_Kirchliche_Vorsorge_VVaG = new VersichererCode("VERKA_VK_Kirchliche_Vorsorge_VVaG", "10002009");
        $VALUES.add(VERKA_VK_Kirchliche_Vorsorge_VVaG);
        Ruhegeld_Witwen_und_Waisenkasse_d_Bergischen_Elektrizit_ts_Versorgungs_GmbH_VVaG_i_L = new VersichererCode("Ruhegeld_Witwen_und_Waisenkasse_d_Bergischen_Elektrizit_ts_Versorgungs_GmbH_VVaG_i_L", "10002012");
        $VALUES.add(Ruhegeld_Witwen_und_Waisenkasse_d_Bergischen_Elektrizit_ts_Versorgungs_GmbH_VVaG_i_L);
        Bayer_Pensionskasse = new VersichererCode("Bayer_Pensionskasse", "10002017");
        $VALUES.add(Bayer_Pensionskasse);
        Allianz_Versorgungskasse_Versicherungsverein_a_G = new VersichererCode("Allianz_Versorgungskasse_Versicherungsverein_a_G", "10002018");
        $VALUES.add(Allianz_Versorgungskasse_Versicherungsverein_a_G);
        Versorgungskasse_der_Volksf_rsorge_VVaG = new VersichererCode("Versorgungskasse_der_Volksf_rsorge_VVaG", "10002020");
        $VALUES.add(Versorgungskasse_der_Volksf_rsorge_VVaG);
        Pensionskasse_der_BOGESTRA = new VersichererCode("Pensionskasse_der_BOGESTRA", "10002027");
        $VALUES.add(Pensionskasse_der_BOGESTRA);
        Ruhegeldkasse_der_Bremer_Stra_enbahn_VVaG = new VersichererCode("Ruhegeldkasse_der_Bremer_Stra_enbahn_VVaG", "10002028");
        $VALUES.add(Ruhegeldkasse_der_Bremer_Stra_enbahn_VVaG);
        Versorgungskasse_f_d_Angest_d_AachenM_nchener_Versicherung_AG_u_d_Generali_Deutschland_AG = new VersichererCode("Versorgungskasse_f_d_Angest_d_AachenM_nchener_Versicherung_AG_u_d_Generali_Deutschland_AG", "10002029");
        $VALUES.add(Versorgungskasse_f_d_Angest_d_AachenM_nchener_Versicherung_AG_u_d_Generali_Deutschland_AG);
        Versorgungskasse_Deutscher_Unternehmen_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Versorgungskasse_Deutscher_Unternehmen_Versicherungsverein_auf_Gegenseitigkeit", "10002031");
        $VALUES.add(Versorgungskasse_Deutscher_Unternehmen_Versicherungsverein_auf_Gegenseitigkeit);
        Versorgungskasse_der_Firma_M_DuMont_Schauberg_Expedition_der_K_lnischen_Zeitung = new VersichererCode("Versorgungskasse_der_Firma_M_DuMont_Schauberg_Expedition_der_K_lnischen_Zeitung", "10002032");
        $VALUES.add(Versorgungskasse_der_Firma_M_DuMont_Schauberg_Expedition_der_K_lnischen_Zeitung);
        Pensionskasse_HT_Troplast_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_HT_Troplast_Versicherungsverein_auf_Gegenseitigkeit", "10002034");
        $VALUES.add(Pensionskasse_HT_Troplast_Versicherungsverein_auf_Gegenseitigkeit);
        Pensionskasse_f_r_die_Angestellten_der_BARMER_Ersatzkasse_VVaG = new VersichererCode("Pensionskasse_f_r_die_Angestellten_der_BARMER_Ersatzkasse_VVaG", "10002035");
        $VALUES.add(Pensionskasse_f_r_die_Angestellten_der_BARMER_Ersatzkasse_VVaG);
        MER_Pensionskasse_VVaG = new VersichererCode("MER_Pensionskasse_VVaG", "10002037");
        $VALUES.add(MER_Pensionskasse_VVaG);
        Debeka_Zusatzversorgungskasse_VaG = new VersichererCode("Debeka_Zusatzversorgungskasse_VaG", "10002038");
        $VALUES.add(Debeka_Zusatzversorgungskasse_VaG);
        M_llerei_Pensionskasse_Versicherungsverein_a_G_MPK = new VersichererCode("M_llerei_Pensionskasse_Versicherungsverein_a_G_MPK", "10002043");
        $VALUES.add(M_llerei_Pensionskasse_Versicherungsverein_a_G_MPK);
        Gerling_Versorgungskasse = new VersichererCode("Gerling_Versorgungskasse", "10002044");
        $VALUES.add(Gerling_Versorgungskasse);
        R_V_PENSIONSVERSICHERUNG_a_G = new VersichererCode("R_V_PENSIONSVERSICHERUNG_a_G", "10002045");
        $VALUES.add(R_V_PENSIONSVERSICHERUNG_a_G);
        Pensionskasse_Berolina_VVaG = new VersichererCode("Pensionskasse_Berolina_VVaG", "10002046");
        $VALUES.add(Pensionskasse_Berolina_VVaG);
        Versorgungskasse_der_Deutscher_Herold_Versicherungsgesellschaften_Versicherungsverein_a_G_K_ln = new VersichererCode("Versorgungskasse_der_Deutscher_Herold_Versicherungsgesellschaften_Versicherungsverein_a_G_K_ln", "10002047");
        $VALUES.add(Versorgungskasse_der_Deutscher_Herold_Versicherungsgesellschaften_Versicherungsverein_a_G_K_ln);
        BVV_Versicherungsverein_des_Bankgewerbes_a_G = new VersichererCode("BVV_Versicherungsverein_des_Bankgewerbes_a_G", "10002048");
        $VALUES.add(BVV_Versicherungsverein_des_Bankgewerbes_a_G);
        Pensionskasse_f_r_die_Deutsche_Wirtschaft_vormals_Pensionskasse_der_chemischen_Industrie_Deutschlands = new VersichererCode("Pensionskasse_f_r_die_Deutsche_Wirtschaft_vormals_Pensionskasse_der_chemischen_Industrie_Deutschlands", "10002052");
        $VALUES.add(Pensionskasse_f_r_die_Deutsche_Wirtschaft_vormals_Pensionskasse_der_chemischen_Industrie_Deutschlands);
        Pensionskasse_der_BERLIN_K_LNISCHE_Versicherungen = new VersichererCode("Pensionskasse_der_BERLIN_K_LNISCHE_Versicherungen", "10002055");
        $VALUES.add(Pensionskasse_der_BERLIN_K_LNISCHE_Versicherungen);
        Pensionskasse_der_Gewerkschaft_Eisenh_tte_Westfalia_i_L_c_o_Caterpillar_Global_Mining_Europe_GmbH = new VersichererCode("Pensionskasse_der_Gewerkschaft_Eisenh_tte_Westfalia_i_L_c_o_Caterpillar_Global_Mining_Europe_GmbH", "10002063");
        $VALUES.add(Pensionskasse_der_Gewerkschaft_Eisenh_tte_Westfalia_i_L_c_o_Caterpillar_Global_Mining_Europe_GmbH);
        PENSIONSKASSE_der_Hamburger_Hochbahn_Aktiengesellschaft_VVaG = new VersichererCode("PENSIONSKASSE_der_Hamburger_Hochbahn_Aktiengesellschaft_VVaG", "10002067");
        $VALUES.add(PENSIONSKASSE_der_Hamburger_Hochbahn_Aktiengesellschaft_VVaG);
        Versorgungskasse_der_Angestellten_der_Norddeutschen_Affinerie = new VersichererCode("Versorgungskasse_der_Angestellten_der_Norddeutschen_Affinerie", "10002073");
        $VALUES.add(Versorgungskasse_der_Angestellten_der_Norddeutschen_Affinerie);
        Pensionskasse_der_Lotsenbr_derschaft_Elbe = new VersichererCode("Pensionskasse_der_Lotsenbr_derschaft_Elbe", "10002076");
        $VALUES.add(Pensionskasse_der_Lotsenbr_derschaft_Elbe);
        Pensionskasse_vom_Deutschen_Roten_Kreuz_VVaG = new VersichererCode("Pensionskasse_vom_Deutschen_Roten_Kreuz_VVaG", "10002083");
        $VALUES.add(Pensionskasse_vom_Deutschen_Roten_Kreuz_VVaG);
        Alters_und_Hinterbliebenen_Versicherung_der_Technischen_berwachungs_Vereine_VVaG = new VersichererCode("Alters_und_Hinterbliebenen_Versicherung_der_Technischen_berwachungs_Vereine_VVaG", "10002088");
        $VALUES.add(Alters_und_Hinterbliebenen_Versicherung_der_Technischen_berwachungs_Vereine_VVaG);
        Pensionskasse_Schenker_VVaG = new VersichererCode("Pensionskasse_Schenker_VVaG", "10002089");
        $VALUES.add(Pensionskasse_Schenker_VVaG);
        PENSIONSKASSE_Deutscher_Genossenschaften_VVaG = new VersichererCode("PENSIONSKASSE_Deutscher_Genossenschaften_VVaG", "10002092");
        $VALUES.add(PENSIONSKASSE_Deutscher_Genossenschaften_VVaG);
        Pensionskasse_SIGNAL_Versicherungen_VVaG = new VersichererCode("Pensionskasse_SIGNAL_Versicherungen_VVaG", "10002095");
        $VALUES.add(Pensionskasse_SIGNAL_Versicherungen_VVaG);
        Philips_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Philips_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit", "10002096");
        $VALUES.add(Philips_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit);
        Versorgungskasse_Gothaer_Versicherungsbank_VVaG = new VersichererCode("Versorgungskasse_Gothaer_Versicherungsbank_VVaG", "10002099");
        $VALUES.add(Versorgungskasse_Gothaer_Versicherungsbank_VVaG);
        Pensionskasse_der_EDEKA_Organisation_V_V_a_G = new VersichererCode("Pensionskasse_der_EDEKA_Organisation_V_V_a_G", "10002101");
        $VALUES.add(Pensionskasse_der_EDEKA_Organisation_V_V_a_G);
        Angest_Pensionskasse_der_dt_Gesch_ftsbetriebe_der_Georg_Fischer_Aktiengesellschaft_Schaffhausen_Schweiz = new VersichererCode("Angest_Pensionskasse_der_dt_Gesch_ftsbetriebe_der_Georg_Fischer_Aktiengesellschaft_Schaffhausen_Schweiz", "10002105");
        $VALUES.add(Angest_Pensionskasse_der_dt_Gesch_ftsbetriebe_der_Georg_Fischer_Aktiengesellschaft_Schaffhausen_Schweiz);
        M_nchener_R_ck_Versorgungskasse = new VersichererCode("M_nchener_R_ck_Versorgungskasse", "10002106");
        $VALUES.add(M_nchener_R_ck_Versorgungskasse);
        Pensionskasse_der_W_rttembergischen = new VersichererCode("Pensionskasse_der_W_rttembergischen", "10002109");
        $VALUES.add(Pensionskasse_der_W_rttembergischen);
        Gr_n_Bilfinger_Wohlfahrts_und_Pensionskasse_a_G_c_o_LDIS_GmbH = new VersichererCode("Gr_n_Bilfinger_Wohlfahrts_und_Pensionskasse_a_G_c_o_LDIS_GmbH", "10002111");
        $VALUES.add(Gr_n_Bilfinger_Wohlfahrts_und_Pensionskasse_a_G_c_o_LDIS_GmbH);
        BASF_Pensionskasse_VVaG = new VersichererCode("BASF_Pensionskasse_VVaG", "10002114");
        $VALUES.add(BASF_Pensionskasse_VVaG);
        Pensionskasse_der_Vereinigten_Hagelversicherung_VVaG = new VersichererCode("Pensionskasse_der_Vereinigten_Hagelversicherung_VVaG", "10002116");
        $VALUES.add(Pensionskasse_der_Vereinigten_Hagelversicherung_VVaG);
        Pensionskasse_der_Bewag = new VersichererCode("Pensionskasse_der_Bewag", "10002119");
        $VALUES.add(Pensionskasse_der_Bewag);
        Dresdener_Pensionskasse_VVaG = new VersichererCode("Dresdener_Pensionskasse_VVaG", "10002121");
        $VALUES.add(Dresdener_Pensionskasse_VVaG);
        Pensionskasse_Degussa_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_Degussa_Versicherungsverein_auf_Gegenseitigkeit", "10002123");
        $VALUES.add(Pensionskasse_Degussa_Versicherungsverein_auf_Gegenseitigkeit);
        Versorgungskasse_der_Arbeiter_und_Angestellten_der_ehemaligen_Gro_kraftwerk_Franken_AG_i_L = new VersichererCode("Versorgungskasse_der_Arbeiter_und_Angestellten_der_ehemaligen_Gro_kraftwerk_Franken_AG_i_L", "10002129");
        $VALUES.add(Versorgungskasse_der_Arbeiter_und_Angestellten_der_ehemaligen_Gro_kraftwerk_Franken_AG_i_L);
        Geno_Pensionskasse_VVaG_Karlsruhe = new VersichererCode("Geno_Pensionskasse_VVaG_Karlsruhe", "10002135");
        $VALUES.add(Geno_Pensionskasse_VVaG_Karlsruhe);
        Glatfelter_Gernsbach_Pensionskasse_VVaG = new VersichererCode("Glatfelter_Gernsbach_Pensionskasse_VVaG", "10002138");
        $VALUES.add(Glatfelter_Gernsbach_Pensionskasse_VVaG);
        Pensionskasse_Konzern_Versicherungskammer_Bayern_VVaG = new VersichererCode("Pensionskasse_Konzern_Versicherungskammer_Bayern_VVaG", "10002142");
        $VALUES.add(Pensionskasse_Konzern_Versicherungskammer_Bayern_VVaG);
        Pensionskasse_der_Wacker_Chemie_Versicherungsverein_a_G = new VersichererCode("Pensionskasse_der_Wacker_Chemie_Versicherungsverein_a_G", "10002143");
        $VALUES.add(Pensionskasse_der_Wacker_Chemie_Versicherungsverein_a_G);
        Pensionskasse_der_HypoVereinsbank = new VersichererCode("Pensionskasse_der_HypoVereinsbank", "10002144");
        $VALUES.add(Pensionskasse_der_HypoVereinsbank);
        Pensionskasse_Maxh_tte_VVaG = new VersichererCode("Pensionskasse_Maxh_tte_VVaG", "10002145");
        $VALUES.add(Pensionskasse_Maxh_tte_VVaG);
        Rentenzuschusskasse_der_N_ERGIE_Aktiengesellschaft_N_rnberg = new VersichererCode("Rentenzuschusskasse_der_N_ERGIE_Aktiengesellschaft_N_rnberg", "10002148");
        $VALUES.add(Rentenzuschusskasse_der_N_ERGIE_Aktiengesellschaft_N_rnberg);
        Betriebspensionskasse_der_Firma_Carl_Schenck_AG_VVaG_Darmstadt = new VersichererCode("Betriebspensionskasse_der_Firma_Carl_Schenck_AG_VVaG_Darmstadt", "10002151");
        $VALUES.add(Betriebspensionskasse_der_Firma_Carl_Schenck_AG_VVaG_Darmstadt);
        Pensionskasse_der_Frankfurter_Sparkasse = new VersichererCode("Pensionskasse_der_Frankfurter_Sparkasse", "10002155");
        $VALUES.add(Pensionskasse_der_Frankfurter_Sparkasse);
        HEAG_Pensionszuschusskasse_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("HEAG_Pensionszuschusskasse_Versicherungsverein_auf_Gegenseitigkeit", "10002157");
        $VALUES.add(HEAG_Pensionszuschusskasse_Versicherungsverein_auf_Gegenseitigkeit);
        Versorgungskasse_der_Angestellten_der_GEA_Group_Aktiengesellschaft_VVaG = new VersichererCode("Versorgungskasse_der_Angestellten_der_GEA_Group_Aktiengesellschaft_VVaG", "10002159");
        $VALUES.add(Versorgungskasse_der_Angestellten_der_GEA_Group_Aktiengesellschaft_VVaG);
        Pensionskasse_der_Caritas_VVaG = new VersichererCode("Pensionskasse_der_Caritas_VVaG", "10002164");
        $VALUES.add(Pensionskasse_der_Caritas_VVaG);
        Pensionskasse_der_Novartis_Pharma_GmbH_in_N_rnberg_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_der_Novartis_Pharma_GmbH_in_N_rnberg_Versicherungsverein_auf_Gegenseitigkeit", "10002169");
        $VALUES.add(Pensionskasse_der_Novartis_Pharma_GmbH_in_N_rnberg_Versicherungsverein_auf_Gegenseitigkeit);
        Versorgungskasse_Radio_Bremen = new VersichererCode("Versorgungskasse_Radio_Bremen", "10002175");
        $VALUES.add(Versorgungskasse_Radio_Bremen);
        Pensionskasse_der_Wasserwirtschaftlichen_Verb_nde_Essen_VVaG = new VersichererCode("Pensionskasse_der_Wasserwirtschaftlichen_Verb_nde_Essen_VVaG", "10002177");
        $VALUES.add(Pensionskasse_der_Wasserwirtschaftlichen_Verb_nde_Essen_VVaG);
        Pensionskasse_der_BHW_Bausparkasse = new VersichererCode("Pensionskasse_der_BHW_Bausparkasse", "10002179");
        $VALUES.add(Pensionskasse_der_BHW_Bausparkasse);
        Versorgungskasse_der_ehemaligen_Bayernwerk_AG_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Versorgungskasse_der_ehemaligen_Bayernwerk_AG_Versicherungsverein_auf_Gegenseitigkeit", "10002183");
        $VALUES.add(Versorgungskasse_der_ehemaligen_Bayernwerk_AG_Versicherungsverein_auf_Gegenseitigkeit);
        Babcock_Pensionskasse_VVaG = new VersichererCode("Babcock_Pensionskasse_VVaG", "10002186");
        $VALUES.add(Babcock_Pensionskasse_VVaG);
        Audi_Pensionskasse_Altersversorgung_der_AUTO_UNION_GmbH_Versicherungsverein_auf_Gegenseitigk_VVaG_Ingolst_Donau_i_L = new VersichererCode("Audi_Pensionskasse_Altersversorgung_der_AUTO_UNION_GmbH_Versicherungsverein_auf_Gegenseitigk_VVaG_Ingolst_Donau_i_L", "10002188");
        $VALUES.add(Audi_Pensionskasse_Altersversorgung_der_AUTO_UNION_GmbH_Versicherungsverein_auf_Gegenseitigk_VVaG_Ingolst_Donau_i_L);
        Zusatzversorgungskasse_des_Baugewerbes_AG = new VersichererCode("Zusatzversorgungskasse_des_Baugewerbes_AG", "10002189");
        $VALUES.add(Zusatzversorgungskasse_des_Baugewerbes_AG);
        VLAK_VVaG_Hannover = new VersichererCode("VLAK_VVaG_Hannover", "10002194");
        $VALUES.add(VLAK_VVaG_Hannover);
        NESTL_PENSIONSKASSE = new VersichererCode("NESTL_PENSIONSKASSE", "10002196");
        $VALUES.add(NESTL_PENSIONSKASSE);
        Pensionskasse_der_Mitarbeiter_der_ehemaligen_Frankona_R_ckversicherungs_AG_V_V_a_G = new VersichererCode("Pensionskasse_der_Mitarbeiter_der_ehemaligen_Frankona_R_ckversicherungs_AG_V_V_a_G", "10002204");
        $VALUES.add(Pensionskasse_der_Mitarbeiter_der_ehemaligen_Frankona_R_ckversicherungs_AG_V_V_a_G);
        Zusatzversorgungskasse_des_Dachdeckerhandwerks_VVaG = new VersichererCode("Zusatzversorgungskasse_des_Dachdeckerhandwerks_VVaG", "10002209");
        $VALUES.add(Zusatzversorgungskasse_des_Dachdeckerhandwerks_VVaG);
        Deutsche_Steuerberater_Versicherung_Pensionskasse_des_steuerberatenden_Berufs_VVaG = new VersichererCode("Deutsche_Steuerberater_Versicherung_Pensionskasse_des_steuerberatenden_Berufs_VVaG", "10002211");
        $VALUES.add(Deutsche_Steuerberater_Versicherung_Pensionskasse_des_steuerberatenden_Berufs_VVaG);
        PENSIONSKASSE_DER_CREOS_UND_ENOVOS_DEUTSCHLAND_VVAG = new VersichererCode("PENSIONSKASSE_DER_CREOS_UND_ENOVOS_DEUTSCHLAND_VVAG", "10002214");
        $VALUES.add(PENSIONSKASSE_DER_CREOS_UND_ENOVOS_DEUTSCHLAND_VVAG);
        Pensionskasse_der_Sch_lke_Mayr_GmbH_V_V_a_G_c_o_Aon_Solutions_Germany_GmbH = new VersichererCode("Pensionskasse_der_Sch_lke_Mayr_GmbH_V_V_a_G_c_o_Aon_Solutions_Germany_GmbH", "10002217");
        $VALUES.add(Pensionskasse_der_Sch_lke_Mayr_GmbH_V_V_a_G_c_o_Aon_Solutions_Germany_GmbH);
        Zusatzversorgungskasse_des_Steinmetz_und_Steinbildhauerhandwerks_VVaG = new VersichererCode("Zusatzversorgungskasse_des_Steinmetz_und_Steinbildhauerhandwerks_VVaG", "10002218");
        $VALUES.add(Zusatzversorgungskasse_des_Steinmetz_und_Steinbildhauerhandwerks_VVaG);
        Pensionskasse_der_Genossenschaftsorganisation_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_der_Genossenschaftsorganisation_Versicherungsverein_auf_Gegenseitigkeit", "10002219");
        $VALUES.add(Pensionskasse_der_Genossenschaftsorganisation_Versicherungsverein_auf_Gegenseitigkeit);
        Zusatzversorgungskasse_f_r_die_Besch_ftigten_der_Deutschen_Brot_und_Backwarenindustrie_VVaG = new VersichererCode("Zusatzversorgungskasse_f_r_die_Besch_ftigten_der_Deutschen_Brot_und_Backwarenindustrie_VVaG", "10002220");
        $VALUES.add(Zusatzversorgungskasse_f_r_die_Besch_ftigten_der_Deutschen_Brot_und_Backwarenindustrie_VVaG);
        Zusatzversorgungskasse_f_r_die_Besch_ftigten_des_Deutschen_B_ckerhandwerks_VVaG = new VersichererCode("Zusatzversorgungskasse_f_r_die_Besch_ftigten_des_Deutschen_B_ckerhandwerks_VVaG", "10002221");
        $VALUES.add(Zusatzversorgungskasse_f_r_die_Besch_ftigten_des_Deutschen_B_ckerhandwerks_VVaG);
        Zusatzversorgungskasse_der_Steine_und_Erden_Industrie_u_des_Betonsteinhandwerks_VVaG_Die_Bayerische_Pensionskasse = new VersichererCode("Zusatzversorgungskasse_der_Steine_und_Erden_Industrie_u_des_Betonsteinhandwerks_VVaG_Die_Bayerische_Pensionskasse", "10002222");
        $VALUES.add(Zusatzversorgungskasse_der_Steine_und_Erden_Industrie_u_des_Betonsteinhandwerks_VVaG_Die_Bayerische_Pensionskasse);
        Pensionskasse_der_HELVETIA_Schweizerische_Versicherungsgesellschaft_Direktion_f_r_Deutschland = new VersichererCode("Pensionskasse_der_HELVETIA_Schweizerische_Versicherungsgesellschaft_Direktion_f_r_Deutschland", "10002223");
        $VALUES.add(Pensionskasse_der_HELVETIA_Schweizerische_Versicherungsgesellschaft_Direktion_f_r_Deutschland);
        Pensionskasse_Rundfunk = new VersichererCode("Pensionskasse_Rundfunk", "10002225");
        $VALUES.add(Pensionskasse_Rundfunk);
        PENSIONSKASSE_PEUGEOT_DEUTSCHLAND_VVaG = new VersichererCode("PENSIONSKASSE_PEUGEOT_DEUTSCHLAND_VVaG", "10002226");
        $VALUES.add(PENSIONSKASSE_PEUGEOT_DEUTSCHLAND_VVaG);
        Pensionskasse_f_r_die_Arbeitnehmerinnen_und_Arbeitnehmer_des_ZDF_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_f_r_die_Arbeitnehmerinnen_und_Arbeitnehmer_des_ZDF_Versicherungsverein_auf_Gegenseitigkeit", "10002227");
        $VALUES.add(Pensionskasse_f_r_die_Arbeitnehmerinnen_und_Arbeitnehmer_des_ZDF_Versicherungsverein_auf_Gegenseitigkeit);
        Pensionskasse_des_BDH_Bundesverband_Rehabilitation_VVaG = new VersichererCode("Pensionskasse_des_BDH_Bundesverband_Rehabilitation_VVaG", "10002228");
        $VALUES.add(Pensionskasse_des_BDH_Bundesverband_Rehabilitation_VVaG);
        Pensionskasse_der_Rechtsanw_lte_und_Notare_VVaG = new VersichererCode("Pensionskasse_der_Rechtsanw_lte_und_Notare_VVaG", "10002232");
        $VALUES.add(Pensionskasse_der_Rechtsanw_lte_und_Notare_VVaG);
        Pensionskasse_der_VHV_Versicherungen = new VersichererCode("Pensionskasse_der_VHV_Versicherungen", "10002235");
        $VALUES.add(Pensionskasse_der_VHV_Versicherungen);
        Zusatzversorgungskasse_des_Maler_und_Lackiererhandwerks_VVaG = new VersichererCode("Zusatzversorgungskasse_des_Maler_und_Lackiererhandwerks_VVaG", "10002236");
        $VALUES.add(Zusatzversorgungskasse_des_Maler_und_Lackiererhandwerks_VVaG);
        IBM_Deutschland_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("IBM_Deutschland_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit", "10002241");
        $VALUES.add(IBM_Deutschland_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit);
        Zusatzversorgungskasse_des_Ger_stbaugewerbes_VVaG = new VersichererCode("Zusatzversorgungskasse_des_Ger_stbaugewerbes_VVaG", "10002242");
        $VALUES.add(Zusatzversorgungskasse_des_Ger_stbaugewerbes_VVaG);
        Pensionskasse_Dynamit_Nobel_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensionskasse_Dynamit_Nobel_Versicherungsverein_auf_Gegenseitigkeit", "10002244");
        $VALUES.add(Pensionskasse_Dynamit_Nobel_Versicherungsverein_auf_Gegenseitigkeit);
        NESTL_R_CKDECKUNGSKASSE = new VersichererCode("NESTL_R_CKDECKUNGSKASSE", "10002245");
        $VALUES.add(NESTL_R_CKDECKUNGSKASSE);
        Hannoversche_Pensionskasse_VVaG = new VersichererCode("Hannoversche_Pensionskasse_VVaG", "10002246");
        $VALUES.add(Hannoversche_Pensionskasse_VVaG);
        HAMBURGER_PENSIONSR_CKDECKUNGSKASSE_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("HAMBURGER_PENSIONSR_CKDECKUNGSKASSE_Versicherungsverein_auf_Gegenseitigkeit", "10002247");
        $VALUES.add(HAMBURGER_PENSIONSR_CKDECKUNGSKASSE_Versicherungsverein_auf_Gegenseitigkeit);
        Hannoversche_Alterskasse_VVaG = new VersichererCode("Hannoversche_Alterskasse_VVaG", "10002249");
        $VALUES.add(Hannoversche_Alterskasse_VVaG);
        H_chster_Pensionskasse_VVaG = new VersichererCode("H_chster_Pensionskasse_VVaG", "10002250");
        $VALUES.add(H_chster_Pensionskasse_VVaG);
        Baden_Badener_Pensionskasse_VVaG = new VersichererCode("Baden_Badener_Pensionskasse_VVaG", "10002251");
        $VALUES.add(Baden_Badener_Pensionskasse_VVaG);
        SIGNAL_IDUNA_Pensionskasse_Aktiengesellschaft = new VersichererCode("SIGNAL_IDUNA_Pensionskasse_Aktiengesellschaft", "10002252");
        $VALUES.add(SIGNAL_IDUNA_Pensionskasse_Aktiengesellschaft);
        Zusatzversorgungswerk_f_r_Arbeitnehmer_in_der_Land_und_Forstwirtschaft_ZLF_VVaG = new VersichererCode("Zusatzversorgungswerk_f_r_Arbeitnehmer_in_der_Land_und_Forstwirtschaft_ZLF_VVaG", "10002253");
        $VALUES.add(Zusatzversorgungswerk_f_r_Arbeitnehmer_in_der_Land_und_Forstwirtschaft_ZLF_VVaG);
        K_lner_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit_i_L = new VersichererCode("K_lner_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit_i_L", "10002254");
        $VALUES.add(K_lner_Pensionskasse_Versicherungsverein_auf_Gegenseitigkeit_i_L);
        Gothaer_Pensionskasse_AG = new VersichererCode("Gothaer_Pensionskasse_AG", "10002255");
        $VALUES.add(Gothaer_Pensionskasse_AG);
        Debeka_Pensionskasse_AG = new VersichererCode("Debeka_Pensionskasse_AG", "10002256");
        $VALUES.add(Debeka_Pensionskasse_AG);
        Pro_bAV_Pensionskasse_AG = new VersichererCode("Pro_bAV_Pensionskasse_AG", "10002258");
        $VALUES.add(Pro_bAV_Pensionskasse_AG);
        ERGO_Pensionskasse_Aktiengesellschaft = new VersichererCode("ERGO_Pensionskasse_Aktiengesellschaft", "10002259");
        $VALUES.add(ERGO_Pensionskasse_Aktiengesellschaft);
        neue_leben_Pensionskasse_Aktiengesellschaft = new VersichererCode("neue_leben_Pensionskasse_Aktiengesellschaft", "10002261");
        $VALUES.add(neue_leben_Pensionskasse_Aktiengesellschaft);
        Sparkassen_Pensionskasse_AG = new VersichererCode("Sparkassen_Pensionskasse_AG", "10002265");
        $VALUES.add(Sparkassen_Pensionskasse_AG);
        DPK_Deutsche_Pensionskasse_AG = new VersichererCode("DPK_Deutsche_Pensionskasse_AG", "10002266");
        $VALUES.add(DPK_Deutsche_Pensionskasse_AG);
        Allgemeine_Rentenanstalt_Pensionskasse_AG = new VersichererCode("Allgemeine_Rentenanstalt_Pensionskasse_AG", "10002268");
        $VALUES.add(Allgemeine_Rentenanstalt_Pensionskasse_AG);
        Provinzial_Pensionskasse_Hannover_AG = new VersichererCode("Provinzial_Pensionskasse_Hannover_AG", "10002269");
        $VALUES.add(Provinzial_Pensionskasse_Hannover_AG);
        Swiss_Life_Pensionskasse_Aktiengesellschaft = new VersichererCode("Swiss_Life_Pensionskasse_Aktiengesellschaft", "10002270");
        $VALUES.add(Swiss_Life_Pensionskasse_Aktiengesellschaft);
        HDI_Pensionskasse_AG = new VersichererCode("HDI_Pensionskasse_AG", "10002275");
        $VALUES.add(HDI_Pensionskasse_AG);
        ALTE_LEIPZIGER_Pensionskasse_AG = new VersichererCode("ALTE_LEIPZIGER_Pensionskasse_AG", "10002276");
        $VALUES.add(ALTE_LEIPZIGER_Pensionskasse_AG);
        Versicherungskammer_Bayern_Pensionskasse_Aktiengesellschaft = new VersichererCode("Versicherungskammer_Bayern_Pensionskasse_Aktiengesellschaft", "10002277");
        $VALUES.add(Versicherungskammer_Bayern_Pensionskasse_Aktiengesellschaft);
        N_RNBERGER_Pensionskasse_Aktiengesellschaft = new VersichererCode("N_RNBERGER_Pensionskasse_Aktiengesellschaft", "10002278");
        $VALUES.add(N_RNBERGER_Pensionskasse_Aktiengesellschaft);
        Athora_Pensionskasse_Aktiengesellschaft = new VersichererCode("Athora_Pensionskasse_Aktiengesellschaft", "10002279");
        $VALUES.add(Athora_Pensionskasse_Aktiengesellschaft);
        Zentrales_Versorgungswerk_f_r_das_Dachdeckerhandwerk_VVaG = new VersichererCode("Zentrales_Versorgungswerk_f_r_das_Dachdeckerhandwerk_VVaG", "10002281");
        $VALUES.add(Zentrales_Versorgungswerk_f_r_das_Dachdeckerhandwerk_VVaG);
        Rheinische_Pensionskasse = new VersichererCode("Rheinische_Pensionskasse", "10002282");
        $VALUES.add(Rheinische_Pensionskasse);
        Versorgungsanstalt_des_Bundes_und_der_L_nder = new VersichererCode("Versorgungsanstalt_des_Bundes_und_der_L_nder", "10002283");
        $VALUES.add(Versorgungsanstalt_des_Bundes_und_der_L_nder);
        R_V_PENSIONSKASSE_AKTIENGESELLSCHAFT = new VersichererCode("R_V_PENSIONSKASSE_AKTIENGESELLSCHAFT", "10002285");
        $VALUES.add(R_V_PENSIONSKASSE_AKTIENGESELLSCHAFT);
        Wuppertaler_Pensionskasse_VVaG = new VersichererCode("Wuppertaler_Pensionskasse_VVaG", "10002288");
        $VALUES.add(Wuppertaler_Pensionskasse_VVaG);
        Versorgungsausgleichskasse_Pensionskasse_VVaG = new VersichererCode("Versorgungsausgleichskasse_Pensionskasse_VVaG", "10002289");
        $VALUES.add(Versorgungsausgleichskasse_Pensionskasse_VVaG);
        K_lnVorsorge_Sterbeversicherung_VVaG = new VersichererCode("K_lnVorsorge_Sterbeversicherung_VVaG", "10003008");
        $VALUES.add(K_lnVorsorge_Sterbeversicherung_VVaG);
        Sterbekasse_Evangelischer_Freikirchen_VVaG = new VersichererCode("Sterbekasse_Evangelischer_Freikirchen_VVaG", "10003009");
        $VALUES.add(Sterbekasse_Evangelischer_Freikirchen_VVaG);
        Sterbekasse_f_r_die_Angestellten_der_Deutsche_Bank_Gruppe = new VersichererCode("Sterbekasse_f_r_die_Angestellten_der_Deutsche_Bank_Gruppe", "10003017");
        $VALUES.add(Sterbekasse_f_r_die_Angestellten_der_Deutsche_Bank_Gruppe);
        Bayer_Beistandskasse = new VersichererCode("Bayer_Beistandskasse", "10003019");
        $VALUES.add(Bayer_Beistandskasse);
        H_chster_Sterbekasse_VVaG = new VersichererCode("H_chster_Sterbekasse_VVaG", "10003028");
        $VALUES.add(H_chster_Sterbekasse_VVaG);
        Vorsorgekasse_der_Commerzbank_Versicherungsverein_a_G = new VersichererCode("Vorsorgekasse_der_Commerzbank_Versicherungsverein_a_G", "10003029");
        $VALUES.add(Vorsorgekasse_der_Commerzbank_Versicherungsverein_a_G);
        Hilfskasse_BVG = new VersichererCode("Hilfskasse_BVG", "10003031");
        $VALUES.add(Hilfskasse_BVG);
        BASF_Sterbekasse_VVaG = new VersichererCode("BASF_Sterbekasse_VVaG", "10003034");
        $VALUES.add(BASF_Sterbekasse_VVaG);
        GE_BE_IN_Versicherungen_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("GE_BE_IN_Versicherungen_Versicherungsverein_auf_Gegenseitigkeit", "10003063");
        $VALUES.add(GE_BE_IN_Versicherungen_Versicherungsverein_auf_Gegenseitigkeit);
        Sterbe_Unterst_tzungs_Vereinigung_der_Besch_ftigten_der_Stadt_M_nchen = new VersichererCode("Sterbe_Unterst_tzungs_Vereinigung_der_Besch_ftigten_der_Stadt_M_nchen", "10003067");
        $VALUES.add(Sterbe_Unterst_tzungs_Vereinigung_der_Besch_ftigten_der_Stadt_M_nchen);
        Erste_Kieler_Beerdigungskasse = new VersichererCode("Erste_Kieler_Beerdigungskasse", "10003068");
        $VALUES.add(Erste_Kieler_Beerdigungskasse);
        Versicherungsverein_Rasselstein = new VersichererCode("Versicherungsverein_Rasselstein", "10003072");
        $VALUES.add(Versicherungsverein_Rasselstein);
        SOLIDAR_Versicherungsgemeinschaft_Sterbegeldversicherung_VVaG = new VersichererCode("SOLIDAR_Versicherungsgemeinschaft_Sterbegeldversicherung_VVaG", "10003079");
        $VALUES.add(SOLIDAR_Versicherungsgemeinschaft_Sterbegeldversicherung_VVaG);
        Sterbekasse_der_Bediensteten_der_Stadtverwaltung_Dortmund = new VersichererCode("Sterbekasse_der_Bediensteten_der_Stadtverwaltung_Dortmund", "10003084");
        $VALUES.add(Sterbekasse_der_Bediensteten_der_Stadtverwaltung_Dortmund);
        Feuerbestattungsverein_VVaG = new VersichererCode("Feuerbestattungsverein_VVaG", "10003091");
        $VALUES.add(Feuerbestattungsverein_VVaG);
        Hinterbliebenenkasse_der_Heilberufe_HDH_Versicherungsverein_a_G_in_M_nchen = new VersichererCode("Hinterbliebenenkasse_der_Heilberufe_HDH_Versicherungsverein_a_G_in_M_nchen", "10003092");
        $VALUES.add(Hinterbliebenenkasse_der_Heilberufe_HDH_Versicherungsverein_a_G_in_M_nchen);
        SONO_Sterbegeld_VVaG = new VersichererCode("SONO_Sterbegeld_VVaG", "10003105");
        $VALUES.add(SONO_Sterbegeld_VVaG);
        Vorsorgekasse_Hoesch_Dortmund_Sterbegeldversicherung_VVaG = new VersichererCode("Vorsorgekasse_Hoesch_Dortmund_Sterbegeldversicherung_VVaG", "10003107");
        $VALUES.add(Vorsorgekasse_Hoesch_Dortmund_Sterbegeldversicherung_VVaG);
        Sterbekasse_der_Belegschaft_der_Saarstahl_AG_V_lklingen_Werk_V_lklingen_und_Werk_Burbach = new VersichererCode("Sterbekasse_der_Belegschaft_der_Saarstahl_AG_V_lklingen_Werk_V_lklingen_und_Werk_Burbach", "10003138");
        $VALUES.add(Sterbekasse_der_Belegschaft_der_Saarstahl_AG_V_lklingen_Werk_V_lklingen_und_Werk_Burbach);
        Sterbekasse_der_Saarbergleute_VVaG = new VersichererCode("Sterbekasse_der_Saarbergleute_VVaG", "10003139");
        $VALUES.add(Sterbekasse_der_Saarbergleute_VVaG);
        Bochumer_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Bochumer_Versicherungsverein_auf_Gegenseitigkeit", "10003140");
        $VALUES.add(Bochumer_Versicherungsverein_auf_Gegenseitigkeit);
        F_rsorgekasse_von_1908_vormals_Sterbekasse_der_Neuapostolischen_Kirche_des_Landes_Nordrhein_Westfalen = new VersichererCode("F_rsorgekasse_von_1908_vormals_Sterbekasse_der_Neuapostolischen_Kirche_des_Landes_Nordrhein_Westfalen", "10003151");
        $VALUES.add(F_rsorgekasse_von_1908_vormals_Sterbekasse_der_Neuapostolischen_Kirche_des_Landes_Nordrhein_Westfalen);
        Sterbekasse_Sozialversicherung_gegr_in_der_LVA_Rheinprovinz_D_sseldorf = new VersichererCode("Sterbekasse_Sozialversicherung_gegr_in_der_LVA_Rheinprovinz_D_sseldorf", "10003152");
        $VALUES.add(Sterbekasse_Sozialversicherung_gegr_in_der_LVA_Rheinprovinz_D_sseldorf);
        IDEAL_Sterbekasse_Lebensversicherung_AG = new VersichererCode("IDEAL_Sterbekasse_Lebensversicherung_AG", "10003154");
        $VALUES.add(IDEAL_Sterbekasse_Lebensversicherung_AG);
        Sterbekasse_der_Feuerwehren_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Sterbekasse_der_Feuerwehren_Versicherungsverein_auf_Gegenseitigkeit", "10003155");
        $VALUES.add(Sterbekasse_der_Feuerwehren_Versicherungsverein_auf_Gegenseitigkeit);
        Generali_Pensionsfonds_AG = new VersichererCode("Generali_Pensionsfonds_AG", "10003300");
        $VALUES.add(Generali_Pensionsfonds_AG);
        CHEMIE_Pensionsfonds_AG = new VersichererCode("CHEMIE_Pensionsfonds_AG", "10003301");
        $VALUES.add(CHEMIE_Pensionsfonds_AG);
        Telekom_Pensionsfonds_a_G = new VersichererCode("Telekom_Pensionsfonds_a_G", "10003302");
        $VALUES.add(Telekom_Pensionsfonds_a_G);
        Deutscher_Pensionsfonds_Aktiengesellschaft = new VersichererCode("Deutscher_Pensionsfonds_Aktiengesellschaft", "10003303");
        $VALUES.add(Deutscher_Pensionsfonds_Aktiengesellschaft);
        Allianz_Pensionsfonds_Aktiengesellschaft = new VersichererCode("Allianz_Pensionsfonds_Aktiengesellschaft", "10003304");
        $VALUES.add(Allianz_Pensionsfonds_Aktiengesellschaft);
        VIFA_Pensionsfonds_AG = new VersichererCode("VIFA_Pensionsfonds_AG", "10003309");
        $VALUES.add(VIFA_Pensionsfonds_AG);
        R_V_Pensionsfonds_Aktiengesellschaft = new VersichererCode("R_V_Pensionsfonds_Aktiengesellschaft", "10003311");
        $VALUES.add(R_V_Pensionsfonds_Aktiengesellschaft);
        LVM_Pensionsfonds_AG = new VersichererCode("LVM_Pensionsfonds_AG", "10003312");
        $VALUES.add(LVM_Pensionsfonds_AG);
        Bosch_Pensionsfonds_Aktiengesellschaft = new VersichererCode("Bosch_Pensionsfonds_Aktiengesellschaft", "10003313");
        $VALUES.add(Bosch_Pensionsfonds_Aktiengesellschaft);
        Swiss_Life_Pensionsfonds_Aktiengesellschaft = new VersichererCode("Swiss_Life_Pensionsfonds_Aktiengesellschaft", "10003315");
        $VALUES.add(Swiss_Life_Pensionsfonds_Aktiengesellschaft);
        WWK_Pensionsfonds_Aktiengesellschaft = new VersichererCode("WWK_Pensionsfonds_Aktiengesellschaft", "10003318");
        $VALUES.add(WWK_Pensionsfonds_Aktiengesellschaft);
        VdW_Pensionsfonds_AG = new VersichererCode("VdW_Pensionsfonds_AG", "10003319");
        $VALUES.add(VdW_Pensionsfonds_AG);
        ALTE_LEIPZIGER_Pensionsfonds_AG = new VersichererCode("ALTE_LEIPZIGER_Pensionsfonds_AG", "10003320");
        $VALUES.add(ALTE_LEIPZIGER_Pensionsfonds_AG);
        Lippische_Pensionsfonds_AG = new VersichererCode("Lippische_Pensionsfonds_AG", "10003321");
        $VALUES.add(Lippische_Pensionsfonds_AG);
        ERGO_Pensionsfonds_Aktiengesellschaft = new VersichererCode("ERGO_Pensionsfonds_Aktiengesellschaft", "10003322");
        $VALUES.add(ERGO_Pensionsfonds_Aktiengesellschaft);
        Metzler_Mittelstands_Pensionsfonds_AG = new VersichererCode("Metzler_Mittelstands_Pensionsfonds_AG", "10003323");
        $VALUES.add(Metzler_Mittelstands_Pensionsfonds_AG);
        Siemens_Pensionsfonds_AG = new VersichererCode("Siemens_Pensionsfonds_AG", "10003324");
        $VALUES.add(Siemens_Pensionsfonds_AG);
        RWE_Pensionsfonds_AG = new VersichererCode("RWE_Pensionsfonds_AG", "10003325");
        $VALUES.add(RWE_Pensionsfonds_AG);
        BVV_Pensionsfonds_des_Bankgewerbes_AG = new VersichererCode("BVV_Pensionsfonds_des_Bankgewerbes_AG", "10003327");
        $VALUES.add(BVV_Pensionsfonds_des_Bankgewerbes_AG);
        Nestl_Pensionsfonds_AG = new VersichererCode("Nestl_Pensionsfonds_AG", "10003328");
        $VALUES.add(Nestl_Pensionsfonds_AG);
        HVB_Trust_Pensionsfonds_AG = new VersichererCode("HVB_Trust_Pensionsfonds_AG", "10003329");
        $VALUES.add(HVB_Trust_Pensionsfonds_AG);
        Deutsche_Post_Pensionsfonds_AG = new VersichererCode("Deutsche_Post_Pensionsfonds_AG", "10003330");
        $VALUES.add(Deutsche_Post_Pensionsfonds_AG);
        IBM_Deutschland_Pensionsfonds_AG = new VersichererCode("IBM_Deutschland_Pensionsfonds_AG", "10003331");
        $VALUES.add(IBM_Deutschland_Pensionsfonds_AG);
        SIGNAL_IDUNA_Krankenversicherung_a_G = new VersichererCode("SIGNAL_IDUNA_Krankenversicherung_a_G", "10004002");
        $VALUES.add(SIGNAL_IDUNA_Krankenversicherung_a_G);
        ALTE_OLDENBURGER_Krankenversicherung_von_1927_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("ALTE_OLDENBURGER_Krankenversicherung_von_1927_Versicherungsverein_auf_Gegenseitigkeit", "10004010");
        $VALUES.add(ALTE_OLDENBURGER_Krankenversicherung_von_1927_Versicherungsverein_auf_Gegenseitigkeit);
        Landeskrankenhilfe_V_V_a_G = new VersichererCode("Landeskrankenhilfe_V_V_a_G", "10004011");
        $VALUES.add(Landeskrankenhilfe_V_V_a_G);
        HanseMerkur_Krankenversicherung_auf_Gegenseitigkeit = new VersichererCode("HanseMerkur_Krankenversicherung_auf_Gegenseitigkeit", "10004018");
        $VALUES.add(HanseMerkur_Krankenversicherung_auf_Gegenseitigkeit);
        M_NCHENER_VEREIN_Krankenversicherung_a_G = new VersichererCode("M_NCHENER_VEREIN_Krankenversicherung_a_G", "10004037");
        $VALUES.add(M_NCHENER_VEREIN_Krankenversicherung_a_G);
        S_ddeutsche_Krankenversicherung_a_G = new VersichererCode("S_ddeutsche_Krankenversicherung_a_G", "10004039");
        $VALUES.add(S_ddeutsche_Krankenversicherung_a_G);
        Hallesche_Krankenversicherung_auf_Gegenseitigkeit = new VersichererCode("Hallesche_Krankenversicherung_auf_Gegenseitigkeit", "10004043");
        $VALUES.add(Hallesche_Krankenversicherung_auf_Gegenseitigkeit);
        uniVersa_Krankenversicherung_a_G = new VersichererCode("uniVersa_Krankenversicherung_a_G", "10004045");
        $VALUES.add(uniVersa_Krankenversicherung_a_G);
        LIGA_Krankenversicherung_katholischer_Priester_Versicherungsverein_auf_Gegenseitigkeit_Regensburg = new VersichererCode("LIGA_Krankenversicherung_katholischer_Priester_Versicherungsverein_auf_Gegenseitigkeit_Regensburg", "10004051");
        $VALUES.add(LIGA_Krankenversicherung_katholischer_Priester_Versicherungsverein_auf_Gegenseitigkeit_Regensburg);
        praenatura_Versicherungsverein_auf_Gegenseitigkeit_VVaG = new VersichererCode("praenatura_Versicherungsverein_auf_Gegenseitigkeit_VVaG", "10004080");
        $VALUES.add(praenatura_Versicherungsverein_auf_Gegenseitigkeit_VVaG);
        SONO_Krankenversicherung_a_G = new VersichererCode("SONO_Krankenversicherung_a_G", "10004082");
        $VALUES.add(SONO_Krankenversicherung_a_G);
        AXA_Krankenversicherung_Aktiengesellschaft = new VersichererCode("AXA_Krankenversicherung_Aktiengesellschaft", "10004095");
        $VALUES.add(AXA_Krankenversicherung_Aktiengesellschaft);
        Lohnfortzahlungskasse_Leer_VVaG = new VersichererCode("Lohnfortzahlungskasse_Leer_VVaG", "10004102");
        $VALUES.add(Lohnfortzahlungskasse_Leer_VVaG);
        Lohnfortzahlungskasse_Aurich_VVaG_i_L = new VersichererCode("Lohnfortzahlungskasse_Aurich_VVaG_i_L", "10004103");
        $VALUES.add(Lohnfortzahlungskasse_Aurich_VVaG_i_L);
        Krankenunterst_tzungskasse_Hannover_i_L = new VersichererCode("Krankenunterst_tzungskasse_Hannover_i_L", "10004104");
        $VALUES.add(Krankenunterst_tzungskasse_Hannover_i_L);
        St_Martinus_Priesterverein_der_Di_zese_Rottenburg_Stuttgart_Kranken_und_Sterbekasse_KSK_Versicherungsverein_auf_Gegenseitigkeit_VVaG_i_L = new VersichererCode("St_Martinus_Priesterverein_der_Di_zese_Rottenburg_Stuttgart_Kranken_und_Sterbekasse_KSK_Versicherungsverein_auf_Gegenseitigkeit_VVaG_i_L", "10004106");
        $VALUES.add(St_Martinus_Priesterverein_der_Di_zese_Rottenburg_Stuttgart_Kranken_und_Sterbekasse_KSK_Versicherungsverein_auf_Gegenseitigkeit_VVaG_i_L);
        UNION_KRANKENVERSICHERUNG_AKTIENGESELLSCHAFT = new VersichererCode("UNION_KRANKENVERSICHERUNG_AKTIENGESELLSCHAFT", "10004108");
        $VALUES.add(UNION_KRANKENVERSICHERUNG_AKTIENGESELLSCHAFT);
        LVM_Krankenversicherungs_AG = new VersichererCode("LVM_Krankenversicherungs_AG", "10004109");
        $VALUES.add(LVM_Krankenversicherungs_AG);
        ARAG_Krankenversicherungs_Aktiengesellschaft = new VersichererCode("ARAG_Krankenversicherungs_Aktiengesellschaft", "10004112");
        $VALUES.add(ARAG_Krankenversicherungs_Aktiengesellschaft);
        vigo_Krankenversicherung_VVaG = new VersichererCode("vigo_Krankenversicherung_VVaG", "10004115");
        $VALUES.add(vigo_Krankenversicherung_VVaG);
        R_V_Krankenversicherung_Aktiengesellschaft = new VersichererCode("R_V_Krankenversicherung_Aktiengesellschaft", "10004116");
        $VALUES.add(R_V_Krankenversicherung_Aktiengesellschaft);
        HUK_COBURG_Krankenversicherung_AG = new VersichererCode("HUK_COBURG_Krankenversicherung_AG", "10004117");
        $VALUES.add(HUK_COBURG_Krankenversicherung_AG);
        Concordia_Krankenversicherungs_Aktiengesellschaft = new VersichererCode("Concordia_Krankenversicherungs_Aktiengesellschaft", "10004118");
        $VALUES.add(Concordia_Krankenversicherungs_Aktiengesellschaft);
        ENVIVAS_Krankenversicherung_Aktiengesellschaft = new VersichererCode("ENVIVAS_Krankenversicherung_Aktiengesellschaft", "10004121");
        $VALUES.add(ENVIVAS_Krankenversicherung_Aktiengesellschaft);
        HanseMerkur_Speziale_Krankenversicherung_AG = new VersichererCode("HanseMerkur_Speziale_Krankenversicherung_AG", "10004122");
        $VALUES.add(HanseMerkur_Speziale_Krankenversicherung_AG);
        N_RNBERGER_Krankenversicherung_Aktiengesellschaft = new VersichererCode("N_RNBERGER_Krankenversicherung_Aktiengesellschaft", "10004125");
        $VALUES.add(N_RNBERGER_Krankenversicherung_Aktiengesellschaft);
        ERGO_Krankenversicherung_AG = new VersichererCode("ERGO_Krankenversicherung_AG", "10004126");
        $VALUES.add(ERGO_Krankenversicherung_AG);
        Augenoptiker_Ausgleichskasse_VVaG_AKA = new VersichererCode("Augenoptiker_Ausgleichskasse_VVaG_AKA", "10004129");
        $VALUES.add(Augenoptiker_Ausgleichskasse_VVaG_AKA);
        DEVK_Krankenversicherungs_Aktiengesellschaft = new VersichererCode("DEVK_Krankenversicherungs_Aktiengesellschaft", "10004131");
        $VALUES.add(DEVK_Krankenversicherungs_Aktiengesellschaft);
        Bayerische_Beamtenkrankenkasse_Aktiengesellschaft = new VersichererCode("Bayerische_Beamtenkrankenkasse_Aktiengesellschaft", "10004134");
        $VALUES.add(Bayerische_Beamtenkrankenkasse_Aktiengesellschaft);
        Provinzial_Krankenversicherung_Hannover_AG = new VersichererCode("Provinzial_Krankenversicherung_Hannover_AG", "10004135");
        $VALUES.add(Provinzial_Krankenversicherung_Hannover_AG);
        W_rttembergische_Krankenversicherung_Aktiengesellschaft = new VersichererCode("W_rttembergische_Krankenversicherung_Aktiengesellschaft", "10004139");
        $VALUES.add(W_rttembergische_Krankenversicherung_Aktiengesellschaft);
        Mecklenburgische_Krankenversicherungs_Aktiengesellschaft = new VersichererCode("Mecklenburgische_Krankenversicherungs_Aktiengesellschaft", "10004141");
        $VALUES.add(Mecklenburgische_Krankenversicherungs_Aktiengesellschaft);
        Versicherer_im_Raum_der_Kirchen_Krankenversicherung_AG = new VersichererCode("Versicherer_im_Raum_der_Kirchen_Krankenversicherung_AG", "10004143");
        $VALUES.add(Versicherer_im_Raum_der_Kirchen_Krankenversicherung_AG);
        HanseMerkur_Krankenversicherung_AG = new VersichererCode("HanseMerkur_Krankenversicherung_AG", "10004144");
        $VALUES.add(HanseMerkur_Krankenversicherung_AG);
        CONSTANTIA_Versicherungen_a_G = new VersichererCode("CONSTANTIA_Versicherungen_a_G", "10005004");
        $VALUES.add(CONSTANTIA_Versicherungen_a_G);
        SHB_Allgemeine_Versicherung_VVaG = new VersichererCode("SHB_Allgemeine_Versicherung_VVaG", "10005008");
        $VALUES.add(SHB_Allgemeine_Versicherung_VVaG);
        Hamburger_Beamten_Feuer_und_Einbruchskasse = new VersichererCode("Hamburger_Beamten_Feuer_und_Einbruchskasse", "10005011");
        $VALUES.add(Hamburger_Beamten_Feuer_und_Einbruchskasse);
        Hamburger_Lehrer_Feuerkasse = new VersichererCode("Hamburger_Lehrer_Feuerkasse", "10005012");
        $VALUES.add(Hamburger_Lehrer_Feuerkasse);
        Lehrer_Feuerversicherungsverein_a_G_f_r_Schleswig_Holstein_Hamburg_und_Mecklenburg_Vorpommern = new VersichererCode("Lehrer_Feuerversicherungsverein_a_G_f_r_Schleswig_Holstein_Hamburg_und_Mecklenburg_Vorpommern", "10005013");
        $VALUES.add(Lehrer_Feuerversicherungsverein_a_G_f_r_Schleswig_Holstein_Hamburg_und_Mecklenburg_Vorpommern);
        Neuendorfer_Brand_Bau_Gilde = new VersichererCode("Neuendorfer_Brand_Bau_Gilde", "10005014");
        $VALUES.add(Neuendorfer_Brand_Bau_Gilde);
        NV_Versicherungen_VVaG = new VersichererCode("NV_Versicherungen_VVaG", "10005015");
        $VALUES.add(NV_Versicherungen_VVaG);
        Nordhemmer_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Nordhemmer_Versicherungsverein_auf_Gegenseitigkeit", "10005016");
        $VALUES.add(Nordhemmer_Versicherungsverein_auf_Gegenseitigkeit);
        Ostangler_Brandgilde_Versicherungsverein_auf_Gegenseitigkeit_VVaG = new VersichererCode("Ostangler_Brandgilde_Versicherungsverein_auf_Gegenseitigkeit_VVaG", "10005017");
        $VALUES.add(Ostangler_Brandgilde_Versicherungsverein_auf_Gegenseitigkeit_VVaG);
        Schutzverein_Deutscher_Rheder_V_a_G = new VersichererCode("Schutzverein_Deutscher_Rheder_V_a_G", "10005018");
        $VALUES.add(Schutzverein_Deutscher_Rheder_V_a_G);
        Feuersoziet_t_Berlin_Brandenburg_Versicherung_Aktiengesellschaft = new VersichererCode("Feuersoziet_t_Berlin_Brandenburg_Versicherung_Aktiengesellschaft", "10005024");
        $VALUES.add(Feuersoziet_t_Berlin_Brandenburg_Versicherung_Aktiengesellschaft);
        Liberty_Mutual_Insurance_Europe_SE_Direktion_f_r_Deutschland = new VersichererCode("Liberty_Mutual_Insurance_Europe_SE_Direktion_f_r_Deutschland", "10005028");
        $VALUES.add(Liberty_Mutual_Insurance_Europe_SE_Direktion_f_r_Deutschland);
        Aioi_Nissay_Dowa_Insurance_Company_of_Europe_SE_Niederlassung_Deutschland = new VersichererCode("Aioi_Nissay_Dowa_Insurance_Company_of_Europe_SE_Niederlassung_Deutschland", "10005029");
        $VALUES.add(Aioi_Nissay_Dowa_Insurance_Company_of_Europe_SE_Niederlassung_Deutschland);
        Freeyou_Insurance_AG = new VersichererCode("Freeyou_Insurance_AG", "10005033");
        $VALUES.add(Freeyou_Insurance_AG);
        AGILA_Haustierversicherung_Aktiengesellschaft = new VersichererCode("AGILA_Haustierversicherung_Aktiengesellschaft", "10005035");
        $VALUES.add(AGILA_Haustierversicherung_Aktiengesellschaft);
        SV_SparkassenVersicherung_Geb_udeversicherung_Aktiengesellschaft = new VersichererCode("SV_SparkassenVersicherung_Geb_udeversicherung_Aktiengesellschaft", "10005036");
        $VALUES.add(SV_SparkassenVersicherung_Geb_udeversicherung_Aktiengesellschaft);
        Euro_Aviation_Versicherungs_Aktiengesellschaft = new VersichererCode("Euro_Aviation_Versicherungs_Aktiengesellschaft", "10005038");
        $VALUES.add(Euro_Aviation_Versicherungs_Aktiengesellschaft);
        Bayerische_Landesbrandversicherung_Aktiengesellschaft = new VersichererCode("Bayerische_Landesbrandversicherung_Aktiengesellschaft", "10005043");
        $VALUES.add(Bayerische_Landesbrandversicherung_Aktiengesellschaft);
        Haftpflichtgemeinschaft_Deutscher_Nahverkehrs_und_Versorgungsunternehmen_Allgemein_HDNA_VVaG = new VersichererCode("Haftpflichtgemeinschaft_Deutscher_Nahverkehrs_und_Versorgungsunternehmen_Allgemein_HDNA_VVaG", "10005044");
        $VALUES.add(Haftpflichtgemeinschaft_Deutscher_Nahverkehrs_und_Versorgungsunternehmen_Allgemein_HDNA_VVaG);
        Verti_Versicherung_AG = new VersichererCode("Verti_Versicherung_AG", "10005055");
        $VALUES.add(Verti_Versicherung_AG);
        Cardif_Allgemeine_Versicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurances_Risques_Divers = new VersichererCode("Cardif_Allgemeine_Versicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurances_Risques_Divers", "10005056");
        $VALUES.add(Cardif_Allgemeine_Versicherung_Zweigniederlassung_f_r_Deutschland_der_Cardif_Assurances_Risques_Divers);
        Interlloyd_Versicherungs_Aktiengesellschaft = new VersichererCode("Interlloyd_Versicherungs_Aktiengesellschaft", "10005057");
        $VALUES.add(Interlloyd_Versicherungs_Aktiengesellschaft);
        KRAVAG_ALLGEMEINE_Versicherungs_Aktiengesellschaft = new VersichererCode("KRAVAG_ALLGEMEINE_Versicherungs_Aktiengesellschaft", "10005058");
        $VALUES.add(KRAVAG_ALLGEMEINE_Versicherungs_Aktiengesellschaft);
        Mannheimer_Versicherung_Aktiengesellschaft = new VersichererCode("Mannheimer_Versicherung_Aktiengesellschaft", "10005061");
        $VALUES.add(Mannheimer_Versicherung_Aktiengesellschaft);
        AMMERL_NDER_VERSICHERUNG_Versicherungsverein_a_G_VVaG = new VersichererCode("AMMERL_NDER_VERSICHERUNG_Versicherungsverein_a_G_VVaG", "10005068");
        $VALUES.add(AMMERL_NDER_VERSICHERUNG_Versicherungsverein_a_G_VVaG);
        nexible_Versicherung_AG = new VersichererCode("nexible_Versicherung_AG", "10005070");
        $VALUES.add(nexible_Versicherung_AG);
        If_Schadenversicherung_AG_Direktion_f_r_Deutschland = new VersichererCode("If_Schadenversicherung_AG_Direktion_f_r_Deutschland", "10005072");
        $VALUES.add(If_Schadenversicherung_AG_Direktion_f_r_Deutschland);
        Janitos_Versicherung_Aktiengesellschaft = new VersichererCode("Janitos_Versicherung_Aktiengesellschaft", "10005078");
        $VALUES.add(Janitos_Versicherung_Aktiengesellschaft);
        KRAVAG_LOGISTIC_Versicherungs_Aktiengesellschaft = new VersichererCode("KRAVAG_LOGISTIC_Versicherungs_Aktiengesellschaft", "10005080");
        $VALUES.add(KRAVAG_LOGISTIC_Versicherungs_Aktiengesellschaft);
        Waldenburger_Versicherung_Aktiengesellschaft = new VersichererCode("Waldenburger_Versicherung_Aktiengesellschaft", "10005082");
        $VALUES.add(Waldenburger_Versicherung_Aktiengesellschaft);
        BVAG_Berliner_Versicherung_Aktiengesellschaft = new VersichererCode("BVAG_Berliner_Versicherung_Aktiengesellschaft", "10005083");
        $VALUES.add(BVAG_Berliner_Versicherung_Aktiengesellschaft);
        HDI_Versicherung_AG = new VersichererCode("HDI_Versicherung_AG", "10005085");
        $VALUES.add(HDI_Versicherung_AG);
        HUK24_AG = new VersichererCode("HUK24_AG", "10005086");
        $VALUES.add(HUK24_AG);
        XL_Insurance_Company_SE_Direktion_f_r_Deutschland = new VersichererCode("XL_Insurance_Company_SE_Direktion_f_r_Deutschland", "10005088");
        $VALUES.add(XL_Insurance_Company_SE_Direktion_f_r_Deutschland);
        Union_Reiseversicherung_Aktiengesellschaft = new VersichererCode("Union_Reiseversicherung_Aktiengesellschaft", "10005094");
        $VALUES.add(Union_Reiseversicherung_Aktiengesellschaft);
        Provinzial_Versicherung_Aktiengesellschaft = new VersichererCode("Provinzial_Versicherung_Aktiengesellschaft", "10005095");
        $VALUES.add(Provinzial_Versicherung_Aktiengesellschaft);
        HDI_Global_SE = new VersichererCode("HDI_Global_SE", "10005096");
        $VALUES.add(HDI_Global_SE);
        Versicherer_im_Raum_der_Kirchen_Sachversicherung_AG = new VersichererCode("Versicherer_im_Raum_der_Kirchen_Sachversicherung_AG", "10005098");
        $VALUES.add(Versicherer_im_Raum_der_Kirchen_Sachversicherung_AG);
        VRK_Versicherungsverein_auf_Gegenseitigkeit_im_Raum_der_Kirchen = new VersichererCode("VRK_Versicherungsverein_auf_Gegenseitigkeit_im_Raum_der_Kirchen", "10005099");
        $VALUES.add(VRK_Versicherungsverein_auf_Gegenseitigkeit_im_Raum_der_Kirchen);
        EUROMAF_Assurance_des_Ing_nieurs_et_Architectes_Europ_ens_Zweigniederlassung_D_sseldorf = new VersichererCode("EUROMAF_Assurance_des_Ing_nieurs_et_Architectes_Europ_ens_Zweigniederlassung_D_sseldorf", "10005115");
        $VALUES.add(EUROMAF_Assurance_des_Ing_nieurs_et_Architectes_Europ_ens_Zweigniederlassung_D_sseldorf);
        Rhion_Versicherung_Aktiengesellschaft = new VersichererCode("Rhion_Versicherung_Aktiengesellschaft", "10005121");
        $VALUES.add(Rhion_Versicherung_Aktiengesellschaft);
        SIGNAL_IDUNA_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("SIGNAL_IDUNA_Allgemeine_Versicherung_Aktiengesellschaft", "10005125");
        $VALUES.add(SIGNAL_IDUNA_Allgemeine_Versicherung_Aktiengesellschaft);
        H_bener_Versicherungs_Aktiengesellschaft = new VersichererCode("H_bener_Versicherungs_Aktiengesellschaft", "10005126");
        $VALUES.add(H_bener_Versicherungs_Aktiengesellschaft);
        SOGECAP_S_A_Deutsche_Niederlassung = new VersichererCode("SOGECAP_S_A_Deutsche_Niederlassung", "10005128");
        $VALUES.add(SOGECAP_S_A_Deutsche_Niederlassung);
        DFV_Deutsche_Familienversicherung_AG = new VersichererCode("DFV_Deutsche_Familienversicherung_AG", "10005129");
        $VALUES.add(DFV_Deutsche_Familienversicherung_AG);
        CREDENDO_Guarantees_Speciality_Risks_SA_NV_Zweigniederlassung_Deutschland = new VersichererCode("CREDENDO_Guarantees_Speciality_Risks_SA_NV_Zweigniederlassung_Deutschland", "10005134");
        $VALUES.add(CREDENDO_Guarantees_Speciality_Risks_SA_NV_Zweigniederlassung_Deutschland);
        ADAC_Autoversicherung_AG = new VersichererCode("ADAC_Autoversicherung_AG", "10005135");
        $VALUES.add(ADAC_Autoversicherung_AG);
        Swiss_Re_International_SE_Niederlassung_Deutschland = new VersichererCode("Swiss_Re_International_SE_Niederlassung_Deutschland", "10005138");
        $VALUES.add(Swiss_Re_International_SE_Niederlassung_Deutschland);
        CHUBB_Life_Europe_SE_Direktion_f_r_Deutschland = new VersichererCode("CHUBB_Life_Europe_SE_Direktion_f_r_Deutschland", "10005139");
        $VALUES.add(CHUBB_Life_Europe_SE_Direktion_f_r_Deutschland);
        Ober_sterreichische_Versicherung_AG = new VersichererCode("Ober_sterreichische_Versicherung_AG", "10005140");
        $VALUES.add(Ober_sterreichische_Versicherung_AG);
        East_West_Assekuranz_AG = new VersichererCode("East_West_Assekuranz_AG", "10005141");
        $VALUES.add(East_West_Assekuranz_AG);
        MELES_Insurance_A_S_Niederlassung_Deutschland = new VersichererCode("MELES_Insurance_A_S_Niederlassung_Deutschland", "10005143");
        $VALUES.add(MELES_Insurance_A_S_Niederlassung_Deutschland);
        Credendo_Trade_Credit_Insurance_SA_NV_Zweigniederlassung_Deutschland = new VersichererCode("Credendo_Trade_Credit_Insurance_SA_NV_Zweigniederlassung_Deutschland", "10005144");
        $VALUES.add(Credendo_Trade_Credit_Insurance_SA_NV_Zweigniederlassung_Deutschland);
        Balcia_Insurance_SE_Niederlassung_Deutschland = new VersichererCode("Balcia_Insurance_SE_Niederlassung_Deutschland", "10005145");
        $VALUES.add(Balcia_Insurance_SE_Niederlassung_Deutschland);
        BGV_Versicherung_Aktiengesellschaft = new VersichererCode("BGV_Versicherung_Aktiengesellschaft", "10005146");
        $VALUES.add(BGV_Versicherung_Aktiengesellschaft);
        ProTect_Versicherung_AG = new VersichererCode("ProTect_Versicherung_AG", "10005147");
        $VALUES.add(ProTect_Versicherung_AG);
        Zurich_Insurance_Europe_AG = new VersichererCode("Zurich_Insurance_Europe_AG", "10005151");
        $VALUES.add(Zurich_Insurance_Europe_AG);
        Volkswagen_Versicherung_Aktiengesellschaft = new VersichererCode("Volkswagen_Versicherung_Aktiengesellschaft", "10005154");
        $VALUES.add(Volkswagen_Versicherung_Aktiengesellschaft);
        AXA_easy_Versicherung_AG = new VersichererCode("AXA_easy_Versicherung_AG", "10005155");
        $VALUES.add(AXA_easy_Versicherung_AG);
        Deutsche_Assistance_Versicherung_Aktiengesellschaft = new VersichererCode("Deutsche_Assistance_Versicherung_Aktiengesellschaft", "10005156");
        $VALUES.add(Deutsche_Assistance_Versicherung_Aktiengesellschaft);
        TELEFONICA_SEGUROS_Y_REASEGUROS_COMPA_A_ASEGURADORA_SAU_Niederlassung_Deutschland = new VersichererCode("TELEFONICA_SEGUROS_Y_REASEGUROS_COMPA_A_ASEGURADORA_SAU_Niederlassung_Deutschland", "10005157");
        $VALUES.add(TELEFONICA_SEGUROS_Y_REASEGUROS_COMPA_A_ASEGURADORA_SAU_Niederlassung_Deutschland);
        Allcura_Versicherungs_Aktiengesellschaft = new VersichererCode("Allcura_Versicherungs_Aktiengesellschaft", "10005159");
        $VALUES.add(Allcura_Versicherungs_Aktiengesellschaft);
        BA_die_Bayerische_Allgemeine_Versicherung_AG = new VersichererCode("BA_die_Bayerische_Allgemeine_Versicherung_AG", "10005310");
        $VALUES.add(BA_die_Bayerische_Allgemeine_Versicherung_AG);
        Badischer_Gemeinde_Versicherungs_Verband = new VersichererCode("Badischer_Gemeinde_Versicherungs_Verband", "10005316");
        $VALUES.add(Badischer_Gemeinde_Versicherungs_Verband);
        Barmenia_Allgemeine_Versicherungs_Aktiengesellschaft = new VersichererCode("Barmenia_Allgemeine_Versicherungs_Aktiengesellschaft", "10005317");
        $VALUES.add(Barmenia_Allgemeine_Versicherungs_Aktiengesellschaft);
        Bayerischer_Versicherungsverband_Versicherungsaktiengesellschaft = new VersichererCode("Bayerischer_Versicherungsverband_Versicherungsaktiengesellschaft", "10005324");
        $VALUES.add(Bayerischer_Versicherungsverband_Versicherungsaktiengesellschaft);
        Bergische_Brandversicherung_Allgemeine_Feuerversicherung_V_a_G = new VersichererCode("Bergische_Brandversicherung_Allgemeine_Feuerversicherung_V_a_G", "10005326");
        $VALUES.add(Bergische_Brandversicherung_Allgemeine_Feuerversicherung_V_a_G);
        DOCURA_VVaG = new VersichererCode("DOCURA_VVaG", "10005328");
        $VALUES.add(DOCURA_VVaG);
        MVK_Versicherung_VVaG = new VersichererCode("MVK_Versicherung_VVaG", "10005334");
        $VALUES.add(MVK_Versicherung_VVaG);
        Concordia_Versicherungs_Gesellschaft_auf_Gegenseitigkeit = new VersichererCode("Concordia_Versicherungs_Gesellschaft_auf_Gegenseitigkeit", "10005338");
        $VALUES.add(Concordia_Versicherungs_Gesellschaft_auf_Gegenseitigkeit);
        Continentale_Sachversicherung_Aktiengesellschaft = new VersichererCode("Continentale_Sachversicherung_Aktiengesellschaft", "10005340");
        $VALUES.add(Continentale_Sachversicherung_Aktiengesellschaft);
        DA_Deutsche_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("DA_Deutsche_Allgemeine_Versicherung_Aktiengesellschaft", "10005343");
        $VALUES.add(DA_Deutsche_Allgemeine_Versicherung_Aktiengesellschaft);
        DEVK_Deutsche_Eisenbahn_Versicherung_Sach_und_HUK_Versicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn = new VersichererCode("DEVK_Deutsche_Eisenbahn_Versicherung_Sach_und_HUK_Versicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn", "10005344");
        $VALUES.add(DEVK_Deutsche_Eisenbahn_Versicherung_Sach_und_HUK_Versicherungsverein_a_G_Betriebliche_Sozialeinrichtung_der_Deutschen_Bahn);
        Gartenbau_Versicherung_VVaG = new VersichererCode("Gartenbau_Versicherung_VVaG", "10005346");
        $VALUES.add(Gartenbau_Versicherung_VVaG);
        Vereinigte_Tierversicherung_Gesellschaft_auf_Gegenseitigkeit = new VersichererCode("Vereinigte_Tierversicherung_Gesellschaft_auf_Gegenseitigkeit", "10005348");
        $VALUES.add(Vereinigte_Tierversicherung_Gesellschaft_auf_Gegenseitigkeit);
        ERGO_Reiseversicherung_AG = new VersichererCode("ERGO_Reiseversicherung_AG", "10005356");
        $VALUES.add(ERGO_Reiseversicherung_AG);
        Feuer_und_Einbruchschadenkasse_der_BBBank_in_Karlsruhe_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Feuer_und_Einbruchschadenkasse_der_BBBank_in_Karlsruhe_Versicherungsverein_auf_Gegenseitigkeit", "10005357");
        $VALUES.add(Feuer_und_Einbruchschadenkasse_der_BBBank_in_Karlsruhe_Versicherungsverein_auf_Gegenseitigkeit);
        GVO_Gegenseitigkeit_Versicherung_Oldenburg_VVaG = new VersichererCode("GVO_Gegenseitigkeit_Versicherung_Oldenburg_VVaG", "10005365");
        $VALUES.add(GVO_Gegenseitigkeit_Versicherung_Oldenburg_VVaG);
        Gemeinn_tzige_Haftpflichtversicherungsanstalt_Kassel = new VersichererCode("Gemeinn_tzige_Haftpflichtversicherungsanstalt_Kassel", "10005366");
        $VALUES.add(Gemeinn_tzige_Haftpflichtversicherungsanstalt_Kassel);
        Allianz_Global_Corporate_Specialty_SE = new VersichererCode("Allianz_Global_Corporate_Specialty_SE", "10005370");
        $VALUES.add(Allianz_Global_Corporate_Specialty_SE);
        Gothaer_Versicherungsbank_VVaG = new VersichererCode("Gothaer_Versicherungsbank_VVaG", "10005372");
        $VALUES.add(Gothaer_Versicherungsbank_VVaG);
        Die_Haftpflichtkasse_VVaG = new VersichererCode("Die_Haftpflichtkasse_VVaG", "10005374");
        $VALUES.add(Die_Haftpflichtkasse_VVaG);
        HDI_Haftpflichtverband_der_Deutschen_Industrie_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("HDI_Haftpflichtverband_der_Deutschen_Industrie_Versicherungsverein_auf_Gegenseitigkeit", "10005377");
        $VALUES.add(HDI_Haftpflichtverband_der_Deutschen_Industrie_Versicherungsverein_auf_Gegenseitigkeit);
        Helvetia_Schweizerische_Versicherungsgesellschaft_AG_Direktion_f_r_Deutschland = new VersichererCode("Helvetia_Schweizerische_Versicherungsgesellschaft_AG_Direktion_f_r_Deutschland", "10005384");
        $VALUES.add(Helvetia_Schweizerische_Versicherungsgesellschaft_AG_Direktion_f_r_Deutschland);
        ISSELHORSTER_Versicherung_V_a_G = new VersichererCode("ISSELHORSTER_Versicherung_V_a_G", "10005393");
        $VALUES.add(ISSELHORSTER_Versicherung_V_a_G);
        KRAVAG_SACH_Versicherung_des_Deutschen_Kraftverkehrs_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("KRAVAG_SACH_Versicherung_des_Deutschen_Kraftverkehrs_Versicherungsverein_auf_Gegenseitigkeit", "10005399");
        $VALUES.add(KRAVAG_SACH_Versicherung_des_Deutschen_Kraftverkehrs_Versicherungsverein_auf_Gegenseitigkeit);
        Landschaftliche_Brandkasse_Hannover = new VersichererCode("Landschaftliche_Brandkasse_Hannover", "10005400");
        $VALUES.add(Landschaftliche_Brandkasse_Hannover);
        Itzehoer_Versicherung_Brandgilde_von_1691_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Itzehoer_Versicherung_Brandgilde_von_1691_Versicherungsverein_auf_Gegenseitigkeit", "10005401");
        $VALUES.add(Itzehoer_Versicherung_Brandgilde_von_1691_Versicherungsverein_auf_Gegenseitigkeit);
        LVM_Landwirtschaftlicher_Versicherungsverein_M_nster_a_G = new VersichererCode("LVM_Landwirtschaftlicher_Versicherungsverein_M_nster_a_G", "10005402");
        $VALUES.add(LVM_Landwirtschaftlicher_Versicherungsverein_M_nster_a_G);
        LBN_Versicherungsverein_a_G_VVaG = new VersichererCode("LBN_Versicherungsverein_a_G_VVaG", "10005404");
        $VALUES.add(LBN_Versicherungsverein_a_G_VVaG);
        Alte_Leipziger_Versicherung_Aktiengesellschaft = new VersichererCode("Alte_Leipziger_Versicherung_Aktiengesellschaft", "10005405");
        $VALUES.add(Alte_Leipziger_Versicherung_Aktiengesellschaft);
        M_NCHENER_VEREIN_Allgemeine_Versicherungs_AG = new VersichererCode("M_NCHENER_VEREIN_Allgemeine_Versicherungs_AG", "10005414");
        $VALUES.add(M_NCHENER_VEREIN_Allgemeine_Versicherungs_AG);
        Vereinigte_Hagelversicherung_VVaG = new VersichererCode("Vereinigte_Hagelversicherung_VVaG", "10005419");
        $VALUES.add(Vereinigte_Hagelversicherung_VVaG);
        N_RNBERGER_Allgemeine_Versicherungs_Aktiengesellschaft = new VersichererCode("N_RNBERGER_Allgemeine_Versicherungs_Aktiengesellschaft", "10005426");
        $VALUES.add(N_RNBERGER_Allgemeine_Versicherungs_Aktiengesellschaft);
        R_V_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("R_V_Allgemeine_Versicherung_Aktiengesellschaft", "10005438");
        $VALUES.add(R_V_Allgemeine_Versicherung_Aktiengesellschaft);
        Allianz_Direct_Versicherungs_AG = new VersichererCode("Allianz_Direct_Versicherungs_AG", "10005441");
        $VALUES.add(Allianz_Direct_Versicherungs_AG);
        Hagelgilde_Versicherungsverein_a_G_gegr_ndet_1811 = new VersichererCode("Hagelgilde_Versicherungsverein_a_G_gegr_ndet_1811", "10005445");
        $VALUES.add(Hagelgilde_Versicherungsverein_a_G_gegr_ndet_1811);
        Provinzial_Nord_Brandkasse_Aktiengesellschaft = new VersichererCode("Provinzial_Nord_Brandkasse_Aktiengesellschaft", "10005446");
        $VALUES.add(Provinzial_Nord_Brandkasse_Aktiengesellschaft);
        Helvetia_Versicherungs_Aktiengesellschaft = new VersichererCode("Helvetia_Versicherungs_Aktiengesellschaft", "10005448");
        $VALUES.add(Helvetia_Versicherungs_Aktiengesellschaft);
        ARAG_Allgemeine_Versicherungs_Aktiengesellschaft = new VersichererCode("ARAG_Allgemeine_Versicherungs_Aktiengesellschaft", "10005455");
        $VALUES.add(ARAG_Allgemeine_Versicherungs_Aktiengesellschaft);
        Uelzener_Allgemeine_Versicherungs_Gesellschaft_a_G = new VersichererCode("Uelzener_Allgemeine_Versicherungs_Gesellschaft_a_G", "10005459");
        $VALUES.add(Uelzener_Allgemeine_Versicherungs_Gesellschaft_a_G);
        VPV_Allgemeine_Versicherungs_AG = new VersichererCode("VPV_Allgemeine_Versicherungs_AG", "10005461");
        $VALUES.add(VPV_Allgemeine_Versicherungs_AG);
        uniVersa_Allgemeine_Versicherung_AG = new VersichererCode("uniVersa_Allgemeine_Versicherung_AG", "10005463");
        $VALUES.add(uniVersa_Allgemeine_Versicherung_AG);
        VHV_Vereinigte_Hannoversche_Versicherung_a_G = new VersichererCode("VHV_Vereinigte_Hannoversche_Versicherung_a_G", "10005464");
        $VALUES.add(VHV_Vereinigte_Hannoversche_Versicherung_a_G);
        Versicherungsverband_Deutscher_Eisenbahnen_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Versicherungsverband_Deutscher_Eisenbahnen_Versicherungsverein_auf_Gegenseitigkeit", "10005468");
        $VALUES.add(Versicherungsverband_Deutscher_Eisenbahnen_Versicherungsverein_auf_Gegenseitigkeit);
        GVV_Kommunalversicherung_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("GVV_Kommunalversicherung_Versicherungsverein_auf_Gegenseitigkeit", "10005469");
        $VALUES.add(GVV_Kommunalversicherung_Versicherungsverein_auf_Gegenseitigkeit);
        Fahrlehrerversicherung_Verein_auf_Gegenseitigkeit = new VersichererCode("Fahrlehrerversicherung_Verein_auf_Gegenseitigkeit", "10005470");
        $VALUES.add(Fahrlehrerversicherung_Verein_auf_Gegenseitigkeit);
        WWK_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("WWK_Allgemeine_Versicherung_Aktiengesellschaft", "10005476");
        $VALUES.add(WWK_Allgemeine_Versicherung_Aktiengesellschaft);
        W_rttembergische_Gemeinde_Versicherung_auf_Gegenseitigkeit = new VersichererCode("W_rttembergische_Gemeinde_Versicherung_auf_Gegenseitigkeit", "10005479");
        $VALUES.add(W_rttembergische_Gemeinde_Versicherung_auf_Gegenseitigkeit);
        VOLKSWOHL_BUND_SACHVERSICHERUNG_AKTIENGESELLSCHAFT = new VersichererCode("VOLKSWOHL_BUND_SACHVERSICHERUNG_AKTIENGESELLSCHAFT", "10005484");
        $VALUES.add(VOLKSWOHL_BUND_SACHVERSICHERUNG_AKTIENGESELLSCHAFT);
        GRUNDEIGENT_MER_VERSICHERUNG_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("GRUNDEIGENT_MER_VERSICHERUNG_Versicherungsverein_auf_Gegenseitigkeit", "10005485");
        $VALUES.add(GRUNDEIGENT_MER_VERSICHERUNG_Versicherungsverein_auf_Gegenseitigkeit);
        Schleswiger_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Schleswiger_Versicherungsverein_auf_Gegenseitigkeit", "10005491");
        $VALUES.add(Schleswiger_Versicherungsverein_auf_Gegenseitigkeit);
        HanseMerkur_Reiseversicherung_AG = new VersichererCode("HanseMerkur_Reiseversicherung_AG", "10005496");
        $VALUES.add(HanseMerkur_Reiseversicherung_AG);
        ADAC_Versicherung_AG = new VersichererCode("ADAC_Versicherung_AG", "10005498");
        $VALUES.add(ADAC_Versicherung_AG);
        Pallas_Versicherung_Aktiengesellschaft = new VersichererCode("Pallas_Versicherung_Aktiengesellschaft", "10005499");
        $VALUES.add(Pallas_Versicherung_Aktiengesellschaft);
        HanseMerkur_Allgemeine_Versicherung_AG = new VersichererCode("HanseMerkur_Allgemeine_Versicherung_AG", "10005501");
        $VALUES.add(HanseMerkur_Allgemeine_Versicherung_AG);
        GARANTA_Versicherungs_Aktiengesellschaft = new VersichererCode("GARANTA_Versicherungs_Aktiengesellschaft", "10005505");
        $VALUES.add(GARANTA_Versicherungs_Aktiengesellschaft);
        EUROPA_Versicherung_Aktiengesellschaft = new VersichererCode("EUROPA_Versicherung_Aktiengesellschaft", "10005508");
        $VALUES.add(EUROPA_Versicherung_Aktiengesellschaft);
        DEVK_Allgemeine_Versicherungs_Aktiengesellschaft = new VersichererCode("DEVK_Allgemeine_Versicherungs_Aktiengesellschaft", "10005513");
        $VALUES.add(DEVK_Allgemeine_Versicherungs_Aktiengesellschaft);
        AXA_Versicherung_Aktiengesellschaft = new VersichererCode("AXA_Versicherung_Aktiengesellschaft", "10005515");
        $VALUES.add(AXA_Versicherung_Aktiengesellschaft);
        HUK_COBURG_Allgemeine_Versicherung_AG = new VersichererCode("HUK_COBURG_Allgemeine_Versicherung_AG", "10005521");
        $VALUES.add(HUK_COBURG_Allgemeine_Versicherung_AG);
        Dolleruper_Freie_Brandgilde = new VersichererCode("Dolleruper_Freie_Brandgilde", "10005522");
        $VALUES.add(Dolleruper_Freie_Brandgilde);
        WGV_Versicherung_AG = new VersichererCode("WGV_Versicherung_AG", "10005525");
        $VALUES.add(WGV_Versicherung_AG);
        ROLAND_Schutzbrief_Versicherung_AG = new VersichererCode("ROLAND_Schutzbrief_Versicherung_AG", "10005528");
        $VALUES.add(ROLAND_Schutzbrief_Versicherung_AG);
        Vereinigte_Schiffs_Versicherung_V_a_G = new VersichererCode("Vereinigte_Schiffs_Versicherung_V_a_G", "10005530");
        $VALUES.add(Vereinigte_Schiffs_Versicherung_V_a_G);
        KS_Versicherungs_Aktiengesellschaft = new VersichererCode("KS_Versicherungs_Aktiengesellschaft", "10005534");
        $VALUES.add(KS_Versicherungs_Aktiengesellschaft);
        Geb_udeversicherungsgilde_f_r_F_hr_Amrum_und_Halligen = new VersichererCode("Geb_udeversicherungsgilde_f_r_F_hr_Amrum_und_Halligen", "10005539");
        $VALUES.add(Geb_udeversicherungsgilde_f_r_F_hr_Amrum_und_Halligen);
        Harsewinkeler_Versicherung_VaG = new VersichererCode("Harsewinkeler_Versicherung_VaG", "10005544");
        $VALUES.add(Harsewinkeler_Versicherung_VaG);
        INTER_Allgemeine_Versicherung_AG = new VersichererCode("INTER_Allgemeine_Versicherung_AG", "10005546");
        $VALUES.add(INTER_Allgemeine_Versicherung_AG);
        CG_Car_Garantie_Versicherungs_Aktiengesellschaft = new VersichererCode("CG_Car_Garantie_Versicherungs_Aktiengesellschaft", "10005547");
        $VALUES.add(CG_Car_Garantie_Versicherungs_Aktiengesellschaft);
        Debeka_Allgemeine_Versicherung_Aktiengesellschaft_Sitz_Koblenz_am_Rhein = new VersichererCode("Debeka_Allgemeine_Versicherung_Aktiengesellschaft_Sitz_Koblenz_am_Rhein", "10005549");
        $VALUES.add(Debeka_Allgemeine_Versicherung_Aktiengesellschaft_Sitz_Koblenz_am_Rhein);
        Cosmos_Versicherung_Aktiengesellschaft = new VersichererCode("Cosmos_Versicherung_Aktiengesellschaft", "10005552");
        $VALUES.add(Cosmos_Versicherung_Aktiengesellschaft);
        OSTBEVERNER_Versicherungsverein_auf_Gegenseitigkeit_VVaG = new VersichererCode("OSTBEVERNER_Versicherungsverein_auf_Gegenseitigkeit_VVaG", "10005556");
        $VALUES.add(OSTBEVERNER_Versicherungsverein_auf_Gegenseitigkeit_VVaG);
        H_ger_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("H_ger_Versicherungsverein_auf_Gegenseitigkeit", "10005557");
        $VALUES.add(H_ger_Versicherungsverein_auf_Gegenseitigkeit);
        SCHNEVERDINGER_Versicherungsverein_a_G = new VersichererCode("SCHNEVERDINGER_Versicherungsverein_a_G", "10005559");
        $VALUES.add(SCHNEVERDINGER_Versicherungsverein_a_G);
        ERGO_Direkt_Versicherung_Aktiengesellschaft = new VersichererCode("ERGO_Direkt_Versicherung_Aktiengesellschaft", "10005562");
        $VALUES.add(ERGO_Direkt_Versicherung_Aktiengesellschaft);
        TRIAS_Versicherung_Aktiengesellschaft = new VersichererCode("TRIAS_Versicherung_Aktiengesellschaft", "10005567");
        $VALUES.add(TRIAS_Versicherung_Aktiengesellschaft);
        IDEAL_Versicherung_AG = new VersichererCode("IDEAL_Versicherung_AG", "10005573");
        $VALUES.add(IDEAL_Versicherung_AG);
        ADLER_Versicherung_AG = new VersichererCode("ADLER_Versicherung_AG", "10005581");
        $VALUES.add(ADLER_Versicherung_AG);
        PVAG_Polizeiversicherungs_Aktiengesellschaft = new VersichererCode("PVAG_Polizeiversicherungs_Aktiengesellschaft", "10005583");
        $VALUES.add(PVAG_Polizeiversicherungs_Aktiengesellschaft);
        GVV_Direktversicherung_AG = new VersichererCode("GVV_Direktversicherung_AG", "10005585");
        $VALUES.add(GVV_Direktversicherung_AG);
        Stuttgarter_Versicherung_Aktiengesellschaft = new VersichererCode("Stuttgarter_Versicherung_Aktiengesellschaft", "10005586");
        $VALUES.add(Stuttgarter_Versicherung_Aktiengesellschaft);
        GGG_Kraftfahrzeug_Reparaturkosten_Versicherungs_Aktiengesellschaft = new VersichererCode("GGG_Kraftfahrzeug_Reparaturkosten_Versicherungs_Aktiengesellschaft", "10005589");
        $VALUES.add(GGG_Kraftfahrzeug_Reparaturkosten_Versicherungs_Aktiengesellschaft);
        W_rzburger_Versicherungs_AG = new VersichererCode("W_rzburger_Versicherungs_AG", "10005590");
        $VALUES.add(W_rzburger_Versicherungs_AG);
        neue_leben_Unfallversicherung_Aktiengesellschaft = new VersichererCode("neue_leben_Unfallversicherung_Aktiengesellschaft", "10005591");
        $VALUES.add(neue_leben_Unfallversicherung_Aktiengesellschaft);
        Deutsche_Rhederei_Versicherungs_Aktiengesellschaft_i_L = new VersichererCode("Deutsche_Rhederei_Versicherungs_Aktiengesellschaft_i_L", "10005631");
        $VALUES.add(Deutsche_Rhederei_Versicherungs_Aktiengesellschaft_i_L);
        Delvag_Versicherungs_AG = new VersichererCode("Delvag_Versicherungs_AG", "10005632");
        $VALUES.add(Delvag_Versicherungs_AG);
        Baloise_Sachversicherung_Aktiengesellschaft_Deutschland = new VersichererCode("Baloise_Sachversicherung_Aktiengesellschaft_Deutschland", "10005633");
        $VALUES.add(Baloise_Sachversicherung_Aktiengesellschaft_Deutschland);
        AWP_P_C_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("AWP_P_C_S_A_Niederlassung_f_r_Deutschland", "10005636");
        $VALUES.add(AWP_P_C_S_A_Niederlassung_f_r_Deutschland);
        F_Laeisz_Versicherung_Aktiengesellschaft = new VersichererCode("F_Laeisz_Versicherung_Aktiengesellschaft", "10005656");
        $VALUES.add(F_Laeisz_Versicherung_Aktiengesellschaft);
        Minerva_Versicherungs_Aktiengesellschaft = new VersichererCode("Minerva_Versicherungs_Aktiengesellschaft", "10005671");
        $VALUES.add(Minerva_Versicherungs_Aktiengesellschaft);
        N_RNBERGER_BEAMTEN_ALLGEMEINE_VERSICHERUNG_AKTIENGESELLSCHAFT = new VersichererCode("N_RNBERGER_BEAMTEN_ALLGEMEINE_VERSICHERUNG_AKTIENGESELLSCHAFT", "10005686");
        $VALUES.add(N_RNBERGER_BEAMTEN_ALLGEMEINE_VERSICHERUNG_AKTIENGESELLSCHAFT);
        Hanse_Marine_Versicherung_AG = new VersichererCode("Hanse_Marine_Versicherung_AG", "10005754");
        $VALUES.add(Hanse_Marine_Versicherung_AG);
        Th_ga_Schadenausgleichskasse_M_nchen_VVaG_i_L = new VersichererCode("Th_ga_Schadenausgleichskasse_M_nchen_VVaG_i_L", "10005767");
        $VALUES.add(Th_ga_Schadenausgleichskasse_M_nchen_VVaG_i_L);
        DARAG_Deutschland_AG = new VersichererCode("DARAG_Deutschland_AG", "10005771");
        $VALUES.add(DARAG_Deutschland_AG);
        SAARLAND_Feuerversicherung_Aktiengesellschaft = new VersichererCode("SAARLAND_Feuerversicherung_Aktiengesellschaft", "10005773");
        $VALUES.add(SAARLAND_Feuerversicherung_Aktiengesellschaft);
        InterRisk_Versicherungs_AG_Vienna_Insurance_Group = new VersichererCode("InterRisk_Versicherungs_AG_Vienna_Insurance_Group", "10005780");
        $VALUES.add(InterRisk_Versicherungs_AG_Vienna_Insurance_Group);
        Sparkassen_Versicherung_Sachsen_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("Sparkassen_Versicherung_Sachsen_Allgemeine_Versicherung_Aktiengesellschaft", "10005781");
        $VALUES.add(Sparkassen_Versicherung_Sachsen_Allgemeine_Versicherung_Aktiengesellschaft);
        OKV_Ostdeutsche_Kommunalversicherung_auf_Gegenseitigkeit = new VersichererCode("OKV_Ostdeutsche_Kommunalversicherung_auf_Gegenseitigkeit", "10005786");
        $VALUES.add(OKV_Ostdeutsche_Kommunalversicherung_auf_Gegenseitigkeit);
        BavariaDirekt_Versicherung_AG = new VersichererCode("BavariaDirekt_Versicherung_AG", "10005787");
        $VALUES.add(BavariaDirekt_Versicherung_AG);
        Inter_Partner_Assistance_SA_Direktion_f_r_Deutschland = new VersichererCode("Inter_Partner_Assistance_SA_Direktion_f_r_Deutschland", "10005788");
        $VALUES.add(Inter_Partner_Assistance_SA_Direktion_f_r_Deutschland);
        NEH_Neue_Hildener_Versicherung_AG = new VersichererCode("NEH_Neue_Hildener_Versicherung_AG", "10005790");
        $VALUES.add(NEH_Neue_Hildener_Versicherung_AG);
        ARAG_SE = new VersichererCode("ARAG_SE", "10005800");
        $VALUES.add(ARAG_SE);
        AUXILIA_Rechtsschutz_Versicherungs_Aktiengesellschaft = new VersichererCode("AUXILIA_Rechtsschutz_Versicherungs_Aktiengesellschaft", "10005801");
        $VALUES.add(AUXILIA_Rechtsschutz_Versicherungs_Aktiengesellschaft);
        DEURAG_Deutsche_Rechtsschutz_Versicherung_Aktiengesellschaft = new VersichererCode("DEURAG_Deutsche_Rechtsschutz_Versicherung_Aktiengesellschaft", "10005803");
        $VALUES.add(DEURAG_Deutsche_Rechtsschutz_Versicherung_Aktiengesellschaft);
        Neue_Rechtsschutz_Versicherungsgesellschaft_Aktiengesellschaft = new VersichererCode("Neue_Rechtsschutz_Versicherungsgesellschaft_Aktiengesellschaft", "10005805");
        $VALUES.add(Neue_Rechtsschutz_Versicherungsgesellschaft_Aktiengesellschaft);
        ROLAND_Rechtsschutz_Versicherungs_AG = new VersichererCode("ROLAND_Rechtsschutz_Versicherungs_AG", "10005807");
        $VALUES.add(ROLAND_Rechtsschutz_Versicherungs_AG);
        ADVOCARD_Rechtsschutzversicherung_AG = new VersichererCode("ADVOCARD_Rechtsschutzversicherung_AG", "10005809");
        $VALUES.add(ADVOCARD_Rechtsschutzversicherung_AG);
        RAG_Rechtsschutzversicherungs_Aktiengesellschaft = new VersichererCode("RAG_Rechtsschutzversicherungs_Aktiengesellschaft", "10005813");
        $VALUES.add(RAG_Rechtsschutzversicherungs_Aktiengesellschaft);
        HUK_COBURG_Rechtsschutzversicherung_AG = new VersichererCode("HUK_COBURG_Rechtsschutzversicherung_AG", "10005818");
        $VALUES.add(HUK_COBURG_Rechtsschutzversicherung_AG);
        DEVK_Rechtsschutz_Versicherungs_Aktiengesellschaft = new VersichererCode("DEVK_Rechtsschutz_Versicherungs_Aktiengesellschaft", "10005829");
        $VALUES.add(DEVK_Rechtsschutz_Versicherungs_Aktiengesellschaft);
        DMB_Rechtsschutz_Versicherung_Aktiengesellschaft = new VersichererCode("DMB_Rechtsschutz_Versicherung_Aktiengesellschaft", "10005834");
        $VALUES.add(DMB_Rechtsschutz_Versicherung_Aktiengesellschaft);
        Badische_Rechtsschutzversicherung_Aktiengesellschaft = new VersichererCode("Badische_Rechtsschutzversicherung_Aktiengesellschaft", "10005838");
        $VALUES.add(Badische_Rechtsschutzversicherung_Aktiengesellschaft);
        Pensions_Sicherungs_Verein_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Pensions_Sicherungs_Verein_Versicherungsverein_auf_Gegenseitigkeit", "10005856");
        $VALUES.add(Pensions_Sicherungs_Verein_Versicherungsverein_auf_Gegenseitigkeit);
        Gothaer_Allgemeine_Versicherung_Aktiengesellschaft = new VersichererCode("Gothaer_Allgemeine_Versicherung_Aktiengesellschaft", "10005858");
        $VALUES.add(Gothaer_Allgemeine_Versicherung_Aktiengesellschaft);
        VHV_Allgemeine_Versicherung_AG = new VersichererCode("VHV_Allgemeine_Versicherung_AG", "10005862");
        $VALUES.add(VHV_Allgemeine_Versicherung_AG);
        CHUBB_European_Group_SE_Direktion_f_r_Deutschland = new VersichererCode("CHUBB_European_Group_SE_Direktion_f_r_Deutschland", "10005902");
        $VALUES.add(CHUBB_European_Group_SE_Direktion_f_r_Deutschland);
        RGA_International_Reinsurance_Company_Designated_Activity_Company_Niederlassung_f_r_Deutschland = new VersichererCode("RGA_International_Reinsurance_Company_Designated_Activity_Company_Niederlassung_f_r_Deutschland", "10006800");
        $VALUES.add(RGA_International_Reinsurance_Company_Designated_Activity_Company_Niederlassung_f_r_Deutschland);
        Mapfre_Re_Compania_de_Reaseguros_S_A_Munich_Branch = new VersichererCode("Mapfre_Re_Compania_de_Reaseguros_S_A_Munich_Branch", "10006801");
        $VALUES.add(Mapfre_Re_Compania_de_Reaseguros_S_A_Munich_Branch);
        Swiss_Re_Europe_S_A_Niederlassung_Deutschland = new VersichererCode("Swiss_Re_Europe_S_A_Niederlassung_Deutschland", "10006802");
        $VALUES.add(Swiss_Re_Europe_S_A_Niederlassung_Deutschland);
        SCOR_R_ckversicherung_Deutschland_Niederlassung_der_SCOR_SE = new VersichererCode("SCOR_R_ckversicherung_Deutschland_Niederlassung_der_SCOR_SE", "10006803");
        $VALUES.add(SCOR_R_ckversicherung_Deutschland_Niederlassung_der_SCOR_SE);
        Deutsche_R_ckversicherung_Aktiengesellschaft = new VersichererCode("Deutsche_R_ckversicherung_Aktiengesellschaft", "10006907");
        $VALUES.add(Deutsche_R_ckversicherung_Aktiengesellschaft);
        E_S_R_ckversicherung_AG = new VersichererCode("E_S_R_ckversicherung_AG", "10006908");
        $VALUES.add(E_S_R_ckversicherung_AG);
        General_Reinsurance_AG = new VersichererCode("General_Reinsurance_AG", "10006918");
        $VALUES.add(General_Reinsurance_AG);
        Kieler_R_ckversicherungsverein_auf_Gegenseitigkeit = new VersichererCode("Kieler_R_ckversicherungsverein_auf_Gegenseitigkeit", "10006925");
        $VALUES.add(Kieler_R_ckversicherungsverein_auf_Gegenseitigkeit);
        RISICOM_R_ckversicherung_Aktiengesellschaft = new VersichererCode("RISICOM_R_ckversicherung_Aktiengesellschaft", "10006946");
        $VALUES.add(RISICOM_R_ckversicherung_Aktiengesellschaft);
        Allianz_SE = new VersichererCode("Allianz_SE", "10006949");
        $VALUES.add(Allianz_SE);
        PROR_CK_R_ckversicherungs_Aktiengesellschaft = new VersichererCode("PROR_CK_R_ckversicherungs_Aktiengesellschaft", "10006951");
        $VALUES.add(PROR_CK_R_ckversicherungs_Aktiengesellschaft);
        R_V_VERSICHERUNG_AG = new VersichererCode("R_V_VERSICHERUNG_AG", "10006960");
        $VALUES.add(R_V_VERSICHERUNG_AG);
        SV_SparkassenVersicherung_Holding_Aktiengesellschaft = new VersichererCode("SV_SparkassenVersicherung_Holding_Aktiengesellschaft", "10006964");
        $VALUES.add(SV_SparkassenVersicherung_Holding_Aktiengesellschaft);
        Versicherungskammer_Bayern_Konzern_R_ckversicherung_Aktiengesellschaft = new VersichererCode("Versicherungskammer_Bayern_Konzern_R_ckversicherung_Aktiengesellschaft", "10006970");
        $VALUES.add(Versicherungskammer_Bayern_Konzern_R_ckversicherung_Aktiengesellschaft);
        DEVK_R_ckversicherungs_und_Beteiligungs_Aktiengesellschaft_DEVK_RE = new VersichererCode("DEVK_R_ckversicherungs_und_Beteiligungs_Aktiengesellschaft_DEVK_RE", "10006973");
        $VALUES.add(DEVK_R_ckversicherungs_und_Beteiligungs_Aktiengesellschaft_DEVK_RE);
        Diehl_Assekuranz_R_ckversicherungs_und_Vermittlungs_AG = new VersichererCode("Diehl_Assekuranz_R_ckversicherungs_und_Vermittlungs_AG", "10006978");
        $VALUES.add(Diehl_Assekuranz_R_ckversicherungs_und_Vermittlungs_AG);
        Freudenberg_R_ckversicherung_AG = new VersichererCode("Freudenberg_R_ckversicherung_AG", "10006984");
        $VALUES.add(Freudenberg_R_ckversicherung_AG);
        HDI_Global_Network_AG = new VersichererCode("HDI_Global_Network_AG", "10006988");
        $VALUES.add(HDI_Global_Network_AG);
        Hochrhein_Internationale_R_ckversicherung_Aktiengesellschaft = new VersichererCode("Hochrhein_Internationale_R_ckversicherung_Aktiengesellschaft", "10006992");
        $VALUES.add(Hochrhein_Internationale_R_ckversicherung_Aktiengesellschaft);
        Incura_AG = new VersichererCode("Incura_AG", "10006993");
        $VALUES.add(Incura_AG);
        BarmeniaGothaer_AG = new VersichererCode("BarmeniaGothaer_AG", "10006994");
        $VALUES.add(BarmeniaGothaer_AG);
        REVIUM_R_ckversicherung_AG = new VersichererCode("REVIUM_R_ckversicherung_AG", "10006998");
        $VALUES.add(REVIUM_R_ckversicherung_AG);
        Euler_Hermes_SA_NV = new VersichererCode("Euler_Hermes_SA_NV", "10007011");
        $VALUES.add(Euler_Hermes_SA_NV);
        Liberty_Mutual_Insurance_Europe_SE = new VersichererCode("Liberty_Mutual_Insurance_Europe_SE", "10007013");
        $VALUES.add(Liberty_Mutual_Insurance_Europe_SE);
        GAN_Assurances = new VersichererCode("GAN_Assurances", "10007027");
        $VALUES.add(GAN_Assurances);
        Athora_Belgium_NV = new VersichererCode("Athora_Belgium_NV", "10007032");
        $VALUES.add(Athora_Belgium_NV);
        GENERALI_IARD = new VersichererCode("GENERALI_IARD", "10007067");
        $VALUES.add(GENERALI_IARD);
        Allianz_S_p_A = new VersichererCode("Allianz_S_p_A", "10007076");
        $VALUES.add(Allianz_S_p_A);
        Unilever_Insurances_N_V = new VersichererCode("Unilever_Insurances_N_V", "10007093");
        $VALUES.add(Unilever_Insurances_N_V);
        Swiss_Re_International_SE = new VersichererCode("Swiss_Re_International_SE", "10007105");
        $VALUES.add(Swiss_Re_International_SE);
        Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_COFACE = new VersichererCode("Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_COFACE", "10007119");
        $VALUES.add(Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_COFACE);
        AXA_Assicurazioni_s_p_a = new VersichererCode("AXA_Assicurazioni_s_p_a", "10007135");
        $VALUES.add(AXA_Assicurazioni_s_p_a);
        Unipol_Assicurazioni_S_p_A = new VersichererCode("Unipol_Assicurazioni_S_p_A", "10007155");
        $VALUES.add(Unipol_Assicurazioni_S_p_A);
        Miripro_Insurance_Company_dac = new VersichererCode("Miripro_Insurance_Company_dac", "10007185");
        $VALUES.add(Miripro_Insurance_Company_dac);
        Merkur_Versicherung_Aktiengesellschaft = new VersichererCode("Merkur_Versicherung_Aktiengesellschaft", "10007191");
        $VALUES.add(Merkur_Versicherung_Aktiengesellschaft);
        Axa_Assurances_Vie_Luxembourg = new VersichererCode("Axa_Assurances_Vie_Luxembourg", "10007194");
        $VALUES.add(Axa_Assurances_Vie_Luxembourg);
        Cardif_Lux_Vie_S_A = new VersichererCode("Cardif_Lux_Vie_S_A", "10007195");
        $VALUES.add(Cardif_Lux_Vie_S_A);
        Utmost_Luxembourg_S_A = new VersichererCode("Utmost_Luxembourg_S_A", "10007199");
        $VALUES.add(Utmost_Luxembourg_S_A);
        The_OneLife_Company_S_A = new VersichererCode("The_OneLife_Company_S_A", "10007202");
        $VALUES.add(The_OneLife_Company_S_A);
        Swiss_Life_Luxembourg_S_A = new VersichererCode("Swiss_Life_Luxembourg_S_A", "10007204");
        $VALUES.add(Swiss_Life_Luxembourg_S_A);
        Foyer_Vie_S_A = new VersichererCode("Foyer_Vie_S_A", "10007206");
        $VALUES.add(Foyer_Vie_S_A);
        Shipowners_Mutual_Protection_Indemnity_Association = new VersichererCode("Shipowners_Mutual_Protection_Indemnity_Association", "10007209");
        $VALUES.add(Shipowners_Mutual_Protection_Indemnity_Association);
        Helvetia_Versicherungen_AG = new VersichererCode("Helvetia_Versicherungen_AG", "10007214");
        $VALUES.add(Helvetia_Versicherungen_AG);
        MMA_VIE_Assurances_Mutuelles = new VersichererCode("MMA_VIE_Assurances_Mutuelles", "10007217");
        $VALUES.add(MMA_VIE_Assurances_Mutuelles);
        N_V_Schadeverzekering_Maatschappij_Bovemij = new VersichererCode("N_V_Schadeverzekering_Maatschappij_Bovemij", "10007220");
        $VALUES.add(N_V_Schadeverzekering_Maatschappij_Bovemij);
        Ober_sterreichische_Versicherung_Aktiengesellschaft = new VersichererCode("Ober_sterreichische_Versicherung_Aktiengesellschaft", "10007225");
        $VALUES.add(Ober_sterreichische_Versicherung_Aktiengesellschaft);
        CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V = new VersichererCode("CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V", "10007226");
        $VALUES.add(CIGNA_Life_Insurance_Company_of_Europe_S_A_N_V);
        EUROP_ISKE_REJSEFORSIKRING_A_S = new VersichererCode("EUROP_ISKE_REJSEFORSIKRING_A_S", "10007229");
        $VALUES.add(EUROP_ISKE_REJSEFORSIKRING_A_S);
        EUROP_ASSISTANCE_SA = new VersichererCode("EUROP_ASSISTANCE_SA", "10007231");
        $VALUES.add(EUROP_ASSISTANCE_SA);
        APK_Versicherung_Aktiengesellschaft = new VersichererCode("APK_Versicherung_Aktiengesellschaft", "10007232");
        $VALUES.add(APK_Versicherung_Aktiengesellschaft);
        Mutuelle_des_Architectes_Francais_Assurances = new VersichererCode("Mutuelle_des_Architectes_Francais_Assurances", "10007237");
        $VALUES.add(Mutuelle_des_Architectes_Francais_Assurances);
    }

    private static void init1() {
        Allianz_Elementar_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Allianz_Elementar_Lebensversicherungs_Aktiengesellschaft", "10007239");
        $VALUES.add(Allianz_Elementar_Lebensversicherungs_Aktiengesellschaft);
        Foyer_Assurances_S_A = new VersichererCode("Foyer_Assurances_S_A", "10007246");
        $VALUES.add(Foyer_Assurances_S_A);
        Wiener_St_dtische_Versicherung_AG_Vienna_Insurance_Group = new VersichererCode("Wiener_St_dtische_Versicherung_AG_Vienna_Insurance_Group", "10007251");
        $VALUES.add(Wiener_St_dtische_Versicherung_AG_Vienna_Insurance_Group);
        Assicurazioni_Generali_S_p_A = new VersichererCode("Assicurazioni_Generali_S_p_A", "10007253");
        $VALUES.add(Assicurazioni_Generali_S_p_A);
        Allianz_Plc = new VersichererCode("Allianz_Plc", "10007257");
        $VALUES.add(Allianz_Plc);
        VAV_Versicherungs_Aktiengesellschaft = new VersichererCode("VAV_Versicherungs_Aktiengesellschaft", "10007258");
        $VALUES.add(VAV_Versicherungs_Aktiengesellschaft);
        Allianz_Elementar_Versicherungs_Aktiengesellschaft = new VersichererCode("Allianz_Elementar_Versicherungs_Aktiengesellschaft", "10007261");
        $VALUES.add(Allianz_Elementar_Versicherungs_Aktiengesellschaft);
        Allianz_Life_Luxembourg_S_A = new VersichererCode("Allianz_Life_Luxembourg_S_A", "10007265");
        $VALUES.add(Allianz_Life_Luxembourg_S_A);
        Societ_Reale_Mutua_di_Assicurazioni = new VersichererCode("Societ_Reale_Mutua_di_Assicurazioni", "10007267");
        $VALUES.add(Societ_Reale_Mutua_di_Assicurazioni);
        Generali_Versicherung_AG = new VersichererCode("Generali_Versicherung_AG", "10007268");
        $VALUES.add(Generali_Versicherung_AG);
        Acredia_Versicherung_Aktiengesellschaft = new VersichererCode("Acredia_Versicherung_Aktiengesellschaft", "10007269");
        $VALUES.add(Acredia_Versicherung_Aktiengesellschaft);
        Hansard_Europe_Designated_Activity_Company = new VersichererCode("Hansard_Europe_Designated_Activity_Company", "10007270");
        $VALUES.add(Hansard_Europe_Designated_Activity_Company);
        K_rntner_Landesversicherung_auf_Gegenseitigkeit = new VersichererCode("K_rntner_Landesversicherung_auf_Gegenseitigkeit", "10007274");
        $VALUES.add(K_rntner_Landesversicherung_auf_Gegenseitigkeit);
        HYPO_Versicherung_Aktiengesellschaft = new VersichererCode("HYPO_Versicherung_Aktiengesellschaft", "10007278");
        $VALUES.add(HYPO_Versicherung_Aktiengesellschaft);
        OOM_Global_Care_N_V = new VersichererCode("OOM_Global_Care_N_V", "10007279");
        $VALUES.add(OOM_Global_Care_N_V);
        DKV_Belgium_SA = new VersichererCode("DKV_Belgium_SA", "10007281");
        $VALUES.add(DKV_Belgium_SA);
        MMA_IARD_Assurances_Mutuelles = new VersichererCode("MMA_IARD_Assurances_Mutuelles", "10007287");
        $VALUES.add(MMA_IARD_Assurances_Mutuelles);
        AG_Insurance_SA = new VersichererCode("AG_Insurance_SA", "10007293");
        $VALUES.add(AG_Insurance_SA);
        La_Luxembourgeoise_Vie_S_A = new VersichererCode("La_Luxembourgeoise_Vie_S_A", "10007299");
        $VALUES.add(La_Luxembourgeoise_Vie_S_A);
        AXA_BELGIUM_SA = new VersichererCode("AXA_BELGIUM_SA", "10007300");
        $VALUES.add(AXA_BELGIUM_SA);
        UNIQA_sterreich_Versicherungen_AG = new VersichererCode("UNIQA_sterreich_Versicherungen_AG", "10007308");
        $VALUES.add(UNIQA_sterreich_Versicherungen_AG);
        DONAU_Versicherung_AG_Vienna_Insurance_Group = new VersichererCode("DONAU_Versicherung_AG_Vienna_Insurance_Group", "10007309");
        $VALUES.add(DONAU_Versicherung_AG_Vienna_Insurance_Group);
        D_K_V_Luxembourg_S_A = new VersichererCode("D_K_V_Luxembourg_S_A", "10007310");
        $VALUES.add(D_K_V_Luxembourg_S_A);
        Grazer_Wechselseitige_Versicherung_Aktiengesellschaft = new VersichererCode("Grazer_Wechselseitige_Versicherung_Aktiengesellschaft", "10007328");
        $VALUES.add(Grazer_Wechselseitige_Versicherung_Aktiengesellschaft);
        Offaly_Insurance_Company_DAC = new VersichererCode("Offaly_Insurance_Company_DAC", "10007330");
        $VALUES.add(Offaly_Insurance_Company_DAC);
        SIAT_Societ_Italiana_Assicurazioni_e_Riassicurazioni_S_p_A = new VersichererCode("SIAT_Societ_Italiana_Assicurazioni_e_Riassicurazioni_S_p_A", "10007334");
        $VALUES.add(SIAT_Societ_Italiana_Assicurazioni_e_Riassicurazioni_S_p_A);
        Industria_F_rs_kringsaktiebolag = new VersichererCode("Industria_F_rs_kringsaktiebolag", "10007350");
        $VALUES.add(Industria_F_rs_kringsaktiebolag);
        COMPAGNIE_EUROPEENNE_DE_GARANTIES_ET_CAUTIONS = new VersichererCode("COMPAGNIE_EUROPEENNE_DE_GARANTIES_ET_CAUTIONS", "10007362");
        $VALUES.add(COMPAGNIE_EUROPEENNE_DE_GARANTIES_ET_CAUTIONS);
        SiriusPoint_International_F_rs_kringsaktiebolag_publ = new VersichererCode("SiriusPoint_International_F_rs_kringsaktiebolag_publ", "10007365");
        $VALUES.add(SiriusPoint_International_F_rs_kringsaktiebolag_publ);
        EOC_Onderlinge_Schepenverzekering_U_A = new VersichererCode("EOC_Onderlinge_Schepenverzekering_U_A", "10007371");
        $VALUES.add(EOC_Onderlinge_Schepenverzekering_U_A);
        GD_Insurance_Company_dac = new VersichererCode("GD_Insurance_Company_dac", "10007372");
        $VALUES.add(GD_Insurance_Company_dac);
        AXA_Assistance_France_Assurances = new VersichererCode("AXA_Assistance_France_Assurances", "10007374");
        $VALUES.add(AXA_Assistance_France_Assurances);
        TCS_Insurance_Company_of_Ireland_dac = new VersichererCode("TCS_Insurance_Company_of_Ireland_dac", "10007379");
        $VALUES.add(TCS_Insurance_Company_of_Ireland_dac);
        Philip_Morris_International_Insurance_Ireland_dac = new VersichererCode("Philip_Morris_International_Insurance_Ireland_dac", "10007380");
        $VALUES.add(Philip_Morris_International_Insurance_Ireland_dac);
        LocalTapiola_General_Mutual_Insurance_Company = new VersichererCode("LocalTapiola_General_Mutual_Insurance_Company", "10007384");
        $VALUES.add(LocalTapiola_General_Mutual_Insurance_Company);
        HDI_Versicherung_AG_Wien = new VersichererCode("HDI_Versicherung_AG_Wien", "10007393");
        $VALUES.add(HDI_Versicherung_AG_Wien);
        Assuranceforeningen_GARD_Gjensidig = new VersichererCode("Assuranceforeningen_GARD_Gjensidig", "10007403");
        $VALUES.add(Assuranceforeningen_GARD_Gjensidig);
        Gjensidige_Forsikring_ASA = new VersichererCode("Gjensidige_Forsikring_ASA", "10007404");
        $VALUES.add(Gjensidige_Forsikring_ASA);
        TIROLER_VERSICHERUNG_V_a_G = new VersichererCode("TIROLER_VERSICHERUNG_V_a_G", "10007406");
        $VALUES.add(TIROLER_VERSICHERUNG_V_a_G);
        Wealins_S_A = new VersichererCode("Wealins_S_A", "10007410");
        $VALUES.add(Wealins_S_A);
        Vida_Caixa_S_A_de_Seguros_y_Reaseguros = new VersichererCode("Vida_Caixa_S_A_de_Seguros_y_Reaseguros", "10007417");
        $VALUES.add(Vida_Caixa_S_A_de_Seguros_y_Reaseguros);
        Acadia_International_Insurance_dac_c_o_Aon_Insurance_Managers_Dublin_Ltd = new VersichererCode("Acadia_International_Insurance_dac_c_o_Aon_Insurance_Managers_Dublin_Ltd", "10007418");
        $VALUES.add(Acadia_International_Insurance_dac_c_o_Aon_Insurance_Managers_Dublin_Ltd);
        COMPANIA_ESPANOLA_DE_SEGUROS_DE_CREDITO_A_LA_EXPORTACION_S_A_COMPANIA_DE_SEGUROS_Y_REASEGUROS_CESCE = new VersichererCode("COMPANIA_ESPANOLA_DE_SEGUROS_DE_CREDITO_A_LA_EXPORTACION_S_A_COMPANIA_DE_SEGUROS_Y_REASEGUROS_CESCE", "10007420");
        $VALUES.add(COMPANIA_ESPANOLA_DE_SEGUROS_DE_CREDITO_A_LA_EXPORTACION_S_A_COMPANIA_DE_SEGUROS_Y_REASEGUROS_CESCE);
        AKZO_Nobel_Assurantie_N_V = new VersichererCode("AKZO_Nobel_Assurantie_N_V", "10007423");
        $VALUES.add(AKZO_Nobel_Assurantie_N_V);
        Norwegian_Hull_Club_Gjensidig_Assuranseforening = new VersichererCode("Norwegian_Hull_Club_Gjensidig_Assuranseforening", "10007426");
        $VALUES.add(Norwegian_Hull_Club_Gjensidig_Assuranseforening);
        XL_Insurance_Company_SE = new VersichererCode("XL_Insurance_Company_SE", "10007427");
        $VALUES.add(XL_Insurance_Company_SE);
        Vitis_Life_S_A = new VersichererCode("Vitis_Life_S_A", "10007438");
        $VALUES.add(Vitis_Life_S_A);
        ZURICH_EUROLIFE_S_A = new VersichererCode("ZURICH_EUROLIFE_S_A", "10007439");
        $VALUES.add(ZURICH_EUROLIFE_S_A);
        Protector_Forsikring_ASA = new VersichererCode("Protector_Forsikring_ASA", "10007444");
        $VALUES.add(Protector_Forsikring_ASA);
        Probus_Insurance_Company_Europe_DAC = new VersichererCode("Probus_Insurance_Company_Europe_DAC", "10007455");
        $VALUES.add(Probus_Insurance_Company_Europe_DAC);
        SOGELIFE_S_A = new VersichererCode("SOGELIFE_S_A", "10007458");
        $VALUES.add(SOGELIFE_S_A);
        COSEC_Companhia_de_Seguro_de_Cr_ditos_SA = new VersichererCode("COSEC_Companhia_de_Seguro_de_Cr_ditos_SA", "10007463");
        $VALUES.add(COSEC_Companhia_de_Seguro_de_Cr_ditos_SA);
        Nationale_Nederlanden_Levensverzekering_Maatschappij_N_V = new VersichererCode("Nationale_Nederlanden_Levensverzekering_Maatschappij_N_V", "10007464");
        $VALUES.add(Nationale_Nederlanden_Levensverzekering_Maatschappij_N_V);
        Groupama_Assicurazioni_S_p_A = new VersichererCode("Groupama_Assicurazioni_S_p_A", "10007475");
        $VALUES.add(Groupama_Assicurazioni_S_p_A);
        K_bstaedernses_almindelige_Brandforsikring_gensidig = new VersichererCode("K_bstaedernses_almindelige_Brandforsikring_gensidig", "10007476");
        $VALUES.add(K_bstaedernses_almindelige_Brandforsikring_gensidig);
        Fortuna_Lebens_Versicherungs_Aktiengesellschaft = new VersichererCode("Fortuna_Lebens_Versicherungs_Aktiengesellschaft", "10007481");
        $VALUES.add(Fortuna_Lebens_Versicherungs_Aktiengesellschaft);
        ERGO_Life_S_A = new VersichererCode("ERGO_Life_S_A", "10007483");
        $VALUES.add(ERGO_Life_S_A);
        European_Mutual_Association_for_Nuclear_Insurance_E_M_A_N_I = new VersichererCode("European_Mutual_Association_for_Nuclear_Insurance_E_M_A_N_I", "10007497");
        $VALUES.add(European_Mutual_Association_for_Nuclear_Insurance_E_M_A_N_I);
        AmTrust_International_Underwriters_dac = new VersichererCode("AmTrust_International_Underwriters_dac", "10007509");
        $VALUES.add(AmTrust_International_Underwriters_dac);
        CNP_Assurances_S_A = new VersichererCode("CNP_Assurances_S_A", "10007510");
        $VALUES.add(CNP_Assurances_S_A);
        Onderlinge_Hagelverzekering_Maatschappij_Agriver_B_A = new VersichererCode("Onderlinge_Hagelverzekering_Maatschappij_Agriver_B_A", "10007512");
        $VALUES.add(Onderlinge_Hagelverzekering_Maatschappij_Agriver_B_A);
        Borealis_Insurance_A_S = new VersichererCode("Borealis_Insurance_A_S", "10007514");
        $VALUES.add(Borealis_Insurance_A_S);
        PI_Indemnity_Company_Designated_Activity_Company = new VersichererCode("PI_Indemnity_Company_Designated_Activity_Company", "10007515");
        $VALUES.add(PI_Indemnity_Company_Designated_Activity_Company);
        BPCE_Life = new VersichererCode("BPCE_Life", "10007519");
        $VALUES.add(BPCE_Life);
        NS_Insurance_N_V = new VersichererCode("NS_Insurance_N_V", "10007522");
        $VALUES.add(NS_Insurance_N_V);
        Industriforsikring_AS = new VersichererCode("Industriforsikring_AS", "10007526");
        $VALUES.add(Industriforsikring_AS);
        UNIQA_Versicherung_Aktiengesellschaft = new VersichererCode("UNIQA_Versicherung_Aktiengesellschaft", "10007531");
        $VALUES.add(UNIQA_Versicherung_Aktiengesellschaft);
        austrion_Life_Insurance_AG = new VersichererCode("austrion_Life_Insurance_AG", "10007544");
        $VALUES.add(austrion_Life_Insurance_AG);
        Vabis_F_rs_kringsaktiebolag = new VersichererCode("Vabis_F_rs_kringsaktiebolag", "10007563");
        $VALUES.add(Vabis_F_rs_kringsaktiebolag);
        Pohjola_Insurance_Ltd = new VersichererCode("Pohjola_Insurance_Ltd", "10007564");
        $VALUES.add(Pohjola_Insurance_Ltd);
        Essity_F_rs_kringsaktiebolag = new VersichererCode("Essity_F_rs_kringsaktiebolag", "10007568");
        $VALUES.add(Essity_F_rs_kringsaktiebolag);
        Lifeguard_Insurance_Dublin_dac = new VersichererCode("Lifeguard_Insurance_Dublin_dac", "10007574");
        $VALUES.add(Lifeguard_Insurance_Dublin_dac);
        Tryg_Forsikring_A_S = new VersichererCode("Tryg_Forsikring_A_S", "10007590");
        $VALUES.add(Tryg_Forsikring_A_S);
        AXA_FRANCE_IARD = new VersichererCode("AXA_FRANCE_IARD", "10007595");
        $VALUES.add(AXA_FRANCE_IARD);
        Helvetia_Assurances_S_A = new VersichererCode("Helvetia_Assurances_S_A", "10007603");
        $VALUES.add(Helvetia_Assurances_S_A);
        NEIL_Overseas_dac = new VersichererCode("NEIL_Overseas_dac", "10007605");
        $VALUES.add(NEIL_Overseas_dac);
        F_rs_kringsaktiebolaget_Vattenfall_Insurance = new VersichererCode("F_rs_kringsaktiebolaget_Vattenfall_Insurance", "10007607");
        $VALUES.add(F_rs_kringsaktiebolaget_Vattenfall_Insurance);
        Assurances_du_Cr_dit_Mutuel_IARD_S_A = new VersichererCode("Assurances_du_Cr_dit_Mutuel_IARD_S_A", "10007608");
        $VALUES.add(Assurances_du_Cr_dit_Mutuel_IARD_S_A);
        Assurances_du_Cr_dit_Mutuel_Vie_S_A = new VersichererCode("Assurances_du_Cr_dit_Mutuel_Vie_S_A", "10007610");
        $VALUES.add(Assurances_du_Cr_dit_Mutuel_Vie_S_A);
        DB_VITA_SA = new VersichererCode("DB_VITA_SA", "10007614");
        $VALUES.add(DB_VITA_SA);
        Baloise_Vie_Luxembourg_S_A = new VersichererCode("Baloise_Vie_Luxembourg_S_A", "10007617");
        $VALUES.add(Baloise_Vie_Luxembourg_S_A);
        International_Credit_Mutuel_Life_S_A = new VersichererCode("International_Credit_Mutuel_Life_S_A", "10007621");
        $VALUES.add(International_Credit_Mutuel_Life_S_A);
        Solid_F_rs_kringsaktiebolag = new VersichererCode("Solid_F_rs_kringsaktiebolag", "10007622");
        $VALUES.add(Solid_F_rs_kringsaktiebolag);
        ERGO_Versicherung_Aktiengesellschaft = new VersichererCode("ERGO_Versicherung_Aktiengesellschaft", "10007637");
        $VALUES.add(ERGO_Versicherung_Aktiengesellschaft);
        Euro_Insurances_dac = new VersichererCode("Euro_Insurances_dac", "10007641");
        $VALUES.add(Euro_Insurances_dac);
        Vienna_Life_Lebensversicherung_AG_Vienna_Insurance_Group = new VersichererCode("Vienna_Life_Lebensversicherung_AG_Vienna_Insurance_Group", "10007643");
        $VALUES.add(Vienna_Life_Lebensversicherung_AG_Vienna_Insurance_Group);
        If_Skadef_rs_kring_AB_publ = new VersichererCode("If_Skadef_rs_kring_AB_publ", "10007645");
        $VALUES.add(If_Skadef_rs_kring_AB_publ);
        Noble_Insurance_Company_dac = new VersichererCode("Noble_Insurance_Company_dac", "10007655");
        $VALUES.add(Noble_Insurance_Company_dac);
        ALLIANZ_COMPANIA_DE_SEGUROS_Y_REASEGUROS_S_A = new VersichererCode("ALLIANZ_COMPANIA_DE_SEGUROS_Y_REASEGUROS_S_A", "10007657");
        $VALUES.add(ALLIANZ_COMPANIA_DE_SEGUROS_Y_REASEGUROS_S_A);
        Zurich_Life_Assurance_Public_Limited_Company = new VersichererCode("Zurich_Life_Assurance_Public_Limited_Company", "10007659");
        $VALUES.add(Zurich_Life_Assurance_Public_Limited_Company);
        Cali_Europe = new VersichererCode("Cali_Europe", "10007660");
        $VALUES.add(Cali_Europe);
        Accept_F_rs_kringsaktiebolag_publ = new VersichererCode("Accept_F_rs_kringsaktiebolag_publ", "10007662");
        $VALUES.add(Accept_F_rs_kringsaktiebolag_publ);
        CNP_Unicredit_Vita_S_p_A = new VersichererCode("CNP_Unicredit_Vita_S_p_A", "10007669");
        $VALUES.add(CNP_Unicredit_Vita_S_p_A);
        Monument_Assurance_Luxembourg_S_A = new VersichererCode("Monument_Assurance_Luxembourg_S_A", "10007671");
        $VALUES.add(Monument_Assurance_Luxembourg_S_A);
        Europ_ische_Reiseversicherung_AG = new VersichererCode("Europ_ische_Reiseversicherung_AG", "10007674");
        $VALUES.add(Europ_ische_Reiseversicherung_AG);
        Vorarlberger_Landes_Versicherung_V_a_G = new VersichererCode("Vorarlberger_Landes_Versicherung_V_a_G", "10007677");
        $VALUES.add(Vorarlberger_Landes_Versicherung_V_a_G);
        YOUPLUS_Assurance_AG = new VersichererCode("YOUPLUS_Assurance_AG", "10007689");
        $VALUES.add(YOUPLUS_Assurance_AG);
        CIGNA_Europe_Insurance_Company_S_A = new VersichererCode("CIGNA_Europe_Insurance_Company_S_A", "10007693");
        $VALUES.add(CIGNA_Europe_Insurance_Company_S_A);
        Z_rich_Versicherungs_Aktiengesellschaft = new VersichererCode("Z_rich_Versicherungs_Aktiengesellschaft", "10007695");
        $VALUES.add(Z_rich_Versicherungs_Aktiengesellschaft);
        Electrolux_F_rs_kringsaktiebolag = new VersichererCode("Electrolux_F_rs_kringsaktiebolag", "10007704");
        $VALUES.add(Electrolux_F_rs_kringsaktiebolag);
        BBPM_Life_dac = new VersichererCode("BBPM_Life_dac", "10007717");
        $VALUES.add(BBPM_Life_dac);
        InChiaro_Life_Designated_Activity_Company = new VersichererCode("InChiaro_Life_Designated_Activity_Company", "10007721");
        $VALUES.add(InChiaro_Life_Designated_Activity_Company);
        Carraig_Insurance_dac = new VersichererCode("Carraig_Insurance_dac", "10007722");
        $VALUES.add(Carraig_Insurance_dac);
        PrismaLife_AG = new VersichererCode("PrismaLife_AG", "10007723");
        $VALUES.add(PrismaLife_AG);
        Aterf_rs_kringsaktiebolaget_SKF = new VersichererCode("Aterf_rs_kringsaktiebolaget_SKF", "10007732");
        $VALUES.add(Aterf_rs_kringsaktiebolaget_SKF);
        Mediolanum_International_Life_dac = new VersichererCode("Mediolanum_International_Life_dac", "10007736");
        $VALUES.add(Mediolanum_International_Life_dac);
        Sasol_International_Insurance_dac = new VersichererCode("Sasol_International_Insurance_dac", "10007739");
        $VALUES.add(Sasol_International_Insurance_dac);
        AXIS_Specialty_Europe_SE = new VersichererCode("AXIS_Specialty_Europe_SE", "10007740");
        $VALUES.add(AXIS_Specialty_Europe_SE);
        Utmost_PanEurope_dac = new VersichererCode("Utmost_PanEurope_dac", "10007744");
        $VALUES.add(Utmost_PanEurope_dac);
        swisspartners_Versicherung_AG = new VersichererCode("swisspartners_Versicherung_AG", "10007745");
        $VALUES.add(swisspartners_Versicherung_AG);
        Allied_World_Assurance_Company_Europe_DAC = new VersichererCode("Allied_World_Assurance_Company_Europe_DAC", "10007749");
        $VALUES.add(Allied_World_Assurance_Company_Europe_DAC);
        UPS_International_Insurance_dac = new VersichererCode("UPS_International_Insurance_dac", "10007754");
        $VALUES.add(UPS_International_Insurance_dac);
        SBB_Insurance_AG = new VersichererCode("SBB_Insurance_AG", "10007755");
        $VALUES.add(SBB_Insurance_AG);
        White_Horse_Insurance_Ireland_dac = new VersichererCode("White_Horse_Insurance_Ireland_dac", "10007764");
        $VALUES.add(White_Horse_Insurance_Ireland_dac);
        RAIFFEISEN_VIE_S_A = new VersichererCode("RAIFFEISEN_VIE_S_A", "10007767");
        $VALUES.add(RAIFFEISEN_VIE_S_A);
        Assuranceforeningen_Skuld_Gjensidig = new VersichererCode("Assuranceforeningen_Skuld_Gjensidig", "10007772");
        $VALUES.add(Assuranceforeningen_Skuld_Gjensidig);
        Octium_Life_dac = new VersichererCode("Octium_Life_dac", "10007773");
        $VALUES.add(Octium_Life_dac);
        AXA_France_Vie_S_A = new VersichererCode("AXA_France_Vie_S_A", "10007775");
        $VALUES.add(AXA_France_Vie_S_A);
        Canada_Life_Assurance_Europe_plc = new VersichererCode("Canada_Life_Assurance_Europe_plc", "10007786");
        $VALUES.add(Canada_Life_Assurance_Europe_plc);
        PFA_Pension_forsikringsaktieselskab = new VersichererCode("PFA_Pension_forsikringsaktieselskab", "10007787");
        $VALUES.add(PFA_Pension_forsikringsaktieselskab);
        RSIF_International_dac = new VersichererCode("RSIF_International_dac", "10007794");
        $VALUES.add(RSIF_International_dac);
        Pharma_International_Insurance_dac = new VersichererCode("Pharma_International_Insurance_dac", "10007801");
        $VALUES.add(Pharma_International_Insurance_dac);
        CACI_Non_Life_Designated_Activity_Company = new VersichererCode("CACI_Non_Life_Designated_Activity_Company", "10007807");
        $VALUES.add(CACI_Non_Life_Designated_Activity_Company);
        Merkur_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Merkur_Lebensversicherung_Aktiengesellschaft", "10007810");
        $VALUES.add(Merkur_Lebensversicherung_Aktiengesellschaft);
        CACI_Life_Designated_Activity_Company = new VersichererCode("CACI_Life_Designated_Activity_Company", "10007811");
        $VALUES.add(CACI_Life_Designated_Activity_Company);
        Great_American_International_Insurance_EU_DAC = new VersichererCode("Great_American_International_Insurance_EU_DAC", "10007815");
        $VALUES.add(Great_American_International_Insurance_EU_DAC);
        Soci_t_D_Assurances_G_n_rales_Appliqu_es_SAGA_Designated_Activity_Company = new VersichererCode("Soci_t_D_Assurances_G_n_rales_Appliqu_es_SAGA_Designated_Activity_Company", "10007821");
        $VALUES.add(Soci_t_D_Assurances_G_n_rales_Appliqu_es_SAGA_Designated_Activity_Company);
        Fidelidade_Companhia_de_Seguros_S_A = new VersichererCode("Fidelidade_Companhia_de_Seguros_S_A", "10007826");
        $VALUES.add(Fidelidade_Companhia_de_Seguros_S_A);
        La_Mondiale_Europartner_S_A = new VersichererCode("La_Mondiale_Europartner_S_A", "10007828");
        $VALUES.add(La_Mondiale_Europartner_S_A);
        UVM_Verzekeringsmaatschappij_N_V = new VersichererCode("UVM_Verzekeringsmaatschappij_N_V", "10007829");
        $VALUES.add(UVM_Verzekeringsmaatschappij_N_V);
        Visenta_F_rs_kringsaktiebolag_Managing_Director_Ragnar_Andersson = new VersichererCode("Visenta_F_rs_kringsaktiebolag_Managing_Director_Ragnar_Andersson", "10007830");
        $VALUES.add(Visenta_F_rs_kringsaktiebolag_Managing_Director_Ragnar_Andersson);
        March_Vida_Sociedad_Anonima_de_Seguros_y_Reaseguros = new VersichererCode("March_Vida_Sociedad_Anonima_de_Seguros_y_Reaseguros", "10007833");
        $VALUES.add(March_Vida_Sociedad_Anonima_de_Seguros_y_Reaseguros);
        ETHIAS_S_A = new VersichererCode("ETHIAS_S_A", "10007836");
        $VALUES.add(ETHIAS_S_A);
        ELINI_A_M = new VersichererCode("ELINI_A_M", "10007840");
        $VALUES.add(ELINI_A_M);
        Balcia_Insurance_SE = new VersichererCode("Balcia_Insurance_SE", "10007842");
        $VALUES.add(Balcia_Insurance_SE);
        Kooperativa_poji_ovna_a_s_Vienna_Insurance_Group = new VersichererCode("Kooperativa_poji_ovna_a_s_Vienna_Insurance_Group", "10007845");
        $VALUES.add(Kooperativa_poji_ovna_a_s_Vienna_Insurance_Group);
        Allianz_poji_ovna_a_s = new VersichererCode("Allianz_poji_ovna_a_s", "10007848");
        $VALUES.add(Allianz_poji_ovna_a_s);
        Justitia_NV = new VersichererCode("Justitia_NV", "10007852");
        $VALUES.add(Justitia_NV);
        ONVZ_Ziegtekostenverzekeraar_N_V = new VersichererCode("ONVZ_Ziegtekostenverzekeraar_N_V", "10007860");
        $VALUES.add(ONVZ_Ziegtekostenverzekeraar_N_V);
        Allianz_IARD = new VersichererCode("Allianz_IARD", "10007863");
        $VALUES.add(Allianz_IARD);
        Compagnia_Italiana_Di_Previdenza_Assicurazioni_e_Riassicurazioni = new VersichererCode("Compagnia_Italiana_Di_Previdenza_Assicurazioni_e_Riassicurazioni", "10007867");
        $VALUES.add(Compagnia_Italiana_Di_Previdenza_Assicurazioni_e_Riassicurazioni);
        W_lder_Versicherung_Versicherungsverein_auf_Gegenseitigkeit = new VersichererCode("W_lder_Versicherung_Versicherungsverein_auf_Gegenseitigkeit", "10007870");
        $VALUES.add(W_lder_Versicherung_Versicherungsverein_auf_Gegenseitigkeit);
        Credendo_Trade_Credit_Insurance = new VersichererCode("Credendo_Trade_Credit_Insurance", "10007873");
        $VALUES.add(Credendo_Trade_Credit_Insurance);
        Fennia_Mutual_Insurance_Company = new VersichererCode("Fennia_Mutual_Insurance_Company", "10007874");
        $VALUES.add(Fennia_Mutual_Insurance_Company);
        Swiss_Life_Liechtenstein_AG = new VersichererCode("Swiss_Life_Liechtenstein_AG", "10007878");
        $VALUES.add(Swiss_Life_Liechtenstein_AG);
        SACE_BT_S_P_A = new VersichererCode("SACE_BT_S_P_A", "10007880");
        $VALUES.add(SACE_BT_S_P_A);
        Yara_Insurance_dac = new VersichererCode("Yara_Insurance_dac", "10007881");
        $VALUES.add(Yara_Insurance_dac);
        Credendo_Guarantees_and_Specialty_Risks_NV = new VersichererCode("Credendo_Guarantees_and_Specialty_Risks_NV", "10007888");
        $VALUES.add(Credendo_Guarantees_and_Specialty_Risks_NV);
        MELES_Insurance_A_S = new VersichererCode("MELES_Insurance_A_S", "10007889");
        $VALUES.add(MELES_Insurance_A_S);
        If_P_C_Insurance_AS = new VersichererCode("If_P_C_Insurance_AS", "10007891");
        $VALUES.add(If_P_C_Insurance_AS);
        Intesa_Sanpaolo_Vita_S_p_A = new VersichererCode("Intesa_Sanpaolo_Vita_S_p_A", "10007893");
        $VALUES.add(Intesa_Sanpaolo_Vita_S_p_A);
        Quantum_Leben_AG = new VersichererCode("Quantum_Leben_AG", "10007894");
        $VALUES.add(Quantum_Leben_AG);
        Hawthorn_Life_dac = new VersichererCode("Hawthorn_Life_dac", "10007896");
        $VALUES.add(Hawthorn_Life_dac);
        Nucleus_Life_AG = new VersichererCode("Nucleus_Life_AG", "10007897");
        $VALUES.add(Nucleus_Life_AG);
        SCILDON_N_V = new VersichererCode("SCILDON_N_V", "10007903");
        $VALUES.add(SCILDON_N_V);
        SOB_Poji_ovna_a_s_len_holdingu_SOB = new VersichererCode("SOB_Poji_ovna_a_s_len_holdingu_SOB", "10007905");
        $VALUES.add(SOB_Poji_ovna_a_s_len_holdingu_SOB);
        Allianz_Hung_ria_Biztos_to_Zrt = new VersichererCode("Allianz_Hung_ria_Biztos_to_Zrt", "10007907");
        $VALUES.add(Allianz_Hung_ria_Biztos_to_Zrt);
        PartnerRe_Ireland_Insurance_dac = new VersichererCode("PartnerRe_Ireland_Insurance_dac", "10007910");
        $VALUES.add(PartnerRe_Ireland_Insurance_dac);
        Neuflize_Vie = new VersichererCode("Neuflize_Vie", "10007911");
        $VALUES.add(Neuflize_Vie);
        ZAVAROVALNICA_TRIGLAV_d_d = new VersichererCode("ZAVAROVALNICA_TRIGLAV_d_d", "10007912");
        $VALUES.add(ZAVAROVALNICA_TRIGLAV_d_d);
        SwissLife_Assurance_et_Patrimoine = new VersichererCode("SwissLife_Assurance_et_Patrimoine", "10007913");
        $VALUES.add(SwissLife_Assurance_et_Patrimoine);
        Le_Sphinx_Assurances_Luxembourg_S_A = new VersichererCode("Le_Sphinx_Assurances_Luxembourg_S_A", "10007915");
        $VALUES.add(Le_Sphinx_Assurances_Luxembourg_S_A);
        Eur_pai_Utaz_si_Biztosit_Rt = new VersichererCode("Eur_pai_Utaz_si_Biztosit_Rt", "10007922");
        $VALUES.add(Eur_pai_Utaz_si_Biztosit_Rt);
        Unicorp_Vida_Compania_de_Seguros_y_Reaseguros_S_A = new VersichererCode("Unicorp_Vida_Compania_de_Seguros_y_Reaseguros_S_A", "10007924");
        $VALUES.add(Unicorp_Vida_Compania_de_Seguros_y_Reaseguros_S_A);
        White_Rock_Insurance_Europe_PCC_Limited = new VersichererCode("White_Rock_Insurance_Europe_PCC_Limited", "10007926");
        $VALUES.add(White_Rock_Insurance_Europe_PCC_Limited);
        Powszechny_Zak_ad_Ubezpiecze_Sp_ka_Akcyjna = new VersichererCode("Powszechny_Zak_ad_Ubezpiecze_Sp_ka_Akcyjna", "10007928");
        $VALUES.add(Powszechny_Zak_ad_Ubezpiecze_Sp_ka_Akcyjna);
        Ergon_Insurance_Limited = new VersichererCode("Ergon_Insurance_Limited", "10007930");
        $VALUES.add(Ergon_Insurance_Limited);
        Wagram_Insurance_Company_dac = new VersichererCode("Wagram_Insurance_Company_dac", "10007932");
        $VALUES.add(Wagram_Insurance_Company_dac);
        Sara_Assicurazioni_s_p_a = new VersichererCode("Sara_Assicurazioni_s_p_a", "10007934");
        $VALUES.add(Sara_Assicurazioni_s_p_a);
        ASR_Schadeverzekering_N_V = new VersichererCode("ASR_Schadeverzekering_N_V", "10007935");
        $VALUES.add(ASR_Schadeverzekering_N_V);
        Towarzystwo_Ubezpiecze_i_Reasekuracji_WARTA_S_A = new VersichererCode("Towarzystwo_Ubezpiecze_i_Reasekuracji_WARTA_S_A", "10007940");
        $VALUES.add(Towarzystwo_Ubezpiecze_i_Reasekuracji_WARTA_S_A);
        BPI_Vida_e_Pens_es_Companhia_de_Seguros_S_A = new VersichererCode("BPI_Vida_e_Pens_es_Companhia_de_Seguros_S_A", "10007943");
        $VALUES.add(BPI_Vida_e_Pens_es_Companhia_de_Seguros_S_A);
        Generali_esk_Poji_t_ovna_a_s = new VersichererCode("Generali_esk_Poji_t_ovna_a_s", "10007946");
        $VALUES.add(Generali_esk_Poji_t_ovna_a_s);
        Onderlinge_Verzekering_Maatschappij_Noord_Nederlandsche_P_I_Club_U_A = new VersichererCode("Onderlinge_Verzekering_Maatschappij_Noord_Nederlandsche_P_I_Club_U_A", "10007947");
        $VALUES.add(Onderlinge_Verzekering_Maatschappij_Noord_Nederlandsche_P_I_Club_U_A);
        Inter_Partner_Assistance_SA = new VersichererCode("Inter_Partner_Assistance_SA", "10007956");
        $VALUES.add(Inter_Partner_Assistance_SA);
        Vodafone_Insurance_Ltd = new VersichererCode("Vodafone_Insurance_Ltd", "10007958");
        $VALUES.add(Vodafone_Insurance_Ltd);
        BCC_Assicurazioni_S_P_A = new VersichererCode("BCC_Assicurazioni_S_P_A", "10007968");
        $VALUES.add(BCC_Assicurazioni_S_P_A);
        Ornua_Insurance_Designated_Activity_Company = new VersichererCode("Ornua_Insurance_Designated_Activity_Company", "10007969");
        $VALUES.add(Ornua_Insurance_Designated_Activity_Company);
        Achmea_Schadeverzekeringen_N_V = new VersichererCode("Achmea_Schadeverzekeringen_N_V", "10007970");
        $VALUES.add(Achmea_Schadeverzekeringen_N_V);
        Towarzystwo_Ubezpiecze_i_Reasekuracji_Allianz_Polska_S_A = new VersichererCode("Towarzystwo_Ubezpiecze_i_Reasekuracji_Allianz_Polska_S_A", "10007971");
        $VALUES.add(Towarzystwo_Ubezpiecze_i_Reasekuracji_Allianz_Polska_S_A);
        HSBC_ASSURANCES_VIE_FRANCE = new VersichererCode("HSBC_ASSURANCES_VIE_FRANCE", "10007975");
        $VALUES.add(HSBC_ASSURANCES_VIE_FRANCE);
        Groupama_Assurance_Credit_et_Caution = new VersichererCode("Groupama_Assurance_Credit_et_Caution", "10007982");
        $VALUES.add(Groupama_Assurance_Credit_et_Caution);
        ADVIGON_VERSICHERUNG_AG = new VersichererCode("ADVIGON_VERSICHERUNG_AG", "10007985");
        $VALUES.add(ADVIGON_VERSICHERUNG_AG);
        Sopockie_Towarzystwo_Ubezpieczen_Ergo_Hestia_S_A = new VersichererCode("Sopockie_Towarzystwo_Ubezpieczen_Ergo_Hestia_S_A", "10007988");
        $VALUES.add(Sopockie_Towarzystwo_Ubezpieczen_Ergo_Hestia_S_A);
        Towarzystwo_Ubezpiecze_Euler_Hermes_S_A = new VersichererCode("Towarzystwo_Ubezpiecze_Euler_Hermes_S_A", "10007989");
        $VALUES.add(Towarzystwo_Ubezpiecze_Euler_Hermes_S_A);
        Helvetia_Global_Solutions_AG = new VersichererCode("Helvetia_Global_Solutions_AG", "10007997");
        $VALUES.add(Helvetia_Global_Solutions_AG);
        Cardif_Assurance_Vie_S_A = new VersichererCode("Cardif_Assurance_Vie_S_A", "10009001");
        $VALUES.add(Cardif_Assurance_Vie_S_A);
        Allianz_Lietuva_gyvyb_s_draudimas_UAB = new VersichererCode("Allianz_Lietuva_gyvyb_s_draudimas_UAB", "10009003");
        $VALUES.add(Allianz_Lietuva_gyvyb_s_draudimas_UAB);
        Generali_Italia_S_p_A = new VersichererCode("Generali_Italia_S_p_A", "10009006");
        $VALUES.add(Generali_Italia_S_p_A);
        AXERIA_IARD = new VersichererCode("AXERIA_IARD", "10009010");
        $VALUES.add(AXERIA_IARD);
        Squarelife_Insurance_AG = new VersichererCode("Squarelife_Insurance_AG", "10009012");
        $VALUES.add(Squarelife_Insurance_AG);
        KBC_Verzekeringen_S_A = new VersichererCode("KBC_Verzekeringen_S_A", "10009014");
        $VALUES.add(KBC_Verzekeringen_S_A);
        ASR_Levensverzekering_N_V = new VersichererCode("ASR_Levensverzekering_N_V", "10009015");
        $VALUES.add(ASR_Levensverzekering_N_V);
        Gable_Insurance_AG_in_Liquidation = new VersichererCode("Gable_Insurance_AG_in_Liquidation", "10009016");
        $VALUES.add(Gable_Insurance_AG_in_Liquidation);
        CHUBB_European_Group_SE = new VersichererCode("CHUBB_European_Group_SE", "10009019");
        $VALUES.add(CHUBB_European_Group_SE);
        Generali_Biztos_t_Zrt = new VersichererCode("Generali_Biztos_t_Zrt", "10009026");
        $VALUES.add(Generali_Biztos_t_Zrt);
        Maiden_Life_F_rs_krings_AB = new VersichererCode("Maiden_Life_F_rs_krings_AB", "10009035");
        $VALUES.add(Maiden_Life_F_rs_krings_AB);
        ETU_Forsikring_A_S = new VersichererCode("ETU_Forsikring_A_S", "10009039");
        $VALUES.add(ETU_Forsikring_A_S);
        L_nsf_rs_kringar_AB_publ = new VersichererCode("L_nsf_rs_kringar_AB_publ", "10009042");
        $VALUES.add(L_nsf_rs_kringar_AB_publ);
        UNION_Vienna_Insurance_Group_Biztos_t_Zrt = new VersichererCode("UNION_Vienna_Insurance_Group_Biztos_t_Zrt", "10009045");
        $VALUES.add(UNION_Vienna_Insurance_Group_Biztos_t_Zrt);
        Euroins_Insurance_JSC = new VersichererCode("Euroins_Insurance_JSC", "10009047");
        $VALUES.add(Euroins_Insurance_JSC);
        Cardif_Assurances_Risques_Divers = new VersichererCode("Cardif_Assurances_Risques_Divers", "10009050");
        $VALUES.add(Cardif_Assurances_Risques_Divers);
        Prudential_International_Assurance_Plc = new VersichererCode("Prudential_International_Assurance_Plc", "10009052");
        $VALUES.add(Prudential_International_Assurance_Plc);
        UNIQA_poji_ovna_a_s = new VersichererCode("UNIQA_poji_ovna_a_s", "10009057");
        $VALUES.add(UNIQA_poji_ovna_a_s);
        Quatrem = new VersichererCode("Quatrem", "10009058");
        $VALUES.add(Quatrem);
        Waard_Leven_N_V = new VersichererCode("Waard_Leven_N_V", "10009065");
        $VALUES.add(Waard_Leven_N_V);
        Den_Norske_Krigsforsikring_for_Skib_Gjensidig_Forening = new VersichererCode("Den_Norske_Krigsforsikring_for_Skib_Gjensidig_Forening", "10009067");
        $VALUES.add(Den_Norske_Krigsforsikring_for_Skib_Gjensidig_Forening);
        Atlas_Insurance_PCC_Limited = new VersichererCode("Atlas_Insurance_PCC_Limited", "10009068");
        $VALUES.add(Atlas_Insurance_PCC_Limited);
        SwissLife_Prevoyance_et_Sante = new VersichererCode("SwissLife_Prevoyance_et_Sante", "10009069");
        $VALUES.add(SwissLife_Prevoyance_et_Sante);
        Groupama_Grand_Est_Caisse_R_gionale_de_R_assurances_Mutuelles_Agricoles_du_Grant_Est = new VersichererCode("Groupama_Grand_Est_Caisse_R_gionale_de_R_assurances_Mutuelles_Agricoles_du_Grant_Est", "10009070");
        $VALUES.add(Groupama_Grand_Est_Caisse_R_gionale_de_R_assurances_Mutuelles_Agricoles_du_Grant_Est);
        ORKLA_Insurance_Company_dac = new VersichererCode("ORKLA_Insurance_Company_dac", "10009071");
        $VALUES.add(ORKLA_Insurance_Company_dac);
        Lietuvos_Draudimas_AB = new VersichererCode("Lietuvos_Draudimas_AB", "10009074");
        $VALUES.add(Lietuvos_Draudimas_AB);
        CAJAMAR_VIDA_SOCIEDAD_ANONIMA_DE_SEGUROS_Y_REASEGUROS = new VersichererCode("CAJAMAR_VIDA_SOCIEDAD_ANONIMA_DE_SEGUROS_Y_REASEGUROS", "10009076");
        $VALUES.add(CAJAMAR_VIDA_SOCIEDAD_ANONIMA_DE_SEGUROS_Y_REASEGUROS);
        Ericsson_Insurance_F_rs_kring_AB = new VersichererCode("Ericsson_Insurance_F_rs_kring_AB", "10009077");
        $VALUES.add(Ericsson_Insurance_F_rs_kring_AB);
        IDA_Insurance_Limited = new VersichererCode("IDA_Insurance_Limited", "10009079");
        $VALUES.add(IDA_Insurance_Limited);
        Vishay_Insurance_Limited = new VersichererCode("Vishay_Insurance_Limited", "10009083");
        $VALUES.add(Vishay_Insurance_Limited);
        Twincap_F_rs_krings_AB = new VersichererCode("Twincap_F_rs_krings_AB", "10009089");
        $VALUES.add(Twincap_F_rs_krings_AB);
        Groupama_Phoenix_Hellenic_Insurance_Company_S_A = new VersichererCode("Groupama_Phoenix_Hellenic_Insurance_Company_S_A", "10009090");
        $VALUES.add(Groupama_Phoenix_Hellenic_Insurance_Company_S_A);
        Standard_Life_International_Designated_Activity_Company = new VersichererCode("Standard_Life_International_Designated_Activity_Company", "10009093");
        $VALUES.add(Standard_Life_International_Designated_Activity_Company);
        Baloise_Life_Liechtenstein_AG = new VersichererCode("Baloise_Life_Liechtenstein_AG", "10009094");
        $VALUES.add(Baloise_Life_Liechtenstein_AG);
        Anker_Insurance_Company_N_V = new VersichererCode("Anker_Insurance_Company_N_V", "10009097");
        $VALUES.add(Anker_Insurance_Company_N_V);
        Salling_Group_Captiveforsikringsselskab_A_S = new VersichererCode("Salling_Group_Captiveforsikringsselskab_A_S", "10009098");
        $VALUES.add(Salling_Group_Captiveforsikringsselskab_A_S);
        Caisse_de_R_assurance_Mutuelle_Agricole_du_Centre_Manche = new VersichererCode("Caisse_de_R_assurance_Mutuelle_Agricole_du_Centre_Manche", "10009102");
        $VALUES.add(Caisse_de_R_assurance_Mutuelle_Agricole_du_Centre_Manche);
        Foyer_Global_Health_S_A = new VersichererCode("Foyer_Global_Health_S_A", "10009104");
        $VALUES.add(Foyer_Global_Health_S_A);
        Zurich_Vida_Compania_de_seguros_y_reaseguros_S_A = new VersichererCode("Zurich_Vida_Compania_de_seguros_y_reaseguros_S_A", "10009107");
        $VALUES.add(Zurich_Vida_Compania_de_seguros_y_reaseguros_S_A);
        Lifetri_Verzekeringen_N_V = new VersichererCode("Lifetri_Verzekeringen_N_V", "10009108");
        $VALUES.add(Lifetri_Verzekeringen_N_V);
        Klaverblad_Schadeverzekeringsmaatschappij_N_V = new VersichererCode("Klaverblad_Schadeverzekeringsmaatschappij_N_V", "10009111");
        $VALUES.add(Klaverblad_Schadeverzekeringsmaatschappij_N_V);
        Danica_Pension_Livsforsikringsselskab = new VersichererCode("Danica_Pension_Livsforsikringsselskab", "10009114");
        $VALUES.add(Danica_Pension_Livsforsikringsselskab);
        Komer_n_poji_ovna_a_s = new VersichererCode("Komer_n_poji_ovna_a_s", "10009118");
        $VALUES.add(Komer_n_poji_ovna_a_s);
        Sappisure_F_rs_krings_AB = new VersichererCode("Sappisure_F_rs_krings_AB", "10009121");
        $VALUES.add(Sappisure_F_rs_krings_AB);
        Axa_Assurances_Luxembourg = new VersichererCode("Axa_Assurances_Luxembourg", "10009136");
        $VALUES.add(Axa_Assurances_Luxembourg);
        Allianz_Benelux_SA_NV = new VersichererCode("Allianz_Benelux_SA_NV", "10009137");
        $VALUES.add(Allianz_Benelux_SA_NV);
        Liechtenstein_Life_Assurance_AG = new VersichererCode("Liechtenstein_Life_Assurance_AG", "10009139");
        $VALUES.add(Liechtenstein_Life_Assurance_AG);
        Stellantis_Insurance_Limited = new VersichererCode("Stellantis_Insurance_Limited", "10009142");
        $VALUES.add(Stellantis_Insurance_Limited);
        esk_podnikatelsk_poji_ovna_a_s_Vienna_Insurance_Group = new VersichererCode("esk_podnikatelsk_poji_ovna_a_s_Vienna_Insurance_Group", "10009143");
        $VALUES.add(esk_podnikatelsk_poji_ovna_a_s_Vienna_Insurance_Group);
        STELLANTIS_LIFE_INSURANCE_LIMITED = new VersichererCode("STELLANTIS_LIFE_INSURANCE_LIMITED", "10009147");
        $VALUES.add(STELLANTIS_LIFE_INSURANCE_LIMITED);
        LV_1871_Private_Assurance_AG = new VersichererCode("LV_1871_Private_Assurance_AG", "10009153");
        $VALUES.add(LV_1871_Private_Assurance_AG);
        Elips_Life_AG = new VersichererCode("Elips_Life_AG", "10009155");
        $VALUES.add(Elips_Life_AG);
        Mapfre_Middlesea_plc = new VersichererCode("Mapfre_Middlesea_plc", "10009156");
        $VALUES.add(Mapfre_Middlesea_plc);
        Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_de_Rhone_Alpes_Auvergne = new VersichererCode("Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_de_Rhone_Alpes_Auvergne", "10009157");
        $VALUES.add(Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_de_Rhone_Alpes_Auvergne);
        RCI_Insurance_Limited = new VersichererCode("RCI_Insurance_Limited", "10009158");
        $VALUES.add(RCI_Insurance_Limited);
        RCI_Life_Limited = new VersichererCode("RCI_Life_Limited", "10009159");
        $VALUES.add(RCI_Life_Limited);
        RSA_Insurance_Ireland_Designated_Activity_Company = new VersichererCode("RSA_Insurance_Ireland_Designated_Activity_Company", "10009161");
        $VALUES.add(RSA_Insurance_Ireland_Designated_Activity_Company);
        DSV_Insurance_A_S = new VersichererCode("DSV_Insurance_A_S", "10009163");
        $VALUES.add(DSV_Insurance_A_S);
        CRH_GROUP_INSURANCE_SERVICES_EUROPE_LTD = new VersichererCode("CRH_GROUP_INSURANCE_SERVICES_EUROPE_LTD", "10009167");
        $VALUES.add(CRH_GROUP_INSURANCE_SERVICES_EUROPE_LTD);
        Generali_Towarzystwo_Ubezpieczen_Sp_lka_Akcyjna = new VersichererCode("Generali_Towarzystwo_Ubezpieczen_Sp_lka_Akcyjna", "10009171");
        $VALUES.add(Generali_Towarzystwo_Ubezpieczen_Sp_lka_Akcyjna);
        Powszechny_Zak_ad_Ubezpiecze_na_ycie_Sp_ka_Akcyjna = new VersichererCode("Powszechny_Zak_ad_Ubezpiecze_na_ycie_Sp_ka_Akcyjna", "10009174");
        $VALUES.add(Powszechny_Zak_ad_Ubezpiecze_na_ycie_Sp_ka_Akcyjna);
        Argoglobal_Assicurazioni_S_P_A = new VersichererCode("Argoglobal_Assicurazioni_S_P_A", "10009176");
        $VALUES.add(Argoglobal_Assicurazioni_S_P_A);
        Nissan_International_Insurance_Limited = new VersichererCode("Nissan_International_Insurance_Limited", "10009177");
        $VALUES.add(Nissan_International_Insurance_Limited);
        SIGNAL_IDUNA_ASIGURARI_S_A = new VersichererCode("SIGNAL_IDUNA_ASIGURARI_S_A", "10009188");
        $VALUES.add(SIGNAL_IDUNA_ASIGURARI_S_A);
        Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Paris_Val_de_Loire = new VersichererCode("Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Paris_Val_de_Loire", "10009191");
        $VALUES.add(Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Paris_Val_de_Loire);
        AGPM_Vie = new VersichererCode("AGPM_Vie", "10009193");
        $VALUES.add(AGPM_Vie);
        G_n_ration_Vie = new VersichererCode("G_n_ration_Vie", "10009196");
        $VALUES.add(G_n_ration_Vie);
        Swiss_Life_Products_Luxembourg_S_A = new VersichererCode("Swiss_Life_Products_Luxembourg_S_A", "10009203");
        $VALUES.add(Swiss_Life_Products_Luxembourg_S_A);
        BPCE_Vie = new VersichererCode("BPCE_Vie", "10009206");
        $VALUES.add(BPCE_Vie);
        Greenstars_BNP_Paribas_S_A = new VersichererCode("Greenstars_BNP_Paribas_S_A", "10009210");
        $VALUES.add(Greenstars_BNP_Paribas_S_A);
        Associations_Mutuelles_Le_Conservateur = new VersichererCode("Associations_Mutuelles_Le_Conservateur", "10009211");
        $VALUES.add(Associations_Mutuelles_Le_Conservateur);
        Forsikringsselskabet_Privatsikring_A_S = new VersichererCode("Forsikringsselskabet_Privatsikring_A_S", "10009217");
        $VALUES.add(Forsikringsselskabet_Privatsikring_A_S);
        Lusitania_Companhia_de_Seguros_S_A = new VersichererCode("Lusitania_Companhia_de_Seguros_S_A", "10009219");
        $VALUES.add(Lusitania_Companhia_de_Seguros_S_A);
        The_West_of_England_Ship_Owners_Mutual_Insurance_Association = new VersichererCode("The_West_of_England_Ship_Owners_Mutual_Insurance_Association", "10009220");
        $VALUES.add(The_West_of_England_Ship_Owners_Mutual_Insurance_Association);
        Societe_Mutuelle_d_Assurance_du_Batiment_et_des_Travaux_Publics = new VersichererCode("Societe_Mutuelle_d_Assurance_du_Batiment_et_des_Travaux_Publics", "10009231");
        $VALUES.add(Societe_Mutuelle_d_Assurance_du_Batiment_et_des_Travaux_Publics);
        Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Bretagne_Pays_de_la_Loire = new VersichererCode("Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Bretagne_Pays_de_la_Loire", "10009232");
        $VALUES.add(Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_Bretagne_Pays_de_la_Loire);
        Vienna_Insurance_Group_AG_Wiener_Versicherung_Gruppe = new VersichererCode("Vienna_Insurance_Group_AG_Wiener_Versicherung_Gruppe", "10009234");
        $VALUES.add(Vienna_Insurance_Group_AG_Wiener_Versicherung_Gruppe);
        AWP_P_C_S_A = new VersichererCode("AWP_P_C_S_A", "10009239");
        $VALUES.add(AWP_P_C_S_A);
        Hamilton_Insurance_Designated_Activity_Company = new VersichererCode("Hamilton_Insurance_Designated_Activity_Company", "10009243");
        $VALUES.add(Hamilton_Insurance_Designated_Activity_Company);
        Goudse_Schadeverzekeringen_N_V = new VersichererCode("Goudse_Schadeverzekeringen_N_V", "10009253");
        $VALUES.add(Goudse_Schadeverzekeringen_N_V);
        IMA_Assurances = new VersichererCode("IMA_Assurances", "10009255");
        $VALUES.add(IMA_Assurances);
        SN_SecureCorp_Insurance_Malta_Ltd = new VersichererCode("SN_SecureCorp_Insurance_Malta_Ltd", "10009257");
        $VALUES.add(SN_SecureCorp_Insurance_Malta_Ltd);
        Baloise_Belgium_NV_SA = new VersichererCode("Baloise_Belgium_NV_SA", "10009259");
        $VALUES.add(Baloise_Belgium_NV_SA);
        ZK_LEV_INS_AD = new VersichererCode("ZK_LEV_INS_AD", "10009261");
        $VALUES.add(ZK_LEV_INS_AD);
        Advent_Insurance_PCC_Ltd_UIB_Cell = new VersichererCode("Advent_Insurance_PCC_Ltd_UIB_Cell", "10009272");
        $VALUES.add(Advent_Insurance_PCC_Ltd_UIB_Cell);
        S_C_ALLIANZ_TIRIAC_ASIGURARI_S_A = new VersichererCode("S_C_ALLIANZ_TIRIAC_ASIGURARI_S_A", "10009273");
        $VALUES.add(S_C_ALLIANZ_TIRIAC_ASIGURARI_S_A);
        ABC_Insurance_S_A = new VersichererCode("ABC_Insurance_S_A", "10009274");
        $VALUES.add(ABC_Insurance_S_A);
        Caisse_R_gionale_d_Assurances_Mutuelles_Agricoles_d_Oc = new VersichererCode("Caisse_R_gionale_d_Assurances_Mutuelles_Agricoles_d_Oc", "10009275");
        $VALUES.add(Caisse_R_gionale_d_Assurances_Mutuelles_Agricoles_d_Oc);
        Compensa_Towarzystwo_Ubezpieczen_S_A_Vienna_Insurance_Group = new VersichererCode("Compensa_Towarzystwo_Ubezpieczen_S_A_Vienna_Insurance_Group", "10009277");
        $VALUES.add(Compensa_Towarzystwo_Ubezpieczen_S_A_Vienna_Insurance_Group);
        LV_1871_Pensionsfonds_AG = new VersichererCode("LV_1871_Pensionsfonds_AG", "10009905");
        $VALUES.add(LV_1871_Pensionsfonds_AG);
        APK_Pensionskasse_AG = new VersichererCode("APK_Pensionskasse_AG", "10009907");
        $VALUES.add(APK_Pensionskasse_AG);
        Swiss_Life_International_Pension_Fund_a_s_b_l = new VersichererCode("Swiss_Life_International_Pension_Fund_a_s_b_l", "10009917");
        $VALUES.add(Swiss_Life_International_Pension_Fund_a_s_b_l);
        W_rttembergische_Versicherung_Aktiengesellschaft = new VersichererCode("W_rttembergische_Versicherung_Aktiengesellschaft", "40001359");
        $VALUES.add(W_rttembergische_Versicherung_Aktiengesellschaft);
        W_rttembergische_Lebensversicherung_Aktiengesellschaft = new VersichererCode("W_rttembergische_Lebensversicherung_Aktiengesellschaft", "40001432");
        $VALUES.add(W_rttembergische_Lebensversicherung_Aktiengesellschaft);
        Deutsche_rzteversicherung_Aktiengesellschaft = new VersichererCode("Deutsche_rzteversicherung_Aktiengesellschaft", "40001444");
        $VALUES.add(Deutsche_rzteversicherung_Aktiengesellschaft);
        Generali_Deutschland_AG = new VersichererCode("Generali_Deutschland_AG", "40001447");
        $VALUES.add(Generali_Deutschland_AG);
        Hannover_R_ck_SE = new VersichererCode("Hannover_R_ck_SE", "40001452");
        $VALUES.add(Hannover_R_ck_SE);
        Generali_Deutschland_Versicherung_AG = new VersichererCode("Generali_Deutschland_Versicherung_AG", "40001454");
        $VALUES.add(Generali_Deutschland_Versicherung_AG);
        Athora_Lebensversicherung_Aktiengesellschaft = new VersichererCode("Athora_Lebensversicherung_Aktiengesellschaft", "40001460");
        $VALUES.add(Athora_Lebensversicherung_Aktiengesellschaft);
        M_nchener_R_ckversicherungs_Gesellschaft_Aktiengesellschaft_in_M_nchen = new VersichererCode("M_nchener_R_ckversicherungs_Gesellschaft_Aktiengesellschaft_in_M_nchen", "40001467");
        $VALUES.add(M_nchener_R_ckversicherungs_Gesellschaft_Aktiengesellschaft_in_M_nchen);
        ERGO_Versicherung_Aktiengesellschaft_2 = new VersichererCode("ERGO_Versicherung_Aktiengesellschaft_2", "40001476");
        $VALUES.add(ERGO_Versicherung_Aktiengesellschaft_2);
        Allianz_Lebensversicherungs_Aktiengesellschaft = new VersichererCode("Allianz_Lebensversicherungs_Aktiengesellschaft", "40001482");
        $VALUES.add(Allianz_Lebensversicherungs_Aktiengesellschaft);
        Real_Garant_Versicherung_Aktiengesellschaft = new VersichererCode("Real_Garant_Versicherung_Aktiengesellschaft", "40001623");
        $VALUES.add(Real_Garant_Versicherung_Aktiengesellschaft);
        W_stenrot_W_rttembergische_AG = new VersichererCode("W_stenrot_W_rttembergische_AG", "40001864");
        $VALUES.add(W_stenrot_W_rttembergische_AG);
        Generali_Deutschland_Lebensversicherung_AG = new VersichererCode("Generali_Deutschland_Lebensversicherung_AG", "40001884");
        $VALUES.add(Generali_Deutschland_Lebensversicherung_AG);
        Proxalto_Lebensversicherung_Aktiengesellschaft_c_o_Viridium_Group_GmbH_Co_KG = new VersichererCode("Proxalto_Lebensversicherung_Aktiengesellschaft_c_o_Viridium_Group_GmbH_Co_KG", "50006559");
        $VALUES.add(Proxalto_Lebensversicherung_Aktiengesellschaft_c_o_Viridium_Group_GmbH_Co_KG);
        Versicherungskammer_Bayern_Versicherungsanstalt_des_ffentlichen_Rechts = new VersichererCode("Versicherungskammer_Bayern_Versicherungsanstalt_des_ffentlichen_Rechts", "50008653");
        $VALUES.add(Versicherungskammer_Bayern_Versicherungsanstalt_des_ffentlichen_Rechts);
        Bayerische_Hausbesitzer_Versicherungs_Gesellschaft_a_G = new VersichererCode("Bayerische_Hausbesitzer_Versicherungs_Gesellschaft_a_G", "50010906");
        $VALUES.add(Bayerische_Hausbesitzer_Versicherungs_Gesellschaft_a_G);
        N_RNBERGER_Lebensversicherung_Aktiengesellschaft = new VersichererCode("N_RNBERGER_Lebensversicherung_Aktiengesellschaft", "50016049");
        $VALUES.add(N_RNBERGER_Lebensversicherung_Aktiengesellschaft);
        SIGNAL_IDUNA_Lebensversicherung_a_G = new VersichererCode("SIGNAL_IDUNA_Lebensversicherung_a_G", "50016072");
        $VALUES.add(SIGNAL_IDUNA_Lebensversicherung_a_G);
        InterRisk_Lebensversicherungs_AG_Vienna_Insurance_Group = new VersichererCode("InterRisk_Lebensversicherungs_AG_Vienna_Insurance_Group", "50016098");
        $VALUES.add(InterRisk_Lebensversicherungs_AG_Vienna_Insurance_Group);
        V_V_R_ckversicherung_K_R = new VersichererCode("V_V_R_ckversicherung_K_R", "50016133");
        $VALUES.add(V_V_R_ckversicherung_K_R);
        Pensionskasse_der_Mitarbeiter_der_Hoechst_Gruppe_VVaG = new VersichererCode("Pensionskasse_der_Mitarbeiter_der_Hoechst_Gruppe_VVaG", "50016183");
        $VALUES.add(Pensionskasse_der_Mitarbeiter_der_Hoechst_Gruppe_VVaG);
        Pensionskasse_Deutscher_Eisenbahnen_und_Stra_enbahnen_VVaG = new VersichererCode("Pensionskasse_Deutscher_Eisenbahnen_und_Stra_enbahnen_VVaG", "50016248");
        $VALUES.add(Pensionskasse_Deutscher_Eisenbahnen_und_Stra_enbahnen_VVaG);
        Allianz_Private_Krankenversicherungs_Aktiengesellschaft = new VersichererCode("Allianz_Private_Krankenversicherungs_Aktiengesellschaft", "50016274");
        $VALUES.add(Allianz_Private_Krankenversicherungs_Aktiengesellschaft);
        Generali_Deutschland_Krankenversicherung_AG = new VersichererCode("Generali_Deutschland_Krankenversicherung_AG", "50016298");
        $VALUES.add(Generali_Deutschland_Krankenversicherung_AG);
        DKV_Deutsche_Krankenversicherung_Aktiengesellschaft = new VersichererCode("DKV_Deutsche_Krankenversicherung_Aktiengesellschaft", "50016299");
        $VALUES.add(DKV_Deutsche_Krankenversicherung_Aktiengesellschaft);
        Gothaer_Krankenversicherung_Aktiengesellschaft = new VersichererCode("Gothaer_Krankenversicherung_Aktiengesellschaft", "50016303");
        $VALUES.add(Gothaer_Krankenversicherung_Aktiengesellschaft);
        Debeka_Krankenversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein = new VersichererCode("Debeka_Krankenversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein", "50016310");
        $VALUES.add(Debeka_Krankenversicherungsverein_auf_Gegenseitigkeit_Sitz_Koblenz_am_Rhein);
        Allianz_Versicherungs_Aktiengesellschaft = new VersichererCode("Allianz_Versicherungs_Aktiengesellschaft", "50016337");
        $VALUES.add(Allianz_Versicherungs_Aktiengesellschaft);
        HUK_COBURG_Haftpflicht_Unterst_tzungs_Kasse_kraftfahrender_Beamter_Deutschlands_a_G_in_Coburg = new VersichererCode("HUK_COBURG_Haftpflicht_Unterst_tzungs_Kasse_kraftfahrender_Beamter_Deutschlands_a_G_in_Coburg", "50016348");
        $VALUES.add(HUK_COBURG_Haftpflicht_Unterst_tzungs_Kasse_kraftfahrender_Beamter_Deutschlands_a_G_in_Coburg);
        Hamburger_Feuerkasse_Versicherungs_Aktiengesellschaft = new VersichererCode("Hamburger_Feuerkasse_Versicherungs_Aktiengesellschaft", "50016375");
        $VALUES.add(Hamburger_Feuerkasse_Versicherungs_Aktiengesellschaft);
        ERGO_Lebensversicherung_Aktiengesellschaft = new VersichererCode("ERGO_Lebensversicherung_Aktiengesellschaft", "50016397");
        $VALUES.add(ERGO_Lebensversicherung_Aktiengesellschaft);
        Mecklenburgische_Versicherungs_Gesellschaft_auf_Gegenseitigkeit = new VersichererCode("Mecklenburgische_Versicherungs_Gesellschaft_auf_Gegenseitigkeit", "50016447");
        $VALUES.add(Mecklenburgische_Versicherungs_Gesellschaft_auf_Gegenseitigkeit);
        RheinLand_Versicherungs_Aktiengesellschaft = new VersichererCode("RheinLand_Versicherungs_Aktiengesellschaft", "50016460");
        $VALUES.add(RheinLand_Versicherungs_Aktiengesellschaft);
        SIGNAL_IDUNA_Unfallversicherung_a_G = new VersichererCode("SIGNAL_IDUNA_Unfallversicherung_a_G", "50016469");
        $VALUES.add(SIGNAL_IDUNA_Unfallversicherung_a_G);
        Provinzial_Holding_Aktiengesellschaft = new VersichererCode("Provinzial_Holding_Aktiengesellschaft", "50016471");
        $VALUES.add(Provinzial_Holding_Aktiengesellschaft);
        S_DirektVersicherung_Aktiengesellschaft = new VersichererCode("S_DirektVersicherung_Aktiengesellschaft", "50017211");
        $VALUES.add(S_DirektVersicherung_Aktiengesellschaft);
        HDI_Pensionsfonds_Aktiengesellschaft = new VersichererCode("HDI_Pensionsfonds_Aktiengesellschaft", "50019583");
        $VALUES.add(HDI_Pensionsfonds_Aktiengesellschaft);
        Allianz_Pensionskasse_Aktiengesellschaft = new VersichererCode("Allianz_Pensionskasse_Aktiengesellschaft", "50020998");
        $VALUES.add(Allianz_Pensionskasse_Aktiengesellschaft);
        Frankfurter_Pensionskasse_AG = new VersichererCode("Frankfurter_Pensionskasse_AG", "50021001");
        $VALUES.add(Frankfurter_Pensionskasse_AG);
        Sparkassen_Pensionsfonds_AG = new VersichererCode("Sparkassen_Pensionsfonds_AG", "50021043");
        $VALUES.add(Sparkassen_Pensionsfonds_AG);
        Continentale_Krankenversicherung_a_G = new VersichererCode("Continentale_Krankenversicherung_a_G", "50023240");
        $VALUES.add(Continentale_Krankenversicherung_a_G);
        HUK_COBURG_Holding_AG = new VersichererCode("HUK_COBURG_Holding_AG", "50025114");
        $VALUES.add(HUK_COBURG_Holding_AG);
        EXTREMUS_Versicherungs_Aktiengesellschaft = new VersichererCode("EXTREMUS_Versicherungs_Aktiengesellschaft", "50026342");
        $VALUES.add(EXTREMUS_Versicherungs_Aktiengesellschaft);
        DEVK_Pensionsfonds_Aktiengesellschaft = new VersichererCode("DEVK_Pensionsfonds_Aktiengesellschaft", "50026368");
        $VALUES.add(DEVK_Pensionsfonds_Aktiengesellschaft);
        ALTE_OLDENBURGER_Krankenversicherung_AG = new VersichererCode("ALTE_OLDENBURGER_Krankenversicherung_AG", "50069877");
        $VALUES.add(ALTE_OLDENBURGER_Krankenversicherung_AG);
        KUKE_S_A = new VersichererCode("KUKE_S_A", "50077148");
        $VALUES.add(KUKE_S_A);
        TVM_verzekeringen_N_V = new VersichererCode("TVM_verzekeringen_N_V", "50077153");
        $VALUES.add(TVM_verzekeringen_N_V);
        ERGO_Insurance_NV = new VersichererCode("ERGO_Insurance_NV", "50077155");
        $VALUES.add(ERGO_Insurance_NV);
        Lifestyle_Protection_Lebensversicherung_AG = new VersichererCode("Lifestyle_Protection_Lebensversicherung_AG", "50077201");
        $VALUES.add(Lifestyle_Protection_Lebensversicherung_AG);
        Lifestyle_Protection_AG = new VersichererCode("Lifestyle_Protection_AG", "50077208");
        $VALUES.add(Lifestyle_Protection_AG);
        N_V_EUROMEX = new VersichererCode("N_V_EUROMEX", "50077243");
        $VALUES.add(N_V_EUROMEX);
        Alm_Brand_Forsikring_A_S = new VersichererCode("Alm_Brand_Forsikring_A_S", "50077263");
        $VALUES.add(Alm_Brand_Forsikring_A_S);
        Solunion_Seguros_de_Credito_Compania_Internacional_de_Seguros_y_Reaseguros_S_A = new VersichererCode("Solunion_Seguros_de_Credito_Compania_Internacional_de_Seguros_y_Reaseguros_S_A", "50077279");
        $VALUES.add(Solunion_Seguros_de_Credito_Compania_Internacional_de_Seguros_y_Reaseguros_S_A);
        RIVERSTONE_INSURANCE_MALTA_SE = new VersichererCode("RIVERSTONE_INSURANCE_MALTA_SE", "50077281");
        $VALUES.add(RIVERSTONE_INSURANCE_MALTA_SE);
        Pan_Insurance_dac = new VersichererCode("Pan_Insurance_dac", "50077299");
        $VALUES.add(Pan_Insurance_dac);
        Arch_Insurance_EU_Designated_Activity_Company = new VersichererCode("Arch_Insurance_EU_Designated_Activity_Company", "50077301");
        $VALUES.add(Arch_Insurance_EU_Designated_Activity_Company);
        DAS_Nederlandse_Rechtsbijstand_Verzekeringmaatschappij_NV = new VersichererCode("DAS_Nederlandse_Rechtsbijstand_Verzekeringmaatschappij_NV", "50077320");
        $VALUES.add(DAS_Nederlandse_Rechtsbijstand_Verzekeringmaatschappij_NV);
        OOM_Schadeverzekering_N_V = new VersichererCode("OOM_Schadeverzekering_N_V", "50077321");
        $VALUES.add(OOM_Schadeverzekering_N_V);
        Notarversicherungsverein_a_G = new VersichererCode("Notarversicherungsverein_a_G", "50077378");
        $VALUES.add(Notarversicherungsverein_a_G);
        Generali_Espa_a_de_Seguros_y_Reaseguros_S_A = new VersichererCode("Generali_Espa_a_de_Seguros_y_Reaseguros_S_A", "50077402");
        $VALUES.add(Generali_Espa_a_de_Seguros_y_Reaseguros_S_A);
        Axa_Seguros_Generales_S_A_de_Seguros_y_Reaseguros = new VersichererCode("Axa_Seguros_Generales_S_A_de_Seguros_y_Reaseguros", "50077410");
        $VALUES.add(Axa_Seguros_Generales_S_A_de_Seguros_y_Reaseguros);
        Steadfast_Insurance_Partners_Limited = new VersichererCode("Steadfast_Insurance_Partners_Limited", "50077447");
        $VALUES.add(Steadfast_Insurance_Partners_Limited);
        CNP_Santander_Insurance_Europe_Designated_Activity_Company = new VersichererCode("CNP_Santander_Insurance_Europe_Designated_Activity_Company", "50077448");
        $VALUES.add(CNP_Santander_Insurance_Europe_Designated_Activity_Company);
        CNP_Santander_Insurance_Life_Designated_Activity_Company = new VersichererCode("CNP_Santander_Insurance_Life_Designated_Activity_Company", "50077540");
        $VALUES.add(CNP_Santander_Insurance_Life_Designated_Activity_Company);
        Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_S_A_COFACE_Niederlassung_in_Deutschland = new VersichererCode("Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_S_A_COFACE_Niederlassung_in_Deutschland", "50077572");
        $VALUES.add(Compagnie_Francaise_d_Assurance_pour_le_Commerce_Ext_rieur_S_A_COFACE_Niederlassung_in_Deutschland);
        WERTGARANTIE_SE = new VersichererCode("WERTGARANTIE_SE", "50077586");
        $VALUES.add(WERTGARANTIE_SE);
        MetLife_Europe_dac = new VersichererCode("MetLife_Europe_dac", "50077605");
        $VALUES.add(MetLife_Europe_dac);
        Generali_Zycie_Towarzystwo_Ubezpieczen_S_A = new VersichererCode("Generali_Zycie_Towarzystwo_Ubezpieczen_S_A", "50077612");
        $VALUES.add(Generali_Zycie_Towarzystwo_Ubezpieczen_S_A);
        ONIX_Asigurari_S_A = new VersichererCode("ONIX_Asigurari_S_A", "50077631");
        $VALUES.add(ONIX_Asigurari_S_A);
        AEGIDIUS_SE = new VersichererCode("AEGIDIUS_SE", "50077680");
        $VALUES.add(AEGIDIUS_SE);
        Volkswagen_Insurance_Company_dac = new VersichererCode("Volkswagen_Insurance_Company_dac", "50077851");
        $VALUES.add(Volkswagen_Insurance_Company_dac);
        Lucura_Versicherungs_AG = new VersichererCode("Lucura_Versicherungs_AG", "50077867");
        $VALUES.add(Lucura_Versicherungs_AG);
        Groupama_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g = new VersichererCode("Groupama_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g", "50077877");
        $VALUES.add(Groupama_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g);
        WTW_Pensionsfonds_AG = new VersichererCode("WTW_Pensionsfonds_AG", "50077922");
        $VALUES.add(WTW_Pensionsfonds_AG);
        Allianz_Global_Life_Designated_Activity_Company = new VersichererCode("Allianz_Global_Life_Designated_Activity_Company", "50077946");
        $VALUES.add(Allianz_Global_Life_Designated_Activity_Company);
        Sociedad_de_Seguros_Mutuos_Mar_timos_De_Vigo_Mutualidad_de_Seguros_Y_Reaseguros_A_Prima_Fija = new VersichererCode("Sociedad_de_Seguros_Mutuos_Mar_timos_De_Vigo_Mutualidad_de_Seguros_Y_Reaseguros_A_Prima_Fija", "50077958");
        $VALUES.add(Sociedad_de_Seguros_Mutuos_Mar_timos_De_Vigo_Mutualidad_de_Seguros_Y_Reaseguros_A_Prima_Fija);
        UNIQA_sterreich_Versicherungen_AG_Wien = new VersichererCode("UNIQA_sterreich_Versicherungen_AG_Wien", "50077959");
        $VALUES.add(UNIQA_sterreich_Versicherungen_AG_Wien);
        Volkswagen_Autoversicherung_AG = new VersichererCode("Volkswagen_Autoversicherung_AG", "50077981");
        $VALUES.add(Volkswagen_Autoversicherung_AG);
        Nordisk_Marinf_rs_kring_AB = new VersichererCode("Nordisk_Marinf_rs_kring_AB", "50078113");
        $VALUES.add(Nordisk_Marinf_rs_kring_AB);
        DELA_Natura_en_levensverzekeringen_N_V = new VersichererCode("DELA_Natura_en_levensverzekeringen_N_V", "50078244");
        $VALUES.add(DELA_Natura_en_levensverzekeringen_N_V);
        CROATIA_osiguranje_d_d = new VersichererCode("CROATIA_osiguranje_d_d", "50078306");
        $VALUES.add(CROATIA_osiguranje_d_d);
        Generali_Osiguranje_d_d = new VersichererCode("Generali_Osiguranje_d_d", "50078307");
        $VALUES.add(Generali_Osiguranje_d_d);
        Allianz_Vie_S_A = new VersichererCode("Allianz_Vie_S_A", "50078314");
        $VALUES.add(Allianz_Vie_S_A);
        MetLife_Europe_Insurance_dac = new VersichererCode("MetLife_Europe_Insurance_dac", "50078360");
        $VALUES.add(MetLife_Europe_Insurance_dac);
        Accredited_Insurance_Europe_Limited = new VersichererCode("Accredited_Insurance_Europe_Limited", "50078368");
        $VALUES.add(Accredited_Insurance_Europe_Limited);
        BD24_Berlin_Direkt_Versicherung_AG = new VersichererCode("BD24_Berlin_Direkt_Versicherung_AG", "50078370");
        $VALUES.add(BD24_Berlin_Direkt_Versicherung_AG);
        Inser_AG = new VersichererCode("Inser_AG", "50078386");
        $VALUES.add(Inser_AG);
        VERKA_PK_Kirchliche_Pensionskasse_AG = new VersichererCode("VERKA_PK_Kirchliche_Pensionskasse_AG", "50078428");
        $VALUES.add(VERKA_PK_Kirchliche_Pensionskasse_AG);
        Stonefort_Insurance_S_A = new VersichererCode("Stonefort_Insurance_S_A", "50078456");
        $VALUES.add(Stonefort_Insurance_S_A);
        iptiQ_Life_S_A_Niederlassung_Deutschland = new VersichererCode("iptiQ_Life_S_A_Niederlassung_Deutschland", "50078648");
        $VALUES.add(iptiQ_Life_S_A_Niederlassung_Deutschland);
        Euler_Hermes_Deutschland_Niederlassung_der_Euler_Hermes_SA = new VersichererCode("Euler_Hermes_Deutschland_Niederlassung_der_Euler_Hermes_SA", "50078667");
        $VALUES.add(Euler_Hermes_Deutschland_Niederlassung_der_Euler_Hermes_SA);
        AFI_ESCA_Luxembourg_S_A = new VersichererCode("AFI_ESCA_Luxembourg_S_A", "50078684");
        $VALUES.add(AFI_ESCA_Luxembourg_S_A);
        AWP_Health_Life_SA = new VersichererCode("AWP_Health_Life_SA", "50078729");
        $VALUES.add(AWP_Health_Life_SA);
        Metzler_Pensionsfonds_AG = new VersichererCode("Metzler_Pensionsfonds_AG", "50078778");
        $VALUES.add(Metzler_Pensionsfonds_AG);
        Bulstrad_Life_Vienna_Insurance_Group_JSC = new VersichererCode("Bulstrad_Life_Vienna_Insurance_Group_JSC", "50078869");
        $VALUES.add(Bulstrad_Life_Vienna_Insurance_Group_JSC);
        Arkema_Insurance_dac = new VersichererCode("Arkema_Insurance_dac", "50078898");
        $VALUES.add(Arkema_Insurance_dac);
        Greenval_Insurance_dac = new VersichererCode("Greenval_Insurance_dac", "50078954");
        $VALUES.add(Greenval_Insurance_dac);
        CHUBB_Life_Europe_SE = new VersichererCode("CHUBB_Life_Europe_SE", "50078956");
        $VALUES.add(CHUBB_Life_Europe_SE);
        SOGESSUR_S_A_Deutsche_Niederlassung = new VersichererCode("SOGESSUR_S_A_Deutsche_Niederlassung", "50078968");
        $VALUES.add(SOGESSUR_S_A_Deutsche_Niederlassung);
        HSBC_Life_Assurance_Malta_Limited = new VersichererCode("HSBC_Life_Assurance_Malta_Limited", "50079040");
        $VALUES.add(HSBC_Life_Assurance_Malta_Limited);
        QIC_Europe_Ltd = new VersichererCode("QIC_Europe_Ltd", "50079048");
        $VALUES.add(QIC_Europe_Ltd);
        HDI_Global_Specialty_SE = new VersichererCode("HDI_Global_Specialty_SE", "50079066");
        $VALUES.add(HDI_Global_Specialty_SE);
        AXA_Life_Europe_Designated_Activity_Company = new VersichererCode("AXA_Life_Europe_Designated_Activity_Company", "50079120");
        $VALUES.add(AXA_Life_Europe_Designated_Activity_Company);
        Gard_Marine_Energy_Insurance_Europe_AS = new VersichererCode("Gard_Marine_Energy_Insurance_Europe_AS", "50079123");
        $VALUES.add(Gard_Marine_Energy_Insurance_Europe_AS);
        Wiener_osiguranje_Vienna_Insurance_Group_d_d = new VersichererCode("Wiener_osiguranje_Vienna_Insurance_Group_d_d", "50079156");
        $VALUES.add(Wiener_osiguranje_Vienna_Insurance_Group_d_d);
        Achmea_Pensioen_en_Levensverzekeringen_N_V = new VersichererCode("Achmea_Pensioen_en_Levensverzekeringen_N_V", "50079210");
        $VALUES.add(Achmea_Pensioen_en_Levensverzekeringen_N_V);
        Holmia_Livf_rs_kring_AB = new VersichererCode("Holmia_Livf_rs_kring_AB", "50079211");
        $VALUES.add(Holmia_Livf_rs_kring_AB);
        RiverStone_International_Ireland_DAC = new VersichererCode("RiverStone_International_Ireland_DAC", "50079311");
        $VALUES.add(RiverStone_International_Ireland_DAC);
        Triglav_Osiguranje_d_d = new VersichererCode("Triglav_Osiguranje_d_d", "50079357");
        $VALUES.add(Triglav_Osiguranje_d_d);
        Nautilus_Indemnity_Europe_dac = new VersichererCode("Nautilus_Indemnity_Europe_dac", "50079358");
        $VALUES.add(Nautilus_Indemnity_Europe_dac);
        MMA_IARD_SA = new VersichererCode("MMA_IARD_SA", "50079383");
        $VALUES.add(MMA_IARD_SA);
        MSIG_Europe_SE = new VersichererCode("MSIG_Europe_SE", "50079556");
        $VALUES.add(MSIG_Europe_SE);
        enovetic_pension_fund_assep = new VersichererCode("enovetic_pension_fund_assep", "50079573");
        $VALUES.add(enovetic_pension_fund_assep);
        Groupama_Gan_Vie_S_A = new VersichererCode("Groupama_Gan_Vie_S_A", "50079584");
        $VALUES.add(Groupama_Gan_Vie_S_A);
        Vital_Blue_Insurance_dac = new VersichererCode("Vital_Blue_Insurance_dac", "50079585");
        $VALUES.add(Vital_Blue_Insurance_dac);
        Fonds_de_Garantie_Voyages_AAM = new VersichererCode("Fonds_de_Garantie_Voyages_AAM", "50079586");
        $VALUES.add(Fonds_de_Garantie_Voyages_AAM);
        ITAS_Instituto_Trentino_Alto_Adige_per_Assicurazioni_Societ_Mutua_di_Assicurazioni = new VersichererCode("ITAS_Instituto_Trentino_Alto_Adige_per_Assicurazioni_Societ_Mutua_di_Assicurazioni", "50079763");
        $VALUES.add(ITAS_Instituto_Trentino_Alto_Adige_per_Assicurazioni_Societ_Mutua_di_Assicurazioni);
        W_R_Berkley_Europe_AG_Niederlassung_f_r_Deutschland = new VersichererCode("W_R_Berkley_Europe_AG_Niederlassung_f_r_Deutschland", "50079769");
        $VALUES.add(W_R_Berkley_Europe_AG_Niederlassung_f_r_Deutschland);
        Generali_Zavarovalnica_d_d = new VersichererCode("Generali_Zavarovalnica_d_d", "50079787");
        $VALUES.add(Generali_Zavarovalnica_d_d);
        Mercedes_Benz_Versicherung_AG = new VersichererCode("Mercedes_Benz_Versicherung_AG", "50079798");
        $VALUES.add(Mercedes_Benz_Versicherung_AG);
        STELLANTIS_INSURANCE_EUROPE_LIMITED = new VersichererCode("STELLANTIS_INSURANCE_EUROPE_LIMITED", "50079841");
        $VALUES.add(STELLANTIS_INSURANCE_EUROPE_LIMITED);
        STELLANTIS_LIFE_INSURANCE_EUROPE_LIMITED = new VersichererCode("STELLANTIS_LIFE_INSURANCE_EUROPE_LIMITED", "50079842");
        $VALUES.add(STELLANTIS_LIFE_INSURANCE_EUROPE_LIMITED);
        OWM_Zorgverzekeraar_Zorg_en_Zekerheid_U_A = new VersichererCode("OWM_Zorgverzekeraar_Zorg_en_Zekerheid_U_A", "50079862");
        $VALUES.add(OWM_Zorgverzekeraar_Zorg_en_Zekerheid_U_A);
        N_V_Univ_Zorg = new VersichererCode("N_V_Univ_Zorg", "50079875");
        $VALUES.add(N_V_Univ_Zorg);
        VGZ_Zorgverzekeraar_N_V = new VersichererCode("VGZ_Zorgverzekeraar_N_V", "50079876");
        $VALUES.add(VGZ_Zorgverzekeraar_N_V);
        IZA_Zorgverzekeraar_N_V = new VersichererCode("IZA_Zorgverzekeraar_N_V", "50079877");
        $VALUES.add(IZA_Zorgverzekeraar_N_V);
        N_V_Zorgverzekeraar_UMC = new VersichererCode("N_V_Zorgverzekeraar_UMC", "50079880");
        $VALUES.add(N_V_Zorgverzekeraar_UMC);
        Interpolis_Zorgverzekeringen_N_V = new VersichererCode("Interpolis_Zorgverzekeringen_N_V", "50079921");
        $VALUES.add(Interpolis_Zorgverzekeringen_N_V);
        Achmea_Zorgverzekeringen_N_V = new VersichererCode("Achmea_Zorgverzekeringen_N_V", "50079922");
        $VALUES.add(Achmea_Zorgverzekeringen_N_V);
        Zilveren_Kruis_Zorgverzekeringen_N_V = new VersichererCode("Zilveren_Kruis_Zorgverzekeringen_N_V", "50079926");
        $VALUES.add(Zilveren_Kruis_Zorgverzekeringen_N_V);
        PRUDENTIA_Pensionskasse_AG = new VersichererCode("PRUDENTIA_Pensionskasse_AG", "50079971");
        $VALUES.add(PRUDENTIA_Pensionskasse_AG);
        CNP_Luxembourg_S_A = new VersichererCode("CNP_Luxembourg_S_A", "50079972");
        $VALUES.add(CNP_Luxembourg_S_A);
        De_Friesland_Zorgverzekeraar_N_V = new VersichererCode("De_Friesland_Zorgverzekeraar_N_V", "50079985");
        $VALUES.add(De_Friesland_Zorgverzekeraar_N_V);
        FBTO_Zorgverzekeringen_N_V = new VersichererCode("FBTO_Zorgverzekeringen_N_V", "50079987");
        $VALUES.add(FBTO_Zorgverzekeringen_N_V);
        Anderzorg_N_V = new VersichererCode("Anderzorg_N_V", "50079995");
        $VALUES.add(Anderzorg_N_V);
        Centrale_Zorgverzekeringen_NZV_N_V = new VersichererCode("Centrale_Zorgverzekeringen_NZV_N_V", "50079997");
        $VALUES.add(Centrale_Zorgverzekeringen_NZV_N_V);
        Onderlinge_Waarborgmaatschappij_DSW_Zorgverzekeraar_U_A = new VersichererCode("Onderlinge_Waarborgmaatschappij_DSW_Zorgverzekeraar_U_A", "50080000");
        $VALUES.add(Onderlinge_Waarborgmaatschappij_DSW_Zorgverzekeraar_U_A);
        DSW_Ziektekostenverzekeringen_N_V = new VersichererCode("DSW_Ziektekostenverzekeringen_N_V", "50080001");
        $VALUES.add(DSW_Ziektekostenverzekeringen_N_V);
        Menzis_N_V = new VersichererCode("Menzis_N_V", "50080002");
        $VALUES.add(Menzis_N_V);
        Menzis_Zorgverzekeraar_N_V = new VersichererCode("Menzis_Zorgverzekeraar_N_V", "50080003");
        $VALUES.add(Menzis_Zorgverzekeraar_N_V);
        OHRA_Zorgverzekeringen_N_V = new VersichererCode("OHRA_Zorgverzekeringen_N_V", "50080004");
        $VALUES.add(OHRA_Zorgverzekeringen_N_V);
        Onderlinge_Waarborgmaatschappij_CZ_groep_U_A = new VersichererCode("Onderlinge_Waarborgmaatschappij_CZ_groep_U_A", "50080005");
        $VALUES.add(Onderlinge_Waarborgmaatschappij_CZ_groep_U_A);
        Stad_Holland_Zorgverzekeraar_Onderlinge_Waarborgmaatschappij_U_A = new VersichererCode("Stad_Holland_Zorgverzekeraar_Onderlinge_Waarborgmaatschappij_U_A", "50080006");
        $VALUES.add(Stad_Holland_Zorgverzekeraar_Onderlinge_Waarborgmaatschappij_U_A);
        Colonnade_Insurance_S_A = new VersichererCode("Colonnade_Insurance_S_A", "50080041");
        $VALUES.add(Colonnade_Insurance_S_A);
        ASR_Aanvullende_Ziektekostenverzekeringen_N_V = new VersichererCode("ASR_Aanvullende_Ziektekostenverzekeringen_N_V", "50080218");
        $VALUES.add(ASR_Aanvullende_Ziektekostenverzekeringen_N_V);
        ASR_Basis_Ziektekostenverzekeringen_N_V = new VersichererCode("ASR_Basis_Ziektekostenverzekeringen_N_V", "50080219");
        $VALUES.add(ASR_Basis_Ziektekostenverzekeringen_N_V);
        ADB_Compensa_Vienna_Insurance_Group = new VersichererCode("ADB_Compensa_Vienna_Insurance_Group", "50080280");
        $VALUES.add(ADB_Compensa_Vienna_Insurance_Group);
        Salland_Zorgverzekeraar_N_V = new VersichererCode("Salland_Zorgverzekeraar_N_V", "50080281");
        $VALUES.add(Salland_Zorgverzekeraar_N_V);
        Salland_Aanvullende_Verzekeringen_N_V = new VersichererCode("Salland_Aanvullende_Verzekeringen_N_V", "50080282");
        $VALUES.add(Salland_Aanvullende_Verzekeringen_N_V);
        MAPFRE_Espa_a_Compa_ia_de_Seguros_y_Reaseguros_S_A = new VersichererCode("MAPFRE_Espa_a_Compa_ia_de_Seguros_y_Reaseguros_S_A", "50080283");
        $VALUES.add(MAPFRE_Espa_a_Compa_ia_de_Seguros_y_Reaseguros_S_A);
        KLPP_Insurance_Reinsurance_Company_Limited = new VersichererCode("KLPP_Insurance_Reinsurance_Company_Limited", "50080318");
        $VALUES.add(KLPP_Insurance_Reinsurance_Company_Limited);
        CDA_40_ZAVAROVALNICA_D_D_v_likvidaciji = new VersichererCode("CDA_40_ZAVAROVALNICA_D_D_v_likvidaciji", "50080440");
        $VALUES.add(CDA_40_ZAVAROVALNICA_D_D_v_likvidaciji);
        Wakam = new VersichererCode("Wakam", "50080497");
        $VALUES.add(Wakam);
        Hillwood_Limited = new VersichererCode("Hillwood_Limited", "50080520");
        $VALUES.add(Hillwood_Limited);
        CNP_CAUTION = new VersichererCode("CNP_CAUTION", "50080527");
        $VALUES.add(CNP_CAUTION);
        Insurance_JSC_DallBogg_Life_and_Health_AD = new VersichererCode("Insurance_JSC_DallBogg_Life_and_Health_AD", "50080619");
        $VALUES.add(Insurance_JSC_DallBogg_Life_and_Health_AD);
        MBDA_Insurance_dac = new VersichererCode("MBDA_Insurance_dac", "50080650");
        $VALUES.add(MBDA_Insurance_dac);
        INTER_Krankenversicherung_AG = new VersichererCode("INTER_Krankenversicherung_AG", "50080780");
        $VALUES.add(INTER_Krankenversicherung_AG);
        M_NCHENER_VEREIN_Lebensversicherung_AG = new VersichererCode("M_NCHENER_VEREIN_Lebensversicherung_AG", "50080784");
        $VALUES.add(M_NCHENER_VEREIN_Lebensversicherung_AG);
        Atradius_Kreditversicherung_Niederlassung_der_Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros = new VersichererCode("Atradius_Kreditversicherung_Niederlassung_der_Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros", "50080787");
        $VALUES.add(Atradius_Kreditversicherung_Niederlassung_der_Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros);
        AXA_Wealth_Europe_S_A = new VersichererCode("AXA_Wealth_Europe_S_A", "50080795");
        $VALUES.add(AXA_Wealth_Europe_S_A);
        W_R_Berkley_Europe_AG = new VersichererCode("W_R_Berkley_Europe_AG", "50080823");
        $VALUES.add(W_R_Berkley_Europe_AG);
        Entis_Lebensversicherung_AG = new VersichererCode("Entis_Lebensversicherung_AG", "50080838");
        $VALUES.add(Entis_Lebensversicherung_AG);
        METRO_Re_AG = new VersichererCode("METRO_Re_AG", "50080857");
        $VALUES.add(METRO_Re_AG);
        Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros = new VersichererCode("Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros", "50080908");
        $VALUES.add(Atradius_Cr_dito_y_Cauci_n_S_A_de_Seguros_y_Reaseguros);
        Astra_Versicherung_AG = new VersichererCode("Astra_Versicherung_AG", "50080928");
        $VALUES.add(Astra_Versicherung_AG);
        INTER_Versicherungsverein_aG = new VersichererCode("INTER_Versicherungsverein_aG", "50080956");
        $VALUES.add(INTER_Versicherungsverein_aG);
        ICARE_Assurance = new VersichererCode("ICARE_Assurance", "50081003");
        $VALUES.add(ICARE_Assurance);
        Sofinsod_Insurance_dac = new VersichererCode("Sofinsod_Insurance_dac", "50081127");
        $VALUES.add(Sofinsod_Insurance_dac);
        Zavarovalnica_Sava_zavarovalna_dru_ba_d_d = new VersichererCode("Zavarovalnica_Sava_zavarovalna_dru_ba_d_d", "50081143");
        $VALUES.add(Zavarovalnica_Sava_zavarovalna_dru_ba_d_d);
        Vakuutusosakeyhti_Bothnia_international_Zweigniederlassung_Deutschland_c_o_Compre_Services_Germany_GmbH = new VersichererCode("Vakuutusosakeyhti_Bothnia_international_Zweigniederlassung_Deutschland_c_o_Compre_Services_Germany_GmbH", "50081197");
        $VALUES.add(Vakuutusosakeyhti_Bothnia_international_Zweigniederlassung_Deutschland_c_o_Compre_Services_Germany_GmbH);
        Alandia_F_rs_kring_Abp = new VersichererCode("Alandia_F_rs_kring_Abp", "50081306");
        $VALUES.add(Alandia_F_rs_kring_Abp);
        Great_Lakes_Insurance_SE = new VersichererCode("Great_Lakes_Insurance_SE", "50081354");
        $VALUES.add(Great_Lakes_Insurance_SE);
        Maiden_General_F_rs_krings_AB = new VersichererCode("Maiden_General_F_rs_krings_AB", "50081368");
        $VALUES.add(Maiden_General_F_rs_krings_AB);
        Race_Seguros_y_Reaseguros_S_A = new VersichererCode("Race_Seguros_y_Reaseguros_S_A", "50081475");
        $VALUES.add(Race_Seguros_y_Reaseguros_S_A);
        StarStone_Insurance_SE = new VersichererCode("StarStone_Insurance_SE", "50081495");
        $VALUES.add(StarStone_Insurance_SE);
        Oney_Life_PCC_Limited = new VersichererCode("Oney_Life_PCC_Limited", "50081608");
        $VALUES.add(Oney_Life_PCC_Limited);
        Oney_Insurance_PCC_Limited = new VersichererCode("Oney_Insurance_PCC_Limited", "50081609");
        $VALUES.add(Oney_Insurance_PCC_Limited);
        ACTA_Assurance_SA = new VersichererCode("ACTA_Assurance_SA", "50081651");
        $VALUES.add(ACTA_Assurance_SA);
        HAMBURGER_PENSIONSFONDS_Pensionsfondsverein_auf_Gegenseitigkeit = new VersichererCode("HAMBURGER_PENSIONSFONDS_Pensionsfondsverein_auf_Gegenseitigkeit", "50081652");
        $VALUES.add(HAMBURGER_PENSIONSFONDS_Pensionsfondsverein_auf_Gegenseitigkeit);
        Dortmunder_Lebensversicherung_AG = new VersichererCode("Dortmunder_Lebensversicherung_AG", "50081693");
        $VALUES.add(Dortmunder_Lebensversicherung_AG);
        FM_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("FM_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland", "50081791");
        $VALUES.add(FM_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland);
        Insurance_Company_Asset_Insurance_AD = new VersichererCode("Insurance_Company_Asset_Insurance_AD", "50081801");
        $VALUES.add(Insurance_Company_Asset_Insurance_AD);
        ottonova_Krankenversicherung_AG = new VersichererCode("ottonova_Krankenversicherung_AG", "50081819");
        $VALUES.add(ottonova_Krankenversicherung_AG);
        Munich_Re_PCC_Limited = new VersichererCode("Munich_Re_PCC_Limited", "50081825");
        $VALUES.add(Munich_Re_PCC_Limited);
        Relyens_Mutual_Insurance_Niederlassung_Deutschland = new VersichererCode("Relyens_Mutual_Insurance_Niederlassung_Deutschland", "50081848");
        $VALUES.add(Relyens_Mutual_Insurance_Niederlassung_Deutschland);
        Baloise_Assurances_Luxembourg_S_A = new VersichererCode("Baloise_Assurances_Luxembourg_S_A", "50081849");
        $VALUES.add(Baloise_Assurances_Luxembourg_S_A);
        ELEMENT_Insurance_AG = new VersichererCode("ELEMENT_Insurance_AG", "50081856");
        $VALUES.add(ELEMENT_Insurance_AG);
        Chaucer_Insurance_Company_Designated_Activity_Company = new VersichererCode("Chaucer_Insurance_Company_Designated_Activity_Company", "50081865");
        $VALUES.add(Chaucer_Insurance_Company_Designated_Activity_Company);
        GF_Forsikring_A_S = new VersichererCode("GF_Forsikring_A_S", "50081883");
        $VALUES.add(GF_Forsikring_A_S);
        Tryg_Deutschland_Niederlassung_der_Tryg_Forsikring_A_S = new VersichererCode("Tryg_Deutschland_Niederlassung_der_Tryg_Forsikring_A_S", "50081910");
        $VALUES.add(Tryg_Deutschland_Niederlassung_der_Tryg_Forsikring_A_S);
        Beazley_Insurance_dac = new VersichererCode("Beazley_Insurance_dac", "50081911");
        $VALUES.add(Beazley_Insurance_dac);
        Beazley_Insurance_dac_2 = new VersichererCode("Beazley_Insurance_dac_2", "50082105");
        $VALUES.add(Beazley_Insurance_dac_2);
        Generali_Rom_nia_Asigurare_Reasigurare_S_A = new VersichererCode("Generali_Rom_nia_Asigurare_Reasigurare_S_A", "50082109");
        $VALUES.add(Generali_Rom_nia_Asigurare_Reasigurare_S_A);
        UNIQA_Towarzystwo_Ubezpieczen_S_A = new VersichererCode("UNIQA_Towarzystwo_Ubezpieczen_S_A", "50082192");
        $VALUES.add(UNIQA_Towarzystwo_Ubezpieczen_S_A);
        CGPA_Europe_S_A = new VersichererCode("CGPA_Europe_S_A", "50082249");
        $VALUES.add(CGPA_Europe_S_A);
        Mercer_Pensionsfonds_AG = new VersichererCode("Mercer_Pensionsfonds_AG", "50082251");
        $VALUES.add(Mercer_Pensionsfonds_AG);
        DELA_Lebensversicherungen_Zweigniederlassung_der_DELA_Natura_en_levensverzekeringen_N_V_Eindhoven = new VersichererCode("DELA_Lebensversicherungen_Zweigniederlassung_der_DELA_Natura_en_levensverzekeringen_N_V_Eindhoven", "50082266");
        $VALUES.add(DELA_Lebensversicherungen_Zweigniederlassung_der_DELA_Natura_en_levensverzekeringen_N_V_Eindhoven);
        NN_Insurance_Belgium_SA = new VersichererCode("NN_Insurance_Belgium_SA", "50082309");
        $VALUES.add(NN_Insurance_Belgium_SA);
        ffentliche_Lebensversicherung_Sachsen_Anhalt = new VersichererCode("ffentliche_Lebensversicherung_Sachsen_Anhalt", "50082337");
        $VALUES.add(ffentliche_Lebensversicherung_Sachsen_Anhalt);
        ffentliche_Feuerversicherung_Sachsen_Anhalt = new VersichererCode("ffentliche_Feuerversicherung_Sachsen_Anhalt", "50082338");
        $VALUES.add(ffentliche_Feuerversicherung_Sachsen_Anhalt);
        Everest_Insurance_Ireland_dac = new VersichererCode("Everest_Insurance_Ireland_dac", "50082440");
        $VALUES.add(Everest_Insurance_Ireland_dac);
        DCC_Group_Insurances_Designated_Activity_Company = new VersichererCode("DCC_Group_Insurances_Designated_Activity_Company", "50082554");
        $VALUES.add(DCC_Group_Insurances_Designated_Activity_Company);
        FM_Insurance_Europe_S_A = new VersichererCode("FM_Insurance_Europe_S_A", "50082556");
        $VALUES.add(FM_Insurance_Europe_S_A);
        Bankia_Mapfre_Vida_Sociedad_An_nima_de_Seguros_y_Reaseguros = new VersichererCode("Bankia_Mapfre_Vida_Sociedad_An_nima_de_Seguros_y_Reaseguros", "50082607");
        $VALUES.add(Bankia_Mapfre_Vida_Sociedad_An_nima_de_Seguros_y_Reaseguros);
        VIA_Versicherung_AG = new VersichererCode("VIA_Versicherung_AG", "50082650");
        $VALUES.add(VIA_Versicherung_AG);
        AIG_Europe_S_A_Direktion_f_r_Deutschland = new VersichererCode("AIG_Europe_S_A_Direktion_f_r_Deutschland", "50082651");
        $VALUES.add(AIG_Europe_S_A_Direktion_f_r_Deutschland);
        Ambra_Versicherung_AG = new VersichererCode("Ambra_Versicherung_AG", "50082676");
        $VALUES.add(Ambra_Versicherung_AG);
        VIG_RE_zaji_ovna_a_s_Niederlassung_Deutschland = new VersichererCode("VIG_RE_zaji_ovna_a_s_Niederlassung_Deutschland", "50082726");
        $VALUES.add(VIG_RE_zaji_ovna_a_s_Niederlassung_Deutschland);
        Neodigital_Versicherung_AG = new VersichererCode("Neodigital_Versicherung_AG", "50082727");
        $VALUES.add(Neodigital_Versicherung_AG);
        UnitedHealthcare_Insurance_Designated_Activity_Company = new VersichererCode("UnitedHealthcare_Insurance_Designated_Activity_Company", "50082766");
        $VALUES.add(UnitedHealthcare_Insurance_Designated_Activity_Company);
        QBE_Europe_SA_NV_Direktion_f_r_Deutschland = new VersichererCode("QBE_Europe_SA_NV_Direktion_f_r_Deutschland", "50082871");
        $VALUES.add(QBE_Europe_SA_NV_Direktion_f_r_Deutschland);
        Fortegra_Europe_Insurance_Company_SE = new VersichererCode("Fortegra_Europe_Insurance_Company_SE", "50082945");
        $VALUES.add(Fortegra_Europe_Insurance_Company_SE);
        UNOFI_Assurances_S_A = new VersichererCode("UNOFI_Assurances_S_A", "50082963");
        $VALUES.add(UNOFI_Assurances_S_A);
        Mercedes_Benz_Pensionsfonds_AG_c_o_Mercer_Deutschland_GmbH = new VersichererCode("Mercedes_Benz_Pensionsfonds_AG_c_o_Mercer_Deutschland_GmbH", "50082964");
        $VALUES.add(Mercedes_Benz_Pensionsfonds_AG_c_o_Mercer_Deutschland_GmbH);
        Mangrove_Insurance_Europe_PCC_Ltd = new VersichererCode("Mangrove_Insurance_Europe_PCC_Ltd", "50083073");
        $VALUES.add(Mangrove_Insurance_Europe_PCC_Ltd);
        Markel_Insurance_SE = new VersichererCode("Markel_Insurance_SE", "50083095");
        $VALUES.add(Markel_Insurance_SE);
        SI_Insurance_Europe_SA_Zweigniederlassung_Deutschland = new VersichererCode("SI_Insurance_Europe_SA_Zweigniederlassung_Deutschland", "50083099");
        $VALUES.add(SI_Insurance_Europe_SA_Zweigniederlassung_Deutschland);
        HISCOX_SA_Niederlassung_f_r_Deutschland = new VersichererCode("HISCOX_SA_Niederlassung_f_r_Deutschland", "50083100");
        $VALUES.add(HISCOX_SA_Niederlassung_f_r_Deutschland);
        Albingia_S_A = new VersichererCode("Albingia_S_A", "50083111");
        $VALUES.add(Albingia_S_A);
        QBE_Europe_SA_NV = new VersichererCode("QBE_Europe_SA_NV", "50083113");
        $VALUES.add(QBE_Europe_SA_NV);
        Mutuelle_des_tudiants_de_Provence = new VersichererCode("Mutuelle_des_tudiants_de_Provence", "50083118");
        $VALUES.add(Mutuelle_des_tudiants_de_Provence);
    }

    private static void init2() {
        Lloyd_s_Insurance_Company_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("Lloyd_s_Insurance_Company_S_A_Niederlassung_f_r_Deutschland", "50083121");
        $VALUES.add(Lloyd_s_Insurance_Company_S_A_Niederlassung_f_r_Deutschland);
        Lloyd_s_Insurance_Company_S_A = new VersichererCode("Lloyd_s_Insurance_Company_S_A", "50083123");
        $VALUES.add(Lloyd_s_Insurance_Company_S_A);
        Intact_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland = new VersichererCode("Intact_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland", "50083224");
        $VALUES.add(Intact_Insurance_Europe_S_A_Niederlassung_f_r_Deutschland);
        Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V = new VersichererCode("Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V", "50083253");
        $VALUES.add(Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V);
        Tokio_Marine_Europe_S_A_Zweigniederlassung_f_r_Deutschland = new VersichererCode("Tokio_Marine_Europe_S_A_Zweigniederlassung_f_r_Deutschland", "50083270");
        $VALUES.add(Tokio_Marine_Europe_S_A_Zweigniederlassung_f_r_Deutschland);
        Premia_Insurance_Europe_SA = new VersichererCode("Premia_Insurance_Europe_SA", "50083370");
        $VALUES.add(Premia_Insurance_Europe_SA);
        AXA_France_IARD_S_A_Zweigniederlassung_Deutschland = new VersichererCode("AXA_France_IARD_S_A_Zweigniederlassung_Deutschland", "50083407");
        $VALUES.add(AXA_France_IARD_S_A_Zweigniederlassung_Deutschland);
        AXA_France_Vie_S_A_Zweigniederlassung_Deutschland = new VersichererCode("AXA_France_Vie_S_A_Zweigniederlassung_Deutschland", "50083408");
        $VALUES.add(AXA_France_Vie_S_A_Zweigniederlassung_Deutschland);
        SI_Insurance_Europe_SA = new VersichererCode("SI_Insurance_Europe_SA", "50083457");
        $VALUES.add(SI_Insurance_Europe_SA);
        CNA_Insurance_Company_Europe_S_A = new VersichererCode("CNA_Insurance_Company_Europe_S_A", "50083505");
        $VALUES.add(CNA_Insurance_Company_Europe_S_A);
        Aviva_Insurance_Ireland_dac = new VersichererCode("Aviva_Insurance_Ireland_dac", "50083515");
        $VALUES.add(Aviva_Insurance_Ireland_dac);
        Tokio_Marine_Europe_S_A = new VersichererCode("Tokio_Marine_Europe_S_A", "50083529");
        $VALUES.add(Tokio_Marine_Europe_S_A);
        AIG_Europe_S_A = new VersichererCode("AIG_Europe_S_A", "50083530");
        $VALUES.add(AIG_Europe_S_A);
        Ansvar_Verzekeringsmaatschappij_N_V = new VersichererCode("Ansvar_Verzekeringsmaatschappij_N_V", "50083558");
        $VALUES.add(Ansvar_Verzekeringsmaatschappij_N_V);
        andsafe_Aktiengesellschaft = new VersichererCode("andsafe_Aktiengesellschaft", "50083585");
        $VALUES.add(andsafe_Aktiengesellschaft);
        HISCOX_S_A = new VersichererCode("HISCOX_S_A", "50083638");
        $VALUES.add(HISCOX_S_A);
        Mutuaide_Assistance_S_A = new VersichererCode("Mutuaide_Assistance_S_A", "50083649");
        $VALUES.add(Mutuaide_Assistance_S_A);
        Fidelis_Insurance_Ireland_Designated_Activity_Company = new VersichererCode("Fidelis_Insurance_Ireland_Designated_Activity_Company", "50083651");
        $VALUES.add(Fidelis_Insurance_Ireland_Designated_Activity_Company);
        USAA_EU_Designated_Activity_Company_Frankfurt_Claims_Branch = new VersichererCode("USAA_EU_Designated_Activity_Company_Frankfurt_Claims_Branch", "50083664");
        $VALUES.add(USAA_EU_Designated_Activity_Company_Frankfurt_Claims_Branch);
        CNA_Insurance_Company_Europe_S_A_2 = new VersichererCode("CNA_Insurance_Company_Europe_S_A_2", "50083701");
        $VALUES.add(CNA_Insurance_Company_Europe_S_A_2);
        USAA_EU_Designated_Activity_Company = new VersichererCode("USAA_EU_Designated_Activity_Company", "50083751");
        $VALUES.add(USAA_EU_Designated_Activity_Company);
        Berkshire_Hathaway_European_Insurance_DAC_Deutschland = new VersichererCode("Berkshire_Hathaway_European_Insurance_DAC_Deutschland", "50083752");
        $VALUES.add(Berkshire_Hathaway_European_Insurance_DAC_Deutschland);
        SCOR_Europe_SE = new VersichererCode("SCOR_Europe_SE", "50083815");
        $VALUES.add(SCOR_Europe_SE);
        Starr_Europe_Insurance_Limited = new VersichererCode("Starr_Europe_Insurance_Limited", "50083844");
        $VALUES.add(Starr_Europe_Insurance_Limited);
        Bavaria_Reinsurance_Malta_Limited = new VersichererCode("Bavaria_Reinsurance_Malta_Limited", "50083845");
        $VALUES.add(Bavaria_Reinsurance_Malta_Limited);
        Mapfre_Seguros_Gerais_S_A = new VersichererCode("Mapfre_Seguros_Gerais_S_A", "50083848");
        $VALUES.add(Mapfre_Seguros_Gerais_S_A);
        Aviva_Life_Pensions_Ireland_Designated_Activity_Company = new VersichererCode("Aviva_Life_Pensions_Ireland_Designated_Activity_Company", "50083904");
        $VALUES.add(Aviva_Life_Pensions_Ireland_Designated_Activity_Company);
        Royal_London_Insurance_dac = new VersichererCode("Royal_London_Insurance_dac", "50083905");
        $VALUES.add(Royal_London_Insurance_dac);
        Bupa_Global_DAC = new VersichererCode("Bupa_Global_DAC", "50083909");
        $VALUES.add(Bupa_Global_DAC);
        UNIQA_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g = new VersichererCode("UNIQA_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g", "50083931");
        $VALUES.add(UNIQA_Biztos_t_Z_rtk_r_en_M_k_d_R_szv_nyt_rsas_g);
        TK_Pensionsfonds_AG = new VersichererCode("TK_Pensionsfonds_AG", "50083933");
        $VALUES.add(TK_Pensionsfonds_AG);
        Generali_Luxembourg_S_A = new VersichererCode("Generali_Luxembourg_S_A", "50083986");
        $VALUES.add(Generali_Luxembourg_S_A);
        NorthStandard_EU_DAC = new VersichererCode("NorthStandard_EU_DAC", "50083989");
        $VALUES.add(NorthStandard_EU_DAC);
        Talanx_Aktiengesellschaft = new VersichererCode("Talanx_Aktiengesellschaft", "50083992");
        $VALUES.add(Talanx_Aktiengesellschaft);
        Barmenia_Versicherungen_a_G = new VersichererCode("Barmenia_Versicherungen_a_G", "50084007");
        $VALUES.add(Barmenia_Versicherungen_a_G);
        The_Britannia_Steam_Ship_Insurance_Association_Europe_M_A = new VersichererCode("The_Britannia_Steam_Ship_Insurance_Association_Europe_M_A", "50084018");
        $VALUES.add(The_Britannia_Steam_Ship_Insurance_Association_Europe_M_A);
        Travelers_Insurance_Designated_Activity_Company = new VersichererCode("Travelers_Insurance_Designated_Activity_Company", "50084040");
        $VALUES.add(Travelers_Insurance_Designated_Activity_Company);
        Starr_Europe_Insurance_Limited_Germany = new VersichererCode("Starr_Europe_Insurance_Limited_Germany", "50084050");
        $VALUES.add(Starr_Europe_Insurance_Limited_Germany);
        La_Mondiale_Partenaire_S_A = new VersichererCode("La_Mondiale_Partenaire_S_A", "50084059");
        $VALUES.add(La_Mondiale_Partenaire_S_A);
        La_Mondiale_S_A = new VersichererCode("La_Mondiale_S_A", "50084060");
        $VALUES.add(La_Mondiale_S_A);
        Standard_Life_Versicherung_Zweigniederlassung_Deutschland_der_Standard_Life_International_Designated_Activity_Company = new VersichererCode("Standard_Life_Versicherung_Zweigniederlassung_Deutschland_der_Standard_Life_International_Designated_Activity_Company", "50084069");
        $VALUES.add(Standard_Life_Versicherung_Zweigniederlassung_Deutschland_der_Standard_Life_International_Designated_Activity_Company);
        Monument_Life_Insurance_DAC = new VersichererCode("Monument_Life_Insurance_DAC", "50084073");
        $VALUES.add(Monument_Life_Insurance_DAC);
        Berkshire_Hathaway_European_Insurance_Designated_Activity_Company = new VersichererCode("Berkshire_Hathaway_European_Insurance_Designated_Activity_Company", "50084074");
        $VALUES.add(Berkshire_Hathaway_European_Insurance_Designated_Activity_Company);
        AXA_Insurance_dac = new VersichererCode("AXA_Insurance_dac", "50084084");
        $VALUES.add(AXA_Insurance_dac);
        Satrex_SA = new VersichererCode("Satrex_SA", "50084085");
        $VALUES.add(Satrex_SA);
        Domestic_General_Insurance_Europe_AG = new VersichererCode("Domestic_General_Insurance_Europe_AG", "50084086");
        $VALUES.add(Domestic_General_Insurance_Europe_AG);
        Newline_Europe_Versicherung_AG = new VersichererCode("Newline_Europe_Versicherung_AG", "50084095");
        $VALUES.add(Newline_Europe_Versicherung_AG);
        Dialog_Versicherung_Aktiengesellschaft = new VersichererCode("Dialog_Versicherung_Aktiengesellschaft", "50084103");
        $VALUES.add(Dialog_Versicherung_Aktiengesellschaft);
        Collinson_Insurance_Europe_Limited = new VersichererCode("Collinson_Insurance_Europe_Limited", "50084114");
        $VALUES.add(Collinson_Insurance_Europe_Limited);
        Actua_Schadeverzekering_N_V = new VersichererCode("Actua_Schadeverzekering_N_V", "50084169");
        $VALUES.add(Actua_Schadeverzekering_N_V);
        UK_P_I_Club_N_V = new VersichererCode("UK_P_I_Club_N_V", "50084190");
        $VALUES.add(UK_P_I_Club_N_V);
        Nordic_Guarantee_F_rs_kringsaktiebolag = new VersichererCode("Nordic_Guarantee_F_rs_kringsaktiebolag", "50084191");
        $VALUES.add(Nordic_Guarantee_F_rs_kringsaktiebolag);
        Viridium_R_ckversicherung_AG = new VersichererCode("Viridium_R_ckversicherung_AG", "50084271");
        $VALUES.add(Viridium_R_ckversicherung_AG);
        Opteven_Assurances_S_A = new VersichererCode("Opteven_Assurances_S_A", "50084325");
        $VALUES.add(Opteven_Assurances_S_A);
        Bastion_Insurance_Company_Limited = new VersichererCode("Bastion_Insurance_Company_Limited", "50084348");
        $VALUES.add(Bastion_Insurance_Company_Limited);
        Lemonade_Insurance_N_V = new VersichererCode("Lemonade_Insurance_N_V", "50084418");
        $VALUES.add(Lemonade_Insurance_N_V);
        Barmenia_Krankenversicherung_AG = new VersichererCode("Barmenia_Krankenversicherung_AG", "50084541");
        $VALUES.add(Barmenia_Krankenversicherung_AG);
        First_European_Title_Insurance_Company_Limited = new VersichererCode("First_European_Title_Insurance_Company_Limited", "50084563");
        $VALUES.add(First_European_Title_Insurance_Company_Limited);
        TransRe_Europe_S_A_Munich_Branch = new VersichererCode("TransRe_Europe_S_A_Munich_Branch", "50084571");
        $VALUES.add(TransRe_Europe_S_A_Munich_Branch);
        Towarzystwo_Ubezpiecze_Wzajemnych_Polski_Zak_ad_Ubezpiecze_Wzajemnych = new VersichererCode("Towarzystwo_Ubezpiecze_Wzajemnych_Polski_Zak_ad_Ubezpiecze_Wzajemnych", "50084587");
        $VALUES.add(Towarzystwo_Ubezpiecze_Wzajemnych_Polski_Zak_ad_Ubezpiecze_Wzajemnych);
        Europ_Assistance_SA_Niederlassung_f_r_Deutschland = new VersichererCode("Europ_Assistance_SA_Niederlassung_f_r_Deutschland", "50084683");
        $VALUES.add(Europ_Assistance_SA_Niederlassung_f_r_Deutschland);
        POUEY_RENSEIGNEMENT_COMMERCIAL_GARANTI_SA = new VersichererCode("POUEY_RENSEIGNEMENT_COMMERCIAL_GARANTI_SA", "50085024");
        $VALUES.add(POUEY_RENSEIGNEMENT_COMMERCIAL_GARANTI_SA);
        BANKINTER_SEGUROS_GENERALES_S_A_DE_SEGUROS_Y_REASEGUROS = new VersichererCode("BANKINTER_SEGUROS_GENERALES_S_A_DE_SEGUROS_Y_REASEGUROS", "50085088");
        $VALUES.add(BANKINTER_SEGUROS_GENERALES_S_A_DE_SEGUROS_Y_REASEGUROS);
        Assured_Guaranty_Europe_S_A = new VersichererCode("Assured_Guaranty_Europe_S_A", "50085149");
        $VALUES.add(Assured_Guaranty_Europe_S_A);
        SIGNAL_IDUNA_Sterbekasse_VVaG = new VersichererCode("SIGNAL_IDUNA_Sterbekasse_VVaG", "50085276");
        $VALUES.add(SIGNAL_IDUNA_Sterbekasse_VVaG);
        EUROHERC_osiguranje_d_d = new VersichererCode("EUROHERC_osiguranje_d_d", "50085283");
        $VALUES.add(EUROHERC_osiguranje_d_d);
        MGEN_FILIA = new VersichererCode("MGEN_FILIA", "50085284");
        $VALUES.add(MGEN_FILIA);
        Mutuelle_Generale_de_l_Education_Nationale_MGEN = new VersichererCode("Mutuelle_Generale_de_l_Education_Nationale_MGEN", "50085285");
        $VALUES.add(Mutuelle_Generale_de_l_Education_Nationale_MGEN);
        Steamship_Mutual_Underwriting_Association_Europe_Limited = new VersichererCode("Steamship_Mutual_Underwriting_Association_Europe_Limited", "50085290");
        $VALUES.add(Steamship_Mutual_Underwriting_Association_Europe_Limited);
        Intesa_Sanpaolo_Assicura_S_p_A = new VersichererCode("Intesa_Sanpaolo_Assicura_S_p_A", "50085312");
        $VALUES.add(Intesa_Sanpaolo_Assicura_S_p_A);
        Lippische_Landesbrandversicherung_AG = new VersichererCode("Lippische_Landesbrandversicherung_AG", "50085313");
        $VALUES.add(Lippische_Landesbrandversicherung_AG);
        HanseMerkur_International_AG = new VersichererCode("HanseMerkur_International_AG", "50085361");
        $VALUES.add(HanseMerkur_International_AG);
        SV_SparkassenVersicherung_Pensionsfonds_AG = new VersichererCode("SV_SparkassenVersicherung_Pensionsfonds_AG", "50085526");
        $VALUES.add(SV_SparkassenVersicherung_Pensionsfonds_AG);
        Companhia_de_Seguros_Allianz_Portugal_S_A = new VersichererCode("Companhia_de_Seguros_Allianz_Portugal_S_A", "50085621");
        $VALUES.add(Companhia_de_Seguros_Allianz_Portugal_S_A);
        MUTUA_DE_RIESGO_MARITIMO_SOCIEDAD_DE_SEGUROS_A_PRIMA_FIJA_MURIMAR = new VersichererCode("MUTUA_DE_RIESGO_MARITIMO_SOCIEDAD_DE_SEGUROS_A_PRIMA_FIJA_MURIMAR", "50085705");
        $VALUES.add(MUTUA_DE_RIESGO_MARITIMO_SOCIEDAD_DE_SEGUROS_A_PRIMA_FIJA_MURIMAR);
        Irish_Life_Assurance_plc = new VersichererCode("Irish_Life_Assurance_plc", "50085706");
        $VALUES.add(Irish_Life_Assurance_plc);
        Eir_F_rs_kring_AB = new VersichererCode("Eir_F_rs_kring_AB", "50085746");
        $VALUES.add(Eir_F_rs_kring_AB);
        Trust_International_Insurance_Company_Cyprus_Limited = new VersichererCode("Trust_International_Insurance_Company_Cyprus_Limited", "50085783");
        $VALUES.add(Trust_International_Insurance_Company_Cyprus_Limited);
        Assurant_Europe_Insurance_N_V = new VersichererCode("Assurant_Europe_Insurance_N_V", "50085846");
        $VALUES.add(Assurant_Europe_Insurance_N_V);
        Assurant_Europe_Life_Insurance_N_V = new VersichererCode("Assurant_Europe_Life_Insurance_N_V", "50085847");
        $VALUES.add(Assurant_Europe_Life_Insurance_N_V);
        American_Steamship_Owners_Marine_Insurance_Company_Europe_Limited = new VersichererCode("American_Steamship_Owners_Marine_Insurance_Company_Europe_Limited", "50085885");
        $VALUES.add(American_Steamship_Owners_Marine_Insurance_Company_Europe_Limited);
        F_rs_kringsaktiebolaget_Agria_publ_Zweigniederlassung_Deutschland = new VersichererCode("F_rs_kringsaktiebolaget_Agria_publ_Zweigniederlassung_Deutschland", "50085898");
        $VALUES.add(F_rs_kringsaktiebolaget_Agria_publ_Zweigniederlassung_Deutschland);
        SMA_SA = new VersichererCode("SMA_SA", "50085931");
        $VALUES.add(SMA_SA);
        Sanofi_European_Pension_Fund_OFP = new VersichererCode("Sanofi_European_Pension_Fund_OFP", "50085937");
        $VALUES.add(Sanofi_European_Pension_Fund_OFP);
        PACIFICA = new VersichererCode("PACIFICA", "50085995");
        $VALUES.add(PACIFICA);
        The_United_Kingdom_Freight_Demurrage_and_Defence_Insurance_Europe_Limited = new VersichererCode("The_United_Kingdom_Freight_Demurrage_and_Defence_Insurance_Europe_Limited", "50086004");
        $VALUES.add(The_United_Kingdom_Freight_Demurrage_and_Defence_Insurance_Europe_Limited);
        Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_du_Nord_Est = new VersichererCode("Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_du_Nord_Est", "50086239");
        $VALUES.add(Caisse_Regionale_d_Assurances_Mutuelles_Agricoles_du_Nord_Est);
        Monument_Assurance_Belgium_SA_NV = new VersichererCode("Monument_Assurance_Belgium_SA_NV", "50086307");
        $VALUES.add(Monument_Assurance_Belgium_SA_NV);
        Metzler_Sozialpartner_Pensionsfonds_AG = new VersichererCode("Metzler_Sozialpartner_Pensionsfonds_AG", "50086313");
        $VALUES.add(Metzler_Sozialpartner_Pensionsfonds_AG);
        Accelerant_Insurance_Europe_SA_NV = new VersichererCode("Accelerant_Insurance_Europe_SA_NV", "50086401");
        $VALUES.add(Accelerant_Insurance_Europe_SA_NV);
        OCCIDENT_GCO_SOCIEDAD_AN_NIMA_DE_SEGUROS_Y_REASEGUROS = new VersichererCode("OCCIDENT_GCO_SOCIEDAD_AN_NIMA_DE_SEGUROS_Y_REASEGUROS", "50086460");
        $VALUES.add(OCCIDENT_GCO_SOCIEDAD_AN_NIMA_DE_SEGUROS_Y_REASEGUROS);
        KOMUN_LNA_poist_ovna_a_s_Vienna_Insurance_Group = new VersichererCode("KOMUN_LNA_poist_ovna_a_s_Vienna_Insurance_Group", "50086474");
        $VALUES.add(KOMUN_LNA_poist_ovna_a_s_Vienna_Insurance_Group);
        TM_tryginggar_hf = new VersichererCode("TM_tryginggar_hf", "50086502");
        $VALUES.add(TM_tryginggar_hf);
        The_London_P_I_Insurance_Company_Europe_Limited = new VersichererCode("The_London_P_I_Insurance_Company_Europe_Limited", "50086574");
        $VALUES.add(The_London_P_I_Insurance_Company_Europe_Limited);
        MIC_Insurance_Company_S_A = new VersichererCode("MIC_Insurance_Company_S_A", "50086724");
        $VALUES.add(MIC_Insurance_Company_S_A);
        SIGNAL_IDUNA_Lebensversicherung_AG = new VersichererCode("SIGNAL_IDUNA_Lebensversicherung_AG", "50086785");
        $VALUES.add(SIGNAL_IDUNA_Lebensversicherung_AG);
        Companjon_Insurance_DAC = new VersichererCode("Companjon_Insurance_DAC", "50086851");
        $VALUES.add(Companjon_Insurance_DAC);
        EUCARE_Insurance_PCC_Limited = new VersichererCode("EUCARE_Insurance_PCC_Limited", "50086928");
        $VALUES.add(EUCARE_Insurance_PCC_Limited);
        Tulip_Assist_Insurance_Limited = new VersichererCode("Tulip_Assist_Insurance_Limited", "50086965");
        $VALUES.add(Tulip_Assist_Insurance_Limited);
        Bothnia_International_Insurance_Company_Ltd = new VersichererCode("Bothnia_International_Insurance_Company_Ltd", "50086967");
        $VALUES.add(Bothnia_International_Insurance_Company_Ltd);
        ONVZ_Aanvullende_Verzekering_N_V = new VersichererCode("ONVZ_Aanvullende_Verzekering_N_V", "50087097");
        $VALUES.add(ONVZ_Aanvullende_Verzekering_N_V);
        Allianz_Hrvatska_d_d = new VersichererCode("Allianz_Hrvatska_d_d", "50087098");
        $VALUES.add(Allianz_Hrvatska_d_d);
        Veterfina_Verzekeringsmaatschappij_N_V = new VersichererCode("Veterfina_Verzekeringsmaatschappij_N_V", "50087099");
        $VALUES.add(Veterfina_Verzekeringsmaatschappij_N_V);
        J_J_Pension_Fund_OFP = new VersichererCode("J_J_Pension_Fund_OFP", "50087112");
        $VALUES.add(J_J_Pension_Fund_OFP);
        International_General_Insurance_Company_Europe_Ltd = new VersichererCode("International_General_Insurance_Company_Europe_Ltd", "50087232");
        $VALUES.add(International_General_Insurance_Company_Europe_Ltd);
        Hrvatsko_kreditno_osiguranje_d_d = new VersichererCode("Hrvatsko_kreditno_osiguranje_d_d", "50087261");
        $VALUES.add(Hrvatsko_kreditno_osiguranje_d_d);
        UNIQA_Towarzystwo_Ubezpiecze_na_ycie_S_A = new VersichererCode("UNIQA_Towarzystwo_Ubezpiecze_na_ycie_S_A", "50087360");
        $VALUES.add(UNIQA_Towarzystwo_Ubezpiecze_na_ycie_S_A);
        Seyna_S_A = new VersichererCode("Seyna_S_A", "50087425");
        $VALUES.add(Seyna_S_A);
        Generali_Hellas_Insurance_Company_S_A = new VersichererCode("Generali_Hellas_Insurance_Company_S_A", "50087428");
        $VALUES.add(Generali_Hellas_Insurance_Company_S_A);
        Convex_Europe_S_A = new VersichererCode("Convex_Europe_S_A", "50087478");
        $VALUES.add(Convex_Europe_S_A);
        SV_poji_ovna_a_s = new VersichererCode("SV_poji_ovna_a_s", "50087521");
        $VALUES.add(SV_poji_ovna_a_s);
        Caisse_Nationale_de_R_assurance_mutuelle_agricole_Groupama = new VersichererCode("Caisse_Nationale_de_R_assurance_mutuelle_agricole_Groupama", "50087825");
        $VALUES.add(Caisse_Nationale_de_R_assurance_mutuelle_agricole_Groupama);
        Zurich_Life_Legacy_Versicherung_AG_Deutschland = new VersichererCode("Zurich_Life_Legacy_Versicherung_AG_Deutschland", "50088222");
        $VALUES.add(Zurich_Life_Legacy_Versicherung_AG_Deutschland);
        Gasrule_Insurance_DAC = new VersichererCode("Gasrule_Insurance_DAC", "50088245");
        $VALUES.add(Gasrule_Insurance_DAC);
        CGPA_Europe_Underwriting_GmbH = new VersichererCode("CGPA_Europe_Underwriting_GmbH", "50088286");
        $VALUES.add(CGPA_Europe_Underwriting_GmbH);
        D_A_S_Belgische_Rechtsbijstandsverzekeringsmaatschappij_NV = new VersichererCode("D_A_S_Belgische_Rechtsbijstandsverzekeringsmaatschappij_NV", "50088326");
        $VALUES.add(D_A_S_Belgische_Rechtsbijstandsverzekeringsmaatschappij_NV);
        Lime_Street_Insurance_PCC_Limited_Sugar_Bridge_Cell = new VersichererCode("Lime_Street_Insurance_PCC_Limited_Sugar_Bridge_Cell", "50088364");
        $VALUES.add(Lime_Street_Insurance_PCC_Limited_Sugar_Bridge_Cell);
        AGER_Lebensversicherung_AG = new VersichererCode("AGER_Lebensversicherung_AG", "50088396");
        $VALUES.add(AGER_Lebensversicherung_AG);
        HOK_osiguranje_d_d = new VersichererCode("HOK_osiguranje_d_d", "50088593");
        $VALUES.add(HOK_osiguranje_d_d);
        REVO_Insurance_S_p_A = new VersichererCode("REVO_Insurance_S_p_A", "50088642");
        $VALUES.add(REVO_Insurance_S_p_A);
        SCOR_Europe_Deutschland_Niederlassung_der_SCOR_Europe_SE = new VersichererCode("SCOR_Europe_Deutschland_Niederlassung_der_SCOR_Europe_SE", "50088717");
        $VALUES.add(SCOR_Europe_Deutschland_Niederlassung_der_SCOR_Europe_SE);
        Everest_Insurance_Ireland_DAC_Niederlassung_f_r_Deutschland = new VersichererCode("Everest_Insurance_Ireland_DAC_Niederlassung_f_r_Deutschland", "50088790");
        $VALUES.add(Everest_Insurance_Ireland_DAC_Niederlassung_f_r_Deutschland);
        Axiom_Insurance_Company_Jsc = new VersichererCode("Axiom_Insurance_Company_Jsc", "50088901");
        $VALUES.add(Axiom_Insurance_Company_Jsc);
        Towarzystwo_Ubezpiecze_Europa_S_A = new VersichererCode("Towarzystwo_Ubezpiecze_Europa_S_A", "50088942");
        $VALUES.add(Towarzystwo_Ubezpiecze_Europa_S_A);
        Towarzystwo_Ubezpiecze_na_ycie_Europa_S_A = new VersichererCode("Towarzystwo_Ubezpiecze_na_ycie_Europa_S_A", "50088943");
        $VALUES.add(Towarzystwo_Ubezpiecze_na_ycie_Europa_S_A);
        Premium_Insurance_Company_Limited = new VersichererCode("Premium_Insurance_Company_Limited", "50088946");
        $VALUES.add(Premium_Insurance_Company_Limited);
        Soci_t_G_n_rale_Luxembourg_Credit_Insurance_SA = new VersichererCode("Soci_t_G_n_rale_Luxembourg_Credit_Insurance_SA", "50089089");
        $VALUES.add(Soci_t_G_n_rale_Luxembourg_Credit_Insurance_SA);
        Dina_F_rs_kring_AB = new VersichererCode("Dina_F_rs_kring_AB", "50089165");
        $VALUES.add(Dina_F_rs_kring_AB);
        Gartnernes_Forsikring_GS_Dansk_Jordbrug = new VersichererCode("Gartnernes_Forsikring_GS_Dansk_Jordbrug", "50089166");
        $VALUES.add(Gartnernes_Forsikring_GS_Dansk_Jordbrug);
        Mutual_Insurance_and_Reinsurance_for_Information_Systems_MIRIS = new VersichererCode("Mutual_Insurance_and_Reinsurance_for_Information_Systems_MIRIS", "50089193");
        $VALUES.add(Mutual_Insurance_and_Reinsurance_for_Information_Systems_MIRIS);
        BULGARIAN_EXPORT_INSURANCE_AGENCY_BAEZ_EAD = new VersichererCode("BULGARIAN_EXPORT_INSURANCE_AGENCY_BAEZ_EAD", "50089277");
        $VALUES.add(BULGARIAN_EXPORT_INSURANCE_AGENCY_BAEZ_EAD);
        ERB_Cyprialife_Limited = new VersichererCode("ERB_Cyprialife_Limited", "50089319");
        $VALUES.add(ERB_Cyprialife_Limited);
        UniSalute_S_p_A = new VersichererCode("UniSalute_S_p_A", "50089327");
        $VALUES.add(UniSalute_S_p_A);
        Descartes_Insurance_S_A = new VersichererCode("Descartes_Insurance_S_A", "50089343");
        $VALUES.add(Descartes_Insurance_S_A);
        Neodigital_Autoversicherung_AG = new VersichererCode("Neodigital_Autoversicherung_AG", "50089351");
        $VALUES.add(Neodigital_Autoversicherung_AG);
        YOUPLUS_Assurance_AG_Zweigniederlassung_Deutschland = new VersichererCode("YOUPLUS_Assurance_AG_Zweigniederlassung_Deutschland", "50089358");
        $VALUES.add(YOUPLUS_Assurance_AG_Zweigniederlassung_Deutschland);
        Apdro_in_anas_akciju_sabiedr_ba_BALTA = new VersichererCode("Apdro_in_anas_akciju_sabiedr_ba_BALTA", "50089557");
        $VALUES.add(Apdro_in_anas_akciju_sabiedr_ba_BALTA);
        UAB_PZU_Lietuva_gyvyb_s_draudimas = new VersichererCode("UAB_PZU_Lietuva_gyvyb_s_draudimas", "50089667");
        $VALUES.add(UAB_PZU_Lietuva_gyvyb_s_draudimas);
        Goudse_Levensverzekeringen_N_V = new VersichererCode("Goudse_Levensverzekeringen_N_V", "50089675");
        $VALUES.add(Goudse_Levensverzekeringen_N_V);
        White_Rock_Insurance_Netherlands_PCC_Limited = new VersichererCode("White_Rock_Insurance_Netherlands_PCC_Limited", "50089790");
        $VALUES.add(White_Rock_Insurance_Netherlands_PCC_Limited);
        Swiss_Life_Lebensversicherung_SE = new VersichererCode("Swiss_Life_Lebensversicherung_SE", "50089844");
        $VALUES.add(Swiss_Life_Lebensversicherung_SE);
        Allianz_Risk_Transfer_AG = new VersichererCode("Allianz_Risk_Transfer_AG", "50089926");
        $VALUES.add(Allianz_Risk_Transfer_AG);
        Hesse_Digital_AG = new VersichererCode("Hesse_Digital_AG", "50089953");
        $VALUES.add(Hesse_Digital_AG);
        ACM_Lebensversicherung_AG = new VersichererCode("ACM_Lebensversicherung_AG", "50089959");
        $VALUES.add(ACM_Lebensversicherung_AG);
        Abeille_IARD_et_Sante = new VersichererCode("Abeille_IARD_et_Sante", "50089971");
        $VALUES.add(Abeille_IARD_et_Sante);
        Abanca_Vida_y_Pensiones_de_Seguros_y_Reaseguros_S_A = new VersichererCode("Abanca_Vida_y_Pensiones_de_Seguros_y_Reaseguros_S_A", "50089986");
        $VALUES.add(Abanca_Vida_y_Pensiones_de_Seguros_y_Reaseguros_S_A);
        IF_Livf_rs_kring_AB = new VersichererCode("IF_Livf_rs_kring_AB", "50090036");
        $VALUES.add(IF_Livf_rs_kring_AB);
        ACM_Versicherung_AG = new VersichererCode("ACM_Versicherung_AG", "50090071");
        $VALUES.add(ACM_Versicherung_AG);
        Scottish_Widows_Europe_S_A = new VersichererCode("Scottish_Widows_Europe_S_A", "50090074");
        $VALUES.add(Scottish_Widows_Europe_S_A);
        TG_Versicherungs_AG = new VersichererCode("TG_Versicherungs_AG", "50090165");
        $VALUES.add(TG_Versicherungs_AG);
        International_Transport_Intermediaries_Insurance_Company_Europe_Limited = new VersichererCode("International_Transport_Intermediaries_Insurance_Company_Europe_Limited", "50090167");
        $VALUES.add(International_Transport_Intermediaries_Insurance_Company_Europe_Limited);
        Bos_Fruit_Aardappelen_Onderlinge_verzekeringen_BFAO_U_A = new VersichererCode("Bos_Fruit_Aardappelen_Onderlinge_verzekeringen_BFAO_U_A", "50090219");
        $VALUES.add(Bos_Fruit_Aardappelen_Onderlinge_verzekeringen_BFAO_U_A);
        TT_Club_Mutual_Insurance_N_V = new VersichererCode("TT_Club_Mutual_Insurance_N_V", "50090332");
        $VALUES.add(TT_Club_Mutual_Insurance_N_V);
        ADAC_Zuhause_Versicherung_AG = new VersichererCode("ADAC_Zuhause_Versicherung_AG", "50090334");
        $VALUES.add(ADAC_Zuhause_Versicherung_AG);
        Insurance_Company_Instinct_AD = new VersichererCode("Insurance_Company_Instinct_AD", "50090351");
        $VALUES.add(Insurance_Company_Instinct_AD);
        Monarch_Assurance_SE = new VersichererCode("Monarch_Assurance_SE", "50090411");
        $VALUES.add(Monarch_Assurance_SE);
        WERLA_INSURANCE_COMPANY_LIMITED = new VersichererCode("WERLA_INSURANCE_COMPANY_LIMITED", "50090452");
        $VALUES.add(WERLA_INSURANCE_COMPANY_LIMITED);
        Fortegra_Belgium_Insurance_Company_NV = new VersichererCode("Fortegra_Belgium_Insurance_Company_NV", "50090453");
        $VALUES.add(Fortegra_Belgium_Insurance_Company_NV);
        KOOPERATIVA_pois_ov_a_a_s_Vienna_Insurance_Group = new VersichererCode("KOOPERATIVA_pois_ov_a_a_s_Vienna_Insurance_Group", "50090488");
        $VALUES.add(KOOPERATIVA_pois_ov_a_a_s_Vienna_Insurance_Group);
        China_Taiping_Insurance_LU_S_A = new VersichererCode("China_Taiping_Insurance_LU_S_A", "50090616");
        $VALUES.add(China_Taiping_Insurance_LU_S_A);
        ZAD_European_Insurance_Company_AD = new VersichererCode("ZAD_European_Insurance_Company_AD", "50090637");
        $VALUES.add(ZAD_European_Insurance_Company_AD);
        Direct_poji_ovna_a_s = new VersichererCode("Direct_poji_ovna_a_s", "50090698");
        $VALUES.add(Direct_poji_ovna_a_s);
        Cosmos_Insurance_Public_Company_Limited = new VersichererCode("Cosmos_Insurance_Public_Company_Limited", "50090841");
        $VALUES.add(Cosmos_Insurance_Public_Company_Limited);
        CACI_Non_Life_DAC_Deutschland = new VersichererCode("CACI_Non_Life_DAC_Deutschland", "50090945");
        $VALUES.add(CACI_Non_Life_DAC_Deutschland);
        CACI_Life_DAC_Deutschland = new VersichererCode("CACI_Life_DAC_Deutschland", "50090947");
        $VALUES.add(CACI_Life_DAC_Deutschland);
        Eni_Insurance_S_p_A = new VersichererCode("Eni_Insurance_S_p_A", "50090980");
        $VALUES.add(Eni_Insurance_S_p_A);
        American_Atlantic_Assurance_Co_Ltd = new VersichererCode("American_Atlantic_Assurance_Co_Ltd", "50090987");
        $VALUES.add(American_Atlantic_Assurance_Co_Ltd);
        Steel_Plow_Insurance_Limited = new VersichererCode("Steel_Plow_Insurance_Limited", "50090992");
        $VALUES.add(Steel_Plow_Insurance_Limited);
        V_S_tryggingar_hf = new VersichererCode("V_S_tryggingar_hf", "50091045");
        $VALUES.add(V_S_tryggingar_hf);
        Renaissance_Reinsurance_of_Europe_Designated_Activity_Company = new VersichererCode("Renaissance_Reinsurance_of_Europe_Designated_Activity_Company", "50091079");
        $VALUES.add(Renaissance_Reinsurance_of_Europe_Designated_Activity_Company);
        MILA_S_A = new VersichererCode("MILA_S_A", "50091128");
        $VALUES.add(MILA_S_A);
        AS_Sincera_Insurance = new VersichererCode("AS_Sincera_Insurance", "50091278");
        $VALUES.add(AS_Sincera_Insurance);
        MSIG_Europe_SE_Niederlassung_Deutschland = new VersichererCode("MSIG_Europe_SE_Niederlassung_Deutschland", "50091305");
        $VALUES.add(MSIG_Europe_SE_Niederlassung_Deutschland);
        Caisse_d_Assurances_Mutuelles_du_Cr_dit_Agricole = new VersichererCode("Caisse_d_Assurances_Mutuelles_du_Cr_dit_Agricole", "50091361");
        $VALUES.add(Caisse_d_Assurances_Mutuelles_du_Cr_dit_Agricole);
        Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V_Zweigniederlassung_Deutschland = new VersichererCode("Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V_Zweigniederlassung_Deutschland", "50091382");
        $VALUES.add(Nationale_Nederlanden_Schadeverzekering_Maatschappij_N_V_Zweigniederlassung_Deutschland);
        Omocom_F_rs_kring_AB = new VersichererCode("Omocom_F_rs_kring_AB", "50091424");
        $VALUES.add(Omocom_F_rs_kring_AB);
        Sveriges_Angfartygs_Assurans_F_rening = new VersichererCode("Sveriges_Angfartygs_Assurans_F_rening", "50091553");
        $VALUES.add(Sveriges_Angfartygs_Assurans_F_rening);
        Helvetia_Italia_Assicurazioni_S_p_A = new VersichererCode("Helvetia_Italia_Assicurazioni_S_p_A", "50091651");
        $VALUES.add(Helvetia_Italia_Assicurazioni_S_p_A);
        EP_Insurance_Designated_Activity_Company = new VersichererCode("EP_Insurance_Designated_Activity_Company", "50091725");
        $VALUES.add(EP_Insurance_Designated_Activity_Company);
        N_V_Hagelunie = new VersichererCode("N_V_Hagelunie", "50091726");
        $VALUES.add(N_V_Hagelunie);
        AXA_Health_Insurance = new VersichererCode("AXA_Health_Insurance", "50091751");
        $VALUES.add(AXA_Health_Insurance);
        DSV_Insurance_DAC = new VersichererCode("DSV_Insurance_DAC", "50091755");
        $VALUES.add(DSV_Insurance_DAC);
        SquareTrade_Europe_Insurance_SA = new VersichererCode("SquareTrade_Europe_Insurance_SA", "50091756");
        $VALUES.add(SquareTrade_Europe_Insurance_SA);
        MGEN_Portugal_Companhia_de_Seguros_S_A = new VersichererCode("MGEN_Portugal_Companhia_de_Seguros_S_A", "50091799");
        $VALUES.add(MGEN_Portugal_Companhia_de_Seguros_S_A);
    }

    private static final java.util.Map<String, VersichererCode> ALIASES = new java.util.HashMap<>();
    /**
     * Creates an enum from a string value.
     * @param value the string value
     * @return the enum value
     */
    @JsonCreator
    public static VersichererCode fromValue(String value) {
        if (value == null || value.isEmpty()) throw new IllegalArgumentException("Value cannot be null or empty");
        for (VersichererCode e : $VALUES) {
            if (e.getValue().equals(value) || e.name().equalsIgnoreCase(value)) {
                return e;
            }
        }
        VersichererCode match = ALIASES.get(value.toLowerCase());
        if (match != null) return match;
        throw new IllegalArgumentException(value);
    }

    @Override
    public String toString() { return value; }

    /**
     * XML Adapter for JAXB.
     */
    public static class Adapter extends XmlAdapter<String, VersichererCode> {
        public VersichererCode unmarshal(String v) { return fromValue(v); }
        public String marshal(VersichererCode v) { return v != null ? v.getValue() : null; }
    }
}
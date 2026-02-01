package de.xjustiz.core.models;


public final class DokumentklasseCodeLists {

    private DokumentklasseCodeLists() {}

    public static final IVersionedCodeList<DokumentklasseCode> V1_4;
    public static final IVersionedCodeList<DokumentklasseCode> V1_3;
    public static final IVersionedCodeList<DokumentklasseCode> V1_2;
    public static final IVersionedCodeList<DokumentklasseCode> V1_1;
    public static final IVersionedCodeList<DokumentklasseCode> V1_0;

    static {
        V1_4 = new VersionedCodeList<>("1.4");
        initV1_4_0();
        V1_3 = new VersionedCodeList<>("1.3");
        initV1_3_0();
        V1_2 = new VersionedCodeList<>("1.2");
        initV1_2_0();
        V1_1 = new VersionedCodeList<>("1.1");
        initV1_1_0();
        V1_0 = new VersionedCodeList<>("1.0");
        initV1_0_0();
    }

    private static void initV1_4_0() {
        V1_4.add(DokumentklasseCode.Andere_Sonstige);
        V1_4.add(DokumentklasseCode.Klage_Antrag);
        V1_4.add(DokumentklasseCode.Urteil);
        V1_4.add(DokumentklasseCode.Beschluss);
        V1_4.add(DokumentklasseCode.Verfuegung);
        V1_4.add(DokumentklasseCode.Vermerk);
        V1_4.add(DokumentklasseCode.Protokoll);
        V1_4.add(DokumentklasseCode.Fehlblatt);
        V1_4.add(DokumentklasseCode.Zustellungsdokument);
        V1_4.add(DokumentklasseCode.Gutachten);
        V1_4.add(DokumentklasseCode.Technische_Information);
        V1_4.add(DokumentklasseCode.Schreiben);
        V1_4.add(DokumentklasseCode.Antrag_Behoerde);
        V1_4.add(DokumentklasseCode.Bescheid);
        V1_4.add(DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        V1_4.add(DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        V1_4.add(DokumentklasseCode.Kostendokument);
        V1_4.add(DokumentklasseCode.Gerichtsbescheid);
    }

    private static void initV1_3_0() {
        V1_3.add(DokumentklasseCode.Andere_Sonstige);
        V1_3.add(DokumentklasseCode.Klage_Antrag);
        V1_3.add(DokumentklasseCode.Anlage);
        V1_3.add(DokumentklasseCode.Urteil);
        V1_3.add(DokumentklasseCode.Beschluss);
        V1_3.add(DokumentklasseCode.Verfuegung);
        V1_3.add(DokumentklasseCode.Vermerk);
        V1_3.add(DokumentklasseCode.Protokoll);
        V1_3.add(DokumentklasseCode.Fehlblatt);
        V1_3.add(DokumentklasseCode.Zustellungsdokument);
        V1_3.add(DokumentklasseCode.Gutachten);
        V1_3.add(DokumentklasseCode.Technische_Information);
        V1_3.add(DokumentklasseCode.Schreiben);
        V1_3.add(DokumentklasseCode.Antrag_Behoerde);
        V1_3.add(DokumentklasseCode.Bescheid);
        V1_3.add(DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        V1_3.add(DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        V1_3.add(DokumentklasseCode.Kostendokument);
    }

    private static void initV1_2_0() {
        V1_2.add(DokumentklasseCode.Andere_Sonstige);
        V1_2.add(DokumentklasseCode.Klage_Antrag);
        V1_2.add(DokumentklasseCode.Anlage);
        V1_2.add(DokumentklasseCode.Urteil);
        V1_2.add(DokumentklasseCode.Beschluss);
        V1_2.add(DokumentklasseCode.Verfuegung);
        V1_2.add(DokumentklasseCode.Vermerk);
        V1_2.add(DokumentklasseCode.Protokoll);
        V1_2.add(DokumentklasseCode.Fehlblatt);
        V1_2.add(DokumentklasseCode.Zustellungsdokument);
        V1_2.add(DokumentklasseCode.Gutachten);
        V1_2.add(DokumentklasseCode.Technische_Information);
        V1_2.add(DokumentklasseCode.Schreiben);
        V1_2.add(DokumentklasseCode.Antrag_Behoerde);
        V1_2.add(DokumentklasseCode.Bescheid);
        V1_2.add(DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        V1_2.add(DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        V1_2.add(DokumentklasseCode.Kostendokument);
    }

    private static void initV1_1_0() {
        V1_1.add(DokumentklasseCode.Andere_Sonstige);
        V1_1.add(DokumentklasseCode.Klage_Antrag);
        V1_1.add(DokumentklasseCode.Anlage);
        V1_1.add(DokumentklasseCode.Urteil);
        V1_1.add(DokumentklasseCode.Beschluss);
        V1_1.add(DokumentklasseCode.Verfuegung);
        V1_1.add(DokumentklasseCode.Vermerk);
        V1_1.add(DokumentklasseCode.Protokoll);
        V1_1.add(DokumentklasseCode.Fehlblatt);
        V1_1.add(DokumentklasseCode.Zustellungsdokument);
        V1_1.add(DokumentklasseCode.Gutachten);
        V1_1.add(DokumentklasseCode.Technische_Information);
        V1_1.add(DokumentklasseCode.Schreiben);
        V1_1.add(DokumentklasseCode.Antrag_Behoerde);
        V1_1.add(DokumentklasseCode.Bescheid);
        V1_1.add(DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        V1_1.add(DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
    }

    private static void initV1_0_0() {
        V1_0.add(DokumentklasseCode.Andere_Sonstige);
        V1_0.add(DokumentklasseCode.Klage_Antrag);
        V1_0.add(DokumentklasseCode.Anlage);
        V1_0.add(DokumentklasseCode.Urteil);
        V1_0.add(DokumentklasseCode.Beschluss);
        V1_0.add(DokumentklasseCode.Verfuegung);
        V1_0.add(DokumentklasseCode.Vermerk);
        V1_0.add(DokumentklasseCode.Protokoll);
        V1_0.add(DokumentklasseCode.Fehlblatt);
        V1_0.add(DokumentklasseCode.Zustellungsdokument);
        V1_0.add(DokumentklasseCode.Gutachten);
        V1_0.add(DokumentklasseCode.Technische_Information);
        V1_0.add(DokumentklasseCode.Schreiben);
        V1_0.add(DokumentklasseCode.Antrag_Behoerde);
        V1_0.add(DokumentklasseCode.Bescheid);
        V1_0.add(DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        V1_0.add(DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
    }

}
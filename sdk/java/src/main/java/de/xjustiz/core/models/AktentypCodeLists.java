package de.xjustiz.core.models;


public final class AktentypCodeLists {

    private AktentypCodeLists() {}

    public static final IVersionedCodeList<AktentypCode> V2_2;

    static {
        V2_2 = new VersionedCodeList<>("2.2");
        initV2_2_0();
    }

    private static void initV2_2_0() {
        V2_2.add(AktentypCode.Zivilakte);
        V2_2.add(AktentypCode.Betreuungsakte);
        V2_2.add(AktentypCode.Familienakte);
        V2_2.add(AktentypCode.Nachlassakte);
        V2_2.add(AktentypCode.Insolvenzakte);
        V2_2.add(AktentypCode.Grundakte);
        V2_2.add(AktentypCode.Registerakte);
        V2_2.add(AktentypCode.Zwangsvollstreckungsakte);
        V2_2.add(AktentypCode.Justizverwaltungsakte);
        V2_2.add(AktentypCode.Bussgeldakte);
        V2_2.add(AktentypCode.Bewaehrungshilfeakte);
        V2_2.add(AktentypCode.Strafakte);
        V2_2.add(AktentypCode.Arbeitsgerichtsakte);
        V2_2.add(AktentypCode.Finanzgerichtsakte);
        V2_2.add(AktentypCode.Sozialgerichtsakte);
        V2_2.add(AktentypCode.Verwaltungsgerichtsakte);
        V2_2.add(AktentypCode.Andere_oder_Sonstige);
        V2_2.add(AktentypCode.Behoerdenakte);
        V2_2.add(AktentypCode.Hinterlegungsakte);
        V2_2.add(AktentypCode.Gerichtsvollzieherverfahrensakte);
        V2_2.add(AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_I);
        V2_2.add(AktentypCode.Gerichtsvollziehergeschaeftsbuch_DR_II);
        V2_2.add(AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_I);
        V2_2.add(AktentypCode.Gerichtsvollziehergeschaeftsbuch_KB_II);
    }

}
package de.xjustiz.core.models;


public final class TelekommunikationsartCodeLists {

    private TelekommunikationsartCodeLists() {}

    public static final IVersionedCodeList<TelekommunikationsartCode> V2_2;

    static {
        V2_2 = new VersionedCodeList<>("2.2");
        initV2_2_0();
    }

    private static void initV2_2_0() {
        V2_2.add(TelekommunikationsartCode.Email);
        V2_2.add(TelekommunikationsartCode.Fax);
        V2_2.add(TelekommunikationsartCode.Internet);
        V2_2.add(TelekommunikationsartCode.Mobiltelefon);
        V2_2.add(TelekommunikationsartCode.Pager);
        V2_2.add(TelekommunikationsartCode.Sonstige);
        V2_2.add(TelekommunikationsartCode.Telefon);
        V2_2.add(TelekommunikationsartCode.RechtsverbindlicherElektronischerKommunikationsweg);
    }

}
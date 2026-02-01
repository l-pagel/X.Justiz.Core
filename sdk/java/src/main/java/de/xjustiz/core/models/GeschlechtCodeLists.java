package de.xjustiz.core.models;


public final class GeschlechtCodeLists {

    private GeschlechtCodeLists() {}

    public static final IVersionedCodeList<GeschlechtCode> V2_1;

    static {
        V2_1 = new VersionedCodeList<>("2.1");
        initV2_1_0();
    }

    private static void initV2_1_0() {
        V2_1.add(GeschlechtCode.Unbekannt);
        V2_1.add(GeschlechtCode.Maennlich);
        V2_1.add(GeschlechtCode.Weiblich);
        V2_1.add(GeschlechtCode.Divers);
        V2_1.add(GeschlechtCode.Saechlich);
    }

}
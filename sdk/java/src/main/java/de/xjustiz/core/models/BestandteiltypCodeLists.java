package de.xjustiz.core.models;

import java.util.Arrays;

public final class BestandteiltypCodeLists {

    private BestandteiltypCodeLists() {}

    public static final IVersionedCodeList<BestandteiltypCode> V2_4;

    static {
        V2_4 = new VersionedCodeList<>("2.4");
        initV2_4_0();
    }

    private static void initV2_4_0() {
        V2_4.add(BestandteiltypCode.Original);
        V2_4.add(BestandteiltypCode.Repraesentat);
        V2_4.add(BestandteiltypCode.Signaturdatei);
        V2_4.add(BestandteiltypCode.signierte_Vorversion);
        V2_4.add(BestandteiltypCode.Transfervermerk);
        V2_4.add(BestandteiltypCode.Pruefvermerk);
        V2_4.add(BestandteiltypCode.VHN);
        V2_4.add(BestandteiltypCode.hinlaufendes_eEB);
    }

}
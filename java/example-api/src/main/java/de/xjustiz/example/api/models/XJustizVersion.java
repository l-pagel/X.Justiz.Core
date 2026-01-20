package de.xjustiz.example.api.models;

public enum XJustizVersion {
    None(0),
    V2_1_0(210),
    V2_2_1(221),
    V2_3_1(231),
    V2_4_0(240),
    V2_5_1(251),
    V2_6_0(260),
    V3_1_1(311),
    V3_2_1(321),
    V3_3_1(331),
    V3_4_1(341),
    V3_5_1(351),
    V3_6_2(362);

    private final int value;

    XJustizVersion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

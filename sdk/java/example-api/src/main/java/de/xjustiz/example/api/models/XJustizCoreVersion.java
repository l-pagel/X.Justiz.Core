package de.xjustiz.example.api.models;

public enum XJustizCoreVersion {
    V0_2_0(20),
    V_TEST_NOT_AVAILABLE_YET(9999);

    private final int value;

    XJustizCoreVersion(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

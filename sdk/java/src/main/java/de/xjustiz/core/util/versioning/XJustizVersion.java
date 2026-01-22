package de.xjustiz.core.util.versioning;

/**
 * Definiert die XJustiz-Versionen.<br/>
 * <u><b>XJustiz version:</b></u> Defines the XJustiz versions.
 */
public enum XJustizVersion {
    /**
     * Nicht Teil des X.Justiz Standards.
     * Not part of the XJustiz standard.
     */
    NONE(0),

    /**
     * Gültig ab 31.10.2017
     * Valid from 31.10.2017
     */
    V2_1_0(210),

    /**
     * Gültig ab 30.04.2018
     * Valid from 30.04.2018
     */
    V2_2_1(221),

    /**
     * Gültig ab 31.10.2018
     * Valid from 31.10.2018
     */
    V2_3_1(231),

    /**
     * Gültig ab 30.04.2019
     * Valid from 30.04.2019
     */
    V2_4_0(240),

    /**
     * Gültig ab 31.10.2019
     * Valid from 31.10.2019
     */
    V2_5_1(251),

    /**
     * Gültig ab 29.04.2020
     * Valid from 29.04.2020
     */
    V2_6_0(260),

    /**
     * Gültig ab 30.10.2020
     * Valid from 30.10.2020
     */
    V3_1_1(311),

    /**
     * Gültig ab 31.10.2021
     * Valid from 31.10.2021
     */
    V3_2_1(321),

    /**
     * Gültig ab 31.10.2022
     * Valid from 31.10.2022
     */
    V3_3_1(331),

    /**
     * Gültig ab 31.10.2023
     * Valid from 31.10.2023
     */
    V3_4_1(341),

    /**
     * Gültig ab 30.04.2025
     * Valid from 30.04.2025
     */
    V3_5_1(351),

    /**
     * Gültig ab 30.04.2026
     * Valid from 30.04.2026
     */
    V3_6_2(362);

    private final int value;

    XJustizVersion(int value) {
        this.value = value;
    }

    /**
     * Gets the integer value of this version.
     * 
     * @return the integer value
     */
    public int getValue() {
        return value;
    }

    /**
     * Converts a version string (e.g. "3.5.1") to the corresponding enum value.
     * 
     * @param versionString the version string
     * @return the corresponding XJustizVersion, or NONE if not found
     */
    public static XJustizVersion fromString(String versionString) {
        if (versionString == null || versionString.isBlank()) {
            return NONE;
        }
        String normalized = "V" + versionString.replace('.', '_');
        for (XJustizVersion v : values()) {
            if (v.name().equals(normalized)) {
                return v;
            }
        }
        return NONE;
    }

    /**
     * Converts this version to a version string (e.g. "3.5.1").
     * 
     * @return the version string, or empty string for NONE
     */
    public String toVersionString() {
        if (this == NONE) {
            return "";
        }
        return name().substring(1).replace('_', '.');
    }
}

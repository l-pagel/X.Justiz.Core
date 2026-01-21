package de.xjustiz.core.util.versioning;

/**
 * Definiert die X.Justiz Core-Versionen.<br/>
 * <u><b>XJustiz core version:</b></u> Defines the XJustiz Core versions.
 */
public enum XJustizCoreVersion {
    /**
     * Beta-Version, gültig ab 01.01.2026<br/>
     * Beta version, valid from 01.01.2026
     */
    V0_2_0(20, false),

    /**
     * Version ausschliesslich zum Testen<br/>
     * Version for testing purposes only
     */
    V_TEST_NOT_AVAILABLE_YET(9999, true);

    private final int value;
    private final boolean forTestingOnly;

    XJustizCoreVersion(int value, boolean forTestingOnly) {
        this.value = value;
        this.forTestingOnly = forTestingOnly;
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
     * Checks if this version is for testing purposes only.
     * 
     * @return true if for testing only
     */
    public boolean isForTestingOnly() {
        return forTestingOnly;
    }

    /**
     * Converts a version string (e.g. "0.2.0") to the corresponding enum value.
     * 
     * @param versionString the version string
     * @return the corresponding XJustizCoreVersion, or null if not found
     */
    public static XJustizCoreVersion fromString(String versionString) {
        if (versionString == null || versionString.isBlank()) {
            return null;
        }
        String normalized = "V" + versionString.replace('.', '_');
        for (XJustizCoreVersion v : values()) {
            if (v.name().equals(normalized)) {
                return v;
            }
        }
        return null;
    }

    /**
     * Converts this version to a version string (e.g. "0.2.0").
     * 
     * @return the version string
     */
    public String toVersionString() {
        if (this == V_TEST_NOT_AVAILABLE_YET) {
            return "TEST";
        }
        return name().substring(1).replace('_', '.');
    }
}

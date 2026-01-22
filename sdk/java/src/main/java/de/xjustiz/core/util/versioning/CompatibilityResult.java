package de.xjustiz.core.util.versioning;

import java.util.ArrayList;
import java.util.List;

/**
 * Das Ergebnis der Kompatibilitätsprüfung.<br/>
 * <u><b>Compatibility Result:</b></u> The result of the compatibility check.
 */
public class CompatibilityResult {

    private List<XJustizVersion> compatibleXJustizVersions = new ArrayList<>();
    private List<XJustizCoreVersion> compatibleXJustizCoreVersions = new ArrayList<>();

    /**
     * Creates a new CompatibilityResult with empty lists.
     */
    public CompatibilityResult() {
    }

    /**
     * Creates a new CompatibilityResult with the given lists.
     * 
     * @param xJustizVersions     the compatible X.Justiz versions
     * @param xJustizCoreVersions the compatible X.Justiz Core versions
     */
    public CompatibilityResult(List<XJustizVersion> xJustizVersions, List<XJustizCoreVersion> xJustizCoreVersions) {
        this.compatibleXJustizVersions = new ArrayList<>(xJustizVersions);
        this.compatibleXJustizCoreVersions = new ArrayList<>(xJustizCoreVersions);
    }

    /**
     * Eine Liste der kompatiblen X.Justiz-Versionen.<br/>
     * <u><b>Compatible X.Justiz versions:</b></u> A list of compatible X.Justiz
     * versions.
     * 
     * @return list of compatible versions
     */
    public List<XJustizVersion> getCompatibleXJustizVersions() {
        return compatibleXJustizVersions;
    }

    /**
     * Sets the compatible X.Justiz versions.
     * 
     * @param versions the compatible versions
     */
    public void setCompatibleXJustizVersions(List<XJustizVersion> versions) {
        this.compatibleXJustizVersions = versions;
    }

    /**
     * Eine Liste der kompatiblen X.Justiz Core-Versionen.<br/>
     * <u><b>Compatible X.Justiz Core versions:</b></u> A list of compatible
     * X.Justiz Core versions.
     * 
     * @return list of compatible core versions
     */
    public List<XJustizCoreVersion> getCompatibleXJustizCoreVersions() {
        return compatibleXJustizCoreVersions;
    }

    /**
     * Sets the compatible X.Justiz Core versions.
     * 
     * @param versions the compatible core versions
     */
    public void setCompatibleXJustizCoreVersions(List<XJustizCoreVersion> versions) {
        this.compatibleXJustizCoreVersions = versions;
    }
}

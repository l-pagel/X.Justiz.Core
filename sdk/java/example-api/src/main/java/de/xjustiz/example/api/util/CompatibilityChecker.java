package de.xjustiz.example.api.util;

import de.xjustiz.example.api.models.CompatibilityResult;
import de.xjustiz.example.api.models.UebermittlungSchriftgutobjekteNachricht;
import de.xjustiz.example.api.models.XJustizCoreVersion;
import de.xjustiz.example.api.models.XJustizVersion;

import java.util.Arrays;
import java.util.List;

public class CompatibilityChecker {

    public static CompatibilityResult check(UebermittlungSchriftgutobjekteNachricht model) {
        // Stub implementation: returns all versions as compatible because
        // the Java models currently lack the availability metadata/annotations.
        CompatibilityResult result = new CompatibilityResult();
        result.setCompatibleXJustizVersions(Arrays.asList(XJustizVersion.values()));
        result.setCompatibleXJustizCoreVersions(Arrays.asList(XJustizCoreVersion.values()));
        return result;
    }
}

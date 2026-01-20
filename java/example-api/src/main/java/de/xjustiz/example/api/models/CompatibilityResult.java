package de.xjustiz.example.api.models;

import java.util.ArrayList;
import java.util.List;

public class CompatibilityResult {
    private List<XJustizVersion> compatibleXJustizVersions = new ArrayList<>();
    private List<XJustizCoreVersion> compatibleXJustizCoreVersions = new ArrayList<>();

    public List<XJustizVersion> getCompatibleXJustizVersions() {
        return compatibleXJustizVersions;
    }

    public void setCompatibleXJustizVersions(List<XJustizVersion> compatibleXJustizVersions) {
        this.compatibleXJustizVersions = compatibleXJustizVersions;
    }

    public List<XJustizCoreVersion> getCompatibleXJustizCoreVersions() {
        return compatibleXJustizCoreVersions;
    }

    public void setCompatibleXJustizCoreVersions(List<XJustizCoreVersion> compatibleXJustizCoreVersions) {
        this.compatibleXJustizCoreVersions = compatibleXJustizCoreVersions;
    }
}

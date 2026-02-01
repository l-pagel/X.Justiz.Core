package de.xjustiz.core.models;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Implementierung einer versionierten Codeliste.
 * <br>
 * <u><b>Versioned code list:</b></u> Implementation of a versioned code list.
 *
 * @param <T> The type of elements in the list.
 */
public class VersionedCodeList<T> extends ArrayList<T> implements IVersionedCodeList<T> {
    private final String version;

    public VersionedCodeList(String version) {
        this.version = version;
    }

    public VersionedCodeList(String version, Collection<? extends T> c) {
        super(c);
        this.version = version;
    }

    @Override
    public String getVersion() {
        return version;
    }
}

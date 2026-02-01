package de.xjustiz.core.models;

import java.util.List;

/**
 * Eine schreibgeschützte Liste mit Versionsinformationen.
 * <br>
 * <u><b>Versioned code list interface:</b></u> A read-only list with version
 * information.
 *
 * @param <T> The type of elements in the list.
 */
public interface IVersionedCodeList<T> extends List<T> {
    /**
     * Gets the version of the code list.
     * 
     * @return the version string
     */
    String getVersion();
}

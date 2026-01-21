package de.xjustiz.core.util.converter;

import de.xjustiz.core.models.UebermittlungSchriftgutobjekteNachricht;

import java.util.ArrayList;
import java.util.List;

/**
 * Ergebnis des Konvertierungsvorgangs.<br/>
 * <u><b>Conversion result:</b></u> Result of the conversion process.
 */
public class ConversionResult {

    private UebermittlungSchriftgutobjekteNachricht result;
    private List<String> lostData = new ArrayList<>();

    /**
     * Creates an empty ConversionResult.
     */
    public ConversionResult() {
    }

    /**
     * Creates a ConversionResult with the given result and lost data.
     * 
     * @param result   the converted message
     * @param lostData the list of lost data descriptions
     */
    public ConversionResult(UebermittlungSchriftgutobjekteNachricht result, List<String> lostData) {
        this.result = result;
        this.lostData = new ArrayList<>(lostData);
    }

    /**
     * Ruft das konvertierte Objekt ab oder legt dieses fest.<br/>
     * <u><b>Result:</b></u> Gets or sets the converted object.
     * 
     * @return the converted message, or null if conversion failed
     */
    public UebermittlungSchriftgutobjekteNachricht getResult() {
        return result;
    }

    /**
     * Sets the converted result.
     * 
     * @param result the converted message
     */
    public void setResult(UebermittlungSchriftgutobjekteNachricht result) {
        this.result = result;
    }

    /**
     * Ruft die Liste der während der Konvertierung verlorenen Daten ab oder legt
     * diese fest.<br/>
     * <u><b>Lost data:</b></u> Gets or sets the list of data lost during
     * conversion.
     * 
     * @return the list of lost data descriptions
     */
    public List<String> getLostData() {
        return lostData;
    }

    /**
     * Sets the lost data list.
     * 
     * @param lostData the list of lost data descriptions
     */
    public void setLostData(List<String> lostData) {
        this.lostData = lostData;
    }

    /**
     * Checks if any data was lost during conversion.
     * 
     * @return true if data was lost
     */
    public boolean hasLostData() {
        return !lostData.isEmpty();
    }
}

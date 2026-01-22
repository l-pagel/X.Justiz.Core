package de.xjustiz.example.api.util;

import de.xjustiz.example.api.models.UebermittlungSchriftgutobjekteNachricht;
import java.util.ArrayList;
import java.util.List;

public class ConversionResult {
    private UebermittlungSchriftgutobjekteNachricht result;
    private List<String> lostData = new ArrayList<>();

    public UebermittlungSchriftgutobjekteNachricht getResult() {
        return result;
    }

    public void setResult(UebermittlungSchriftgutobjekteNachricht result) {
        this.result = result;
    }

    public List<String> getLostData() {
        return lostData;
    }

    public void setLostData(List<String> lostData) {
        this.lostData = lostData;
    }
}

package de.xjustiz.core.models;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class DokumentklasseCodeMapper {

    private static final Map<String, DokumentklasseCode> MAP;

    static {
        Map<String, DokumentklasseCode> map = new HashMap<>();
        init0(map);
        MAP = Collections.unmodifiableMap(map);
    }

    private static void init0(Map<String, DokumentklasseCode> map) {
        map.put("001", DokumentklasseCode.Andere_Sonstige);
        map.put("001".toLowerCase(), DokumentklasseCode.Andere_Sonstige);
        map.put("003", DokumentklasseCode.Klage_Antrag);
        map.put("003".toLowerCase(), DokumentklasseCode.Klage_Antrag);
        map.put("005", DokumentklasseCode.Anlage);
        map.put("005".toLowerCase(), DokumentklasseCode.Anlage);
        map.put("006", DokumentklasseCode.Urteil);
        map.put("006".toLowerCase(), DokumentklasseCode.Urteil);
        map.put("007", DokumentklasseCode.Beschluss);
        map.put("007".toLowerCase(), DokumentklasseCode.Beschluss);
        map.put("008", DokumentklasseCode.Verfuegung);
        map.put("008".toLowerCase(), DokumentklasseCode.Verfuegung);
        map.put("009", DokumentklasseCode.Vermerk);
        map.put("009".toLowerCase(), DokumentklasseCode.Vermerk);
        map.put("010", DokumentklasseCode.Protokoll);
        map.put("010".toLowerCase(), DokumentklasseCode.Protokoll);
        map.put("011", DokumentklasseCode.Fehlblatt);
        map.put("011".toLowerCase(), DokumentklasseCode.Fehlblatt);
        map.put("012", DokumentklasseCode.Zustellungsdokument);
        map.put("012".toLowerCase(), DokumentklasseCode.Zustellungsdokument);
        map.put("013", DokumentklasseCode.Gutachten);
        map.put("013".toLowerCase(), DokumentklasseCode.Gutachten);
        map.put("014", DokumentklasseCode.Technische_Information);
        map.put("014".toLowerCase(), DokumentklasseCode.Technische_Information);
        map.put("015", DokumentklasseCode.Schreiben);
        map.put("015".toLowerCase(), DokumentklasseCode.Schreiben);
        map.put("016", DokumentklasseCode.Antrag_Behoerde);
        map.put("016".toLowerCase(), DokumentklasseCode.Antrag_Behoerde);
        map.put("017", DokumentklasseCode.Bescheid);
        map.put("017".toLowerCase(), DokumentklasseCode.Bescheid);
        map.put("018", DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        map.put("018".toLowerCase(), DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        map.put("019", DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        map.put("019".toLowerCase(), DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        map.put("020", DokumentklasseCode.Kostendokument);
        map.put("020".toLowerCase(), DokumentklasseCode.Kostendokument);
        map.put("021", DokumentklasseCode.Gerichtsbescheid);
        map.put("021".toLowerCase(), DokumentklasseCode.Gerichtsbescheid);
        map.put("Andere / Sonstige", DokumentklasseCode.Andere_Sonstige);
        map.put("Andere / Sonstige".toLowerCase(), DokumentklasseCode.Andere_Sonstige);
        map.put("Anlage", DokumentklasseCode.Anlage);
        map.put("Anlage".toLowerCase(), DokumentklasseCode.Anlage);
        map.put("Antrag (Behörde)", DokumentklasseCode.Antrag_Behoerde);
        map.put("Antrag (Behörde)".toLowerCase(), DokumentklasseCode.Antrag_Behoerde);
        map.put("Bescheid", DokumentklasseCode.Bescheid);
        map.put("Bescheid".toLowerCase(), DokumentklasseCode.Bescheid);
        map.put("Beschluss", DokumentklasseCode.Beschluss);
        map.put("Beschluss".toLowerCase(), DokumentklasseCode.Beschluss);
        map.put("Einspruch / Widerspruch (Behörde)", DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        map.put("Einspruch / Widerspruch (Behörde)".toLowerCase(), DokumentklasseCode.Einspruch_Widerspruch_Behoerde);
        map.put("Einspruchs- / Widerspruchsbescheid", DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        map.put("Einspruchs- / Widerspruchsbescheid".toLowerCase(), DokumentklasseCode.Einspruchs_Widerspruchsbescheid);
        map.put("Fehlblatt", DokumentklasseCode.Fehlblatt);
        map.put("Fehlblatt".toLowerCase(), DokumentklasseCode.Fehlblatt);
        map.put("Gerichtsbescheid", DokumentklasseCode.Gerichtsbescheid);
        map.put("Gerichtsbescheid".toLowerCase(), DokumentklasseCode.Gerichtsbescheid);
        map.put("Gutachten", DokumentklasseCode.Gutachten);
        map.put("Gutachten".toLowerCase(), DokumentklasseCode.Gutachten);
        map.put("Klage / Antrag", DokumentklasseCode.Klage_Antrag);
        map.put("Klage / Antrag".toLowerCase(), DokumentklasseCode.Klage_Antrag);
        map.put("Kostendokument", DokumentklasseCode.Kostendokument);
        map.put("Kostendokument".toLowerCase(), DokumentklasseCode.Kostendokument);
        map.put("Protokoll", DokumentklasseCode.Protokoll);
        map.put("Protokoll".toLowerCase(), DokumentklasseCode.Protokoll);
        map.put("Schreiben", DokumentklasseCode.Schreiben);
        map.put("Schreiben".toLowerCase(), DokumentklasseCode.Schreiben);
        map.put("Technische Information", DokumentklasseCode.Technische_Information);
        map.put("Technische Information".toLowerCase(), DokumentklasseCode.Technische_Information);
        map.put("Urteil", DokumentklasseCode.Urteil);
        map.put("Urteil".toLowerCase(), DokumentklasseCode.Urteil);
        map.put("Verfügung", DokumentklasseCode.Verfuegung);
        map.put("Verfügung".toLowerCase(), DokumentklasseCode.Verfuegung);
        map.put("Vermerk", DokumentklasseCode.Vermerk);
        map.put("Vermerk".toLowerCase(), DokumentklasseCode.Vermerk);
        map.put("Zustellungsdokument", DokumentklasseCode.Zustellungsdokument);
        map.put("Zustellungsdokument".toLowerCase(), DokumentklasseCode.Zustellungsdokument);
    }

    private DokumentklasseCodeMapper() {}

    /**
     * Maps a string to DokumentklasseCode.
     * @param key the string to map
     * @return the mapped DokumentklasseCode or empty if not found
     */
    public static Optional<DokumentklasseCode> map(String key) {
        if (key == null) return Optional.empty();
        return Optional.ofNullable(MAP.get(key));
    }

    public static Optional<DokumentklasseCode> mapIgnoreCase(String key) {
        if (key == null) return Optional.empty();
        return Optional.ofNullable(MAP.get(key.toLowerCase()));
    }
}
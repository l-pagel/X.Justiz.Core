<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_0300_insolvenz_3_2.xsd
    Version 1.2: SCH-INSO-0026 wurde hinzugefügt.
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ===================================== -->
    <!--          Fachdatensatz INSO           -->
    <!-- ===================================== -->
    
    <!-- Geschäftsregeln für Nachricht 0300001 -->
    <!-- Regeln für den Nachrichtenkopf        -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:nachrichtenkopf">
            <sch:report test="count(tns:aktenzeichen.absender) &gt; 1" id="SCH-INSO-0001">
                [SCH-INSO-0001] Im Nachrichtenkopf darf nur ein Aktenzeichen des Absenders angegeben werden. 
                                Weitere Aktenzeichen können in den Instanzdaten übermittelt werden.
            </sch:report>
            <sch:assert test="count(tns:aktenzeichen.empfaenger) = 1" id="SCH-INSO-0002">
                [SCH-INSO-0002] Im Nachrichtenkopf muss genau ein Aktenzeichen des Empfängers übermittelt werden.
                                Diese Angabe ist für eine automatisierte Zuordnung notwendig.
            </sch:assert>
            <sch:assert test="count(tns:ereignis) = 1" id="SCH-INSO-0003">
                [SCH-INSO-0003] Das Kindelement ereignis wird hier genau einmal erwartet.
                                Für jedes Ereignis hat gesondert jeweils eine Übermittlung zu erfolgen.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:nachrichtenkopf/tns:ereignis">
            <sch:assert test="code = ('038','039','040')" id="SCH-INSO-0004">
                [SCH-INSO-0004] Für das Element ereignis sind nur die Codes 038, 039 oder 040 zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für die Grunddaten von 0300001 -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten">
            <sch:assert test="exists(tns:verfahrensdaten)" id="SCH-INSO-0005">
                [SCH-INSO-0005] Das Kindelement verfahrensdaten wird hier erwartet (Pflichtelement), da Instanzdaten angegeben werden müssen.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten/tns:verfahrensdaten">
            <sch:report test="count(tns:instanzdaten) &lt; 2" id="SCH-INSO-0006">
                [SCH-INSO-0006] Es ist mindestens zweimal das Kindelement instanzdaten mit den Angaben zu Absender und Empfänger zu übergeben. 
                                Ohne diese Angaben kann die automatisierte Auswertung der Daten nicht erfolgen.
            </sch:report>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten/tns:verfahrensdaten/tns:instanzdaten/tns:sachgebiet">
            <sch:assert test="code = '018'" id="SCH-INSO-0007">
                [SCH-INSO-0007] Für das Sachgebiet darf in diesem Kommunikationsszenario nur der Code 018 verwendet werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung">
            <sch:assert test="exists(tns:rolle)" id="SCH-INSO-0008">
                [SCH-INSO-0008] Für jede Beteiligung ist mindestens eine Rolle zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:rolle">
            <sch:assert test="exists(tns:rollennummer)" id="SCH-INSO-0009">
                [SCH-INSO-0009] Damit die Referenzierung weiterer Daten des Fachdatensatzes über die Rollennummer erfolgen kann, 
                                muss diese in der Nachricht für jeden Beteiligten angegeben werden.
            </sch:assert>
            <sch:assert test="exists(tns:rollenbezeichnung)" id="SCH-INSO-0010">
                [SCH-INSO-0010] Für jede Rolle ist mindestens eine Rollenbezeichnung zu übergeben.
            </sch:assert>            
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
            <sch:assert test="exists(tns:beteiligtennummer)" id="SCH-INSO-0011">
                [SCH-INSO-0011] Damit die Referenzierung weiterer Daten des Fachdatensatzes über die Beteiligtennummer erfolgen kann, 
                                muss diese in der Nachricht für jeden Beteiligten angegeben werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für die Fachdaten von 0300001 -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:fachdaten/tns:anteilsinformationen">
            <sch:report test="exists(.) and (//tns:ereignis/code != '038')" id="SCH-INSO-0012">
                [SCH-INSO-0012] Das Element anteilsinformationen ist nur im Zusammenhang mit der Übermittlung einer Nachricht mit Ereignis 038 zulässig.
            </sch:report>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.uebergabe_weitereBeteiligte.0300001/tns:fachdaten/tns:anteilsinformationen/tns:anteilsinhaberschaft">
            <sch:assert test="tns:referenz/tns:ref.rollennummer = //tns:rollennummer[following-sibling::tns:rollenbezeichnung[code='243']]" id="SCH-INSO-0013">
                [SCH-INSO-0013] Das Element anteilsinhaberschaft darf nur auf Rollen mit der Rollenbezeichnung 243 (Anteilsinhaber(in)) referenzieren.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für Nachrichten 0300005 und 0300006 -->
    <!-- Abstrakte Patterns -->
    <sch:pattern abstract="true" id="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:rule context="$pfad">
            <sch:report test="count(tns:xjustiz.fachspezifischeDaten) &lt; 1" id="SCH-INSO-0014">
                [SCH-INSO-0014] Das Kindelement xjustiz.fachspezifischeDaten wird hier erwartet (Pflichtelement). 
            </sch:report>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.existElement.inhalt">
        <sch:rule context="$pfad">
            <sch:report test="count(tns:inhalt) &lt; 1" id="SCH-INSO-0015">
                [SCH-INSO-0015] Das Kindelement inhalt wird hier erwartet (Pflichtelement). 
            </sch:report>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.akte">
        <sch:rule context="$nachricht/tns:schriftgutobjekte">
            <sch:assert test="count(tns:akte) = 1" id="SCH-INSO-0016">
                [SCH-INSO-0016] In diesem Kommunikationsszenario ist genau eine Insolvenzakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.aktentyp">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:aktentyp">
            <sch:assert test="code = '005'" id="SCH-INSO-0017">
                [SCH-INSO-0017] Für den Aktentyp ist der Code 005 für eine Insolvenzakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.eineTeilakte">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt">
            <sch:assert test="count(tns:teilakte) = 1" id="SCH-INSO-0018">
                [SCH-INSO-0018] Hier ist genau eine Teilakte zu übermitteln (Band B).
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.teilaktentyp14">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:teilaktentyp">
            <sch:assert test="code = '014'" id="SCH-INSO-0019">
                [SCH-INSO-0019] Für den Teilaktentyp ist hier der Code 014 (Sonderheft/Sonderband) zu übermitteln.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.anzahlTeilakten">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:inhalt">
            <sch:assert test="count(tns:teilakte) = count(//tns:fachdaten/tns:forderung)" id="SCH-INSO-0020">
                [SCH-INSO-0020] Pro Forderung in den Fachdaten ist eine Teilakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.containernummer">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:identifikation">
            <sch:assert test="count(tns:nummerImUebergeordnetenContainer) = 1" id="SCH-INSO-0021">
                [SCH-INSO-0021] Die Nummer im übergeordneten Container muss angegeben werden. 
                                Hierüber wird die Reihenfolge der Teilakten in Band B übermittelt (für Paginierung).
            </sch:assert>
        </sch:rule>
    </sch:pattern>   
    <sch:pattern abstract="true" id="check.insolvenztabelle.teilaktentyp01">
        <sch:rule context="$nachricht/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:teilaktentyp">
            <sch:assert test="code = '001'" id="SCH-INSO-0022">
                [SCH-INSO-0022] Für den Teilaktentyp ist hier der Code 001 (Andere/Sonstige) zu übermitteln.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.fachdaten.bezugnahmeZumForderungsteil">
        <sch:rule context="$nachricht/tns:fachdaten/tns:forderung/tns:erklaerung/tns:teilerklaerung/tns:bezugnahmeZumForderungsteil">
            <sch:assert test="code = ('001', '002', '003', '004')" id="SCH-INSO-0026">
                [SCH-INSO-0026] Für das Element 'bezugnahmeZumForderungsteil' sind nur die Codes 001, 002, 003 und 004 zulässig 
                (entspricht den Werten Hauptforderung, Zinsen, Kosten und Nebenforderung).
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für Schriftgutobjekte -->
    <sch:pattern is-a="check.insolvenztabelle.akte">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.akte">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005/tns:schriftgutobjekte/tns:akte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/tns:schriftgutobjekte/tns:akte"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.aktentyp">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.aktentyp">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.eineTeilakte">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.eineTeilakte">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>

    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte"/>
    </sch:pattern>  
    
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp14">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp14">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.anzahlTeilakten">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.anzahlTeilakten">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
       
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/tns:schriftgutobjekte/tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.containernummer">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.containernummer">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp01">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp01">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    <!--  Regeln für das fachspezifische Element bezugnahmeZumForderungsteil -->
    <sch:pattern is-a="check.fachdaten.bezugnahmeZumForderungsteil">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.fachdaten.bezugnahmeZumForderungsteil">
        <sch:param name="nachricht" value="tns:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für Nachricht 0300009 -->
    <!-- Regel für das Element ereignis des Nachrichtenkopfs -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.verfahrenseroeffnung.0300009/tns:nachrichtenkopf/tns:ereignis">
            <sch:assert test="code = '048'" id="SCH-INSO-0024">
                [SCH-INSO-0024] Für das Element ereignis ist nur der Code 048 (Mitteilung der Verfahrensid) zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    
    
    <!-- Geschäftsregeln für Nachricht 0300014 -->
    <!-- Regel für das Element ereignis des Nachrichtenkopfs -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.inso.vollzaehligkeitsmitteilung.0300014/tns:nachrichtenkopf/tns:ereignis">
            <sch:assert test="code = '047'" id="SCH-INSO-0025">
                [SCH-INSO-0025] Für das Element ereignis ist nur der Code 047 (Vollzähligkeitsmitteilung) zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>
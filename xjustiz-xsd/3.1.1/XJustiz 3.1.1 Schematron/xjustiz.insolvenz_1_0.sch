<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_0300_insolvenz_3_0.xsd
    Version 1.0 (April 2020)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="xj"/>
    
    <!-- ===================================== -->
    <!--          Fachdatensatz INSO           -->
    <!-- ===================================== -->
    
    <!-- Geschäftsregeln für Nachricht 0300001 -->
    <!-- Regeln für den Nachrichtenkopf        -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:nachrichtenkopf">
            <sch:report test="count(xj:aktenzeichen.absender) &gt; 1">
                Im Nachrichtenkopf darf nur ein Aktenzeichen des Absenders angegeben werden. 
                Weitere Aktenzeichen können in den Instanzdaten übermittelt werden.
            </sch:report>
            <sch:assert test="count(xj:aktenzeichen.empfaenger) = 1">
                Im Nachrichtenkopf muss genau ein Aktenzeichen des Empfängers übermittelt werden.
                Diese Angabe ist für eine automatisierte Zuordnung notwendig.
            </sch:assert>
            <sch:assert test="count(xj:ereignis) = 1">
                Das Kindelement ereignis wird hier genau einmal erwartet.
                Für jedes Ereignis hat gesondert jeweils eine Übermittlung zu erfolgen.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:nachrichtenkopf/xj:ereignis">
            <sch:assert test="code = ('038','039','040')">
                Für das Element ereignis sind nur die Codes 038, 039 oder 040 zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für die Grunddaten von 0300001 -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten">
            <sch:assert test="exists(xj:verfahrensdaten)">
                Das Kindelement verfahrensdaten wird hier erwartet (Pflichtelement), da Instanzdaten angegeben werden müssen.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten/xj:verfahrensdaten">
            <sch:report test="count(xj:instanzdaten) &lt; 2">
                Es ist mindestens zweimal das Kindelement instanzdaten mit den Angaben zu Absender und Empfänger zu übergeben, 
                ohne diese Angaben kann die automatisierte Auswertung der Daten nicht erfolgen.
            </sch:report>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten/xj:verfahrensdaten/xj:instanzdaten/xj:sachgebiet">
            <sch:assert test="code = '018'">
                Für das Sachgebiet darf in diesem Kommunikationsszenario nur der Code 018 verwendet werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten/xj:verfahrensdaten/xj:beteiligung">
            <sch:assert test="exists(xj:rolle)">
                Für jede Beteiligung ist mindestens eine Rolle zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten/xj:verfahrensdaten/xj:beteiligung/xj:rolle">
            <sch:assert test="exists(xj:rollennummer)">
                Damit die Referenzierung weiterer Daten des Fachdatensatzes über die Rollennummer erfolgen kann, 
                muss diese in der Nachricht für jeden Beteiligten angegeben werden.
            </sch:assert>
            <sch:assert test="exists(xj:rollenbezeichnung)">
                Für jede Rolle ist mindestens eine Rollenbezeichnung zu übergeben.
            </sch:assert>            
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:grunddaten/xj:verfahrensdaten/xj:beteiligung/xj:beteiligter">
            <sch:assert test="exists(xj:beteiligtennummer)">
                Damit die Referenzierung weiterer Daten des Fachdatensatzes über die Beteiligtennummer erfolgen kann, 
                muss diese in der Nachricht für jeden Beteiligten angegeben werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für die Fachdaten von 0300001 -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:fachdaten/xj:anteilsinformationen">
            <sch:report test="exists(.) and (//xj:ereignis/code != '038')">
                Das Element anteilsinformationen ist nur im Zusammenhang mit der Übermittlung einer Nachricht mit Ereignis 038 zulässig.
            </sch:report>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.uebergabe_weitereBeteiligte.0300001/xj:fachdaten/xj:anteilsinformationen/xj:anteilsinhaberschaft">
            <sch:assert test="xj:referenz/xj:ref.rollennummer = //xj:rollennummer[following-sibling::xj:rollenbezeichnung[code='243']]">
                Das Element anteilsinhaberschaft darf nur auf Rollen mit der Rollenbezeichnung 243 (Anteilsinhaber(in)) referenzieren.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für Nachrichten 0300005 und 0300006 -->
    <!-- Abstrakte Patterns -->
    <sch:pattern abstract="true" id="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:rule context="$pfad">
            <sch:report test="count(xj:xjustiz.fachspezifischeDaten) &lt; 1">
                Das Kindelement xjustiz.fachspezifischeDaten wird hier erwartet (Pflichtelement). 
            </sch:report>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.existElement.inhalt">
        <sch:rule context="$pfad">
            <sch:report test="count(xj:inhalt) &lt; 1">
                Das Kindelement inhalt wird hier erwartet (Pflichtelement). 
            </sch:report>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.akte">
        <sch:rule context="$nachricht/xj:schriftgutobjekte">
            <sch:assert test="count(xj:akte) = 1">
                In diesem Kommunikationsszenario ist genau eine Insolvenzakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.aktentyp">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:aktentyp">
            <sch:assert test="code = '005'">
                Für den Aktentyp ist der Code 005 für eine Insolvenzakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.eineTeilakte">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt">
            <sch:assert test="count(xj:teilakte) = 1">
                Hier ist genau eine Teilakte zu übermitteln (Band B).
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    <sch:pattern abstract="true" id="check.insolvenztabelle.teilaktentyp14">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:teilaktentyp">
            <sch:assert test="code = '014'">
                Für den Teilaktentyp ist hier der Code 014 (Sonderheft/Sonderband) zu übermitteln.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.anzahlTeilakten">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:inhalt">
            <sch:assert test="count(xj:teilakte) = count(//xj:fachdaten/xj:forderung)">
                Pro Forderung in den Fachdaten ist eine Teilakte zu übergeben.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern abstract="true" id="check.insolvenztabelle.containernummer">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:identifikation">
            <sch:assert test="count(xj:nummerImUebergeordnetenContainer) = 1">
                Die Nummer im übergeordneten Container muss angegeben werden. 
                Hierüber wird die Reihenfolge der Teilakten in Band B übermittelt (für Paginierung).
            </sch:assert>
        </sch:rule>
    </sch:pattern>   
    <sch:pattern abstract="true" id="check.insolvenztabelle.teilaktentyp01">
        <sch:rule context="$nachricht/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:teilaktentyp">
            <sch:assert test="code = '001'">
                Für den Teilaktentyp ist hier der Code 001 (Andere/Sonstige) zu übermitteln.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Regeln für Schriftgutobjekte -->
    <sch:pattern is-a="check.insolvenztabelle.akte">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.akte">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005/xj:schriftgutobjekte/xj:akte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/xj:schriftgutobjekte/xj:akte"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.aktentyp">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.aktentyp">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.eineTeilakte">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.eineTeilakte">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>

    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte"/>
    </sch:pattern>  
    
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp14">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp14">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.inhalt">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.anzahlTeilakten">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.anzahlTeilakten">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
       
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.existElement.fachspezifischeDaten">
        <sch:param name="pfad" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006/xj:schriftgutobjekte/xj:akte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte/xj:xjustiz.fachspezifischeDaten/xj:inhalt/xj:teilakte"/>
    </sch:pattern>
        
    <sch:pattern is-a="check.insolvenztabelle.containernummer">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.containernummer">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp01">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.0300005"/>
    </sch:pattern>
    <sch:pattern is-a="check.insolvenztabelle.teilaktentyp01">
        <sch:param name="nachricht" value="xj:nachricht.inso.insolvenztabelle.uebergabe.aenderung.0300006"/>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für Nachricht 0300007 -->
    <!-- Regel für das Element ereignis des Nachrichtenkopfs -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.mizi_mitteilung.0300007/xj:nachrichtenkopf/xj:ereignis">
            <sch:assert test="code = ('049','050','051','052')">
                Für das Element ereignis sind nur die Codes 049, 050, 051 und 052 zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    
    <!-- Geschäftsregeln für Nachricht 0300009 -->
    <!-- Regel für das Element ereignis des Nachrichtenkopfs -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.verfahrenseroeffnung.0300009/xj:nachrichtenkopf/xj:ereignis">
            <sch:assert test="code = '048'">
                Für das Element ereignis ist nur der Code 048 (Mitteilung der Verfahrensid) zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>    
    
    
    <!-- Geschäftsregeln für Nachricht 0300014 -->
    <!-- Regel für das Element ereignis des Nachrichtenkopfs -->
    <sch:pattern>
        <sch:rule context="xj:nachricht.inso.vollzaehligkeitsmitteilung.0300014/xj:nachrichtenkopf/xj:ereignis">
            <sch:assert test="code = '047'">
                Für das Element ereignis ist nur der Code 047 (Vollzähligkeitsmitteilung) zulässig.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>
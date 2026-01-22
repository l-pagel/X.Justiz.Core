<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für das 
    XJustiz-Fachmodul xjustiz_0500_straf_3_x.xsd
    Version 1.2 für XJustiz ab Version 3.5
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ===================================== -->
    <!--     Fachdatensätze STRAF & WebReg     -->
    <!-- ===================================== -->
    
    <sch:pattern>
        
        <!-- Abstrakte Regeln -->
        
        <!-- Geschäftsregeln für Nachricht 0500001 (schRuleSet) -->
        <sch:rule id="rule-SCH-STRAF-0002" abstract="true">
            <sch:assert id="SCH-STRAF-0002" test="exists(tns:delikt)">
                [SCH-STRAF-0002] In diesem Kommunikationsszenario muss das Element 'delikt' mindestens einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        
        <!-- Geschäftsregel für Nachricht 0500006 (schRuleSet) -->
        <sch:rule id="rule-SCH-STRAF-0003" abstract="true">
            <sch:assert id="SCH-STRAF-0003" test="exists(tns:erledigung|tns:entscheidung)">
                [SCH-STRAF-0003] Es muss in der Nachricht entweder das Element 'erledigung' oder das Element 'entscheidung' oder beide Elemente angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <!-- Geschäftsregeln für Type.STRAF.Asservate (schRuleSet) -->
        <sch:rule id="rule-SCH-STRAF-0004" abstract="true">
            <sch:assert id="SCH-STRAF-0004"
                test="if (//tns:ereignis/code = '285') then exists(tns:auswahl_asservatmitteilung/tns:statusmitteilung) else true()">
                [SCH-STRAF-0004] Da im Nachrichtenkopf als Ereignis der Wert "Rückmeldung auf Asservatenanlieferung" (Code 285) angegeben wurde, 
                muss in der Auswahl zur Asservatmitteilung das Element 'statusmitteilung' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0005" abstract="true">
            <sch:assert id="SCH-STRAF-0005"
                test="if (//tns:ereignis/code = '284' or //tns:ereignis/code = '288') then exists(tns:auswahl_asservatmitteilung/tns:auftrag) else true()">
                [SCH-STRAF-0005] Da im Nachrichtenkopf als Ereignis der Wert "Rückmeldung auf Statusanfrage Asservat" (Code 284) oder 
                "Entscheidung zu Beschädigung oder Zerstörung Asservat" (Code 288) angegeben wurde, muss in der Auswahl zur Asservatmitteilung 
                das Element 'auftrag' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0006" abstract="true">
            <sch:assert id="SCH-STRAF-0006"
                test="if (//tns:ereignis/code = '282') then exists(tns:grund) else true()">
                [SCH-STRAF-0006] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'grund' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0007" abstract="true">
            <sch:assert id="SCH-STRAF-0007"
                test="if (//tns:ereignis/code = '282') then exists(tns:gegenstandsart) else true()">
                [SCH-STRAF-0007] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'gegenstandsart' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0008" abstract="true">
            <sch:assert id="SCH-STRAF-0008"
                test="if (//tns:ereignis/code = '282') then exists(tns:aufbewahrungsbehoerde) else true()">
                [SCH-STRAF-0008] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'aufbewahrungsbehoerde' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0009" abstract="true">
            <sch:assert id="SCH-STRAF-0009"
                test="if (//tns:ereignis/code = '282') then exists(tns:gefahrgut) else true()">
                [SCH-STRAF-0009] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'gefahrgut' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0010" abstract="true">
            <sch:assert id="SCH-STRAF-0010"
                test="if (//tns:ereignis/code = '282') then exists(tns:lagerhinweis) else true()">
                [SCH-STRAF-0010] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'lagerhinweis' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0011" abstract="true">
            <sch:assert id="SCH-STRAF-0011"
                test="if (//tns:ereignis/code = '282') then exists(tns:bezeichnung) else true()">
                [SCH-STRAF-0011] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'bezeichnung' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0012" abstract="true">
            <sch:assert id="SCH-STRAF-0012"
                test="if (//tns:ereignis/code = '282') then exists(tns:menge) else true()">
                [SCH-STRAF-0012] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'menge' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0013" abstract="true">
            <sch:assert id="SCH-STRAF-0013"
                test="if (//tns:ereignis/code = '282') then exists(tns:einheit) else true()">
                [SCH-STRAF-0013] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'einheit' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0014" abstract="true">
            <sch:assert id="SCH-STRAF-0014"
                test="if (//tns:ereignis/code = '282') then exists(tns:herkunft) else true()">
                [SCH-STRAF-0014] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'herkunft' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0015" abstract="true">
            <sch:assert id="SCH-STRAF-0015"
                test="if (//tns:ereignis/code = '282') then exists(tns:gruppe) else true()">
                [SCH-STRAF-0015] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'gruppe' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0016" abstract="true">
            <sch:assert id="SCH-STRAF-0016"
                test="if (//tns:ereignis/code = '282') then exists(tns:laufendeNummer) else true()">
                [SCH-STRAF-0016] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'laufendeNummer' angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-STRAF-0017" abstract="true">
            <sch:assert id="SCH-STRAF-0017"
                test="if (//tns:ereignis/code = '282') then exists(tns:einlagerungsdatum) else true()">
                [SCH-STRAF-0017] Da im Nachrichtenkopf als Ereignis der Wert "Anbietung Asservat" (Code 282) angegeben wurde, muss hier das Element 'einlagerungsdatum' angegeben werden.
            </sch:assert>
        </sch:rule>
        
        <!-- Geschäftsregel für Nachricht 0500060 (schRuleSet) -->
        <sch:rule id="rule-SCH-WEBREG-0001" abstract="true">
            <sch:assert id="SCH-WEBREG-0001" test="exists(tns:anordnungsart)">
                [SCH-WEBREG-0001] Wenn das Element 'geldanordnung' übermittelt wird, muss auch das Kindelement 'anordungsart' angegeben werden.
            </sch:assert>
        </sch:rule>
    
    
        <!-- Konkrete Regeln -->
    
        <sch:rule context="tns:nachricht.straf.ermittlungsErkenntnisverfahren.0500001//tns:tat">
            <sch:extends rule="rule-SCH-STRAF-0002"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.straf.verfahrensausgangsmitteilung.justizZuExtern.0500006//tns:fachdaten">
            <sch:extends rule="rule-SCH-STRAF-0003"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.straf.verfahrensausgangsmitteilung.justizZuExtern.0500006//tns:asservate">
            <sch:extends rule="rule-SCH-STRAF-0004"/>
            <sch:extends rule="rule-SCH-STRAF-0005"/>
            <sch:extends rule="rule-SCH-STRAF-0006"/>
            <sch:extends rule="rule-SCH-STRAF-0007"/>
            <sch:extends rule="rule-SCH-STRAF-0008"/>
            <sch:extends rule="rule-SCH-STRAF-0009"/>
            <sch:extends rule="rule-SCH-STRAF-0010"/>
            <sch:extends rule="rule-SCH-STRAF-0011"/>
            <sch:extends rule="rule-SCH-STRAF-0012"/>
            <sch:extends rule="rule-SCH-STRAF-0013"/>
            <sch:extends rule="rule-SCH-STRAF-0014"/>
            <sch:extends rule="rule-SCH-STRAF-0015"/>
            <sch:extends rule="rule-SCH-STRAF-0016"/>
            <sch:extends rule="rule-SCH-STRAF-0017"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.straf.asservate.0500017//tns:asservate">
            <sch:extends rule="rule-SCH-STRAF-0004"/>
            <sch:extends rule="rule-SCH-STRAF-0005"/>
            <sch:extends rule="rule-SCH-STRAF-0006"/>
            <sch:extends rule="rule-SCH-STRAF-0007"/>
            <sch:extends rule="rule-SCH-STRAF-0008"/>
            <sch:extends rule="rule-SCH-STRAF-0009"/>
            <sch:extends rule="rule-SCH-STRAF-0010"/>
            <sch:extends rule="rule-SCH-STRAF-0011"/>
            <sch:extends rule="rule-SCH-STRAF-0012"/>
            <sch:extends rule="rule-SCH-STRAF-0013"/>
            <sch:extends rule="rule-SCH-STRAF-0014"/>
            <sch:extends rule="rule-SCH-STRAF-0015"/>
            <sch:extends rule="rule-SCH-STRAF-0016"/>
            <sch:extends rule="rule-SCH-STRAF-0017"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.straf.webreg.eintragungsmitteilung.0500060//tns:geldanordnung">
            <sch:extends rule="rule-SCH-WEBREG-0001"/>
        </sch:rule>
        
    </sch:pattern>
</sch:schema>

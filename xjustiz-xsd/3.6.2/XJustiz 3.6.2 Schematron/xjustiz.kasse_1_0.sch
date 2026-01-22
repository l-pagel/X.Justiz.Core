<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_2000_kasse_3_0.xsd
    Version 1.0
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ===================================== -->
    <!--          Fachdatensatz KASSE          -->
    <!-- ===================================== -->
    
    <sch:pattern>

        <!-- Geschäftsregeln für Nachricht Sollstellung (2000001) -->
        
        <!-- Abstrakte Regeln -->
        <sch:rule id="rule-SCH-KASSE-0001" abstract="true">
            <sch:assert id="SCH-KASSE-0001" test="exists(tns:verfahrensdaten)">
                [SCH-KASSE-0001] In diesem Kommunikationsszenario muss das Element 'verfahrensdaten' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0002" abstract="true">
            <sch:assert id="SCH-KASSE-0002" test="count(tns:instanzdaten) = 1">
                [SCH-KASSE-0002] Das Element 'instanzdaten' muss genau einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0003" abstract="true">
            <sch:assert id="SCH-KASSE-0003" test="exists(tns:sachgebiet)">
                [SCH-KASSE-0003] In diesem Kommunikationsszenario muss das Element 'sachgebiet' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0004" abstract="true">
            <sch:assert id="SCH-KASSE-0004" test="exists(tns:aktenzeichen)">
                [SCH-KASSE-0004] In diesem Kommunikationsszenario muss das Element 'aktenzeichen' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0005" abstract="true">
            <sch:assert id="SCH-KASSE-0005" test="exists(tns:telekommunikation)">
                [SCH-KASSE-0005] In diesem Kommunikationsszenario muss das Element 'telekommunikation' mindestens einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0006" abstract="true">
            <sch:assert id="SCH-KASSE-0006" test="exists(tns:beteiligung)">
                [SCH-KASSE-0006] In diesem Kommunikationsszenario muss das Element 'beteiligung' mindestens einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0007" abstract="true">
            <sch:assert id="SCH-KASSE-0007" test="exists(tns:rolle)">
                [SCH-KASSE-0007] In diesem Kommunikationsszenario muss das Element 'rolle' mindestens einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0008" abstract="true">
            <sch:assert id="SCH-KASSE-0008" test="exists(tns:rollennummer)">
                [SCH-KASSE-0008] In diesem Kommunikationsszenario muss das Element 'rollennummer' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0009" abstract="true">
            <sch:assert id="SCH-KASSE-0009" test="exists(tns:rollenbezeichnung)">
                [SCH-KASSE-0009] In diesem Kommunikationsszenario muss das Element 'rollenbezeichnung' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0010" abstract="true">
            <sch:assert id="SCH-KASSE-0010"
                test="if (ancestor::tns:beteiligung/tns:rolle/tns:rollenbezeichnung/code  != '364') then count(tns:anschrift) = 1 else true()">
                [SCH-KASSE-0010] Da als Rollenbezeichnung nicht 'Kostenbeamte(r)' (Code 364) angegeben wurde, 
                muss hier das Element 'anschrift' genau einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0011" abstract="true">
            <sch:assert id="SCH-KASSE-0011"
                test="if (tns:anschriftstyp/code = '011') then true() else exists(tns:strasse)">
                [SCH-KASSE-0011] Da als Anschriftstyp nicht "ohne festen Wohnsitz" (= Code 011) angegeben wurde, 
                muss in diesem Kommunikationsszenario das Element 'strasse' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0012" abstract="true">
            <sch:assert id="SCH-KASSE-0012"
                test="if (tns:anschriftstyp/code = '011') then true() else exists(tns:hausnummer)">
                [SCH-KASSE-0012] Da als Anschriftstyp nicht "ohne festen Wohnsitz" (= Code 011) angegeben wurde, 
                muss in diesem Kommunikationsszenario das Element 'hausnummer' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0013" abstract="true">
            <sch:assert id="SCH-KASSE-0013"
                test="if (tns:anschriftstyp/code = '011') then true() else exists(tns:postleitzahl)">
                [SCH-KASSE-0013] Da als Anschriftstyp nicht "ohne festen Wohnsitz" (= Code 011) angegeben wurde, 
                muss in diesem Kommunikationsszenario das Element 'postleitzahl' übermittelt werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-KASSE-0014" abstract="true">
            <sch:assert id="SCH-KASSE-0014"
                test="if (tns:anschriftstyp/code = '011') then true() else exists(tns:ort)">
                [SCH-KASSE-0014] Da als Anschriftstyp nicht "ohne festen Wohnsitz" (= Code 011) angegeben wurde, 
                muss in diesem Kommunikationsszenario das Element 'ort' übermittelt werden.
            </sch:assert>
        </sch:rule>
       
        <!-- Konkrete Regeln -->
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:grunddaten">
            <sch:extends rule="rule-SCH-KASSE-0001"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:verfahrensdaten">
            <sch:extends rule="rule-SCH-KASSE-0002"/>
            <sch:extends rule="rule-SCH-KASSE-0006"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:instanzdaten">
            <sch:extends rule="rule-SCH-KASSE-0003"/>
            <sch:extends rule="rule-SCH-KASSE-0004"/>
            <sch:extends rule="rule-SCH-KASSE-0005"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:beteiligung">
            <sch:extends rule="rule-SCH-KASSE-0007"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:rolle">
            <sch:extends rule="rule-SCH-KASSE-0008"/>
            <sch:extends rule="rule-SCH-KASSE-0009"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001//tns:natuerlichePerson">
            <sch:extends rule="rule-SCH-KASSE-0010"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.kasse.sollstellung.2000001/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter/tns:auswahl_beteiligter/tns:natuerlichePerson/tns:anschrift">
            <sch:extends rule="rule-SCH-KASSE-0011"/>
            <sch:extends rule="rule-SCH-KASSE-0012"/>
            <sch:extends rule="rule-SCH-KASSE-0013"/>
            <sch:extends rule="rule-SCH-KASSE-0014"/>
        </sch:rule>
        
    </sch:pattern>
    
</sch:schema>

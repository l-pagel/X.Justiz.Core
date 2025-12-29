<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_1400_zwangsversteigerung_3_1.xsd
    Version 1.1
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ================================================= -->
    <!--      Fachdatensatz Zwangsversteigerung (ZVG)      -->
    <!-- ================================================= -->
    
    <sch:pattern>
        <!-- Abstrakte Regeln -->
        <!-- Geschäftsregeln für Nachricht 1400002 (schRuleSet) -->
        <sch:rule id="rule-SCH-ZVG-0001" abstract="true">
            <sch:assert id="SCH-ZVG-0001" test="exists(tns:beteiligtennummer)">
                [SCH-ZVG-0001] In den Grunddaten der Nachricht muss die Beteiligtennummer angegeben werden, weil auf diese referenziert wird.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-ZVG-0002" abstract="true">
            <sch:assert id="SCH-ZVG-0002" test="code = '01'">
                [SCH-ZVG-0002] In den Fachdaten der Nachricht muss für die Nachrichtenart zwingend der Code '01' (Nachricht gem. § 41 ZVG) angegeben werden.
            </sch:assert>
        </sch:rule>
        <sch:rule id="rule-SCH-ZVG-0003" abstract="true">
            <sch:assert id="SCH-ZVG-0003" test="exists(tns:verfahrensdaten) and exists(tns:verfahrensdaten/tns:beteiligung)">
                [SCH-ZVG-0003] In den Grunddaten der Nachricht müssen die Elemente 'verfahrensdaten' und 'beteiligung' angegeben werden, 
                weil das Element 'beteiligung/beteiligter/beteiligtennummer' angegeben werden muss.
            </sch:assert>
        </sch:rule>
        
        <!-- Konkrete Regeln -->
        <sch:rule context="tns:nachricht.zvg.zwangsversteigerungsInfo.1400002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
            <sch:extends rule="rule-SCH-ZVG-0001"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.zvg.zwangsversteigerungsInfo.1400002//tns:nachrichtenart">
            <sch:extends rule="rule-SCH-ZVG-0002"/>
        </sch:rule>
        <sch:rule context="tns:nachricht.zvg.zwangsversteigerungsInfo.1400002//tns:grunddaten">
            <sch:extends rule="rule-SCH-ZVG-0003"/>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>

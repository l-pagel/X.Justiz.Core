<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_1400_zwangsversteigerung_3_0.xsd
    Version 1.0
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ================================================= -->
    <!--      Fachdatensatz Zwangsversteigerung (ZVG)      -->
    <!-- ================================================= -->
    
    <!-- Geschäftsregeln für Nachricht 1400002 -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.zvg.zwangsversteigerungsInfo.1400002/tns:grunddaten/tns:verfahrensdaten/tns:beteiligung/tns:beteiligter">
            <sch:assert test="exists(tns:beteiligtennummer)" id="SCH-ZVG-0001">
                [SCH-ZVG-0001] In den Grunddaten der Nachricht muss die Beteiligtennummer angegeben werden, weil auf diese referenziert wird.
            </sch:assert>
        </sch:rule>
        <sch:rule context="tns:nachricht.zvg.zwangsversteigerungsInfo.1400002/tns:fachdaten/tns:nachrichtenart">
            <sch:assert test="code='01'" id="SCH-ZVG-0002">
                [SCH-ZVG-0002] In den Fachdaten der Nachricht muss für die Nachrichtenart zwingend der Code '01' (Nachricht gem. § 41 ZVG) angegeben werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
</sch:schema>

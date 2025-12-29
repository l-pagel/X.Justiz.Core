<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_0500_straf_3_3.xsd
    Version 1.0
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" queryBinding="xslt2"
            xmlns:xs ="http://www.w3.org/2001/XMLSchema">
    <sch:ns uri="http://www.xjustiz.de" prefix="tns"/>
    
    <!-- ===================================== -->
    <!--          Fachdatensatz STRAF          -->
    <!-- ===================================== -->
    
    <!-- Geschäftsregeln für Nachricht 0500001 -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.straf.ermittlungsErkenntnisverfahren.0500001/tns:fachdaten/tns:erledigung">
            <sch:assert test="exists(tns:art)" id="SCH-STRAF-0001">
                [SCH-STRAF-0001] In diesem Kommunikationsszenario muss das Element 'art' übermittelt werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    <sch:pattern>
        <sch:rule context="tns:nachricht.straf.ermittlungsErkenntnisverfahren.0500001/tns:fachdaten/tns:tat">
            <sch:assert test="exists(tns:delikt)" id="SCH-STRAF-0002">
                [SCH-STRAF-0002] In diesem Kommunikationsszenario muss das Element 'delikt' mindestens einmal übermittelt werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Geschäftsregel für Nachricht 0500006 -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.straf.verfahrensausgangsmitteilung.justizZuExtern.0500006/tns:fachdaten">
            <sch:assert test="exists(tns:erledigung|tns:entscheidung)" id="SCH-STRAF-0003">
                [SCH-STRAF-0003] Es muss in der Nachricht entweder das Element 'erledigung' oder 
                das Element 'entscheidung' oder beide Elemente angegeben werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
    <!-- Geschäftsregel für Nachricht 0500060 (Wettbewerbsregister) -->
    <sch:pattern>
        <sch:rule context="tns:nachricht.straf.webreg.eintragungsmitteilung.0500060/tns:fachdaten/tns:straf.anordnungsinhalt/tns:geldanordnung">
            <sch:assert test="exists(tns:anordnungsart)" id="SCH-WEBREG-0001">
                [SCH-WEBREG-0001] Wenn das Element 'geldanordnung' übermittelt wird, muss auch das Kindelement 
                'anordungsart' angegeben werden.
            </sch:assert>
        </sch:rule>
    </sch:pattern>
    
</sch:schema>

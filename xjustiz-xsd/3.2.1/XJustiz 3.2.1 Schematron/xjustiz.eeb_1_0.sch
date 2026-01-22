<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz EEB
    Version 1.0.1 (Oktober 2020; Änderung: ID in Fehlertext aufgenommen)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Fachdatensatz EEB            -->
	<!-- ===================================== -->


	<!-- EEB - NACHRICHT 2200007 -->

			<!-- EEB - NACHRICHTENKOPF-GESCHAEFTSREGEL: -->
			<sch:pattern>
				<!-- Kardinalitaet: Das Element 'fremdeNachrichtenID' muss genau einmal vorkommen! -->
				<sch:rule context="tns:nachricht.eeb.zuruecklaufend.2200007/tns:nachrichtenkopf">
					<sch:assert test="count(tns:fremdeNachrichtenID) = 1" id="SCH-EEB-0001">[SCH-EEB-0001] Nachrichtenkopf: Das Element 'fremdeNachrichtenID' muss genau einmal vorkommen!</sch:assert>
				</sch:rule>
			</sch:pattern>
	
	<!-- /EEB - NACHRICHT 2200007 -->

</sch:schema>
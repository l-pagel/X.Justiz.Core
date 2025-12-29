<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz ZTR
    Version 1.0.0 (Oktober 2020)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Fachdatensatz ZTR           -->
	<!-- ===================================== -->

	<!-- individuelle Regeln - Nachrichten - Fachdaten -->
	<!-- nachricht.ztr.sterbefall.input.3200001 -->
	<sch:pattern id="SCH-ZTR-0001" abstract="true">
		<!-- Kardinalitaet: Das Element 'urkundentyp' muss genau einmal vorkommen -->
		<sch:rule context="$nachrichtenName/tns:fachdaten/tns:sterbefall/tns:erbfolgerelevanteInformationen/tns:urkunde">
			<sch:assert test="count(tns:urkundentyp) = 1">[SCH-ZTR-0001] Fachdaten: Das Element 'urkundentyp' muss genau einmal vorkommen!</sch:assert>
		</sch:rule>
	</sch:pattern>
	
	<sch:pattern is-a="SCH-ZTR-0001">
		<sch:param name="nachrichtenName" value="tns:nachricht.ztr.sterbefall.input.3200001"/>
	</sch:pattern>
	    
</sch:schema>
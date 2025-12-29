<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Grunddatensatz
    Version 1.0.0 (Oktober 2020)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Grunddatensatz GDS           -->
	<!-- ===================================== -->

	<!-- GDS - CODELISTEN-GESCHAEFTSREGELN: -->
		<!-- Vertraulichkeitsstufe; Werteeinschränkung per Schematron  Type.GDS.Akte, Type.GDS.Teilakte, Type.GDS.Dokument
		Aufgrund der Unzulässigkeit der elektronischen Übermittlung von geheimen (001) oder streng geheimen (004) Schriftgutobjekten per EGVP
		soll auf diese Werte in der Codeliste verzichtet werden	-->
		<!-- 'Code.GDS.Vertraulichkeitsstufe.Typ3' urn:xoev-de:xdomea:codeliste:vertraulichkeitsstufe-->
		<sch:pattern id="SCH-GDS-0001" abstract="true">
			<!-- Eingeschraenkte Werte zur Codeliste 'GDS.Vertraulichkeitsstufe.Typ3' -->
			<sch:rule context="//tns:schriftgutobjekte/$sgoTypename/tns:vertraulichkeitsstufe">
				<sch:assert test="not(code = ('001','004'))">[SCH-GDS-001] Codeliste: Es dürfen zum Element 'vertraulichkeitsstufe' die folgenden Codelistenschlüssel der Typ3-Codeliste 'GDS.Vertraulichkeitsstufe' nicht genutzt werden: '001','004!</sch:assert>
			</sch:rule>	
		</sch:pattern>
	
	<!-- GDS - angewandte Regeln in Nachrichten-->
		<!-- Eingeschraenkte Werte zur Codeliste 'GDS.Vertraulichkeitsstufe.Typ3' -->
		<sch:pattern is-a="SCH-GDS-0001">
			<sch:param name="sgoTypename" value="tns:akte"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-GDS-0001">
			<sch:param name="sgoTypename" value="tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:teilakte"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-GDS-0001">
			<sch:param name="sgoTypename" value="tns:akte/tns:xjustiz.fachspezifischeDaten/tns:inhalt/tns:dokument"/>
		</sch:pattern>
		<sch:pattern is-a="SCH-GDS-0001">
			<sch:param name="sgoTypename" value="tns:dokument"/>
		</sch:pattern>
		
	    
</sch:schema>
<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Grunddatensatz
    Version 1.3.0 (Juli 2022: SCH-GDS-0005, SCH-GDS-0011: Veränderten Wert zu Code-Schlüssel '002' der Typ3-Codeliste 'GDS.Vertraulichkeitsstufe' berücksichtigt.)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron" 
			xmlns:xs ="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
	<sch:ns uri="http://www.xjustiz.de" prefix="tns" />

	<!-- ===================================== -->
	<!--          Grunddatensatz GDS           -->
	<!-- ===================================== -->


	<!-- GDS - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
	
		<!-- Individuelle Rules -->
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' (und damit das Elternelement 'vertraulichkeit') muss vorkommen, wenn ein (vertrauliches) Schriftgutobjekt beim Element 'vertraulichkeitsstufe' den Schlüsselwert '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') oder den Schlüsselwert '002' (für 'vertraulich zu behandeln') hat! -->
				<sch:rule context="//tns:nachrichtenkopf[../tns:schriftgutobjekte//tns:vertraulichkeitsstufe/code = ('001','002')]">
					<sch:assert test="exists(tns:vertraulichkeit/tns:vertraulichkeitsstufe)" id="SCH-GDS-0005">[SCH-GDS-0005] Nachrichtenkopf: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' (und damit das Elternelement 'vertraulichkeit') muss vorkommen, wenn ein Schriftgutobjekt beim Element 'vertraulichkeitsstufe' den Schlüsselwert '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') oder den Schlüsselwert '002' (für 'vertraulich zu behandeln') hat!</sch:assert>
					</sch:rule>
			</sch:pattern>
			
			<sch:pattern>
				<!-- Kardinalitaet: Das Nachrichtenkopf-Element 'nachrichtenuebergreifenderProzess' muss vorkommen, wenn ein Schriftgutobjekt beim Element 'nurMetadaten' den Wert 'true' hat! -->
				<sch:rule context="//tns:nachrichtenkopf">
						<sch:assert test="if ((..//tns:justizinterneDaten/tns:nurMetadaten) = 'true') then (exists(./tns:nachrichtenuebergreifenderProzess)) else true()" id="SCH-GDS-0006">[SCH-GDS-0006] Nachrichtenkopf: Das Nachrichtenkopf-Element 'nachrichtenuebergreifenderProzess' muss vorkommen, wenn ein Schriftgutobjekt beim Element 'nurMetadaten' den Wert 'true' hat!</sch:assert>
				</sch:rule>
				<!-- Variante: Wenn 'nurMetadaten' bei Vorkommen immer nur den festen Wert 'true' haben kann:
				<sch:rule context="//tns:nachrichtenkopf">
						<sch:assert test="if (exists(..//tns:justizinterneDaten/tns:nurMetadaten)) then (exists(./tns:nachrichtenuebergreifenderProzess)) else true()" id="SCH-GDS-0006">[SCH-GDS-0006] SGO: Das Nachrichtenkopf-Element 'nachrichtenuebergreifenderProzess' muss vorkommen, wenn ein Schriftgutobjekt beim Element 'nurMetadaten' den Wert 'true' hat!</sch:assert>
				</sch:rule>
				 -->
			</sch:pattern>	
				
		<!-- /Individuelle Rules -->
	
	<!-- GDS - NACHRICHTENKOPF-GESCHAEFTSREGELN: -->
	

	<!-- GDS - CODELISTEN-GESCHAEFTSREGELN: -->

		
		<!-- Individuelle Rules -->
		
			<sch:pattern>
					<!-- Fester Codelistenwert: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' muss den Schlüsselwert '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') haben, da mindestens in einem (vertraulichen) Schriftgutobjekt diese Vertraulichkeitsstufe verwendet wird! -->
					<sch:rule context="//tns:nachrichtenkopf">
						<sch:assert test="if(../tns:schriftgutobjekte//tns:vertraulichkeitsstufe/code = '001') then (tns:vertraulichkeit/tns:vertraulichkeitsstufe/code = '001') else true()" id="SCH-GDS-0010">[SCH-GDS-0010] Codeliste: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' muss den Schlüsselwert '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') haben, da mindestens in einem Schriftgutobjekt diese Vertraulichkeitsstufe verwendet wird!</sch:assert>
					</sch:rule>
			</sch:pattern>

			<sch:pattern>
				<!-- Fester Codelistenwert: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' muss den Schlüsselwert '002' (für 'vertraulich zu behandeln') haben, da mindestens in einem Schriftgutobjekt diese Vertraulichkeitsstufe verwendet wird und in keinem Schriftgutobjekt die strengere Vertraulichkeitsstufe '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') verwendet wird!-->
					<sch:rule context="//tns:nachrichtenkopf">
						<sch:assert test="if(../tns:schriftgutobjekte//tns:vertraulichkeitsstufe/code = '002' and not(../tns:schriftgutobjekte//tns:vertraulichkeitsstufe/code = '001')) then (tns:vertraulichkeit/tns:vertraulichkeitsstufe/code = '002') else true()" id="SCH-GDS-0011">[SCH-GDS-0011] Codeliste: Das Nachrichtenkopf-Element 'vertraulichkeitsstufe' muss den Schlüsselwert '002' (für 'vertraulich zu behandeln') haben, da mindestens in einem Schriftgutobjekt diese Vertraulichkeitsstufe verwendet wird und in keinem Schriftgutobjekt die strengere Vertraulichkeitsstufe '001' (für 'VS - NUR FÜR DEN DIENSTGEBRAUCH') verwendet wird!</sch:assert>
					</sch:rule>
			</sch:pattern>
		
		<!-- /Individuelle Rules -->


	<!-- /GDS - CODELISTEN-GESCHAEFTSREGELN -->
		
</sch:schema>
<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz DABAG
    Version 1.0 (November 2022; initiale Erstellung)
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron"
            xmlns:xs="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
   <sch:ns uri="http://www.xjustiz.de"  prefix="tns" />
   
   <!-- ===================================== -->
   <!--          Fachdatensatz DABAG          -->
   <!-- ===================================== -->

   <sch:pattern>
      <!--Abstrakte Regeln-->
          <!-- /xjustiz/XJustiz/xjustiz_2900_dabag_3_1.xsd/Schematron/SCH.DABAG.Identifikation.Flurstueck.ID (schRuleSet) -->
      <sch:rule id="rule-SCH.DABAG.0001" abstract="true">
         <sch:assert id="SCH.DABAG.0001" test="exists(@id) and normalize-space(@id) != ''">[SCH-DABAG-0001] Bei einer DABAG-Nachricht muss das Attribut 'id' zum Element 'identifikationFlurstueck' oder 'flurstueck' immer angegeben werden.</sch:assert>
      </sch:rule>
      <!-- /xjustiz/XJustiz/xjustiz_2900_dabag_3_1.xsd/Schematron/SCH.DABAG.Buchungsstelle.ID (schRuleSet) -->
      <sch:rule id="rule-SCH.DABAG.0002" abstract="true">
         <sch:assert id="SCH.DABAG.0002" test="exists(@id) and normalize-space(@id) != ''">[SCH-DABAG-0002] Bei einer DABAG-Nachricht muss das Attribut 'id' zum Element 'buchungsstelle' immer angegeben werden.</sch:assert>
      </sch:rule>
      
      <!--Konkrete Regeln-->
      <sch:rule context="tns:nachricht.dabag.antrag.2900001//tns:identifikationFlurstueck">
         <sch:extends rule="rule-SCH.DABAG.0001"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.dabag.antrag.2900001/tns:fachdaten/tns:bearbeitungsgegenstaende//tns:flurstueck">
         <sch:extends rule="rule-SCH.DABAG.0001"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.dabag.grundbuchauszug.2900002//tns:identifikationFlurstueck">
         <sch:extends rule="rule-SCH.DABAG.0001"/>
      </sch:rule>
       <sch:rule context="tns:nachricht.dabag.grundbuchauszug.2900002/tns:fachdaten/tns:grundbuchblatt/tns:buchungsstelle">
         <sch:extends rule="rule-SCH.DABAG.0002"/>
      </sch:rule>
   </sch:pattern>

</sch:schema>

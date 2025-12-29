<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Schematron-Schema zur Prüfung von Geschäftsregeln für den 
    XJustiz-Fachdatensatz xjustiz_3400_rast_1_0.xsd (Rechtsantragstelle)
    Version 1.0
    Erstellt von der XJustiz-Pflegestelle im Auftrag der BLK-AG IT-Standards in der Justiz
-->
<sch:schema xmlns:sch="http://purl.oclc.org/dsdl/schematron"
            xmlns:xs="http://www.w3.org/2001/XMLSchema" queryBinding="xslt2">
    <sch:ns uri="http://www.xjustiz.de"  prefix="tns" />
   
   <!-- ===================================== -->
   <!--          Fachdatensatz RAST           -->
   <!-- ===================================== -->
   
   <sch:pattern>
      
      <!-- Abstrakte Regeln -->
      <sch:rule id="rule-SCH-RAST-0001" abstract="true">
         <sch:assert id="SCH-RAST-0001"
            test="exists(tns:verkehrswert) or (exists(tns:hersteller) and exists(tns:baujahr))">
            [SCH-RAST-0001] Entweder Verkehrswert oder Hersteller und Baujahr müssen angegeben werden.</sch:assert>
      </sch:rule>
      <sch:rule id="rule-SCH-RAST-0002" abstract="true">
         <sch:assert id="SCH-RAST-0002"
            test="exists(tns:monatlicherBetragAntragstellerInEuro) or exists(tns:monatlicherBetragEhegatte.LebenspartnerInEuro) or (exists(tns:ratenBis) and exists(tns:restschuldInEuro))">
            [SCH-RAST-0002] Es müssen mindestens monatliche Raten für Antragsteller oder Ehegatte/Lebenspartner oder ratenBis und Restschuld angegeben werden.</sch:assert>
      </sch:rule>
      
      <!-- Konkrete Regeln -->
      <sch:rule context="tns:nachricht.rast.antragBeratungshilfe.3400001//tns:fahrzeug">
         <sch:extends rule="rule-SCH-RAST-0001"/>
      </sch:rule>
      <sch:rule context="tns:nachricht.rast.antragBeratungshilfe.3400001//tns:zahlungsverpflichtungen">
         <sch:extends rule="rule-SCH-RAST-0002"/>
      </sch:rule>
      
   </sch:pattern>
</sch:schema>

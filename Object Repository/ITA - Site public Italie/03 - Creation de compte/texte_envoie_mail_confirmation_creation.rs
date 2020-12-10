<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description>texte qui s'affiche après validation du formulaire de création de compte</description>
   <name>texte_envoie_mail_confirmation_creation</name>
   <tag></tag>
   <elementGuidId>b9a3ccc5-998c-45a6-919d-dd4b22a909a3</elementGuidId>
   <imagePath></imagePath>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
      <entry>
         <key>IMAGE</key>
         <value></value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//*[@id=&quot;createAccountForm&quot;]/p</value>
      </entry>
      <entry>
         <key>BASIC</key>
         <value>//*[@id=&quot;createAccountForm&quot;]/p[count(. | //*[contains(@title, 'È stata inviata una mail a')]) = count(//*[contains(@title, 'È stata inviata una mail a')])]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@id=&quot;createAccountForm&quot;]/p</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>contains</matchCondition>
      <name>title</name>
      <type>Main</type>
      <value>È stata inviata una mail a</value>
   </webElementProperties>
</WebElementEntity>

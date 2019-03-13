<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>monthlyReports</name>
   <tag></tag>
   <elementGuidId>1302f19d-b933-4263-8908-f15db82e9918</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;start_date\&quot; : \&quot;2019-02-01\&quot;,\n  \&quot;end_date\&quot; : \&quot;2019-02-28\&quot;,\n  \&quot;store\&quot; : 52,\n  \&quot;serial_number\&quot; : \&quot;\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>eyJraWQiOiJ2RkVZelJhU0FKTExjMDFSRWxxUDVZNzhPc2J5YTNqS0FcL1dIR0Y5NFdLYz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJkMjI3MDgzNC05OWYyLTRiMmEtOWUwMC1lMWNiZThkNmU0MmQiLCJjb2duaXRvOmdyb3VwcyI6WyJlc2NpZW5jZSIsImFkbWluaXN0cmF0b3JzIl0sImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAuYXAtc291dGhlYXN0LTEuYW1hem9uYXdzLmNvbVwvYXAtc291dGhlYXN0LTFfS1FTNjgyQWJMIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjp0cnVlLCJjb2duaXRvOnVzZXJuYW1lIjoicm9vdCIsImdpdmVuX25hbWUiOiJyb290IiwiYXVkIjoiNDB2dWxubHY0bDJkbTUxcDI3bm1nZjFpcjciLCJldmVudF9pZCI6ImIxYTdlYTAzLTQxNjMtMTFlOS1hYzk2LTk3Zjc4NWMzNDBjYSIsInRva2VuX3VzZSI6ImlkIiwiYXV0aF90aW1lIjoxNTUyMDIzMjA1LCJwaG9uZV9udW1iZXIiOiIrNjM4NDI3NDA2IiwiZXhwIjoxNTUyMDI2ODA1LCJpYXQiOjE1NTIwMjMyMDUsImZhbWlseV9uYW1lIjoicm9vdCIsImVtYWlsIjoicm9vdEBnbWFpbC5jb20ifQ.JChMIXMoUiEtvQD5JcbQABt5JXVSZNKX6l6JcLvvUdrBe3NpSlhrdJiIhckRNrl9Zui0D0Avob8jis2xqiyaQp2hitCzj94ZuIFO7kFPibv85952kqh9hKHTja7kaMW9ktF84aBYcFV5rJL7w4MKPAbeF7Cl6blCR77GOZEvuyqDmMSTz3CtspkXxjbypFMgrtnl_lrNLjCaKmt0zynwTRXWfRIqsdYBbTCWS1Y2mBS-ERnK6AX4gAyGDGAahxdUzRTke1Ru_mC2pj5W-aqzk0F5JKWBS5g7jQ2YA5aekrThk-ZdLGP4WOqys_mYyyApZu68SluBsgOQrfWQkvuR7Q</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>X-Esc-Client-Schema</name>
      <type>Main</type>
      <value>pocketwise_potatocorner</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://api.pocketventaqa.net/monthly_sales?</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)

//WS.verifyElementPropertyValue(response, 'data[0].last_name', 'Holt')
//WS.verifyElementPropertyValue(response, 'data[0].id', '4')
//
//WS.verifyElementPropertyValue(response, 'data[1].first_name', 'Charles')
//WS.verifyElementPropertyValue(response, 'data[1].last_name', 'Morris')
//WS.verifyElementPropertyValue(response, 'data[1].id', '5')
//
//WS.verifyElementPropertyValue(response, 'data[2].first_name', 'Tracey')
//WS.verifyElementPropertyValue(response, 'data[2].last_name', 'Ramos')
//WS.verifyElementPropertyValue(response, 'data[2].id', '6')

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

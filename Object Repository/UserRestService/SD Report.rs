<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>SD Report</name>
   <tag></tag>
   <elementGuidId>4b1c158d-678b-4ad1-a580-98671a1fb765</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n   \&quot;start_date\&quot; : \&quot;2019-02-01\&quot;,\n   \&quot;end_date\&quot; : \&quot;2019-02-28\&quot;,\n   \&quot;stores\&quot; : [52],\n   \&quot;products\&quot; : [],\n   \&quot;or_number\&quot; : \&quot;\&quot;,\n   \&quot;discount_type\&quot; : \&quot;All\&quot;,\n   \&quot;limit\&quot; : 200,\n   \&quot;offset\&quot; : 0,\n   \&quot;first_retrieve\&quot; : true\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>eyJraWQiOiJ2RkVZelJhU0FKTExjMDFSRWxxUDVZNzhPc2J5YTNqS0FcL1dIR0Y5NFdLYz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJkMjI3MDgzNC05OWYyLTRiMmEtOWUwMC1lMWNiZThkNmU0MmQiLCJjb2duaXRvOmdyb3VwcyI6WyJlc2NpZW5jZSIsImFkbWluaXN0cmF0b3JzIl0sImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAuYXAtc291dGhlYXN0LTEuYW1hem9uYXdzLmNvbVwvYXAtc291dGhlYXN0LTFfS1FTNjgyQWJMIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjp0cnVlLCJjb2duaXRvOnVzZXJuYW1lIjoicm9vdCIsImdpdmVuX25hbWUiOiJyb290IiwiYXVkIjoiNDB2dWxubHY0bDJkbTUxcDI3bm1nZjFpcjciLCJldmVudF9pZCI6IjY4ZTZkYzRkLTQ0ODUtMTFlOS1iNDE5LTVkZDU1MTNjY2ZjNyIsInRva2VuX3VzZSI6ImlkIiwiYXV0aF90aW1lIjoxNTUyMzY3NTM5LCJwaG9uZV9udW1iZXIiOiIrNjM4NDI3NDA2IiwiZXhwIjoxNTUyMzcxMTM5LCJpYXQiOjE1NTIzNjc1MzksImZhbWlseV9uYW1lIjoicm9vdCIsImVtYWlsIjoicm9vdEBnbWFpbC5jb20ifQ.inOk5SmYUUzoThb5lmzSCsAOJqgsJ1d7_5A4SoFquVBMh9ByQOlxq9UbGevULvy2ijFQ3NKXuSfUqFXiI4xKwEsjpRjgHODfAe2ETrcNDRMjStkaaeM8xSoxVHJNLEW_BK5Y3qooY40YOTYlWq2MrDd8-o4l4PBLxeYTmK2KRLQEh0i7sHRum_B443WdpSuEsUSCYZ1YzHMYOx1iHT82rA3oK2yqgaZ7yuCqsm4dyCD0rioCbyq_6cwcu3BQod4uuEaD3V-4aT_sdfmb9wn7IO2cWme_E5olDsB7ckVJqHpMjhANJpDKFVOlBMjCm2YkhMKyXAcUuCL9AiLsILk1aw</value>
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
   <restUrl>https://api.pocketventaqa.net/special_discounts?</restUrl>
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
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>

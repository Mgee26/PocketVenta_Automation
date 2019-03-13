<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>ZReport</name>
   <tag></tag>
   <elementGuidId>190581f9-1295-4554-bb15-5e11f210a67b</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;start_date\&quot; : date_format(\u00272019-02-01\u0027),\n    \&quot;end_date\&quot; : date_format(\u00272019-02-28\u0027),\n    \&quot;store\&quot; : 52\n}  &quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>eyJraWQiOiJ2RkVZelJhU0FKTExjMDFSRWxxUDVZNzhPc2J5YTNqS0FcL1dIR0Y5NFdLYz0iLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJkMjI3MDgzNC05OWYyLTRiMmEtOWUwMC1lMWNiZThkNmU0MmQiLCJjb2duaXRvOmdyb3VwcyI6WyJlc2NpZW5jZSIsImFkbWluaXN0cmF0b3JzIl0sImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAuYXAtc291dGhlYXN0LTEuYW1hem9uYXdzLmNvbVwvYXAtc291dGhlYXN0LTFfS1FTNjgyQWJMIiwicGhvbmVfbnVtYmVyX3ZlcmlmaWVkIjp0cnVlLCJjb2duaXRvOnVzZXJuYW1lIjoicm9vdCIsImdpdmVuX25hbWUiOiJyb290IiwiYXVkIjoiNDB2dWxubHY0bDJkbTUxcDI3bm1nZjFpcjciLCJldmVudF9pZCI6IjkxNjNlMTdmLTQwODktMTFlOS1iNDE5LTVkZDU1MTNjY2ZjNyIsInRva2VuX3VzZSI6ImlkIiwiYXV0aF90aW1lIjoxNTUxOTI5NTIwLCJwaG9uZV9udW1iZXIiOiIrNjM4NDI3NDA2IiwiZXhwIjoxNTUxOTMzMTIwLCJpYXQiOjE1NTE5Mjk1MjAsImZhbWlseV9uYW1lIjoicm9vdCIsImVtYWlsIjoicm9vdEBnbWFpbC5jb20ifQ.ZGAjGR-8WPaxLT9VJ1YlA2POF5ma0soYaJWCskO6maW01JfCLe93OMxjwPbV799z5mTUMBk2OAzWUrjD-WASN4NVz0-OzivhTB-Lcz5f9rId4jysT3HOqVC8mr9xySn8AsPr8HApaXQwuYZJEgnWBE4SZ5xzduDQtjFW2n6oNi24qRAMLYgXRyqwkZnYQDzqwcyLTmNsCXtaoZ99Ni8AXOzhDueXqcMQopQLlCnBh7Vu2bBq6p9TezE1LBDIyiq69br-NQRcCBjXY4VA73K1vGz7dIsmaDbnoi6iH2PY6YwiR9yIAZk86hD-SlPK3WqBf3XtX92TASPnJFGkefhkWw</value>
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
   <restUrl>https://api.pocketventaqa.net/get-z-reading-report?</restUrl>
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

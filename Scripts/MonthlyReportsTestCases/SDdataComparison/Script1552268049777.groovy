import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.io.FileInputStream as FileInputStream
import java.io.FileNotFoundException as FileNotFoundException
import java.io.IOException as IOException
import java.util.Date as Date
import org.apache.poi.xssf.usermodel.XSSFCell as XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow as XSSFRow
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.String as String

response = WS.sendRequestAndVerify(findTestObject('UserRestService/SD Report'))

def slurper = new JsonSlurper()

def json = slurper.parseText(response.getResponseBodyContent())

//def I = slurper.parseText(response.getResponseBodyContent())
def data = findTestData('Data Files/specialDiscountExcel')

def cell = 1

def exrow = 1

FileInputStream file = new FileInputStream(new File('C:\\Users\\E-Science\\Desktop\\Error Reports\\SD Error Report.xlsx'))

XSSFWorkbook workbook = new XSSFWorkbook(file)

XSSFSheet sheet = workbook.getSheetAt(0)

def jsonNum = data.getRowNumbers()

println(jsonNum)

for (def row = 1; row <= jsonNum; row++) {
    def i = row - 1

    //-----------------------------------------------------Web-------------------------------------------------//
    def storeName = json.result[i].store_name

    def transactionDate = json.result[i].transaction_date

    def transactionTime = json.result[i].transaction_time

    def productName = json.result[i].product_name

    def netAmount = json.result[i].net_amount

    def discountAmount = json.result[i].discount_amount

    def discountType = json.result[i].discount_type

    def grossAmount = json.result[i].gross_amount

    def customerName = json.result[i].customer_name

    def customerNumber = json.result[i].customer_number

    //--------------------------------------------------Web End-------------------------------------------------//
    //--------------------------------------------------Data Base-------------------------------------------------//
    def store_name = data.getValue(1, row)

    def transaction_date = data.getValue(2, row)

    def transaction_time = data.getValue(3, row)

    def product_name = data.getValue(4, row)

    def net_amount = data.getValue(10, row)

    def discount_amount = data.getValue(9, row)

    def discount_type = data.getValue(5, row)

    def gross_amount = data.getValue(8, row)

    def customer_name = data.getValue(6, row)

    def customer_number = data.getValue(7, row)

    //-----------------------------------------------Data Base END-------------------------------------------------//
    //--------------------------------------------------Verifier-------------------------------------------------//
    try {
        WS.verifyEqual(store_name, storeName, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Store Name')

        sheet.getRow(exrow).createCell(1).setCellValue(store_name)

        sheet.getRow(exrow).createCell(2).setCellValue(storeName)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(transaction_date, transactionDate, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Transaction Date')

        sheet.getRow(exrow).createCell(1).setCellValue(transaction_date)

        sheet.getRow(exrow).createCell(2).setCellValue(transactionDate)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(transaction_time, transactionTime, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Transaction Time')

        sheet.getRow(exrow).createCell(1).setCellValue(transaction_time)

        sheet.getRow(exrow).createCell(2).setCellValue(transactionTime)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(product_name, productName, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Product Name')

        sheet.getRow(exrow).createCell(1).setCellValue(product_name)

        sheet.getRow(exrow).createCell(2).setCellValue(productName)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(net_amount, netAmount, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Net Amount')

        sheet.getRow(exrow).createCell(1).setCellValue(net_amount)

        sheet.getRow(exrow).createCell(2).setCellValue(netAmount)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(discount_amount, discountAmount, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Discount Amount')

        sheet.getRow(exrow).createCell(1).setCellValue(discount_amount)

        sheet.getRow(exrow).createCell(2).setCellValue(discountAmount)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(discount_type, discountType, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Discount Type')

        sheet.getRow(exrow).createCell(1).setCellValue(discount_type)

        sheet.getRow(exrow).createCell(2).setCellValue(discountType)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(gross_amount, grossAmount, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Gross Amount')

        sheet.getRow(exrow).createCell(1).setCellValue(gross_amount)

        sheet.getRow(exrow).createCell(2).setCellValue(grossAmount)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(customer_name, customerName, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Customer Name')

        sheet.getRow(exrow).createCell(1).setCellValue(customer_name)

        sheet.getRow(exrow).createCell(2).setCellValue(customerName)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    try {
        WS.verifyEqual(customer_number, customerNumber, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
        sheet.createRow(exrow).createCell(1).setCellValue('')

        sheet.getRow(exrow).createCell(0).setCellValue('Customer Number')

        sheet.getRow(exrow).createCell(1).setCellValue(customer_number)

        sheet.getRow(exrow).createCell(2).setCellValue(customerNumber)

        sheet.getRow(exrow).createCell(3).setCellValue('Data did not match')

        exrow++
    } 
    
    exrow++
}

file.close()

FileOutputStream outFile = new FileOutputStream(new File('C:\\Users\\E-Science\\Desktop\\Error Reports\\SD Error Report.xlsx'))

workbook.write(outFile)

outFile.close()


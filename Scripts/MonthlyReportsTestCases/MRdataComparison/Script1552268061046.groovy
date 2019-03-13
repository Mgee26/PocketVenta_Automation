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

response1 = WS.sendRequestAndVerify(findTestObject('UserRestService/monthlyReports'))

def slurper = new JsonSlurper()

def result = slurper.parseText(response1.getResponseBodyContent())

def I = slurper.parseText(response1.getResponseBodyContent())

def data = findTestData('Data Files/pocketVentaDB')

def exrow = 1

FileInputStream file = new FileInputStream (new File("C:\\Users\\E-Science\\Desktop\\Error Reports\\Error Report.xlsx"))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheetAt(0);

def jsonNum = data.getRowNumbers()

println(jsonNum)


for (def row = 1; row <= jsonNum; row++) {
	
    def i = row - 1

    //-----------------------------------------------------Web-------------------------------------------------//
    def storeName = result.long_name[i]

    def transactionDate = result.transaction_date[i]

    def beginningReceipt = result.beginning_receipt[i]

    def endingReceipt = result.ending_receipt[i]

    def totalReceipt = result.total_receipt[i]

    def beginningSales = result.beginning_sales[i]

    def endingSales = result.ending_sales[i]

    def totalSales = result.total_sales[i]

    def zCounter = result.z_counter[i]

    def taxableSales = result.taxable_sales[i]

    def taxExemptSales = result.tax_exempt_sales[i]

    def zeroRatedSales = result.zero_rated_sales[i]

    def Tax = result.tax[i]

    def regularDiscounts = result.regular_discounts[i]

    def specialDiscounts = result.special_discounts[i]

    def returnSales = result.return_sales[i]

    def voidedSales = result.voided_sales[i]

    def totalDeductions = result.total_deductions[i]

    def netSales = result.net_sales[i]

    def manualSales = result.manual_sales[i]

    def devGrossSales = result.dev_gross_sales[i]

    def taxSpecialDiscounts = result.tax_special_discounts[i]

    def taxReturns = result.tax_returns[i]

    def otherTax = result.other_tax[i]

    def totalTaxAdjustments = result.total_tax_adjustments[i]

    def taxPayable = result.tax_payable[i]

    def otherIncome = result.other_income[i]

    def salesOverrun = result.sales_overrun[i]

    def totalNetSales = result.total_net_sales[i]

    def resetCounter = result.reset_counter[i]

    def Remarks = result.remarks[i]

    //--------------------------------------------------Web End-------------------------------------------------//
    //--------------------------------------------------Data Base-------------------------------------------------//
    def long_name = data.getValue(1, row)

    def transaction_date = data.getValue(3, row)

    def beginning_receipt = data.getValue(4, row)

    def ending_receipt = data.getValue(5, row)

    def total_receipt = data.getValue(6, row)

    def beginning_sales = data.getValue(7, row)

    def ending_sales = data.getValue(8, row)

    double Int_beginning_sales = Double.parseDouble(beginning_sales)
    double Int_ending_sales_sales = Double.parseDouble(ending_sales)
    double Int_total_sales = Int_ending_sales_sales - Int_beginning_sales
    def total_sales = Double.toString(Int_total_sales)

    def z_counter = data.getValue(12, row)

    def taxable_sales = data.getValue(13, row)

    def tax_exempt_sales = data.getValue(15, row)

    def zero_rated_sales = data.getValue(16, row)

    def tax = data.getValue(14, row)

    //def  senior_discounts= data.getValue(15, 2)
    //def  pwd_discounts= data.getValue(16, 2)
	
    def regular_discounts = data.getValue(17, row)

    def special_discounts = data.getValue(18, row)

    def return_sales = data.getValue(19, row)

    def voided_sales = data.getValue(20, row)

    def total_deductions = data.getValue(21, row)

    def net_sales = data.getValue(27, row)

    def manual_sales = data.getValue(10, row)

    def dev_gross_sales = data.getValue(9, row)

    def tax_special_discounts = data.getValue(22, row)

    def tax_returns = data.getValue(23, row)

    def other_tax = data.getValue(24, row)

    def total_tax_adjustments = data.getValue(25, row)

    def tax_payable = data.getValue(26, row)

    def other_income = data.getValue(28, row)

    def sales_overrun = data.getValue(29, row)

    def total_net_sales = data.getValue(30, row)

    def reset_counter = data.getValue(31, row)

    def remarks = data.getValue(32, row)

    //-----------------------------------------------Data Base END-------------------------------------------------//
    //--------------------------------------------------Verifier-------------------------------------------------//
    

    try {
            WS.verifyEqual(long_name, storeName, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Store Name")
        sheet.getRow(exrow).createCell(1).setCellValue(long_name)
		sheet.getRow(exrow).createCell(2).setCellValue(storeName)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
        WS.verifyEqual(transaction_date, transactionDate, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Transaction Date")
        sheet.getRow(exrow).createCell(1).setCellValue(transaction_date)
		sheet.getRow(exrow).createCell(2).setCellValue(transactionDate)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 
	
    try {
            WS.verifyEqual(beginning_receipt, beginningReceipt, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Beginning Receipt")
        sheet.getRow(exrow).createCell(1).setCellValue(beginning_receipt)
		sheet.getRow(exrow).createCell(2).setCellValue(beginningReceipt)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(ending_receipt, endingReceipt, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Ending Receipt")
        sheet.getRow(exrow).createCell(1).setCellValue(ending_receipt)
		sheet.getRow(exrow).createCell(2).setCellValue(endingReceipt)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(total_receipt, totalReceipt, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Total Receipt")
        sheet.getRow(exrow).createCell(1).setCellValue(total_receipt)
		sheet.getRow(exrow).createCell(2).setCellValue(totalReceipt)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(beginning_sales, beginningSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Beginning Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(beginning_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(beginningSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(ending_sales, endingSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Ending Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(ending_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(endingSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

	try {
		 WS.verifyEqual(total_sales, totalSales, FailureHandling.STOP_ON_FAILURE)
	}
	catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Total Sales")
		sheet.getRow(exrow).createCell(1).setCellValue(total_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(totalSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		
		exrow++
	}

	try {
		 WS.verifyEqual(z_counter, zCounter, FailureHandling.STOP_ON_FAILURE)
	}
	catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Z Counter")
		sheet.getRow(exrow).createCell(1).setCellValue(z_counter)
		sheet.getRow(exrow).createCell(2).setCellValue(zCounter)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		
		exrow++
	}

    try {
            WS.verifyEqual(taxable_sales, taxableSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Taxable Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(taxable_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(taxableSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(tax_exempt_sales, taxExemptSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Tax Exempt Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(tax_exempt_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(taxExemptSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(zero_rated_sales, zeroRatedSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Zero Rated Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(zero_rated_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(zeroRatedSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(tax, Tax, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Tax")
        sheet.getRow(exrow).createCell(1).setCellValue(tax)
		sheet.getRow(exrow).createCell(2).setCellValue(Tax)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(regular_discounts, regularDiscounts, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Regular Discounts")
        sheet.getRow(exrow).createCell(1).setCellValue(regular_discounts)
		sheet.getRow(exrow).createCell(2).setCellValue(regularDiscounts)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(special_discounts, specialDiscounts, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Special Discounts")
        sheet.getRow(exrow).createCell(1).setCellValue(special_discounts)
		sheet.getRow(exrow).createCell(2).setCellValue(specialDiscounts)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(return_sales, returnSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Return Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(return_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(returnSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 
    
    try {
            WS.verifyEqual(voided_sales, voidedSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Voided Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(voided_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(voidedSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 
 
    try {
            WS.verifyEqual(total_deductions, totalDeductions, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Total Deductions")
        sheet.getRow(exrow).createCell(1).setCellValue(total_deductions)
		sheet.getRow(exrow).createCell(2).setCellValue(totalDeductions)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(net_sales, netSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Transaction Date")
        sheet.getRow(exrow).createCell(1).setCellValue(net_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(Net Sales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    
    try {
            WS.verifyEqual(manual_sales, manualSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Manual Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(manual_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(manualSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(dev_gross_sales, devGrossSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Dev Gross Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(dev_gross_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(devGrossSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
             WS.verifyEqual(tax_special_discounts, taxSpecialDiscounts, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Tax Special Discounts")
        sheet.getRow(exrow).createCell(1).setCellValue(tax_special_discounts)
		sheet.getRow(exrow).createCell(2).setCellValue(taxSpecialDiscounts)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
           WS.verifyEqual(tax_returns, taxReturns, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Tax Returns")
        sheet.getRow(exrow).createCell(1).setCellValue(tax_returns)
		sheet.getRow(exrow).createCell(2).setCellValue(taxReturns)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(other_tax, otherTax, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Other Tax")
        sheet.getRow(exrow).createCell(1).setCellValue(other_tax)
		sheet.getRow(exrow).createCell(2).setCellValue(otherTax)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(total_tax_adjustments, totalTaxAdjustments, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Total Tax Adjustments")
        sheet.getRow(exrow).createCell(1).setCellValue(total_tax_adjustments)
		sheet.getRow(exrow).createCell(2).setCellValue(totalTaxAdjustments)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(tax_payable, taxPayable, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Tax Payable")
        sheet.getRow(exrow).createCell(1).setCellValue(tax_payable)
		sheet.getRow(exrow).createCell(2).setCellValue(taxPayable)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(other_income, otherIncome, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Other Income")
        sheet.getRow(exrow).createCell(1).setCellValue(other_income)
		sheet.getRow(exrow).createCell(2).setCellValue(otherIncome)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(sales_overrun, salesOverrun, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Sales Overrun")
        sheet.getRow(exrow).createCell(1).setCellValue(sales_overrun)
		sheet.getRow(exrow).createCell(2).setCellValue(salesOverrun)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(total_net_sales, totalNetSales, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Total Net Sales")
        sheet.getRow(exrow).createCell(1).setCellValue(total_net_sales)
		sheet.getRow(exrow).createCell(2).setCellValue(totalNetSales)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(reset_counter, resetCounter, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Reset Counter")
        sheet.getRow(exrow).createCell(1).setCellValue(reset_counter)
		sheet.getRow(exrow).createCell(2).setCellValue(resetCounter)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 

    try {
            WS.verifyEqual(remarks, Remarks, FailureHandling.STOP_ON_FAILURE)
    }
    catch (Exception e) {
		sheet.createRow(exrow).createCell(1).setCellValue("")
		sheet.getRow(exrow).createCell(0).setCellValue("Remarks")
        sheet.getRow(exrow).createCell(1).setCellValue(remarks)
		sheet.getRow(exrow).createCell(2).setCellValue(Remarks)
		sheet.getRow(exrow).createCell(3).setCellValue("Data did not match")
		exrow++
    } 
	
	exrow++
}

	file.close();
	FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\E-Science\\Desktop\\Error Reports\\Error Report.xlsx"));
	workbook.write(outFile);
	outFile.close();
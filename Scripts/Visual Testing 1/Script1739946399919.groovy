import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sftd1--testingcoe.sandbox.my.site.com/CRMITCommunity/s/login/?ec=302&startURL=%2FCRMITCommunity%2Fs%2F')

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Refresh_2050'), 'chaithra.kn@crmit.com.testingcoe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Username_2180'), 'p4y+y39Ir5Mn1jQv+M9K3w==')

WebUI.click(findTestObject('Object Repository/Page_Login/span_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Employee Leave/a_Timesheet'))

WebUI.click(findTestObject('Object Repository/Page_Timesheets/a_New'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/input__Week Start Date'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/span_17'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button_Testing project indai'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button__Category'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/lightning-base-combobox-item_QA'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button__Sub-Category'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/span_QA - Test Execution (Manual)'))

WebUI.setText(findTestObject('Object Repository/Page_Timesheet/input__Hours'), '8')

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button_Clone'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Timesheet/button_Save as Draft_1'))

WebUI.click(findTestObject('Object Repository/Page_Timesheets/a_TS0019569'))

WebUI.closeBrowser()


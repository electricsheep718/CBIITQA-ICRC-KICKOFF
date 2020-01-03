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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login'))

'Email Address'
WebUI.setText(findTestObject('Page_Login/input_Email Address_username'), EmailAddress)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_userlogin_0'))

WebUI.delay(2)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.1 - Personal Info'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.2 - Academic Info'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.3 - Research Exp'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.4 - Work Exp'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.5 - Publications and Awards'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.7 - References'), 
    [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.8 - Interests Checkboxes'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'To Submit!'
WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - External - Submit Application Form - COMPLETE - Sami'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Page_ICRC Application/a_Log out (1)'))

not_run: WebUI.closeBrowser()


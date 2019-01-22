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

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 0.0 - Registration'), 
    [('FirstName') : 'FirstName1', ('LastName') : 'LastName1', ('EmailAddress') : 'ncitester1@nih.gov'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.0 - ICRC Login'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.1 - Personal Info'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.2 - Academic Info'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.3 - Research Exp'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.4 - Work Exp'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.5 - Publications and Awards'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.6 - File Upload'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.7 - References'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.8 - Interests Checkboxes'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_submit_button'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_submit_button'))

WebUI.click(findTestObject('Page_ICRC Application/button_Cancel_submitPopup'))

WebUI.click(findTestObject('Page_ICRC Application/input_submit_button'))

WebUI.click(findTestObject('Page_ICRC Application/button_Confirm_submitPopup'))


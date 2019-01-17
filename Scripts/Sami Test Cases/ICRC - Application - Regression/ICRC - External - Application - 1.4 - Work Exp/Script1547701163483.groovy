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

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - Regression/ICRC - External - Application - 1.0 - ICRC Login'), 
    [('FirstName') : '', ('LastName') : '', ('EmailAddress') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_Place of Employment_expA (1)'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Place of Employment_expA (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Name of Supervisor_expAc (1)'), 'Liz Andreyev')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Supervisor Phone _expAcc (1)'), '3012221092')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Start Date_expAccStartDa (1)'), '01/01/2012')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_End Date_expAccEndDate (1)'), '01/01/2018')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Hours Per Week_expAccHou (1)'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Brief Summary of Duti (1)'), 'Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties Brief Summary of Duties ')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add_2 (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_2 (1)'))

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_save_button_application'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_save_button_application'))


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

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.0 - ICRC Login'), 
    [('FirstName') : '', ('LastName') : '', ('EmailAddress') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_ICRC Application/h3_Academic InformationEducati (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h3_Academic InformationEducati (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool (1)'), 'Tulane University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom (1)'), '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo (1)'), '01/01/2004')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity (1)'), 'New Orleans')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Education Le (1)'), 
    '163', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr (1)'), 
    '179', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree (1)'), 'Bachelors')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale --- (1)'), '24', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa (1)'), '4.0')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major --- (1)'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate (1)'), '01/01/2004')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h3_Academic InformationEducati (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool (1)'), 'Ravenclaw')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom (1)'), '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo (1)'), '01/01/2007')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity (1)'), 'Tuscaloosa')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Education Le (1)'), 
    '163', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr (1)'), 
    '179', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree (1)'), 'masters')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale --- (1)'), '24', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa (1)'), '4.0')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major --- (1)'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate (1)'), '01/01/2004')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add (1)'))

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_TOP_save_button_app'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_TOP_save_button_app'))


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

WebUI.callTestCase(findTestCase('Simran Test Cases/ICRC External - Login - Simran'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.firstname (1)'), 'FirstName')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Middle Name_applicants.m'), 'MiddleName')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.lastname (1)'), 'LastName')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.primaryPhone (2)'), '2222222223')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Phone_applican (2)'), '2222222223')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Email_applican (1)'), 'test@email.com')

'This date picker does not work'
not_run: WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_16 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.previousN (2)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon (2)'), 'EmergencyContact')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_11 (2)'), '2222222223')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude (2)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude (2)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.address1 (1)'), '123 Any street')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Address Line 2_applicant (1)'), '121')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.city (1)'), 'Maryland')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span__closeStateSelect (2)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_CA - California'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.zip (1)'), '20878')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Address Line 1_applicant (1)'), '223 Test street')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_City_applicants.appAcade (1)'), 'Pensylvania')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span_StateProvinceRegion_close'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_NY - New York (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_ZipPostal Code_applicant (1)'), '11111')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_TOP_save_button_app'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_TOP_save_button_app'))


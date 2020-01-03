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
import org.openqa.selenium.Keys as Keys

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC - Application - External -Section by Section/ICRC - External - Application - 1.0 - ICRC Login'), 
    [('FirstName') : '', ('LastName') : '', ('EmailAddress') : ''], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

not_run: WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.firstname (1)'), 'FirstName')

not_run: WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Middle Name_applicants.m'), 'MiddleName')

not_run: WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.lastname (1)'), 'LastName')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input__applicants.primaryPhone (2)'), 0)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.primaryPhone (2)'), '4041292100')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Phone_applican (2)'), '2408881111')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Email_applican (1)'), 'email@email.com')

WebUI.setText(findTestObject('Page_ICRC Application/input_DoB_Picker'), '01/15/1980')

WebUI.sendKeys(findTestObject('Page_ICRC Application/input_DoB_Picker'), Keys.chord(Keys.ENTER))

'This date picker does not work'
not_run: WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_16 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.previousN (2)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon (2)'), 'EmergencyContact')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_11 (2)'), '2401465132')

not_run: WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude (2)'))

WebUI.click(findTestObject('Page_ICRC Application/input_Yes_applicants.marcStude'))

not_run: WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude (2)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.address1 (1)'), '105 Rerun Ave')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Address Line 2_applicant (1)'), '900')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.city (1)'), 'New York')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span__closeStateSelect (2)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_CA - California'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.zip (1)'), '12111')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Address Line 1_applicant (1)'), '4040 5th Ave')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_City_applicants.appAcade (1)'), 'Prague')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span_StateProvinceRegion_close'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_NY - New York (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_ZipPostal Code_applicant (1)'), '31311')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_TOP_save_button_app'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_TOP_save_button_app'))


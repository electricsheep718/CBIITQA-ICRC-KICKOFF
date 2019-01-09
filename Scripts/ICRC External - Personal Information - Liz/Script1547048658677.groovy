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

WebUI.callTestCase(findTestCase('ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.firstname'), 'NCI1.1')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.lastname'), 'TESTERT1.1')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.primaryPhone'), '2402760000')

WebUI.setText(findTestObject('Page_ICRC Application/input_Secondary Phone_applican'), '2402764444')

WebUI.setText(findTestObject('Page_ICRC Application/input_Secondary Email_applican'), 'ncitester1.1@nih.gov')

WebUI.click(findTestObject('Page_ICRC Application/input__applicants.previousNciI'))

WebUI.click(findTestObject('Page_ICRC Application/input_Yes_applicants.previousN'))

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.emergencyCon'), 'LasName_EmergencyContact')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.emergencyCon_11'), '3018000000')

WebUI.click(findTestObject('Page_ICRC Application/input__applicants.marcStudentF'))

WebUI.click(findTestObject('Page_ICRC Application/input_Yes_applicants.marcStude'))

WebUI.click(findTestObject('Page_ICRC Application/div_YesNo'))

WebUI.click(findTestObject('Page_ICRC Application/input__applicants.marcStudentF'))

WebUI.click(findTestObject('Page_ICRC Application/a_10'))

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.address1'), '900 Main Street')

WebUI.setText(findTestObject('Page_ICRC Application/input_Address Line 2_applicant'), '301')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.city'), 'New York')

WebUI.setText(findTestObject('Page_ICRC Application/input__stateSelect'), 'ny')

WebUI.click(findTestObject('Page_ICRC Application/div_NY - New York'))

WebUI.setText(findTestObject('Page_ICRC Application/input__stateSelect'), 'NY - New York')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.zip'), '100000')

WebUI.setText(findTestObject('Page_ICRC Application/input_Address Line 1_applicant'), '700 Temp Street')

WebUI.setText(findTestObject('Page_ICRC Application/input_Address Line 2_applicant_4'), '800')

WebUI.setText(findTestObject('Page_ICRC Application/input_City_applicants.appAcade'), 'Rockville')

WebUI.setText(findTestObject('Page_ICRC Application/input_StateProvinceRegion_temp'), 'm')

WebUI.click(findTestObject('Page_ICRC Application/div_MD - Maryland'))

WebUI.setText(findTestObject('Page_ICRC Application/input_StateProvinceRegion_temp'), 'MD - Maryland')

WebUI.setText(findTestObject('Page_ICRC Application/input_ZipPostal Code_applicant'), '20850')

WebUI.click(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'))

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))


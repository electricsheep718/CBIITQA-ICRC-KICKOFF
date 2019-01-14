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

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.firstname'), 'FirstName1')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.lastname'), 'LastName1')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.primaryPhone'), '2017289999')

WebUI.setText(findTestObject('Page_ICRC Application/input_Secondary Phone_applican'), '2090980000')

WebUI.setText(findTestObject('Page_ICRC Application/input_Secondary Email_applican'), 'test@test.com')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.emergencyCon'), 'EmergencyContact1')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.emergencyCon_11'), '3019870000')

WebUI.click(findTestObject('Page_ICRC Application/input_Yes_applicants.marcStude'))

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.address1'), '123 Main street')

WebUI.setText(findTestObject('Page_ICRC Application/input_Address Line 2_applicant'), '30')

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.city'), 'Gaithersburg')

WebUI.click(findTestObject('Page_ICRC Application/span__closeStateSelect'))

WebUI.click(findTestObject('Page_ICRC Application/div_AR - Arkansas'))

WebUI.setText(findTestObject('Page_ICRC Application/input__applicants.zip'), '20877')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))


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

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentor2 (1)'), 'Mentor 1SK')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentorPhone2 (1)'), '3011112341')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccStartDate2 (1)'), '01/01/2009')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccEndDate2 (1)'), '01/01/2014')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccHoursPerWeek2 (1)'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccInstitution2 (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea__expAccSummary2 (1)'), 'Brief Description of Duties')

WebUI.click(findTestObject('Page_ICRC Application/div_Name of Mentor (1)'))

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd_1 (1)'))

WebUI.click(findTestObject('Page_ICRC Application/a_Add_1 (1)'))


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

WebUI.click(findTestObject('Page_ICRC Application/input_Publications_publication'))

WebUI.setText(findTestObject('Page_ICRC Application/input_Publications_publication'), 'Publication for Addition Publication for Addition Publication for Addition Publication for Addition Publication for Addition Publication for Addition ')

WebUI.scrollToElement(findTestObject('Object Repository/Page_ICRC Application/a_Add_3 (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_3 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Honors and Awards_honors (1)'), 'Honors and Awards')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add_4 (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_4 (1)'))

WebUI.click(findTestObject('Page_ICRC Application/input_Professional Society Mem (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Professional Society Mem (1)'), 'Professional Memberships Professional Memberships Professional Memberships Professional Memberships ')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add_5 (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_5 (1)'))

WebUI.click(findTestObject('Page_ICRC Application/input_Other Skills_otherSkills'))

WebUI.setText(findTestObject('Page_ICRC Application/input_Other Skills_otherSkills'), 'Other Skills')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/a_Add_6 (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_6 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Why you should be sel (1)'), 'Personal Statement for the ICRC Program')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_(NOT-OD-18-210)_appli (1)'), 'Diversity Statement for Biomedical Statement')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_save_button'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_save_button'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))


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

not_run: WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input__upload'), 0)

WebUI.focus(findTestObject('Page_ICRC Application/input__upload'))

WebUI.uploadFile(findTestObject('Page_ICRC Application/input__upload'), 'C:\\Users\\rashids2\\Documents\\GitHub\\CBIITQA-ICRC-KICKOFF\\UserGuide')

not_run: WebUI.uploadFile(findTestObject('Page_ICRC Application/input__upload'), 'C:\\Users\\rashids2\\Documents\\GitHub\\CBIITQA-ICRC-KICKOFF\\UserGuide')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Resume(s)_upload'), 0)

WebUI.uploadFile(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Resume(s)_upload'), 'C:\\Users\\rashids2\\Documents\\GitHub\\CBIITQA-ICRC-KICKOFF\\UserGuide')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Financial Document - Mus'), 0)

WebUI.uploadFile(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Financial Document - Mus'), 'C:\\Users\\rashids2\\Documents\\GitHub\\CBIITQA-ICRC-KICKOFF\\UserGuide')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_save_button'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_save_button'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))


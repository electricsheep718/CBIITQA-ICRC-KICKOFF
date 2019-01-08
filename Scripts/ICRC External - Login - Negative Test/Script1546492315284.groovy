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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/')

WebUI.click(findTestObject('Page_Introduction to Cancer Researc/a_Login (6)'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Email Address_username (4)'), 'firstname1@nih.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password (4)'), 'iFGeFYmXIrVwhyUTpIb4hg==')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_userlogin_0 (4)'))

WebUI.verifyTextPresent('Your account has been locked. Please use the Forgot your password link to reset your password.', 
    false)

WebUI.closeBrowser()


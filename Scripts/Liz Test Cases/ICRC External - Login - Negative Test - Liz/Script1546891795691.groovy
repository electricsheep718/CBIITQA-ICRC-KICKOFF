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

WebUI.click(findTestObject('Page_Introduction to Cancer Researc/a_Login'))

WebUI.setText(findTestObject('Page_Login/input_Email Address_username'), 'firstname1@nih.gov')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0'))

WebUI.verifyElementPresent(findTestObject('Page_Login/div_Incorrect Email Address.'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Login/span_Incorrect Email Address.'), 5)

WebUI.verifyTextPresent('Incorrect Email Address.', false)

WebUI.click(findTestObject('Page_Login/button_'))

WebUI.setText(findTestObject('Page_Login/input_Email Address_username'), 'ncitester3@nih.gov')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0'))

WebUI.verifyElementPresent(findTestObject('Page_Login/div_Incorrect Password.'), 5)

WebUI.verifyElementPresent(findTestObject('Page_Login/span_Incorrect Password.'), 5)

WebUI.verifyTextPresent('Incorrect Password', false)

WebUI.click(findTestObject('Page_Login/button_'))

WebUI.click(findTestObject('Page_Login/input_Password_btn btn-default'))

WebUI.closeBrowser()


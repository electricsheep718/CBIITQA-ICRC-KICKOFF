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

WebUI.waitForPageLoad(0)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/a_Login'))

WebUI.setText(findTestObject('Object Repository/input_Email Address_username'), findTestData('Registration Sami').getValue(
        3, 1))

WebUI.setEncryptedText(findTestObject('Object Repository/input_Password_password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0'))

WebUI.click(findTestObject('Page_ICRC Application/delete_button_PageApplication'))

WebUI.click(findTestObject('Page_ICRC Application/button_OK_deleteCONFIRM'))

WebUI.closeBrowser()


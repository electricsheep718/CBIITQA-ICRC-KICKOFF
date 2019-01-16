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

WebUI.maximizeWindow()

'testuser1@nih.gov'
WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Login'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (2)'), 'ncitester7@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer1 (1)'), 'make')

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer2 (1)'), 'make')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoSecurityQuestion_ (1)'))

WebUI.setEncryptedText(findTestObject('Page_Enter a New Password/input__password'), 'iFGeFYmXIrVXkUXHumJCLw==')

'P@ssw0rd2'
WebUI.setEncryptedText(findTestObject('Page_Enter a New Password/input__confirmPassword'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Forgot Your Password/input_Save_Button_ConfirmNewPassword'))

WebUI.setText(findTestObject('Page_Login/input_Email Address_username'), 'ncitester7@nih.gov')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0'))

WebUI.click(findTestObject('Page_ICRC Application/a_Log out'))

WebUI.closeBrowser()
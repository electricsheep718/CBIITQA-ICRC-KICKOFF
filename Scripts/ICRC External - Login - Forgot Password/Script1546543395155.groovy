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

'testuser1@nih.gov'
WebUI.click(findTestObject('Page_Introduction to Cancer Researc/a_Login (2) (1)'))

WebUI.delay(0)

WebUI.click(findTestObject('Page_Login/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (1)'), 'testuser1@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (1)'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer1'), 'nick')

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer2'), 'first')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoSecurityQuestion_'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Enter a New Password/input__password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

'P@ssword2'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Enter a New Password/input__confirmPassword'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_Enter a New Password/input__usertoResetPassword_0'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Enter a New Password/input__confirmPassword'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Object Repository/Page_Enter a New Password/input__usertoResetPassword_0'))

WebUI.setText(findTestObject('Page_Login/input_Email Address_username (3)'), 'testuser1@nih.gov')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password (3)'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0 (3)'))

WebUI.click(findTestObject('Page_ICRC Application/a_Log out (2)'))


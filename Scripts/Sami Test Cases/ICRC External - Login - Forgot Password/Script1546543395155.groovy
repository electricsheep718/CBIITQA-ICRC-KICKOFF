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
WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Login'))

WebUI.delay(0)

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (2)'), 'testuser1@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (2)'))

if (true) {
    WebUI.verifyTextPresent('What is your nickname?', false)

    WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer1 (1)'), 'nick')

    WebUI.verifyTextPresent('What was the make and model of your first car?', false)

    WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__answer2 (1)'), 'make')

    WebUI.verifyTextPresent('What is the name of your first school?', false)

    WebUI.setText(findTestObject(null), 'first')
} else {
}

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoSecurityQuestion_ (1)'))

WebUI.setText(findTestObject('Page_Enter a New Password/input__password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

'P@ssword2'
WebUI.setText(findTestObject('Page_Enter a New Password/input__confirmPassword'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Page_Enter a New Password/input__usertoResetPassword_0'))

WebUI.setText(findTestObject('Page_Enter a New Password/input__confirmPassword'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Page_Enter a New Password/input__usertoResetPassword_0'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input_Email Address_username'), 'testuser1@nih.gov')

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input_Password_password'), 'iFGeFYmXIrVXkUXHumJCLw==')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input_Password_userlogin_0'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Log out'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (2)'), 'testuser1@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (2)'))

WebUI.click(findTestObject('Page_Forgot Your Password/label_What is the name of your first school'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/label_What was the make and mo'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/div_What is the name of your f'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/div_What was the make and mode'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Back to login (3)'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (2)'), 'testuser1@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Back to login (3)'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/a_Forgot your password'))

WebUI.setText(findTestObject('Object Repository/Page_Forgot Your Password/input__username (2)'), 'testuser1@nih.gov')

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/input__usertoForgotPassword_0 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/div_What is your nickname'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/label_What is your nickname'))

WebUI.click(findTestObject('Page_Forgot Your Password/label_What is the name of your first school'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/div__controls'))

WebUI.click(findTestObject('Object Repository/Page_Forgot Your Password/div__controls'))


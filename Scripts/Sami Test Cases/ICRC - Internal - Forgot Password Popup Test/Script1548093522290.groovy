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

WebUI.navigateToUrl('https://authtest.nih.gov/CertAuthV2/forms/NIHPivOrFormLogin.aspx?TYPE=33554433&REALMOID=06-17c610f3-178b-46e4-86dd-489d122f65ba&GUID=&SMAUTHREASON=0&METHOD=GET&SMAGENTNAME=-SM-s5aFL%2f7kgoDxhK4kIn0QrG%2b3hIJNjMvttE53JDsfN2SKiv9I5UGX2NKKrJHJbe2N&TARGET=-SM-HTTPS%3a%2f%2ficrc--test%2enci%2enih%2egov%2ficrcng%2finternal%2f')

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_User Name_USER'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Application Process/input_User Name_USER'), 'rashids2')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Application Process/input_Password_PASSWORD'), 'f7sDQuAQyJIGyyoNPLD8Tg==')

WebUI.click(findTestObject('Page_Application Process/input_Change Password_Image2'))

WebUI.delay(2)

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Home/div_rollover_ApplicationProcess'))

WebUI.click(findTestObject('Page_Application Process/span_Go to page_aHref'))

WebUI.click(findTestObject('Object Repository/Page_Application Process/i_user_ncitester4'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Application Process/div_Reset Applicant Password (3)'), 
    0)

WebUI.waitForElementVisible(findTestObject('Page_Application Process/input_SendEmailNotification_Confirm'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_SendEmailNotification_Confirm'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Application Process/div_Reset Applicant Password (3)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_verifySend_Close'))

WebUI.click(findTestObject('Page_Application Process/input_Close_button_ResetApplicantPassword'))

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co (2)'))

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_CLose_SendEmail_Button'))

WebUI.closeBrowser()

WebUI.acceptAlert()


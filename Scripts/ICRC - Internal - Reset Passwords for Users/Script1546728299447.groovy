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

WebUI.setText(findTestObject('Page_NIH Login User Name and Passwo/input_User Name_USER'), 'rashids2')

WebUI.setEncryptedText(findTestObject('Page_NIH Login User Name and Passwo/input_Password_PASSWORD'), 'f7sDQuAQyJIGyyoNPLD8Tg==')

WebUI.click(findTestObject('Page_NIH Login User Name and Passwo/input_Change Password_Image2'))

WebUI.click(findTestObject('Page_Home/div_Go to page_rollover-label- (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Application Process/i_In Process_fa fa-lock btn bt'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co (1)'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co_4'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co_4'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/i_In Process_fa fa-lock btn bt_1'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/i_In Process_fa fa-lock btn bt_1'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co (1)'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co_5'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co_5'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/i_In Process_fa fa-lock btn bt_2'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/i_In Process_fa fa-lock btn bt_2'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co (1)'))

WebUI.waitForElementPresent(findTestObject('Page_Application Process/input_An email notification co_6'), 0)

WebUI.click(findTestObject('Object Repository/Page_Application Process/input_An email notification co_6'))

WebUI.closeBrowser()


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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/')

WebUI.click(findTestObject('Object Repository/Eugene/a_Login'))

WebUI.setText(findTestObject('Object Repository/Eugene/input_Email Address_username'), 'ncitester1@nih.gov')

WebUI.setEncryptedText(findTestObject('Object Repository/Eugene/input_Password_password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Eugene/input_Password_userlogin_0'))

WebUI.click(findTestObject('Object Repository/Eugene/input_ICRC-Contactmail.nih.gov'))

WebUI.click(findTestObject('Object Repository/Eugene/button_Cancel'))

WebUI.closeBrowser()


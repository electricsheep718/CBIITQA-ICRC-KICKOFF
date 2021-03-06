import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.callTestCase(findTestCase('Sami Test Cases/ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_ICRC Application/input__reference1.referenceNam'), 'Simran Kaur')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference1.referenceIns'), 'NCI')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference1.referenceAdd'), '9069 Medical Center Dr.')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference1.referencePho'), '240-734-2222')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference1.referenceEma'), 'test1@test.com')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference2.referenceNam'), 'Liz ')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference2.referenceIns'), 'ACI')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference2.referenceAdd'), '8723 Main Street')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference2.referencePho'), '791-092-3333')

WebUI.setText(findTestObject('Page_ICRC Application/input__reference2.referenceEma'), 'test2@test.com')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_TOP_save_button_app'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_TOP_save_button_app'))

WebUI.click(findTestObject('Page_ICRC Application/input_submit_button'))


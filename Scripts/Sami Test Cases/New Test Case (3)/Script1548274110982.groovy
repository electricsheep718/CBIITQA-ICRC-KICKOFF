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

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://icrc-test.nci.nih.gov/")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Register'])[1]/following::a[1]")
selenium.type("id=login-username", "testuser1@nih.gov")
selenium.type("id=login-password", "P@ssw0rd1")
selenium.click("id=userlogin_0")
selenium.click("id=saveApplication")
selenium.click("id=submitApplication")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Confirm'])[1]/following::button[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Application Deadline: Sunday, Mar 17, 2019.'])[1]/preceding::input[1]")
selenium.click("xpath=(//button[@type='button'])[9]")
selenium.click("id=submitApplication")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='ICRC-Contact@mail.nih.gov'])[2]/following::button[1]")
selenium.click("id=cancelApplication")
selenium.click("id=modalExitWarningLabel")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Mandatory information missing'])[1]/following::input[46]")
selenium.click("id=cancelApplication")
selenium.click("id=modalExitWarningLabel")
selenium.click("id=cancelApplicationModal")

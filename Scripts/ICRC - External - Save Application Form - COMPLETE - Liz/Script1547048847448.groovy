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

WebUI.callTestCase(findTestCase('ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC External - Personal Information - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC External - Academic Information Section - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC Exrenal - Research Experience - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC - External - Work Experiance - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC - External - Publications and Awards - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC External - File Upload - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC - External - References section - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('ICRC - External - Checkboxes section - Liz'), [:], FailureHandling.STOP_ON_FAILURE)

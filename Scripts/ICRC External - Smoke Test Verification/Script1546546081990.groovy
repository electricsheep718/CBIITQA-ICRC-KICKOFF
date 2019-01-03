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

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login (4)'))

WebUI.click(findTestObject('Page_Login/input_Password_btn btn-default (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Register (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level --- (1)'), '163', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Registration/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Application Information'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Apply Now'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level --- (1)'), '163', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Registration/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login (4)'))

WebUI.click(findTestObject('Page_Login/a_Forgot your password (2)'))

WebUI.click(findTestObject('Page_Forgot Your Password/a_Back to login (2)'))

WebUI.click(findTestObject('Page_Login/input_Password_btn btn-default (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Research Areas'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Center for Cancer Research ('))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Epidemiol'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Center to Reduce Cancer Heal'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Control a'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Treatment'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Alumni'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio_1'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Alumni Photo Gallery'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_FAQs'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Do I have to be a U.S. citi'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_If I am graduating from col'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I submit a paper applic'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I submit a paper applic'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_If I am graduating from col'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Do I have to be a U.S. citi'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Contact Us'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login (5)'))

WebUI.setText(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Email Address_username'), 'asdas')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Password_password'), 
    'UamwtkR6vlg=')

WebUI.setText(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Email Address_username'), '')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Password_password'), 
    'J7R4ejOak4Y=')

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Password must be at leas'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login (5)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Register now'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input__usPersonType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Select a level ---'), 
    '148', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Question 1 ---    W'), 
    '152', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Question 3 ---    W'), 
    '153', true)

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Register (2)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input__usPersonType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Select a level ---'), 
    '147', true)

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Security Questions'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Question 3 ---    W'), 
    '152', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Question 2 ---    W'), 
    '153', true)

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Login (5)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Forgot your password'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input__usertoForgotPassword_0'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Back to login'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input_Password_btn btn-default'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Application Information (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Apply Now (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/input__usPersonType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--- Select a level ---'), 
    '147', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Introduction to Cancer Researc/select_--Select--    Dr.    Mr'), 
    '166', true)

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Application Information (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Research Areas (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_NCI Research Overview'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Center for Cancer Research ( (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Center for Cancer Research'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Epidemiol (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Division of Cancer Epidemi'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Center to Reduce Cancer Heal (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Center to Reduce Cancer He'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Control a (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Division of Cancer Control'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Division of Cancer Treatment (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/div_Division of Cancer Treatme'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Alumni (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio_2'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio_3'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/button_Full Bio_4'))

WebUI.scrollToPosition(123, 17)

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Alumni Photo Gallery (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_2003'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_2004'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_FAQs (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Do I have to be a U.S. citi (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_If I am graduating from col (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I submit a paper applic (1)'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I update my application'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Is my application secure'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Will I need to submit offic'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Who should write my letters'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I submit more than the'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can my references submit th'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_When is the application dea'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Can I save my application a'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_How can I verify that my on'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Will my application be revi'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_How are selections made'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_When will I find out if I a'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_How many students are selec'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_How can I get information a'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_What are the start and end'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Where will I be working if'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Where will I live during my'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/h3_Is this a paid internship'))

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Contact Us (1)'))

WebUI.closeBrowser()


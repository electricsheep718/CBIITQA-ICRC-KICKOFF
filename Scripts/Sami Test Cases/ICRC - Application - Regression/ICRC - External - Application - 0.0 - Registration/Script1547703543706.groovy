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

WebUI.click(findTestObject('Page_Introduction to Cancer Researc/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType (3)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_U.S. Citizen_usPersonTyp (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Alien Registration Number (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level --- (3)'), '162', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level --- (3)'), '164', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Are you U.S. CitizenPerman (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level --- (3)'), '149', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType (3)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr (1)'), '166', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Prefix (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Prefix            --Select (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_First Name (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_First Name (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__firstName (1)'), FirstName)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Middle Name_middleName (1)'), 'Middle_1')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__lastName (1)'), LastName)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__email (1)'), EmailAddress)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Registration/input__password (1)'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Registration/input__confirmPassword (1)'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Address Line 1_address1 (1)'), '123 Fake St')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Address Line 2_address2 (1)'), 'Apt 1')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_City_city (1)'), 'Rockville')

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat (2)'))

WebUI.waitForElementPresent(findTestObject('Page_Registration/div_MD - Maryland_2'), 0)

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MD - Maryland_2'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Postal  Code (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_Postal  Code (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Postal  Code_postalCode (1)'), '20850')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 3 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Please select and answer sec (1)'))

WebUI.click(findTestObject('Object Repository/Page_Registration/strong_Security Questions (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W (1)'), '152', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu (1)'), 'make')

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Select Question 2 (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 2 ---    W (1)'), '153', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_6 (1)'), 'make')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 3 ---    W (1)'), '154', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_16 (1)'), 'make')

'disabled for now!'
WebUI.click(findTestObject('Page_Registration/input_CANCEL_registerButton (1)'))

WebUI.delay(2)

not_run: WebUI.closeBrowser()

WebUI.back()


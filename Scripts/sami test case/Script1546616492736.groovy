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

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/icrcng/displayRegister')

WebUI.click(findTestObject('Page_Registration/input__usPersonType (4)'))

WebUI.selectOptionByValue(findTestObject('Page_Registration/select_--- Select a level --- (5)'), '146', true)

WebUI.selectOptionByValue(findTestObject('Page_Registration/select_--Select--    Dr.    Mr (2)'), '166', true)

WebUI.setText(findTestObject('Page_Registration/input__firstName (2)'), 'sami')

WebUI.setText(findTestObject('Page_Registration/input__lastName (2)'), 'rad')

WebUI.setText(findTestObject('Page_Registration/input__email (2)'), 'some@nih.gov')

WebUI.setEncryptedText(findTestObject('Page_Registration/input__password (2)'), 'C0EeOyVbMO4f7NwSvOQyPg==')

WebUI.setEncryptedText(findTestObject('Page_Registration/input__confirmPassword (2)'), 'C0EeOyVbMO4f7NwSvOQyPg==')

WebUI.click(findTestObject('Page_Registration/div_Prefix            --Select (2)'))

WebUI.setText(findTestObject('Page_Registration/input_Address Line 1_address1 (2)'), '123')

WebUI.setText(findTestObject('Page_Registration/input_City_city (2)'), 'rock')

WebUI.click(findTestObject('Page_Registration/a_State  Province  Region_stat (3)'))

WebUI.click(findTestObject('Page_Registration/div_AL - Alabama (1)'))

WebUI.setText(findTestObject('Page_Registration/input_Postal  Code_postalCode (2)'), '20818')

WebUI.selectOptionByValue(findTestObject('Page_Registration/select_--- Question 1 ---    W (2)'), '152', true)

WebUI.setText(findTestObject('Page_Registration/input_Enter Your Answer for Qu (2)'), 'make')

WebUI.selectOptionByValue(findTestObject('Page_Registration/select_--- Question 2 ---    W (2)'), '153', true)

WebUI.selectOptionByValue(findTestObject('Page_Registration/select_--- Question 3 ---    W (2)'), '154', true)

WebUI.setText(findTestObject('Page_Registration/input_Enter Your Answer for Qu_5 (1)'), 'make')

WebUI.setText(findTestObject('Page_Registration/input_Enter Your Answer for Qu_10 (1)'), 'name')

WebUI.setText(findTestObject('Page_Registration/input_Enter Your Answer for Qu_19'), 'nickname')

WebUI.click(findTestObject('Page_Registration/input_CANCEL_registerButton (1)'))

WebUI.closeBrowser()


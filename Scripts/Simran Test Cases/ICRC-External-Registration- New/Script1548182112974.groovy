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

WebUI.click(findTestObject('Object Repository/a_Register'))

WebUI.click(findTestObject('Object Repository/input__usPersonType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/select_--- Select a level ---'), '163', true)

WebUI.setText(findTestObject('Object Repository/input__firstName'), FirstName)

WebUI.setText(findTestObject('Object Repository/input__lastName'), LastName)

WebUI.setText(findTestObject('Object Repository/input__email'), EmailAddress)

WebUI.setEncryptedText(findTestObject('Object Repository/input__password'), Password)

WebUI.setEncryptedText(findTestObject('Object Repository/input__confirmPassword'), ConfirmPassword)

WebUI.selectOptionByValue(findTestObject('Object Repository/select_--- Question 1 ---    W'), '152', true)

WebUI.setText(findTestObject('Object Repository/input_Enter Your Answer for Qu'), 'make')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_--- Question 2 ---    W'), '154', true)

WebUI.setText(findTestObject('Object Repository/input_Enter Your Answer for Qu_5'), 'make')

WebUI.selectOptionByValue(findTestObject('Object Repository/select_--- Question 3 ---    W'), '156', true)

WebUI.setText(findTestObject('Object Repository/input_Enter Your Answer for Qu_10'), 'make')

WebUI.click(findTestObject('Object Repository/input_CANCEL_registerButton'))

WebUI.click(findTestObject('Object Repository/a_Log out'))

WebUI.closeBrowser()


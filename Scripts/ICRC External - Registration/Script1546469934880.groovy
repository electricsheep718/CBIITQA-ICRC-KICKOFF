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

WebUI.click(findTestObject('Object Repository/Page_Introduction to Cancer Researc/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_U.S. Citizen_usPersonTyp'))

WebUI.click(findTestObject('Object Repository/Page_Registration/strong_Application Deadline is'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Are you'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_U.S. Citizen'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Permanent Resident'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Current or Most Recent E'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Alien Registration Numbe'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Alien Registration Number'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '162', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '163', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '149', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '146', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '147', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '148', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '164', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Are you U.S. CitizenPerman'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Select a level ---'), '149', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/input__usPersonType'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '165', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '166', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '167', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '168', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '169', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '170', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--Select--    Dr.    Mr'), '166', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Prefix'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Prefix            --Select'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_First Name'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_First Name'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__firstName'), 'FirstName_1')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Middle Name_middleName'), 'Middle_1')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Middle Name'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Middle Name'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Last Name'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Last Name'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Middle Name'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__lastName'), 'LastName_1')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Email Address'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Email Address'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input__email'), 'firstname1@nih.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Registration/input__password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Registration/input__confirmPassword'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Password         Passwor'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Confirm Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Password         Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Confirm Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Confirm Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Password         Passwor'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Password         Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/i__fa fa-question-circle'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Password         Password'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Prefix            --Select_1'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Permanent Address'))

WebUI.click(findTestObject('Object Repository/Page_Registration/strong_Permanent Address'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Permanent Address'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Domestic'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_International'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_Permanent Address_addres'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_Domestic_addressType'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_Permanent Address_addres'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_Country'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Address Line 1_address1'), '123 Fake St')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Address Line 2'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_Address Line 2'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Address Line 2_address2'), 'Apt 1')

WebUI.click(findTestObject('Object Repository/Page_Registration/span_City'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_City'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_City_city'), 'Rockville')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_State  Province  Region'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_i'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_i'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_AK - Alaska'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_AL - Alabama'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_AR - Arkansas'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_AZ - Arizona'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_CA - California'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_CO - Colorado'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_CT - Connecticut'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_DC - District of Columbia'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_DE - Delaware'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_FL - Florida'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_GA - Georgia'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_HI - Hawaii'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_IA - Iowa'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_ID - Idaho'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_IL - Illinois'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_IN - Indiana'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_KS - Kansas'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_KY - Kentucky'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_LA - Louisiana'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MA - Massachusetts'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MD - Maryland'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_ME - Maine'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MI - Michigan'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MN - Minnesota'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MO - Missouri'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MS - Mississippi'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MT - Montana'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NC - North Carolina'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_ND - North Dakota'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/ul_AK - AlaskaAL - AlabamaAR -'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NE - Nebraska'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NH - New Hampshire'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NJ - New Jersey'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NM - New Mexico'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NV - Nevada'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_NY - New York'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_OH - Ohio'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_OK - Oklahoma'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_OR - Oregon'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_PA - Pennsylvania'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_RI - Rhode Island'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_SC - South Carolina'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_SD - South Dakota'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_TN - Tennessee'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_TX - Texas'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_UT - Utah'))

WebUI.click(findTestObject('Object Repository/Page_Registration/a_State  Province  Region_stat'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_VA - Virginia'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_VT - Vermont'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_WA - Washington'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_WI - Wisconsin'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_WV - West Virginia'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_WY - Wyoming'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_GU - Guam'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_PR - Puerto Rico'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_VI - U.S. Virgin Islands'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_State  Province  Region_u'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_MD - Maryland_1'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Postal  Code'))

WebUI.click(findTestObject('Object Repository/Page_Registration/span_Postal  Code'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Postal  Code_postalCode'), '20850')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 1'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 2'))

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 3'))

WebUI.click(findTestObject('Object Repository/Page_Registration/p_Please select and answer sec'))

WebUI.click(findTestObject('Object Repository/Page_Registration/strong_Security Questions'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Select Question 1'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Select Question 2'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Select Question 3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '152', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '153', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '154', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '155', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '156', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '157', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '158', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '159', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '160', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '161', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 1 ---    W'), '152', true)

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Enter Your Answer for Qu'))

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu'), 'make1')

WebUI.click(findTestObject('Object Repository/Page_Registration/label_Select Question 2'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_Select Question 2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 2 ---    W'), '153', true)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_1'), 'n')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_2'), 'na')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_3'), 'nam')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_4'), 'name')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_5'), 'name1')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_6'), 'name1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Registration/select_--- Question 3 ---    W'), '154', true)

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_7'), 'n')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_8'), 'ni')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_9'), 'nic')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_10'), 'nick')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_11'), 'nickn')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_12'), 'nickna')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_13'), 'nicknam')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_14'), 'nickname')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_15'), 'nickname1')

WebUI.setText(findTestObject('Object Repository/Page_Registration/input_Enter Your Answer for Qu_16'), 'nickname1')

WebUI.click(findTestObject('Object Repository/Page_Registration/div_CANCEL_clearfix'))

WebUI.click(findTestObject('Object Repository/Page_Registration/div_CANCEL'))

WebUI.click(findTestObject('Object Repository/Page_Registration/input_CANCEL_registerButton'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Log out'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Log out'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_ICRC-Contactmail.nih.gov'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Log out'))

WebUI.closeBrowser()


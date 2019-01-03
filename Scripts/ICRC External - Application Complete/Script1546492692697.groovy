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

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/icrcng/private/application.action')

WebUI.setText(findTestObject('Page_Login/input_Email Address_username (2)'), 'firstname1@nih.edu')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Password_password (2)'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Page_Login/input_Password_userlogin_0 (2)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Log out (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/img'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_ICRC-Contactmail.nih.gov_b'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_OMB No. 0925-0046 Expiratio'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Collection of this informat'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/b_An agency may not conduct or'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Public reporting burden for'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Collection of this informat'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_OMB No. 0925-0046 Expirati'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.primaryPhone'), '3011112222')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Phone_applican'), '1112223333')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Last NameLastName_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle NameMiddle_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Last Name'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Middle Name'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle NameMiddle_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_First NameFirstName_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_First Name'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_2'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Prefix'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Primary Phone'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Phone'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Phone'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Phone'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle Name_writeView'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Primary Email'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Emailfirstname1nih'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Email'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Email'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date of Birth'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Date of Birth'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.dateOfBirth'), '07/01/1996')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Previous NCI InternshipsYe'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_No'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Citizenship Status'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Citizenship StatusU.S. Cit'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Emergency Contact Person'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Emergency Contact Person'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon'), 'LastName_EMCP')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Emergency Contact Number'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Emergency Contact Number'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_1'), '1')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_2'), '12')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_3'), '123')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_4'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_5'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_6'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_7'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_8'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_9'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_10'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_11'), '1234567891')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Are you a MARC Student'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcStudentF'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_No'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcStudentF'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_If yes expiration date o'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcDate'), '01/01/2020')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_3'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_DomesticInternational'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Permanent AddressDomesticI'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Domestic'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_DomesticInternational'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Domestic_applicants.look'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Domestic'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span__closeStateSelect'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_MD - Maryland'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h3_Academic InformationEducati'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Academic InformationEducatio'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Academic InformationEducatio'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom'), '01/01/2004')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date of Attendance To'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo'), '01/01/2009')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School CityState'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School CityState'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity'), 'Baltimore, MD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr'), '176', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree'), 'Doctorate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale ---'), '24', true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Education levelI am a tool'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Cumulative GPA'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School Grade if Other'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Cumulative GPA'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa'), '4.0')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Major'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major ---'), '6', true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Major if Other'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School Grade if OtherCumul'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Major'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Major if Other'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Major if Other'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date Degree Earned or Ex'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate'), '01/01/2009')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School NameDate of Attenda'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr'), '179', 
    true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom'), '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo'), '01/01/2004')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity'), 'Baltimore, MD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Education Le'), '163', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr'), '179', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree'), 'Bachelors')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale ---'), '24', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa'), '4.0')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major ---'), '2', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate'), '01/01/2004')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentor2'), 'Mentor 1')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentorPhone2'), '3011112341')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccStartDate2'), '01/01/2009')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccEndDate2'), '01/01/2014')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccHoursPerWeek2'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccInstitution2'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea__expAccSummary2'), 'Brief Description of Duties')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd_1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Characters 27'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Work Experience'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Work Experience'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Work Experience'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Place of Employment_expA'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Name of Supervisor_expAc'), 'Name Of Supervisor')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Supervisor Phone _expAcc'), '3012221092')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Start Date_expAccStartDa'), '01/01/2012')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_End Date_expAccEndDate'), '01/01/2018')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Hours Per Week_expAccHou'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Brief Summary of Duti'), 'Brief Summary of Duties')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_2'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Place of Employment'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Publications_publication'), 'Publication for Addition')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_3'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Honors and Awards_honors'), 'Honors and Awards')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_4'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Professional Society Membe'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Professional Society Mem'), 'Professional Memberships')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_5'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Other Skills_otherSkills'), 'Other Skills')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_6'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Mandatory information miss'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Why you should be sel'), 'Personal Statement for the ICRC Program')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_(NOT-OD-18-210)_appli'), 'Diversity Statement for Biomedical Statement')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication'))

WebUI.closeBrowser()


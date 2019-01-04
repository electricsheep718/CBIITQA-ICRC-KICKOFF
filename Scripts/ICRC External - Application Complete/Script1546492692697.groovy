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

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Email Address_username (2)'), 'firstname1@nih.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ICRC Application/input_Password_password (2)'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Password_userlogin_0 (2)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Log out (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/img (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_ICRC-Contactmail.nih.gov_b (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_OMB No. 0925-0046 Expiratio (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Collection of this informat (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/b_An agency may not conduct or (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Public reporting burden for (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h5_Collection of this informat (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_OMB No. 0925-0046 Expirati (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.primaryPhone (1)'), '3011112222')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Secondary Phone_applican (1)'), '1112223333')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Last NameLastName_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle NameMiddle_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Last Name (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Middle Name (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle NameMiddle_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_First NameFirstName_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_First Name (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Prefix (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Primary Phone (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Phone (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Phone (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Phone (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Middle Name_writeView (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Primary Email (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Emailfirstname1nih (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Email (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Email (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date of Birth (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Date of Birth (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.dateOfBirth (1)'), '07/01/1996')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Previous NCI InternshipsYe (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Yes (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_No (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Citizenship Status (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Citizenship StatusU.S. Cit (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Emergency Contact Person (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Emergency Contact Person (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon (1)'), 'LastName_EMCP')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Emergency Contact Number (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Emergency Contact Number (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_1 (1)'), '1')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_2 (1)'), '12')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_3 (1)'), '123')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_4 (1)'), '1234')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_5 (1)'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_6 (1)'), '123456')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_7 (1)'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_8 (1)'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_9 (1)'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_10 (1)'), '1234567891')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.emergencyCon_11 (1)'), '1234567891')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Are you a MARC Student (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_YesNo (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcStudentF (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.marcStude (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_No (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcStudentF (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_If yes expiration date o (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__applicants.marcDate (1)'), '01/01/2020')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Prefix    ---Select Prefix_3 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_DomesticInternational (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Permanent AddressDomesticI (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Domestic (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_DomesticInternational (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Domestic_applicants.look (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Domestic (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/span__closeStateSelect (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_MD - Maryland (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/h3_Academic InformationEducati (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Academic InformationEducatio (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Academic InformationEducatio (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom (1)'), '01/01/2004')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date of Attendance To (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo (1)'), '01/01/2009')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School CityState (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School CityState (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity (1)'), 'Baltimore, MD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr (1)'), 
    '176', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree (1)'), 'Doctorate')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale --- (1)'), '24', 
    true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Education levelI am a tool (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Cumulative GPA (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School Grade if Other (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Cumulative GPA (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa (1)'), '4.0')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Major (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major --- (1)'), '6', 
    true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Primary Major if Other (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School Grade if OtherCumul (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Major (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Secondary Major if Other (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Secondary Major if Other (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_Date Degree Earned or Ex (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate (1)'), '01/01/2009')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_School NameDate of Attenda (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr (1)'), 
    '179', true)

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchool (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateFrom (1)'), '01/01/2000')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDateTo (1)'), '01/01/2004')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduSchoolCity (1)'), 'Baltimore, MD')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Education Le (1)'), 
    '163', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Year at Curr (1)'), 
    '179', true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegree (1)'), 'Bachelors')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Scale --- (1)'), '24', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduGpa (1)'), '4.0')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_ICRC Application/select_--- Select Major --- (1)'), '2', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__eduDegreeDate (1)'), '01/01/2004')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentor2 (1)'), 'Mentor 1')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccMentorPhone2 (1)'), '3011112341')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccStartDate2 (1)'), '01/01/2009')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccEndDate2 (1)'), '01/01/2014')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccHoursPerWeek2 (1)'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__expAccInstitution2 (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea__expAccSummary2 (1)'), 'Brief Description of Duties')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Add                    Upd_1 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Characters 27 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Work Experience (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Work Experience (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Work Experience (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Place of Employment_expA (1)'), 'John Hopkins University')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Name of Supervisor_expAc (1)'), 'Name Of Supervisor')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Supervisor Phone _expAcc (1)'), '3012221092')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Start Date_expAccStartDa (1)'), '01/01/2012')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_End Date_expAccEndDate (1)'), '01/01/2018')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Hours Per Week_expAccHou (1)'), '40')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Brief Summary of Duti (1)'), 'Brief Summary of Duties')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_2 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Place of Employment (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Publications_publication (1)'), 'Publication for Addition')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_3 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Honors and Awards_honors (1)'), 'Honors and Awards')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_4 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Professional Society Membe (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Professional Society Mem (1)'), 'Professional Memberships')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_5 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Other Skills_otherSkills (1)'), 'Other Skills')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Add_6 (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Mandatory information miss (1)'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_Why you should be sel (1)'), 'Personal Statement for the ICRC Program')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/textarea_(NOT-OD-18-210)_appli (1)'), 'Diversity Statement for Biomedical Statement')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://icrc-test.nci.nih.gov/')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_Email Address_username'), 'firstname1@nih.edu')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ICRC Application/input_Password_password'), 'iFGeFYmXIrWy72D5I5E8Dw==')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Loading please wait...Scho'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Loading please wait...Scho'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Loading please wait...'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Loading please wait...    _1'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Loading please wait...    _2'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Publications'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference1.referenceNam'), 'Ref1 Last1')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference1.referenceIns'), 'John Hopkins')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference1.referenceAdd'), '123 John Hop Ave')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference1.referencePho'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference1.referenceEma'), 'ref1@hopkins.edu')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference2.referenceNam'), 'Ref2 Last2')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference2.referenceIns'), 'John Hopkins')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference2.referenceAdd'), '123 John Hop Ave')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference2.referencePho'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input__reference2.referenceEma'), 'ref2@hopkins.edu')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Scientific Methodology'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Analytical Chemistry'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Bioinformatics'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Scientific Methodology_s'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_BioengineeringNanomedici'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Biomedical Science_scien'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Medical EntityDisease_me'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Alternative Medicine_med'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_AIDSHIV'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Biomarkers early detection'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Type of Internship Desir'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Type of Placement Desire'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Biomedical (Basic Resear'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Where did you hear about'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))

WebUI.closeBrowser()


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

not_run: WebUI.callTestCase(findTestCase('ICRC External - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_BioengineeringNanomedici (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Cellular Biology_scienti'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/label_If Other please indicate'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/div_Other (please specify belo'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Virology_scientificMetho'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate (1)'), 'Testing')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Medical EntityDisease_me (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Lymphoma non-Hodgkin_med'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Thyroid Cancer_medicalEn'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate_5'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Type of Internship Desir (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Summer_applicants.lookup'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Post-Baccalaureate_appli'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Yes_applicants.internOpt'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Type of Placement Desire (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Lab Placement_applicants'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Non-Lab Placement_applic'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Biomedical (Basic Resear (1)'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_Public Health_researchDi'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate_10'), 'Test')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_NIH or NCI website_hearF'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_LinkedIn_hearFromSelecti'))

WebUI.setText(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate_15'), 'NASA')

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input_If Other please indicate_16'))

WebUI.scrollToElement(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'), 0)

WebUI.click(findTestObject('Page_ICRC Application/input_ICRC-Contactmail.nih.gov'))

WebUI.click(findTestObject('Object Repository/Page_ICRC Application/input__methodsaveApplication (1)'))


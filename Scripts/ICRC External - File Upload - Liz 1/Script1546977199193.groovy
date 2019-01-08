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

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Page_ICRC Application/Page_ICRC Application/input__upload'), 0)

WebUI.uploadFile(findTestObject('Page_ICRC Application/Page_ICRC Application/input__upload'), 'C:\\Users\\andreyeve\\Desktop\\NewFile.pdf')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Resume(s)_upload'), 0)

WebUI.uploadFile(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Resume(s)_upload'), 'C:\\Users\\andreyeve\\Desktop\\NewFile.pdf')

WebUI.scrollToElement(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Financial Document - Mus'), 0)

WebUI.uploadFile(findTestObject('Page_ICRC Application/Page_ICRC Application/input_Financial Document - Mus'), 'C:\\Users\\andreyeve\\Desktop\\NewFile.pdf')

not_run: dd()

def dd() {
    Runtime runTime = Runtime.getRuntime()

    Process process = runTime.exec('C:\\Users\\andreyeve\\Desktop\\FileUpload.exe')
}


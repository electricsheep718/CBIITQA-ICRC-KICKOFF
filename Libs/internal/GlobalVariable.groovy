package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Test Environment</p>
     */
    public static Object baseurl
     
    /**
     * <p></p>
     */
    public static Object GlobalVariable_test_name
     
    /**
     * <p></p>
     */
    public static Object GlobalVariable_Registration_TestDataValue
     
    /**
     * <p></p>
     */
    public static Object GlobalVariable_Registration_Test_TestData
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['baseurl' : 'https://icrc-test.nci.nih.gov', 'GlobalVariable_test_name' : findTestData('GlobalVariables').getValue(findTestData('GlobalVariables'), findTestData('GlobalVariables')), 'GlobalVariable_Registration_TestDataValue' : findTestData('Registration Sami'), 'GlobalVariable_Registration_Test_TestData' : findTestData('Registration Sami')])
        allVariables.put('STAGE', allVariables['default'] + [:])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        baseurl = selectedVariables["baseurl"]
        GlobalVariable_test_name = selectedVariables["GlobalVariable_test_name"]
        GlobalVariable_Registration_TestDataValue = selectedVariables["GlobalVariable_Registration_TestDataValue"]
        GlobalVariable_Registration_Test_TestData = selectedVariables["GlobalVariable_Registration_Test_TestData"]
        
    }
}


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


def static "com.test.demo.CustomFunctions.refreshBrowser"() {
    (new com.test.demo.CustomFunctions()).refreshBrowser()
}

def static "com.test.demo.CustomFunctions.clickElement"(
    	TestObject to	) {
    (new com.test.demo.CustomFunctions()).clickElement(
        	to)
}

def static "com.test.demo.CustomFunctions.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new com.test.demo.CustomFunctions()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

def static "com.test.demo.CustomKeywords.sayHello"(
    	String name	) {
    (new com.test.demo.CustomKeywords()).sayHello(
        	name)
}

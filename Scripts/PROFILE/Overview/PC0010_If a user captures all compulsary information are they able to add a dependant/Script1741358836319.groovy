import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.enhancedClick(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Add Dependant'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Relationship'), 'Relationship', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/dropdown_relationship'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Sister_menuitems'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Nin (National Indentification Number)_ac8ce8'), 
    '1234567890987654', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Email Address_form-control fs-7 _h60 _2cf09b'), 
    'abc@katalon.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Phone Number_form-control fs-7 _h60 __30bf5f'), 
    '1234567890', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Add Dependants'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(10)


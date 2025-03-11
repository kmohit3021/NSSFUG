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

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Benefits_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Benefits Application'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h2_Your Account Summary'), 'Your Account Summary', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Balance'), 'Balance', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Currency'), 'Currency', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Last Transaction'), 'Last Transaction', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Transaction Period'), 'Transaction Period', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Initiate a benefit claim'), 'Initiate a benefit claim', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Choose Benefit Type'), 'Choose Benefit Type', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select a benefit type Age Benefit 55_26ef13'), 
    'AGE_BENEFIT', true, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Picture'), 'Picture', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Picture'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select a benefit type Age Benefit 55_26ef13'), 
    'WITHDRAWAL_BENEFIT', true, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(5)
WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_You do not qualify for WITHDRAWAL_BENEFIT'), 
    'You do not qualify for WITHDRAWAL_BENEFIT', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Please try again'), 'Please try again', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select a benefit type Age Benefit 55_26ef13'), 
    'EXEMPTED_UG', true, FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Required Documents'), 'Required Documents', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Bank Account Statement'), 'Bank Account Statement', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_End of Contract letter'), 'End of Contract letter', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Certified copy of Appointment letter'), 
    'Certified copy of Appointment letter', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Payslip for a month'), 'Payslip for a month', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Continue'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/Choose Exempted Employer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_World Health Organization'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Staff Number_form-control text-upperc_36d491'), 
    '123456', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Check Eligibility'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Staff Number validation failed'), 'Staff Number validation failed..', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select a benefit type Age Benefit 55_26ef13'), 
    'EMIGRATION_NON_UG', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Nationality Validation Failed'), 'Nationality Validation Failed..', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Only Non Ugandans qualify for this benefit'), 
    'Only Non Ugandans qualify for this benefit', FailureHandling.CONTINUE_ON_FAILURE)


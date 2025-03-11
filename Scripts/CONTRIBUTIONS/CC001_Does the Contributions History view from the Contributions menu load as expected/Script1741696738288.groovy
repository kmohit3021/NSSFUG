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
if (WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}
WebUI.click(findTestObject('OR Web/Page_NssfgoApp/span_contributions_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Contributions History'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Your Contributions History'), 'Your Contributions History', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Make a Contribution'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h4_Who are you contributing for'), 0, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select an optionVoluntary TopupAnoth_92f433'), 
    'self', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Mobile Number_form-control _h60 fs-7 _44a585'), 
    '9456846425', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Who are you contributing for   Who are _b18c29'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Amount_form-control _h60 fs-7 ng-unto_7828d8'), 
    '1000', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Make Contribution'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Amount_form-control _h60 fs-7 ng-unto_7828d8'), 
    '5000', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Make Contribution'), 0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Cancel'), 'Cancel', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Make a Contribution'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select an optionVoluntary TopupAnoth_92f433'), 
    'another_member', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_NSSF Number_form-control _h60 fs-7 ng_11b28d'), 
    '12234567788', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Validate NSSF Number'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/Try Again'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_Cancel'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Make a Contribution'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_Select an optionVoluntary TopupAnoth_92f433'), 
    'company', true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/Try Again'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_Cancel'), FailureHandling.OPTIONAL)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}
WebUI.click(findTestObject('OR Web/Page_NssfgoApp/span_contributions_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Standing Orders'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Your Standing Orders History'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Your Standing Orders History'), 'Your Standing Orders History', 
    FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}
WebUI.click(findTestObject('OR Web/Page_NssfgoApp/span_contributions_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Save As You Transact'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Save as you transact list'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Save as you transact list'), 'Save as you transact list', 
    FailureHandling.CONTINUE_ON_FAILURE)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}
WebUI.click(findTestObject('OR Web/Page_NssfgoApp/span_contributions_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Savings Calculator'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_NSSF Savings calculator'), 'NSSF Savings calculator', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Total Contribution (Ugx)'), 'Total Contribution (Ugx)', 
    FailureHandling.CONTINUE_ON_FAILURE)


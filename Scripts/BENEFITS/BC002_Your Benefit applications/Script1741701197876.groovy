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
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Benefits_menu-icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Benefits Tracking'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Your Benefit applications'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_Your Benefit applications'), 'Your Benefit applications')


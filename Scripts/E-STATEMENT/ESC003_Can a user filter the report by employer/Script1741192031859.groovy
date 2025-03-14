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

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_menu-icon'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Filter by employer'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Filter Options'), 'Filter Options')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/label_Employer'), 'Employer')

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Web/Page_NssfgoApp/select_National Social Security Fund'), 
    'National Social Security Fund', true)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Apply'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_National Social Security Fund'), 'National Social Security Fund')

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Clear Search'))


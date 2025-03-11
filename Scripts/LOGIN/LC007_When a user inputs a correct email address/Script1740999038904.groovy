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

WebUI.setText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/input_Mobile Number or Email_form-control __ca2e04'), 
    'katsmakaato@gmail.com')

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Log into your NSSF account'), 'Log into your NSSF account')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Email sent to katsmakaatogmail.com'), 
    'Email sent to katsmakaato@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Enter the verification code here'), 
    'Enter the verification code here')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Didnt get the code'), 'Didn’t get the code ?')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/a_Resend Code'), 'Resend Code')

WebUI.delay(30)


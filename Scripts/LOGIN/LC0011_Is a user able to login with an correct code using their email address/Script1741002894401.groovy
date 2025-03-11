import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

def otp = CustomKeywords.'com.katalon.email.LoginOTP.getOTPGmail'()

WebUI.clearText(findTestObject('OR Web/Page_NssfgoApp/input_Enter the verification code here_form_196606'), FailureHandling.OPTIONAL)

WebUI.sendKeys(findTestObject('OR Web/Page_NssfgoApp/input_Enter the verification code here_form_196606'), otp)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Login'), FailureHandling.OPTIONAL)
WebUI.delay(2)
trueExpired = WebUI.verifyElementPresent(findTestObject('OR Web/Page_NssfgoApp/expired OTP'), 2, FailureHandling.OPTIONAL)

if (trueExpired) {
    println('Is OTP Expired :' + trueExpired)

    WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Try Again'), FailureHandling.OPTIONAL)

    WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/Try Again'), FailureHandling.OPTIONAL)

    def newOtp = CustomKeywords.'com.katalon.email.LoginOTP.getOTPGmail'()

    println(newOtp)

    WebUI.sendKeys(findTestObject('OR Web/Page_NssfgoApp/input_Enter the verification code here_form_196606'), newOtp)

    WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Login'))
}

WebUI.delay(5)


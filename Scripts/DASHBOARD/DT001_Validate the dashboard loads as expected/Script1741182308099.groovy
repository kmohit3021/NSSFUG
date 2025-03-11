import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

boolean elementPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)
if (elementPresent) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}


WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Dashboard'), 'Dashboard', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/small_Member Dashboard'), 'Member Dashboard', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Introducing'), 'Introducing', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_SmartLife Plan'), 'SmartLife Plan', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Voluntary savings account which enables ind'), 
    'Voluntary savings account which enables individuals in formal or informal employment to save for defined periods of time, towards defined goals like education, housing, and emergency fund.', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Competitive daily return'), 'Competitive daily return', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Unlimited Number of Accounts'), 'Unlimited Number of Accounts', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_opensmartlifedialogbtn'), 10, 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_bgi-no-repeat bgi-size-contain bgi-position-'), 
    10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Current Balance'), 'Current Balance', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Last Entry'), 'Last Entry', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Salary Growth Rate'), 'Salary Growth Rate', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Estimated Projections'), 'Estimated Projections', 
    FailureHandling.CONTINUE_ON_FAILURE)


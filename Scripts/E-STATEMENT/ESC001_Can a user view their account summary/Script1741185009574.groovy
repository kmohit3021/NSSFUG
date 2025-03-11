import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

udateNINPresent = WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h1_Update your NIN to complete'),
	5, FailureHandling.OPTIONAL)
if (udateNINPresent) {
	WebUI.click(findTestObject('OR Web/Page_NssfgoApp/button_closeUpdateModalBtn'), FailureHandling.OPTIONAL)
}

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_menu-icon'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_E-Statement'), 'E-Statement')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h2_Your Account Summary'), 'Your Account Summary')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Balance'), 'Balance')

Balance = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_318,231,599'))

WebUI.comment(Balance)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Currency'), 'Currency')

currency = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Ugx'))

WebUI.comment(currency)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Last Transaction'), 'Last Transaction')

LastTransaction = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_2,615,959'))

WebUI.comment(LastTransaction)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Transaction Period'), 'Transaction Period')

TransactionPeriod = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Feb 14, 2025'))

WebUI.comment(TransactionPeriod)
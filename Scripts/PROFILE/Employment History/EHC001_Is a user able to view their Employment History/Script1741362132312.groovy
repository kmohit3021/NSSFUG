import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/Profile'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_Employment History'))

WebUI.waitForElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h2_Employment History'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/th_Employer'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/th_Amount (Ugx)'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Web/Page_NssfgoApp/th_Timeline'), 0)


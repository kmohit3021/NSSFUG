import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h2_Profile Overview'), 'Profile Overview', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/div_Account  Relationship Information'), 
    'Account & Relationship Information', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Name'), 'Name', FailureHandling.CONTINUE_ON_FAILURE)

name = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Emmanuel Sserumaga'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_NSSF Number'), 'NSSF Number', FailureHandling.CONTINUE_ON_FAILURE)

NSSFNumber = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_8611200152662'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Current Balance'), 'Current Balance', 
    FailureHandling.CONTINUE_ON_FAILURE)

CurrentBalance = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_(Ugx) 318,231,599'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Last Transaction'), 'Last Transaction', 
    FailureHandling.CONTINUE_ON_FAILURE)

LastTransaction = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_(Ugx) 2,615,959'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Fathers Name'), 'Father\'s Name', FailureHandling.CONTINUE_ON_FAILURE)

FatherName = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Emmanuel Sserumaga Makaato'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Mothers Name'), 'Mother\'s Name', FailureHandling.CONTINUE_ON_FAILURE)

MotherName = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Nabisuubi Claire'), FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.comment(MotherName)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Guardian Name'), 'Guardian Name', FailureHandling.CONTINUE_ON_FAILURE)


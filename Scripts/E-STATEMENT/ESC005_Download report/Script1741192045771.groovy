import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber as PhoneNumber
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

not_run: WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/span_menu-icon'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Download'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_PROFILE INFORMATION'), 'PROFILE INFORMATION')

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_NSSF Number'), 'NSSF Number')

NSSFNumber = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_8611200152662'))

WebUI.comment(NSSFNumber)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Name'), 'Name')

Name = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Emmanuel Sserumaga'))

WebUI.comment(Name)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Phone Number'), 'Phone Number')

phoneNumber = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_256776712231'))

WebUI.comment(phoneNumber)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_Email Address'), 'Email Address')

EmailAddress = WebUI.getText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/td_katsmakaatogmail.com'))

WebUI.comment(EmailAddress)

WebUI.verifyElementText(findTestObject('Object Repository/OR Web/Page_NssfgoApp/h3_STATEMENT OF ACCOUNT'), 'STATEMENT OF ACCOUNT')

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_Download_1'))

WebUI.click(findTestObject('Object Repository/OR Web/Page_NssfgoApp/button_close_download_button'))


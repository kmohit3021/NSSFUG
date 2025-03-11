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

not_run: WebUI.callTestCase(findTestCase('LOGIN/LC001_launch the application on browser'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('LOGIN/LC002_Verify the Landing Page loads as expected'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('LOGIN/LC007_When a user inputs a correct email address'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('LOGIN/LC0011_Is a user able to login with an correct code using their email address'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('PROFILE/Dependants/PC006_Is a user able to view their dependants if captured'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('PROFILE/Dependants/PC007_Is the Add Dependant button active'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('PROFILE/Dependants/PC008_Is a user able to cancel adding a dependant by clicking the Dismiss button'), 
    [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('PROFILE/Dependants/PC009_Does the Relationship field on the Add dependants form have a dropdown'), 
    [:], FailureHandling.OPTIONAL)


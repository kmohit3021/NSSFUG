package com.katalon.select

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Functions {

	@Keyword
	def List<String> printAllValueFromDropdown(TestObject to) {
		String tag = to.findPropertyValue("tag")
		List<String> listItems = new ArrayList<>()

		if (tag != null && tag.equalsIgnoreCase("select")) {
			Select dropdown = new Select(WebUI.findWebElement(to))
			listItems = dropdown.getOptions().collect { it.getText() }
		} else {
			List<WebElement> dropdownval = WebUI.findWebElements(to, 10)
			int totalItems = dropdownval.size()
			for (int i = 0; i < totalItems; i++) {
				String strItem = dropdownval.get(i).getText()
				listItems.add(strItem)
			}
		}

		Collections.sort(listItems)
		return listItems
	}

	@Keyword
	def verifyAllValueFromDropdownList(TestObject to, List<String> expectedList) {
		String tag = to.findPropertyValue("tag")
		List<String> listItems = new ArrayList<>()

		if (tag != null && tag.equalsIgnoreCase("select")) {
			Select dropdown = new Select(WebUI.findWebElement(to))
			listItems = dropdown.getOptions().collect { it.getText() }
		} else {
			List<WebElement> dropdownval = WebUI.findWebElements(to, 10)
			int totalItems = dropdownval.size()
			for (int i = 0; i < totalItems; i++) {
				String strItem = dropdownval.get(i).getText()
				listItems.add(strItem)
			}
		}
		boolean isEqual = WebUI.verifyEqual(Collections.sort(listItems), Collections.sort(expectedList), FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.comment("Actual List: \n"+listItems+"\nExpected List:\n"+expectedList+"\n is Equal:\n"+isEqual.toString().toUpperCase())
	}


	@Keyword
	def clickOnDropDownValue(TestObject to, String dropdownValue){
		List<WebElement> dropdownval = WebUI.findWebElements(to, 10)
		int totalItems = dropdownval.size()
		for(int i=0; i<totalItems;i++) {
			String strItem = dropdownval.getAt(i).getText()
			if(strItem==dropdownValue) {
				dropdownval.getAt(i).click()
				break
			}
		}
	}
}

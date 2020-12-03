package com.test.placeholder
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class testPlaceholder {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	@Keyword
	def placeholderEstimer1(){
		String str1 = "Numéro et nom de la rue"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/page estimer/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate-fake-address'), "placeholder")

		if(str1 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}

	@Keyword

	def placeholderEstimer2(){
		String str2 = "Code postal"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/page estimer/Page_iad - Vente achat location maison appa_3091d3/input_Ce champ est requis_estimate-fake-zipcode'), "placeholder")

		if(str2 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}
	@Keyword
	def placeholderEstimer3(){
		String str3 = "Ville"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/page estimer/Page_iad - Vente achat location maison appartement immobilier de proximit/input_Ce champ est requis_estimate-fake-city'), "placeholder")

		if(str3 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}


	@Keyword

	def placeholderNom(){
		String str1 = "Nom *"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurelast_name'),"placeholder")

		if(str1 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}
	@Keyword

	def placeholderPrenom(){
		String str2 = "Prénom *"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurefirst_name')     , "placeholder")

		if(str2 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}
	@Keyword

	def placeholderEmail1(){
		String str3 = "Email *"
		String placeholder = WebUI.getAttribute(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochuremail'), "placeholder")

		if(str3 != placeholder) {
			KeywordUtil.markFailed("Placeholder n'est pas comme prévu")
		}
	}
}
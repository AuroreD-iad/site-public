package com.exclusive.test
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


class NbrAnnonceExclusive {
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
	def nombreAnnonceExclusive(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.delay(5)
		int res
		int resultat
		List<WebElement> liens = driver.findElements(By.xpath("//div//div//div//div//div[@class='c-offer__img']//a"))
		resultat = liens.size()
		println "nombre des annonces après calcul est : " +resultat
		WebUI.delay(5)
		String nbrannonces = WebUI.getText(findTestObject('Page_iad - propriet in vendita - Italia/p_75 risultati'))
		String[] numAnn = nbrannonces.split(' ')
		String nbran = (numAnn[0])
		println("Nombre des annonces est " + nbran)
		Double nbran1 = Double.parseDouble(nbran)
		while (WebUI.verifyElementPresent(findTestObject('Page_iad - propriet in vendita - Italia/a__next') , 5, FailureHandling.OPTIONAL)) {

			WebUI.click(findTestObject('Page_iad - propriet in vendita - Italia/a__next'))
			List<WebElement> lienss = driver.findElements(By.xpath("//div//div//div//div//div[@class='c-offer__img']//a"))
			res = lienss.size();
			println "nombre des annonces de toute les pages est : " +res
			WebUI.delay(5)
			resultat = resultat + res
			println(resultat)
		}
		if (nbran1 != resultat) {
			KeywordUtil.markFailed("Numbers of annonces are not eaqual")
		}
		else {
			KeywordUtil.markPassed("Numbers of annonces are  equal")
		}
	}
}
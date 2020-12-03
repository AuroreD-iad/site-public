package com.PageAcheter
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import org.openqa.selenium.interactions.Actions
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords


import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI


import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory


import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper



class NbrAnnincePageAchter {
	@Keyword

	def nombreLien(){
		WebDriver driver = DriverFactory.getWebDriver()
		WebUI.delay(5)
		int res
		int resultat
		List<WebElement> liens = driver.findElements(By.xpath("//div//div//div//div//div[@class='c-offer__img']//a"))
		resultat = liens.size()
		println "nombre des annonces après calcul est : " +resultat
		WebUI.delay(5)
		String nbrannonces = WebUI.getText(findTestObject('Object Repository/Page_iad - Comprar su propiedad en Espaa con nuestro asesor de iad/p_478 resultados'))
		String[] numAnn = nbrannonces.split(' ')
		String nbran = (numAnn[0])
		println("Nombre des annonces est " + nbran)
		Double nbran1 = Double.parseDouble(nbran)
		while (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar su propiedad en Espaa con nuestro asesor de iad/a__next') , 5, FailureHandling.OPTIONAL)) {
			driver.findElement(By.xpath("//ul//li//a[@class=' next']")).click()
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

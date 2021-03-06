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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.verifyElementClickable(findTestObject('louerES-test des annonces/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/img__lazy'))

not_run: WebUI.verifyElementClickable(findTestObject('louerES-test des annonces/img__lazy'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.verifyElementClickable(findTestObject('louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.click(findTestObject('Object Repository/louerES-test des annonces/button_Next'))

WebUI.closeBrowser()


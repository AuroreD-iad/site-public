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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Object Repository/bouton fermer/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_PRESTIGE'))

var = WebUI.getText(findTestObject('test1/Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/p_89 rsultats                                        sur 89 biens de prestige en France'))

WebUI.click(findTestObject('test1/Page_iad - Vente achat location maison appa_3091d3/img'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_PRESTIGE'))

var1 = WebUI.getText(findTestObject('test1/Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/p_89 rsultats                                        sur 89 biens de prestige en France'))

WebUI.verifyEqual(var1, var)

WebUI.click(findTestObject('test1/Page_iad - Vente achat location maison appa_3091d3/img'))

WebUI.click(findTestObject('test1/Page_iad - Vente achat location maison appa_3091d3/a_PRESTIGE'))

var2 = WebUI.getText(findTestObject('test1/Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/p_89 rsultats                                        sur 89 biens de prestige en France'))

WebUI.verifyEqual(var2, var)

WebUI.closeBrowser()


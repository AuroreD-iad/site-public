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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.click(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Vente achat location maison appa_3091d3/a_PRESTIGE'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente achat location maison appa_3091d3/img_Surface dcroissant_lazy'))

test = WebUI.getText(findTestObject('Page_iad - Appartement de 122 m - 3 chambre_5a2bf7/span_760429'))

var = WebUI.getUrl()

s = var.split('\\' + '?')

t = (s[0])

j = t.split('/r')

x = (j[1])

WebUI.verifyEqual(x, test)

WebUI.closeBrowser()


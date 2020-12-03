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

WebUI.click(findTestObject('prestige-accessibilité du formulaire/a_Prestige'))

not_run: WebUI.click(findTestObject('Object Repository/bouton fermer/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Formulaire_champs obligatoires/Page_iad - Vente achat location maison appa_3091d3/a_Surface dcroissant_img-holder'))

css_color1 = WebUI.getCSSValue(findTestObject('Object Repository/couleur d arrière plan d une annonce prestige/Page_iad - Maison de ville de 180 m - 4 chambres - PARIS/button_Next'), 
    'color')

println(css_color1)

WebUI.verifyEqual(css_color1, 'rgba(0, 0, 0, 0)')

css_color2 = WebUI.getCSSValue(findTestObject('Object Repository/couleur bouton/couleur boutons/Page_iad - Appartement de 78 m - 2 chambres - PARIS/button_Previous'), 
    'color')

println(css_color2)

WebUI.closeBrowser()


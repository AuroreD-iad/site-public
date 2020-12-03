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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(15)

not_run: WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/div_FERMER_1'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/a_Estimer'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Maison  Villa'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-address'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-address'), 
    'Rueil-Malmaison, France')

WebUI.delay(2)

WebUI.sendKeys(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-address'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.sendKeys(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-address'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-zipcode'), 
    '75001')

not_run: WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate-fake-city'), 
    'Paris')

WebUI.verifyElementClickable(findTestObject('Page_iad - Vente achat location maison appartement immobilier de proximit/a_Etape suivante'))

WebUI.click(findTestObject('Page_iad - Vente achat location maison appartement immobilier de proximit/a_Etape suivante'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Standing_estimate_my_houseStanding'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Qualit Emplacement_estimate_my_houseQ_965f87'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Mitoyennet'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Piscine'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_Etape suivante-ET2'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est obligatoire_estimate_my__221e16'), 
    '70')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est obligatoire_estimate_my__9cccbb'), 
    '90')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/span'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_De_estimate_my_houseSurfaceGarage'), 
    '10')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/span_'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Parking intrieur'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_Etape suivante-ET3'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Gros uvre_estimate_my_houseEtatMursEx_4dd27d'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_nergie_estimate_my_houseEtatInstallat_6b429c'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Revtement_estimate_my_houseEtatCouverture'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Isolation_estimate_my_houseEtatIsolation'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_Etape suivante-ET4'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Monsieur'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate_my_house_1b6174'), 
    'test form')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate_my_house_4f3ae5'), 
    'test-form@test.fr')

WebUI.setText(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_Ce champ est requis_estimate_my_house_cd6f79'), 
    '0660616060')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Propritaire'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/label_Immdiatement'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/input_concat(Je n, , envisage pas de vendre_26572c'))

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/button_Dcouvrir mon estimation'))

not_run: WebUI.verifyElementAttributeValue(findTestObject('Page_iad - Vente, achat, location, maison, _20b116/p_530348   589275 '), 
    '', '', 0)

WebUI.closeBrowser()


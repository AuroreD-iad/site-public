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

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Object Repository/Page Acceuil/Page_iad - Vente, achat, location, maison, _20b116/div_FERMER'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_plus de criteres'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Type(s) de bien'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_Appartement'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Surface minmax'))

WebUI.setText(findTestObject('Site Public - page Accueil - Champs recherche/input_Min _surface_min'), '50')

WebUI.setText(findTestObject('Site Public - page Accueil - Champs recherche/input_Max _surface_max'), '100')

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Pice(s)'))

not_run: WebUI.click(findTestObject('Object Repository/Page Acceuil/Page_iad - Vente, achat, location, maison, _20b116/i_m_demo-icon icon-piece-1'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_1 pice'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Tag(s)'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_Exclusivit'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Chambres'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_1 chambre'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/ajout/div_tendre la recherche                                            5 km                        10 km                        15 km20 km'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_tendre la recherche'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_5 km'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_DPE'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_DPE A'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_Type mandat'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_Exclusif'))

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/li_Non-exclusif'))

WebUI.setText(findTestObject('Site Public - page Accueil - Champs recherche/input_Non-exclusif_id'), 'N°1230')

WebUI.click(findTestObject('Site Public - page Accueil - Champs recherche/a_moins de criteres'))

WebUI.closeBrowser()


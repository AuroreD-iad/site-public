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

not_run: WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/svg_FERMER_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/a_Louer_1'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/li_Louer'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/li_Louer'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/a_Lieu(x)'))

WebUI.setText(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/input_Louer_whereToBuy'), 
    'paris')

WebUI.doubleClick(findTestObject('Object Repository/Recherche/Page_iad - Vente achat location maison appa_3091d3/img_Surface dcroissant_lazy'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/a_Type(s) de bien'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/li_Maison'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/a_Surface minmax'))

WebUI.setText(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/input_Min _surface_min'), 
    '100')

WebUI.setText(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/input_Max _surface_max'), 
    '200')

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/a_Pice(s)'))

WebUI.verifyElementClickable(findTestObject('Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/a_Pice(s)'))

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/li_2 pices'))

not_run: WebUI.check(findTestObject('Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/li_2 pices'))

not_run: WebUI.verifyElementChecked(findTestObject('Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/li_2 pices'), 
    0)

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/a_Prix minmax'))

WebUI.setText(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/input_Min _price_min'), 
    '20000')

WebUI.setText(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/input_Max _price_max'), 
    '25000')

WebUI.click(findTestObject('Object Repository/Recherche/Page_iad - Appartement de 87 m - 2 chambres_948a84/span_Recherche'))

WebUI.closeBrowser()


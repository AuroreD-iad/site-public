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

not_run: WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vente achat location maison appa_3091d3/span_FERMER'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vente achat location maison appa_3091d3/a_Vendre'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vente achat location maison appa_3091d3/a_Vendre'))

WebUI.click(findTestObject('Page_iad - Vendre son bien immobilier avec un conseiller iad/a_tre rappel'))

WebUI.verifyElementClickable(findTestObject('Page_iad - Vendre son bien immobilier avec un conseiller iad/a_tre rappel'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Type de bien'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Type de bien'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/li_MaisonVilla'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/li_MaisonVilla'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Nombre de pices'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Nombre de pices'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/li_1'))

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Appartement_sell_my_propertyproduct_surface'), 
    '100')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_m_sell_my_propertyprice'), 
    '200000')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Ce champ est requis_sell_my_propertyp_746687'), 
    'Annecy')

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Vendre mon bien - Etape 12             _8872d1'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Vendre mon bien - Etape 12             _8872d1'))

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Ce champ est requis_sell_my_propertyp_8a9de1'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Ce champ est requis_sell_my_propertyp_95b31f'), 
    'Argenteil')

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Etape 2'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Etape 2'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Vous tes'))

WebUI.verifyElementClickable(findTestObject('vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/a_Vous tes'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/li_Madame'))

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertyfirst_name'), 
    'Amina')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertylast_name'), 
    'HADHOUDI')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertyemail'), 
    'test@a.com')

WebUI.setText(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/input_Monsieur_sell_my_propertytelephone'), 
    '0605645626')

WebUI.click(findTestObject('Page_iad - Vendre son bien immobilier avec un conseiller iad/input_Monsieur_register_newsletterV'))

WebUI.click(findTestObject('Object Repository/vendre bien/Page_iad - Vendre son bien immobilier avec _1ba77b/div_Etape 1'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Unisciti a noi'))

WebUI.switchToWindowTitle('iad - Diventa Consulente Immobiliare iad Italia')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_uslast_name'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_usfirst_name'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_usphone'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_usemail'), 
    'test@italia.com')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_usaddress'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_uscity'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_uszipcode'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/input_Per maggiori informazioni_join_usmanager'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Immobiliare'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Immobiliare_required'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Telefono'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Email'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Desidero ricevere via email informazi_cc05c5'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/label_Ho letto la politica sulla privacy e _427a1d'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/div_ Dati necessari'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/div_ Dati necessari'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/span_Inviare'))

WebUI.click(findTestObject('Object Repository/Page_iad - Diventa Consulente Immobiliare i_72b87e/button_Inviare'))

WebUI.closeBrowser()


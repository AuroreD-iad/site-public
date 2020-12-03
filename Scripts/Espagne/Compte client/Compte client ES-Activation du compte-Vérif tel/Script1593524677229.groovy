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

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/span_CERRAR'))

WebUI.click(findTestObject('activation du compte es/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/a_cat_button button__profil_user menu-user-icon'))

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/a_MIS SUSCRIPCIONES'))

WebUI.setText(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/input_CREAR UNA CUENTA__username'), 
    'test@espana.es')

WebUI.setEncryptedText(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/input_CREAR UNA CUENTA__password'), 
    'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Registrarse'))

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/i_cat_demo-icon icon-user-4'))

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/a_MI CUENTA'))

not_run: WebUI.setText(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Sra__phonenumber'), 
    'hhjjk')

not_run: WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Enviar'))

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Perfil del usuario                     _7ce7cd'))

WebUI.setText(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Sra__phonenumber'), 
    '0602014477')

WebUI.getAttribute(findTestObject('activation du compte es/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Sra__phonenumber'), 
    'type')

WebUI.verifyElementAttributeValue(findTestObject('activation du compte es/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Sra__phonenumber'), 
    'type', 'tel', 0)

WebUI.click(findTestObject('Object Repository/vérification num tel/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Enviar'))

WebUI.closeBrowser()


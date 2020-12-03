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

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/svg_CERRAR_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/a_cat_button button__profil_user menu-user-icon'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/a_MIS SUSCRIPCIONES'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/li_CREAR UNA CUENTA'))

WebUI.setText(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Registrarse_createAccountEmail'), 
    'test@espana.es')

WebUI.setEncryptedText(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Registrarse_createAccountPassword'), 
    'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.setEncryptedText(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Registrarse_createAccountCPassword'), 
    'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Registrarse_createAccountTerms'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Trmino y Condiciones_createAccountNL'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/input_IAD puede contactarme con propiedades_f7d0fb'))

WebUI.click(findTestObject('Object Repository/compte ES/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Suscribir'))

WebUI.closeBrowser()


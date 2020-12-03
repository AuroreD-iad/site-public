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

WebUI.click(findTestObject('Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/div_CERRAR'))

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/a_nete a iad'))

WebUI.switchToWindowUrl('https://preprod.iadespana.es/es/ser-agente-iad')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uslast_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uslast_name'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uslast_name'), 
    'Nouri')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usfirst_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usfirst_name'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usfirst_name'), 
    'ikhlass')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usphone'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usphone'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usphone'), 
    '012346789')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usemail'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usemail'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usemail'), 
    'ikhlassgmail.com')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usaddress'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usaddress'), 
    'test')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uscity'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uscity'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uscity'), 
    'madrid')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uszipcode'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uszipcode'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_uszipcode'), 
    '17000')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usmanager'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Para saber ms_join_usmanager'), 
    'test')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Inmobiliario'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Inmobiliario'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Inmobiliario_required'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Inmobiliario_required'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Telfono'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Telfono'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Correo electrnico'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Correo electrnico'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Deseo recibir por correo electrnico i_00bffb'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_Deseo recibir por correo electrnico i_00bffb'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_He ledo la poltica de privacidad y de uso'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar vender y alquilar una ca_9c3789/label_He ledo la poltica de privacidad y de uso'))

WebUI.click(findTestObject('page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Enviar'))


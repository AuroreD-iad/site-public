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

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/span_CERRAR'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/div_Comprar, alquilar o vender Un asesor en_70ae05'), 
    0)

WebUI.setText(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/input_Alquilar_whereToBuy'), 
    'valen')

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/li_Comunidad Valenciana'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/span_Comunidad Valenciana'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Bsqueda avanzada'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Tipos de propiedades'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/li_Piso'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_rea'))

WebUI.setText(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/input_Min _surface_min'), 
    '30')

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Estancias'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/li_1 habitacin'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Precio'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Etiqueta(s)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/div_Dormitorios                            _a80464'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/div_Superficie de la tierra                _285b05'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Baos'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/input_m_mandate_uid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/a_Bsqueda avanzada'), 
    0)

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - page d accueil - recherche/button_Buscar'))

not_run: WebUI.verifyElementText(findTestObject('ES - Creer une alerte/a_1 Lugar(es)'), '1 Lugar(es)')

WebUI.click(findTestObject('ES - Creer une alerte/button_Crea una alerta'))

WebUI.setText(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/input_DESCONECTAR_alert_config_formemail'), 
    'test@moimontest.fr')

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/a_Diriament'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/li_Setmanal'))

WebUI.click(findTestObject('Site - public Espagne - au 07-12-2020/ES - Creer une alerte/button_Crea una alerta_1'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/div_Me gustara recibir avisos por correo el_8da6e9'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/input_Tu perfil ha sido actualizado_buyer'))

WebUI.click(findTestObject('Object Repository/Site - public Espagne - au 07-12-2020/ES - Creer une alerte/button_Suscribir'))

WebUI.closeBrowser()


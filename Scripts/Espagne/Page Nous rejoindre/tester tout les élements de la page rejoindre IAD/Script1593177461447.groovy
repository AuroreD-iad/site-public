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

WebUI.verifyElementPresent(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/h1_Comprar alquilar o vender Un asesor en c_cbd83f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/h1_Comprar alquilar o vender Un asesor en c_cbd83f'), 
    0)

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Comprar'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Comprar'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Alquilar_whereToBuy'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Bsqueda avanzada'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Alquilar_whereToBuy'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Comprar alquilar o vender Un asesor en _01711f'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Comprar alquilar o vender Un asesor en _01711f'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Comprar alquilar o vender Un asesor en _01711f'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Localizame'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/button_Buscar'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - propiedades en venta - Espana/img'))

WebUI.verifyElementText(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/h2_Las Propiedades    ms recientes'), 
    'Las Propiedades más recientes')

WebUI.verifyElementPresent(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_EN VENTA'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_ALQUILAR'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Nuevo                                  _773168'))

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Ver todos los favoritos'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Ver todas las ltimas propiedades'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Nuestros compromisos        Te acompaam_aa0e3e_1'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Comprar una propiedad en Andaluca      _33a293'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/footer_iad Exclusive                       _6684e0'))

WebUI.click(findTestObject('Object Repository/page nous rejoindre/Page_iad - Comprar vender y alquilar una ca_9c3789/div_Sguenos'))

WebUI.verifyAllLinksOnCurrentPageAccessible(false, [])

WebUI.closeBrowser()


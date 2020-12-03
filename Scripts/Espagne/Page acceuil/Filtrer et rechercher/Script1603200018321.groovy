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

WebUI.navigateToUrl('http://preprod.iadespana.es/')

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/span_CERRAR'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_acepto'))

WebUI.click(findTestObject('filtrer et rechercher/a_Bsqueda avanzada'))

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_Alquilar_whereToBuy'), 'madrid')

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_Madrid'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Estancias'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_3 habitaciones'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/div_Tipos de propiedades                   _acf6c8'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Precio'))

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_Min _price_min'), '100000')

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_Max _price_max'), '200000')

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/div_Tipos de propiedades                   _acf6c8_1'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Dormitorios'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_3 dormitorios'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Etiqueta(s)'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_Nuevo'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Superficie de la tierra'))

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_Min _land_surface_min'), '100')

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_Max _land_surface_max'), '200')

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Baos'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_2 baos'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/a_Distancia de bsqueda'))

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/li_10 km'))

WebUI.setText(findTestObject('Object Repository/filtrer et rechercher/input_m_mandate_uid'), '123654')

WebUI.click(findTestObject('Object Repository/filtrer et rechercher/span_Buscar'))

WebUI.closeBrowser()


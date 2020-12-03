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

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_Lugar(es)'))

WebUI.setText(findTestObject('Object Repository/louer ES-zone recherche/input_Alquilar_whereToBuy'), 'madrid')

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/li_Comunidad de Madrid'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_Tipos de propiedades'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/li_Casa'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_rea'))

WebUI.setText(findTestObject('Object Repository/louer ES-zone recherche/input_Min _surface_min'), '100')

WebUI.setText(findTestObject('Object Repository/louer ES-zone recherche/input_Max _surface_max'), '200')

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_Estancias'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/i_m_demo-icon icon-piece-2'))

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/a_Precio'))

WebUI.setText(findTestObject('Object Repository/louer ES-zone recherche/input_Min _price_min'), '100000')

WebUI.setText(findTestObject('Object Repository/louer ES-zone recherche/input_Max _price_max'), '150000')

WebUI.click(findTestObject('Object Repository/louer ES-zone recherche/div_Alquilar una propiedad en Espaa        _91d785'))

WebUI.click(findTestObject('louer ES-zone recherche/button_Buscar'))

WebUI.closeBrowser()


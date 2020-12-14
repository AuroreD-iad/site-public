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

WebUI.navigateToUrl('http://preprod.iad-italia.it/')

WebUI.click(findTestObject('Object Repository/IT-vendre/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Accetto'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Vendi'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Vendi la tua casa'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Tipo di propriet'))

WebUI.click(findTestObject('Object Repository/IT-vendre/li_Casa'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Numero di locali'))

WebUI.click(findTestObject('Object Repository/IT-vendre/li_1'))

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_property_5ba326'), '100')

WebUI.getAttribute(findTestObject('IT-vendre/input_Questo campo  richiesto_sell_property_5ba326'), 'required')

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_propertyprice'), '10000')

WebUI.getAttribute(findTestObject('IT-vendre/input_Questo campo  richiesto_sell_propertyprice'), 'required')

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_property_5103c2'), 'aaaa')

WebUI.getAttribute(findTestObject('IT-vendre/input_Questo campo  richiesto_sell_property_5103c2'), 'required')

WebUI.setText(findTestObject('IT-vendre/input_Este campo es obligatorio_sell_propertyproduct_city'), 'madrid')

WebUI.getAttribute(findTestObject('IT-vendre/input_Este campo es obligatorio_sell_propertyproduct_city'), 'required')

WebUI.setText(findTestObject('IT-vendre/input_Este campo es obligatorio_sell_propertyproduct_zip'), '01522')

WebUI.getAttribute(findTestObject('IT-vendre/input_Este campo es obligatorio_sell_propertyproduct_zip'), 'required')

WebUI.click(findTestObject('IT-vendre/div_Paso 2'))

WebUI.click(findTestObject('Object Repository/IT-vendre/a_Siete'))

WebUI.click(findTestObject('Object Repository/IT-vendre/li_Sig'))

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_property_563ef7'), 'test')

WebUI.getAttribute(findTestObject('IT-vendre/input_Questo campo  richiesto_sell_property_563ef7'), 'required')

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_property_6d2fae'), 'test')

WebUI.getAttribute(findTestObject('IT-vendre/input_Questo campo  richiesto_sell_property_6d2fae'), 'required')

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Questo campo  richiesto_sell_property_0c6749'), '0123456789')

WebUI.setText(findTestObject('Object Repository/IT-vendre/input_Il tuo indirizzo email non  valido_se_48a3ff'), 'test@italie.it')

WebUI.getAttribute(findTestObject('IT-vendre/input_Il tuo indirizzo email non  valido_se_48a3ff'), 'required')

WebUI.check(findTestObject('Object Repository/IT-vendre/input_Il tuo indirizzo email non  valido_seller'))

WebUI.check(findTestObject('Object Repository/IT-vendre/input_Desidero ricevere via email consigli _018e1d'))

WebUI.verifyElementClickable(findTestObject('Object Repository/IT-vendre/span_Inviare'))

WebUI.click(findTestObject('Object Repository/IT-vendre/span_Inviare'))

WebUI.verifyElementPresent(findTestObject('IT-vendre/div_                                Il tuo messaggio  stato inoltrato'), 
    0)

WebUI.closeBrowser()


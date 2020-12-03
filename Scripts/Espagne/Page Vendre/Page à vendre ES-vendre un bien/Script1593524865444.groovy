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

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/div_CERRAR'))

WebUI.click(findTestObject('Object Repository/page vender ES/div_CERRAR'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/a_Vender'))

WebUI.click(findTestObject('Object Repository/page vender ES/a_Vender'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/a_Vende tu casa'))

WebUI.click(findTestObject('Object Repository/page vender ES/a_Vende tu casa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/a_Tipo de propiedad'))

WebUI.click(findTestObject('Object Repository/page vender ES/a_Tipo de propiedad'))

WebUI.click(findTestObject('Object Repository/page vender ES/li_Casa'))

WebUI.click(findTestObject('Object Repository/page vender ES/a_N de estancias'))

WebUI.click(findTestObject('Object Repository/page vender ES/li_2'))

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_fc5e4c'), '100')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_propertyprice'), '20000')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_30770f'), '0211445588')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_365098'), '21000')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_ae0615'), 'test')

WebUI.click(findTestObject('Object Repository/page vender ES/i_Paso 2_demo-icon icon-arrow-right'))

WebUI.click(findTestObject('Object Repository/page vender ES/a_Estas'))

WebUI.click(findTestObject('Object Repository/page vender ES/li_Sra'))

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_c4a0f2'), 'Amina')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_995492'), 'HAD')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Este campo es obligatorio_sell_proper_aff534'), '0321456987')

WebUI.setText(findTestObject('Object Repository/page vender ES/input_Su correo electrnico no es vlido_sell_5f2796'), 'test@gmail.com')

not_run: WebUI.check(findTestObject('Object Repository/page vender ES/input_Su correo electrnico no es vlido_seller'))

not_run: WebUI.check(findTestObject('Object Repository/page vender ES/input_Deseo recibir por correo electrnico c_452424'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/div_Paso 1'))

WebUI.click(findTestObject('Object Repository/page vender ES/div_Paso 1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/div_Paso 2'))

WebUI.click(findTestObject('Object Repository/page vender ES/div_Paso 2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/page vender ES/span_Enviar'))

WebUI.click(findTestObject('Object Repository/page vender ES/span_Enviar'))

WebUI.closeBrowser()


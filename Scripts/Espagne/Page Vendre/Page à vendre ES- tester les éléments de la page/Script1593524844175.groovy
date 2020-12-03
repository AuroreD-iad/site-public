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

WebUI.click(findTestObject('Object Repository/test des elements de la page à vendre ES/span_CERRAR'))

WebUI.click(findTestObject('Object Repository/test des elements de la page à vendre ES/a_Vender'))

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/a_Vende tu casa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/a_Encontrar un agente'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/a_nete a iad'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/h1_Quieres vender una propiedad            _4708f7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/h2_Els nostres serveis'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/div_AVISO DE VALOR                         _8acb03'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/div_MEJORANDO SU PROPIEDAD'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/p_DIFUSIN DE SU ANUNCIO'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/p_GESTIN DE VISITAS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/svg_Els nostres serveis_svg-inline--fa fa-k_f0784b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/div_GESTIN DE VISITAS                      _664950'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/div_UN ASESOR DEDICADO Y DISPONIBLE        _d823de'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/test des elements de la page à vendre ES/div_UN MARCO SEGURO                        _d9dde0'), 
    0)


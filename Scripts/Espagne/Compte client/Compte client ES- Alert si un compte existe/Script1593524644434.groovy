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

WebUI.click(findTestObject('Object Repository/Alertas/span_CERRAR'))

WebUI.click(findTestObject('Object Repository/Alertas/i_cat_demo-icon icon-user-4'))

WebUI.verifyElementClickable(findTestObject('Alertas/a_MIS ALERTAS'))

WebUI.click(findTestObject('Object Repository/Alertas/a_MIS ALERTAS'))

WebUI.setText(findTestObject('Object Repository/Alertas/input_CREAR UNA CUENTA__username'), 'test@espana.es')

WebUI.setEncryptedText(findTestObject('Object Repository/Alertas/input_CREAR UNA CUENTA__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/Alertas/button_Registrarse'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Alertas/h1_Mis alertas'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Alertas/h3_No tienes alertas'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Alertas/b_Para crear una alerta inicie una bsqueda _1cd93a'), 
    0)


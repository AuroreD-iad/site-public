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

WebUI.click(findTestObject('Object Repository/Abonnement/span_CERRAR'))

WebUI.click(findTestObject('Object Repository/Abonnement/i_cat_demo-icon icon-user-4'))

WebUI.click(findTestObject('Object Repository/Abonnement/a_MIS SUSCRIPCIONES'))

WebUI.setText(findTestObject('Object Repository/Abonnement/input_CREAR UNA CUENTA__username'), 'test@espana.es')

WebUI.setEncryptedText(findTestObject('Object Repository/Abonnement/input_CREAR UNA CUENTA__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/Abonnement/button_Registrarse'))

WebUI.check(findTestObject('Object Repository/Abonnement/input_Mis suscripciones_news_letter_formbuyer'))

WebUI.check(findTestObject('Object Repository/Abonnement/input_Mis suscripciones_news_letter_formseller'))

WebUI.check(findTestObject('Object Repository/Abonnement/input_Deseo recibir por correo electrnico c_6e77ca'))

WebUI.check(findTestObject('Object Repository/Abonnement/input_Deseo recibir por correo electrnico i_c05769'))

WebUI.verifyElementChecked(findTestObject('Abonnement/input_Mis suscripciones_news_letter_formbuyer'), 0)

WebUI.verifyElementChecked(findTestObject('Abonnement/input_Mis suscripciones_news_letter_formseller'), 0)

WebUI.verifyElementChecked(findTestObject('Abonnement/input_Deseo recibir por correo electrnico c_6e77ca'), 0)

WebUI.verifyElementChecked(findTestObject('Abonnement/input_Deseo recibir por correo electrnico i_c05769'), 0)

WebUI.click(findTestObject('Object Repository/Abonnement/button_Enviar'))

WebUI.closeBrowser()


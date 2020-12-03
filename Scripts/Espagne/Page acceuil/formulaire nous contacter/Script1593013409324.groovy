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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/div_CERRAR'))

WebUI.click(findTestObject('Page_iad - Comprar, vender y alquilar una casa o un piso en Espaa/a_acepto'))

WebUI.click(findTestObject('page d acceuil ES/Page_iad - Comprar, vender y alquilar una casa o un piso en Espaa/a_Quieres ms informacin sobre iad Espaa Contcteno'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Madame_contact_usgender'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Madame_contact_usgender'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usgender'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usgender'))

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_uslast_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_uslast_name'), 
    'required', 0)

WebUI.setText(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_uslast_name'), 
    'nouri')

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usfirst_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usfirst_name'), 
    'required', 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usfirst_name'), 
    'ikhlass')

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usemail'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usemail'), 
    'required', 0)

WebUI.setText(findTestObject('Page_iad - Contactenos/input_Quieres ms informacin sobre iad Espaa Contcteno_contact_usemail'), 
    'iikhlass@gmail.com')

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/a_Seleccione un departamento'), 0)

WebUI.click(findTestObject('Page_iad - Contactenos/a_Seleccione un departamento'))

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/li_Atencin al cliente'), 0)

WebUI.click(findTestObject('Page_iad - Contactenos/li_Atencin al cliente'))

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/input_Otro  Otra_contact_ussubject'), 0)

WebUI.setText(findTestObject('Page_iad - Contactenos/input_Otro  Otra_contact_ussubject'), 'test')

WebUI.verifyElementPresent(findTestObject('Page_iad - Contactenos/textarea_Vous devez choisir un service_contact_usmessage'), 
    0)

WebUI.setText(findTestObject('Page_iad - Contactenos/textarea_Vous devez choisir un service_contact_usmessage'), 'test')

not_run: WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.verifyElementClickable(findTestObject('Page_iad - Contactenos/button_Enviar'))

WebUI.click(findTestObject('Page_iad - Contactenos/button_Enviar'))

WebUI.closeBrowser()


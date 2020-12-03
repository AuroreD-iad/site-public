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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Vente achat location maison appa_3091d3/span_FERMER'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, _20b116/a_Nous contacter'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Site public au 03-12-2020/Site public -Nous contacter/input_Madame_contact_usgender'), 
    0)

WebUI.click(findTestObject('Site public au 03-12-2020/Site public -Nous contacter/input_Madame_contact_usgender'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Prendre contact/label_Monsieur'), 0)

WebUI.click(findTestObject('Object Repository/Page_iad -Prendre contact/label_Monsieur'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_uslast_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_uslast_name'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_uslast_name'), 
    'SARTER')

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usfirst_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usfirst_name'), 
    'required', 0, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usfirst_name'), 
    'Paul')

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usemail'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usemail'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Monsieur_contact_usemail'), 
    'test-contact@iad-digital.fr')

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/a_Choisir un service'), 
    0)

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/a_Choisir un service'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Formulaire nous contacter/Page_iad -Prendre contact/li_Service client'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('Formulaire nous contacter/Page_iad -Prendre contact/li_Service client'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Autre_contact_ussubject'), 
    0)

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/input_Autre_contact_ussubject'), 
    'test')

WebUI.verifyElementPresent(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/textarea_Vous devez choisir un service_cont_996386'), 
    0)

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/textarea_Vous devez choisir un service_cont_996386'), 
    'test')

not_run: WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/button_Envoyer'))

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad -Prendre contact/button_Envoyer'))

WebUI.closeBrowser()


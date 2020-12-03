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

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/span_CERRAR'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/a_acepto'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/a_Prestige'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/img__lazy'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/a_Ver las propiedades'))

WebUI.click(findTestObject('me contacter mini conseiller-prestige ES/span_Contactarme'))

WebUI.setText(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_contact_age_37e61a'), 
    'test')

WebUI.setText(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_contact_age_660f55'), 
    'test')

WebUI.setText(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_contact_agentemail'), 
    'test@test.es')

WebUI.setText(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_contact_agentphone'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/textarea_Este campo es obligatorio_contact__c2c9ff'), 
    'aaaaaaaaa')

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_buyer'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/input_Este campo es obligatorio_partner'))

not_run: WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/div_reCAPTCHA_recaptcha-checkbox-border'))

not_run: WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/div'))

not_run: WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/span_Contctame'))

WebUI.click(findTestObject('Object Repository/me contacter mini conseiller-prestige ES/span_Contctame'))

WebUI.closeBrowser()


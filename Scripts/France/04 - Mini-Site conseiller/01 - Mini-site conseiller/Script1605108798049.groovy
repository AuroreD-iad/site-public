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

not_run: WebUI.click(findTestObject('calculerMensualité/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Bureaux de 61 m - PARIS/a_Mes annonces'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Mandataire immobilier iad Bonneu_32f1e7/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/button_Next'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/button_Next'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/button_Next'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/button_Next'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/a_Motif'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/li_Je souhaiterais avoir plus dinformations'))

WebUI.setText(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'test')

WebUI.setText(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'TEST')

WebUI.setText(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'test@test.com')

WebUI.setText(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/input_Je souhaiterais me renseigner sur les_69c921'), 
    '0602031144')

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/input_Je souhaiterais me renseigner sur les_8734b2'))

WebUI.click(findTestObject('Object Repository/mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/span_Me contacter'))

'Wait 10 seconds to let users input on captcha field'
not_run: WebUI.delay(10)

'Get Text from Captcha field after user input'
not_run: captchaText = WebUI.getText(findTestObject('mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/div_reCAPTCHA_recaptcha-checkbox-border'))

not_run: WebUI.click(findTestObject('mini site/Page_iad - Appartement de 11 m - 1 chambre _f3c714/button_Valider'))

WebUI.closeBrowser()


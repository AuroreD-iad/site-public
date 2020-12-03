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

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.maximizeWindow()

not_run: WebUI.click(findTestObject('calculerMensualité/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/a_Motif'))

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/li_Je souhaiterais avoir plus dinformations'))

WebUI.setText(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_69c921'), 
    '0366998855')

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_8734b2'))

WebUI.setText(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'Amina')

WebUI.getAttribute(findTestObject('vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'required')

WebUI.setText(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'HAd')

WebUI.getAttribute(findTestObject('vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'required')

WebUI.setText(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'hgfkkdh')

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/button_Me contacter'))

WebUI.setText(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'hgfkkdh@k.lm')

WebUI.getAttribute(findTestObject('vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'required')

WebUI.click(findTestObject('Object Repository/vérification des champs obligatoirs/Page_iad - Bureaux de 61 m - PARIS/span_Me contacter'))

WebUI.closeBrowser()


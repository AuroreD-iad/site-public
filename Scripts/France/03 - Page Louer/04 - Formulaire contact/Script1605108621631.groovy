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

not_run: WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Vente achat location maison appa_3091d3/span_FERMER'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/a_Je suis intrss(e) par un bien'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/li_Je suis intrss(e) par un bien'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/li_Je suis intrss(e) par un bien'))

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_bb961c'))

WebUI.doubleClick(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_bb961c'))

WebUI.setText(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_bb961c'), 
    'Had')

WebUI.setText(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_223062'), 
    'Amina')

WebUI.setText(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_d3a54f'), 
    'test@test.com')

WebUI.setText(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/input_Je souhaiterais me renseigner sur les_13ef16'), 
    '0605645626')

WebUI.click(findTestObject('Object Repository/formulaire contact/Page_iad - Bureaux de 61 m - PARIS/span_Contacter votre conseiller'))

WebUI.closeBrowser()


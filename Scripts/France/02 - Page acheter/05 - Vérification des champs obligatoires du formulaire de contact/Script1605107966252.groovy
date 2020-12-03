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

WebUI.click(findTestObject('Formulaire_champs obligatoires/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.click(findTestObject('Formulaire_champs obligatoires/Page_iad - Vente achat location maison appa_3091d3/a_Acheter'))

WebUI.click(findTestObject('Formulaire_champs obligatoires/Page_iad - Vente achat location maison appa_3091d3/a_Surface dcroissant_img-holder'))

WebUI.verifyElementVisible(findTestObject('Formulaire_champs obligatoires/Page_iad - Appartement de 10 m - PARIS/a_Motif'))

WebUI.verifyElementHasAttribute(findTestObject('Formulaire_champs obligatoires/Page_iad - Appartement de 10 m - PARIS/input_Je souhaiterais me renseigner sur les_6cf733'), 
    'required', 0)

WebUI.verifyElementHasAttribute(findTestObject('Formulaire_champs obligatoires/Page_iad - Appartement de 10 m - PARIS/input_Je souhaiterais me renseigner sur les_5c81db'), 
    'required', 0)

WebUI.verifyElementHasAttribute(findTestObject('Formulaire_champs obligatoires/Page_iad - Appartement de 10 m - PARIS/input_Je souhaiterais me renseigner sur les_8800dc'), 
    'required', 0)

WebUI.verifyElementHasAttribute(findTestObject('Formulaire_champs obligatoires/Page_iad - Appartement de 10 m - PARIS/textarea_Je souhaiterais me renseigner sur _fbdbee'), 
    'required', 0)

WebUI.closeBrowser()


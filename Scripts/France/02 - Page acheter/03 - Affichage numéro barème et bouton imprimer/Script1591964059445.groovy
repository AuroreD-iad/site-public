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

WebUI.navigateToUrl('https://preprod.iadfrance.fr')

WebUI.maximizeWindow()

not_run: WebUI.click(findTestObject('Object Repository/Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.click(findTestObject('Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Vente achat location maison appa_3091d3/a_Acheter'))

WebUI.click(findTestObject('Affichage numéro barème, envoyer un mail et imprimer/li_iad France                              _687756'))

WebUI.click(findTestObject('Object Repository/Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Vente achat location maison appa_3091d3/img_Surface dcroissant_lazy'))

WebUI.verifyElementPresent(findTestObject('Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Appartement de 71 m - 2 chambres_bd7dc3/a_Envoi par email'), 
    0)

WebUI.click(findTestObject('Object Repository/Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Appartement de 71 m - 2 chambres_bd7dc3/a_Imprimer'))

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Appartement de 71 m - 2 chambres_bd7dc3/span_Afficher le numro'), 
    0)

WebUI.click(findTestObject('Affichage numéro barème, envoyer un mail et imprimer/Page_iad - Appartement de 71 m - 2 chambres_bd7dc3/span_Afficher le numro'))

WebUI.verifyElementPresent(findTestObject('Page acheter/bouton/Page_iad - Appartement de 71 m - 2 chambres - PARIS/span_Annuler'), 
    0)

WebUI.click(findTestObject('Page acheter/bouton/Page_iad - Appartement de 71 m - 2 chambres - PARIS/span_Annuler'))

WebUI.closeBrowser()


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

not_run: WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Vente achat location maison appa_3091d3/span_FERMER'))

WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.verifyElementPresent(findTestObject('Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Afficher le numro'), 
    0)

WebUI.verifyElementClickable(findTestObject('Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Afficher le numro'))

WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Afficher le numro'))

WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/input'))

WebUI.verifyElementPresent(findTestObject('Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Annuler'), 
    0)

WebUI.verifyElementClickable(findTestObject('Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Annuler'))

WebUI.click(findTestObject('Object Repository/Appeler numéo/Page_iad - Appartement de 350 m - 4 chambre_b66406/span_Annuler'))

WebUI.closeBrowser()


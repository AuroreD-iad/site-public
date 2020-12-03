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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

not_run: WebUI.click(findTestObject('Object Repository/Ordre d affichage-FR/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.setText(findTestObject('Object Repository/Ordre d affichage-FR/Page_iad - Vente achat location maison appa_3091d3/input_Louer_whereToBuy'), 
    'pari')

DEPA = WebUI.getText(findTestObject('Object Repository/Ordre d affichage-FR/Page_iad - Vente achat location maison appa_3091d3/li_Dpartements'))

DEP = 'Départements'

WebUI.verifyEqual(DEPA, DEP)

Ville = WebUI.getText(findTestObject('Object Repository/Ordre d affichage-FR/Page_iad - Vente achat location maison appa_3091d3/li_Villes'))

ville = 'Villes'

WebUI.verifyEqual(Ville, ville)

WebUI.closeBrowser()


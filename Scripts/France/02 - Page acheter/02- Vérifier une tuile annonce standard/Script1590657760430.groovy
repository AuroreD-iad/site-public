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

not_run: WebUI.click(findTestObject('Object Repository/Ordre d affichage-FR/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Object Repository/Page acheter/Page_iad - Vente achat location maison appa_3091d3/a_Acheter'))

WebUI.verifyElementVisible(findTestObject('Page acheter/Page_iad - Vente achat location maison appartement immobilier de proximit/div_Exclusivit_c-offer__profil c-offer__profil_img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page acheter/Page_iad - Vente achat location maison appa_3091d3/div_Nouveau                                _29b8b6'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/span_Nouveau'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page acheter/Page_iad - Vente achat location maison appa_3091d3/a_Appartement de 71 m - 2 chambres - PARIS'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page acheter/Page_iad - Vente achat location maison appa_3091d3/a_PARIS (75019)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page acheter/Page_iad - Vente achat location maison appartement immobilier de proximit/p_71 m'), 
    0)

WebUI.closeBrowser()


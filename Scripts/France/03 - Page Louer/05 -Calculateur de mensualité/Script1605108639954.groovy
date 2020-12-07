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

WebUI.click(findTestObject('mini site/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.verifyElementClickable(findTestObject('calculerMensualité/Page_iad - Vente achat location maison appa_3091d3/a_Louer'))

WebUI.verifyElementClickable(findTestObject('calculerMensualité/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.click(findTestObject('Object Repository/calculerMensualité/Page_iad - Vente achat location maison appa_3091d3/img_Contactez votre conseiller_lazy'))

WebUI.setText(findTestObject('Object Repository/calculerMensualité/Page_iad - Bureaux de 110 m - PARIS/input_  mois_mensualites'), 
    '300')

WebUI.setText(findTestObject('Object Repository/calculerMensualité/Page_iad - Bureaux de 110 m - PARIS/input__apport'), 
    '1000')

WebUI.selectOptionByValue(findTestObject('Object Repository/calculerMensualité/Page_iad - Bureaux de 110 m - PARIS/select_1              2              3     _e936e8'), 
    '6', true)

WebUI.verifyElementClickable(findTestObject('calculerMensualité/Page_iad - Bureaux de 110 m - PARIS/input__valider'))

WebUI.click(findTestObject('Object Repository/calculerMensualité/Page_iad - Bureaux de 110 m - PARIS/input__valider'))

WebUI.closeBrowser()


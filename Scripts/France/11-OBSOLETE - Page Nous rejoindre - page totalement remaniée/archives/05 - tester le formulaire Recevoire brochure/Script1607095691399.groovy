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

WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('Object Repository/formulaire recevoire brochur/Page_iad - Vente achat location maison appa_3091d3/svg_FERMER_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/button_Recevoir une brochure'))

CustomKeywords.'com.test.placeholder.testPlaceholder.placeholderNom'()

WebUI.setText(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurelast_name'), 
    'nouri')

WebUI.verifyElementHasAttribute(findTestObject('formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurelast_name'), 
    'required', 0)

CustomKeywords.'com.test.placeholder.testPlaceholder.placeholderPrenom'()

WebUI.setText(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurefirst_name'), 
    'ikhlass')

WebUI.verifyElementHasAttribute(findTestObject('formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochurefirst_name'), 
    'required', 0)

CustomKeywords.'com.test.placeholder.testPlaceholder.placeholderEmail1'()

WebUI.setText(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochuremail'), 
    'ikhlassnouri@gmail.com')

WebUI.verifyElementHasAttribute(findTestObject('formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/input_Recevoir une brochure_brochuremail'), 
    'required', 0)

WebUI.click(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/span_Je souhaite recevoir par newsletter de_e01eb0'))

WebUI.verifyElementClickable(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/button_Recevoir une brochure_1'))

WebUI.click(findTestObject('Object Repository/formulaire recevoire brochur/Page_Devenez conseiller immobilier indpenda_b4ebde/button_Recevoir une brochure_1'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.maximizeWindow()

not_run: WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/svg_FERMER_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_Trouver un conseiller'))

WebUI.click(findTestObject('Object Repository/FR-trouver conseiller-me contacter/a_Voir le mini-site_panel_open'))

WebUI.verifyElementClickable(findTestObject('FR-trouver conseiller-me contacter/a_Me contacter'))

WebUI.click(findTestObject('FR-trouver conseiller-me contacter/a_Me contacter'))

WebUI.click(findTestObject('Object Repository/FR-trouver conseiller-me contacter/a_Motif'))

WebUI.click(findTestObject('Object Repository/FR-trouver conseiller-me contacter/li_Je souhaite acheterlouer un bien'))

WebUI.setText(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__74fd07'), 
    'test')

WebUI.getAttribute(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__74fd07'), 
    'required')

WebUI.setText(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__088c47'), 
    'test')

WebUI.getAttribute(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__088c47'), 
    'required')

WebUI.setText(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__cf9a66'), 
    'test@a.ma')

WebUI.getAttribute(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__cf9a66'), 
    'required')

WebUI.setText(findTestObject('Object Repository/FR-trouver conseiller-me contacter/input_Je souhaite estimer mon bien_contact__420b8f'), 
    '0123654789')

WebUI.setText(findTestObject('Object Repository/FR-trouver conseiller-me contacter/textarea_Je souhaite estimer mon bien_conta_1bd8a6'), 
    'Je souhaite acheter/louer un bien N° 123654')

WebUI.verifyElementClickable(findTestObject('Object Repository/FR-trouver conseiller-me contacter/span_Me contacter'))

WebUI.click(findTestObject('Object Repository/FR-trouver conseiller-me contacter/span_Me contacter'))

WebUI.closeBrowser()


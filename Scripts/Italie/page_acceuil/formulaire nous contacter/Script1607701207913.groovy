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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Accetto'))

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Desideri ricevere pi informazioni su iad _039d3c'))

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/input_Desideri ricevere pi informazioni su _ff9fa4'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/input_Desideri ricevere pi informazioni su _e0bd1f'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/input_Desideri ricevere pi informazioni su _29195b'), 
    'test@gmail.com')

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/a_Seleziona un dipartimento'))

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/li_Servizio Clienti'))

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/input_Altro_contact_ussubject'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/textarea_Vous devez choisir un service_cont_996386'), 
    'test')

WebUI.click(findTestObject('Object Repository/Formulaire nous contacter/Page_iad - Contattaci/button_Invia'))

WebUI.closeBrowser()


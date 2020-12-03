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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Accetto'))

WebUI.click(findTestObject('Object Repository/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Trova un consulente'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Trova un consulente. Un servizio_97fd18/input_Donnes cartographiques 2020 GeoBasis-_918651'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_iad - Trova un consulente. Un servizio_97fd18/div_Serge TESTUD'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Trova un consulente. Un servizio_97fd18/input_Nessun agente trovato_agent-city'), 
    'palma')

WebUI.closeBrowser()


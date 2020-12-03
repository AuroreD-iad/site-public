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

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.click(findTestObject('Object Repository/Creation compte client/Page_iad - Compra vendi o Affitta unimmobil_7ccb86/span_CHIUDERE'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/i_it_demo-icon icon-user-4'))

WebUI.verifyElementClickable(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/a_MY SUBSCRIPTIONS'))

WebUI.click(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/a_MY SUBSCRIPTIONS'))

WebUI.setText(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/input_CREATE ACCOUNT__username'), 
    'ikhlass@gmail.com')

WebUI.setEncryptedText(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/input_CREATE ACCOUNT__password'), 
    'DTAy7IptbAQaYMX8SnlFtg==')

WebUI.click(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/button_Sign in'))


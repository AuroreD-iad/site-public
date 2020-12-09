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

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.delay(5)

WebUI.click(findTestObject('ITA - Site public Italie/Accueil Italie/span_CHIUDERE'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_Accetto'))

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_en_button button__profil_user menu-user-icon'))

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_LE MIE ISCRIZIONI'))

WebUI.setText(findTestObject('Creation compte client/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/Page_iad - Buy Sell and Rent a house or a apartment in Italy/input_CREATE ACCOUNT__username'), 
    'ikhlass@gmail.com')

WebUI.setEncryptedText(findTestObject('Creation compte client/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/Page_iad - Buy Sell and Rent a house or a apartment in Italy/input__password'), 
    'DTAy7IptbAQaYMX8SnlFtg==')

WebUI.click(findTestObject('Object Repository/Creation compte client/Page_iad - Compra vendi o Affitta unimmobil_7ccb86/button_Accedi'))

WebUI.click(findTestObject('Creation compte client/Page_iad - Buy Sell and Rent a house or a apartment in Italy/i_it_demo-icon icon-user-4'))

not_run: WebUI.click(findTestObject('Page_iad - Compra vendi o Affitta unimmobil_7ccb86/a_en'))

WebUI.verifyElementClickable(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/img__lazy'))

WebUI.verifyElementClickable(findTestObject('Page_iad - Vendita Varie superfici Asti 18703 m/a_Cancella la mia selezione'))

WebUI.click(findTestObject('Page_iad - Vendita Varie superfici Asti 18703 m/a_Cancella la mia selezione'))

WebUI.click(findTestObject('Page_iad - Vendita Varie superfici Asti 18703 m/a_Segui questo immobile'))

WebUI.closeBrowser()


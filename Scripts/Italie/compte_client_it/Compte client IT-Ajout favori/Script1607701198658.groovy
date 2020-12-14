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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://preprod.iad-italia.it/')

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/span_CHIUDERE'))

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

not_run: WebUI.setText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__username'), 'had.a@gmail.it')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/button_Accedi'))

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/a_Avvia la mia ricerca'))

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/i_Asti (14020)_demo-icon icon-star-1 add-se_8883db'))

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/i_Genova (16139)_demo-icon icon-star-1 add-_ed42cc'))

not_run: WebUI.click(findTestObject('Object Repository/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI_1'))

not_run: WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.waitForPageLoad(0)

not_run: WebUI.acceptAlert()

WebUI.click(findTestObject('alertes-italia/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/a_Accetto'))

WebUI.click(findTestObject('alertes-italia/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('ajout favoris-italia/Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.setText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__username'), 'had.a@gmail.it')

WebUI.setEncryptedText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/ajout favoris-italia/button_Accedi'))

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('activation du compte es/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/a_cat_button button__profil_user menu-user-icon'))

not_run: WebUI.click(findTestObject('alertes-italia/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.verifyElementPresent(findTestObject('sans favoris/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/a_Comenzar mi bsqueda'), 
    0)

WebUI.click(findTestObject('sans favoris/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/a_Comenzar mi bsqueda'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ES-Favoris/input_Alquilar_whereToBuy'), 'roma')

WebUI.click(findTestObject('IT-ajout alerte/li_Emilia-Romagna'))

WebUI.click(findTestObject('IT-ajout alerte/span_Ricerca'))

WebUI.click(findTestObject('ajout favoris-italia/i_Legnano (20025)_demo-icon icon-star-1 pointer'))


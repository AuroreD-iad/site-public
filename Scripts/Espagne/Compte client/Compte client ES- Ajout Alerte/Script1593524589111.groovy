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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://preprod.iad-italia.it/')

not_run: WebUI.click(findTestObject('Object Repository/creer alerte/span_CERRAR'))

not_run: WebUI.click(findTestObject('Object Repository/creer alerte/input_Alquilar_whereToBuy'))

not_run: WebUI.click(findTestObject('creer alerte/i_cat_demo-icon icon-user-4'))

not_run: WebUI.click(findTestObject('Object Repository/creer alerte/a_MIS ALERTAS'))

not_run: WebUI.setText(findTestObject('Object Repository/creer alerte/input_CREAR UNA CUENTA__username'), 'test@espana.es')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Alertas/input_CREAR UNA CUENTA__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/creer alerte/button_Registrarse'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/creer alerte/button_Registrarse'))

not_run: WebUI.delay(10)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.click(findTestObject('alertes-italia/span_CHIUDERE'))

WebUI.click(findTestObject('alertes-italia/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('alertes-italia/a_LE MIE RICERCHE'))

WebUI.setText(findTestObject('Object Repository/creer alerte/input_CREAR UNA CUENTA__username'), 'test@espana.es')

WebUI.setEncryptedText(findTestObject('Object Repository/Alertas/input_CREAR UNA CUENTA__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('alertes-italia/button_Accedi'))

WebUI.click(findTestObject('alertes-italia/span_Crea una ricerca personalizzata'))

WebUI.verifyElementPresent(findTestObject('alertes-italia/h1_Le mie ricerche'), 0)

WebUI.verifyElementPresent(findTestObject('alertes-italia/h3_Non hai ricerche personalizzate salvate'), 0)

WebUI.verifyElementPresent(findTestObject('alertes-italia/b_Clicca sul pulsante per iniziare a cercare immobili e creare una ricerca personalizzata'), 
    0)

WebUI.verifyElementPresent(findTestObject('alertes-italia/a_Avvia la mia ricerca'), 0)

WebUI.click(findTestObject('alertes-italia/a_Avvia la mia ricerca'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IT-ajout alerte/input_Affitta_whereToBuy'), 'madrid')

WebUI.click(findTestObject('compte ES/li_Comunidad de Madrid'))

WebUI.click(findTestObject('IT-ajout alerte/span_Ricerca'))

WebUI.verifyElementClickable(findTestObject('IT-ajout alerte/span_Crea una ricerca personalizzata'))

WebUI.click(findTestObject('IT-ajout alerte/span_Crea una ricerca personalizzata'))

WebUI.click(findTestObject('compte ES/span_Crer lalerte'))

WebUI.closeBrowser()


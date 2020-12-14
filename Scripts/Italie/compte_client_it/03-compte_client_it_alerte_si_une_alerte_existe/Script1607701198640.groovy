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

WebUI.click(findTestObject('alertes-italia/span_CHIUDERE'))

WebUI.click(findTestObject('alertes-italia/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('alertes-italia/a_LE MIE RICERCHE'))

WebUI.setText(findTestObject('alertes-italia/input_CREA ACCOUNT__username'), 'had.a@gmail.it')

WebUI.setEncryptedText(findTestObject('alertes-italia/input_CREA ACCOUNT__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('alertes-italia/button_Accedi'))

WebUI.click(findTestObject('alertes-italia/span_Crea una ricerca personalizzata'))

not_run: WebUI.verifyElementPresent(findTestObject('alertes-italia/h1_Le mie ricerche'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('alertes-italia/h3_Non hai ricerche personalizzate salvate'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('alertes-italia/b_Clicca sul pulsante per iniziare a cercare immobili e creare una ricerca personalizzata'), 
    0)

not_run: WebUI.verifyElementPresent(findTestObject('alertes-italia/a_Avvia la mia ricerca'), 0)


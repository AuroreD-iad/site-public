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

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/a_Accetto'))

WebUI.click(findTestObject('alertes-italia/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('Object Repository/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.setText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__username'), 'had.a@gmail.it')

WebUI.setEncryptedText(findTestObject('Object Repository/ajout favoris-italia/input_CREA ACCOUNT__password'), 'U7ULkjol2U8D0Pq064e+Nw==')

WebUI.click(findTestObject('Object Repository/ajout favoris-italia/button_Accedi'))

WebUI.verifyElementPresent(findTestObject('ajout favoris-italia/div_Casa 876 m                                                                                                        Aggiungi ai preferiti'), 
    0)


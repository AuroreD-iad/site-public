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

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('ITA - Site public Italie/ajout favoris-italia/span_CHIUDERE'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/i_it_demo-icon icon-user-4'))

WebUI.verifyElementClickable(findTestObject('ITA - Site public Italie/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('ITA - Site public Italie/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_li_onglet_create_account'))

WebUI.setText(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_input_Create_Account_Email'), 'test_creation_compte1@test.iad')

WebUI.setEncryptedText(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_input_Create_Account_Password1_set'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.setEncryptedText(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_input_Create_Account_Password2_confirm'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('ITA - Site public Italie/03 - Creation de compte/ITA_button_subscribe'))

WebUI.closeBrowser()


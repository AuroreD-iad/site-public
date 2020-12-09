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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_CHIUDERE'))

WebUI.mouseOver(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/i_en_demo-icon icon-user-4'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/li_CREA ACCOUNT'))

WebUI.rightClick(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Accedi_createAccountEmail'))

WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Accedi_createAccountEmail'), 
    'test_AD@test.test3')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_ACCEDI            CREA ACCOUNT         _f95453'))

WebUI.setEncryptedText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Accedi_createAccountPassword'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_Accedi_form__input row'))

WebUI.setEncryptedText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Accedi_createAccountCPassword'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_minimo 8 caratteri_createAccountTerms'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Termini e Condizioni_createAccountNL'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Termini e Condizioni_createAccountNL'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Termini e Condizioni_createAccountNL2'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Termini e Condizioni_createAccountNL2'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/button_Iscriviti'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/p_ stata inviata una mail a test_ADtest.tes_e4dee7'), 
    0)

WebUI.switchToWindowUrl('https://preprod-pub.mail.iadholding.com/')

not_run: WebUI.switchToWindowTitle('(116) MailDev')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_(115) MailDev/a_Crea il tuo account                      _865e16'))

not_run: WebUI.switchToWindowTitle('(115) MailDev')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_(115) MailDev/a_Conferma la mia iscrizione'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_                                Il tuo _1006d4'), 
    0)

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Sig'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/li_Sig.ra'))

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__firstname'))

WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__firstname'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__lastname'), 
    'testeur')

WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__phonenumber'), 
    '0123456789')

WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/button_Invia'))

WebUI.closeBrowser()


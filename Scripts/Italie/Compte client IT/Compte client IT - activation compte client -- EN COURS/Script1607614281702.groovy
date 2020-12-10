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


// les imports pour mon tests alert
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver as WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//fin imports

WebUI.callTestCase(findTestCase('Italie/Compte Client/01 - Creation Compte client -- OK'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/03 - Creation de compte/texte_envoie_mail_confirmation_creation'), 
    0)

result = WebUI.getText(findTestObject('Object Repository/ITA - Site public Italie/03 - Creation de compte/texte_envoie_mail_confirmation_creation'))

if (result.contains('È stata inviata una mail a ')) {
	
	WebDriver driver = DriverFactory.getWebDriver()
	 
	'Passing the text in the text box in the Alert\r\n'
	 
	driver.switchTo().alert().sendKeys('Testing')
	 
	'Dismiss the Alert'
	 
	WebUI.dismissAlert()

//    println('Look, I found it!')
//
//    WebUI.openBrowser('')
//	
//	WebUI.waitForPageLoad(0)

//    WebUI.acceptAlert()
//
//    WebUI.acceptAlert()
} else {
    KeywordUtil.markFailed
}

not_run: WebUI.openBrowser('https://preprod-pub.mail.iadholding.com/')

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_(115) MailDev/a_Crea il tuo account                      _865e16'))

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_(115) MailDev/a_Conferma la mia iscrizione'))

not_run: WebUI.verifyElementPresent(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/div_                                Il tuo _1006d4'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Sig'))

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/li_Sig.ra'))

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__firstname'))

not_run: WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__firstname'), 
    'test')

not_run: WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__lastname'), 
    'testeur')

not_run: WebUI.setText(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/input_Sig.ra__phonenumber'), 
    '0123456789')

not_run: WebUI.click(findTestObject('Object Repository/Site public - ITALIE/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/button_Invia'))

not_run: WebUI.closeBrowser()


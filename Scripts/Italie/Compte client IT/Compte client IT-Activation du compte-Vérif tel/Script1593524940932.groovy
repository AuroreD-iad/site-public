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

WebUI.navigateToUrl('https://preprod-pub.mail.iadholding.com/#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/activation compte Italie-vérif num tel/span_Crea il tuo account'))

WebUI.switchToWindowTitle('(510) MailDev')

WebUI.click(findTestObject('Object Repository/activation compte Italie-vérif num tel/a_Conferma la mia iscrizione'))

WebUI.setText(findTestObject('Object Repository/activation compte Italie-vérif num tel/input_Sigra__firstname'), 'amina')

WebUI.setText(findTestObject('Object Repository/activation compte Italie-vérif num tel/input_Sigra__lastname'), 'had')

WebUI.setText(findTestObject('Object Repository/activation compte Italie-vérif num tel/input_Sigra__phonenumber'), '0605645626')

WebUI.click(findTestObject('Page_iad - Compra vendi o Affitta unimmobil_7ccb86/span_CHIUDERE'))

WebUI.getAttribute(findTestObject('activation compte Italie-vérif num tel/input_Sigra__phonenumber'), 'type')

WebUI.verifyElementAttributeValue(findTestObject('activation du compte es/Page_iad - Comprar vender y alquilar una ca_9c3789/input_Sra__phonenumber'), 
    'type', 'tel', 0)

WebUI.click(findTestObject('Object Repository/activation compte Italie-vérif num tel/button_Invia'))

WebUI.closeBrowser()


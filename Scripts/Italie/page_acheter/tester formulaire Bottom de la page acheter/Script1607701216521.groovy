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

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/svg_CHIUDERE_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Compra, vendi o Affitta unimmobi_1ffd64/a_Compra'))

WebUI.click(findTestObject('Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_Accetto'))

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - vendita tuo immobile in Italia c_77e794/img_Superfice minore_lazy'))

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/a_Sono interessato ad un annuncio'))

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/li_Sono interessato ad un annuncio'))

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/li_Sono interessato ad un annuncio'))

WebUI.setText(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/input_concat(Vorrei sapere di pi circa il q_f12994'), 
    'test2')

WebUI.setText(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/input_concat(Vorrei sapere di pi circa il q_cd08cb'), 
    'test2')

WebUI.setText(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/input_concat(Vorrei sapere di pi circa il q_018580'), 
    'test2@italia.com')

WebUI.setText(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/input_concat(Vorrei sapere di pi circa il q_f3fe2c'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/textarea_concat(Vorrei sapere di pi circa i_57082d'), 
    'test')

WebUI.click(findTestObject('Object Repository/tester formulaire bottom de la page acheter/Page_iad - Vendita Trullo Martina Franca 10_2d44b3/span_Contatta consulente'))

WebUI.closeBrowser()


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

WebUI.navigateToUrl('http://preprod.iad-italia.it/')

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/a_Accetto'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/a_Affitta'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/img_Superfice minore_lazy'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/a_Soggetto'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/li_Sono interessato ad un annuncio'))

WebUI.setText(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_fad1e5'), 
    'test')

WebUI.getAttribute(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_fad1e5'), 
    'required')

WebUI.setText(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_c9d717'), 
    'test')

WebUI.getAttribute(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_c9d717'), 
    'required')

WebUI.setText(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_b70ef5'), 
    'test@italia.it')

WebUI.getAttribute(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_b70ef5'), 
    'required')

WebUI.setText(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_bd8902'), 
    '0123654789')

WebUI.setText(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/textarea_concat(Vorrei sapere di pi circa i_8713ba'), 
    'tesssst')

WebUI.getAttribute(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/textarea_concat(Vorrei sapere di pi circa i_8713ba'), 
    'required')

WebUI.check(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_0ffe9b'))

WebUI.check(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/input_concat(Vorrei sapere di pi circa il q_dd5401'))

WebUI.verifyElementClickable(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/button_Contattami'))

WebUI.click(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/button_Contattami'))

WebUI.verifyElementPresent(findTestObject('Object Repository/IT-Louer-formulaire contact-msg de confirmation/div_                                Captcha_a8abe9'), 
    0)

WebUI.closeBrowser()


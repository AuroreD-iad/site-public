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

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.verifyElementClickable(findTestObject('Object Repository/prestige-accessibilité du formulaire/a_Prestige'))

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/a_Prestige'))

WebUI.verifyElementClickable(findTestObject('Object Repository/prestige-accessibilité du formulaire/img__lazy'))

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/img__lazy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Next'))

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Next'))

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Next'))

WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Next'))

WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_b1198b'), 
    'test')

WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d42656'), 
    'test')

WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d58673'), 
    'tst@gmail.com')

WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_aa1549'), 
    '0705441122')

WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/textarea_Me gustara aprender sobre las prop_a88318'), 
    'aaaaaaaaaaaaaaa')

WebUI.check(findTestObject('prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propiedades alrededor_buyer'))

WebUI.check(findTestObject('prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propiedades alrededor_partner'))

WebUI.verifyElementClickable(findTestObject('prestige-accessibilité du formulaire/span_Contctame'))

WebUI.click(findTestObject('prestige-accessibilité du formulaire/span_Contctame'))

not_run: WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d42656'), 
    'test')

not_run: WebUI.getAttribute(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d42656'), 
    'required')

not_run: WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_b1198b'), 
    'amina')

not_run: WebUI.getAttribute(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_b1198b'), 
    'required')

not_run: WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d58673'), 
    'test@gmail.com')

not_run: WebUI.getAttribute(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_d58673'), 
    'required')

not_run: WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_aa1549'), 
    '03215547899')

not_run: WebUI.getAttribute(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_aa1549'), 
    'required')

not_run: WebUI.setText(findTestObject('Object Repository/prestige-accessibilité du formulaire/textarea_Me gustara aprender sobre las prop_a88318'), 
    'hdcbjkqszbhkhnjkdfze')

not_run: WebUI.verifyElementClickable(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Contacta a un agente'))

not_run: WebUI.click(findTestObject('Object Repository/prestige-accessibilité du formulaire/button_Contacta a un agente'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/Prestige ES-champs obligatoirs/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.click(findTestObject('Object Repository/Prestige ES-champs obligatoirs/a_Prestige'))

WebUI.click(findTestObject('Object Repository/Prestige ES-champs obligatoirs/img__lazy'))

WebUI.setText(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_b1198b'), 
    'amina')

WebUI.getAttribute(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_b1198b'), 
    'required')

WebUI.setText(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_d42656'), 
    'had')

WebUI.getAttribute(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_d42656'), 
    'required')

WebUI.setText(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_d58673'), 
    'test@espana.es')

WebUI.getAttribute(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_d58673'), 
    'required')

WebUI.setText(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_aa1549'), 
    '0605221144')

WebUI.getAttribute(findTestObject('Object Repository/Prestige ES-champs obligatoirs/input_Me gustara aprender sobre las propied_aa1549'), 
    'required')

WebUI.setText(findTestObject('Object Repository/Prestige ES-champs obligatoirs/textarea_Me gustara aprender sobre las prop_a88318'), 
    'test aaaa')

WebUI.check(findTestObject('prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propiedades alrededor_buyer'))

WebUI.check(findTestObject('prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propiedades alrededor_partner'))

WebUI.click(findTestObject('prestige-accessibilité du formulaire/span_Contctame'))

WebUI.closeBrowser()


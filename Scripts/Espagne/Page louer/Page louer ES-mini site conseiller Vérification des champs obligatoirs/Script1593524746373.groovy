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

WebUI.click(findTestObject('Object Repository/louerES-champs obligatoirs/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.click(findTestObject('Object Repository/louerES-champs obligatoirs/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louerES-champs obligatoirs/img_Zona neta ms baja_lazy'))

WebUI.click(findTestObject('mini site/a_Tema'))

WebUI.click(findTestObject('mini site/li_Estoy interesado en una propiedad'))

WebUI.setText(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_b1198b'), 
    'Amina')

WebUI.getAttribute(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_b1198b'), 
    'required')

WebUI.setText(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_d42656'), 
    'Had')

WebUI.getAttribute(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_d42656'), 
    'required')

WebUI.setText(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_d58673'), 
    'test@espana.es')

WebUI.getAttribute(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_d58673'), 
    'required')

WebUI.setText(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_aa1549'), 
    '0605645626')

WebUI.getAttribute(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_aa1549'), 
    'required')

WebUI.setText(findTestObject('Object Repository/louerES-champs obligatoirs/textarea_Me gustara aprender sobre las prop_a88318'), 
    'test')

WebUI.check(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_8486b3'))

WebUI.check(findTestObject('Object Repository/louerES-champs obligatoirs/input_Me gustara aprender sobre las propied_c025ab'))

WebUI.verifyElementClickable(findTestObject('louerES-champs obligatoirs/span_Contctame'))

WebUI.click(findTestObject('Object Repository/louerES-champs obligatoirs/span_Contctame'))

WebUI.closeBrowser()


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

WebUI.click(findTestObject('Object Repository/louerES-formulaire contact/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.verifyElementClickable(findTestObject('louerES-formulaire contact/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louerES-formulaire contact/a_Alquilar'))

WebUI.click(findTestObject('Object Repository/louerES-formulaire contact/img_Alquilar una propiedad   en Andaluca_lazy'))

not_run: WebUI.verifyElementClickable(findTestObject('louerES-formulaire contact/a_Estoy interesado en una propiedad'))

WebUI.click(findTestObject('louerES-formulaire contact/a_Estoy interesado en una propiedad'))

WebUI.setText(findTestObject('Object Repository/louerES-formulaire contact/input_Me gustara aprender sobre las propied_d42656'), 
    'had')

WebUI.click(findTestObject('louerES-formulaire contact/li_Estoy interesado en una propiedad'))

WebUI.setText(findTestObject('Object Repository/louerES-formulaire contact/input_Me gustara aprender sobre las propied_b1198b'), 
    'amina')

WebUI.setText(findTestObject('Object Repository/louerES-formulaire contact/input_Me gustara aprender sobre las propied_d58673'), 
    'test@espana.es')

WebUI.setText(findTestObject('Object Repository/louerES-formulaire contact/input_Me gustara aprender sobre las propied_aa1549'), 
    '0605645626')

WebUI.setText(findTestObject('Object Repository/louerES-formulaire contact/textarea_Me gustara aprender sobre las prop_a88318'), 
    'tesssssssssssssssssssssssssst')

WebUI.click(findTestObject('Object Repository/louerES-formulaire contact/span_Contacta a un agente'))

WebUI.closeBrowser()


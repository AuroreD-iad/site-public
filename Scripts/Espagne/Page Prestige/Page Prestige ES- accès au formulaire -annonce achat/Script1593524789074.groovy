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

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/a_Prestige'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/img__lazy'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Next'))

WebUI.setText(findTestObject('Object Repository/accès formulaire annonce achat/input_Me gustara aprender sobre las propied_b1198b'), 
    'aaa')

WebUI.setText(findTestObject('Object Repository/accès formulaire annonce achat/input_Me gustara aprender sobre las propied_d42656'), 
    'aaa')

WebUI.setText(findTestObject('Object Repository/accès formulaire annonce achat/input_Me gustara aprender sobre las propied_d58673'), 
    'aa@aa.com')

WebUI.setText(findTestObject('Object Repository/accès formulaire annonce achat/input_Me gustara aprender sobre las propied_aa1549'), 
    '123045694552')

WebUI.setText(findTestObject('Object Repository/accès formulaire annonce achat/textarea_Me gustara aprender sobre las prop_a88318'), 
    'cdgvfdgffghf')

WebUI.check(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_8486b3'))

WebUI.check(findTestObject('Object Repository/prestige-accessibilité du formulaire/input_Me gustara aprender sobre las propied_c025ab'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/button_Contctame'))

WebUI.closeBrowser()


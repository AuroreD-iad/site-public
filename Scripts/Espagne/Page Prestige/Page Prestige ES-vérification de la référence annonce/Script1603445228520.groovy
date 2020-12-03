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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadespana.es/')

not_run: WebUI.waitForPageLoad(5).not_run

not_run: WebUI.maximizeWindow()

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/span_CERRAR'))

WebUI.click(findTestObject('louerES-formulaire contact/a_acepto'))

WebUI.click(findTestObject('Object Repository/accès formulaire annonce achat/a_Prestige'))

WebUI.click(findTestObject('nbreAnnnonces-prestige/div_Nuevo                                                           Prestigio'))

test = WebUI.getText(findTestObject('ES-référence/span_43826'))
println test

var = WebUI.getUrl()


j = var.split('m2/')
t= j [1]
println t

WebUI.verifyEqual(t, test)

WebUI.closeBrowser()


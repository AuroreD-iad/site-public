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

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

not_run: WebUI.waitForPageLoad(5).not_run

not_run: WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/IT-Prestige accessibilité du formulaire/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/IT-Prestige accessibilité du formulaire/a_Accetto'))

WebUI.click(findTestObject('Object Repository/IT-Prestige accessibilité du formulaire/a_Prestige'))

WebUI.click(findTestObject('Object Repository/IT-Prestige accessibilité du formulaire/img__lazy'))

test = WebUI.getText(findTestObject('IT-prestige-référence/span_43032'))

println test

var = WebUI.getUrl()


j = var.split('m2/')
t= j [1]
println t

WebUI.verifyEqual(t, test)

WebUI.closeBrowser()


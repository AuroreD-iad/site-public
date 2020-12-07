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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Fermer/Page_iad - Vente achat location maison appartement immobilier de proximit/div_FERMER'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_Trouver un conseiller'))

A = WebUI.getText(findTestObject('Object Repository/Page Trouver un conseiller/Page_iad - Trouvez votre conseiller immobil_595286/span_122'))

println(A)

WebUI.click(findTestObject('Object Repository/Page Trouver un conseiller/Page_iad - Trouvez votre conseiller immobil_595286/img'))

WebUI.click(findTestObject('Page Trouver un conseiller/Page_iad - Comprar vender e arrendar casas e apartamentos em Portugal/a_Encontrar um consultor'))

B = WebUI.getText(findTestObject('Object Repository/Page Trouver un conseiller/Page_iad - Trouvez votre conseiller immobil_595286/span_122'))

println(B)

CustomKeywords.'com.keyword.Test.Compare'(A, B)

WebUI.closeBrowser()


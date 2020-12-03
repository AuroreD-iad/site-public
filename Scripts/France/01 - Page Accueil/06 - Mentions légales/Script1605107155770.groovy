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

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/a_Mentions lgales'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/p_Le site Internetwww.iadfrance.frest un se_4aba1f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/strong_Sige social'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/span_Siret  82092312600024'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/span_RCS  Melun B 820 923 126'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/strong_Copyright'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/span_Le site est accessible 24h24h et 7 jou_e654e3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/strong_Hbergeur du site'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/header_Acheter                             _6b327f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/footer_Les exclusivits iad                 _edf8d7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Mentions lgales/div_Accueil                                _e14a7b'), 
    0)

WebUI.closeBrowser()


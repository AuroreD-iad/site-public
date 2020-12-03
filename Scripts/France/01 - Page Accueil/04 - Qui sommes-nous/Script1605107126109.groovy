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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Object Repository/Page_iad - Vente, achat, location, maison, _20b116/div_FERMER'))

WebUI.click(findTestObject('Page_iad - Vente, achat, location, maison, appartement, immobilier de proximit/a_Qui sommes-nous'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Page_iad -Qui sommes-nous/h2_Qui sommes-nous'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/h3_Prsentation iad'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_Lanc en mai 2008,iadest n de la volont de_8c8ec6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_iada rvolutionn son secteur en y apportan_e9cda3'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_Depuis 2015, iadest galement prsent au Po_4c811b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/h3_Lquipe dirigeante'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_Lactionnariat et le Conseil dAdministrati_f22739'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_- Des 3 actionnaires historiques  Malik B_624a69'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_- Des trois fonds dinvestissement  NAXICA_93ab19'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_- Du Prsident du Directoire  Roland TRIPARD'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/h3_Dveloppement  linternational'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_Le 17 avril 2015, le rseau de mandataires_064ab1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/p_2016 marque larrive au capital diaddes fo_e4e46b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/em_Tous les conseillers iad sont des agents_253470'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/h3_Nos dates cls'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2008Naissance diadFrance dans un garage _86f569'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2011Cap des 1 000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2012Entre du fond dinvestissement Naxica_6fce88'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2012Certification ISO 9001'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2014Cap des 2 000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2015Ouverture diadPortugal'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2016Cap des 3 000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2016Arrive au capital diaddes fonds dinv_940431'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2017Cap des 5000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2017Cap des 5000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2018Cap des 6 000 conseillersOuverture d_eb2e82'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/li_2019Cap des 8 000 conseillers'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_iad -Qui sommes-nous/footer_Les exclusivits iad                 _edf8d7'), 
    0)

WebUI.closeBrowser()


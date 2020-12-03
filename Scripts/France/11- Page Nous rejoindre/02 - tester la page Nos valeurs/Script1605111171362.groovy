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

WebUI.click(findTestObject('Page rejoindre IAD/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Object Repository/Page nos valeurs/Page_iad - Vente achat location maison appa_3091d3/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/Page nos valeurs/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Nos valeurs'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/div_Les valeurs diad'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/h1_Les valeurs diad'), 
    'Les valeurs d\'iad')

WebUI.verifyElementText(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/h2_8 valeurs cls'), 
    '8 valeurs clés')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/p_La philosophieiadrepose sur 8 valeurs ess_37de8c'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/h3_Un rseau bas sur le partage'), 
    'Un réseau basé sur le partage')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/p_Le partage est un pilier fondamental chez_93d161'), 
    0)

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_CAP Management  Leadership 2019'), 
    'CAP Management & Leadership 2019')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_Convention Nationale 2019'), 
    'Convention Nationale 2019')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_La tourne des 10 ans'), 
    'La tournée des 10 ans')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_Convention Rgionale'), 
    'Convention Régionale')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_Les 10 ans diad'), 
    'Les 10 ans d\'iad')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h3_Master Challenge 2019'), 
    'Master Challenge 2019')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h4_ lAccor Hotel Arena'), 
    'à l\'Accor Hotel Arena')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h4_ Lieusaint'), 
    'à Lieusaint')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h4_ Nice'), 
    'à Nice')

WebUI.verifyElementText(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/h4_au Grand Palais'), 
    'au Grand Palais')

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_ Nice_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_au Grand Palais_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_CAP Management  Leadership 2019_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_concat( l  Accor Hotel Arena)_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_iad_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de mandataires immobiliers/img_Master Challenge 2019_img-fluid'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/p_Tous nos conseillers iad sont des agents _a145da'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page nos valeurs/Page_Valeurs cls iad - Le rseau n1 de manda_ac8d68/img_ Lieusaint_iad_logo_footer_lg img-fluid'), 
    0)

WebUI.verifyLinksAccessible([], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


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

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page rejoindre IAD/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Object Repository/page qui somme nous/Page_iad - Vente achat location maison appa_3091d3/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/page qui somme nous/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Qui sommes-nous'))

WebUI.verifyElementText(findTestObject('page qui somme nous/Page_Dcouvrez iad - Le 1er rseau franais de conseillers en immobilier/h1_iad 1er rseau franais de mandataires immobiliers'), 
    'iad, 1er réseau français de mandataires immobiliers')

WebUI.verifyElementPresent(findTestObject('page qui somme nous/Page_Dcouvrez iad - Le 1er rseau franais de conseillers en immobilier/div_iad 1er rseau franais de mandataires immobiliers'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('page qui somme nous/Page_Dcouvrez iad - Le 1er rseau franais de conseillers en immobilier/h2_12ans dhistoire'), 
    '12ans d\'histoire')

WebUI.verifyElementPresent(findTestObject('page qui somme nous/Page_Dcouvrez iad - Le 1er rseau franais de conseillers en immobilier/div_iad 1er rseau franais de mandataires immobiliers'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h2_Les 3 piliers iad'), 
    'Les 3 piliers iad')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_iadest fond sur trois piliers que sont li_555ff2'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_- Limmobilier car les fondateurs diadsont_31d0f7'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_- Le web via la dmatrialisation des agenc_0422db'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_- Le Marketing de Rseau pour permettre  c_f08f26'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h2_Un rseau qui se dveloppe  linternational'), 
    'Un réseau qui se développe à l’international')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_En 2015 le rseau de mandataires immobilie_85799f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h2_iad dans la presse'), 
    'iad dans la presse')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h3_iad  5me du Top CA dans les Champions de_a995d5'), 
    'iad : 5ème du Top CA dans les Champions de la Croissance 2020')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_Le groupe iad un des pionniers des rseaux_1bd5ec'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/a_Source'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/img_iad  5me du Top CA dans les Champions d_911f26'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h3_Iad annonce un chiffre daffaires record'), 
    'Iad annonce un chiffre d’affaires record')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_25 millions deuros en juin 2019 contre 15_efcbdd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/img_Iad annonce un chiffre daffaires record_dd324d'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/a_Source_1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h3_Iad joue un rle dascenseur social en per_d70600'), 
    'Iad joue un rôle d’ascenseur social en permettant à chacun de créer son entreprise')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_Avec son modle bas sur le digital et lent_a30d53'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/h3_Notre croissance est nettement suprieure_3b8991'), 
    'Notre croissance est nettement supérieure au marché')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_iad est le premier rseau franais de manda_b74303'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/a_Source_1_2'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/img_Notre croissance est nettement suprieur_b828a5'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/p_En nombre dagents commerciaux indpendants_bf3487'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Dcouvrez iad - Le 1er rseau franais de_fb3664/footer_Formation et accompagnement    Rejoi_2b2a53'))

WebUI.verifyElementPresent(findTestObject('page qui somme nous/Page_Dcouvrez iad - Le 1er rseau franais de conseillers en immobilier/img_Source_iad_logo_footer_lg img-fluid'), 
    0)

not_run: WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])

WebUI.closeBrowser()


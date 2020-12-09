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

WebUI.waitForPageLoad(10)

not_run: WebUI.click(findTestObject('Page rejoindre IAD/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/img_Rejoindre iad_img-fluid'))

not_run: WebUI.verifyImagePresent(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/img_Rejoindre iad_img-fluid'), 
    FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Rejoindre iad'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Rejoindre iad'))

WebUI.verifyElementClickable(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/a_Qui sommes-nous'))

WebUI.verifyElementClickable(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/a_Formation et Accompagnement'))

WebUI.verifyElementClickable(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/a_Nos valeurs'))

WebUI.verifyElementClickable(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/a_Tmoignages'))

WebUI.verifyElementText(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/h1_Il y a des expriences qui changent une v_ccc46b'), 
    'Il y a des expériences qui changent une vie. Rejoindre iad par exemple')

WebUI.verifyElementPresent(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/div_Il y a des expriences qui changent une _f04b6f'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/div_Devenir conseiller immobilier'), 
    0)

WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/h1_Devenir conseiller immobilier avec iad'), 
    'Devenir conseiller immobilier* avec iad')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/h2_Pourquoi rejoindreiad'), 
    'Pourquoi rejoindre iad ?')

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/h3_Pour son accompagnement et sa formation _475e5b'), 
    'Pour son accompagnement et sa formation dédiés à nos conseillers immobiliers*')

not_run: WebUI.verifyElementPresent(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/p_Lorsque vous entrez cheziadet devenez man_fd2263'), 
    0)

not_run: WebUI.verifyElementText(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/h3_Pour les outils et les ressources mis  d_af95a9'), 
    'Pour les outils et les ressources mis à disposition de ses mandataires immobiliers')

WebUI.closeBrowser()


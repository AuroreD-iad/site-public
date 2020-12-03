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

WebUI.click(findTestObject('Object Repository/page témoignages/Page_iad - Vente achat location maison appa_3091d3/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/page témoignages/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Tmoignages'))

WebUI.verifyElementPresent(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/div_Tmoignages de conseillers iad'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h1_Tmoignages de conseillers iad'), 
    'Témoignages de conseillers iad*')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h2_On a tous une bonne raison de devenir co_512575'), 
    'On a tous une bonne raison de devenir conseiller en immobilier* avec iad')

WebUI.verifyElementPresent(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/p_Dcouvrez les tmoignages de ceux qui ont o_81ba58'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_Frdric'), 
    'Frédéric')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Mobilit professionnelle'), 
    'Mobilité professionnelle')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_David'), 
    'David')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Avoir du temps pour soi'), 
    'Avoir du temps pour soi')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_Valrie'), 
    'Valérie')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Indpendance'), 
    'Indépendance')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_Laura'), 
    'Laura')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Crer son entreprise'), 
    'Créer son entreprise')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_Nathalie'), 
    'Nathalie')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Equilibre vie pro  perso'), 
    'Equilibre vie pro / perso')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h3_Maureen'), 
    'Maureen')

WebUI.verifyElementText(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/h4_Augmenter ses revenus'), 
    'Augmenter ses revenus')

WebUI.click(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/p_Tous nos conseillers iad sont des agents _a145da'))

WebUI.verifyElementPresent(findTestObject('Object Repository/page témoignages/Page_Tmoignages de conseillers immobiliers _6cd83e/img_Crer son entreprise_iad_logo_footer_lg _326f66'), 
    0)

WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])

WebUI.closeBrowser()


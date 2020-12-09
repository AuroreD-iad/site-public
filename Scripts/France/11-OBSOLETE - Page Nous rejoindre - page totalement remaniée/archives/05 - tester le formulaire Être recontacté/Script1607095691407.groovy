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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(5)

not_run: WebUI.click(findTestObject('formulaire etre recontacté/Page_iad - Vente achat location maison appartement immobilier de proximit/span_FERMER'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/button_tre recontact'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentlast_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentlast_name'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteNom'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentlast_name'), 
    'nouri')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentfirst_name'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentfirst_name'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontactePrenom'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentfirst_name'), 
    'ikhlass')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentphone'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentphone'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteTelephone'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentphone'), 
    '0123456789')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentmail'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentmail'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteEmail'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentmail'), 
    'test@gmail.com')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentaddress'), 
    0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteAdresse'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentaddress'), 
    'paris France')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentzipcode'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentzipcode'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteCodePostal'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentzipcode'), 
    '27000')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentcity'), 
    0)

WebUI.verifyElementHasAttribute(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentcity'), 
    'required', 0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteVille'()

WebUI.setText(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentcity'), 
    'leuissant')

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/input_tre recontact_recruitmentmanager'), 
    0)

CustomKeywords.'com.test.FormulaireEtreRecontacté.PlaceholderEtreRecontacté.placeholderEtreRecontacteJeConnaisUnConseiller'()

WebUI.setText(findTestObject('Object Repository/Page_Devenez conseiller immobilier indpenda_b4ebde/input_tre recontact_recruitmentmanager'), 
    'Cristina ARNONE')

WebUI.click(findTestObject('Object Repository/Page_Devenez conseiller immobilier indpenda_b4ebde/label_Immobilier_radio'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/span_Immobilier'), 
    0)

not_run: WebUI.click(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/span_Immobilier'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Immobilier_radio'), 
    0)

WebUI.click(findTestObject('Object Repository/Page rejoindre IAD/Page_Devenez conseiller immobilier indpenda_b4ebde/label_Immobilier_radio'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Tlphone'), 
    0)

WebUI.click(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Tlphone'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Immobilier_radio'), 
    0)

WebUI.click(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Immobilier_radio'))

WebUI.verifyElementPresent(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Je souhaite recevoir'), 
    0)

WebUI.click(findTestObject('Page rejoindre IAD/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/label_Je souhaite recevoir'))

WebUI.verifyElementPresent(findTestObject('formulaire etre recontacté/Page_Devenez conseiller immobilier indpendant - Rejoindre le rseau iad/btn_tre recontact'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Devenez conseiller immobilier indpenda_b4ebde/button_tre recontact_1'))

WebUI.closeBrowser()


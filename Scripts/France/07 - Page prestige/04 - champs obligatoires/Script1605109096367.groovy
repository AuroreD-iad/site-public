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

not_run: WebUI.click(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Vente achat location maison appa_3091d3/div_FERMER'))

WebUI.click(findTestObject('Site public au 03-12-2020/Liens du menu/a_PRESTIGE'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Formulaire conseiller/Page_iad - Vente achat location maison appa_3091d3/img_Surface dcroissant_lazy'))

WebUI.setText(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_bb961c'), 
    'test')

WebUI.getAttribute(findTestObject('Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_bb961c'), 
    'required')

WebUI.setText(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_223062'), 
    'test')

WebUI.verifyElementHasAttribute(findTestObject('Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_223062'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_d3a54f'), 
    'test@gmail.com')

WebUI.verifyElementHasAttribute(findTestObject('Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/input_Je souhaiterais me renseigner sur les_d3a54f'), 
    'required', 0)

WebUI.setText(findTestObject('Object Repository/Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/textarea_Je souhaiterais me renseigner sur _95db47'), 
    'test')

WebUI.verifyElementHasAttribute(findTestObject('Formulaire conseiller/Page_iad - Maison de ville de 180 m - 4 cha_ee51a4/textarea_Je souhaiterais me renseigner sur _95db47'), 
    'required', 0)

WebUI.closeBrowser()


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

WebUI.navigateToUrl('https://preprod.iad-italia.it/')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('ITA - Site public Italie/01 - Accueil/span_CHIUDERE'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/02 - Menu/i_it_demo-icon icon-user-4'), 0)

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/i_it_demo-icon icon-user-4'))

WebUI.click(findTestObject('ITA - Site public Italie/Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_LE MIE ISCRIZIONI'))

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_li_onglet_se_connecter'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_input_user_email'), 'ikhlassnouri@gmail.com')

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_a_Forgotten_Password'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA - div_titre_mdp_oublie_PASSWORD DIMENTICATA'), 
    0)

WebUI.setText(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA - input_Email_recuperation_password'), 
    'ikhlassnouri@gmail.com')

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA -bouton_envoyer_reinitialisation_password'))

WebUI.verifyTextPresent('', false)

WebUI.closeBrowser()


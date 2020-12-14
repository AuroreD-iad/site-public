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
// les imports pour mon tests alert
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import com.kms.katalon.core.testobject.TestObjectProperty as TestObjectProperty
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WebAPI
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//fin imports
// import pour test numero de telephone random 
import org.apache.commons.lang.RandomStringUtils as RandStr

// fin import
WebUI.callTestCase(findTestCase('Italie/compte_client/01-creation_compte_client_no_closure--ok'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/03 - Creation de compte/texte_envoie_mail_confirmation_creation'), 
    0)

//tentative de vérification du texte contenu dans le paragraphe après validation de la création d'un compte client
// initialisation de la variable envoi_mail pour récupérer la valeur du texte contenu par le paragraphe
envoi_mail = WebUI.getText(findTestObject('Object Repository/ITA - Site public Italie/03 - Creation de compte/texte_envoie_mail_confirmation_creation'))

// vérification => si le paragraphe contient 'È stata inviata una mail a ' alors print un texte de confirmation sinon renvoie une erreur
if (envoi_mail.contains('È stata inviata una mail a ')) {
    print('Le paragraphe contient le bon text.')
}

//	else {
//    KeywordUtil.markFailed
//}
WebUI.closeBrowser()

WebUI.openBrowser('https://preprod-pub.mail.iadholding.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('01 - MailDev/alerte_votre_connexion_n_est_pas_privee/bouton_parametres_avances'))

WebUI.click(findTestObject('01 - MailDev/alerte_votre_connexion_n_est_pas_privee/lien_continuer_vers_le_site'))

WebUI.click(findTestObject('01 - MailDev/mail_titre-Crea_il_tuo_account'))

WebUI.delay(3)

WebUI.click(findTestObject('01 - MailDev/mail_create_account/a_Conferma la mia iscrizione'))

WebUI.switchToWindowUrl('https://preprod.iad-italia.it/it/profilo')

'Il faudrait pouvoir vérifier la présence de l\'élément à l\'ouverture d ela page'
not_run: WebUI.verifyElementNotVisible(findTestObject('ITA - Site public Italie/06 - Mon compte/activation du compte succeeded'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/select gender'))

WebUI.verifyElementVisible(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/ul_liste_des_genres_proposes'))

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/li_gender_sig'))

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/select gender'))

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/li_gender_Sig.ra'))

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/input_first_name_nom_famille'))

'il faudrait pouvoir inserer un nom de famille aléatoire pour tester de façon plus optimisée'
WebUI.setText(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/input_first_name_nom_famille'), 
    'Family name')

'il faudrait pouvoir inserer un prénom aléatoire pour tester de façon plus optimisée'
WebUI.setText(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/input_last_name_prenom'), 'Last-name')

//Test pour insérer un numéro de téléphone au hasard
//WebUI.setText(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/input_phone_number'), RandomStringUtils(
//        10))
'il faudrait pouvoir inserer un numéro de téléphone aléatoire pour tester de façon plus optimisée'
WebUI.setText(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/input_phone_number'), '0123456789')

WebUI.click(findTestObject('ITA - Site public Italie/06 - Mon compte/profil utilisateur/btn_submit'))

not_run: WebUI.closeBrowser()

not_run: WebUI.acceptAlert()


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

not_run: WebUI.click(findTestObject('ITA - Site public Italie/01-Accueil/ita_span_chuidere_fermer'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/02 - Menu/ita_i_demo-icon icon-user-4'), 0)

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/ita_i_demo-icon icon-user-4'))

WebUI.click(findTestObject('ITA - Site public Italie/Page_iad - Compra, vendi o Affitta unimmobile in Italia/a_LE MIE ISCRIZIONI'))

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_li_onglet_se_connecter'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_input_user_email'), 'Aurore_test_crea_compte@iad-italia.it')

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/ITA_a_Forgotten_Password'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA - div_titre_mdp_oublie_PASSWORD DIMENTICATA'), 
    0)

WebUI.setText(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA - input_Email_recuperation_password'), 
    'Aurore_test_crea_compte@iad-italia.it')

WebUI.click(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/ITA -bouton_envoyer_reinitialisation_password'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/04 - Connexion compte/Mot de pass oublié/validation demande reinitialisation mdp/texte_validation_envoi_demande_reinitialisation_password'), 
    0)

WebUI.verifyTextPresent('È stata inviata una mail con il link per il reset della password.', false)

WebUI.closeBrowser()

WebUI.openBrowser('https://preprod-pub.mail.iadholding.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('01 - MailDev/alerte_votre_connexion_n_est_pas_privee/bouton_parametres_avances'))

WebUI.click(findTestObject('01 - MailDev/alerte_votre_connexion_n_est_pas_privee/lien_continuer_vers_le_site'))

WebUI.click(findTestObject('01 - MailDev/Mail_reset_pwd/ita_titre_mail_reset_pwd'))

WebUI.click(findTestObject('01 - MailDev/Mail_reset_pwd/ita_btn_reset_pwd_mail'))

WebUI.switchToWindowUrl('https://preprod.iad-italia.it/it/reset/password/76/5fd73f3572a7d')

WebUI.verifyTextPresent('Nuova password', false)

WebUI.setEncryptedText(findTestObject('01 - MailDev/Mail_reset_pwd/page_changement_pwd_issue_lien_mail/ita_label_new_pwd_reset_pwd'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.verifyTextPresent('Riscrivi la nuova password', false)

WebUI.setEncryptedText(findTestObject('01 - MailDev/Mail_reset_pwd/page_changement_pwd_issue_lien_mail/ita_label_repeter_new_pwd_reset_pwd'), 
    'R2dZ4hvJ2ugmSF41W9Lwpw==')

WebUI.click(findTestObject('01 - MailDev/Mail_reset_pwd/page_changement_pwd_issue_lien_mail/ita_btn_validation_changement_pwd'))

WebUI.verifyElementPresent(findTestObject('01 - MailDev/acces_profil_suite_validation_creation_compte_ou_reset_pwd/ita_titre_h1_profilo_utente'), 
    0)


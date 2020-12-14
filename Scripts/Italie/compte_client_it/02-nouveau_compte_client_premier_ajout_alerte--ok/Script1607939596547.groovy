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

WebUI.callTestCase(findTestCase('Italie/00-reusable_tasts_cases_with_no_browser_close/02-new_compte_client_validation_creation--a_ameliorer'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/ita_i_demo-icon icon-user-4'))

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/liens_contenus_icone_user_menu/a_mes_recherches_enregistrees'))

WebUI.click(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_span_creer_une_recherche_personnalisee'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_h1_mes_recheches'), 0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_h3_pas_de_recherche_personnalisee_existante'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_b_phrase_expliquant_comment_creer_une_recherche_personnalisee'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_a_commencer_ma_recherche'), 0)

WebUI.click(findTestObject('ITA - Site public Italie/06-mes_recherches/ita_a_commencer_ma_recherche'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('ITA - Site public Italie/08-outil_de_recherche/ita_input_rent_where_to_buy'), 'roma')

WebUI.click(findTestObject('ITA - Site public Italie/08-outil_de_recherche/ita_li_where_to_buy_emilia-romagna'))

WebUI.click(findTestObject('ITA - Site public Italie/08-outil_de_recherche/ita_button_search'))

WebUI.click(findTestObject('ITA - Site public Italie/09-reponse_recherche/ita_button_create_alert_search_bar'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_p_titre_abonnement_recherche_via_email_en_orange'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_p_phrase_mail_envoye_avec_biens_correspondants_criteres'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_a_liste_deroulante_choix_recurrence'), 
    0)

WebUI.click(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_a_liste_deroulante_choix_recurrence'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_li_recurrence_quotidienne'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_li_recurrence_hebdomadaire'), 
    0)

WebUI.click(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_li_recurrence_hebdomadaire'))

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_p_information_utilisation_donnees'), 
    0)

WebUI.verifyElementPresent(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_a_lien_vers_termes_et_conditions'), 
    0)

WebUI.verifyLinksAccessible(['https://preprod.iad-italia.it/en/legal-notice'])

WebUI.click(findTestObject('ITA - Site public Italie/08-outil_de_recherche/pop-up_validation_creation_recherche_personnalisee/ita_button_valider_creation_recherche'))

WebUI.closeBrowser()


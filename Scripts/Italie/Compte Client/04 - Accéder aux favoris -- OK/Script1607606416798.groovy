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

WebUI.callTestCase(findTestCase('Italie/Compte Client/02 - Connexion Compte client -- OK'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ITA - Site public Italie/02 - Menu/i_it_demo-icon icon-user-4'))

WebUI.verifyElementClickable(findTestObject('ITA - Site public Italie/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('ITA - Site public Italie/ajout favoris-italia/a_I MIEI ANNUNCI PREFERITI'))

WebUI.click(findTestObject('ITA - Site public Italie/05 - Mes favoris/image_du_premier_favoris'))

WebUI.verifyElementClickable(findTestObject('ITA - Site public Italie/05 - Mes favoris/bouton_retirer_de_la_selection_fiche_annonce'))

WebUI.click(findTestObject('ITA - Site public Italie/05 - Mes favoris/bouton_retirer_de_la_selection_fiche_annonce'))

WebUI.click(findTestObject('ITA - Site public Italie/05 - Mes favoris/bouton_ajout_favoris_annonce_segui_questo_immobile'))

WebUI.closeBrowser()


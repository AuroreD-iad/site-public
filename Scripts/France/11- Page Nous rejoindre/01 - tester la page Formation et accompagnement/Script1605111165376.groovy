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

WebUI.click(findTestObject('Object Repository/page formation et accompagnement/Page_iad - Vente achat location maison appa_3091d3/a_Nous rejoindre'))

WebUI.switchToWindowTitle('Devenez conseiller immobilier indépendant - Rejoindre le réseau iad')

WebUI.click(findTestObject('Object Repository/page formation et accompagnement/Page_Devenez conseiller immobilier indpenda_b4ebde/a_Formation et Accompagnement'))

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/div_La formation au mtier de conseiller immobilier'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h1_La formation au mtier de conseiller immobilier'), 
    'La formation au métier de conseiller immobilier')

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h2_Les tapes de votre formation'), 
    'Les étapes de votre formation')

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_Issu de limmobilier ou en reconversion pr_3d992f'), 
    0)

WebUI.verifyElementPresent(findTestObject('page formation et accompagnement/Page_Formation conseiller immobilier et accompagnement avec iad/img_mandataire immobilier_img-fluid'), 
    0)

WebUI.verifyElementText(findTestObject('page formation et accompagnement/Page_Formation conseiller immobilier et accompagnement avec iad/h3_Le processus de formation iad'), 
    'Le processus de formation iad')

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h3_Laccompagnement du parrain'), 
    'L\'accompagnement du parrain')

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_Lorsque vous entrez cheziad vous tes acco_5c3532'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/img_concat(L  accompagnement du parrain)_im_4c65cc'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h3_La formation continue en e-learning'), 
    'La formation continue en e-learning')

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_iada labor un programme complet en e-lear_8c3276'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/img_La formation continue en e-learning_img_7752da'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h3_La formation prsentielle'), 
    'La formation présentielle')

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_Au sige diadou dans les diffrents ples de_22bba0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/img_La formation prsentielle_img-fluid mb-4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/h2_Le contenu des formations'), 
    'Le contenu des formations')

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_Le cursus de formation se compose de 6 fo_e3079e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/p_Tous nos conseillers iad sont des agents _a145da'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/page formation et accompagnement/Page_Formation conseiller immobilier et acc_d1e02c/footer_Formation et accompagnement    Rejoi_2b2a53'), 
    0)

WebUI.verifyAllLinksOnCurrentPageAccessible(true, [])

WebUI.closeBrowser()


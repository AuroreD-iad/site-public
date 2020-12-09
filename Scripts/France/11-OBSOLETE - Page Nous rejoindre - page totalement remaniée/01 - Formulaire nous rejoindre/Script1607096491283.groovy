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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/a_Nous rejoindre (1)'))

WebUI.switchToWindowTitle('Accueil - Devenir conseiller immobilier iad France')

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/a_Nous rejoindre'))

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_lastname'), 
    'Test joindre')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_f_7a6e25'), 
    'Teste prenom')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_phone'), 
    '0102030102')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_email'), 
    'test@iadfrance.fr')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_address'), 
    'Test adresse')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_p_26f83a'), 
    '77000')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_city'), 
    'Melun')

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_tre recontact par un conseiller iad_a_08e8e4'), 
    'non')

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/div_Corinne NONOT'))

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_Autre_sector'))

WebUI.setText(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_Autre_sectorAppend'), 'vente magasin')

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_Je souhaite recevoir par newsletter d_4426c0'))

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_concat(J, , autorise le traitement de_4a58fd'))

WebUI.click(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/input_politique de confidentialit_submit-callback'))

WebUI.rightClick(findTestObject('Site public au 03-12-2020/Site public - Page nous rejoindre/span_Teste prenom'))

WebUI.switchToWindowUrl('https://preprod.mail.iadholding.com/#/')

WebUI.verifyElementPresent(findTestObject('Page_MailDev/ul_MailDev_email-list'), 0)

WebUI.closeBrowser()


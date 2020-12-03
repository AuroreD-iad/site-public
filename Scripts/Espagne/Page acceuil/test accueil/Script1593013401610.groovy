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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.delay(5)

WebUI.click(findTestObject('Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/div_CERRAR'))

WebUI.click(findTestObject('Page_iad - Comprar, vender y alquilar una casa o un piso en Espaa/a_acepto'))

WebUI.click(findTestObject('Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/i_Con iad encontrars la propiedad ideal_demo-icon icon-house-heart'))

CustomKeywords.'com.test.pagination.PageAcceuil.nombreLien'()

WebUI.verifyLinksAccessible(['https://www.instagram.com/iadfranceofficiel/', 'https://www.youtube.com/user/IADFrance', 'https://www.linkedin.com/company/immobilier-domicile'
        , 'https://twitter.com/IADFrance', 'https://web.facebook.com/iadFrance/', 'https://preprod.iadfrance.fr/contactez-nous'
        , 'https://preprod.iadfrance.fr/fr/qui-sommes-nous', 'https://preprod.iadfrance.fr/fr/mentions-legales', 'https://preprod.iadfrance.fr/fr/espace-presse'])

WebUI.closeBrowser()


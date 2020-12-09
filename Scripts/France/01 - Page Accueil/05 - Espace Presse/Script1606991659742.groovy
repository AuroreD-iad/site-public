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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_iad - Vente, achat, location, maison, _20b116/a_Espace presse'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/a_Contacter le service presse'))

WebUI.verifyElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/span_Revue de presse'), 
    0)

WebUI.verifyElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/p_Ils parlent diad'), 
    0)

WebUI.verifyElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/button_En charger plus'), 
    0)

WebUI.verifyElementClickable(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/button_En charger plus'))

WebUI.verifyElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/span_Communiqus de presse'), 
    0)

WebUI.click(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/button_Communiqus de presse_block-carousel__b3ff11'))

WebUI.click(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/button_Communiqus de presse_block-carousel__bb40b7'))

WebUI.verifyElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/div_Tlchargez notre kit de presse          _123ef3'), 
    0)

WebUI.waitForElementPresent(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/a_Tlcharger_1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Site - public Espagne - au 07-12-2020/Site public - Espace presse/Page_Presse - iad International/a_Tlcharger_1'))


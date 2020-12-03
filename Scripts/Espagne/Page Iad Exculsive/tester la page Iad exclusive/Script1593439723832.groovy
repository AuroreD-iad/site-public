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

WebUI.navigateToUrl('https://preprod.iadespana.es/')

WebUI.click(findTestObject('Object Repository/Page IAD exclusive/Page_iad - Comprar vender y alquilar una ca_9c3789/svg_CERRAR_svg-inline--fa fa-times fa-w-11'))

WebUI.click(findTestObject('Page_iad - Comprar, vender y alquilar una casa o un piso en Espaa/a_acepto'))

WebUI.click(findTestObject('Page IAD exclusive/Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/i_Con iad encontrars la propiedad ideal_demo-icon icon-house-iad'))

CustomKeywords.'com.Paginnation.NbrAnnoncePagIadExculsive.nombreLien'()


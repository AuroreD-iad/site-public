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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://preprod.iad-italia.it/')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/span_CHIUDERE'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Accetto'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Affitta'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Ricerca avanzata'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Affitta (1)'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Localit'))

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Affitta_whereToBuy'), 'roma')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_Roma'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Tipi di propriet'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_Casa'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Superficie'))

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Min _surface_min'), '100')

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Max _surface_max'), '200')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Locali'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_4 locali'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Prezzo'))

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Min _price_min'), '1000')

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Max _price_max'), '2000')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Camere'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_2 camere'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Tag'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_Riduzione di prezzo'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Superficie del terreno'))

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Min _land_surface_min'), '50')

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_Max _land_surface_max'), '60')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Bagni'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_2 bagni'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/a_Cerca distanza'))

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/li_10 km'))

WebUI.setText(findTestObject('Object Repository/IT-louer zone recherche/input_m_mandate_uid'), '12365')

WebUI.click(findTestObject('Object Repository/IT-louer zone recherche/span_Ricerca'))


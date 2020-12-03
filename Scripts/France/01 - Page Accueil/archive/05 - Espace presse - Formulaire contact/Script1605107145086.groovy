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

WebUI.navigateToUrl('http://preprod.iadfrance.fr/')

WebUI.waitForPageLoad(0)

not_run: WebUI.click(findTestObject('Object Repository/FR-espace presse/div_FERMER'))

WebUI.verifyElementClickable(findTestObject('Object Repository/FR-espace presse/a_Espace Presse'))

WebUI.click(findTestObject('Object Repository/FR-espace presse/a_Espace Presse'))

WebUI.verifyElementClickable(findTestObject('Object Repository/FR-espace presse/button_Contact presse'))

WebUI.click(findTestObject('Object Repository/FR-espace presse/button_Contact presse'))

WebUI.click(findTestObject('Object Repository/FR-espace presse/input_Madame_contact_pressgender'))

WebUI.setText(findTestObject('Object Repository/FR-espace presse/input_Nom _contact_presslastname'), 'test')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/input_Nom _contact_presslastname'), 'required')

WebUI.setText(findTestObject('Object Repository/FR-espace presse/input_Prnom _contact_pressfirstname'), 'test')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/input_Prnom _contact_pressfirstname'), 'required')

WebUI.setText(findTestObject('Object Repository/FR-espace presse/input_Tlphone _contact_pressphone'), '0123654789')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/input_Tlphone _contact_pressphone'), 'required')

WebUI.setText(findTestObject('Object Repository/FR-espace presse/input_Email _contact_pressemail'), 'test@test.ma')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/input_Email _contact_pressemail'), 'required')

WebUI.setText(findTestObject('Object Repository/FR-espace presse/input_Sujet _contact_presssubject'), 'test123')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/input_Sujet _contact_presssubject'), 'required')

WebUI.setText(findTestObject('Object Repository/FR-espace presse/textarea_Demande _contact_pressask_description'), 'Test')

WebUI.getAttribute(findTestObject('Object Repository/FR-espace presse/textarea_Demande _contact_pressask_description'), 
    'required')

WebUI.verifyElementClickable(findTestObject('Object Repository/FR-espace presse/button_Envoyer'))

WebUI.click(findTestObject('Object Repository/FR-espace presse/button_Envoyer'))

WebUI.closeBrowser()


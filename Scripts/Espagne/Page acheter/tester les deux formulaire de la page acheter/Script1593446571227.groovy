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

WebUI.navigateToUrl('https://preprod.iadespana.es/es/propiedad-en-venta')

WebUI.click(findTestObject('Page_iad - Comprar vender y alquilar una casa o un piso en Espaa/div_CERRAR'))

WebUI.click(findTestObject('Page_iad - Comprar, vender y alquilar una casa o un piso en Espaa/a_acepto'))

WebUI.click(findTestObject('Object Repository/page acheter/Page_iad - Comprar vender y alquilar una ca_9c3789/a_Comprar'))

WebUI.click(findTestObject('Object Repository/Page_iad - Comprar su propiedad en Espaa co_147784/img_Zona neta ms baja_lazy'))

WebUI.delay(5)

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/li_Estoy interesado en una propiedad'), 
    'Estoy interesado en una propiedad', false)

WebUI.setText(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_b1198b'), 
    'ikhlass')

WebUI.setText(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_d42656'), 
    'Nouri')

WebUI.setText(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_d58673'), 
    'ikhlassnouri')

WebUI.setText(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_aa1549'), 
    '012345679')

WebUI.setText(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/textarea_Me gustara aprender sobre las prop_a88318'), 
    'test')

WebUI.click(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_c025ab'))

WebUI.click(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/input_Me gustara aprender sobre las propied_8486b3'))

WebUI.click(findTestObject('Object Repository/page acheter/Page_iad - Venta Apartamento XabiaJavea 80 _77b973/span_Contctame'))

WebUI.click(findTestObject('Page_iad - Venta Chalet Llber 340 m 4 dormitorios/a_Estoy interesado en una propiedad'))

WebUI.click(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/li_Me gustara tener ms informacin'))

WebUI.setText(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/input_Me gustara aprender sobre las propied_d42656'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/input_Me gustara aprender sobre las propied_b1198b'), 
    'test')

WebUI.setText(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/input_Me gustara aprender sobre las propied_d58673'), 
    'test@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/input_Me gustara aprender sobre las propied_aa1549'), 
    '06828468')

WebUI.setText(findTestObject('Object Repository/Page_iad - Venta Chalet Llber 340 m 4 dormitorios/textarea_Me gustara aprender sobre las prop_a88318'), 
    'test')

WebUI.click(findTestObject('Page_iad - Venta Chalet Llber 340 m 4 dormitorios/button_Contacta a un agente'))

WebUI.closeBrowser()


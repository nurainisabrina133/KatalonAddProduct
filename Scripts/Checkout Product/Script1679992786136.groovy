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

WebUI.click(findTestObject('Object Repository/Page_My Account  ToolsQA Demo Site/i_Checkout_icon_bag_alt'))

WebUI.click(findTestObject('Object Repository/Page_Cart  ToolsQA Demo Site/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_first_name'), 'Bimo')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_last_name'), 'Sakti')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_company'), 'Juara Coding')

WebUI.click(findTestObject('Page_Checkout  ToolsQA Demo Site/select_country'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_selectValue'), 'indonesia')

WebUI.sendKeys(findTestObject('Page_Checkout  ToolsQA Demo Site/input_selectValue'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_address_1'), 'Jl.Titik Koma')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_(optional)_billing_address_2'), 'Home')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_city'), 'Bekasi')

WebUI.click(findTestObject('Page_Checkout  ToolsQA Demo Site/select_province'))

WebUI.setText(findTestObject('Page_Checkout  ToolsQA Demo Site/input_selectValue'), 'Jawa Barat')

WebUI.sendKeys(findTestObject('Page_Checkout  ToolsQA Demo Site/input_selectValue'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_postcode'), '253454')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_phone'), '081234546')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input__billing_email'), 'bimosakti@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/textarea_(optional)_order_comments'), 'This Order Notes')

WebUI.scrollToPosition(0, 500)

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/input_privacy policy_terms'))

WebUI.click(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/button_Place order'))

WebUI.getText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout  ToolsQA Demo Site/p_Thank you. Your order has been received'), 
    'Thank you. Your order has been received.')


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

WebUI.openBrowser('https://www.traveloka.com/en-id')

WebUI.waitForElementPresent(findTestObject('Object Repository/Button/Button (1)/close google'), 0)

WebUI.click(findTestObject('Object Repository/Button/Button (1)/close google'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Button/Car Rental (button)'), 0)

WebUI.click(findTestObject('Object Repository/Button/Car Rental (button)'))

WebUI.click(findTestObject('Object Repository/Button/Without Driver (tab)'))

WebUI.click(findTestObject('Object Repository/Button/Rental Location (form)'))

WebUI.setText(findTestObject('Object Repository/Button/Rental Location (form)'), 'jakarta')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Travel Platform/div_Region'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Rental Start Date'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/div_15'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Start Time'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/div_Done'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Travel Platform/Rental end date (date)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Button/Page_Traveloka - Southeast Asias Leading Travel Platform/div_20'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Travel Platform/End time (date)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Travel Platform/dateclock11'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/done (date)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Button (1)/Search Icon (button)'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Button/Button (1)/Car Rental Without Driver text'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Button/Button (1)/Car Rental Without Driver text'), 0)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue car (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue provider (button)'), 
    0)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue provider (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue product detail (button)'), 
    0)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue product detail (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Rental Office (select)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Rental Office (dropdown)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Button/Page_Traveloka - Southeast Asias Leading Travel Platform/Rental office (option)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Without or With Driver  Search for Cars on Traveloka/Drop-off Location text'), 
    0)

WebUI.click(findTestObject('Object Repository/Button/Button (1)/Page_Traveloka - Southeast Asias Leading Travel Platform/Other Locations (select)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/input_Search location or address_css-11aywt_c3c58f'))

WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Wit_6af24f/h3_Soekarno Hatta International Airport (CGK)'))

WebUI.click(findTestObject('Object Repository/Button/Button (1)/Page_Traveloka - Southeast Asias Leading Travel Platform/Note Drop-off (form)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Button/Button (1)/Page_Traveloka - Southeast Asias Leading Travel Platform/Note Drop-off (form)'), 
    'Pick-up/Drop-off')

WebUI.click(findTestObject('Object Repository/Page_Cheapest Car Rental from Rp200kday Without or With Driver  Search for Cars on Traveloka/Continue Booking (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/input__contact detail'), 
    'fake name')

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/div_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/input__driver detail'), 
    'fake name')

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/select_Mr.Mrs.Ms'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/div_Save'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/textarea car rental special (optional)'), 
    'blablabla')

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/div_Tap to check the requirements'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/box Check All'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/Save check all (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Traveloka - Southeast Asias Leading Travel Platform/Continue confirm (button)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Cheap Flights Tickets Traveloka - Online travel agent/Mandiri Transfer (payment)'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Traveloka - Southeast Asias Leading Travel Platform/Page_Cheap Flights Tickets Traveloka - Online travel agent/Pay with Mandiri Transfer (button)'), 
    FailureHandling.STOP_ON_FAILURE)


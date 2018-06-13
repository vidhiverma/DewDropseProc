import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('common/Login Logout'), [('Username') : 'disha1.dev@zycus.com', ('Password') : 'eProc@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Online Store Page/Search Box'), 'item')

WebUI.delay(20)

WebUI.doubleClick(findTestObject('Online Store Page/SearchIcon'))

WebUI.delay(35)

WebUI.click(findTestObject('Pages/SearachResultPage/CheckBox_a'))

WebUI.click(findTestObject('Pages/SearachResultPage/CheckBox_b'))

WebUI.doubleClick(findTestObject('Pages/SearachResultPage/AddToBasket'))

WebUI.sendKeys(findTestObject('Popups/AddToBasket/BaketNameInputBox'), '20 items saved')

WebUI.sendKeys(findTestObject('Popups/AddToBasket/BaketNameInputBox'), 'mynew__basket')

WebUI.doubleClick(findTestObject('Popups/AddToBasket/ButtonAddToBasket'))

WebUI.waitForAlert(10)

WebUI.delay(10)

WebUI.closeBrowser()


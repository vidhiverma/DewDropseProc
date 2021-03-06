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

WebUI.delay(15)

WebUI.doubleClick(findTestObject('Online Store Page/SearchIcon'))

WebUI.delay(20)

WebUI.doubleClick(findTestObject('SingleItemAddToCart'))

WebUI.doubleClick(findTestObject('Online Store Page/CartIcon'))

WebUI.doubleClick(findTestObject('Pages/CartPage/Empty Cart'))

WebUI.verifyElementText(findTestObject('Popups/Empty Cart/PopUpMessageText'), 'Are you sure you want to delete all the items in the cart?')

WebUI.verifyElementPresent(findTestObject('Popups/Empty Cart/Yes Button'), 5)

WebUI.verifyElementPresent(findTestObject('Popups/Empty Cart/No Button'), 5)

WebUI.delay(5)

WebUI.closeBrowser()


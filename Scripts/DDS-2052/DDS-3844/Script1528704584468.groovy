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

WebUI.callTestCase(findTestCase('common/Login Logout'), [('Username') : 'surekha1@zycus.com', ('Password') : 'eProc@123'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tabs/MainHeaderLevelTab/Baskets'))

WebUI.doubleClick(findTestObject('Pages/Baskets/ViewAll'))

WebUI.doubleClick(findTestObject('Pages/Baskets/BasketNameHyperlink'))

WebUI.delay(5)

WebUI.check(findTestObject('Pages/Baskets/BasketItemChceckBox_b'), FailureHandling.STOP_ON_FAILURE)

WebUI.check(findTestObject('Pages/Baskets/Basket1Item2CheckBox'))

WebUI.doubleClick(findTestObject('Pages/Baskets/ActionButton/ActionButton'))

WebUI.doubleClick(findTestObject('Pages/Baskets/ActionButton/Delete'))

WebUI.doubleClick(findTestObject('Pages/Baskets/ActionButton/DeletePopup/YesButton'))

WebUI.waitForPageLoad(5)

WebUI.delay(10)

WebUI.closeBrowser()


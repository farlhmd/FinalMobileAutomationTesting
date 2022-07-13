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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

Mobile.startExistingApplication(GlobalVariable.bundleId, FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.comment('Wait until the burger button is visible')

Mobile.waitForElementPresent(findTestObject('Top Menu/burgerBtn'), 0)

Mobile.verifyElementVisible(findTestObject('Top Menu/burgerBtn'), 0)

Mobile.tap(findTestObject('Top Menu/burgerBtn'), 0)

Mobile.comment('Wait until the side bar is visible')

Mobile.waitForElementPresent(findTestObject('Side Menu/sideBtn - Accounts'), 0)

Mobile.verifyElementVisible(findTestObject('Side Menu/sideBtn - Accounts'), 0)

Mobile.tap(findTestObject('Side Menu/sideBtn - Accounts'), 0)

Mobile.comment('Wait until the add button is visible')

Mobile.waitForElementPresent(findTestObject('Accounts Page/addButton'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts Page/addButton'), 0)

Mobile.tap(findTestObject('Accounts Page/addButton'), 0)

Mobile.comment('Wait until the text edit Account name is visible')

Mobile.waitForElementPresent(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Account Name'), 0)

Mobile.verifyElementVisible(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Account Name'), 0)

Mobile.tap(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Account Name'), 0)

Mobile.setText(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Account Name'), accountName, 0)

Mobile.comment('Wait until the text edit Initial Balance is visible')

Mobile.waitForElementPresent(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Initial Balance (Optional)'), 
    0)

Mobile.verifyElementVisible(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Initial Balance (Optional)'), 
    0)

Mobile.tap(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Initial Balance (Optional)'), 0)

Mobile.setText(findTestObject('Accounts Page/Add an Account FrameLayout/editText - Initial Balance (Optional)'), initialBalance, 
    0)

Mobile.tap(findTestObject('Accounts Page/Add an Account FrameLayout/btn - ADD'), 0)

// Added toast handling
def toast = driver.findElementByXPath("//android.widget.Toast[@text='Account successfully added']")
println("Toast element: " + toast)
if (toast == null) {
	Mobile.comment("Error creating account")
}
//driver.terminateApp(GlobalVariable.bundleId)


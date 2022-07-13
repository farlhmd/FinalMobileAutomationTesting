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

Mobile.comment('Wait until the Text Edit Username is visible')

Mobile.waitForElementPresent(findTestObject('Login Page/editText - Username'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/editText - Username'), 0)

Mobile.tap(findTestObject('Login Page/editText - Username'), 0)

Mobile.setText(findTestObject('Login Page/editText - Username'), username, 0)

Mobile.comment('Wait until the Text Edit Password is visible')

Mobile.waitForElementPresent(findTestObject('Login Page/editText - Password'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/editText - Password'), 0)

Mobile.tap(findTestObject('Login Page/editText - Password'), 0)

Mobile.setText(findTestObject('Login Page/editText - Password'), password, 0)

Mobile.comment('Wait until the Login Button is visible')

Mobile.waitForElementPresent(findTestObject('Login Page/btn - login'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/btn - login'), 0)

Mobile.tap(findTestObject('Login Page/btn - login'), 0)

Mobile.comment('Verify the user\'s first name logged in')

Mobile.verifyElementVisible(findTestObject('Dashboard Page/textView - Dashboard'), 0, FailureHandling.STOP_ON_FAILURE)


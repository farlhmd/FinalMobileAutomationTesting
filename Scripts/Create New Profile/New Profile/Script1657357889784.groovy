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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil


Mobile.startExistingApplication(GlobalVariable.bundleId, FailureHandling.STOP_ON_FAILURE)

driver = MobileDriverFactory.getDriver()

Mobile.comment('Wait until the Create Profile Button is visible')

Mobile.waitForElementPresent(findTestObject('Login Page/btn - create profile'), 0)

Mobile.verifyElementVisible(findTestObject('Login Page/btn - create profile'), 0)

Mobile.tap(findTestObject('Login Page/btn - create profile'), 0)

Mobile.comment('Verify if there is Edit Text First Name')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - First Name'), 0)

Mobile.tap(findTestObject('Register Page/editText - First Name'), 0)

Mobile.setText(findTestObject('Register Page/editText - First Name'), firstName, 0)

Mobile.comment('Verify if there is Edit Text Last Name')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - Last Name'), 0)

Mobile.tap(findTestObject('Register Page/editText - Last Name'), 0)

Mobile.setText(findTestObject('Register Page/editText - Last Name'), lastName, 0)

Mobile.comment('Verify if there is Edit Text Country')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - Country'), 0)

Mobile.tap(findTestObject('Register Page/editText - Country'), 0)

Mobile.setText(findTestObject('Register Page/editText - Country'), country, 0)

Mobile.comment('Verify if there is Edit Text Username')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - Username'), 0)

Mobile.tap(findTestObject('Register Page/editText - Username'), 0)

Mobile.setText(findTestObject('Register Page/editText - Username'), "2", 0)

Mobile.comment('Verify if there is Edit Text Password')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - Password'), 0)

Mobile.tap(findTestObject('Register Page/editText - Password'), 0)

Mobile.setText(findTestObject('Register Page/editText - Password'), password, 0)

Mobile.comment('Verify if there is Edit Text Confirm Password')

Mobile.verifyElementVisible(findTestObject('Register Page/editText - Confirm Password'), 0)

Mobile.tap(findTestObject('Register Page/editText - Confirm Password'), 0)

Mobile.setText(findTestObject('Register Page/editText - Confirm Password'), confirmPassword, 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Register Page/btn - Create Profile'), 0)

//def toast = driver.findElementByXPath("//android.widget.Toast[@text='A User has already taken that username']")
//println("Toast element: " + toast)
//if (toast == null) {
//	Mobile.comment("New User Registration Success")
//} else {
//	Mobile.comment("Username Already Registered")
//		Mobile.pressBack()
//}

driver.terminateApp(GlobalVariable.bundleId)


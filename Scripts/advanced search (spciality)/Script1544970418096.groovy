import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\M.Kamel\\AppData\\Roaming\\npm\\com.aradocs.schooolz.apk', false)

Mobile.tap(findTestObject('advanced search (spciality)/android.widget.ImageView17'), 5)

WebUI.delay(3)

Mobile.tap(findTestObject('advanced search (spciality)/android.widget.TextView2 -   '), 0)

WebUI.delay(5)

Mobile.tap(findTestObject('advanced search (spciality)/android.widget.CheckedTextView1 - '), 3)

WebUI.delay(5)

Mobile.tap(findTestObject('advanced search (spciality)/android.widget.Button1 - '), 10)

Mobile.closeApplication()


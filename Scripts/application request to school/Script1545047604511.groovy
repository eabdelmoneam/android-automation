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

Mobile.tap(findTestObject('application request to school/android.widget.ImageView1'), 2)

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText0 -  '), 'student@yahoo.com', 2)

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText1 -  '), '123456', 2)

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.Button0 -  '), 2)

Mobile.pressBack()

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.ImageView20'), 2)

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.ImageView4'), 2)

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.LinearLayout9'), 2)

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText0 - '), 'eman mohamed', 2)

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText1 -   (1)'), 'eman@yahoo.com', 2)

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText2 - '), '01211225544', 2)

Mobile.hideKeyboard()

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.EditText3 -  '), 2)

Mobile.setText(findTestObject('application request to school/android.widget.EditText4 -  '), '12365412354687', 3)

Mobile.hideKeyboard()

WebUI.delay(3)

Mobile.setText(findTestObject('application request to school/android.widget.EditText5 - '), 'مصر الجديده', 0)

Mobile.hideKeyboard()

WebUI.delay(3)

Mobile.tap(findTestObject('application request to school/android.widget.TextView0 -  '), 2)

Mobile.tap(findTestObject('application request to school/android.widget.CheckedTextView9 -  '), 2)

Mobile.setText(findTestObject('application request to school/android.widget.EditText6 - '), 'ثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثثث', 
    2)

Mobile.hideKeyboard()

WebUI.delay(5)

Mobile.closeApplication()


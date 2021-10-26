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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://aag-e-recrut-qualif-dot-aag-e-recrut-all.ew.r.appspot.com/')

WebUI.setText(findTestObject('Object Repository/Page_Easy Recrut par Alliance Automotive Group/input_Connexion_email (1)'), 
    's.desaviscbeoyez@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Easy Recrut par Alliance Automotive Group/input_Connexion_password (1)'), 
    'FD/dB4zIuwICzKrXA9wXEA==')

WebUI.click(findTestObject('Object Repository/Page_Easy Recrut par Alliance Automotive Group/span_Connexion (1)'))

WebUI.click(findTestObject('Object Repository/Page_Easy Recrut par Alliance Automotive Group/button_Historique des contrats (1)'))

WebUI.click(findTestObject('Object Repository/Page_Easy Recrut par Alliance Automotive Group/a_2 (1)'))


WebUI.closeBrowser()

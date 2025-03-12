package com.ui.tests;

import static com.constants.Browser.CHROME;
import static com.constants.Browser.EDGE;
import static com.constants.Browser.FIREFOX;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.constants.Browser;
import com.ui.pages.HomePage;
import com.utility.BrowserUtility;
import com.utility.LambdaTestUtility;

public class TestBase {

	protected HomePage homePage;
	private boolean isLambdaTest;
	
	@Parameters({"browser", "isLambdaTest", "isHeadless"})
	@BeforeMethod(description = "Load the homepage of the application")
	public void setup(
			@Optional("chrome") String browser, 
			@Optional("true") boolean isLambdaTest, 
			@Optional("false") boolean isHeadless, ITestResult result) {
		this.isLambdaTest = isLambdaTest;
		WebDriver lambdadriver;
		if(isLambdaTest) {
			lambdadriver = LambdaTestUtility.initializeLambdaTestSession(browser, result.getMethod().getMethodName());
			homePage = new HomePage(lambdadriver);
		}
		else {
		 homePage = new HomePage(Browser.valueOf(browser.toUpperCase()),isHeadless);
		}
	}
	
	public BrowserUtility getInstance() {
		return homePage;
	}
	
	@AfterMethod(description = "Tear Down the browser")
	public void tearDown(){
		if(isLambdaTest) {
			LambdaTestUtility.quitSession();
		}
		else {
		homePage.quit();
		}
	}
}

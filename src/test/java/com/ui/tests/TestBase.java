package com.ui.tests;

import static com.constants.Browser.CHROME;

import org.testng.annotations.BeforeMethod;

import com.ui.pages.HomePage;
import com.utility.BrowserUtility;

public class TestBase {

	protected HomePage homePage;

	@BeforeMethod(description = "Load the homepage of the application")
	public void setup() {
		 homePage = new HomePage(CHROME);
	}
	
	public BrowserUtility getInstance() {
		return homePage;
	}
}

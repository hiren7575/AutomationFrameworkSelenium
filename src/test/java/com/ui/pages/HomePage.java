package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import static com.utility.PropertiesUtil.*;

public final class HomePage extends BrowserUtility {
	
	public HomePage(Browser browserName) {
		super(browserName);//To call the parent class constructor from the child constructor!!
		goToWebsite(readProperty(QA, "URL"));
		maximizeWindow();
	}

	private static final By SIGN_IN_LINK_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]");

	public LoginPage goToLoginPage() {//Page Functions----> cannot be void
		clickOn(SIGN_IN_LINK_LOCATOR);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
}

package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility{

	private static final By EMAIL_TEXTBOX_LOCATOR = By.id("email");
	private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("passwd");
	private static final By LOGIN_BUTTON_LOCATOR = By.id("SubmitLogin");
	
	public LoginPage(WebDriver driver) {
		super(driver);

	}
	
	public MyAccountPage doLoginWith(String emailAddress, String password) {
		sendKeys(EMAIL_TEXTBOX_LOCATOR, emailAddress);
		sendKeys(PASSWORD_TEXTBOX_LOCATOR, password);
		clickOn(LOGIN_BUTTON_LOCATOR);	
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}
	

}

package com.utility;

import org.openqa.selenium.WebDriver;

public class BrowserUtility {
	
	private WebDriver driver;

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;//initialize the instance variable driver..!!
	}
	
	public void goToWebsite(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	
	
	
	
	
	
}

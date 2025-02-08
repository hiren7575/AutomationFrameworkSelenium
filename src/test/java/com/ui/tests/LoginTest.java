package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;

public class LoginTest {

	HomePage homePage;
	
	@BeforeMethod(description = "Load the homepage of the application")
	public void setup() {
		 homePage = new HomePage(CHROME);
	}

	@Test(description = "Verify login with valid user", groups = {"e2e","sanity"})
	public void loginTest() {
		assertEquals(homePage.goToLoginPage().doLoginWith("geteti7621@minduls.com", "Password").getUserName(), "Hiren Patel");
	}

}

package com.ui.tests;

import static com.constants.Browser.*;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ui.pages.HomePage;
import com.ui.pojo.User;

public class LoginTest {

	HomePage homePage;
	
	@BeforeMethod(description = "Load the homepage of the application")
	public void setup() {
		 homePage = new HomePage(CHROME);
	}

	@Test(description = "Verify login with valid user", groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Hiren Patel");
	}

}

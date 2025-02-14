package com.ui.tests;

import static org.testng.Assert.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ui.pojo.User;

@Listeners({com.ui.listeners.TestListerner.class})
public class LoginTest extends TestBase{

	

	@Test(description = "Verify login with valid user", groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Hiren Patel");
	}
	
	@Test(description = "Verify login with valid user", groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "loginTestCSVDataProvider")
	public void loginCSVTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Hiren Patel");
	}

	@Test(description = "Verify login with valid user", groups = {"e2e","sanity"}, dataProviderClass = com.ui.dataproviders.LoginDataProvider.class, dataProvider = "loginTestExcelDataProvider", retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class)
	public void loginExcelTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(),user.getPassword()).getUserName(), "Hiren Patel");
	}
}

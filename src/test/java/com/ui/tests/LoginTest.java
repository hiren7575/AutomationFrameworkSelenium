package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver(); //Launch a browser window!! Browsr session is created!!
		wd.get("http://www.automationpractice.pl/index.php");
		//maximize the browser window!!
		wd.manage().window().maximize();
		
		By signInLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		WebElement signInLinkWebElement = wd.findElement(signInLocator);//Find the element!!!
		signInLinkWebElement.click();
		
		By emailTextBoxLocator = By.xpath("//input[@id=\"email\"]");
		WebElement emailTextBoxWebElement = wd.findElement(emailTextBoxLocator);//Find the element!!!
		emailTextBoxWebElement.sendKeys("geteti7621@minduls.com");
		
		By passwordTextBoxLocator = By.xpath("//input[@id=\"passwd\"]");
		WebElement passwordTextBoxWebElement = wd.findElement(passwordTextBoxLocator);//Find the element!!!
		passwordTextBoxWebElement.sendKeys("Password");
		
		By loginButtonLocator = By.xpath("//button[@id=\"SubmitLogin\"]");
		WebElement loginButttonWebElement = wd.findElement(loginButtonLocator);//Find the element!!!
		loginButttonWebElement.click();
			
	}

}

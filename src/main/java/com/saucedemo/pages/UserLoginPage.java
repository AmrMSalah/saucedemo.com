package com.saucedemo.pages;

import org.openqa.selenium.By;



public class UserLoginPage extends PageBase{

	private final By usernameLocator = By.id("user-name");
	
	private final By passwordLocator = By.id("password");
	
	private final By loginBtnLocator = By.id("login-button");
	
	private final By RobotLogoLocator = By.className("bot_column");
	
	
	public void Login (String Email, String loginPassword)
	{
		webdriver.navigate().to("https://www.saucedemo.com/");
		writeElement(webdriver.findElement(usernameLocator), Email);
		writeElement(webdriver.findElement(passwordLocator), loginPassword);
		clickElement(webdriver.findElement(loginBtnLocator));
	}
	
	public void logoDisplayed ()
	{
		webdriver.findElement(RobotLogoLocator).isDisplayed();
	}
	
}

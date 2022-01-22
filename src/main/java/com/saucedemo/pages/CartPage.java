package com.saucedemo.pages;

import org.openqa.selenium.By;


public class CartPage extends PageBase {

	private final By checkoutBtnLocator = By.id("checkout");

	
	
	public void checkoutCart ()
	{
		clickElement(webdriver.findElement(checkoutBtnLocator));
	
	}

}

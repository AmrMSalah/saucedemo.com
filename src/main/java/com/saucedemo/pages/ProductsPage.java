package com.saucedemo.pages;

import org.openqa.selenium.By;


public class ProductsPage extends PageBase {
	
	private final By secondaryHeaderLocator = By.xpath("//*[@id=\\\\\\\"header_container\\\\\\\"]/div[2]");

	private final By backpackLocator = By.id("add-to-cart-sauce-labs-backpack");

	private final By cartBtnLocator = By.id("shopping_cart_container");
	
	private final By itemAddedToCart = By.xpath("//*[@id=\\\"shopping_cart_container\\\"]/a/span");	

	
	public void addItemToCart ()
	{
		clickElement(webdriver.findElement(backpackLocator));
	}
	
	public void gotToCart ()
	{
		clickElement(webdriver.findElement(cartBtnLocator));
	}
	
	public void secondaryHeaderDisplayed ()
	{
		webdriver.findElement(secondaryHeaderLocator).isDisplayed();
	}
	
	public void addedItemNotification ()
	{
		webdriver.findElement(itemAddedToCart).isDisplayed();
	}
}

package com.saucedemo.test;

import org.testng.annotations.Test;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.UserLoginPage;

public class UserLoginTestCases extends TestBase{

	UserLoginPage userLoginObject;
	ProductsPage productPageObject;
	
	
	@Test
	public void Login ()
	{
		userLoginObject = new UserLoginPage();
		productPageObject = new ProductsPage();
		
		userLoginObject.Login("standard_user","secret_sauce");
		
	}
	
	
	
}

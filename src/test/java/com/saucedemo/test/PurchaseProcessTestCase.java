package com.saucedemo.test;


import org.testng.annotations.Test;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.UserLoginPage;

public class PurchaseProcessTestCase extends TestBase{
	
	UserLoginPage userLoginObject;
	ProductsPage productPageObject;
	CartPage CartPageObject;
	
	@Test
	public void purchaseItem ()
	{
		userLoginObject = new UserLoginPage();
		productPageObject = new ProductsPage();
		CartPageObject = new CartPage();
		
		userLoginObject.Login("standard_user","secret_sauce");
		productPageObject.addItemToCart();
		productPageObject.gotToCart();
		CartPageObject.checkoutCart();
		
	}
	
	
	
	
}

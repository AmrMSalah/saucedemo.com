package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {


    private static final int TIMEOUT = 5;
    private static final int POLLING = 100;

    protected static WebDriver webdriver;
    private static WebDriverWait wait;

    @SuppressWarnings("deprecation")
	public void updateWebdriver (WebDriver driver) {
    	webdriver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, TIMEOUT), this);
    	
	}

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToclicable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

	protected static void clickElement (WebElement element)
	{
		element.click();	
	}
	
	protected void writeElement (WebElement textElement, String value)
	{
		waitForTextToclicable(textElement);
		textElement.sendKeys(value);
	}
}

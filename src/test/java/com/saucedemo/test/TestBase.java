package com.saucedemo.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.saucedemo.pages.PageBase;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver;
	
	
	@BeforeSuite
	@Parameters({"browser"})
	public void init (@Optional("chrome") String browserName)
	{
		if (browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) 
		{
			WebDriverManager.iedriver().setup();
			//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/");
		
		PageBase basepageObject = new PageBase();
		basepageObject.updateWebdriver(driver);
	}

	
	@AfterSuite
	public void stopDriver()
	{
		driver.quit();
	}
	
	
	
	
}

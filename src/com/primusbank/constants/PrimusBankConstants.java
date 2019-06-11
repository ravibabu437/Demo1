package com.primusbank.constants;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrimusBankConstants {
	
	public static String url="http://primusbank.qedgetech.com";
	public static WebDriver driver;
	
	@BeforeSuite
	public static void launchApp() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterSuite
	public static void closeApp()
	{
		driver.close();
	}
	

}

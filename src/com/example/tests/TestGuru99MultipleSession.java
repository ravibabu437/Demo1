package com.example.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestGuru99MultipleSession {
	
	 @Test(priority = 0)    
	    public void executSessionOne() throws InterruptedException{
	            //First session of WebDriver
	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	            WebDriver driver = new FirefoxDriver();
	            //Goto guru99 site
	            driver.get("http://demo.guru99.com/V4/");
	            //find user name text box and fill it
	            driver.findElement(By.name("uid")).sendKeys("Driver 1");
	            driver.close();
	            
	            
	            
	            
	        }
	        
	    @Test  (priority = 1)  
	        public void executeSessionTwo(){
	            //Second session of WebDriver
	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 2");
	        driver.close();
	        
	        }
	        
	    @DataProvider
	    @Test  (priority = 2)  
	        public void executSessionThree(){
	            //Third session of WebDriver
	        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	            //Goto guru99 site
	        driver.get("http://demo.guru99.com/V4/");
	        //find user name text box and fill it
	        driver.findElement(By.name("uid")).sendKeys("Driver 3");
	        driver.close();
	        }        

}

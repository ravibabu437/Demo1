package com.sqlserver.sampleprojects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class sqlserver1 
{
	
	
	
	public static void main(String [] args)
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.manage().deleteAllCookies();
		dif.get("http://primusbank.qedgetech.com");
		dif.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select blist=new Select(dif.findElement(By.id("drlist")));
		List<WebElement> brlist= blist.getOptions();
		int actcount= brlist.size();
		System.out.println("value is "+actcount);
		int expcount=77;
		if(expcount == actcount)
		{
			System.out.println("db pass");
		}
		else
		{
			System.out.println("db fail");
		}
		
		System.out.println(expcount);
		System.out.println(actcount);
		
		
		
		
	}
	

}

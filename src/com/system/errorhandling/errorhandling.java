package com.system.errorhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class errorhandling {
	
	

	public static void main(String [] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver diff= new FirefoxDriver();
		diff.get("http://google.com");
		diff.findElement(By.name("q")).sendKeys("facebook");
		Thread.sleep(3000);
		List<WebElement>glist=diff.findElement(By.className("erkvQe")).findElements(By.tagName("li"));
		System.out.println(glist.size());
		for(int i=0;i < glist.size();i++)
		{
			
			String gkeyword=glist.get(i).getText();
			System.out.println(gkeyword);
			
		}
		
		String actval,expval;
		expval="facebook login";
		for(int j=0;j < glist.size(); j++)
		{
			actval=glist.get(j).getText();
			if(actval.toLowerCase().contains(expval))
			{
				System.out.println("test pass and actval = "+expval);
				diff.findElement(By.className("sbl1")).click();
				
			}
			else
			{
				System.out.println("test fail");
			}
		}
		
				
		
	}

}

package com.basicprog.gettingvalues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class paymentslinkpresentornot {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://primusbank.qedgetech.com");
		dif.findElement(By.linkText("Site Map")).click();
		String expval,actval;
		expval="payments";
		List<WebElement>link=dif.findElements(By.tagName("a"));
		boolean linkexist=false;
		for(int i=0;i<link.size();i++)
		{
			actval=link.get(i).getText();
			if(actval.equalsIgnoreCase(expval))
			{
				linkexist=true;
				System.out.println(actval);
				break;
			}
		}
		if(linkexist)
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}

	}

}

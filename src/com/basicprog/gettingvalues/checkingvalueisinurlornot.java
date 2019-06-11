package com.basicprog.gettingvalues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkingvalueisinurlornot {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://primusbank.qedgetech.com");
		dif.findElement(By.linkText("Site Map")).click();
		String expval,actval;
		expval="sitemap";
		actval=dif.getCurrentUrl();
		if(actval.toLowerCase().contains(expval.toLowerCase()))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}

	}

}

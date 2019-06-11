package com.basicprog.gettingvalues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alternativemethodofpaymentslinkpresentornot {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://primusbank.qedgetech.com");
		dif.findElement(By.linkText("Site Map")).click();
		try
		{
			dif.findElement(By.linkText("payments"));
			System.out.println("test pass");
		}catch(Exception e)
		{
			System.out.println("test fail");
		}
		

	}

}

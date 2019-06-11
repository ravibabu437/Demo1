package com.basicprog.gettingvalues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alllinksareredirectingornotinpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://primusbank.qedgetech.com");
		dif.findElement(By.linkText("Site Map")).click();
		List<WebElement>link=dif.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++)
		{
			link.get(i).click();
			String linkurl=dif.getCurrentUrl();
			System.out.println(linkurl);
			Thread.sleep(1000);
			dif.navigate().back();
			link=dif.findElements(By.tagName("a"));
		}

	}

}

package com.basicprog.gettingvalues;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksandurlredirectingornot {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://primusbank.qedgetech.com");
		dif.findElement(By.linkText("Site Map")).click();
		List<WebElement>link=dif.findElements(By.tagName("a"));
		for(int i=0;i<link.size();i++)
		{
			String linkname=link.get(i).getText();
			String linkurl=link.get(i).getAttribute("href");
			System.out.println(linkname + " "+ linkurl);
		}

	}

}

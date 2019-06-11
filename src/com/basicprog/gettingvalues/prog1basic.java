package com.basicprog.gettingvalues;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog1basic {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://google.com");
		String x=dif.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(x);
		String y=dif.findElement(By.name("btnk")).getAttribute("value");
		System.out.println(y);

	}

}

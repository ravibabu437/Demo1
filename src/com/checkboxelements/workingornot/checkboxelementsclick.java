package com.checkboxelements.workingornot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxelementsclick {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://spicejet.com");
		dif.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

	}

}

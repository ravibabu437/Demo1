package com.checkboxelements.workingornot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxisselectedornotifnotthenitwillselectcheckbox {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://spicejet.com");
		WebElement chkbox;
		chkbox=	dif.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		if(!chkbox.isSelected())
		{
			chkbox.click();
		}

	}

}

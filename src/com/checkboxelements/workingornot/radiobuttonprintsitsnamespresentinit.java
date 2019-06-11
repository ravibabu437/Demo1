package com.checkboxelements.workingornot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttonprintsitsnamespresentinit {

	public static void main(String[] args) {
		System.setProperty("webdrive.gecko.driver","C:\\geckodriver.exe");
		WebDriver dif=new FirefoxDriver();
		dif.get("http://spicejet.com");
		List<WebElement>radio=dif.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(radio.size());
		for(int i=0;i<radio.size();i++)
		{
			String radioname=radio.get(i).getAttribute("value");
			System.out.println(radioname);
			
		}
	}

}

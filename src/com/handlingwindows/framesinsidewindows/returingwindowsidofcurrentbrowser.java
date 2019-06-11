package com.handlingwindows.framesinsidewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class returingwindowsidofcurrentbrowser {

	public static void main(String[] args) {
		System.getProperty("webriver.chrome.driver", "c:\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://gmail.com");
		 String windowid=driver.getWindowHandle();
		 System.out.println(windowid);
		 driver.findElement(By.linkText("Help")).click();
		 Set<String>allwindows=driver.getWindowHandles();
		 System.out.println(allwindows);

	}

}

package com.handlingwindows.framesinsidewindows;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popwindowreadingmsgs {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webriver.chrome.driver", "c:\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://primusbank.qedgetech.com");
		 driver.findElement(By.id("login")).click();
		 Thread.sleep(3000);
		 String msg=driver.switchTo().alert().getText();
		 System.out.println(msg);
		 if(msg.contains("Please fill in the following fields:"))
		 {
			 driver.switchTo().alert().accept();
			 System.out.println("test pass");
		 }
		 else
		 {
			 driver.switchTo().alert().dismiss();
			 System.out.println("test fail");
		 }
	}

}

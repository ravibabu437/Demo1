package com.handlingwindows.framesinsidewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingbetweenmultiplebrowserwindows {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://gmail.com");
		 String windowid=driver.getWindowHandle();
		 System.out.println(windowid);
		 driver.findElement(By.linkText("Help")).click();
		 Set<String>allwindows=driver.getWindowHandles();
		 System.out.println(allwindows);
		 Object[] windows=allwindows.toArray();
		 System.out.println(windows);
		 String windows1=windows[0].toString();
		 String windows2=windows[1].toString();
		 System.out.println(windows1);
		 System.out.println(windows2);
		 driver.switchTo().window(windows2);
		 driver.findElement(By.linkText("Community")).click();
		 driver.close();
		 driver.switchTo().window(windows1);
		 System.out.println(driver.getTitle());
		 
		 

	}

}

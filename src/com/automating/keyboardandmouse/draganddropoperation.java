package com.automating.keyboardandmouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropoperation {

	public static void main(String[] args) {
		System.getProperty("webriver.chrome.driver", "c:\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://jqueryui.com");
		 driver.findElement(By.linkText("Droppable")).click();
		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 WebElement srcelement,targelement;
		 srcelement=driver.findElement(By.id("draggable"));
		 targelement=driver.findElement(By.id("droppable"));
		 Actions act=new Actions(driver);
		 act.dragAndDrop(srcelement, targelement);
		 act.build().perform();
		 
		 

	}

}

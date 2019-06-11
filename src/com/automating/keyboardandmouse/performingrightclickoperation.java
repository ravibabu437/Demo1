package com.automating.keyboardandmouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class performingrightclickoperation {

	public static void main(String[] args) {
		System.getProperty("webriver.chrome.driver", "c:\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://snapdeal.com");
		 Actions act=new Actions(driver);
		 act.contextClick(driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div[1]/div[2]/ul/li[3]/a/span[2]")));
		 act.build().perform();
	}

}

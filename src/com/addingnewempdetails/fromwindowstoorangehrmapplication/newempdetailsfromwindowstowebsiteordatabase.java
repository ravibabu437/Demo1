package com.addingnewempdetails.fromwindowstoorangehrmapplication;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class newempdetailsfromwindowstowebsiteordatabase
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.getProperty("webriver.gecko.driver", "c:\\geckodriver.exe");
		
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://orangehrm.qedgetech.com");
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		 driver.findElement(By.id("btnLogin")).click();
		 Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
		 driver.findElement(By.linkText("PIM")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='/symfony/web/index.php/pim/addEmployee']")).click();
		 driver.findElement(By.id("firstName")).sendKeys("premraj");
		 driver.findElement(By.id("lastName")).sendKeys("kshetriya");
		 driver.findElement(By.id("photofile")).click();
		 
		 Runtime.getRuntime().exec("C:\\Users\\QEdgetech.com\\Desktop\\demo");
		 Thread.sleep(5000);
		 driver.findElement(By.id("btnSave")).click();
		 driver.close();

	}

}

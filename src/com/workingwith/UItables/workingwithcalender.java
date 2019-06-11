package com.workingwith.UItables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithcalender
{

	public static void main(String[] args)
	{
		String doj="23/March/2020";
		String[] temp=doj.split("/");
		String dt=temp[0];
		String month=temp[1];
		String year=temp[2];
		String caldt,calmonth,calyear;
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://cleartrip.com");
		 driver.findElement(By.id("DepartDate")).click();
		 calyear= driver.findElement(By.className("ui-datepicker-year")).getText();
		 while(!year.equals(calyear))
		 {
			 driver.findElement(By.className("nextMonth")).click();
			 calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
			 System.out.println(calyear +" "+ year);
			 
		 }
		 calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		 while(!month.equalsIgnoreCase(calmonth))
		 {
			 driver.findElement(By.className("nextMonth")).click();
			 calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
			 System.out.println(calmonth+" "+month);
		 }
		 WebElement cal;
		 cal=driver.findElement(By.className("calendar"));
		 List<WebElement>rows,cols;
		 rows=cal.findElements(By.tagName("tr"));
		 boolean flag=false;
		 for(int i=1;i<rows.size();i++)
		 {
			 cols=rows.get(i).findElements(By.tagName("td"));
			 for(int j=0;j<cols.size();j++)
			 {
				 caldt=cols.get(j).getText();
				 if(caldt.equals(dt))
				 {
					 cols.get(j).click();
					 flag=true;
					 System.out.println(caldt+" "+dt);
					 break;
				 }
			 }
			 if(flag)
			 {
				 break;
			 }
		 }
		
		 }
	 }

		 
		



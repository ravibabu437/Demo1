package com.workingwith.UItables;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PracticeTables {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://toolsqa.com/automation-practice-table");
		 
		 //Here we are storing the value from the cell in to the string variable
		 String sCellValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		 System.out.println(sCellValue);
		 
		 // Here we are clicking on the link of first row and the last column
		 driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();        
		 System.out.println("Link has been clicked otherwise an exception would have thrown");
		 List<WebElement>table=driver.findElement(By.className("tsc_table_s13")).findElements(By.tagName("tr"));
		 System.out.println(table.size()-1);
		 WebElement emptable;
		emptable=driver.findElement(By.className("tsc_table_s13"));
		Thread.sleep(2000);
		// WebElement rows;
		List<WebElement> rows, coloumns;
		 rows=emptable.findElements(By.tagName("tr"));
		 
		 System.out.println("no of rows " + rows.size());
		 for(int i=1;i < rows.size()-1;i++)
		 {
			 coloumns=rows.get(i).findElements(By.tagName("td"));
			 Thread.sleep(1000);
			 String st=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+i+"]//td[1]")).getText();
			 String st1=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//tr["+i+"]//td[2]")).getText();
			/*System.out.println("no of rows"+ (i+1)+"no of coloumns"+coloumns.size());
			 String Structure =coloumns.get(i).getText();
			 String Country=coloumns.get(i).getText();
			 System.out.println(Structure + " "+Country);
			 coloumns=rows.get(i).findElements(By.tagName("td"));*/
			 System.out.println(st);
			 System.out.println(st1);
		 }
		 
		
		 }
		

	}



package org.dragAnddrop0501;//05.01.22

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {
	static WebDriver driver =null;
	public static void main(String[] args) {
		
		BaseUtilities bu = new  BaseUtilities();
		 String url="https://demoqa.com/text-box";
		 driver=bu.startUp(url,"CH");
		 driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		 WebElement ele = driver.findElement(By.cssSelector("#userName"));
		 String Text="Test";
		 
		
		
		
		
		 SendKeys pa =new  SendKeys();
		//pa.ddMethod();
		 pa.sendKeys(ele, Text);
		 
		
	}
 public void ddMethod() {
	 BaseUtilities bu = new  BaseUtilities();
	 String url="https://demoqa.com/text-box";
	 driver=bu.startUp(url,"CH");
	 driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	 WebElement ele = driver.findElement(By.cssSelector("#userName"));
	 Actions act =new Actions(driver);
	// act.click(ele).perform();
	act.click(ele).sendKeys("Test").build().perform();
				 
 }
 
 public Actions sendKeys(WebElement ele,String Text) {//generic method
	 Actions act =new Actions(driver);
	 act.click(ele).sendKeys("Text").build().perform();
	 return act;
 }
 
}

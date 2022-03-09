package org.dragAnddrop0501;//05.01.22

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RemainingMethods {
	static WebDriver driver =null;
	public static void main(String[] args) {
		
		 RemainingMethods pa =new  RemainingMethods();
		 pa.ddMethod();
		
	}
 public void ddMethod() {
	 BaseUtilities bu = new  BaseUtilities();
	 String url="https://demoqa.com/text-box";
	 driver=bu.startUp(url,"CH");
	 driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	 WebElement ele = driver.findElement(By.cssSelector("#userName"));
	 Actions act =new Actions(driver);
	//act.sendKeys(ele,"USERNAME").perform();
	 //act.contextClick(ele).pause(2).sendKeys("W").build().perform();//right click
	// act.contextClick(ele).perform();
	 try {
		 Thread.sleep(2000);
		 
	 }catch(InterruptedException e) {
		 e.printStackTrace();
		 
	 }
	act.sendKeys(Keys.ARROW_DOWN).perform();
	 //act.sendKeys(Keys.chord(Keys.CONTROL,"T")).build().perform();//this one is not perform
	
				 
 }
 
}

package org.dragAnddrop0501;//05.01.22

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	static WebDriver driver =null;
	public static void main(String[] args) {
		
		 ClickAndHold pa =new  ClickAndHold();
		 pa.ddMethod();
		 
	}
 public void ddMethod() {
	 BaseUtilities bu = new  BaseUtilities();
	 String url="https://demoqa.com/droppable";
	 driver=bu.startUp(url,"CH");
	 driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	 WebElement src=driver.findElement(By.id("draggable"));
	 WebElement drs=driver.findElement(By.id("droppable"));
	 
	 Actions act= new Actions(driver);
	 act.moveToElement(src).clickAndHold().moveToElement(drs).release().build().perform();
	 
	 
	 
	 
 }

}

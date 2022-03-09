package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassGeneric {
	
	public void sendKeys(WebDriver driver,WebElement ele,String Text) {
		 Actions act =new Actions(driver);
		 act.click(ele).sendKeys(Text).build().perform();
		 
	 }
	public void clickAndHold(WebDriver driver,WebElement src,WebElement des) {
		 Actions act =new Actions(driver);
		 act.moveToElement(src).clickAndHold().moveToElement(des).release().build().perform();
		 
		 
	 }
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement des) {
		 Actions act =new Actions(driver);
		 act.dragAndDrop(src, des);
		 
		
	 }
	public void dragAndDropXY(WebDriver driver,WebElement src,int x,int y) {
		 Actions act =new Actions(driver);
		 act.dragAndDropBy(src, x, y);
		 
		
	 }
	}



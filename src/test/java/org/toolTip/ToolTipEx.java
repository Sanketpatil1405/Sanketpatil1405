package org.toolTip;//04.12.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTipEx {
	static WebDriver driver=null;
	public static void main(String[] args) {
		ToolTipEx sa = new ToolTipEx();
		//sa.tooltipsmethod();
		//sa.tooltipsmethod1();
		
		
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/text-box";
		bu.startUp(url, "FF");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		
		
		//WebElement ele =driver.findElement(By.cssSelector("#userName"));
//		String st="SANKET";
//		ActionClassGeneric ac =new ActionClassGeneric();
//		ac.sendKeys(ele, st);

	}
	public void tooltipsmethod() {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/tool-tips";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement button=driver.findElement(By.id("toolTipButton"));
		Actions act=new Actions(driver);
		act.moveToElement(button).perform();
		String st = driver.findElement((By.cssSelector("div[class='tooltip-inner']"))).getText();
       System.out.println(st);

	}
	public void tooltipsmethod1() {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/tool-tips";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement button1=driver.findElement(By.id("toolTipTextField"));
		Actions Tt=new Actions(driver);
		Tt.moveToElement(button1).perform();
		String st = driver.findElement(By.cssSelector("div[class='tooltip-inner']")).getText();
		System.out.println(st);
		
	}

}

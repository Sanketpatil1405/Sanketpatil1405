package org.multiselected2912;//29.12.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		try {
		BaseUtilities bu = new BaseUtilities();
		String url ="https://www.google.com";
		driver=bu.startUp(url, "CH");
		//to method
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		

	}
	

}

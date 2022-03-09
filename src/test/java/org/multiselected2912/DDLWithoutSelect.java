package org.multiselected2912;//29.12.21

import java.util.List;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DDLWithoutSelect {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		String url ="https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
	  List<WebElement>adv = driver.findElements(By.cssSelector("img[alt='adplus-dvertising']"));
	  
	  if(!adv.isEmpty()) {
		  adv.get(0).click();
      }
	 WebElement ValueDDL =driver.findElement(By.xpath("//div[text()='Select Option']"));
		ValueDDL.click();
		driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
		
		 
	}

}

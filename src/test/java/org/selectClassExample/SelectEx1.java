package org.selectClassExample;//23.12.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectEx1 {
    static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/select-menu";
		driver =bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		//identify select tag
		WebElement colourDDL=driver.findElement(By.id("oldSelectMenu"));
		
		
		
		
		
		colourDDL.click();
		//create select class object
		//select class is present in selenium and create object this class by passing  
		//web elements in select constructor
		Select sel= new Select(colourDDL);
		//sel.selectByVisibleText("Purple");
		//sel.selectByValue("8");//many time value is not given that time we can't use this think
	sel.selectByIndex(10);//for passing value by using indexing not value (couting starts from 0)
	
	}
	
	
		
		
		
		
		
	}

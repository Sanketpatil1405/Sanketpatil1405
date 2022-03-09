package org.basicExamples;//22.12.21

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.SelectGenericMethod;

public class BasicMethodEx {
    static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/select-menu";
		driver =bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		//driver=bu.startUp("https://demoqa.com/buttons","CH");
		//WebElement button= driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		//button.click();
		
	    
	}
	
	
		
		
		
		
		
	}

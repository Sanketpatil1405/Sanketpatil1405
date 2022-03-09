package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicMethod {
 static WebDriver driver=null;
	public static void main(String[]args) {
		StartUp su =new StartUp();
		//String url="https://www.facebook.com";
		String browserName = "CH";
		//driver=su.openbrowser("https://www.youtube.com/", "CH");
		
		//WebElement youtube =driver.findElement(By.xpath("//input[@id='search']"));
		//youtube.sendKeys("tarak mehta ka ulta chashma");
	
		driver =su.openbrowser("https://demoqa.com/select-menu","CH");
		driver.findElement(By.cssSelector("img[title='Ad.Plus Advertising']")).click();
		
		//WebElement colourddl =driver.findElement(By.id("oldSelectMenu"));
		//colourddl.click();
		//Select sel =new Select(colourddl);
		//sel.selectByVisibleText("Green");
		
		WebElement colourddl=driver.findElement(By.id("oldSelectMenu"));
	    SelectGenericMethod obj =new SelectGenericMethod();
	  //  obj.selectedbyindex(colourddl, 5);
	    //obj.selectedbyvalue(colourddl, "4");
		obj.getListOfTextFromSelect(colourddl);
		
	}

}
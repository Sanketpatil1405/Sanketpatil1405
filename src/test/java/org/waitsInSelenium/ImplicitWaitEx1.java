package org.waitsInSelenium;//24.12.21

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImplicitWaitEx1 {
	static WebDriver driver =null;
	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="http://localhost/login.do";
		driver = bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton")).click();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.cssSelector("#logoutLink1")).click();
	
		//
		
		
	}

}

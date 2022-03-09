package org.testNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationEx1 {
	WebDriver driver=null;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		String url="http://localhost/login.do";
	
		driver=BaseUtilities.bu.startUp(url,"CH");//error
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.findElement(By.cssSelector("#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
	
	@Test
	public void testmethod1() {
		System.out.println("Test Method 1");
	
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method 1");
		driver.findElement(By.id("logoutLink")).click();
	}



	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
		driver.quit();
	}

}

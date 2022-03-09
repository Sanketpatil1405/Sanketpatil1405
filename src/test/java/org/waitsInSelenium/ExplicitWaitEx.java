package org.waitsInSelenium;//24.12.21

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
  static WebDriver driver =null;
  public static void main(String[] args) {
	  BaseUtilities bu=new BaseUtilities();
	  //		String url="http://localhost/login.do";
	  //		 driver = bu.startUp(url, "CH");
	  //		 WebElement unfield=driver.findElement(By.cssSelector("#username"));
	  //		 unfield.sendKeys("admin");
	  //		 WebElement pwfield=driver.findElement(By.cssSelector("input[name='pwd']"));
	  //		 pwfield.sendKeys("manager");
	  //		 driver.findElement(By.cssSelector("#loginButton")).click();
	  //		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
	  //		wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#logoutLink1")));
	  //		driver.findElement(By.cssSelector("#logoutLink")).click();


	  String url="http://localhost/login.do";
	  driver = bu.startUp(url, "CH");
	  WebElement unfield=driver.findElement(By.cssSelector("#username"));
	  unfield.sendKeys("admin");
	  WebElement pwfield=driver.findElement(By.cssSelector("input[name='pwd']"));
	  pwfield.sendKeys("manager");
	  driver.findElement(By.cssSelector("#loginButton")).click();




	  WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
	  wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='TASKS']")));
	  driver.findElement(By.xpath("//div[text()='TASKS']")).click();
	  driver.findElement(By.cssSelector("#logoutLink")).click();

	}

}

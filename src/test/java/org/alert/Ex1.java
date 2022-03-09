package org.alert;//04.01.21

import java.time.Duration;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Ex1 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/alerts";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		driver.findElement(By.id("timerAlertButton")).click();
		
		
//		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
//       wt.until(ExpectedConditions.alertIsPresent());

		Ex1 obj = new Ex1();
		
		if(obj.isAlertPresent(driver,10)) {
			System.out.println("text ="+driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}else {
			System.out.println("No alert Displayed");
		}
		
		
		
       
	}
	private boolean isAlertPresent(WebDriver driver, int time) {
		try {
		
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(time));
     wt.until(ExpectedConditions.alertIsPresent());

		return true;
		}catch(Exception e) {
			return false;
		}
}

}

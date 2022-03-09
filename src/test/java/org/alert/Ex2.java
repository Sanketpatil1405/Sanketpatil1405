package org.alert;//03.01.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex2 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/alerts";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		driver.findElement(By.id("promtButton"));
		System.out.println("text ="+driver.switchTo().alert().getText());//exception no such alert
		 driver.switchTo().alert().sendKeys("hello from oct 4 batch");
       driver.switchTo().alert().accept();
       
       Alert alt=driver.switchTo().alert();
       System.out.println("text ="+alt.getText());
       alt.sendKeys("Hello From oct 4 batch");
       alt.accept();
     //  alt.dismiss();
       
       
       
       
       
       
	}

}

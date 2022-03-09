package org.findElement3012;//30.12.21

import java.util.List;

import javax.lang.model.element.Element;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindelementEx1 {
static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/webtables";
		driver =bu.startUp(url, "FF");
		
		
		
		
		
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		//WebElement ele=driver.findElement(By.xpath("//div[text()='Cierra']"));//not selected
		List<WebElement> listofele =driver.findElements(By.xpath("//div[text()='Kierra']"));//not selected
		System.out.println(listofele.size());
		System.out.println(listofele.isEmpty());
		
		if(!listofele.isEmpty()) {
			//listofele.get(0).click();
			WebElement ele=listofele.get(0);
			ele.click();
			System.out.println(listofele.get(0).getText());
			
			
		}
	}

}

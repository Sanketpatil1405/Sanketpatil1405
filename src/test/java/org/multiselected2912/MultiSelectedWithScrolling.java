package org.multiselected2912;//29.12.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectedWithScrolling {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu = new BaseUtilities();
		//String url ="https://demoqa.com/books";
		String url ="https://demoqa.com/select-menu";
		driver=bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();;
		//use page down to scroll
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		//WebElement colourDDL =driver.findElement(By.xpath("//a[text()='Programming JavaScript Applications']"));
		WebElement colourDDL =driver.findElement(By.id("cars"));
		
		//javascript
		//JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true)",colourDDL);
		//Select sel = new Select(colourDDL);
		//for(int i=0; i<sel.getOptions().size(); i++) {
			//sel.selectByIndex(i);
		//}
		
		MultiSelectedWithScrolling obj =new MultiSelectedWithScrolling();
		obj.JSScroll(colourDDL);
}
		
	
	
	public void JSScroll(WebElement colourDDL) {
		WebElement colourDD =driver.findElement(By.id("cars"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",colourDDL);
		Select sl=new Select(colourDD);
		for(int i=0;i<sl.getOptions().size();i++) {
			sl.selectByIndex(i);
			}
		
      		
	}

}

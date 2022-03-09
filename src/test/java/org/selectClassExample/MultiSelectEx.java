package org.selectClassExample;//23.12.21

import java.util.ArrayList;
import java.util.List;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectEx {
    static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/select-menu";
		driver =bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		//driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();-direct calling
		//identify select tag
		WebElement colourDDL=driver.findElement(By.id("cars"));
		Select sel = new Select(colourDDL);
		//sel.selectByVisibleText("Volvo");
		//sel.selectByValue("audi");
		//sel.selectByIndex(2);
		
		for(int i=0;i<sel.getOptions().size();i++) {
			sel.selectByIndex(i);//print all select one by one
		}
		//sel.deselectAll();
		sel.deselectByVisibleText("Saab");
		List<WebElement>SelectedOption=sel.getAllSelectedOptions();
				//store in all selected element in list
		for(int i=0;i<SelectedOption.size();i++) {
			System.out.println(SelectedOption.get(i).getText());
			//it will be Print in output all list
		}
		
		
		
	}
}
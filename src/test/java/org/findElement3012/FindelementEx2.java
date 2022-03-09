package org.findElement3012;//30.12.21

import java.util.List;

import javax.lang.model.element.Element;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindelementEx2 {
static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/webtables";
		bu.startUp(url,"CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		List<WebElement> listOfEle =driver.findElements(By.xpath("//div[@class='rt-tbody']//div[@class='rt-td'][text()][1]"));
			for(int i=0;i<listOfEle.size();i++) {
				System.out.println(listOfEle.get(i).getText());
			}
		}
	}



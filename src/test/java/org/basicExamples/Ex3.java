package org.basicExamples;//28.12.21

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex3 {
	static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
//		String url="https://demoqa.com/radio-button";
//		driver =bu.startUp(url, "CH");
//		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
//		String  actualURL=driver.getCurrentUrl();
//		 System.out.println("actual ural :"+actualURL);
//		 String PageTitle =driver.getTitle();
//		  System.out.println("Page Title :"+PageTitle);
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		 WebElement YesRadiolabel = driver.findElement(By.cssSelector("label[for='yesRadio']"));
//		 String text=YesRadiolabel.getText();
//		 System.out.println("text :"+text);
//		String YesBtnClassName =YesRadiolabel.getAttribute("class");
//		System.out.println(YesBtnClassName);
//			String PageSource=driver.getPageSource();
//		System.out.println(PageSource);
//
//		WebElement NoRadiobutton =driver.findElement(By.id("noRadio"));
//		System.out.println("NoRadiobutton :"+NoRadiobutton.isEnabled());
//
//		if(YesRadiolabel.isDisplayed()) {
//			YesRadiolabel.click();
//		}try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//
//			WebElement YesRadioBtn = driver.findElement(By.id("yesRadio"));
//		if(YesRadioBtn.isSelected()) {
//			System.out.println("Yes Radio Button is Selected");
//			}else {
//		System.out.println("Yes radio Button is Not Selected");
//		}
	// for flipkart	
		String url ="https://www.flipkart.com/search?q=samsung+galaxy+m32+5g&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_21_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_2_21_na_na_ps&as-pos=2&as-type=&page=2";
		driver =bu.startUp(url, "CH");
		WebElement Samsungm32 =driver.findElement(By.xpath("//a[@class='ge-49M _2Kfbh8']"));
		//String text1=Samsungm32.getText();
		//System.out.println(text1);
		String pageno=Samsungm32.getAttribute("class");//wrong syntax for ends with
		//System.out.println(pageno);
		if(pageno.endsWith("_2Kfbh8")) {
			System.out.println(Samsungm32.getText());
			
		}else {
			System.out.println(Samsungm32.getText());
		}
	}
  
	
}

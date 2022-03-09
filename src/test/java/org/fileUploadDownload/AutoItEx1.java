package org.fileUploadDownload;

import java.io.IOException;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoItEx1 {
	static WebDriver driver =null;
	public static void main(String[] args) {
		AutoItEx1 obj =new AutoItEx1 ();
		obj.fileupload1();
		
		
       }
	public void fileupload() {//for chrome browser
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/automation-practice-form";
		driver=bu.startUp(url,"CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele= driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		js.executeScript("arguments[0].click();",ele);
		String path = System.getProperty("user.dir");

		try {

			Runtime.getRuntime().exec("D:\\MAVEN2\\selenium\\autoItFiles\\Chromeupload1.exe");
		}catch(IOException e) {
			e.printStackTrace();

   }
	}
	public void fileupload1() {
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/automation-practice-form";
		driver=bu.startUp(url,"FF");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele= driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		js.executeScript("arguments[0].click();", ele);
		String path = System.getProperty("user.dir");
		try {
			Runtime.getRuntime().exec("D:\\MAVEN2\\selenium\\autoItFiles\\Firefoxupload.exe");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	}




package org.fileUploadDownload;

import java.io.IOException;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoItGeneric {
	static WebDriver driver =null;
	public static void main(String[] args) {
		AutoItGeneric obj =new AutoItGeneric ();
		obj.fileupload();
		
		
       }
	public void fileupload() {//for chrome browser
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/automation-practice-form";
		driver=bu.startUp(url,"FF");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele= driver.findElement(By.id("uploadPicture"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		js.executeScript("arguments[0].click();",ele);
		String path = System.getProperty("user.dir");

		try {
        
			Runtime.getRuntime().exec(path+"\\autoItFiles\\GenericUpload.exe"+" "+"D:\\MAVEN2\\selenium\\autoItFiles\\FileusetoUpload.txt");
		}catch(Exception e) {
			e.printStackTrace();
   }	
	}
	}




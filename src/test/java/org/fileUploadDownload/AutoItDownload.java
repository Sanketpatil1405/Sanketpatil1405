package org.fileUploadDownload;

import java.io.IOException;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoItDownload {
	static WebDriver driver =null;
	public static void main(String[] args) {
		AutoItDownload obj =new AutoItDownload ();
		//obj.filedownload();
		obj.fileupload();
		
       }
	public void filedownload() {
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/upload-download";
		driver=bu.startUp(url,"FF");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele=driver.findElement(By.id("downloadButton"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
		String path=System.getProperty("user.dir");
		try {
		Runtime.getRuntime().exec("D:\\MAVEN2\\selenium\\autoItFiles\\FirefoxDownload.exe");
		}catch(IOException e) {
			e.printStackTrace();
		}	
	}
	public void fileupload() {
		BaseUtilities bu = new  BaseUtilities();
		String url="https://demoqa.com/upload-download";
		driver=bu.startUp(url,"FF");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement ele=driver.findElement(By.id("uploadFile"));
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click()",ele);
		try {
		Runtime.getRuntime().exec("D:\\MAVEN2\\selenium\\autoItFiles\\Firefoxupload.exe");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	}




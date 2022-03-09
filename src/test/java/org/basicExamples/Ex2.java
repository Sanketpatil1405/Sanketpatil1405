package org.basicExamples;//21.12.21

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Ex2 {

	public static void main(String[] args) {
	
	System.out.println("Program Starts");
	String path=System.getProperty("user.dir");
	System.out.println("path ="+path);
	String browserName="CH";
	ChromeDriver driverCH =null;
	FirefoxDriver driverFF =null;
	
	if(browserName.equalsIgnoreCase("CH")) {
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		driverCH = new ChromeDriver();
		driverCH.manage().window().maximize();
		driverCH.get("http://www.facebook.com/");		
	}else if(browserName.equalsIgnoreCase("FF")) {
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		driverFF=new FirefoxDriver();
		driverFF.manage().window().maximize();
		driverFF.get("http://www.google.com/");
	}else {System.out.println("Invalid browser name");}
	
	
		
		
		
		
	}
  
	
}

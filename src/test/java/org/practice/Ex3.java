package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex3 {

	public static void main(String[] args) {
		Ex3 obj =new Ex3();
		obj.generic2("https://www.instagram.com/", "FF");
	
	
	}
	public WebDriver generic2(String url,String browsername) {
		String path = System.getProperty("user.dir");
		System.out.println("path ="+path);
      WebDriver driver =null;
	//obj.manage().window().maximize();
	//obj.get("https://www.instagram.com/");

	if(browsername.equalsIgnoreCase("CH")) {
		 System.setProperty("webdriver.chrome.driver", "D:\\MAVEN2\\selenium\\drivers\\chromedriver.exe");
		 driver =new ChromeDriver();
		
	}else if(browsername.equalsIgnoreCase("FF")){
		System.setProperty("webdriver.gecko.driver", "D:\\MAVEN2\\selenium\\drivers\\geckodriver.exe");
		driver =new FirefoxDriver();	
		
	}else {
		System.out.println("Invalid Browser Name");
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
	
	}

}

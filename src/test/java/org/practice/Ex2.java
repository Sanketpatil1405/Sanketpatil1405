package org.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("path ="+path);
      System.setProperty("webdriver.chrome.driver", "D:\\MAVEN2\\selenium\\drivers\\chromedriver.exe");
	ChromeDriver obj =new ChromeDriver();
	obj.manage().window().maximize();
	obj.get("https://www.instagram.com/");
	
	
	}

}

package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartUp {
	WebDriver driver =null;
	public WebDriver openbrowser(String url, String browserName) {
		String path = System.getProperty("user.dir");
		System.out.println("Path ="+path);
		
		
		//String browserName=null;
		if(browserName.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver","D:\\MAVEN2\\selenium\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver","D:\\MAVEN2\\selenium\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ME")) {
			System.setProperty("webdriver.edge.driver","D:\\MAVEN2\\selenium\\drivers\\msedgedriver.exe");
			driver =new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Name");
		}
		//driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
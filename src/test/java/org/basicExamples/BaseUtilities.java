package org.basicExamples;//22.12.21

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtilities {
public static BaseUtilities bu=new BaseUtilities();
	public WebDriver startUp(String url,String browserName) {
   String path = System.getProperty("user.dir");
   System.out.println("path ="+path);
   WebDriver driver=null;
  if(browserName.equalsIgnoreCase("CH")) {
	  System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
	//WebDriverManager.chromedriver().SetUp();
	  driver=new ChromeDriver();
  }else if(browserName.equalsIgnoreCase("FF")) {
	  System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
	  driver= new FirefoxDriver();	  
  }else {
	  System.out.println("Invalid browser Name");
  }
  
  driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS ); //this is old version of seleniun 3.0
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this is new version of selenium 4.0
  driver.get(url);
	return driver;	
		
		
	}

}

package org.basicExamples;//21.12.21

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.command.GraphDriver;


public class Ex1 {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.out.println("path ="+path);
	//	String str ="D:\\MAVEN2\\selenium\\drivers\\chromedriver.exe";
	//	string str1 = path+"\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",path+"\\drivers\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();//open chrome browser directly-interview question-how to open browser
		
		Ex1 obj1=new Ex1();
		obj1.openFireFoxBrowser();
		
	
		
		
		
		
		
	}
  public void openFireFoxBrowser(){
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
	  FirefoxDriver driver = new FirefoxDriver();
	 driver.get("http://www.facebook.com/");
	  
  }
	
  public void msedgeBrowser(){
	  String path = System.getProperty("user.dir");
	  System.setProperty("webdriver.msedge.driver",path+"\\drivers\\msedgedriver.exe");
	  
  }
	
}

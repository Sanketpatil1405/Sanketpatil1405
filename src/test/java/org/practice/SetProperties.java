package org.practice;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetProperties {
	public void Firefox() {
		String path =System.getProperty("user.dir");
		System.out.println("Path ="+path);
		System.setProperty("webdriver.gecko.driver",path+"\\drivers\\geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();
		}
	public void edge() {
		
		System.setProperty("webdriver.edge.driver","D:\\MAVEN2\\selenium\\drivers\\msedgedriver.exe");
		EdgeDriver obj = new EdgeDriver();
		obj.get("http://www.facebook.com/");
		}

	
	
	
	
	
	public static void main(String[] args) {
	
	SetProperties obj =new SetProperties();
	obj.Firefox();
	obj.edge();	
		
		
		
		
	  
  }
	
}

package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptGeneric {

	public void javaScroll() {
		StartUp obj =new StartUp();
		WebDriver driver =obj.openbrowser("https://www.flipkart.com/mobiles/pr?sid=tyy%2C4io&otracker=clp_metro_expandable_7_3.metroExpandable.METRO_EXPANDABLE_Shop%2BNow_mobile-phones-store_92RED14GXPXF_wp3&fm=neo%2Fmerchandising&iid=M_6fd40112-9278-4c9b-83e5-78e5af29ce3a_3.92RED14GXPXF&ppt=hp&ppn=homepage&ssid=ni9pwf9jwg0000001641108879620", "CH");
	WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search Brand']"));
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("argument(0).scrollIntoView(true)", search);

	
	
	
	
	
	}

}
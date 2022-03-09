package org.findElement3012;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericWinHandle3112 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/browser-windows";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		String parenetId1=driver.getWindowHandle();//parent id
		System.out.println("ParentId1 ="+parenetId1);
		driver.findElement(By.id("tabButton")).click();
		Set<String>allWinId=driver.getWindowHandles();//all window id
		Iterator<String>itr=allWinId.iterator();
		while(itr.hasNext()) {
			String id1=itr.next();
			if(!id1.equals( parenetId1)){
				driver.switchTo().window(id1);
				try {//way 1
					String text= driver.findElement(By.id("sampleHeading")).getText();
					System.out.println("text ="+text);
					break;
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("Trying to Switch on another Window");

				}
			}
		}
//			driver.close();//close Child window
//		driver.switchTo().window(parenetId1);
//		driver.close();//close parent window
//				driver.quit();//close all instance open by driver
	}
	//way 2
	//	List<WebElement>ele=driver.findElements(By.id("sampleHeading"));
	//if(!ele.isEmpty()){
	//	String text =ele.get(0).getText();
	//	System.out.println("text ="+text);
	//break;


	//}
}


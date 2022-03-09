package org.multipleWindows;

import java.util.Iterator;
import java.util.Set;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ex1 {
	static WebDriver driver=null;
	public static void main(String[] args) {
//		BaseUtilities bu=new BaseUtilities();
//		String url="https://demoqa.com/browser-windows";
//		driver =bu.startUp(url, "CH");
//		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
//		String ParentId1=driver.getWindowHandle();//parent id
//		driver.findElement(By.id("tabButton")).click();
//		String ParentId2=driver.getWindowHandle();//parent id
//		System.out.println("ParentId1 ="+ParentId1);
//		System.out.println("ParentId2 ="+ParentId2);
//		Set<String> allWinId=driver.getWindowHandles();//all ids
//		Iterator<String>itr=allWinId.iterator();
//		String Id1=itr.next();
//		System.out.println("Id1 ="+Id1);
//		String Id2=itr.next();
//		System.out.println("Id2 ="+Id2);
//		driver.switchTo().window(Id2);//switch to window
//		
//		System.out.println("current url ="+driver.getCurrentUrl());
		Ex1 obj =new Ex1();
		obj.multiwindow();
		

	}
public void multiwindow() {
	BaseUtilities bu=new BaseUtilities();
	String url="https://demoqa.com/browser-windows";
	driver =bu.startUp(url, "CH");
	driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
	String ParentId1=driver.getWindowHandle();//parent id
	driver.findElement(By.id("windowButton")).click();
	String ParentId2=driver.getWindowHandle();//parent id
	System.out.println("ParentId1 ="+ParentId1);
	System.out.println("ParentId2 ="+ParentId2);
	Set<String> allWinId=driver.getWindowHandles();//all ids
	Iterator<String>itr=allWinId.iterator();
	String Id1=itr.next();
	System.out.println("Id1 ="+Id1);
	String Id2=itr.next();
	System.out.println("Id2 ="+Id2);
	driver.switchTo().window(Id2);//switch to window
	
	System.out.println("current url ="+driver.getCurrentUrl());
	
	
	
}
	
	
	
	
}

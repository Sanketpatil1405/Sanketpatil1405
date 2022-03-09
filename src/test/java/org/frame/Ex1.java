package org.frame;//03.01.21

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ex1 {
	static WebDriver driver=null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/frames";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
//		WebElement frame1=driver.findElement(By.id("frame1"));
//		driver.switchTo().frame(frame1);//switch to frame
//		String text =driver.findElement(By.id("sampleHeading")).getText();
//		System.out.println("text ="+text);
//		driver.switchTo().defaultContent();//switch back to root html
      Ex1 san= new Ex1();
      String locator="#frame1";//generic method
      san.nestedframe1(locator);
		san.nestedframe();//nested framework
		
		
	}

	public void nestedframe() {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/nestedframes";
		driver =bu.startUp(url, "CH");
		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		WebElement nestedframe =driver.findElement(By.cssSelector("#frame1"));
		driver.switchTo().frame(nestedframe);
		String text1=driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
		System.out.println("text1 ="+text1);
		WebElement nestedframe1 =driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(nestedframe1);
		String text2=driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
		System.out.println("text2 ="+text2);
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
	}
	public void nestedframe1(String locator) {
		
		WebElement nestedframe =driver.findElement(By.cssSelector(locator));
		driver.switchTo().frame(nestedframe);
		String text1=driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
		System.out.println("text1 ="+text1);
		
		driver.switchTo().defaultContent();
	}
}

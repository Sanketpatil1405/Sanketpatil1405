package org.selectClassExample;//23.12.21

import java.util.ArrayList;
import java.util.List;

import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectEx2 {
    static WebDriver driver =null;
	public static void main(String[] args) {
		BaseUtilities bu=new BaseUtilities();
		String url="https://demoqa.com/select-menu";
		driver =bu.startUp(url, "CH");
		WebElement adv=driver.findElement(By.cssSelector("img[alt='adplus-dvertising']"));
		adv.click();
		//driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();-direct calling
		//identify select tag
		WebElement colourDDL=driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(colourDDL);
		WebElement selectedoption= sel.getFirstSelectedOption();
		System.out.println(selectedoption.getText());//default selected colour
		
		sel.selectByVisibleText("Black");
		
		System.out.println("user selected option ="+sel.getFirstSelectedOption().getText());
		
		List<WebElement> allOptions = sel.getOptions();
		int numberOfOptions= allOptions.size();
		System.out.println("Number of Colour Present :"+numberOfOptions);
		
		WebElement ele=allOptions.get(0);
		//System.out.println(ele.getText());
		//System.out.println(allOptions.get(1).getText());
		//System.out.println(allOptions.get(2).getText());
		
		ArrayList<String>ar=new ArrayList<String>();
		
		for(int i=0;i<numberOfOptions;i++) {
			ar.add(allOptions.get(i).getText());
			System.out.println(allOptions.get(i).getText());
		}
		System.out.println("************");
		System.out.println(ar);
		if(ar.contains("Aqua")) {
			sel.selectByVisibleText("Aqua");
			
		}
	
		
		
		
		
	}
	public void getListOftextFromSelect(WebElement ddlEle,int Value) {
		
		Select sel= new Select(ddlEle);
		//sel.selectByVisibleText(Value);
		//sel.selectByValue(Value);
		sel.selectByIndex(0);
		
	}
	public ArrayList<String> getListOfTextFromSelect(WebElement ddlEle,int value){
		//this generic method is return to arraylist of string
		ArrayList<String>ar =new ArrayList<String>();
		Select sel=new Select(ddlEle);
		int size =sel.getOptions().size();
		for(int i=0;i<size;i++) {
			List<WebElement> ddlo=sel.getOptions();
			//WebElement ele=ddlo.get(i);
			//ele.getText(); this 3 things in next only 1 line consider
			
			ar.add(sel.getOptions().get(i).getText());
		}
		
		
		return ar;
	}
	
	
		
		
		
		
		
	}

package org.utilities;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectGenericMethod {
   
	
	
	public Select selectedbyindex(WebElement colourddl, int index) {
		
		Select sel = new Select(colourddl);
		sel.selectByIndex(index);
		return sel;
		
	}
	public Select selectedbyvalue(WebElement colourddl,String value) {
		Select sel = new Select(colourddl);
		
		sel.selectByValue(value);
		String s=sel.getFirstSelectedOption().getText();
		System.out.println(s);
		
	return sel;	
	}
	public Select selectedbyvisibletext(WebElement colourddl,String text) {
		Select sel = new Select(colourddl);
		sel.selectByVisibleText(text);
		return sel;
	}
   public ArrayList<String> getListOfTextFromSelect(WebElement colourddl) {
	   ArrayList<String> ar =new  ArrayList<String>();
	   Select sel= new Select(colourddl);
	  int size= sel.getOptions().size();
	  for(int i=0; i<size; i++) {
		 ar.add(sel.getOptions().get(i).getText());
		 System.out.println(sel.getOptions().get(i).getText());
	  }
	   System.out.println(ar);
	   return ar;
	   
	   
	   
	   
   }
	
}
	
	




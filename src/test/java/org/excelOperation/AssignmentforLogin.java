package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.basicExamples.BaseUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Read Operation Perform

public class AssignmentforLogin {
  static WebDriver driver=null;
	public static void main(String[] args) {
		AssignmentforLogin obj =new AssignmentforLogin();
		obj.readExcel();


	}
	public void readExcel() {
		try {
		String path=System.getProperty("user.dir");
		System.out.println(path);
		FileInputStream fis =new FileInputStream(path+"\\Excel Files\\Test Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);//generic code use	
		Sheet sh=wb.getSheet("loginCredential");
		for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			BaseUtilities bu = new  BaseUtilities(); 
			 String url="http://localhost/login.do";
			 driver=bu.startUp(url,"CH");
			
			driver.findElement(By.cssSelector("#username")).sendKeys(username);
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
			driver.findElement(By.cssSelector("#loginButton")).click();
			Thread.sleep(2000);
			
			String actualurl=driver.getCurrentUrl();
			String expectedurl="http://localhost/user/submit_tt.do";
			if(actualurl.equals(expectedurl)) {
				sh.getRow(i).createCell(2).setCellValue("Pass");
			}else {
				sh.getRow(i).createCell(2).setCellValue("Fail");
			}
			FileOutputStream fos =new FileOutputStream(path+"\\Excel Files\\Test Data.xlsx");
			wb.write(fos);
			fos.close();
			
		}
		wb.close();
	
		
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
			}
		}
	
	
	}


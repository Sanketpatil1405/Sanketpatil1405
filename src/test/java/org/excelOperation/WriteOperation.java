package org.excelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//Read Operation Perform

public class WriteOperation {

	public static void main(String[] args) {
		WriteOperation obj =new WriteOperation();
		obj.readExcel();


	}
	public void readExcel() {
		try {
			System.out.println("Program Starts");
			String path=System.getProperty("user.dir");
			FileInputStream fim=new FileInputStream(path+"\\Excel Files\\Test Data.xlsx");
			Workbook wb=WorkbookFactory.create(fim);
			Sheet sh=wb.getSheet("loginCredential");
			//Row rw=sh.getRow(1);
			sh.getRow(1).getCell(2).setCellValue("Pass");
			sh.getRow(2).getCell(2).setCellValue("Fail");
			sh.getRow(3).getCell(2).setCellValue("Fail");
			FileOutputStream fos =new FileOutputStream(path+"\\Excel Files\\Test Data.xlsx");
			wb.write(fos);
			fos.close();
			wb.close();
			System.out.println("Program Ends");
		
		}catch(Exception e) {
			e.printStackTrace();
		}
			}
	}

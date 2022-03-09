package org.excelOperation;
//Read Operation Perform
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintallDataEx {

	public static void main(String[] args) {
		PrintallDataEx obj =new PrintallDataEx();
		obj.readExcel();
		

}
	public void readExcel() {
		try {
			
			String path=System.getProperty("user.dir");
			System.out.println(path);
			FileInputStream fis =new FileInputStream(path+"\\Excel Files\\Test Data.xlsx");
			//when we create fileinputstream object then constructor shows error
			//because constructor  passing String,after passing string then again error show
			//this error is compile time error,and handle this error in try catch block always
			//shows file not found exception throgh
			Workbook wb=WorkbookFactory.create(fis);//generic code use
			int Numberofsheets =wb.getNumberOfSheets();
			System.out.println("NumbersofSheet ="+Numberofsheets);
			
			
			Sheet sh=wb.getSheet("AllString");
			//System.out.println(sh.getLastRowNum());//generally not use
			System.out.println(sh.getPhysicalNumberOfRows());
			
			Row rw=sh.getRow(1);
			int numberofcell=rw.getPhysicalNumberOfCells();
			System.out.println("numberofcell="+numberofcell);
			
			Cell c=rw.getCell(1);
			//System.out.println(c.getStringCellValue());
			//System.out.println(rw.getCell(1).getStringCellValue());
			System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
//		for(int i=0;i<numberofcell;i++) {
//				System.out.println(sh.getRow(1).getCell(i).getStringCellValue());
//		}
//		
			for(int i=1;i<sh.getPhysicalNumberOfRows();i++) {
				Row r=sh.getRow(i);
				for(int k=0;k<r.getPhysicalNumberOfCells();k++) {
					System.out.println(r.getCell(k).getStringCellValue());
					
				}
				System.out.println();
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}

package org.excelOperation;
//Read Operation Perform
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) {
		Ex2 obj =new Ex2();
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
			
			
			Sheet sh=wb.getSheet("data");
			//System.out.println(sh.getLastRowNum());//generally not use
			System.out.println(sh.getPhysicalNumberOfRows());
			
			Row rw=sh.getRow(1);
			int numberofcell=rw.getPhysicalNumberOfCells();
			System.out.println("numberofcell="+numberofcell);
			
			Cell c=rw.getCell(1);
			System.out.println(c.getStringCellValue());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
package org.excelOperation;
//Read Operation Perform
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) {
		Ex1 obj =new Ex1();
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
			//System.out.println(wb.getSheetName(1)); //indexing starts from 0
			ArrayList<String> sheetname =new ArrayList<String>();
			for(int i=0;i< Numberofsheets;i++) {
				System.out.println(wb.getSheetName(i));
				 sheetname.add(wb.getSheetName(i));
				
			}
			System.out.println(sheetname);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
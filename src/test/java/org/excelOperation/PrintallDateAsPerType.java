package org.excelOperation;
//Read Operation Perform
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintallDateAsPerType {

	public static void main(String[] args) {
		PrintallDateAsPerType obj =new PrintallDateAsPerType();
		obj.readExcel();
		

}
	public void readExcel() {
		try {
			
			String path=System.getProperty("user.dir");
			System.out.println(path);
			FileInputStream fis =new FileInputStream(path+"\\Excel Files\\Test Data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);//generic code use	
			Sheet sh=wb.getSheet("data");
			
			
			for(int k=1;k<sh.getPhysicalNumberOfRows();k++) {
				Row r1=sh.getRow(k);
			for(int i=0;i<r1.getPhysicalNumberOfCells();i++) {
				//System.out.println(r1.getCell(i).getCellType());
				CellType ct=r1.getCell(i).getCellType();
				switch(ct)
				{case STRING:System.out.println(r1.getCell(i).getStringCellValue());
				break;
				case NUMERIC:
					if(DateUtil.isCellDateFormatted(sh.getRow(k).getCell(i)))
					{//System.out.println(sh.getRow(k).getCell(i).getDateCellValue());
						SimpleDateFormat dateformat =new SimpleDateFormat("dd-mm-yyyy");
						System.out.println(dateformat.format(sh.getRow(k).getCell(i).getDateCellValue()));
					}else {
						System.out.println((long)sh.getRow(k).getCell(i).getNumericCellValue());
					}
					break;
				case BOOLEAN:System.out.println(sh.getRow(k).getCell(i).getBooleanCellValue());
					break;
				case FORMULA:System.out.println(sh.getRow(k).getCell(i).getCellFormula());
				break;
				case BLANK:System.out.println("get cell Blank");
				break;
				default:System.out.println("Invalid Cell Type :"+ct);
				}
			}
			}
			System.out.println();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	}

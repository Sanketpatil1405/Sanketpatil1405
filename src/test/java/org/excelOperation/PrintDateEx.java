package org.excelOperation;

import java.text.SimpleDateFormat;
import java.util.Date;

//Read Operation Perform

public class PrintDateEx {

	public static void main(String[] args) {
		PrintDateEx obj =new PrintDateEx();
		obj.readExcel();
		

}
	public void readExcel() {
		Date dt =new Date();
		System.out.println(dt);
		SimpleDateFormat sdf =new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String date=sdf.format(dt);
		System.out.println(date);
		date=date.replaceAll("-","").replaceAll(":", "").replaceAll(" ", "");
		System.out.println(date);
	}
	}

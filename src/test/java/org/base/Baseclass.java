package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Baseclass {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\91948\\eclipse-workspace\\Maveenfirst\\Excel\\data.xlsx");
		
		FileInputStream read = new FileInputStream(file);
		
		Workbook w=new XSSFWorkbook(read);
		
		Sheet get = w.getSheet("data");
		
		int numberOfRows = get.getPhysicalNumberOfRows();
		
		for (int i = 0; i < numberOfRows; i++) {
			
			Row r = get.getRow(i);
			
			
			int numberOfCells = r.getPhysicalNumberOfCells();
			
			for (int j = 0; j < numberOfCells; j++) {
				Cell c = r.getCell(j);
				System.out.println(c);
			}
		
		
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	

}

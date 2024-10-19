package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
public static void readParticularCell(int rows,int column) throws InvalidFormatException, IOException {
File file = new File(("C:\\Users\\CSC\\Documents\\Datadriven.xlsx"));
Workbook book = new XSSFWorkbook(file);
		
Sheet sheet= book.getSheetAt(0);
int lastRowNumber=  sheet.getLastRowNum();
System.out.println(lastRowNumber);
short lastCellNumber = sheet.getRow(0).getLastCellNum();
System.out.println(lastCellNumber);
Row firstNumber = sheet.getRow(1);
Cell cell=firstNumber.getCell(0);
DataFormatter dataFormat = new DataFormatter();
String cellValue = dataFormat.formatCellValue(cell);
System.out.println(cellValue);
	}
		
private void readParticulaMultiCells() throws InvalidFormatException, IOException {
File file = new File(("C:\\Users\\CSC\\Documents\\Datadriven.xlsx"));
Workbook book = new XSSFWorkbook(file);
				
Sheet sheet= book.getSheetAt(0);
Row row = sheet.getRow(0);
Cell cell=row.getCell(0);
DataFormatter dataFormat = new DataFormatter();
String cellValue = dataFormat.formatCellValue(cell);
System.out.println(cellValue);

}
		
				
				


private void readAllData() { 

}

public static void main(String[] args) throws InvalidFormatException, IOException {
	readParticularCell(0,1);
	
}
	}
	
	 
	
	
 


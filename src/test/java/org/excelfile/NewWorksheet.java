package org.excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewWorksheet {
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Framework\\\\TestData\\\\Testdata_File.xlsx");
	FileInputStream filestream=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(filestream);
	/*Sheet createSheet = book.createSheet("MavenTest_FileTask");
	Row createRow = createSheet.createRow(20);
	Cell createCell = createRow.createCell(15);
	createCell.setCellValue("chitra");
	FileOutputStream stream=new FileOutputStream(file);
	book.write(stream);*/
	Sheet sheet1 = book.getSheet("MavenTest_FileTask");
	Row row1 = sheet1.getRow(20);
	Cell cell1 = row1.getCell(15);
	String stringCellValue = cell1.getStringCellValue();
	System.out.println(stringCellValue);
	if(stringCellValue.equals("chitra"))
	{
		cell1.setCellValue("adhira");
	}
	FileOutputStream output=new FileOutputStream(file);
	book.write(output);
	
		
	}

}

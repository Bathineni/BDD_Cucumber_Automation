package com.frameworkUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stepDefinition.GlobleHooks;

import gherkin.lexer.Ro;

public class ExcelUtils {
	
	private final static String fileName="";
	public static FileInputStream file;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	public static String getData(String sheetName,String fieldName) throws IOException {
		String fieldValue=null;
		file=new FileInputStream(new File(fileName));
		workbook=new XSSFWorkbook(file);
		sheet=workbook.getSheet(sheetName);
		
		// Iterate through  each row one by one
		
		Iterator<Row> rowIterater=sheet.iterator();
		
		int cellIndexNum=0;
		DataFormatter formatter=new DataFormatter();
		
		
		while(rowIterater.hasNext()) {
			Row row=rowIterater.next();
			if(row.getRowNum()==0) {
				Iterator<Cell> cellIterater=row.iterator();
				while(cellIterater.hasNext()) {
					Cell cell=cellIterater.next();
					
					//check the cell type and format accordingly
					
					if(formatter.formatCellValue(cell).equalsIgnoreCase(fieldName)) {
						cellIndexNum=cell.getColumnIndex();
						fieldValue=row.getCell(cell.getColumnIndex()).getStringCellValue();
						break;
					}
				}
			}
			// For each row, iterator through all columns
			if(row.getCell(0).getStringCellValue().equalsIgnoreCase(GlobleHooks.scenario.getName())) {
				fieldValue=formatter.formatCellValue(row.getCell(cellIndexNum));
				break;
			}
		}
		
		file.close();
		return fieldValue;
	}

}

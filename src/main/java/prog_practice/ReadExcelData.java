package prog_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcelData {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = ".\\datafiles\\taxpnl-CE0518-2022_2023-Q1-Q4.xlsx";
		
		
		
		
			FileInputStream fis = new FileInputStream(path);
		 // Opens a connection to the specified file
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		
		XSSFSheet sheet = wb.getSheetAt(2);
		
		Iterator<Row> rowitr = sheet.rowIterator();
		
		while(rowitr.hasNext()) {
			
			XSSFRow row = (XSSFRow) rowitr.next();
			Iterator<Cell> cellitr = row.cellIterator();
			
			while(cellitr.hasNext()) {
				
				XSSFCell cell = (XSSFCell) cellitr.next();
			CellType celltype =	cell.getCellType();
			
			switch(celltype) {
			
			case STRING: System.out.print(cell.getStringCellValue());
			break;
			
			case NUMERIC: System.out.print(cell.getNumericCellValue());
			break;
			
			case BOOLEAN: System.out.print(cell.getBooleanCellValue());
			break;
			
			case FORMULA: System.out.print(cell.getDateCellValue());
			default:
				break;
			}
				
			}
			System.out.println();
		}
		
		wb.close();
					
		}
		
		
		
	
}

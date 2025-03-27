package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.poi.*;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;


public class ExcelReader {

	private static final String FILE_PATH = "C:\\Users\\91855\\OneDrive\\Documents\\TestData.xlsx";
	
	private String filepath;

	public ExcelReader() {

		this.filepath=FILE_PATH;
	}
	
	public String getCellValueAsString(Cell cell) {
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                return String.valueOf(cell.getNumericCellValue()); // Convert number to string
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue()); // Convert boolean to string
            case FORMULA:
                return cell.getCellFormula(); // Return formula as a string
            case BLANK:
                return "";
            default:
                return "";
        }
    }

	public  Map<String, String> readExcelData(String sheetname){

		Map<String, String> map = new LinkedHashMap<>();

		try(FileInputStream fis = new FileInputStream(filepath);
				XSSFWorkbook wb = new XSSFWorkbook(fis);) {

			XSSFSheet sheet = wb.getSheet(sheetname);


			if(sheet==null) {

				throw new RuntimeException("No sheet available.");
			}


			for(int i=0; i<=sheet.getLastRowNum();i++) {

				XSSFRow row = sheet.getRow(i);

				if(row!= null) {

					Cell keyCell = row.getCell(0);
					Cell valuecell = row.getCell(1);

					if(keyCell !=null && valuecell!=null) {


						String key = getCellValueAsString(keyCell).trim();
						String value = getCellValueAsString(valuecell).trim();

						if(key!=null && value!=null) {

							map.put(key, value);

						}else {
							System.out.println("Warning: Found null value in Excel at row" + i);
						}

					}



				}



			}




		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return map;


	}








}

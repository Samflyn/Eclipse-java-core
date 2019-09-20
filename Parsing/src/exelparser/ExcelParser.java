package exelparser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParser {

	public String parse(String src) throws IOException {
		File file = new File(src);
		FileInputStream fis = null;
		StringBuffer sb = null;
		try {
			sb=new StringBuffer();
			fis=new FileInputStream(file);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workBook.getSheetAt(0);
			Iterator<Row> row = sheet.rowIterator();
			while(row.hasNext()) {
				Row nextRow = row.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				while(cellIterator.hasNext()) {
					Cell nextCell = cellIterator.next();
					
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

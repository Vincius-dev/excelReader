package uteis;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeitorExcel {
	

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public LeitorExcel(String excelPath, String sheetName) {
		try {
			
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
			
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
		 
	}
	
	public static String getCellData(int rowNum, int colNum) throws IOException {
		
		DataFormatter formatter = new DataFormatter();
		Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
		return (String) value;
	}
	
	public static int getRowCount() {
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	

}

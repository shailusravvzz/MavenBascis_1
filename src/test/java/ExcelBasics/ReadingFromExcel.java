package ExcelBasics;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;


public class ReadingFromExcel {

	public static void main(String[] args)throws Exception {

		File file = new File("D:\\Automation Testing\\LoginData.xlsx"); // Creating File Instance

		FileInputStream fis= new FileInputStream(file);  // reading Raw Data-bytes
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis); // converting into workbook format
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//sheet.getRow(0).getCell(0).getStringCellValue();
		
		String cellvalue= sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(cellvalue);
		
		workbook.close();
		fis.close();
	}

}

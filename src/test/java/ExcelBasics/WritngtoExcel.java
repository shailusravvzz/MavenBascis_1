 package ExcelBasics;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.*;

public class WritngtoExcel {

	public static void main(String[] args) throws Exception {

//Step-1:
		XSSFWorkbook workbook=new XSSFWorkbook(); //workbook instance
		XSSFSheet sheet = workbook.createSheet("Sheet_1");

		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Hello");
		sheet.getRow(0).createCell(1).setCellValue("World");


		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Welcome to");
		sheet.getRow(1).createCell(1).setCellValue("Java");

//Step-2:
		File file=new File("D:\\Eclipse_Workspace\\MavenBasics\\Excel\\Test.1.xlsx");  // Creating File Instance

		FileOutputStream fis=new FileOutputStream(file);  //Java FileOutputStream is an output stream used for writing data to a file

		workbook.write(fis);
		
		workbook.close();
		
		fis.close();



	}

}

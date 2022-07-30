package ExcelBasics;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ReadingDynamicExcel {

	public static void main(String[] args) throws Exception {

//Step-1:

		File file=new File("D:\\Eclipse_Workspace\\MavenBasics\\Excel\\ReadingTest_1.xlsx");

		FileInputStream fis=new FileInputStream(file);

//Step-2:

		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		XSSFSheet sheet=workbook.getSheetAt(0);

//Step-3:

		int rowcount=sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rowcount; i++) {

			XSSFRow row=sheet.getRow(i);

			int cellcount=row.getPhysicalNumberOfCells();	

			for (int j = 0; j < cellcount; j++) {

				XSSFCell cell=row.getCell(j); //Step -4

				
				String cellvalue=getcellvalue(cell); //using fuction to identify the type of values

				System.out.print("||"+ cellvalue );

			}

			System.out.println();
		}

		workbook.close();
		fis.close();

	}

//Step-4:

	public static String getcellvalue(XSSFCell cell) {

		switch (cell.getCellType()) {

		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());

		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());

		case STRING:
			return cell.getStringCellValue();

		default:
			return cell.getStringCellValue();

		}


	}

}

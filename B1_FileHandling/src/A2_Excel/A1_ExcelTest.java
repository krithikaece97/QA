package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelTest {

	public static void main(String[] args) throws IOException  {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);// workbook is a excel
		XSSFSheet sheet = workbook.getSheet("home"); //inside excel we have sheet... sheet name is home.....already we have enter 
		//some values in excel
		int row = sheet.getLastRowNum()+1; //we r capturing the row values
		
		//int row = sheet.getLastRowNum()+1; if we add +1 we have the o/p 0,1,2...
		int column = sheet.getRow(0).getLastCellNum(); // column value...a(0).column to get exact column value
		System.out.println("total row="+row);// row ill start counting like0,1,2....
		System.out.println("total column=" +column); //column will start counting like 1,2,3...
		
			}

}

package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_CreateSheet {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi1.xlsx");//location of the excel sheet
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);		
		XSSFSheet sheet = workbook.createSheet("create"); //create is a sheet name of the excel.instead of rename manually,we r rename in here itself
		XSSFRow row=	sheet.createRow(1);
		XSSFCell cell=	row.createCell(1);
		cell.setCellValue("vcentry");// we r adding vcentry data in row 1 and column 1 cell.
		FileOutputStream fos= new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		
	}

}

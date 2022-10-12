package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A7_UpdateCell {

	public static void main(String[] args) throws IOException  {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi.xlsx");
		FileInputStream fis = new FileInputStream(f);// in real tym we r using this..fis.close();
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("update");
		fis.close();
		
		
		FileOutputStream fos = new FileOutputStream(f);//outstream function is used to update in excel
		sheet.getRow(1).getCell(1).setCellValue("adyar");
		workbook.write(fos); // write is used to write the update value in excel
		fos.close();// save and close the excel
		
	}

}

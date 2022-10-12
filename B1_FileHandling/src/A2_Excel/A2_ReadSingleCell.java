package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2_ReadSingleCell {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("home");
		String data = sheet.getRow(0).getCell(0).getStringCellValue(); // getcell(0) mns it will accept from 0,1,2... getLastCellNum
		// it will accept from 1,2,3......
		System.out.println(data);
	}

}

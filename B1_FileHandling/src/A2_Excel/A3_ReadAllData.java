package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A3_ReadAllData {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);// workbook is a excel
		XSSFSheet sheet = workbook.getSheet("home"); //inside excel we have sheet... sheet name is home.....already we have enter 
		//some values in excel
		int row = sheet.getLastRowNum(); //we r capturing the row values
		
		//int row = sheet.getLastRowNum()+1; if we add +1 we have the o/p 0,1,2...
		int column = sheet.getRow(0).getLastCellNum(); // column value...a(0).column to get exact column value
		
		for(int i=0;i<row;i++)
		{ 
			for(int j=0;j<column;j++)
			{
				String data = sheet.getRow(i).getCell(j).getStringCellValue(); // getcell(0) mns it will accept from 0,1,2... getLastCellNum
				// it will accept from 1,2,3......
				System.out.println(data+" ");
			}
			System.out.println();
		}
	}

}

package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5_NumberCellSolution {

	
		public static void main(String[] args) throws IOException {
			File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\krithi.xlsx");
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);// workbook is a excel
			XSSFSheet sheet = workbook.getSheet("home1");
			int row = sheet.getLastRowNum()+1; //if we add +1 we have the o/p 0,1,2...
			int column = sheet.getRow(0).getLastCellNum(); // column value...a(0).column to get exact column value
			for(int i=0;i<row;i++)
			{ 
				for(int j=0;j<column;j++)
				{
					if(sheet.getRow(i).getCell(j)!=null)
					{
					if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING) //giving cell is string mns it ill execute this part
					{
						String data = sheet.getRow(i).getCell(j).getStringCellValue(); 
						System.out.println(data+" ");
					}
					else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)//numeric mns this part ill execute
					{
						int data= (int) sheet.getRow(i).getCell(j).getNumericCellValue();
						System.out.println(data+" ");
					}
					
					}
					else {
						System.out.print("empty");//ntng in that cell mns empty ill print
					}
						
					}
					
					System.out.println();
				}
			}
		}
				

	



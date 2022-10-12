package A1_TextFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3_FileWriter {

	public static void main(String[] args) throws IOException {
     File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\text2.txt"); 
		
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); //to identify the text file
		fw.write("Keerthi"); // mostly we prefer write in string option. This content ill write in text file
		fw.write("Krithika");// this normal write function, ill print a o/p in same line like keerthikrithika. so for this
		                     //purpose we r going to bufferedwriter to print in a line by line
		
		fw.close(); // used for save and close in textfile
		

	}

}

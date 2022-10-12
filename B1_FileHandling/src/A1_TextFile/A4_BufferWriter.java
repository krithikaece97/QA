package A1_TextFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A4_BufferWriter {

	public static void main(String[] args) throws IOException {
File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\test3.txt"); 
		
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); // to identify the text file
		BufferedWriter bw = new BufferedWriter(fw); // in java we don't have direct newline method. so we r using bufferedwriter.
		bw.write("keerthi1");
		bw.newLine();
		bw.write("keerthi2");
		bw.newLine();
		bw.write("keerthi3");
		bw.newLine();
		bw.close();

	}

}

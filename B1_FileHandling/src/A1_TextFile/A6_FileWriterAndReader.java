package A1_TextFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A6_FileWriterAndReader {

	public static void main(String[] args) throws IOException {
File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\text3.txt"); 
		
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f); // to identify the text file
		BufferedWriter bw = new BufferedWriter(fw); // in java we don't have direct newline method. so we r using bufferedwriter.
		//bw.write("keerthi1");
		//bw.newLine();  we want to type in so many lines. in real tym we can use while loop(if we dont know the target) and 
		//bw.write("keerthi2"); // for loop(we know that ending value)
		//bw.newLine();
		//bw.write("keerthi3");
		//bw.newLine();
		//bw.close();
		for(int i=0; i<100; i++)
		{
			bw.write("keerthi" +i);
			bw.newLine();
		}
		bw.close();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String x="";
		while((x=br.readLine()) !=null) // it ill print up to no value line like null
		{
			System.out.println(x);
		}
		br.close();
	}

}

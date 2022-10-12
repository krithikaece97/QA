package A1_TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A5_FileReader {

	public static void main(String[] args) throws IOException {
    File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\text3.txt"); 
		
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		//br.readLine();
		//System.out.println(br.readLine()); we want to type in so many lines. in real tym we can use while loop
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		
		String x="";
		while((x=br.readLine()) !=null) // it ill print up to no value line like null
		{
			System.out.println(x);
		}
		br.close();
				
		
	}

}

package A1_TextFile;

import java.io.File;
import java.io.IOException;

public class A2_FileExist {

	public static void main(String[] args) throws IOException {
		//File f = new File("C:\\Vcentry\\B1_FileHandling\\File\\Test1.txt"); 
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\text1.txt"); 
		
		System.out.println(f.exists()); //This ill give o/p in console either true r false
		if(!f.exists()) // it check whether the file is exists r not. If not means it ill create a new file 
		{
			f.createNewFile();
		}
	}

}

package A1_TextFile;
// To choose the folder path right click folder -->properties--> leftside resource then copy that path.. 
// end of the path we have to add the file name with .txt
// every time we have refresh either folder or project to get a created text file

import java.io.File;
import java.io.IOException;

public class A1_CreateFile {

	public static void main(String[] args) throws IOException  {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\File\\Test.txt"); //here file is folder.. Right click the project name and 
		// select folder and name the folder. If we create a folder in package mns it will create as package only.
		
		
		f.createNewFile(); //this method is used to create a file in folder
	}

}

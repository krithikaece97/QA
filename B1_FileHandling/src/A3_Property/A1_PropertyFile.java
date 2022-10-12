package A3_Property;
// to create a data properties file... right click property folder--> choose file--> type data.properties

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class A1_PropertyFile {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Vcentry\\B1_FileHandling\\src\\A3_Property\\data.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();// in properties concept, we have 2 use properties keyword
		prop.load(fis);
		System.out.println(prop.get("domain"));// to fetch a domain value in data properties file
		Enumeration e= prop.keys(); //hashtable concept is used here to fetch all data in data properties file
		
		while(e.hasMoreElements())   
		{
			
		String key= (String) e.nextElement();   
			System.out.println(key+":"+prop.get(key));
			
		}

	}

}

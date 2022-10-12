package A4_HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class A1_HashTable { // random result

	public static void main(String[] args) {
        Hashtable table= new Hashtable();
		
		table.put("username", "abcd"); // here we r using put instead of add
		table.put("password", "1234");
		table.put("domain", "testing");
		table.put("company", "vcentry");
		//table.put("mobile", null); // it ill show nullpointer exception
		//table.put(null, "guindy");
	//	System.out.println(table.get("domain"));
		
	Enumeration e=	table.keys(); //instead of iteration we ill use enumeration here

	//System.out.println(e.hasMoreElements()); // it ill give only key o/p
	//System.out.println(e.nextElement());
	
	while(e.hasMoreElements())   //hasNext
	{
		//System.out.println(e.nextElement());
		
	String key= (String) e.nextElement();   //Next(), here we have give a string it accept all data type. add to cast
		System.out.println(key+":"+table.get(key));
		
	}

	}

}

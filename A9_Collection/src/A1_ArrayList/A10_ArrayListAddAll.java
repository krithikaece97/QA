package A1_ArrayList;

import java.util.ArrayList;

public class A10_ArrayListAddAll {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add("vcentry1");  //0
		a.add("vcentry2");  //1
		a.add("vcentry3");  //2
		a.add("vcentry4");  //3
		
		ArrayList b= new ArrayList();
		b.add("vcentry5"); 
		b.add("vcentry6");  
		b.add("vcentry7");  
		b.add("vcentry8");  
		
		a.addAll(b); //This function ill add both array
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}

	}

}

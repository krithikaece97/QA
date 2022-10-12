package A1_ArrayList;

import java.util.ArrayList;

public class A6_ArrayListpartialIndex {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(0,"vcentry1");  //0
		a.add("vcentry2");  //1
		a.add(2,"vcentry3");  //2
		a.add("vcentry4");  //3

		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
	}

}

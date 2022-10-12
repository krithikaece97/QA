package A1_ArrayList;

import java.util.ArrayList;

public class A4_ArrayListAllDataRetrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("vcentry1");  //0
		a.add("vcentry2");  //1
		a.add("vcentry3");  //2
		a.add("vcentry4");  //3
		
		for(int i=0;i<a.size();i++) //0,1,2,3
		{                                           
			System.out.println(a.get(i));
		}

	}

}

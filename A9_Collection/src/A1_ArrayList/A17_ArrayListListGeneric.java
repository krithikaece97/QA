package A1_ArrayList;

import java.util.ArrayList;

public class A17_ArrayListListGeneric {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList(); // non generic - obejct
		a.add("vcentry");
		a.add(1);
		a.add('c');
		ArrayList<String> s = new ArrayList<String>(); // generic -object
		s.add("vcentry1");
		//s.add('c');
		
		ArrayList<Integer> i = new ArrayList<Integer>();
		
		i.add(1);
	//	i.add("vcentry1");
	
	}

}

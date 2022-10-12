package A3_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A2_TreeSet {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("g"); // it is  ascending oder and remove duplicates
		t.add("b");
		t.add("d");
		t.add("a");
		
		
		t.add("c");
		//h.add(1);
		//h.add(1.5);
		t.add("a");
		
		Iterator it = t.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}

	}



	}



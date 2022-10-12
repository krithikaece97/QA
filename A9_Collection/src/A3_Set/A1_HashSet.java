 package A3_Set;

import java.util.HashSet;
import java.util.Iterator;

public class A1_HashSet {

	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add("g"); // it is heterogeneus, ascending oder and remove duplicates
		h.add("b");
		h.add("d");
		h.add("a");
		
		
		h.add("c");
		//h.add(1);
		//h.add(1.5);
		h.add("a");
		
		Iterator it = h.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}

	}

}

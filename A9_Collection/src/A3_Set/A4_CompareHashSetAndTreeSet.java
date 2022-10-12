package A3_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class A4_CompareHashSetAndTreeSet {

	public static void main(String[] args) {
		

				
			    //HashSet h= new HashSet();
				TreeSet h= new TreeSet();
				h.add("d");
				h.add("b");
				h.add("c");
				h.add("a");
				
				h.add("b");
				h.add("c");
				h.add("a");
				h.add("d");
				
				Iterator it=	h.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next()); 
				}
				
				
				
				

			

		


	}

}

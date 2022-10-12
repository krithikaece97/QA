package A3_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class A3_LinkedHashSet {

	public static void main(String[] args) {
LinkedHashSet l= new LinkedHashSet(); //remove duplicates and maintain insertion order
		
		l.add("d");
		l.add("b");
		l.add("c");
		l.add("a");
		
		l.add("b");
		l.add("c");
		l.add("a");
		l.add("d");
	
		Iterator it=	l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
		}
		

		
	}

}

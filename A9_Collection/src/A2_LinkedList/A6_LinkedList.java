package A2_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A6_LinkedList { //maintain the same insertion order

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("a");
		l.add("b");
		l.add("e");
		l.add("c");
		
		
		
		l.add("b");
		l.add("d");
		l.add("g");
		
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				

	}

}
